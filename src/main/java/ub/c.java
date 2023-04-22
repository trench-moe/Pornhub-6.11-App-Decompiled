package ub;

import android.util.Log;

/* loaded from: classes2.dex */
public class c implements b {
    @Override // ub.b
    public void b(a aVar) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
        }
    }
}
