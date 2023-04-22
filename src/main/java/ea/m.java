package ea;

import java.util.concurrent.Executor;
import u8.i0;

/* loaded from: classes.dex */
public final class m implements e, d, b, p {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9287c;

    /* renamed from: f  reason: collision with root package name */
    public final Executor f9288f;

    /* renamed from: j  reason: collision with root package name */
    public final Object f9289j;

    /* renamed from: m  reason: collision with root package name */
    public Object f9290m;

    public m(Executor executor, a aVar, u uVar) {
        this.f9287c = 0;
        this.f9288f = executor;
        this.f9289j = aVar;
        this.f9290m = uVar;
    }

    public m(Executor executor, d dVar) {
        this.f9287c = 1;
        this.f9289j = new Object();
        this.f9288f = executor;
        this.f9290m = dVar;
    }

    @Override // ea.p
    public final void a() {
        switch (this.f9287c) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                synchronized (this.f9289j) {
                    this.f9290m = null;
                }
                return;
        }
    }

    @Override // ea.p
    public final void b(g gVar) {
        switch (this.f9287c) {
            case 0:
                this.f9288f.execute(new i0(this, gVar, 1));
                return;
            default:
                if (gVar.m() || gVar.k()) {
                    return;
                }
                synchronized (this.f9289j) {
                    if (((d) this.f9290m) != null) {
                        this.f9288f.execute(new i0(this, gVar, 2));
                    }
                }
                return;
        }
    }

    @Override // ea.b
    public void l() {
        ((u) this.f9290m).q();
    }

    @Override // ea.e
    public void onSuccess(Object obj) {
        ((u) this.f9290m).p(obj);
    }

    @Override // ea.d
    public void q(Exception exc) {
        ((u) this.f9290m).o(exc);
    }
}
