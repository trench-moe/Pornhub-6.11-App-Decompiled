package vb;

import android.util.Log;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class h implements ea.f<dc.a, Void> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Executor f16132c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ i f16133f;

    public h(i iVar, Executor executor) {
        this.f16133f = iVar;
        this.f16132c = executor;
    }

    @Override // ea.f
    public ea.g<Void> a(dc.a aVar) {
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return ea.j.d(null);
        }
        return ea.j.e(Arrays.asList(com.google.firebase.crashlytics.internal.common.d.b(this.f16133f.n), this.f16133f.n.f8014k.d(this.f16132c)));
    }
}
