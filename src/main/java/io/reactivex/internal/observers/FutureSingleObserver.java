package io.reactivex.internal.observers;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FutureSingleObserver<T> extends CountDownLatch implements SingleObserver<T>, Future<T>, Disposable {
    public Throwable error;
    public final AtomicReference<Disposable> upstream;
    public T value;

    public FutureSingleObserver() {
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

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // java.util.concurrent.Future
    public T get() {
        /*
            r8 = this;
            r5 = r8
            long r0 = r5.getCount()
            r2 = 0
            r7 = 5
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L14
            r7 = 6
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()
            r5.await()
            r7 = 5
        L14:
            r7 = 5
            boolean r7 = r5.isCancelled()
            r0 = r7
            if (r0 != 0) goto L2d
            java.lang.Throwable r0 = r5.error
            if (r0 != 0) goto L24
            T r0 = r5.value
            r7 = 5
            return r0
        L24:
            r7 = 5
            java.util.concurrent.ExecutionException r1 = new java.util.concurrent.ExecutionException
            r1.<init>(r0)
            r7 = 4
            throw r1
            r7 = 5
        L2d:
            r7 = 2
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r7 = 6
            r0.<init>()
            r7 = 2
            throw r0
            r7 = 3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.observers.FutureSingleObserver.get():java.lang.Object");
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
            r5 = r9
            long r0 = r5.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r8 = 1
            if (r4 == 0) goto L25
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()
            boolean r0 = r5.await(r10, r12)
            if (r0 == 0) goto L16
            goto L25
        L16:
            r7 = 2
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            java.lang.String r8 = io.reactivex.internal.util.ExceptionHelper.timeoutMessage(r10, r12)
            r10 = r8
            r0.<init>(r10)
            java.lang.String r7 = "Ⓢⓜⓞⓑ⓸⓺"
            throw r0
            r8 = 7
        L25:
            boolean r10 = r5.isCancelled()
            if (r10 != 0) goto L3e
            r8 = 5
            java.lang.Throwable r10 = r5.error
            if (r10 != 0) goto L35
            r8 = 4
            T r10 = r5.value
            r7 = 3
            return r10
        L35:
            r7 = 3
            java.util.concurrent.ExecutionException r11 = new java.util.concurrent.ExecutionException
            r7 = 4
            r11.<init>(r10)
            throw r11
            r8 = 6
        L3e:
            java.util.concurrent.CancellationException r10 = new java.util.concurrent.CancellationException
            r7 = 6
            r10.<init>()
            r7 = 6
            throw r10
            r7 = 4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.observers.FutureSingleObserver.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
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

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th) {
        Disposable disposable;
        do {
            disposable = this.upstream.get();
            if (disposable == DisposableHelper.DISPOSED) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.error = th;
        } while (!this.upstream.compareAndSet(disposable, this));
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
        DisposableHelper.setOnce(this.upstream, disposable);
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t2) {
        Disposable disposable = this.upstream.get();
        if (disposable == DisposableHelper.DISPOSED) {
            return;
        }
        this.value = t2;
        this.upstream.compareAndSet(disposable, this);
        countDown();
    }
}
