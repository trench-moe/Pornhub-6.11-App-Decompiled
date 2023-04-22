package l8;

import k8.c0;
import l8.r;
import mc.a;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f12724c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f12725f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f12726j;

    public /* synthetic */ m(Object obj, Object obj2, int i10) {
        this.f12724c = i10;
        this.f12725f = obj;
        this.f12726j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.InterfaceC0215a<T> interfaceC0215a;
        switch (this.f12724c) {
            case 0:
                r rVar = ((r.a) this.f12725f).f12741b;
                int i10 = c0.f11939a;
                rVar.c((String) this.f12726j);
                return;
            default:
                qb.q qVar = (qb.q) this.f12725f;
                mc.b<T> bVar = (mc.b) this.f12726j;
                if (qVar.f14484b != qb.p.f14481a) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (qVar) {
                    interfaceC0215a = qVar.f14483a;
                    qVar.f14483a = null;
                    qVar.f14484b = bVar;
                }
                interfaceC0215a.b(bVar);
                return;
        }
    }
}
