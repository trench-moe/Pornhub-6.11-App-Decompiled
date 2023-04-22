package io.reactivex.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class AndroidSchedulers {
    private static final Scheduler MAIN_THREAD = RxAndroidPlugins.initMainThreadScheduler(new Callable<Scheduler>() { // from class: io.reactivex.android.schedulers.AndroidSchedulers.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Scheduler call() {
            return MainHolder.DEFAULT;
        }
    });

    /* loaded from: classes2.dex */
    public static final class MainHolder {
        public static final Scheduler DEFAULT = new HandlerScheduler(new Handler(Looper.getMainLooper()), false);

        private MainHolder() {
        }
    }

    private AndroidSchedulers() {
        throw new AssertionError("No instances.");
    }

    public static Scheduler from(Looper looper) {
        return from(looper, false);
    }

    @SuppressLint({"NewApi"})
    public static Scheduler from(Looper looper, boolean z10) {
        Objects.requireNonNull(looper, "looper == null");
        int i10 = Build.VERSION.SDK_INT;
        if (z10 && i10 < 22) {
            Message obtain = Message.obtain();
            try {
                obtain.setAsynchronous(true);
            } catch (NoSuchMethodError unused) {
                z10 = false;
            }
            obtain.recycle();
        }
        return new HandlerScheduler(new Handler(looper), z10);
    }

    public static Scheduler mainThread() {
        return RxAndroidPlugins.onMainThreadScheduler(MAIN_THREAD);
    }
}
