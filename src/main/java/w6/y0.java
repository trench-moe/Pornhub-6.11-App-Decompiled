package w6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes2.dex */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    public final PowerManager f16893a;

    /* renamed from: b  reason: collision with root package name */
    public PowerManager.WakeLock f16894b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16895c;
    public boolean d;

    public y0(Context context) {
        this.f16893a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    public final void a() {
        PowerManager.WakeLock wakeLock = this.f16894b;
        if (wakeLock == null) {
            return;
        }
        if (this.f16895c && this.d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
