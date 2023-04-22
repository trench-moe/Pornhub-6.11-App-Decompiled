package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FlowableZip<T, R> extends Flowable<R> {
    public final int bufferSize;
    public final boolean delayError;
    public final b<? extends T>[] sources;
    public final Iterable<? extends b<? extends T>> sourcesIterable;
    public final Function<? super Object[], ? extends R> zipper;

    /* loaded from: classes2.dex */
    public static final class ZipCoordinator<T, R> extends AtomicInteger implements d {
        private static final long serialVersionUID = -2434867452883857743L;
        public volatile boolean cancelled;
        public final Object[] current;
        public final boolean delayErrors;
        public final c<? super R> downstream;
        public final AtomicThrowable errors;
        public final AtomicLong requested;
        public final ZipSubscriber<T, R>[] subscribers;
        public final Function<? super Object[], ? extends R> zipper;

        public ZipCoordinator(c<? super R> cVar, Function<? super Object[], ? extends R> function, int i10, int i11, boolean z10) {
            this.downstream = cVar;
            this.zipper = function;
            this.delayErrors = z10;
            ZipSubscriber<T, R>[] zipSubscriberArr = new ZipSubscriber[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                zipSubscriberArr[i12] = new ZipSubscriber<>(this, i11);
            }
            this.current = new Object[i10];
            this.subscribers = zipSubscriberArr;
            this.requested = new AtomicLong();
            this.errors = new AtomicThrowable();
        }

        @Override // df.d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            cancelAll();
        }

        public void cancelAll() {
            for (ZipSubscriber<T, R> zipSubscriber : this.subscribers) {
                zipSubscriber.cancel();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00ce, code lost:
            if (r16 != 0) goto L109;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00d2, code lost:
            if (r18.cancelled == false) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00d4, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00d7, code lost:
            if (r18.delayErrors != false) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00df, code lost:
            if (r18.errors.get() == null) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00e1, code lost:
            cancelAll();
            r2.onError(r18.errors.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00ed, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00ee, code lost:
            r6 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00ef, code lost:
            if (r6 >= r4) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00f1, code lost:
            r0 = r3[r6];
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00f5, code lost:
            if (r5[r6] != null) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00f7, code lost:
            r10 = r0.done;
            r0 = r0.queue;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00fb, code lost:
            if (r0 == null) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00fd, code lost:
            r0 = r0.poll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x0102, code lost:
            r0 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0103, code lost:
            if (r0 != null) goto L96;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x0105, code lost:
            r11 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:73:0x0107, code lost:
            r11 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x0108, code lost:
            if (r10 == false) goto L91;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x010a, code lost:
            if (r11 == false) goto L91;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x010c, code lost:
            cancelAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x0117, code lost:
            if (r18.errors.get() == null) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x0119, code lost:
            r2.onError(r18.errors.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0123, code lost:
            r2.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0126, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x0127, code lost:
            if (r11 != false) goto L95;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0129, code lost:
            r5[r6] = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x012c, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x012d, code lost:
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0);
            r18.errors.addThrowable(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0137, code lost:
            if (r18.delayErrors == false) goto L101;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0139, code lost:
            cancelAll();
            r2.onError(r18.errors.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x0145, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:89:0x0146, code lost:
            r6 = r6 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:0x014d, code lost:
            if (r12 == 0) goto L118;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x014f, code lost:
            r0 = r3.length;
            r15 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x0152, code lost:
            if (r15 >= r0) goto L114;
         */
        /* JADX WARN: Code restructure failed: missing block: B:94:0x0154, code lost:
            r3[r15].request(r12);
            r15 = r15 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x0163, code lost:
            if (r8 == Long.MAX_VALUE) goto L118;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x0165, code lost:
            r18.requested.addAndGet(-r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x016b, code lost:
            r7 = addAndGet(-r7);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drain() {
            /*
                Method dump skipped, instructions count: 371
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.FlowableZip.ZipCoordinator.drain():void");
        }

        public void error(ZipSubscriber<T, R> zipSubscriber, Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            zipSubscriber.done = true;
            drain();
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }

        public void subscribe(b<? extends T>[] bVarArr, int i10) {
            ZipSubscriber<T, R>[] zipSubscriberArr = this.subscribers;
            for (int i11 = 0; i11 < i10 && !this.cancelled; i11++) {
                if (!this.delayErrors && this.errors.get() != null) {
                    return;
                }
                bVarArr[i11].subscribe(zipSubscriberArr[i11]);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class ZipSubscriber<T, R> extends AtomicReference<d> implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -4627193790118206028L;
        public volatile boolean done;
        public final int limit;
        public final ZipCoordinator<T, R> parent;
        public final int prefetch;
        public long produced;
        public SimpleQueue<T> queue;
        public int sourceMode;

        public ZipSubscriber(ZipCoordinator<T, R> zipCoordinator, int i10) {
            this.parent = zipCoordinator;
            this.prefetch = i10;
            this.limit = i10 - (i10 >> 2);
        }

        @Override // df.d
        public void cancel() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.parent.error(this, th);
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            if (this.sourceMode != 2) {
                this.queue.offer(t2);
            }
            this.parent.drain();
        }

        @Override // io.reactivex.FlowableSubscriber, df.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this, dVar)) {
                if (dVar instanceof QueueSubscription) {
                    QueueSubscription queueSubscription = (QueueSubscription) dVar;
                    int requestFusion = queueSubscription.requestFusion(7);
                    if (requestFusion == 1) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        this.done = true;
                        this.parent.drain();
                        return;
                    } else if (requestFusion == 2) {
                        this.sourceMode = requestFusion;
                        this.queue = queueSubscription;
                        dVar.request(this.prefetch);
                        return;
                    }
                }
                this.queue = new SpscArrayQueue(this.prefetch);
                dVar.request(this.prefetch);
            }
        }

        @Override // df.d
        public void request(long j10) {
            if (this.sourceMode != 1) {
                long j11 = this.produced + j10;
                if (j11 >= this.limit) {
                    this.produced = 0L;
                    get().request(j11);
                    return;
                }
                this.produced = j11;
            }
        }
    }

    public FlowableZip(b<? extends T>[] bVarArr, Iterable<? extends b<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i10, boolean z10) {
        this.sources = bVarArr;
        this.sourcesIterable = iterable;
        this.zipper = function;
        this.bufferSize = i10;
        this.delayError = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super R> cVar) {
        int length;
        b<? extends T>[] bVarArr = this.sources;
        if (bVarArr == null) {
            bVarArr = new b[8];
            length = 0;
            for (b<? extends T> bVar : this.sourcesIterable) {
                if (length == bVarArr.length) {
                    b<? extends T>[] bVarArr2 = new b[(length >> 2) + length];
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                    bVarArr = bVarArr2;
                }
                bVarArr[length] = bVar;
                length++;
            }
        } else {
            length = bVarArr.length;
        }
        int i10 = length;
        if (i10 == 0) {
            EmptySubscription.complete(cVar);
            return;
        }
        ZipCoordinator zipCoordinator = new ZipCoordinator(cVar, this.zipper, i10, this.bufferSize, this.delayError);
        cVar.onSubscribe(zipCoordinator);
        zipCoordinator.subscribe(bVarArr, i10);
    }
}
