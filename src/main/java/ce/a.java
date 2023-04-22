package ce;

import android.os.Process;

/* loaded from: classes2.dex */
public class a implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f4096c;

    public a(Runnable runnable) {
        this.f4096c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        this.f4096c.run();
    }
}
