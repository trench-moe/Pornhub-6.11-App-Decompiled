package x9;

import aa.d;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public final class a implements d.b {

    /* renamed from: c  reason: collision with root package name */
    public final Status f18083c;

    /* renamed from: f  reason: collision with root package name */
    public final aa.k f18084f;

    public a(Status status, aa.k kVar) {
        this.f18083c = status;
        this.f18084f = kVar;
    }

    @Override // d9.f
    public final Status V() {
        return this.f18083c;
    }

    @Override // aa.d.b
    public final String m() {
        aa.k kVar = this.f18084f;
        if (kVar == null) {
            return null;
        }
        return kVar.f334c;
    }
}
