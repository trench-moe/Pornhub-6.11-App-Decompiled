package io.reactivex.internal.operators.flowable;

import df.c;
import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class FlowableAutoConnect<T> extends Flowable<T> {
    public final AtomicInteger clients = new AtomicInteger();
    public final Consumer<? super Disposable> connection;
    public final int numberOfSubscribers;
    public final ConnectableFlowable<? extends T> source;

    public FlowableAutoConnect(ConnectableFlowable<? extends T> connectableFlowable, int i10, Consumer<? super Disposable> consumer) {
        this.source = connectableFlowable;
        this.numberOfSubscribers = i10;
        this.connection = consumer;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c<? super T> cVar) {
        this.source.subscribe((c<? super Object>) cVar);
        if (this.clients.incrementAndGet() == this.numberOfSubscribers) {
            this.source.connect(this.connection);
        }
    }
}
