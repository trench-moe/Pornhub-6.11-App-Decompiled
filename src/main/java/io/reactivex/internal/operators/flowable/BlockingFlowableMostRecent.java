package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.subscribers.DefaultSubscriber;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class BlockingFlowableMostRecent<T> implements Iterable<T> {
    public final T initialValue;
    public final Flowable<T> source;

    /* loaded from: classes2.dex */
    public static final class MostRecentSubscriber<T> extends DefaultSubscriber<T> {
        public volatile Object value;

        /* loaded from: classes2.dex */
        public final class Iterator implements java.util.Iterator<T> {
            private Object buf;

            public Iterator() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Object obj = MostRecentSubscriber.this.value;
                this.buf = obj;
                return !NotificationLite.isComplete(obj);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.buf == null) {
                        this.buf = MostRecentSubscriber.this.value;
                    }
                    if (NotificationLite.isComplete(this.buf)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.isError(this.buf)) {
                        throw ExceptionHelper.wrapOrThrow(NotificationLite.getError(this.buf));
                    }
                    return (T) NotificationLite.getValue(this.buf);
                } finally {
                    this.buf = null;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public MostRecentSubscriber(T t2) {
            this.value = NotificationLite.next(t2);
        }

        public MostRecentSubscriber<T>.Iterator getIterable() {
            return new Iterator();
        }

        @Override // io.reactivex.subscribers.DefaultSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onComplete() {
            this.value = NotificationLite.complete();
        }

        @Override // io.reactivex.subscribers.DefaultSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onError(Throwable th) {
            this.value = NotificationLite.error(th);
        }

        @Override // io.reactivex.subscribers.DefaultSubscriber, io.reactivex.FlowableSubscriber, df.c
        public void onNext(T t2) {
            this.value = NotificationLite.next(t2);
        }
    }

    public BlockingFlowableMostRecent(Flowable<T> flowable, T t2) {
        this.source = flowable;
        this.initialValue = t2;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        MostRecentSubscriber mostRecentSubscriber = new MostRecentSubscriber(this.initialValue);
        this.source.subscribe((FlowableSubscriber) mostRecentSubscriber);
        return mostRecentSubscriber.getIterable();
    }
}
