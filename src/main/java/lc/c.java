package lc;

import android.content.Context;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import qb.r;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements qb.e {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ c f12774f = new c(0);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ c f12775j = new c(1);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f12776c;

    public /* synthetic */ c(int i10) {
        this.f12776c = i10;
    }

    @Override // qb.e
    public final Object a(qb.c cVar) {
        nc.b lambda$getComponents$0;
        switch (this.f12776c) {
            case 0:
                r rVar = (r) cVar;
                return new com.google.firebase.heartbeatinfo.a((Context) rVar.a(Context.class), rVar.e(d.class));
            default:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(cVar);
                return lambda$getComponents$0;
        }
    }
}
