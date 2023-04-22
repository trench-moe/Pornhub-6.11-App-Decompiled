package ta;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import cb.g;
import cb.k;
import com.app.pornhub.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes2.dex */
public class e extends com.google.android.material.floatingactionbutton.e {

    /* loaded from: classes2.dex */
    public static class a extends g {
        public a(k kVar) {
            super(kVar);
        }

        @Override // cb.g, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    public e(FloatingActionButton floatingActionButton, bb.b bVar) {
        super(floatingActionButton, bVar);
    }

    @Override // com.google.android.material.floatingactionbutton.e
    public float e() {
        return this.f7488w.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.e
    public void f(Rect rect) {
        if (FloatingActionButton.this.B) {
            super.f(rect);
        } else if (u()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f7477k - this.f7488w.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.e
    public void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        Drawable drawable;
        k kVar = this.f7468a;
        Objects.requireNonNull(kVar);
        a aVar = new a(kVar);
        this.f7469b = aVar;
        aVar.setTintList(colorStateList);
        if (mode != null) {
            this.f7469b.setTintMode(mode);
        }
        this.f7469b.o(this.f7488w.getContext());
        if (i10 > 0) {
            Context context = this.f7488w.getContext();
            k kVar2 = this.f7468a;
            Objects.requireNonNull(kVar2);
            b bVar = new b(kVar2);
            int b10 = c0.a.b(context, R.color.design_fab_stroke_top_outer_color);
            int b11 = c0.a.b(context, R.color.design_fab_stroke_top_inner_color);
            int b12 = c0.a.b(context, R.color.design_fab_stroke_end_inner_color);
            int b13 = c0.a.b(context, R.color.design_fab_stroke_end_outer_color);
            bVar.f15395i = b10;
            bVar.f15396j = b11;
            bVar.f15397k = b12;
            bVar.f15398l = b13;
            float f10 = i10;
            if (bVar.f15394h != f10) {
                bVar.f15394h = f10;
                bVar.f15389b.setStrokeWidth(f10 * 1.3333f);
                bVar.n = true;
                bVar.invalidateSelf();
            }
            bVar.b(colorStateList);
            this.d = bVar;
            b bVar2 = this.d;
            Objects.requireNonNull(bVar2);
            g gVar = this.f7469b;
            Objects.requireNonNull(gVar);
            drawable = new LayerDrawable(new Drawable[]{bVar2, gVar});
        } else {
            this.d = null;
            drawable = this.f7469b;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(ab.b.c(colorStateList2), drawable, null);
        this.f7470c = rippleDrawable;
        this.f7471e = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.e
    public void j() {
    }

    @Override // com.google.android.material.floatingactionbutton.e
    public void k() {
        w();
    }

    @Override // com.google.android.material.floatingactionbutton.e
    public void l(int[] iArr) {
        if (Build.VERSION.SDK_INT == 21) {
            if (this.f7488w.isEnabled()) {
                this.f7488w.setElevation(this.f7474h);
                if (this.f7488w.isPressed()) {
                    this.f7488w.setTranslationZ(this.f7476j);
                    return;
                }
                if (!this.f7488w.isFocused() && !this.f7488w.isHovered()) {
                    this.f7488w.setTranslationZ(0.0f);
                    return;
                }
                this.f7488w.setTranslationZ(this.f7475i);
                return;
            }
            this.f7488w.setElevation(0.0f);
            this.f7488w.setTranslationZ(0.0f);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.e
    public void m(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21) {
            this.f7488w.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.e.E, y(f10, f12));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.e.F, y(f10, f11));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.e.G, y(f10, f11));
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.e.H, y(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f7488w, "elevation", f10).setDuration(0L));
            if (i10 >= 22 && i10 <= 24) {
                FloatingActionButton floatingActionButton = this.f7488w;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, floatingActionButton.getTranslationZ()).setDuration(100L));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f7488w, View.TRANSLATION_Z, 0.0f).setDuration(100L));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.e.D);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.e.I, animatorSet);
            stateListAnimator.addState(com.google.android.material.floatingactionbutton.e.J, y(0.0f, 0.0f));
            this.f7488w.setStateListAnimator(stateListAnimator);
        }
        if (s()) {
            w();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.e
    public void q(ColorStateList colorStateList) {
        Drawable drawable = this.f7470c;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(ab.b.c(colorStateList));
        } else if (drawable != null) {
            drawable.setTintList(ab.b.c(colorStateList));
        }
    }

    @Override // com.google.android.material.floatingactionbutton.e
    public boolean s() {
        if (!FloatingActionButton.this.B && u()) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.material.floatingactionbutton.e
    public void v() {
    }

    public final Animator y(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f7488w, "elevation", f10).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f7488w, View.TRANSLATION_Z, f11).setDuration(100L));
        animatorSet.setInterpolator(com.google.android.material.floatingactionbutton.e.D);
        return animatorSet;
    }
}
