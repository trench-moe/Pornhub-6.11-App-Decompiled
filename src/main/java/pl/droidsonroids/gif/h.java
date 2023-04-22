package pl.droidsonroids.gif;

import java.lang.Thread;

/* loaded from: classes3.dex */
public abstract class h implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final b f14133c;

    public h(b bVar) {
        this.f14133c = bVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f14133c.f14118u.m()) {
                return;
            }
            a();
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }
}
