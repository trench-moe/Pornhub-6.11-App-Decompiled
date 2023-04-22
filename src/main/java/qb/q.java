package qb;

import mc.a;

/* loaded from: classes2.dex */
public class q<T> implements mc.b<T>, mc.a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f14482c = 0;

    /* renamed from: a  reason: collision with root package name */
    public a.InterfaceC0215a<T> f14483a;

    /* renamed from: b  reason: collision with root package name */
    public volatile mc.b<T> f14484b;

    public q(a.InterfaceC0215a<T> interfaceC0215a, mc.b<T> bVar) {
        this.f14483a = interfaceC0215a;
        this.f14484b = bVar;
    }

    public void a(a.InterfaceC0215a<T> interfaceC0215a) {
        mc.b<T> bVar;
        mc.b<T> bVar2 = this.f14484b;
        p pVar = p.f14481a;
        if (bVar2 != pVar) {
            interfaceC0215a.b(bVar2);
            return;
        }
        mc.b<T> bVar3 = null;
        synchronized (this) {
            bVar = this.f14484b;
            if (bVar != pVar) {
                bVar3 = bVar;
            } else {
                this.f14483a = new r3.b(this.f14483a, interfaceC0215a, 4);
            }
        }
        if (bVar3 != null) {
            interfaceC0215a.b(bVar);
        }
    }

    @Override // mc.b
    public T get() {
        return this.f14484b.get();
    }
}
