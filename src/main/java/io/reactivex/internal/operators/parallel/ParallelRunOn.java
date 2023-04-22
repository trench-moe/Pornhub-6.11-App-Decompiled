package io.reactivex.internal.operators.parallel;

import df.c;
import df.d;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class ParallelRunOn<T> extends ParallelFlowable<T> {
    public final int prefetch;
    public final Scheduler scheduler;
    public final ParallelFlowable<? extends T> source;

    /* loaded from: classes2.dex */
    public static abstract class BaseRunOnSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d, Runnable {
        private static final long serialVersionUID = 9222303586456402150L;
        public volatile boolean cancelled;
        public int consumed;
        public volatile boolean done;
        public Throwable error;
        public final int limit;
        public final int prefetch;
        public final SpscArrayQueue<T> queue;
        public final AtomicLong requested = new AtomicLong();
        public d upstream;
        public final Scheduler.Worker worker;

        public BaseRunOnSubscriber(int i10, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            this.prefetch = i10;
            this.queue = spscArrayQueue;
            this.limit = i10 - (i10 >> 2);
            this.worker = worker;
        }

        @Override // df.d
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            this.worker.dispose();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public final void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
            this.done = true;
            schedule();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public final void onNext(T t2) {
            if (this.done) {
                return;
            }
            if (this.queue.offer(t2)) {
                schedule();
                return;
            }
            this.upstream.cancel();
            onError(new MissingBackpressureException("Queue is full?!"));
        }

        @Override // df.d
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                schedule();
            }
        }

        public final void schedule() {
            if (getAndIncrement() == 0) {
                this.worker.schedule(this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public final class MultiWorkerCallback implements SchedulerMultiWorkerSupport.WorkerCallback {
        public final c<T>[] parents;
        public final c<? super T>[] subscribers;

        public MultiWorkerCallback(c<? super T>[] cVarArr, c<T>[] cVarArr2) {
            this.subscribers = cVarArr;
            this.parents = cVarArr2;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerMultiWorkerSupport.WorkerCallback
        public void onWorker(int i10, Scheduler.Worker worker) {
            ParallelRunOn.this.createSubscriber(i10, this.subscribers, this.parents, worker);
        }
    }

    /* loaded from: classes2.dex */
    public static final class RunOnConditionalSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        public final ConditionalSubscriber<? super T> downstream;

        public RunOnConditionalSubscriber(ConditionalSubscriber<? super T> conditionalSubscriber, int i10, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i10, spscArrayQueue, worker);
            this.downstream = conditionalSubscriber;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(this.prefetch);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
            if (r13 != 0) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0070, code lost:
            if (r18.cancelled == false) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
            r2.clear();
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
            if (r18.done == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007a, code lost:
            r13 = r18.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
            if (r13 == null) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x007e, code lost:
            r2.clear();
            r3.onError(r13);
            r18.worker.dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
            if (r2.isEmpty() == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
            r3.onComplete();
            r18.worker.dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0098, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x009b, code lost:
            if (r11 == 0) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00a4, code lost:
            if (r7 == Long.MAX_VALUE) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00a6, code lost:
            r18.requested.addAndGet(-r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00ac, code lost:
            r7 = get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
            if (r7 != r6) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00b2, code lost:
            r18.consumed = r1;
            r6 = addAndGet(-r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00b9, code lost:
            if (r6 != 0) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00bb, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00bc, code lost:
            r6 = r7;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r18 = this;
                r0 = r18
                int r1 = r0.consumed
                io.reactivex.internal.queue.SpscArrayQueue<T> r2 = r0.queue
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r3 = r0.downstream
                int r4 = r0.limit
                r5 = 1
                r6 = 1
            Lc:
                java.util.concurrent.atomic.AtomicLong r7 = r0.requested
                long r7 = r7.get()
                r9 = 0
                r11 = r9
            L15:
                int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r13 == 0) goto L6c
                boolean r14 = r0.cancelled
                if (r14 == 0) goto L21
                r2.clear()
                return
            L21:
                boolean r14 = r0.done
                if (r14 == 0) goto L35
                java.lang.Throwable r15 = r0.error
                if (r15 == 0) goto L35
                r2.clear()
                r3.onError(r15)
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L35:
                java.lang.Object r15 = r2.poll()
                r16 = 21970(0x55d2, float:3.0787E-41)
                r16 = 0
                if (r15 != 0) goto L42
                r17 = 1
                goto L46
            L42:
                r17 = 29486(0x732e, float:4.1319E-41)
                r17 = 0
            L46:
                if (r14 == 0) goto L53
                if (r17 == 0) goto L53
                r3.onComplete()
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L53:
                if (r17 == 0) goto L56
                goto L6c
            L56:
                boolean r13 = r3.tryOnNext(r15)
                if (r13 == 0) goto L5f
                r13 = 1
                long r11 = r11 + r13
            L5f:
                int r1 = r1 + 1
                if (r1 != r4) goto L15
                df.d r13 = r0.upstream
                long r14 = (long) r1
                r13.request(r14)
                r1 = 6
                r1 = 0
                goto L15
            L6c:
                if (r13 != 0) goto L99
                boolean r13 = r0.cancelled
                if (r13 == 0) goto L76
                r2.clear()
                return
            L76:
                boolean r13 = r0.done
                if (r13 == 0) goto L99
                java.lang.Throwable r13 = r0.error
                if (r13 == 0) goto L8a
                r2.clear()
                r3.onError(r13)
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L8a:
                boolean r13 = r2.isEmpty()
                if (r13 == 0) goto L99
                r3.onComplete()
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L99:
                int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r13 == 0) goto Lac
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r13 == 0) goto Lac
                java.util.concurrent.atomic.AtomicLong r7 = r0.requested
                long r8 = -r11
                r7.addAndGet(r8)
            Lac:
                int r7 = r18.get()
                if (r7 != r6) goto Lbc
                r0.consumed = r1
                int r6 = -r6
                int r6 = r0.addAndGet(r6)
                if (r6 != 0) goto Lc
                return
            Lbc:
                r6 = r7
                goto Lc
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelRunOn.RunOnConditionalSubscriber.run():void");
        }
    }

    /* loaded from: classes2.dex */
    public static final class RunOnSubscriber<T> extends BaseRunOnSubscriber<T> {
        private static final long serialVersionUID = 1075119423897941642L;
        public final c<? super T> downstream;

        public RunOnSubscriber(c<? super T> cVar, int i10, SpscArrayQueue<T> spscArrayQueue, Scheduler.Worker worker) {
            super(i10, spscArrayQueue, worker);
            this.downstream = cVar;
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(this.prefetch);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0066, code lost:
            if (r13 != 0) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
            if (r18.cancelled == false) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
            r2.clear();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
            if (r18.done == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0074, code lost:
            r13 = r18.error;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
            if (r13 == null) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
            r2.clear();
            r3.onError(r13);
            r18.worker.dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0083, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
            if (r2.isEmpty() == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
            r3.onComplete();
            r18.worker.dispose();
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0092, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0095, code lost:
            if (r11 == 0) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x009e, code lost:
            if (r7 == Long.MAX_VALUE) goto L55;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
            r18.requested.addAndGet(-r11);
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00a6, code lost:
            r7 = get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00aa, code lost:
            if (r7 != r6) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00ac, code lost:
            r18.consumed = r1;
            r6 = addAndGet(-r6);
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00b3, code lost:
            if (r6 != 0) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00b5, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:
            r6 = r7;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r18 = this;
                r0 = r18
                int r1 = r0.consumed
                io.reactivex.internal.queue.SpscArrayQueue<T> r2 = r0.queue
                df.c<? super T> r3 = r0.downstream
                int r4 = r0.limit
                r5 = 1
                r6 = 1
            Lc:
                java.util.concurrent.atomic.AtomicLong r7 = r0.requested
                long r7 = r7.get()
                r9 = 0
                r11 = r9
            L15:
                int r13 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                if (r13 == 0) goto L66
                boolean r14 = r0.cancelled
                if (r14 == 0) goto L21
                r2.clear()
                return
            L21:
                boolean r14 = r0.done
                if (r14 == 0) goto L35
                java.lang.Throwable r15 = r0.error
                if (r15 == 0) goto L35
                r2.clear()
                r3.onError(r15)
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L35:
                java.lang.Object r15 = r2.poll()
                r16 = 883(0x373, float:1.237E-42)
                r16 = 0
                if (r15 != 0) goto L42
                r17 = 1
                goto L44
            L42:
                r17 = 0
            L44:
                if (r14 == 0) goto L51
                if (r17 == 0) goto L51
                r3.onComplete()
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L51:
                if (r17 == 0) goto L54
                goto L66
            L54:
                r3.onNext(r15)
                r13 = 1
                long r11 = r11 + r13
                int r1 = r1 + 1
                if (r1 != r4) goto L15
                df.d r13 = r0.upstream
                long r14 = (long) r1
                r13.request(r14)
                r1 = 0
                goto L15
            L66:
                if (r13 != 0) goto L93
                boolean r13 = r0.cancelled
                if (r13 == 0) goto L70
                r2.clear()
                return
            L70:
                boolean r13 = r0.done
                if (r13 == 0) goto L93
                java.lang.Throwable r13 = r0.error
                if (r13 == 0) goto L84
                r2.clear()
                r3.onError(r13)
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L84:
                boolean r13 = r2.isEmpty()
                if (r13 == 0) goto L93
                r3.onComplete()
                io.reactivex.Scheduler$Worker r1 = r0.worker
                r1.dispose()
                return
            L93:
                int r13 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
                if (r13 == 0) goto La6
                r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r13 == 0) goto La6
                java.util.concurrent.atomic.AtomicLong r7 = r0.requested
                long r8 = -r11
                r7.addAndGet(r8)
            La6:
                int r7 = r18.get()
                if (r7 != r6) goto Lb6
                r0.consumed = r1
                int r6 = -r6
                int r6 = r0.addAndGet(r6)
                if (r6 != 0) goto Lc
                return
            Lb6:
                r6 = r7
                goto Lc
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.parallel.ParallelRunOn.RunOnSubscriber.run():void");
        }
    }

    public ParallelRunOn(ParallelFlowable<? extends T> parallelFlowable, Scheduler scheduler, int i10) {
        this.source = parallelFlowable;
        this.scheduler = scheduler;
        this.prefetch = i10;
    }

    public void createSubscriber(int i10, c<? super T>[] cVarArr, c<T>[] cVarArr2, Scheduler.Worker worker) {
        c<? super T> cVar = cVarArr[i10];
        SpscArrayQueue spscArrayQueue = new SpscArrayQueue(this.prefetch);
        if (cVar instanceof ConditionalSubscriber) {
            cVarArr2[i10] = new RunOnConditionalSubscriber((ConditionalSubscriber) cVar, this.prefetch, spscArrayQueue, worker);
        } else {
            cVarArr2[i10] = new RunOnSubscriber(cVar, this.prefetch, spscArrayQueue, worker);
        }
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(c<? super T>[] cVarArr) {
        if (validate(cVarArr)) {
            int length = cVarArr.length;
            c<T>[] cVarArr2 = new c[length];
            Scheduler scheduler = this.scheduler;
            if (scheduler instanceof SchedulerMultiWorkerSupport) {
                ((SchedulerMultiWorkerSupport) scheduler).createWorkers(length, new MultiWorkerCallback(cVarArr, cVarArr2));
            } else {
                for (int i10 = 0; i10 < length; i10++) {
                    createSubscriber(i10, cVarArr, cVarArr2, this.scheduler.createWorker());
                }
            }
            this.source.subscribe(cVarArr2);
        }
    }
}
