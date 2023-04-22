package io.reactivex.internal.subscribers;

import df.d;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class FutureSubscriber<T> extends CountDownLatch implements FlowableSubscriber<T>, Future<T>, d {
    public Throwable error;
    public final AtomicReference<d> upstream;
    public T value;

    public FutureSubscriber() {
        super(1);
        this.upstream = new AtomicReference<>();
    }

    @Override // df.d
    public void cancel() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        d dVar;
        SubscriptionHelper subscriptionHelper;
        do {
            dVar = this.upstream.get();
            if (dVar != this && dVar != (subscriptionHelper = SubscriptionHelper.CANCELLED)) {
            }
            return false;
        } while (!this.upstream.compareAndSet(dVar, subscriptionHelper));
        if (dVar != null) {
            dVar.cancel();
        }
        countDown();
        return true;
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
    public T get(long r9, java.util.concurrent.TimeUnit r11) {
        /*
            r8 = this;
            long r0 = r8.getCount()
            r2 = 0
            r6 = 5
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L21
            io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()
            boolean r0 = r8.await(r9, r11)
            if (r0 == 0) goto L15
            goto L21
        L15:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r6 = 7
            java.lang.String r9 = io.reactivex.internal.util.ExceptionHelper.timeoutMessage(r9, r11)
            r0.<init>(r9)
            throw r0
            r7 = 5
        L21:
            boolean r9 = r8.isCancelled()
            if (r9 != 0) goto L39
            r6 = 2
            java.lang.Throwable r9 = r8.error
            r7 = 3
            if (r9 != 0) goto L31
            r6 = 1
            T r9 = r8.value
            return r9
        L31:
            java.util.concurrent.ExecutionException r10 = new java.util.concurrent.ExecutionException
            r10.<init>(r9)
            r7 = 2
            throw r10
            r7 = 6
        L39:
            java.util.concurrent.CancellationException r9 = new java.util.concurrent.CancellationException
            r9.<init>()
            throw r9
            r6 = 3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.subscribers.FutureSubscriber.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.upstream.get() == SubscriptionHelper.CANCELLED;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return getCount() == 0;
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public void onComplete() {
        d dVar;
        if (this.value == null) {
            onError(new NoSuchElementException("The source is empty"));
            return;
        }
        do {
            dVar = this.upstream.get();
            if (dVar == this || dVar == SubscriptionHelper.CANCELLED) {
                return;
            }
        } while (!this.upstream.compareAndSet(dVar, this));
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public void onError(Throwable th) {
        d dVar;
        do {
            dVar = this.upstream.get();
            if (dVar != this && dVar != SubscriptionHelper.CANCELLED) {
                this.error = th;
            }
            RxJavaPlugins.onError(th);
            return;
        } while (!this.upstream.compareAndSet(dVar, this));
        countDown();
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public void onNext(T t2) {
        if (this.value == null) {
            this.value = t2;
            return;
        }
        this.upstream.get().cancel();
        onError(new IndexOutOfBoundsException("More than one element received"));
    }

    @Override // io.reactivex.FlowableSubscriber, df.c
    public void onSubscribe(d dVar) {
        SubscriptionHelper.setOnce(this.upstream, dVar, Long.MAX_VALUE);
    }

    @Override // df.d
    public void request(long j10) {
    }
}
