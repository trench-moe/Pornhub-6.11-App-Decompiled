package androidx.fragment.app;

import androidx.fragment.app.SpecialEffectsController;

/* loaded from: classes.dex */
public class h implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f2140c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SpecialEffectsController.Operation f2141f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ boolean f2142j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ p.a f2143m;

    public h(c cVar, SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z10, p.a aVar) {
        this.f2140c = operation;
        this.f2141f = operation2;
        this.f2142j = z10;
        this.f2143m = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        p0.c(this.f2140c.f2054c, this.f2141f.f2054c, this.f2142j, this.f2143m, false);
    }
}
