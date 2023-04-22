package com.google.firebase.crashlytics.internal.common;

import android.util.Log;
import ea.f;
import ea.g;
import ea.j;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class b implements f<dc.a, Void> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Executor f8001c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ c f8002f;

    public b(c cVar, Executor executor) {
        this.f8002f = cVar;
        this.f8001c = executor;
    }

    @Override // ea.f
    public g<Void> a(dc.a aVar) {
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return j.d(null);
        }
        d.b(d.this);
        d.this.f8014k.d(this.f8001c);
        d.this.f8017o.b(null);
        return j.d(null);
    }
}
