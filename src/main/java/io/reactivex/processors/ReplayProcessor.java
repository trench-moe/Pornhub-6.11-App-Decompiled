package io.reactivex.processors;

import df.c;
import df.d;
import io.reactivex.Scheduler;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public final class ReplayProcessor<T> extends FlowableProcessor<T> {
    public final ReplayBuffer<T> buffer;
    public boolean done;
    public final AtomicReference<ReplaySubscription<T>[]> subscribers = new AtomicReference<>(EMPTY);
    private static final Object[] EMPTY_ARRAY = new Object[0];
    public static final ReplaySubscription[] EMPTY = new ReplaySubscription[0];
    public static final ReplaySubscription[] TERMINATED = new ReplaySubscription[0];

    /* loaded from: classes2.dex */
    public static final class Node<T> extends AtomicReference<Node<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final T value;

        public Node(T t2) {
            this.value = t2;
        }
    }

    /* loaded from: classes2.dex */
    public interface ReplayBuffer<T> {
        void complete();

        void error(Throwable th);

        Throwable getError();

        @Nullable
        T getValue();

        T[] getValues(T[] tArr);

        boolean isDone();

        void next(T t2);

        void replay(ReplaySubscription<T> replaySubscription);

        int size();

        void trimHead();
    }

    /* loaded from: classes2.dex */
    public static final class ReplaySubscription<T> extends AtomicInteger implements d {
        private static final long serialVersionUID = 466549804534799122L;
        public volatile boolean cancelled;
        public final c<? super T> downstream;
        public long emitted;
        public Object index;
        public final AtomicLong requested = new AtomicLong();
        public final ReplayProcessor<T> state;

        public ReplaySubscription(c<? super T> cVar, ReplayProcessor<T> replayProcessor) {
            this.downstream = cVar;
            this.state = replayProcessor;
        }

        @Override // df.d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.state.remove(this);
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                this.state.buffer.replay(this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class SizeAndTimeBoundReplayBuffer<T> implements ReplayBuffer<T> {
        public volatile boolean done;
        public Throwable error;
        public volatile TimedNode<T> head;
        public final long maxAge;
        public final int maxSize;
        public final Scheduler scheduler;
        public int size;
        public TimedNode<T> tail;
        public final TimeUnit unit;

        public SizeAndTimeBoundReplayBuffer(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.maxSize = ObjectHelper.verifyPositive(i10, "maxSize");
            this.maxAge = ObjectHelper.verifyPositive(j10, "maxAge");
            this.unit = (TimeUnit) ObjectHelper.requireNonNull(timeUnit, "unit is null");
            this.scheduler = (Scheduler) ObjectHelper.requireNonNull(scheduler, "scheduler is null");
            TimedNode<T> timedNode = new TimedNode<>(null, 0L);
            this.tail = timedNode;
            this.head = timedNode;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void complete() {
            trimFinal();
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void error(Throwable th) {
            trimFinal();
            this.error = th;
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public Throwable getError() {
            return this.error;
        }

        public TimedNode<T> getHead() {
            TimedNode<T> timedNode;
            TimedNode<T> timedNode2 = this.head;
            long now = this.scheduler.now(this.unit) - this.maxAge;
            TimedNode<T> timedNode3 = timedNode2.get();
            while (true) {
                TimedNode<T> timedNode4 = timedNode3;
                timedNode = timedNode2;
                timedNode2 = timedNode4;
                if (timedNode2 == null || timedNode2.time > now) {
                    break;
                }
                timedNode3 = timedNode2.get();
            }
            return timedNode;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        @Nullable
        public T getValue() {
            TimedNode<T> timedNode = this.head;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    break;
                }
                timedNode = timedNode2;
            }
            if (timedNode.time < this.scheduler.now(this.unit) - this.maxAge) {
                return null;
            }
            return timedNode.value;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] tArr) {
            TimedNode<T> head = getHead();
            int size = size(head);
            if (size != 0) {
                if (tArr.length < size) {
                    tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
                }
                for (int i10 = 0; i10 != size; i10++) {
                    head = head.get();
                    tArr[i10] = head.value;
                }
                if (tArr.length > size) {
                    tArr[size] = null;
                }
            } else if (tArr.length != 0) {
                tArr[0] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public boolean isDone() {
            return this.done;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void next(T t2) {
            TimedNode<T> timedNode = new TimedNode<>(t2, this.scheduler.now(this.unit));
            TimedNode<T> timedNode2 = this.tail;
            this.tail = timedNode;
            this.size++;
            timedNode2.set(timedNode);
            trim();
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void replay(ReplaySubscription<T> replaySubscription) {
            int i10;
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            c<? super T> cVar = replaySubscription.downstream;
            TimedNode<T> timedNode = (TimedNode) replaySubscription.index;
            if (timedNode == null) {
                timedNode = getHead();
            }
            long j10 = replaySubscription.emitted;
            int i11 = 1;
            do {
                long j11 = replaySubscription.requested.get();
                while (true) {
                    i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                    if (i10 == 0) {
                        break;
                    } else if (replaySubscription.cancelled) {
                        replaySubscription.index = null;
                        return;
                    } else {
                        boolean z10 = this.done;
                        TimedNode<T> timedNode2 = timedNode.get();
                        boolean z11 = timedNode2 == null;
                        if (z10 && z11) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th = this.error;
                            if (th == null) {
                                cVar.onComplete();
                                return;
                            } else {
                                cVar.onError(th);
                                return;
                            }
                        } else if (z11) {
                            break;
                        } else {
                            cVar.onNext((T) timedNode2.value);
                            j10++;
                            timedNode = timedNode2;
                        }
                    }
                }
                if (i10 == 0) {
                    if (replaySubscription.cancelled) {
                        replaySubscription.index = null;
                        return;
                    } else if (this.done && timedNode.get() == null) {
                        replaySubscription.index = null;
                        replaySubscription.cancelled = true;
                        Throwable th2 = this.error;
                        if (th2 == null) {
                            cVar.onComplete();
                            return;
                        } else {
                            cVar.onError(th2);
                            return;
                        }
                    }
                }
                replaySubscription.index = timedNode;
                replaySubscription.emitted = j10;
                i11 = replaySubscription.addAndGet(-i11);
            } while (i11 != 0);
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
            return size(getHead());
        }

        public int size(TimedNode<T> timedNode) {
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE && (timedNode = timedNode.get()) != null) {
                i10++;
            }
            return i10;
        }

        public void trim() {
            int i10 = this.size;
            if (i10 > this.maxSize) {
                this.size = i10 - 1;
                this.head = this.head.get();
            }
            long now = this.scheduler.now(this.unit) - this.maxAge;
            TimedNode<T> timedNode = this.head;
            while (this.size > 1) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    this.head = timedNode;
                    return;
                } else if (timedNode2.time > now) {
                    this.head = timedNode;
                    return;
                } else {
                    this.size--;
                    timedNode = timedNode2;
                }
            }
            this.head = timedNode;
        }

        public void trimFinal() {
            long now = this.scheduler.now(this.unit) - this.maxAge;
            TimedNode<T> timedNode = this.head;
            while (true) {
                TimedNode<T> timedNode2 = timedNode.get();
                if (timedNode2 == null) {
                    if (timedNode.value != null) {
                        this.head = new TimedNode<>(null, 0L);
                        return;
                    } else {
                        this.head = timedNode;
                        return;
                    }
                } else if (timedNode2.time > now) {
                    if (timedNode.value == null) {
                        this.head = timedNode;
                        return;
                    }
                    TimedNode<T> timedNode3 = new TimedNode<>(null, 0L);
                    timedNode3.lazySet(timedNode.get());
                    this.head = timedNode3;
                    return;
                } else {
                    timedNode = timedNode2;
                }
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void trimHead() {
            if (this.head.value != null) {
                TimedNode<T> timedNode = new TimedNode<>(null, 0L);
                timedNode.lazySet(this.head.get());
                this.head = timedNode;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class SizeBoundReplayBuffer<T> implements ReplayBuffer<T> {
        public volatile boolean done;
        public Throwable error;
        public volatile Node<T> head;
        public final int maxSize;
        public int size;
        public Node<T> tail;

        public SizeBoundReplayBuffer(int i10) {
            this.maxSize = ObjectHelper.verifyPositive(i10, "maxSize");
            Node<T> node = new Node<>(null);
            this.tail = node;
            this.head = node;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void complete() {
            trimHead();
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void error(Throwable th) {
            this.error = th;
            trimHead();
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public Throwable getError() {
            return this.error;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T getValue() {
            Node<T> node = this.head;
            while (true) {
                Node<T> node2 = node.get();
                if (node2 == null) {
                    return node.value;
                }
                node = node2;
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] tArr) {
            Node<T> node = this.head;
            Node<T> node2 = node;
            int i10 = 0;
            while (true) {
                node2 = node2.get();
                if (node2 == null) {
                    break;
                }
                i10++;
            }
            if (tArr.length < i10) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
            }
            for (int i11 = 0; i11 < i10; i11++) {
                node = node.get();
                tArr[i11] = node.value;
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public boolean isDone() {
            return this.done;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void next(T t2) {
            Node<T> node = new Node<>(t2);
            Node<T> node2 = this.tail;
            this.tail = node;
            this.size++;
            node2.set(node);
            trim();
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void replay(ReplaySubscription<T> replaySubscription) {
            int i10;
            if (replaySubscription.getAndIncrement() != 0) {
                return;
            }
            c<? super T> cVar = replaySubscription.downstream;
            Node<T> node = (Node) replaySubscription.index;
            if (node == null) {
                node = this.head;
            }
            long j10 = replaySubscription.emitted;
            int i11 = 1;
            do {
                long j11 = replaySubscription.requested.get();
                while (true) {
                    i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                    if (i10 == 0) {
                        break;
                    } else if (replaySubscription.cancelled) {
                        replaySubscription.index = null;
                        return;
                    } else {
                        boolean z10 = this.done;
                        Node<T> node2 = node.get();
                        boolean z11 = node2 == null;
                        if (z10 && z11) {
                            replaySubscription.index = null;
                            replaySubscription.cancelled = true;
                            Throwable th = this.error;
                            if (th == null) {
                                cVar.onComplete();
                                return;
                            } else {
                                cVar.onError(th);
                                return;
                            }
                        } else if (z11) {
                            break;
                        } else {
                            cVar.onNext((T) node2.value);
                            j10++;
                            node = node2;
                        }
                    }
                }
                if (i10 == 0) {
                    if (replaySubscription.cancelled) {
                        replaySubscription.index = null;
                        return;
                    } else if (this.done && node.get() == null) {
                        replaySubscription.index = null;
                        replaySubscription.cancelled = true;
                        Throwable th2 = this.error;
                        if (th2 == null) {
                            cVar.onComplete();
                            return;
                        } else {
                            cVar.onError(th2);
                            return;
                        }
                    }
                }
                replaySubscription.index = node;
                replaySubscription.emitted = j10;
                i11 = replaySubscription.addAndGet(-i11);
            } while (i11 != 0);
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
            Node<T> node = this.head;
            int i10 = 0;
            while (i10 != Integer.MAX_VALUE && (node = node.get()) != null) {
                i10++;
            }
            return i10;
        }

        public void trim() {
            int i10 = this.size;
            if (i10 > this.maxSize) {
                this.size = i10 - 1;
                this.head = this.head.get();
            }
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void trimHead() {
            if (this.head.value != null) {
                Node<T> node = new Node<>(null);
                node.lazySet(this.head.get());
                this.head = node;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class TimedNode<T> extends AtomicReference<TimedNode<T>> {
        private static final long serialVersionUID = 6404226426336033100L;
        public final long time;
        public final T value;

        public TimedNode(T t2, long j10) {
            this.value = t2;
            this.time = j10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class UnboundedReplayBuffer<T> implements ReplayBuffer<T> {
        public final List<T> buffer;
        public volatile boolean done;
        public Throwable error;
        public volatile int size;

        public UnboundedReplayBuffer(int i10) {
            this.buffer = new ArrayList(ObjectHelper.verifyPositive(i10, "capacityHint"));
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void complete() {
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void error(Throwable th) {
            this.error = th;
            this.done = true;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public Throwable getError() {
            return this.error;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        @Nullable
        public T getValue() {
            int i10 = this.size;
            if (i10 == 0) {
                return null;
            }
            return this.buffer.get(i10 - 1);
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public T[] getValues(T[] tArr) {
            int i10 = this.size;
            if (i10 == 0) {
                if (tArr.length != 0) {
                    tArr[0] = null;
                }
                return tArr;
            }
            List<T> list = this.buffer;
            if (tArr.length < i10) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
            }
            for (int i11 = 0; i11 < i10; i11++) {
                tArr[i11] = list.get(i11);
            }
            if (tArr.length > i10) {
                tArr[i10] = null;
            }
            return tArr;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public boolean isDone() {
            return this.done;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void next(T t2) {
            this.buffer.add(t2);
            this.size++;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
            if (r10 != 0) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
            if (r14.cancelled == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
            r14.index = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0063, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
            r7 = r13.done;
            r8 = r13.size;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
            if (r7 == false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
            if (r3 != r8) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x006c, code lost:
            r14.index = null;
            r14.cancelled = true;
            r14 = r13.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
            if (r14 != null) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
            r1.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0078, code lost:
            r1.onError(r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x007c, code lost:
            r14.index = java.lang.Integer.valueOf(r3);
            r14.emitted = r4;
            r6 = r14.addAndGet(-r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
            return;
         */
        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void replay(io.reactivex.processors.ReplayProcessor.ReplaySubscription<T> r14) {
            /*
                r13 = this;
                int r0 = r14.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                java.util.List<T> r0 = r13.buffer
                df.c<? super T> r1 = r14.downstream
                java.lang.Object r2 = r14.index
                java.lang.Integer r2 = (java.lang.Integer) r2
                r3 = 0
                if (r2 == 0) goto L17
                int r3 = r2.intValue()
                goto L1d
            L17:
                java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
                r14.index = r2
            L1d:
                long r4 = r14.emitted
                r2 = 1
                r6 = 1
            L21:
                java.util.concurrent.atomic.AtomicLong r7 = r14.requested
                long r7 = r7.get()
            L27:
                r9 = 0
                int r10 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r10 == 0) goto L5b
                boolean r11 = r14.cancelled
                if (r11 == 0) goto L33
                r14.index = r9
                return
            L33:
                boolean r11 = r13.done
                int r12 = r13.size
                if (r11 == 0) goto L4b
                if (r3 != r12) goto L4b
                r14.index = r9
                r14.cancelled = r2
                java.lang.Throwable r14 = r13.error
                if (r14 != 0) goto L47
                r1.onComplete()
                goto L4a
            L47:
                r1.onError(r14)
            L4a:
                return
            L4b:
                if (r3 != r12) goto L4e
                goto L5b
            L4e:
                java.lang.Object r9 = r0.get(r3)
                r1.onNext(r9)
                int r3 = r3 + 1
                r9 = 1
                long r4 = r4 + r9
                goto L27
            L5b:
                if (r10 != 0) goto L7c
                boolean r7 = r14.cancelled
                if (r7 == 0) goto L64
                r14.index = r9
                return
            L64:
                boolean r7 = r13.done
                int r8 = r13.size
                if (r7 == 0) goto L7c
                if (r3 != r8) goto L7c
                r14.index = r9
                r14.cancelled = r2
                java.lang.Throwable r14 = r13.error
                if (r14 != 0) goto L78
                r1.onComplete()
                goto L7b
            L78:
                r1.onError(r14)
            L7b:
                return
            L7c:
                java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
                r14.index = r7
                r14.emitted = r4
                int r6 = -r6
                int r6 = r14.addAndGet(r6)
                if (r6 != 0) goto L21
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.processors.ReplayProcessor.UnboundedReplayBuffer.replay(io.reactivex.processors.ReplayProcessor$ReplaySubscription):void");
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public int size() {
            return this.size;
        }

        @Override // io.reactivex.processors.ReplayProcessor.ReplayBuffer
        public void trimHead() {
        }
    }

    public ReplayProcessor(ReplayBuffer<T> replayBuffer) {
        this.buffer = replayBuffer;
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> create() {
        return new ReplayProcessor<>(new UnboundedReplayBuffer(16));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> create(int i10) {
        return new ReplayProcessor<>(new UnboundedReplayBuffer(i10));
    }

    public static <T> ReplayProcessor<T> createUnbounded() {
        return new ReplayProcessor<>(new SizeBoundReplayBuffer(IntCompanionObject.MAX_VALUE));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithSize(int i10) {
        return new ReplayProcessor<>(new SizeBoundReplayBuffer(i10));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithTime(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return new ReplayProcessor<>(new SizeAndTimeBoundReplayBuffer(IntCompanionObject.MAX_VALUE, j10, timeUnit, scheduler));
    }

    @CheckReturnValue
    @NonNull
    public static <T> ReplayProcessor<T> createWithTimeAndSize(long j10, TimeUnit timeUnit, Scheduler scheduler, int i10) {
        return new ReplayProcessor<>(new SizeAndTimeBoundReplayBuffer(i10, j10, timeUnit, scheduler));
    }

    public boolean add(ReplaySubscription<T> replaySubscription) {
        ReplaySubscription<T>[] replaySubscriptionArr;
        ReplaySubscription<T>[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = this.subscribers.get();
            if (replaySubscriptionArr == TERMINATED) {
                return false;
            }
            int length = replaySubscriptionArr.length;
            replaySubscriptionArr2 = new ReplaySubscription[length + 1];
            System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr2, 0, length);
            replaySubscriptionArr2[length] = replaySubscription;
        } while (!this.subscribers.compareAndSet(replaySubscriptionArr, replaySubscriptionArr2));
        return true;
    }

    public void cleanupBuffer() {
        this.buffer.trimHead();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        ReplayBuffer<T> replayBuffer = this.buffer;
        if (replayBuffer.isDone()) {
            return replayBuffer.getError();
        }
        return null;
    }

    public T getValue() {
        return this.buffer.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object[] getValues() {
        Object[] objArr = EMPTY_ARRAY;
        Object[] values = getValues(objArr);
        return values == objArr ? new Object[0] : values;
    }

    public T[] getValues(T[] tArr) {
        return this.buffer.getValues(tArr);
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        ReplayBuffer<T> replayBuffer = this.buffer;
        return replayBuffer.isDone() && replayBuffer.getError() == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.subscribers.get().length != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        ReplayBuffer<T> replayBuffer = this.buffer;
        return replayBuffer.isDone() && replayBuffer.getError() != null;
    }

    public boolean hasValue() {
        return this.buffer.size() != 0;
    }

    @Override // io.reactivex.processors.FlowableProcessor, df.c
    public void onComplete() {
        if (this.done) {
            return;
        }
        this.done = true;
        ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.complete();
        for (ReplaySubscription<T> replaySubscription : this.subscribers.getAndSet(TERMINATED)) {
            replayBuffer.replay(replaySubscription);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, df.c
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.done = true;
        ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.error(th);
        for (ReplaySubscription<T> replaySubscription : this.subscribers.getAndSet(TERMINATED)) {
            replayBuffer.replay(replaySubscription);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, df.c
    public void onNext(T t2) {
        ObjectHelper.requireNonNull(t2, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done) {
            return;
        }
        ReplayBuffer<T> replayBuffer = this.buffer;
        replayBuffer.next(t2);
        for (ReplaySubscription<T> replaySubscription : this.subscribers.get()) {
            replayBuffer.replay(replaySubscription);
        }
    }

    @Override // df.c
    public void onSubscribe(d dVar) {
        if (this.done) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void remove(ReplaySubscription<T> replaySubscription) {
        ReplaySubscription<T>[] replaySubscriptionArr;
        ReplaySubscription[] replaySubscriptionArr2;
        do {
            replaySubscriptionArr = this.subscribers.get();
            if (replaySubscriptionArr == TERMINATED || replaySubscriptionArr == EMPTY) {
                return;
            }
            int length = replaySubscriptionArr.length;
            int i10 = -1;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (replaySubscriptionArr[i11] == replaySubscription) {
                    i10 = i11;
                    break;
                } else {
                    i11++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                replaySubscriptionArr2 = EMPTY;
            } else {
                ReplaySubscription[] replaySubscriptionArr3 = new ReplaySubscription[length - 1];
                System.arraycopy(replaySubscriptionArr, 0, replaySubscriptionArr3, 0, i10);
                System.arraycopy(replaySubscriptionArr, i10 + 1, replaySubscriptionArr3, i10, (length - i10) - 1);
                replaySubscriptionArr2 = replaySubscriptionArr3;
            }
        } while (!this.subscribers.compareAndSet(replaySubscriptionArr, replaySubscriptionArr2));
    }

    public int size() {
        return this.buffer.size();
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        ReplaySubscription<T> replaySubscription = new ReplaySubscription<>(cVar, this);
        cVar.onSubscribe(replaySubscription);
        if (add(replaySubscription) && replaySubscription.cancelled) {
            remove(replaySubscription);
        } else {
            this.buffer.replay(replaySubscription);
        }
    }

    public int subscriberCount() {
        return this.subscribers.get().length;
    }
}
