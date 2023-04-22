package vb;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class k implements Callable<Void> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f16141c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ com.google.firebase.crashlytics.internal.common.d f16142f;

    public k(com.google.firebase.crashlytics.internal.common.d dVar, String str) {
        this.f16142f = dVar;
        this.f16141c = str;
    }

    @Override // java.util.concurrent.Callable
    public Void call() {
        com.google.firebase.crashlytics.internal.common.d.a(this.f16142f, this.f16141c);
        return null;
    }
}
