package n1;

import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.u;
import java.util.Objects;

/* loaded from: classes2.dex */
public class b implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f13183c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ i f13184f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f13185j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ i f13186m;
    public final /* synthetic */ Runnable n;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ n1.a f13187t;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ n.d f13188c;

        public a(n.d dVar) {
            this.f13188c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            int max;
            b bVar = b.this;
            n1.a aVar = bVar.f13187t;
            if (aVar.f13180g == bVar.f13185j) {
                i<T> iVar = bVar.f13186m;
                i iVar2 = bVar.f13184f;
                n.d dVar = this.f13188c;
                int i10 = bVar.f13183c.n;
                Runnable runnable = bVar.n;
                i<T> iVar3 = aVar.f13179f;
                if (iVar3 == 0 || aVar.f13178e != null) {
                    throw new IllegalStateException("must be in snapshot state to apply diff");
                }
                aVar.f13178e = iVar;
                aVar.f13179f = null;
                u uVar = aVar.f13175a;
                k<T> kVar = iVar3.f13227m;
                k<T> kVar2 = iVar.f13227m;
                int g10 = kVar.g();
                int g11 = kVar2.g();
                int e10 = kVar.e();
                int e11 = kVar2.e();
                if (g10 == 0 && g11 == 0 && e10 == 0 && e11 == 0) {
                    dVar.b(uVar);
                } else {
                    if (g10 > g11) {
                        int i11 = g10 - g11;
                        uVar.c(kVar.size() - i11, i11);
                    } else if (g10 < g11) {
                        uVar.b(kVar.size(), g11 - g10);
                    }
                    if (e10 > e11) {
                        uVar.c(0, e10 - e11);
                    } else if (e10 < e11) {
                        uVar.b(0, e11 - e10);
                    }
                    if (e11 != 0) {
                        dVar.b(new m(e11, uVar));
                    } else {
                        dVar.b(uVar);
                    }
                }
                iVar.e(iVar2, aVar.f13181h);
                if (!aVar.f13178e.isEmpty()) {
                    k<T> kVar3 = iVar3.f13227m;
                    k<T> kVar4 = iVar2.f13227m;
                    int e12 = kVar3.e();
                    int i12 = i10 - e12;
                    int size = (kVar3.size() - e12) - kVar3.g();
                    if (i12 >= 0 && i12 < size) {
                        for (int i13 = 0; i13 < 30; i13++) {
                            int i14 = ((i13 / 2) * (i13 % 2 == 1 ? -1 : 1)) + i12;
                            if (i14 >= 0 && i14 < kVar3.f13242t) {
                                try {
                                    int a10 = dVar.a(i14);
                                    if (a10 != -1) {
                                        max = a10 + kVar4.f13238c;
                                        break;
                                    }
                                } catch (IndexOutOfBoundsException unused) {
                                }
                            }
                        }
                    }
                    max = Math.max(0, Math.min(i10, kVar4.size() - 1));
                    i<T> iVar4 = aVar.f13178e;
                    iVar4.q(Math.max(0, Math.min(iVar4.size() - 1, max)));
                }
                aVar.b(iVar3, aVar.f13178e, runnable);
            }
        }
    }

    public b(n1.a aVar, i iVar, i iVar2, int i10, i iVar3, Runnable runnable) {
        this.f13187t = aVar;
        this.f13183c = iVar;
        this.f13184f = iVar2;
        this.f13185j = i10;
        this.f13186m = iVar3;
        this.n = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        k<T> kVar = this.f13183c.f13227m;
        k<T> kVar2 = this.f13184f.f13227m;
        n.e<T> eVar = this.f13187t.f13176b.f2951b;
        int e10 = kVar.e();
        n.d a10 = androidx.recyclerview.widget.n.a(new l(kVar, e10, kVar2, eVar, (kVar.size() - e10) - kVar.g(), (kVar2.size() - kVar2.e()) - kVar2.g()), true);
        Objects.requireNonNull(this.f13187t);
        l.a.s().f12146a.q(new a(a10));
    }
}
