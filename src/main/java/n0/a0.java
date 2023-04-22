package n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<View> f13093a;

    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b0 f13094a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f13095b;

        public a(a0 a0Var, b0 b0Var, View view) {
            this.f13094a = b0Var;
            this.f13095b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f13094a.b(this.f13095b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f13094a.d(this.f13095b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f13094a.l(this.f13095b);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c0 f13096a;

        public b(a0 a0Var, c0 c0Var, View view) {
            this.f13096a = c0Var;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) androidx.appcompat.app.f.this.d.getParent()).invalidate();
        }
    }

    public a0(View view) {
        this.f13093a = new WeakReference<>(view);
    }

    public a0 a(float f10) {
        View view = this.f13093a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void b() {
        View view = this.f13093a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public a0 c(long j10) {
        View view = this.f13093a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public a0 d(b0 b0Var) {
        View view = this.f13093a.get();
        if (view != null) {
            e(view, b0Var);
        }
        return this;
    }

    public final void e(View view, b0 b0Var) {
        if (b0Var != null) {
            view.animate().setListener(new a(this, b0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public a0 f(c0 c0Var) {
        View view = this.f13093a.get();
        if (view != null) {
            view.animate().setUpdateListener(c0Var != null ? new b(this, c0Var, view) : null);
        }
        return this;
    }

    public a0 g(float f10) {
        View view = this.f13093a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
