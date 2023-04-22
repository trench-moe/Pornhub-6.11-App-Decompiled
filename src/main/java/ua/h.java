package ua;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.Transition;
import java.util.Map;
import u1.q;

/* loaded from: classes2.dex */
public class h extends Transition {

    /* loaded from: classes2.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f15815a;

        public a(h hVar, TextView textView) {
            this.f15815a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f15815a.setScaleX(floatValue);
            this.f15815a.setScaleY(floatValue);
        }
    }

    public final void M(q qVar) {
        View view = qVar.f15501b;
        if (view instanceof TextView) {
            qVar.f15500a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
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
        ValueAnimator valueAnimator = null;
        if (qVar != null && qVar2 != null && (qVar.f15501b instanceof TextView)) {
            View view = qVar2.f15501b;
            if (!(view instanceof TextView)) {
                return valueAnimator;
            }
            TextView textView = (TextView) view;
            Map<String, Object> map = qVar.f15500a;
            Map<String, Object> map2 = qVar2.f15500a;
            float f10 = 1.0f;
            float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
            if (map2.get("android:textscale:scale") != null) {
                f10 = ((Float) map2.get("android:textscale:scale")).floatValue();
            }
            if (floatValue == f10) {
                return null;
            }
            valueAnimator = ValueAnimator.ofFloat(floatValue, f10);
            valueAnimator.addUpdateListener(new a(this, textView));
        }
        return valueAnimator;
    }
}
