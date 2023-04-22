package io.realm;

import java.io.File;
import java.util.Objects;

/* loaded from: classes2.dex */
public class q implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ File f10998c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s f10999f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f11000j;

    public q(File file, s sVar, boolean z10, String str) {
        this.f10998c = file;
        this.f10999f = sVar;
        this.f11000j = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        File file = this.f10998c;
        if (file != null) {
            RealmCache.a(this.f10999f.d, file);
        }
        if (this.f11000j) {
            Objects.requireNonNull(this.f10999f);
            Objects.requireNonNull(io.realm.internal.h.a(false));
            RealmCache.a(null, new File((String) null));
        }
    }
}
