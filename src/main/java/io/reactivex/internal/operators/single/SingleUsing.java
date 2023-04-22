package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class SingleUsing<T, U> extends Single<T> {
    public final Consumer<? super U> disposer;
    public final boolean eager;
    public final Callable<U> resourceSupplier;
    public final Function<? super U, ? extends SingleSource<? extends T>> singleFunction;

    /* loaded from: classes2.dex */
    public static final class UsingSingleObserver<T, U> extends AtomicReference<Object> implements SingleObserver<T>, Disposable {
        private static final long serialVersionUID = -5331524057054083935L;
        public final Consumer<? super U> disposer;
        public final SingleObserver<? super T> downstream;
        public final boolean eager;
        public Disposable upstream;

        public UsingSingleObserver(SingleObserver<? super T> singleObserver, U u2, boolean z10, Consumer<? super U> consumer) {
            super(u2);
            this.downstream = singleObserver;
            this.eager = z10;
            this.disposer = consumer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.upstream.dispose();
            this.upstream = DisposableHelper.DISPOSED;
            disposeAfter();
        }

        public void disposeAfter() {
            Object andSet = getAndSet(this);
            if (andSet != this) {
                try {
                    this.disposer.accept(andSet);
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    RxJavaPlugins.onError(th);
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.upstream.isDisposed();
        }

        @Override // io.reactivex.SingleObserver
        public void onError(Throwable th) {
            this.upstream = DisposableHelper.DISPOSED;
            if (this.eager) {
                Object andSet = getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.disposer.accept(andSet);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    th = new CompositeException(th, th2);
                }
            }
            this.downstream.onError(th);
            if (this.eager) {
                return;
            }
            disposeAfter();
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T t2) {
            this.upstream = DisposableHelper.DISPOSED;
            if (this.eager) {
                Object andSet = getAndSet(this);
                if (andSet != this) {
                    try {
                        this.disposer.accept(andSet);
                    } catch (Throwable th) {
                        Exceptions.throwIfFatal(th);
                        this.downstream.onError(th);
                    }
                }
                return;
            }
            this.downstream.onSuccess(t2);
            if (this.eager) {
                return;
            }
            disposeAfter();
        }
    }

    public SingleUsing(Callable<U> callable, Function<? super U, ? extends SingleSource<? extends T>> function, Consumer<? super U> consumer, boolean z10) {
        this.resourceSupplier = callable;
        this.singleFunction = function;
        this.disposer = consumer;
        this.eager = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // io.reactivex.Single
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void subscribeActual(io.reactivex.SingleObserver<? super T> r10) {
        /*
            r9 = this;
            r6 = r9
            java.lang.String r8 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            java.util.concurrent.Callable<U> r0 = r6.resourceSupplier     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L6c
            io.reactivex.functions.Function<? super U, ? extends io.reactivex.SingleSource<? extends T>> r1 = r6.singleFunction     // Catch: java.lang.Throwable -> L29
            r8 = 4
            java.lang.Object r8 = r1.apply(r0)     // Catch: java.lang.Throwable -> L29
            r1 = r8
            java.lang.String r8 = "The singleFunction returned a null SingleSource"
            r2 = r8
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L29
            io.reactivex.SingleSource r1 = (io.reactivex.SingleSource) r1     // Catch: java.lang.Throwable -> L29
            io.reactivex.internal.operators.single.SingleUsing$UsingSingleObserver r2 = new io.reactivex.internal.operators.single.SingleUsing$UsingSingleObserver
            boolean r3 = r6.eager
            r8 = 7
            io.reactivex.functions.Consumer<? super U> r4 = r6.disposer
            r2.<init>(r10, r0, r3, r4)
            r8 = 4
            r1.subscribe(r2)
            return
        L29:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            boolean r2 = r6.eager
            r8 = 5
            if (r2 == 0) goto L53
            io.reactivex.functions.Consumer<? super U> r2 = r6.disposer     // Catch: java.lang.Throwable -> L39
            r8 = 2
            r2.accept(r0)     // Catch: java.lang.Throwable -> L39
            goto L54
        L39:
            r2 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            r8 = 7
            io.reactivex.exceptions.CompositeException r3 = new io.reactivex.exceptions.CompositeException
            r8 = 4
            r8 = 2
            r4 = r8
            java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
            r8 = 0
            r5 = r8
            r4[r5] = r1
            r8 = 7
            r8 = 1
            r1 = r8
            r4[r1] = r2
            r3.<init>(r4)
            r8 = 6
            r1 = r3
        L53:
            r8 = 4
        L54:
            io.reactivex.internal.disposables.EmptyDisposable.error(r1, r10)
            boolean r10 = r6.eager
            if (r10 != 0) goto L6a
            r8 = 3
            io.reactivex.functions.Consumer<? super U> r10 = r6.disposer     // Catch: java.lang.Throwable -> L63
            r8 = 3
            r10.accept(r0)     // Catch: java.lang.Throwable -> L63
            goto L6b
        L63:
            r10 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r10)
            io.reactivex.plugins.RxJavaPlugins.onError(r10)
        L6a:
            r8 = 3
        L6b:
            return
        L6c:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.single.SingleUsing.subscribeActual(io.reactivex.SingleObserver):void");
    }
}
