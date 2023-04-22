package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import androidx.transition.Transition;
import com.app.pornhub.R;
import u1.q;

/* loaded from: classes.dex */
public class f {

    /* loaded from: classes.dex */
    public static class a extends AnimatorListenerAdapter implements Transition.d {

        /* renamed from: a  reason: collision with root package name */
        public final View f3268a;

        /* renamed from: b  reason: collision with root package name */
        public final View f3269b;

        /* renamed from: c  reason: collision with root package name */
        public final int f3270c;
        public final int d;

        /* renamed from: e  reason: collision with root package name */
        public int[] f3271e;

        /* renamed from: f  reason: collision with root package name */
        public float f3272f;

        /* renamed from: g  reason: collision with root package name */
        public float f3273g;

        /* renamed from: h  reason: collision with root package name */
        public final float f3274h;

        /* renamed from: i  reason: collision with root package name */
        public final float f3275i;

        public a(View view, View view2, int i10, int i11, float f10, float f11) {
            this.f3269b = view;
            this.f3268a = view2;
            this.f3270c = i10 - Math.round(view.getTranslationX());
            this.d = i11 - Math.round(view.getTranslationY());
            this.f3274h = f10;
            this.f3275i = f11;
            int[] iArr = (int[]) view2.getTag(R.id.transition_position);
            this.f3271e = iArr;
            if (iArr != null) {
                view2.setTag(R.id.transition_position, null);
            }
        }

        @Override // androidx.transition.Transition.d
        public void a(Transition transition) {
        }

        @Override // androidx.transition.Transition.d
        public void b(Transition transition) {
        }

        @Override // androidx.transition.Transition.d
        public void c(Transition transition) {
            this.f3269b.setTranslationX(this.f3274h);
            this.f3269b.setTranslationY(this.f3275i);
            transition.A(this);
        }

        @Override // androidx.transition.Transition.d
        public void d(Transition transition) {
        }

        @Override // androidx.transition.Transition.d
        public void e(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f3271e == null) {
                this.f3271e = new int[2];
            }
            this.f3271e[0] = Math.round(this.f3269b.getTranslationX() + this.f3270c);
            this.f3271e[1] = Math.round(this.f3269b.getTranslationY() + this.d);
            this.f3268a.setTag(R.id.transition_position, this.f3271e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f3272f = this.f3269b.getTranslationX();
            this.f3273g = this.f3269b.getTranslationY();
            this.f3269b.setTranslationX(this.f3274h);
            this.f3269b.setTranslationY(this.f3275i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f3269b.setTranslationX(this.f3272f);
            this.f3269b.setTranslationY(this.f3273g);
        }
    }

    public static Animator a(View view, q qVar, int i10, int i11, float f10, float f11, float f12, float f13, TimeInterpolator timeInterpolator, Transition transition) {
        float f14;
        float f15;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) qVar.f15501b.getTag(R.id.transition_position);
        if (iArr != null) {
            f14 = (iArr[0] - i10) + translationX;
            f15 = (iArr[1] - i11) + translationY;
        } else {
            f14 = f10;
            f15 = f11;
        }
        int round = Math.round(f14 - translationX) + i10;
        int round2 = Math.round(f15 - translationY) + i11;
        view.setTranslationX(f14);
        view.setTranslationY(f15);
        if (f14 == f12 && f15 == f13) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat(View.TRANSLATION_X, f14, f12), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, f15, f13));
        a aVar = new a(view, qVar.f15501b, round, round2, translationX, translationY);
        transition.a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        ofPropertyValuesHolder.addPauseListener(aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
