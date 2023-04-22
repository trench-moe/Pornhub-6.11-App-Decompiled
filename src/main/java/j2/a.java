package j2;

import e2.a;

/* loaded from: classes2.dex */
public class a implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.airbnb.lottie.model.layer.a f11364a;

    public a(com.airbnb.lottie.model.layer.a aVar) {
        this.f11364a = aVar;
    }

    @Override // e2.a.b
    public void a() {
        com.airbnb.lottie.model.layer.a aVar = this.f11364a;
        boolean z10 = aVar.f4230q.k() == 1.0f;
        if (z10 != aVar.f4236w) {
            aVar.f4236w = z10;
            aVar.n.invalidateSelf();
        }
    }
}
