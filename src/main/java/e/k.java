package e;

import android.view.View;
import n0.a0;
import n0.x;

/* loaded from: classes.dex */
public class k implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.d f8934c;

    /* loaded from: classes.dex */
    public class a extends cb.e {
        public a() {
        }

        @Override // n0.b0
        public void d(View view) {
            k.this.f8934c.E.setAlpha(1.0f);
            k.this.f8934c.H.d(null);
            k.this.f8934c.H = null;
        }

        @Override // cb.e, n0.b0
        public void l(View view) {
            k.this.f8934c.E.setVisibility(0);
        }
    }

    public k(androidx.appcompat.app.d dVar) {
        this.f8934c = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.appcompat.app.d dVar = this.f8934c;
        dVar.F.showAtLocation(dVar.E, 55, 0, 0);
        this.f8934c.K();
        if (this.f8934c.X()) {
            this.f8934c.E.setAlpha(0.0f);
            androidx.appcompat.app.d dVar2 = this.f8934c;
            a0 b10 = x.b(dVar2.E);
            b10.a(1.0f);
            dVar2.H = b10;
            a0 a0Var = this.f8934c.H;
            a aVar = new a();
            View view = a0Var.f13093a.get();
            if (view != null) {
                a0Var.e(view, aVar);
            }
        } else {
            this.f8934c.E.setAlpha(1.0f);
            this.f8934c.E.setVisibility(0);
        }
    }
}
