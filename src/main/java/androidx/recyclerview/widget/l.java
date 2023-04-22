package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.Objects;

/* loaded from: classes.dex */
public class l extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h.d f3036a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3037b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3038c;
    public final /* synthetic */ h d;

    public l(h hVar, h.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = hVar;
        this.f3036a = dVar;
        this.f3037b = viewPropertyAnimator;
        this.f3038c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3037b.setListener(null);
        this.f3038c.setAlpha(1.0f);
        this.f3038c.setTranslationX(0.0f);
        this.f3038c.setTranslationY(0.0f);
        this.d.d(this.f3036a.f3005a);
        this.d.f2998r.remove(this.f3036a.f3005a);
        this.d.p();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        h hVar = this.d;
        RecyclerView.z zVar = this.f3036a.f3005a;
        Objects.requireNonNull(hVar);
    }
}
