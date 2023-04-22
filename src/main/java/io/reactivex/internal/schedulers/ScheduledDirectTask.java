package io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class ScheduledDirectTask extends AbstractDirectTask implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public ScheduledDirectTask(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            lazySet(AbstractDirectTask.FINISHED);
            this.runner = null;
            return null;
        } catch (Throwable th) {
            lazySet(AbstractDirectTask.FINISHED);
            this.runner = null;
            throw th;
        }
    }

    @Override // io.reactivex.internal.schedulers.AbstractDirectTask, io.reactivex.schedulers.SchedulerRunnableIntrospection
    public /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }
}
