package io.reactivex.internal.util;

import a1.a;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.schedulers.NonBlockingThread;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class BlockingHelper {
    private BlockingHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static void awaitForComplete(CountDownLatch countDownLatch, Disposable disposable) {
        if (countDownLatch.getCount() == 0) {
            return;
        }
        try {
            verifyNonBlocking();
            countDownLatch.await();
        } catch (InterruptedException e10) {
            disposable.dispose();
            Thread.currentThread().interrupt();
            throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e10);
        }
    }

    public static void verifyNonBlocking() {
        if (RxJavaPlugins.isFailOnNonBlockingScheduler()) {
            if ((Thread.currentThread() instanceof NonBlockingThread) || RxJavaPlugins.onBeforeBlocking()) {
                StringBuilder m10 = a.m("Attempt to block on a Scheduler ");
                m10.append(Thread.currentThread().getName());
                m10.append(" that doesn't support blocking operators as they may lead to deadlock");
                throw new IllegalStateException(m10.toString());
            }
        }
    }
}
