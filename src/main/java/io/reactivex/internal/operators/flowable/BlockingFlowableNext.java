package io.reactivex.internal.operators.flowable;

import df.b;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class BlockingFlowableNext<T> implements Iterable<T> {
    public final b<? extends T> source;

    /* loaded from: classes2.dex */
    public static final class NextIterator<T> implements Iterator<T> {
        private Throwable error;
        private boolean hasNext = true;
        private boolean isNextConsumed = true;
        private final b<? extends T> items;
        private T next;
        private boolean started;
        private final NextSubscriber<T> subscriber;

        public NextIterator(b<? extends T> bVar, NextSubscriber<T> nextSubscriber) {
            this.items = bVar;
            this.subscriber = nextSubscriber;
        }

        private boolean moveToNext() {
            try {
                if (!this.started) {
                    this.started = true;
                    this.subscriber.setWaiting();
                    Flowable.fromPublisher(this.items).materialize().subscribe((FlowableSubscriber<? super Notification<T>>) this.subscriber);
                }
                Notification<T> takeNext = this.subscriber.takeNext();
                if (takeNext.isOnNext()) {
                    this.isNextConsumed = false;
                    this.next = takeNext.getValue();
                    return true;
                }
                this.hasNext = false;
                if (takeNext.isOnComplete()) {
                    return false;
                }
                if (takeNext.isOnError()) {
                    Throwable error = takeNext.getError();
                    this.error = error;
                    throw ExceptionHelper.wrapOrThrow(error);
                }
                throw new IllegalStateException("Should not reach here");
            } catch (InterruptedException e10) {
                this.subscriber.dispose();
                this.error = e10;
                throw ExceptionHelper.wrapOrThrow(e10);
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Throwable th = this.error;
            if (th == null) {
                if (this.hasNext) {
                    return !this.isNextConsumed || moveToNext();
                }
                return false;
            }
            throw ExceptionHelper.wrapOrThrow(th);
        }

        @Override // java.util.Iterator
        public T next() {
            Throwable th = this.error;
            if (th == null) {
                if (hasNext()) {
                    this.isNextConsumed = true;
                    return this.next;
                }
                throw new NoSuchElementException("No more elements");
            }
            throw ExceptionHelper.wrapOrThrow(th);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Read only iterator");
        }
    }

    /* loaded from: classes2.dex */
    public static final class NextSubscriber<T> extends DisposableSubscriber<Notification<T>> {
        private final BlockingQueue<Notification<T>> buf = new ArrayBlockingQueue(1);
        public final AtomicInteger waiting = new AtomicInteger();

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            RxJavaPlugins.onError(th);
        }

        public void onNext(Notification<T> notification) {
            if (this.waiting.getAndSet(0) == 1 || !notification.isOnNext()) {
                loop0: while (true) {
                    while (!this.buf.offer(notification)) {
                        Notification<T> poll = this.buf.poll();
                        if (poll != null && !poll.isOnNext()) {
                            notification = poll;
                        }
                    }
                    break loop0;
                }
            }
        }

        @Override // io.reactivex.subscribers.DisposableSubscriber, io.reactivex.FlowableSubscriber, df.c
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            onNext((Notification) ((Notification) obj));
        }

        public void setWaiting() {
            this.waiting.set(1);
        }

        public Notification<T> takeNext() {
            setWaiting();
            BlockingHelper.verifyNonBlocking();
            return this.buf.take();
        }
    }

    public BlockingFlowableNext(b<? extends T> bVar) {
        this.source = bVar;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new NextIterator(this.source, new NextSubscriber());
    }
}
