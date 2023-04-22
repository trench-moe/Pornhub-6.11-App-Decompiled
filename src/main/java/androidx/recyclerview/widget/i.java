package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.z f3020a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3021b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3022c;
    public final /* synthetic */ h d;

    public i(h hVar, RecyclerView.z zVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = hVar;
        this.f3020a = zVar;
        this.f3021b = viewPropertyAnimator;
        this.f3022c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3021b.setListener(null);
        this.f3022c.setAlpha(1.0f);
        this.d.d(this.f3020a);
        this.d.f2997q.remove(this.f3020a);
        this.d.p();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.d);
    }
}
