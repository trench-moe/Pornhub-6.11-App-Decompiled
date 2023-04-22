package h9;

/* loaded from: classes2.dex */
public final class b1 extends o0 {

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ b f10281g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(b bVar, int i10) {
        super(bVar, i10, null);
        this.f10281g = bVar;
    }

    @Override // h9.o0
    public final void d(c9.b bVar) {
        if (this.f10281g.enableLocalFallback() && b.zzo(this.f10281g)) {
            b.zzk(this.f10281g, 16);
            return;
        }
        this.f10281g.zzc.a(bVar);
        this.f10281g.onConnectionFailed(bVar);
    }

    @Override // h9.o0
    public final boolean e() {
        this.f10281g.zzc.a(c9.b.n);
        return true;
    }
}
