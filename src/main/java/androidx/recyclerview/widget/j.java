package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.z f3028a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f3029b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3030c;
    public final /* synthetic */ h d;

    public j(h hVar, RecyclerView.z zVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.d = hVar;
        this.f3028a = zVar;
        this.f3029b = view;
        this.f3030c = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f3029b.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3030c.setListener(null);
        this.d.d(this.f3028a);
        this.d.f2995o.remove(this.f3028a);
        this.d.p();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.d);
    }
}
