package n0;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: c  reason: collision with root package name */
    public final View f13151c;

    /* renamed from: f  reason: collision with root package name */
    public ViewTreeObserver f13152f;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f13153j;

    public q(View view, Runnable runnable) {
        this.f13151c = view;
        this.f13152f = view.getViewTreeObserver();
        this.f13153j = runnable;
    }

    public static q a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        q qVar = new q(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(qVar);
        view.addOnAttachStateChangeListener(qVar);
        return qVar;
    }

    public void b() {
        if (this.f13152f.isAlive()) {
            this.f13152f.removeOnPreDrawListener(this);
        } else {
            this.f13151c.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f13151c.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f13153j.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f13152f = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
