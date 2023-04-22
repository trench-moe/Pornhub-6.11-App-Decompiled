package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.GroupedFlowable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.EmptyComponent;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableGroupBy<T, K, V> extends AbstractFlowableWithUpstream<T, GroupedFlowable<K, V>> {
    public final int bufferSize;
    public final boolean delayError;
    public final Function<? super T, ? extends K> keySelector;
    public final Function<? super Consumer<Object>, ? extends Map<K, Object>> mapFactory;
    public final Function<? super T, ? extends V> valueSelector;

    /* loaded from: classes2.dex */
    public static final class EvictionAction<K, V> implements Consumer<GroupedUnicast<K, V>> {
        public final Queue<GroupedUnicast<K, V>> evictedGroups;

        public EvictionAction(Queue<GroupedUnicast<K, V>> queue) {
            this.evictedGroups = queue;
        }

        public void accept(GroupedUnicast<K, V> groupedUnicast) {
            this.evictedGroups.offer(groupedUnicast);
        }

        @Override // io.reactivex.functions.Consumer
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            accept((GroupedUnicast) ((GroupedUnicast) obj));
        }
    }

    /* loaded from: classes2.dex */
    public static final class GroupBySubscriber<T, K, V> extends BasicIntQueueSubscription<GroupedFlowable<K, V>> implements FlowableSubscriber<T> {
        public static final Object NULL_KEY = new Object();
        private static final long serialVersionUID = -3688291656102519502L;
        public final int bufferSize;
        public final boolean delayError;
        public boolean done;
        public final c<? super GroupedFlowable<K, V>> downstream;
        public Throwable error;
        public final Queue<GroupedUnicast<K, V>> evictedGroups;
        public volatile boolean finished;
        public final Map<Object, GroupedUnicast<K, V>> groups;
        public final Function<? super T, ? extends K> keySelector;
        public boolean outputFused;
        public final SpscLinkedArrayQueue<GroupedFlowable<K, V>> queue;
        public d upstream;
        public final Function<? super T, ? extends V> valueSelector;
        public final AtomicBoolean cancelled = new AtomicBoolean();
        public final AtomicLong requested = new AtomicLong();
        public final AtomicInteger groupCount = new AtomicInteger(1);

        public GroupBySubscriber(c<? super GroupedFlowable<K, V>> cVar, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i10, boolean z10, Map<Object, GroupedUnicast<K, V>> map, Queue<GroupedUnicast<K, V>> queue) {
            this.downstream = cVar;
            this.keySelector = function;
            this.valueSelector = function2;
            this.bufferSize = i10;
            this.delayError = z10;
            this.groups = map;
            this.evictedGroups = queue;
            this.queue = new SpscLinkedArrayQueue<>(i10);
        }

        private void completeEvictions() {
            if (this.evictedGroups != null) {
                int i10 = 0;
                while (true) {
                    GroupedUnicast<K, V> poll = this.evictedGroups.poll();
                    if (poll == null) {
                        break;
                    }
                    poll.onComplete();
                    i10++;
                }
                if (i10 != 0) {
                    this.groupCount.addAndGet(-i10);
                }
            }
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void cancel() {
            if (this.cancelled.compareAndSet(false, true)) {
                completeEvictions();
                if (this.groupCount.decrementAndGet() == 0) {
                    this.upstream.cancel();
                }
            }
        }

        public void cancel(K k10) {
            if (k10 == null) {
                k10 = (K) NULL_KEY;
            }
            this.groups.remove(k10);
            if (this.groupCount.decrementAndGet() == 0) {
                this.upstream.cancel();
                if (!this.outputFused && getAndIncrement() == 0) {
                    this.queue.clear();
                }
            }
        }

        public boolean checkTerminated(boolean z10, boolean z11, c<?> cVar, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled.get()) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (this.delayError) {
                if (z10 && z11) {
                    Throwable th = this.error;
                    if (th != null) {
                        cVar.onError(th);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            } else if (z10) {
                Throwable th2 = this.error;
                if (th2 != null) {
                    spscLinkedArrayQueue.clear();
                    cVar.onError(th2);
                    return true;
                } else if (z11) {
                    cVar.onComplete();
                    return true;
                }
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.queue.clear();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        public void drainFused() {
            Throwable th;
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.queue;
            c<? super GroupedFlowable<K, V>> cVar = this.downstream;
            int i10 = 1;
            while (!this.cancelled.get()) {
                boolean z10 = this.finished;
                if (z10 && !this.delayError && (th = this.error) != null) {
                    spscLinkedArrayQueue.clear();
                    cVar.onError(th);
                    return;
                }
                cVar.onNext(null);
                if (z10) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cVar.onError(th2);
                        return;
                    } else {
                        cVar.onComplete();
                        return;
                    }
                }
                i10 = addAndGet(-i10);
                if (i10 == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
            if (r10 != 0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
            if (checkTerminated(r15.finished, r0.isEmpty(), r1, r0) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
            if (r8 == 0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
            if (r4 == Long.MAX_VALUE) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
            r15.requested.addAndGet(-r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
            r15.upstream.request(r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
            r3 = addAndGet(-r3);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drainNormal() {
            /*
                r15 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<io.reactivex.flowables.GroupedFlowable<K, V>> r0 = r15.queue
                df.c<? super io.reactivex.flowables.GroupedFlowable<K, V>> r1 = r15.downstream
                r14 = 6
                r14 = 1
                r2 = r14
                r14 = 1
                r3 = r14
            L9:
                r14 = 7
                java.util.concurrent.atomic.AtomicLong r4 = r15.requested
                long r4 = r4.get()
                r6 = 0
                r8 = r6
            L13:
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                r14 = 4
                if (r10 == 0) goto L41
                boolean r11 = r15.finished
                java.lang.Object r12 = r0.poll()
                io.reactivex.flowables.GroupedFlowable r12 = (io.reactivex.flowables.GroupedFlowable) r12
                if (r12 != 0) goto L26
                r14 = 5
                r14 = 1
                r13 = r14
                goto L29
            L26:
                r14 = 5
                r14 = 0
                r13 = r14
            L29:
                boolean r14 = r15.checkTerminated(r11, r13, r1, r0)
                r11 = r14
                if (r11 == 0) goto L32
                r14 = 6
                return
            L32:
                r14 = 5
                if (r13 == 0) goto L37
                r14 = 2
                goto L41
            L37:
                r14 = 7
                r1.onNext(r12)
                r14 = 5
                r10 = 1
                long r8 = r8 + r10
                r14 = 2
                goto L13
            L41:
                if (r10 != 0) goto L54
                r14 = 3
                boolean r10 = r15.finished
                boolean r14 = r0.isEmpty()
                r11 = r14
                boolean r14 = r15.checkTerminated(r10, r11, r1, r0)
                r10 = r14
                if (r10 == 0) goto L54
                r14 = 4
                return
            L54:
                r14 = 7
                int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                r14 = 5
                if (r10 == 0) goto L72
                r14 = 5
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r14 = 5
                int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                r14 = 3
                if (r10 == 0) goto L6c
                java.util.concurrent.atomic.AtomicLong r4 = r15.requested
                long r5 = -r8
                r4.addAndGet(r5)
            L6c:
                df.d r4 = r15.upstream
                r14 = 4
                r4.request(r8)
            L72:
                int r3 = -r3
                r14 = 5
                int r3 = r15.addAndGet(r3)
                if (r3 != 0) goto L9
                r14 = 6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableGroupBy.GroupBySubscriber.drainNormal():void");
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.queue.isEmpty();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            for (GroupedUnicast<K, V> groupedUnicast : this.groups.values()) {
                groupedUnicast.onComplete();
            }
            this.groups.clear();
            Queue<GroupedUnicast<K, V>> queue = this.evictedGroups;
            if (queue != null) {
                queue.clear();
            }
            this.done = true;
            this.finished = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            for (GroupedUnicast<K, V> groupedUnicast : this.groups.values()) {
                groupedUnicast.onError(th);
            }
            this.groups.clear();
            Queue<GroupedUnicast<K, V>> queue = this.evictedGroups;
            if (queue != null) {
                queue.clear();
            }
            this.error = th;
            this.finished = true;
            drain();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.done) {
                return;
            }
            SpscLinkedArrayQueue<GroupedFlowable<K, V>> spscLinkedArrayQueue = this.queue;
            try {
                K apply = this.keySelector.apply(t2);
                boolean z10 = false;
                Object obj = apply != null ? apply : NULL_KEY;
                GroupedUnicast<K, V> groupedUnicast = this.groups.get(obj);
                if (groupedUnicast == null) {
                    if (this.cancelled.get()) {
                        return;
                    }
                    groupedUnicast = GroupedUnicast.createWith(apply, this.bufferSize, this, this.delayError);
                    this.groups.put(obj, groupedUnicast);
                    this.groupCount.getAndIncrement();
                    z10 = true;
                }
                try {
                    groupedUnicast.onNext(ObjectHelper.requireNonNull(this.valueSelector.apply(t2), "The valueSelector returned null"));
                    completeEvictions();
                    if (z10) {
                        spscLinkedArrayQueue.offer(groupedUnicast);
                        drain();
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    this.upstream.cancel();
                    onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.upstream.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(this.bufferSize);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public GroupedFlowable<K, V> poll() {
            return this.queue.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            if ((i10 & 2) != 0) {
                this.outputFused = true;
                return 2;
            }
            return 0;
        }
    }

    /* loaded from: classes2.dex */
    public static final class GroupedUnicast<K, T> extends GroupedFlowable<K, T> {
        public final State<T, K> state;

        public GroupedUnicast(K k10, State<T, K> state) {
            super(k10);
            this.state = state;
        }

        public static <T, K> GroupedUnicast<K, T> createWith(K k10, int i10, GroupBySubscriber<?, K, T> groupBySubscriber, boolean z10) {
            return new GroupedUnicast<>(k10, new State(i10, groupBySubscriber, k10, z10));
        }

        public void onComplete() {
            this.state.onComplete();
        }

        public void onError(Throwable th) {
            this.state.onError(th);
        }

        public void onNext(T t2) {
            this.state.onNext(t2);
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(c<? super T> cVar) {
            this.state.subscribe(cVar);
        }
    }

    /* loaded from: classes2.dex */
    public static final class State<T, K> extends BasicIntQueueSubscription<T> implements b<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        public final boolean delayError;
        public volatile boolean done;
        public Throwable error;
        public final K key;
        public boolean outputFused;
        public final GroupBySubscriber<?, K, T> parent;
        public int produced;
        public final SpscLinkedArrayQueue<T> queue;
        public final AtomicLong requested = new AtomicLong();
        public final AtomicBoolean cancelled = new AtomicBoolean();
        public final AtomicReference<c<? super T>> actual = new AtomicReference<>();
        public final AtomicBoolean once = new AtomicBoolean();

        public State(int i10, GroupBySubscriber<?, K, T> groupBySubscriber, K k10, boolean z10) {
            this.queue = new SpscLinkedArrayQueue<>(i10);
            this.parent = groupBySubscriber;
            this.key = k10;
            this.delayError = z10;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void cancel() {
            if (this.cancelled.compareAndSet(false, true)) {
                this.parent.cancel(this.key);
                drain();
            }
        }

        public boolean checkTerminated(boolean z10, boolean z11, c<? super T> cVar, boolean z12, long j10) {
            if (this.cancelled.get()) {
                while (this.queue.poll() != null) {
                    j10++;
                }
                if (j10 != 0) {
                    this.parent.upstream.request(j10);
                }
                return true;
            }
            if (z10) {
                if (!z12) {
                    Throwable th = this.error;
                    if (th != null) {
                        this.queue.clear();
                        cVar.onError(th);
                        return true;
                    } else if (z11) {
                        cVar.onComplete();
                        return true;
                    }
                } else if (z11) {
                    Throwable th2 = this.error;
                    if (th2 != null) {
                        cVar.onError(th2);
                    } else {
                        cVar.onComplete();
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            while (spscLinkedArrayQueue.poll() != null) {
                this.produced++;
            }
            tryReplenish();
        }

        public void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            if (this.outputFused) {
                drainFused();
            } else {
                drainNormal();
            }
        }

        public void drainFused() {
            Throwable th;
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            c<? super T> cVar = this.actual.get();
            int i10 = 1;
            while (true) {
                while (true) {
                    if (cVar != null) {
                        if (this.cancelled.get()) {
                            return;
                        }
                        boolean z10 = this.done;
                        if (z10 && !this.delayError && (th = this.error) != null) {
                            spscLinkedArrayQueue.clear();
                            cVar.onError(th);
                            return;
                        }
                        cVar.onNext(null);
                        if (z10) {
                            Throwable th2 = this.error;
                            if (th2 != null) {
                                cVar.onError(th2);
                                return;
                            } else {
                                cVar.onComplete();
                                return;
                            }
                        }
                    }
                    i10 = addAndGet(-i10);
                    if (i10 == 0) {
                        return;
                    }
                    if (cVar == null) {
                        cVar = this.actual.get();
                    }
                }
            }
        }

        public void drainNormal() {
            int i10;
            SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
            boolean z10 = this.delayError;
            c<? super T> cVar = this.actual.get();
            int i11 = 1;
            while (true) {
                if (cVar != null) {
                    long j10 = this.requested.get();
                    long j11 = 0;
                    while (true) {
                        i10 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
                        if (i10 == 0) {
                            break;
                        }
                        boolean z11 = this.done;
                        Object obj = (T) spscLinkedArrayQueue.poll();
                        boolean z12 = obj == null;
                        long j12 = j11;
                        if (checkTerminated(z11, z12, cVar, z10, j11)) {
                            return;
                        }
                        if (z12) {
                            j11 = j12;
                            break;
                        } else {
                            cVar.onNext(obj);
                            j11 = j12 + 1;
                        }
                    }
                    if (i10 == 0) {
                        long j13 = j11;
                        if (checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), cVar, z10, j11)) {
                            return;
                        }
                        j11 = j13;
                    }
                    if (j11 != 0) {
                        if (j10 != Long.MAX_VALUE) {
                            this.requested.addAndGet(-j11);
                        }
                        this.parent.upstream.request(j11);
                    }
                }
                i11 = addAndGet(-i11);
                if (i11 == 0) {
                    return;
                }
                if (cVar == null) {
                    cVar = this.actual.get();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            if (this.queue.isEmpty()) {
                tryReplenish();
                return true;
            }
            return false;
        }

        public void onComplete() {
            this.done = true;
            drain();
        }

        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        public void onNext(T t2) {
            this.queue.offer(t2);
            drain();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            T poll = this.queue.poll();
            if (poll != null) {
                this.produced++;
                return poll;
            }
            tryReplenish();
            return null;
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i10) {
            if ((i10 & 2) != 0) {
                this.outputFused = true;
                return 2;
            }
            return 0;
        }

        @Override // df.b
        public void subscribe(c<? super T> cVar) {
            if (!this.once.compareAndSet(false, true)) {
                EmptySubscription.error(new IllegalStateException("Only one Subscriber allowed!"), cVar);
                return;
            }
            cVar.onSubscribe(this);
            this.actual.lazySet(cVar);
            drain();
        }

        public void tryReplenish() {
            int i10 = this.produced;
            if (i10 != 0) {
                this.produced = 0;
                this.parent.upstream.request(i10);
            }
        }
    }

    public FlowableGroupBy(Flowable<T> flowable, Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, int i10, boolean z10, Function<? super Consumer<Object>, ? extends Map<K, Object>> function3) {
        super(flowable);
        this.keySelector = function;
        this.valueSelector = function2;
        this.bufferSize = i10;
        this.delayError = z10;
        this.mapFactory = function3;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super GroupedFlowable<K, V>> cVar) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Map<K, Object> apply;
        try {
            if (this.mapFactory == null) {
                concurrentLinkedQueue = null;
                apply = new ConcurrentHashMap<>();
            } else {
                concurrentLinkedQueue = new ConcurrentLinkedQueue();
                apply = this.mapFactory.apply(new EvictionAction(concurrentLinkedQueue));
            }
            this.source.subscribe((FlowableSubscriber) new GroupBySubscriber(cVar, this.keySelector, this.valueSelector, this.bufferSize, this.delayError, apply, concurrentLinkedQueue));
        } catch (Exception e10) {
            Exceptions.throwIfFatal(e10);
            cVar.onSubscribe(EmptyComponent.INSTANCE);
            cVar.onError(e10);
        }
    }
}
