package vb;

import android.util.Log;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class p implements Callable<Boolean> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f16163c;

    public p(o oVar) {
        this.f16163c = oVar;
    }

    @Override // java.util.concurrent.Callable
    public Boolean call() {
        com.google.firebase.crashlytics.internal.common.d dVar = this.f16163c.f16152f;
        boolean z10 = false;
        boolean z11 = true;
        if (dVar.f8007c.c().exists()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
            }
            dVar.f8007c.c().delete();
        } else {
            String f10 = dVar.f();
            if (f10 != null && dVar.f8012i.d(f10)) {
                z10 = true;
            }
            z11 = z10;
        }
        return Boolean.valueOf(z11);
    }
}
