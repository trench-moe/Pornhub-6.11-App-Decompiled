package j1;

import j1.l;

/* loaded from: classes2.dex */
public class n implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f11353c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o f11354f;

    public n(o oVar, int i10) {
        this.f11354f = oVar;
        this.f11353c = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        l.i iVar = l.e.this.f11297q;
        if (iVar != null) {
            iVar.l(this.f11353c);
        }
    }
}
