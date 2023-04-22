package vb;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class j implements Callable<Void> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f16138c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f16139f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.common.d f16140j;

    public j(com.google.firebase.crashlytics.internal.common.d dVar, long j10, String str) {
        this.f16140j = dVar;
        this.f16138c = j10;
        this.f16139f = str;
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        com.google.firebase.crashlytics.internal.common.e eVar = this.f16140j.f8015l;
        if (!(eVar != null && eVar.f8023e.get())) {
            this.f16140j.f8011h.f17437b.c(this.f16138c, this.f16139f);
        }
        return null;
    }
}
