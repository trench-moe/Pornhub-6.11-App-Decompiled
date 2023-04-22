package j1;

import j1.l;

/* loaded from: classes2.dex */
public class m implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f11351c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o f11352f;

    public m(o oVar, int i10) {
        this.f11352f = oVar;
        this.f11351c = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        l.i iVar = l.e.this.f11297q;
        if (iVar != null) {
            iVar.k(this.f11351c);
        }
    }
}
