package w5;

import java.util.Objects;
import w5.o;

/* loaded from: classes2.dex */
public class p implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f16432c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ o.d.a f16433f;

    public p(o.d.a aVar, boolean z10) {
        this.f16433f = aVar;
        this.f16432c = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        o.d.a aVar = this.f16433f;
        boolean z10 = this.f16432c;
        Objects.requireNonNull(aVar);
        d6.l.a();
        o.d dVar = o.d.this;
        boolean z11 = dVar.f16423a;
        dVar.f16423a = z10;
        if (z11 != z10) {
            dVar.f16424b.a(z10);
        }
    }
}
