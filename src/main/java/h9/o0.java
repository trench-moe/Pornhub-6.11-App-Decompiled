package h9;

import android.app.PendingIntent;
import android.os.Bundle;

/* loaded from: classes2.dex */
public abstract class o0 extends x0<Boolean> {
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f10363e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f10364f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(b bVar, int i10, Bundle bundle) {
        super(bVar, Boolean.TRUE);
        this.f10364f = bVar;
        this.d = i10;
        this.f10363e = bundle;
    }

    @Override // h9.x0
    public final /* bridge */ /* synthetic */ void a(Boolean bool) {
        PendingIntent pendingIntent = null;
        if (this.d == 0) {
            if (e()) {
                return;
            }
            this.f10364f.zzp(1, null);
            d(new c9.b(8, null));
            return;
        }
        this.f10364f.zzp(1, null);
        Bundle bundle = this.f10363e;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable(b.KEY_PENDING_INTENT);
        }
        d(new c9.b(this.d, pendingIntent));
    }

    @Override // h9.x0
    public final void b() {
    }

    public abstract void d(c9.b bVar);

    public abstract boolean e();
}
