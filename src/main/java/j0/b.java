package j0;

import d0.f;
import e0.e;

/* loaded from: classes2.dex */
public class b implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t3.a f11095c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ int f11096f;

    public b(c cVar, t3.a aVar, int i10) {
        this.f11095c = aVar;
        this.f11096f = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        t3.a aVar = this.f11095c;
        int i10 = this.f11096f;
        f.c cVar = ((e.a) aVar).f8975u;
        if (cVar != null) {
            cVar.d(i10);
        }
    }
}
