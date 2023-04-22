package p8;

import android.os.Process;

/* loaded from: classes2.dex */
public final class v extends Thread {
    public v(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
