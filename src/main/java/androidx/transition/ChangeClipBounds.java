package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import u1.k;
import u1.q;
import u1.u;

/* loaded from: classes.dex */
public class ChangeClipBounds extends Transition {
    public static final String[] P = {"android:clipBounds:clip"};

    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3192a;

        public a(ChangeClipBounds changeClipBounds, View view) {
            this.f3192a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            View view = this.f3192a;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.f.c(view, null);
        }
    }

    public ChangeClipBounds() {
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void M(q qVar) {
        View view = qVar.f15501b;
        if (view.getVisibility() == 8) {
            return;
        }
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        Rect a10 = x.f.a(view);
        qVar.f15500a.put("android:clipBounds:clip", a10);
        if (a10 == null) {
            qVar.f15500a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
        }
    }

    @Override // androidx.transition.Transition
    public void d(q qVar) {
        M(qVar);
    }

    @Override // androidx.transition.Transition
    public void i(q qVar) {
        M(qVar);
    }

    @Override // androidx.transition.Transition
    public Animator n(ViewGroup viewGroup, q qVar, q qVar2) {
        ObjectAnimator objectAnimator = null;
        if (qVar != null && qVar2 != null && qVar.f15500a.containsKey("android:clipBounds:clip") && qVar2.f15500a.containsKey("android:clipBounds:clip")) {
            Rect rect = (Rect) qVar.f15500a.get("android:clipBounds:clip");
            Rect rect2 = (Rect) qVar2.f15500a.get("android:clipBounds:clip");
            boolean z10 = rect2 == null;
            if (rect == null && rect2 == null) {
                return null;
            }
            if (rect == null) {
                rect = (Rect) qVar.f15500a.get("android:clipBounds:bounds");
            } else if (rect2 == null) {
                rect2 = (Rect) qVar2.f15500a.get("android:clipBounds:bounds");
            }
            if (rect.equals(rect2)) {
                return null;
            }
            View view = qVar2.f15501b;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.f.c(view, rect);
            objectAnimator = ObjectAnimator.ofObject(qVar2.f15501b, (Property<View, V>) u.f15513c, (TypeEvaluator) new k(new Rect()), (Object[]) new Rect[]{rect, rect2});
            if (z10) {
                objectAnimator.addListener(new a(this, qVar2.f15501b));
            }
        }
        return objectAnimator;
    }

    @Override // androidx.transition.Transition
    public String[] u() {
        return P;
    }
}
