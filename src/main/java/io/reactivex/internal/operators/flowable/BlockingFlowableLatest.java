package io.reactivex.internal.operators.flowable;

import df.b;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class BlockingFlowableLatest<T> implements Iterable<T> {
    public final b<? extends T> source;

    /* loaded from: classes2.dex */
    public static final class LatestSubscriberIterator<T> extends DisposableSubscriber<Notification<T>> implements Iterator<T> {
        public Notification<T> iteratorNotification;
        public final Semaphore notify = new Semaphore(0);
        public final AtomicReference<Notification<T>> value = new AtomicReference<>();

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // java.util.Iterator
        public boolean hasNext() {
            /*
                r4 = this;
                io.reactivex.Notification<T> r0 = r4.iteratorNotification
                java.lang.String r3 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                if (r0 == 0) goto L1a
                boolean r0 = r0.isOnError()
                if (r0 != 0) goto Ld
                goto L1b
            Ld:
                io.reactivex.Notification<T> r0 = r4.iteratorNotification
                r3 = 3
                java.lang.Throwable r0 = r0.getError()
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
                r3 = 1
            L1a:
                r3 = 2
            L1b:
                io.reactivex.Notification<T> r0 = r4.iteratorNotification
                r3 = 1
                if (r0 == 0) goto L27
                boolean r0 = r0.isOnNext()
                if (r0 == 0) goto L69
                r3 = 1
            L27:
                r3 = 5
                io.reactivex.Notification<T> r0 = r4.iteratorNotification
                r3 = 2
                if (r0 != 0) goto L69
                r3 = 2
                r3 = 5
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()     // Catch: java.lang.InterruptedException -> L59
                r3 = 1
                java.util.concurrent.Semaphore r0 = r4.notify     // Catch: java.lang.InterruptedException -> L59
                r0.acquire()     // Catch: java.lang.InterruptedException -> L59
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Notification<T>> r0 = r4.value
                r3 = 2
                r2 = 0
                r1 = r2
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.Notification r0 = (io.reactivex.Notification) r0
                r4.iteratorNotification = r0
                r3 = 1
                boolean r1 = r0.isOnError()
                if (r1 != 0) goto L4e
                r3 = 3
                goto L69
            L4e:
                java.lang.Throwable r2 = r0.getError()
                r0 = r2
                java.lang.RuntimeException r2 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                r0 = r2
                throw r0
            L59:
                r0 = move-exception
                r4.dispose()
                io.reactivex.Notification r1 = io.reactivex.Notification.createOnError(r0)
                r4.iteratorNotification = r1
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
                r3 = 7
            L69:
                io.reactivex.Notification<T> r0 = r4.iteratorNotification
                r3 = 2
                boolean r2 = r0.isOnNext()
                r0 = r2
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.flowable.BlockingFlowableLatest.LatestSubscriberIterator.hasNext():boolean");
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext() && this.iteratorNotification.isOnNext()) {
                T value = this.iteratorNotification.getValue();
                this.iteratorNotification = null;
                return value;
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            RxJavaPlugins.onError(th);
        }

        public void onNext(Notification<T> notification) {
            if (this.value.getAndSet(notification) == null) {
                this.notify.release();
            }
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            onNext((Notification) ((Notification) obj));
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read-only iterator.");
        }
    }

    public BlockingFlowableLatest(b<? extends T> bVar) {
        this.source = bVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        LatestSubscriberIterator latestSubscriberIterator = new LatestSubscriberIterator();
        Flowable.fromPublisher(this.source).materialize().subscribe((FlowableSubscriber<? super Notification<T>>) latestSubscriberIterator);
        return latestSubscriberIterator;
    }
}
