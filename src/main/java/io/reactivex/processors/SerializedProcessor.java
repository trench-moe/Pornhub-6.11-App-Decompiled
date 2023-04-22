package io.reactivex.processors;

import df.c;
import df.d;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class SerializedProcessor<T> extends FlowableProcessor<T> {
    public final FlowableProcessor<T> actual;
    public volatile boolean done;
    public boolean emitting;
    public AppendOnlyLinkedArrayList<Object> queue;

    public SerializedProcessor(FlowableProcessor<T> flowableProcessor) {
        this.actual = flowableProcessor;
    }

    public void emitLoop() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        while (true) {
            synchronized (this) {
                appendOnlyLinkedArrayList = this.queue;
                if (appendOnlyLinkedArrayList == null) {
                    this.emitting = false;
                    return;
                }
                this.queue = null;
            }
            appendOnlyLinkedArrayList.accept(this.actual);
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        return this.actual.getThrowable();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.actual.hasComplete();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.actual.hasSubscribers();
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.actual.hasThrowable();
    }

    @Override // io.reactivex.processors.FlowableProcessor, df.c
    public void onComplete() {
        if (this.done) {
            return;
        }
        synchronized (this) {
            if (this.done) {
                return;
            }
            this.done = true;
            if (!this.emitting) {
                this.emitting = true;
                this.actual.onComplete();
                return;
            }
            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
            if (appendOnlyLinkedArrayList == null) {
                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                this.queue = appendOnlyLinkedArrayList;
            }
            appendOnlyLinkedArrayList.add(NotificationLite.complete());
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, df.c
    public void onError(Throwable th) {
        if (this.done) {
            RxJavaPlugins.onError(th);
            return;
        }
        synchronized (this) {
            boolean z10 = true;
            if (!this.done) {
                this.done = true;
                if (this.emitting) {
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.queue = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.setFirst(NotificationLite.error(th));
                    return;
                }
                this.emitting = true;
                z10 = false;
            }
            if (z10) {
                RxJavaPlugins.onError(th);
            } else {
                this.actual.onError(th);
            }
        }
    }

    @Override // io.reactivex.processors.FlowableProcessor, df.c
    public void onNext(T t2) {
        if (this.done) {
            return;
        }
        synchronized (this) {
            if (this.done) {
                return;
            }
            if (!this.emitting) {
                this.emitting = true;
                this.actual.onNext(t2);
                emitLoop();
                return;
            }
            AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
            if (appendOnlyLinkedArrayList == null) {
                appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                this.queue = appendOnlyLinkedArrayList;
            }
            appendOnlyLinkedArrayList.add(NotificationLite.next(t2));
        }
    }

    @Override // df.c
    public void onSubscribe(d dVar) {
        boolean z10 = true;
        if (!this.done) {
            synchronized (this) {
                if (!this.done) {
                    if (this.emitting) {
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.queue = appendOnlyLinkedArrayList;
                        }
                        appendOnlyLinkedArrayList.add(NotificationLite.subscription(dVar));
                        return;
                    }
                    this.emitting = true;
                    z10 = false;
                }
            }
        }
        if (z10) {
            dVar.cancel();
            return;
        }
        this.actual.onSubscribe(dVar);
        emitLoop();
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.actual.subscribe(cVar);
    }
}
