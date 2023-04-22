package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.Objects;

/* loaded from: classes.dex */
public class m extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h.d f3039a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f3040b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f3041c;
    public final /* synthetic */ h d;

    public m(h hVar, h.d dVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = hVar;
        this.f3039a = dVar;
        this.f3040b = viewPropertyAnimator;
        this.f3041c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        this.f3040b.setListener(null);
        this.f3041c.setAlpha(1.0f);
        this.f3041c.setTranslationX(0.0f);
        this.f3041c.setTranslationY(0.0f);
        this.d.d(this.f3039a.f3006b);
        this.d.f2998r.remove(this.f3039a.f3006b);
        this.d.p();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        h hVar = this.d;
        RecyclerView.z zVar = this.f3039a.f3006b;
        Objects.requireNonNull(hVar);
    }
}
