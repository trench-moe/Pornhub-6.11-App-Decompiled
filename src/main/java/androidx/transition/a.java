package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;
import androidx.transition.ChangeTransform;
import com.app.pornhub.R;
import u1.u;

/* loaded from: classes.dex */
public class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3236a;

    /* renamed from: b  reason: collision with root package name */
    public Matrix f3237b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f3238c;
    public final /* synthetic */ Matrix d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ View f3239e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ChangeTransform.e f3240f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ ChangeTransform.d f3241g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ ChangeTransform f3242h;

    public a(ChangeTransform changeTransform, boolean z10, Matrix matrix, View view, ChangeTransform.e eVar, ChangeTransform.d dVar) {
        this.f3242h = changeTransform;
        this.f3238c = z10;
        this.d = matrix;
        this.f3239e = view;
        this.f3240f = eVar;
        this.f3241g = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f3236a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (!this.f3236a) {
            if (this.f3238c && this.f3242h.P) {
                this.f3237b.set(this.d);
                this.f3239e.setTag(R.id.transition_transform, this.f3237b);
                this.f3240f.a(this.f3239e);
                u.f15511a.e(this.f3239e, null);
                this.f3240f.a(this.f3239e);
            }
            this.f3239e.setTag(R.id.transition_transform, null);
            this.f3239e.setTag(R.id.parent_matrix, null);
        }
        u.f15511a.e(this.f3239e, null);
        this.f3240f.a(this.f3239e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationPause(Animator animator) {
        this.f3237b.set(this.f3241g.f3196a);
        this.f3239e.setTag(R.id.transition_transform, this.f3237b);
        this.f3240f.a(this.f3239e);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public void onAnimationResume(Animator animator) {
        ChangeTransform.N(this.f3239e);
    }
}
