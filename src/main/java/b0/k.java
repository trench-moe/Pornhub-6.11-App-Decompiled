package b0;

import android.app.Notification;
import android.os.Bundle;

/* loaded from: classes.dex */
public class k extends m {

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f3415b;

    @Override // b0.m
    public void a(Bundle bundle) {
        bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", "androidx.core.app.NotificationCompat$BigTextStyle");
    }

    @Override // b0.m
    public void b(i iVar) {
        new Notification.BigTextStyle(((n) iVar).f3437a).setBigContentTitle(null).bigText(this.f3415b);
    }

    @Override // b0.m
    public String c() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
