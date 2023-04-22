package vb;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class l implements Callable<Void> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f16143c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.common.d f16144f;

    public l(com.google.firebase.crashlytics.internal.common.d dVar, long j10) {
        this.f16144f = dVar;
        this.f16143c = j10;
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f16143c);
        this.f16144f.f8013j.f("_ae", bundle);
        return null;
    }
}
