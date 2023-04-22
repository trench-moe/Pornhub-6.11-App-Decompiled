package e9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import d9.d;

/* loaded from: classes.dex */
public final class o implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f9232a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f9233b;

    public o(p pVar, BasePendingResult basePendingResult) {
        this.f9233b = pVar;
        this.f9232a = basePendingResult;
    }

    @Override // d9.d.a
    public final void a(Status status) {
        this.f9233b.f9234a.remove(this.f9232a);
    }
}
