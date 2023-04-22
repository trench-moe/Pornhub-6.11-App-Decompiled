package vb;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class n implements Callable<ea.g<Void>> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ cc.c f16146c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o f16147f;

    public n(o oVar, cc.c cVar) {
        this.f16147f = oVar;
        this.f16146c = cVar;
    }

    @Override // java.util.concurrent.Callable
    public ea.g<Void> call() {
        return o.a(this.f16147f, this.f16146c);
    }
}
