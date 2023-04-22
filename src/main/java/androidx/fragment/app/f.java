package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.c;

/* loaded from: classes.dex */
public class f implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2122a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2123b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c.b f2124c;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f2122a.endViewTransition(fVar.f2123b);
            f.this.f2124c.a();
        }
    }

    public f(c cVar, ViewGroup viewGroup, View view, c.b bVar) {
        this.f2122a = viewGroup;
        this.f2123b = view;
        this.f2124c = bVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        this.f2122a.post(new a());
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
    }
}
