package k8;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* loaded from: classes2.dex */
public class x implements b {
    @Override // k8.b
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // k8.b
    public i b(Looper looper, Handler.Callback callback) {
        return new y(new Handler(looper, callback));
    }

    @Override // k8.b
    public void c() {
    }

    @Override // k8.b
    public long d() {
        return SystemClock.elapsedRealtime();
    }
}
