package com.google.firebase.crashlytics.internal.common;

import android.util.Log;
import com.google.firebase.crashlytics.internal.common.d;
import ea.g;
import ea.j;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import vb.s;

/* loaded from: classes.dex */
public class c implements Callable<g<Void>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Boolean f8003c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d.a f8004f;

    public c(d.a aVar, Boolean bool) {
        this.f8004f = aVar;
        this.f8003c = bool;
    }

    @Override // java.util.concurrent.Callable
    public g<Void> call() {
        if (this.f8003c.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean booleanValue = this.f8003c.booleanValue();
            s sVar = d.this.f8006b;
            Objects.requireNonNull(sVar);
            if (booleanValue) {
                sVar.f16174g.b(null);
                d.a aVar = this.f8004f;
                Executor executor = d.this.d.f16124a;
                return aVar.f8018c.n(executor, new b(this, executor));
            }
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        ac.c cVar = d.this.f8009f;
        for (File file : ac.c.i(cVar.f352a.listFiles(vb.g.f16129b))) {
            file.delete();
        }
        ac.b bVar = d.this.f8014k.f16192b;
        bVar.a(bVar.f350b.d());
        bVar.a(bVar.f350b.c());
        bVar.a(bVar.f350b.b());
        d.this.f8017o.b(null);
        return j.d(null);
    }
}
