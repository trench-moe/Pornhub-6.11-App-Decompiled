package j;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import n0.a0;
import n0.b0;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: c  reason: collision with root package name */
    public Interpolator f11089c;
    public b0 d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f11090e;

    /* renamed from: b  reason: collision with root package name */
    public long f11088b = -1;

    /* renamed from: f  reason: collision with root package name */
    public final cb.e f11091f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<a0> f11087a = new ArrayList<>();

    /* loaded from: classes2.dex */
    public class a extends cb.e {
        public boolean P = false;
        public int Q = 0;

        public a() {
        }

        @Override // n0.b0
        public void d(View view) {
            int i10 = this.Q + 1;
            this.Q = i10;
            if (i10 == g.this.f11087a.size()) {
                b0 b0Var = g.this.d;
                if (b0Var != null) {
                    b0Var.d(null);
                }
                this.Q = 0;
                this.P = false;
                g.this.f11090e = false;
            }
        }

        @Override // cb.e, n0.b0
        public void l(View view) {
            if (this.P) {
                return;
            }
            this.P = true;
            b0 b0Var = g.this.d;
            if (b0Var != null) {
                b0Var.l(null);
            }
        }
    }

    public void a() {
        if (this.f11090e) {
            Iterator<a0> it = this.f11087a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f11090e = false;
        }
    }

    public void b() {
        View view;
        if (this.f11090e) {
            return;
        }
        Iterator<a0> it = this.f11087a.iterator();
        while (true) {
            while (it.hasNext()) {
                a0 next = it.next();
                long j10 = this.f11088b;
                if (j10 >= 0) {
                    next.c(j10);
                }
                Interpolator interpolator = this.f11089c;
                if (interpolator != null && (view = next.f13093a.get()) != null) {
                    view.animate().setInterpolator(interpolator);
                }
                if (this.d != null) {
                    next.d(this.f11091f);
                }
                View view2 = next.f13093a.get();
                if (view2 != null) {
                    view2.animate().start();
                }
            }
            this.f11090e = true;
            return;
        }
    }
}
