package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.MaybeObserver;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class BlockingMultiObserver<T> extends CountDownLatch implements SingleObserver<T>, CompletableObserver, MaybeObserver<T> {
    public volatile boolean cancelled;
    public Throwable error;
    public Disposable upstream;
    public T value;

    public BlockingMultiObserver() {
        super(1);
    }

    public boolean blockingAwait(long j10, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                if (!await(j10, timeUnit)) {
                    dispose();
                    return false;
                }
            } catch (InterruptedException e10) {
                dispose();
                throw ExceptionHelper.wrapOrThrow(e10);
            }
        }
        Throwable th = this.error;
        if (th == null) {
            return true;
        }
        throw ExceptionHelper.wrapOrThrow(th);
    }

    public T blockingGet() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e10) {
                dispose();
                throw ExceptionHelper.wrapOrThrow(e10);
            }
        }
        Throwable th = this.error;
        if (th == null) {
            return this.value;
        }
        throw ExceptionHelper.wrapOrThrow(th);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public T blockingGet(T r9) {
        /*
            r8 = this;
            r5 = r8
            long r0 = r5.getCount()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L1f
            r7 = 7
            r7 = 2
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()     // Catch: java.lang.InterruptedException -> L14
            r5.await()     // Catch: java.lang.InterruptedException -> L14
            goto L20
        L14:
            r9 = move-exception
            r5.dispose()
            r7 = 4
            java.lang.RuntimeException r9 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r9)
            throw r9
            r7 = 7
        L1f:
            r7 = 2
        L20:
            java.lang.Throwable r0 = r5.error
            if (r0 != 0) goto L2c
            T r0 = r5.value
            r7 = 7
            if (r0 == 0) goto L2a
            r9 = r0
        L2a:
            r7 = 4
            return r9
        L2c:
            java.lang.RuntimeException r7 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
            r9 = r7
            throw r9
            r7 = 3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.observers.BlockingMultiObserver.blockingGet(java.lang.Object):java.lang.Object");
    }

    public Throwable blockingGetError() {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                await();
            } catch (InterruptedException e10) {
                dispose();
                return e10;
            }
        }
        return this.error;
    }

    public Throwable blockingGetError(long j10, TimeUnit timeUnit) {
        if (getCount() != 0) {
            try {
                BlockingHelper.verifyNonBlocking();
                if (!await(j10, timeUnit)) {
                    dispose();
                    throw ExceptionHelper.wrapOrThrow(new TimeoutException(ExceptionHelper.timeoutMessage(j10, timeUnit)));
                }
            } catch (InterruptedException e10) {
                dispose();
                throw ExceptionHelper.wrapOrThrow(e10);
            }
        }
        return this.error;
    }

    public void dispose() {
        this.cancelled = true;
        Disposable disposable = this.upstream;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public void onError(Throwable th) {
        this.error = th;
        countDown();
    }

    @Override // io.reactivex.SingleObserver
    public void onSubscribe(Disposable disposable) {
        this.upstream = disposable;
        if (this.cancelled) {
            disposable.dispose();
        }
    }

    @Override // io.reactivex.SingleObserver
    public void onSuccess(T t2) {
        this.value = t2;
        countDown();
    }
}
