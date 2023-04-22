package w6;

import android.content.Context;
import android.net.wifi.WifiManager;

/* loaded from: classes2.dex */
public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    public final WifiManager f16898a;

    /* renamed from: b  reason: collision with root package name */
    public WifiManager.WifiLock f16899b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16900c;
    public boolean d;

    public z0(Context context) {
        this.f16898a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public final void a() {
        WifiManager.WifiLock wifiLock = this.f16899b;
        if (wifiLock == null) {
            return;
        }
        if (this.f16900c && this.d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
