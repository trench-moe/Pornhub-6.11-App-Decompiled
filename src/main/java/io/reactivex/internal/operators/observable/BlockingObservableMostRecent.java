package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.observers.DefaultObserver;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class BlockingObservableMostRecent<T> implements Iterable<T> {
    public final T initialValue;
    public final ObservableSource<T> source;

    /* loaded from: classes2.dex */
    public static final class MostRecentObserver<T> extends DefaultObserver<T> {
        public volatile Object value;

        /* loaded from: classes2.dex */
        public final class Iterator implements java.util.Iterator<T> {
            private Object buf;

            public Iterator() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                Object obj = MostRecentObserver.this.value;
                this.buf = obj;
                return !NotificationLite.isComplete(obj);
            }

            @Override // java.util.Iterator
            public T next() {
                try {
                    if (this.buf == null) {
                        this.buf = MostRecentObserver.this.value;
                    }
                    if (NotificationLite.isComplete(this.buf)) {
                        throw new NoSuchElementException();
                    }
                    if (NotificationLite.isError(this.buf)) {
                        throw ExceptionHelper.wrapOrThrow(NotificationLite.getError(this.buf));
                    }
                    T t2 = (T) NotificationLite.getValue(this.buf);
                    this.buf = null;
                    return t2;
                } catch (Throwable th) {
                    this.buf = null;
                    throw th;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public MostRecentObserver(T t2) {
            this.value = NotificationLite.next(t2);
        }

        public MostRecentObserver<T>.Iterator getIterable() {
            return new Iterator();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.value = NotificationLite.complete();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.value = NotificationLite.error(th);
        }

        @Override // io.reactivex.Observer
        public void onNext(T t2) {
            this.value = NotificationLite.next(t2);
        }
    }

    public BlockingObservableMostRecent(ObservableSource<T> observableSource, T t2) {
        this.source = observableSource;
        this.initialValue = t2;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        MostRecentObserver mostRecentObserver = new MostRecentObserver(this.initialValue);
        this.source.subscribe(mostRecentObserver);
        return mostRecentObserver.getIterable();
    }
}
