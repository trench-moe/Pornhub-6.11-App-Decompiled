package p8;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.android.gms.internal.gtm.zzav;
import java.lang.Thread;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

@SuppressLint({"StaticFieldLeak"})
/* loaded from: classes2.dex */
public final class w {

    /* renamed from: f  reason: collision with root package name */
    public static volatile w f13870f;

    /* renamed from: a  reason: collision with root package name */
    public final Context f13871a;

    /* renamed from: b  reason: collision with root package name */
    public final List<x> f13872b;

    /* renamed from: c  reason: collision with root package name */
    public final t f13873c;
    public volatile zzav d;

    /* renamed from: e  reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f13874e;

    public w(Context context) {
        Context applicationContext = context.getApplicationContext();
        Objects.requireNonNull(applicationContext, "null reference");
        this.f13871a = applicationContext;
        this.f13873c = new t(this);
        this.f13872b = new CopyOnWriteArrayList();
        new n();
    }

    public static void b() {
        if (!(Thread.currentThread() instanceof v)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final <V> Future<V> a(Callable<V> callable) {
        if (Thread.currentThread() instanceof v) {
            FutureTask futureTask = new FutureTask(callable);
            futureTask.run();
            return futureTask;
        }
        return this.f13873c.submit(callable);
    }

    public final void c(Runnable runnable) {
        this.f13873c.submit(runnable);
    }
}
