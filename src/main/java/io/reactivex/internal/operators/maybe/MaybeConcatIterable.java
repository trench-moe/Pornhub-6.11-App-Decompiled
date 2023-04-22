package io.reactivex.internal.operators.maybe;

import df.c;
import df.d;
import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class MaybeConcatIterable<T> extends Flowable<T> {
    public final Iterable<? extends MaybeSource<? extends T>> sources;

    /* loaded from: classes2.dex */
    public static final class ConcatMaybeObserver<T> extends AtomicInteger implements MaybeObserver<T>, d {
        private static final long serialVersionUID = 3520831347801429610L;
        public final c<? super T> downstream;
        public long produced;
        public final Iterator<? extends MaybeSource<? extends T>> sources;
        public final AtomicLong requested = new AtomicLong();
        public final SequentialDisposable disposables = new SequentialDisposable();
        public final AtomicReference<Object> current = new AtomicReference<>(NotificationLite.COMPLETE);

        public ConcatMaybeObserver(c<? super T> cVar, Iterator<? extends MaybeSource<? extends T>> it) {
            this.downstream = cVar;
            this.sources = it;
        }

        @Override // df.d
        public void cancel() {
            this.disposables.dispose();
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x009e A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void drain() {
            /*
                r12 = this;
                int r11 = r12.getAndIncrement()
                r0 = r11
                if (r0 == 0) goto L9
                r11 = 6
                return
            L9:
                r11 = 4
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r12.current
                df.c<? super T> r1 = r12.downstream
                r11 = 3
                io.reactivex.internal.disposables.SequentialDisposable r2 = r12.disposables
                r11 = 6
            L12:
                boolean r11 = r2.isDisposed()
                r3 = r11
                r11 = 0
                r4 = r11
                if (r3 == 0) goto L20
                r0.lazySet(r4)
                r11 = 4
                return
            L20:
                r11 = 5
                java.lang.Object r11 = r0.get()
                r3 = r11
                if (r3 == 0) goto L97
                r11 = 2
                io.reactivex.internal.util.NotificationLite r5 = io.reactivex.internal.util.NotificationLite.COMPLETE
                r11 = 1
                r11 = 1
                r6 = r11
                if (r3 == r5) goto L54
                r11 = 7
                long r7 = r12.produced
                r11 = 4
                java.util.concurrent.atomic.AtomicLong r5 = r12.requested
                long r9 = r5.get()
                int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r5 == 0) goto L4e
                r9 = 1
                r11 = 6
                long r7 = r7 + r9
                r12.produced = r7
                r11 = 6
                r0.lazySet(r4)
                r11 = 5
                r1.onNext(r3)
                r11 = 5
                goto L58
            L4e:
                r11 = 4
                r11 = 0
                r3 = r11
                r11 = 0
                r6 = r11
                goto L58
            L54:
                r11 = 1
                r0.lazySet(r4)
            L58:
                if (r6 == 0) goto L97
                r11 = 2
                boolean r11 = r2.isDisposed()
                r3 = r11
                if (r3 != 0) goto L97
                r11 = 7
                java.util.Iterator<? extends io.reactivex.MaybeSource<? extends T>> r3 = r12.sources     // Catch: java.lang.Throwable -> L8d
                boolean r3 = r3.hasNext()     // Catch: java.lang.Throwable -> L8d
                if (r3 == 0) goto L88
                r11 = 5
                java.util.Iterator<? extends io.reactivex.MaybeSource<? extends T>> r3 = r12.sources     // Catch: java.lang.Throwable -> L80
                java.lang.Object r11 = r3.next()     // Catch: java.lang.Throwable -> L80
                r3 = r11
                java.lang.String r11 = "The source Iterator returned a null MaybeSource"
                r4 = r11
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r4)     // Catch: java.lang.Throwable -> L80
                io.reactivex.MaybeSource r3 = (io.reactivex.MaybeSource) r3     // Catch: java.lang.Throwable -> L80
                r3.subscribe(r12)
                goto L98
            L80:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1.onError(r0)
                return
            L88:
                r1.onComplete()
                r11 = 6
                goto L98
            L8d:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r11 = 4
                r1.onError(r0)
                r11 = 6
                return
            L97:
                r11 = 7
            L98:
                int r3 = r12.decrementAndGet()
                if (r3 != 0) goto L12
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.maybe.MaybeConcatIterable.ConcatMaybeObserver.drain():void");
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
            this.current.lazySet(NotificationLite.COMPLETE);
            drain();
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(Disposable disposable) {
            this.disposables.replace(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T t2) {
            this.current.lazySet(t2);
            drain();
        }

        @Override // df.d
        public void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.requested, j10);
                drain();
            }
        }
    }

    public MaybeConcatIterable(Iterable<? extends MaybeSource<? extends T>> iterable) {
        this.sources = iterable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        try {
            ConcatMaybeObserver concatMaybeObserver = new ConcatMaybeObserver(cVar, (Iterator) ObjectHelper.requireNonNull(this.sources.iterator(), "The sources Iterable returned a null Iterator"));
            cVar.onSubscribe(concatMaybeObserver);
            concatMaybeObserver.drain();
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
