package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.BlockingSubscriber;
import io.reactivex.internal.subscribers.BoundedSubscriber;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.util.BlockingHelper;
import io.reactivex.internal.util.BlockingIgnoringReceiver;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.NotificationLite;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public final class FlowableBlockingSubscribe {
    private FlowableBlockingSubscribe() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> void subscribe(b<? extends T> bVar) {
        BlockingIgnoringReceiver blockingIgnoringReceiver = new BlockingIgnoringReceiver();
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(Functions.emptyConsumer(), blockingIgnoringReceiver, blockingIgnoringReceiver, Functions.REQUEST_MAX);
        bVar.subscribe(lambdaSubscriber);
        BlockingHelper.awaitForComplete(blockingIgnoringReceiver, lambdaSubscriber);
        Throwable th = blockingIgnoringReceiver.error;
        if (th != null) {
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    public static <T> void subscribe(b<? extends T> bVar, c<? super T> cVar) {
        Object poll;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingSubscriber blockingSubscriber = new BlockingSubscriber(linkedBlockingQueue);
        bVar.subscribe(blockingSubscriber);
        do {
            try {
            } catch (InterruptedException e10) {
                blockingSubscriber.cancel();
                cVar.onError(e10);
            }
            if (blockingSubscriber.isCancelled()) {
                return;
            }
            poll = linkedBlockingQueue.poll();
            if (poll == null) {
                if (blockingSubscriber.isCancelled()) {
                    return;
                }
                BlockingHelper.verifyNonBlocking();
                poll = linkedBlockingQueue.take();
            }
            if (blockingSubscriber.isCancelled()) {
                return;
            }
            if (poll == BlockingSubscriber.TERMINATED) {
                return;
            }
        } while (!NotificationLite.acceptFull(poll, cVar));
    }

    public static <T> void subscribe(b<? extends T> bVar, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        ObjectHelper.requireNonNull(consumer, "onNext is null");
        ObjectHelper.requireNonNull(consumer2, "onError is null");
        ObjectHelper.requireNonNull(action, "onComplete is null");
        subscribe(bVar, new LambdaSubscriber(consumer, consumer2, action, Functions.REQUEST_MAX));
    }

    public static <T> void subscribe(b<? extends T> bVar, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, int i10) {
        ObjectHelper.requireNonNull(consumer, "onNext is null");
        ObjectHelper.requireNonNull(consumer2, "onError is null");
        ObjectHelper.requireNonNull(action, "onComplete is null");
        ObjectHelper.verifyPositive(i10, "number > 0 required");
        subscribe(bVar, new BoundedSubscriber(consumer, consumer2, action, Functions.boundedConsumer(i10), i10));
    }
}
