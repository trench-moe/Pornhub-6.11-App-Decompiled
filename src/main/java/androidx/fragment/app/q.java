package androidx.fragment.app;

import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.p0;
import androidx.fragment.app.y;

/* loaded from: classes.dex */
public class q implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2232a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Fragment f2233b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p0.a f2234c;
    public final /* synthetic */ i0.b d;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (q.this.f2233b.o() != null) {
                q.this.f2233b.x0(null);
                q qVar = q.this;
                ((y.d) qVar.f2234c).a(qVar.f2233b, qVar.d);
            }
        }
    }

    public q(ViewGroup viewGroup, Fragment fragment, p0.a aVar, i0.b bVar) {
        this.f2232a = viewGroup;
        this.f2233b = fragment;
        this.f2234c = aVar;
        this.d = bVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f2232a.post(new a());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
