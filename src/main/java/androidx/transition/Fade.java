package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import d0.h;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import u1.n;
import u1.q;
import u1.u;

/* loaded from: classes.dex */
public class Fade extends Visibility {

    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3207a;

        public a(Fade fade, View view) {
            this.f3207a = view;
        }

        @Override // androidx.transition.Transition.d
        public void c(Transition transition) {
            View view = this.f3207a;
            mb.a aVar = u.f15511a;
            aVar.g(view, 1.0f);
            aVar.b(this.f3207a);
            transition.A(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f3208a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3209b = false;

        public b(View view) {
            this.f3208a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.f15511a.g(this.f3208a, 1.0f);
            if (this.f3209b) {
                this.f3208a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            View view = this.f3208a;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if (x.d.h(view) && this.f3208a.getLayerType() == 0) {
                this.f3209b = true;
                this.f3208a.setLayerType(2, null);
            }
        }
    }

    public Fade() {
    }

    public Fade(int i10) {
        Q(i10);
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.d);
        Q(h.d(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, this.P));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.transition.Visibility
    public Animator O(ViewGroup viewGroup, View view, q qVar, q qVar2) {
        Float f10;
        float floatValue = (qVar == null || (f10 = (Float) qVar.f15500a.get("android:fade:transitionAlpha")) == null) ? 0.0f : f10.floatValue();
        return R(view, floatValue != 1.0f ? floatValue : 0.0f, 1.0f);
    }

    @Override // androidx.transition.Visibility
    public Animator P(ViewGroup viewGroup, View view, q qVar, q qVar2) {
        u.f15511a.d(view);
        Float f10 = (Float) qVar.f15500a.get("android:fade:transitionAlpha");
        return R(view, f10 != null ? f10.floatValue() : 1.0f, 0.0f);
    }

    public final Animator R(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        u.f15511a.g(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, u.f15512b, f11);
        ofFloat.addListener(new b(view));
        a(new a(this, view));
        return ofFloat;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void i(q qVar) {
        M(qVar);
        qVar.f15500a.put("android:fade:transitionAlpha", Float.valueOf(u.a(qVar.f15501b)));
    }
}
