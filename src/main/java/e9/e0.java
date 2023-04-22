package e9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class e0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public Context f9178a;

    /* renamed from: b  reason: collision with root package name */
    public final a1 f9179b;

    public e0(a1 a1Var) {
        this.f9179b = a1Var;
    }

    public final synchronized void a() {
        try {
            Context context = this.f9178a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f9178a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            a1 a1Var = this.f9179b;
            a1Var.f9152b.f9160f.j();
            if (a1Var.f9151a.isShowing()) {
                a1Var.f9151a.dismiss();
            }
            a();
        }
    }
}
