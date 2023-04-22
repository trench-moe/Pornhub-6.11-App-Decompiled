package f3;

/* loaded from: classes.dex */
public final class e implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9373a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a f9374b;

    public /* synthetic */ e(ie.a aVar, int i10) {
        this.f9373a = i10;
        this.f9374b = aVar;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f9373a) {
            case 0:
                return new d((b3.e) this.f9374b.get());
            case 1:
                return new k((b3.e) this.f9374b.get());
            case 2:
                return new p((b3.e) this.f9374b.get());
            case 3:
                return new s((b3.e) this.f9374b.get());
            case 4:
                return new i3.c((b3.j) this.f9374b.get());
            case 5:
                return new j3.b((b3.k) this.f9374b.get());
            case 6:
                return new k3.a((b3.i) this.f9374b.get());
            case 7:
                return new k3.c((b3.i) this.f9374b.get());
            default:
                return new k3.e((b3.i) this.f9374b.get());
        }
    }
}
