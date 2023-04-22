package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

/* loaded from: classes.dex */
public class k extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.z f3031a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f3032b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3033c;
    public final /* synthetic */ int d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3034e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ h f3035f;

    public k(h hVar, RecyclerView.z zVar, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f3035f = hVar;
        this.f3031a = zVar;
        this.f3032b = i10;
        this.f3033c = view;
        this.d = i11;
        this.f3034e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        if (this.f3032b != 0) {
            this.f3033c.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            this.f3033c.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3034e.setListener(null);
        this.f3035f.d(this.f3031a);
        this.f3035f.f2996p.remove(this.f3031a);
        this.f3035f.p();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f3035f);
    }
}
