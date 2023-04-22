package a9;

import com.google.android.gms.common.api.Status;
import u8.e;

/* loaded from: classes.dex */
public final class z implements e.a {

    /* renamed from: c  reason: collision with root package name */
    public final Status f316c;

    /* renamed from: f  reason: collision with root package name */
    public final u8.d f317f;

    /* renamed from: j  reason: collision with root package name */
    public final String f318j;

    /* renamed from: m  reason: collision with root package name */
    public final String f319m;
    public final boolean n;

    public z(Status status, u8.d dVar, String str, String str2, boolean z10) {
        this.f316c = status;
        this.f317f = dVar;
        this.f318j = str;
        this.f319m = str2;
        this.n = z10;
    }

    @Override // u8.e.a
    public final u8.d S() {
        return this.f317f;
    }

    @Override // d9.f
    public final Status V() {
        return this.f316c;
    }

    @Override // u8.e.a
    public final boolean e() {
        return this.n;
    }

    @Override // u8.e.a
    public final String g0() {
        return this.f319m;
    }

    @Override // u8.e.a
    public final String h() {
        return this.f318j;
    }
}
