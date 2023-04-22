package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FutureObserver<T> extends CountDownLatch implements Observer<T>, Future<T>, Disposable {
    public Throwable error;
    public final AtomicReference<Disposable> upstream;
    public T value;

    public FutureObserver() {
        super(1);
        this.upstream = new AtomicReference<>();
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        Disposable disposable;
        DisposableHelper disposableHelper;
        do {
            disposable = this.upstream.get();
            if (disposable != this && disposable != (disposableHelper = DisposableHelper.DISPOSED)) {
            }
            return false;
        } while (!this.upstream.compareAndSet(disposable, disposableHelper));
        if (disposable != null) {
            disposable.dispose();
        }
        countDown();
        return true;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    @Override // java.util.concurrent.Future
    public T get() {
        if (getCount() != 0) {
            BlockingHelper.verifyNonBlocking();
            await();
        }
        if (isCancelled()) {
            throw new CancellationException();
        }
        Throwable th = this.error;
        if (th == null) {
            return this.value;
        }
        throw new ExecutionException(th);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // java.util.concurrent.Future
    public T get(long r10, java.util.concurrent.TimeUnit r12) {
        /*
            r9 = this;
            long r0 = r9.getCount()
            r2 = 0
            r7 = 3
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L23
            r6 = 2
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()
            boolean r0 = r9.await(r10, r12)
            if (r0 == 0) goto L16
            goto L24
        L16:
            r8 = 4
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.String r5 = io.reactivex.internal.util.ExceptionHelper.timeoutMessage(r10, r12)
            r10 = r5
            r0.<init>(r10)
            throw r0
            r7 = 7
        L23:
            r6 = 6
        L24:
            boolean r10 = r9.isCancelled()
            if (r10 != 0) goto L3b
            r7 = 5
            java.lang.Throwable r10 = r9.error
            r8 = 2
            if (r10 != 0) goto L34
            T r10 = r9.value
            r8 = 7
            return r10
        L34:
            java.util.concurrent.ExecutionException r11 = new java.util.concurrent.ExecutionException
            r11.<init>(r10)
            throw r11
            r6 = 7
        L3b:
            java.util.concurrent.CancellationException r10 = new java.util.concurrent.CancellationException
            r7 = 2
            r10.<init>()
            r7 = 2
            throw r10
            r6 = 7
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.observers.FutureObserver.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return DisposableHelper.isDisposed(this.upstream.get());
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return isDone();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
        Disposable disposable;
        if (this.value == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            disposable = this.upstream.get();
            if (disposable != this && disposable != DisposableHelper.DISPOSED) {
            }
            return;
        } while (!this.upstream.compareAndSet(disposable, this));
        countDown();
    }

    @Override // io.reactivex.Observer
    public void onError(Throwable th) {
        Disposable disposable;
        if (this.error != null) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        do {
            disposable = this.upstream.get();
            if (disposable == this || disposable == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th);
                return;
            }
        } while (!this.upstream.compareAndSet(disposable, this));
        countDown();
    }

    @Override // io.reactivex.Observer
    public void onNext(T t2) {
        if (this.value == null) {
            this.value = t2;
            return;
        }
        this.upstream.get().dispose();
        onError(new IndexOutOfBoundsException("More than one element received"));
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.upstream, disposable);
    }
}
