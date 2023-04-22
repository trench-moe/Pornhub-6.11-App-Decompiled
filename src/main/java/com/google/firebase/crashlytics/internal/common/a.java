package com.google.firebase.crashlytics.internal.common;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.e;
import vb.b0;
import vb.i;

/* loaded from: classes.dex */
public class a implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f8000a;

    public a(d dVar) {
        this.f8000a = dVar;
    }

    public void a(cc.c cVar, Thread thread, Throwable th) {
        d dVar = this.f8000a;
        synchronized (dVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                b0.a(dVar.d.c(new i(dVar, System.currentTimeMillis(), th, thread, cVar)));
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }
}
