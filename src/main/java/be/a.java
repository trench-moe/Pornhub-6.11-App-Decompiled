package be;

import android.os.Looper;
import android.support.v4.media.b;
import com.appsflyer.oaid.BuildConfig;

/* loaded from: classes2.dex */
public class a implements io.realm.internal.a {

    /* renamed from: a  reason: collision with root package name */
    public final Looper f3654a = Looper.myLooper();

    /* renamed from: b  reason: collision with root package name */
    public final boolean f3655b;

    public a() {
        String name = Thread.currentThread().getName();
        this.f3655b = name != null && name.startsWith("IntentService[");
    }

    public boolean a() {
        return (this.f3654a != null) && !this.f3655b;
    }

    public void b(String str) {
        boolean z10 = this.f3654a != null;
        String str2 = BuildConfig.FLAVOR;
        if (!z10) {
            if (str != null) {
                str2 = b.j(str, " ", "Realm cannot be automatically updated on a thread without a looper.");
            }
            throw new IllegalStateException(str2);
        } else if (this.f3655b) {
            if (str != null) {
                str2 = b.j(str, " ", "Realm cannot be automatically updated on an IntentService thread.");
            }
            throw new IllegalStateException(str2);
        }
    }
}
