package g7;

import c7.j;
import c7.u;
import c7.v;
import c7.w;

/* loaded from: classes2.dex */
public final class d implements j {

    /* renamed from: c  reason: collision with root package name */
    public final long f9867c;

    /* renamed from: f  reason: collision with root package name */
    public final j f9868f;

    /* loaded from: classes2.dex */
    public class a implements u {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u f9869a;

        public a(u uVar) {
            this.f9869a = uVar;
        }

        @Override // c7.u
        public boolean d() {
            return this.f9869a.d();
        }

        @Override // c7.u
        public u.a i(long j10) {
            u.a i10 = this.f9869a.i(j10);
            v vVar = i10.f3829a;
            long j11 = vVar.f3834a;
            long j12 = vVar.f3835b;
            long j13 = d.this.f9867c;
            v vVar2 = new v(j11, j12 + j13);
            v vVar3 = i10.f3830b;
            return new u.a(vVar2, new v(vVar3.f3834a, vVar3.f3835b + j13));
        }

        @Override // c7.u
        public long j() {
            return this.f9869a.j();
        }
    }

    public d(long j10, j jVar) {
        this.f9867c = j10;
        this.f9868f = jVar;
    }

    @Override // c7.j
    public void g(u uVar) {
        this.f9868f.g(new a(uVar));
    }

    @Override // c7.j
    public void l() {
        this.f9868f.l();
    }

    @Override // c7.j
    public w r(int i10, int i11) {
        return this.f9868f.r(i10, i11);
    }
}
