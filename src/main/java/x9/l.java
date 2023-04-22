package x9;

import aa.d;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public abstract class l extends f<d.b> {

    /* renamed from: a  reason: collision with root package name */
    public final h f18090a;

    public l(d9.c cVar) {
        super(cVar);
        this.f18090a = new k(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ d9.f createFailedResult(Status status) {
        return new a(status, null);
    }
}
