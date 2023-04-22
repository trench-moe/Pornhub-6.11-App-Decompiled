package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, Disposable {
    public static final int FUTURE_INDEX = 1;
    public static final int PARENT_INDEX = 0;
    public static final int THREAD_INDEX = 2;
    private static final long serialVersionUID = -6120223772001106981L;
    public final Runnable actual;
    public static final Object PARENT_DISPOSED = new Object();
    public static final Object SYNC_DISPOSED = new Object();
    public static final Object ASYNC_DISPOSED = new Object();
    public static final Object DONE = new Object();

    public ScheduledRunnable(Runnable runnable, DisposableContainer disposableContainer) {
        super(3);
        this.actual = runnable;
        lazySet(0, disposableContainer);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x003d -> B:21:0x003e). Please submit an issue!!! */
    @Override // io.reactivex.disposables.Disposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispose() {
        /*
            r10 = this;
        L0:
            r0 = 1
            java.lang.Object r7 = r10.get(r0)
            r1 = r7
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            r8 = 5
            r3 = 0
            r8 = 2
            if (r1 == r2) goto L3d
            r8 = 4
            java.lang.Object r2 = io.reactivex.internal.schedulers.ScheduledRunnable.SYNC_DISPOSED
            if (r1 == r2) goto L3d
            java.lang.Object r4 = io.reactivex.internal.schedulers.ScheduledRunnable.ASYNC_DISPOSED
            if (r1 != r4) goto L18
            r9 = 1
            goto L3e
        L18:
            r8 = 7
            r7 = 2
            r5 = r7
            java.lang.Object r5 = r10.get(r5)
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r6 = r7
            if (r5 == r6) goto L28
            r5 = 1
            goto L2a
        L28:
            r8 = 5
            r5 = 0
        L2a:
            if (r5 == 0) goto L2e
            r9 = 5
            r2 = r4
        L2e:
            boolean r7 = r10.compareAndSet(r0, r1, r2)
            r0 = r7
            if (r0 == 0) goto L0
            r9 = 7
            if (r1 == 0) goto L3d
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r5)
        L3d:
            r9 = 4
        L3e:
            java.lang.Object r0 = r10.get(r3)
            java.lang.Object r1 = io.reactivex.internal.schedulers.ScheduledRunnable.DONE
            r8 = 7
            if (r0 == r1) goto L5d
            r8 = 1
            java.lang.Object r1 = io.reactivex.internal.schedulers.ScheduledRunnable.PARENT_DISPOSED
            r8 = 3
            if (r0 == r1) goto L5d
            r8 = 1
            if (r0 != 0) goto L51
            goto L5e
        L51:
            boolean r7 = r10.compareAndSet(r3, r0, r1)
            r1 = r7
            if (r1 == 0) goto L3d
            io.reactivex.internal.disposables.DisposableContainer r0 = (io.reactivex.internal.disposables.DisposableContainer) r0
            r0.delete(r10)
        L5d:
            r8 = 4
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.schedulers.ScheduledRunnable.dispose():void");
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        boolean z10 = false;
        Object obj = get(0);
        return (obj == PARENT_DISPOSED || obj == DONE) ? true : true;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        Object obj3;
        boolean compareAndSet;
        Object obj4;
        Object obj5;
        lazySet(2, Thread.currentThread());
        try {
            this.actual.run();
        } finally {
            try {
                lazySet(2, null);
                obj4 = get(0);
                if (obj4 != PARENT_DISPOSED) {
                    ((DisposableContainer) obj4).delete(this);
                }
                do {
                    obj5 = get(1);
                    if (obj5 == SYNC_DISPOSED) {
                        break;
                    }
                    break;
                } while (!compareAndSet(1, obj5, DONE));
            } catch (Throwable th) {
                while (true) {
                    if (obj == obj2) {
                        break;
                    } else if (obj == obj3) {
                        break;
                    } else if (compareAndSet) {
                        break;
                    }
                }
            }
        }
        lazySet(2, null);
        obj4 = get(0);
        if (obj4 != PARENT_DISPOSED && compareAndSet(0, obj4, DONE) && obj4 != null) {
            ((DisposableContainer) obj4).delete(this);
        }
        do {
            obj5 = get(1);
            if (obj5 == SYNC_DISPOSED || obj5 == ASYNC_DISPOSED) {
                break;
            }
        } while (!compareAndSet(1, obj5, DONE));
    }

    public void setFuture(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == DONE) {
                return;
            }
            if (obj == SYNC_DISPOSED) {
                future.cancel(false);
                return;
            } else if (obj == ASYNC_DISPOSED) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }
}
