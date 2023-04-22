package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import u1.q;

/* loaded from: classes.dex */
public class ChangeScroll extends Transition {
    public static final String[] P = {"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void M(q qVar) {
        qVar.f15500a.put("android:changeScroll:x", Integer.valueOf(qVar.f15501b.getScrollX()));
        qVar.f15500a.put("android:changeScroll:y", Integer.valueOf(qVar.f15501b.getScrollY()));
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
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (qVar != null && qVar2 != null) {
            View view = qVar2.f15501b;
            int intValue = ((Integer) qVar.f15500a.get("android:changeScroll:x")).intValue();
            int intValue2 = ((Integer) qVar2.f15500a.get("android:changeScroll:x")).intValue();
            int intValue3 = ((Integer) qVar.f15500a.get("android:changeScroll:y")).intValue();
            int intValue4 = ((Integer) qVar2.f15500a.get("android:changeScroll:y")).intValue();
            if (intValue != intValue2) {
                view.setScrollX(intValue);
                objectAnimator = ObjectAnimator.ofInt(view, "scrollX", intValue, intValue2);
            } else {
                objectAnimator = null;
            }
            if (intValue3 != intValue4) {
                view.setScrollY(intValue3);
                objectAnimator2 = ObjectAnimator.ofInt(view, "scrollY", intValue3, intValue4);
            }
            return e.a(objectAnimator, objectAnimator2);
        }
        return null;
    }

    @Override // androidx.transition.Transition
    public String[] u() {
        return P;
    }
}
