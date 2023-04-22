package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import org.xmlpull.v1.XmlPullParser;
import u1.m;
import u1.n;
import u1.q;

/* loaded from: classes.dex */
public class Slide extends Visibility {
    public static final TimeInterpolator S = new DecelerateInterpolator();
    public static final TimeInterpolator T = new AccelerateInterpolator();
    public static final g U = new a();
    public static final g V = new b();
    public static final g W = new c();
    public static final g X = new d();
    public static final g Y = new e();
    public static final g Z = new f();
    public g R;

    /* loaded from: classes.dex */
    public static class a extends h {
        public a() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends h {
        public b() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            return x.e.d(viewGroup) == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends i {
        public c() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* loaded from: classes.dex */
    public static class d extends h {
        public d() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    public static class e extends h {
        public e() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            return x.e.d(viewGroup) == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    public static class f extends i {
        public f() {
            super(null);
        }

        @Override // androidx.transition.Slide.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* loaded from: classes.dex */
    public static abstract class h implements g {
        public h(a aVar) {
        }

        @Override // androidx.transition.Slide.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i implements g {
        public i(a aVar) {
        }

        @Override // androidx.transition.Slide.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public Slide() {
        this.R = Z;
        R(80);
    }

    public Slide(int i10) {
        this.R = Z;
        R(i10);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = Z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f15493f);
        int d10 = d0.h.d(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        R(d10);
    }

    @Override // androidx.transition.Visibility
    public Animator O(ViewGroup viewGroup, View view, q qVar, q qVar2) {
        int[] iArr = (int[]) qVar2.f15500a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return androidx.transition.f.a(view, qVar2, iArr[0], iArr[1], this.R.b(viewGroup, view), this.R.a(viewGroup, view), translationX, translationY, S, this);
    }

    @Override // androidx.transition.Visibility
    public Animator P(ViewGroup viewGroup, View view, q qVar, q qVar2) {
        int[] iArr = (int[]) qVar.f15500a.get("android:slide:screenPosition");
        return androidx.transition.f.a(view, qVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.R.b(viewGroup, view), this.R.a(viewGroup, view), T, this);
    }

    public void R(int i10) {
        if (i10 == 3) {
            this.R = U;
        } else if (i10 == 5) {
            this.R = X;
        } else if (i10 == 48) {
            this.R = W;
        } else if (i10 == 80) {
            this.R = Z;
        } else if (i10 == 8388611) {
            this.R = V;
        } else if (i10 != 8388613) {
            throw new IllegalArgumentException("Invalid slide direction");
        } else {
            this.R = Y;
        }
        m mVar = new m();
        mVar.f15488b = i10;
        this.J = mVar;
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void d(q qVar) {
        M(qVar);
        int[] iArr = new int[2];
        qVar.f15501b.getLocationOnScreen(iArr);
        qVar.f15500a.put("android:slide:screenPosition", iArr);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void i(q qVar) {
        M(qVar);
        int[] iArr = new int[2];
        qVar.f15501b.getLocationOnScreen(iArr);
        qVar.f15500a.put("android:slide:screenPosition", iArr);
    }
}
