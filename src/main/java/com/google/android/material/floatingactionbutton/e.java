package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import cb.g;
import cb.k;
import cb.o;
import com.app.pornhub.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

/* loaded from: classes.dex */
public class e {
    public static final TimeInterpolator D = ga.a.f9888c;
    public static final int[] E = {16842919, 16842910};
    public static final int[] F = {16843623, 16842908, 16842910};
    public static final int[] G = {16842908, 16842910};
    public static final int[] H = {16843623, 16842910};
    public static final int[] I = {16842910};
    public static final int[] J = new int[0];
    public ViewTreeObserver.OnPreDrawListener C;

    /* renamed from: a  reason: collision with root package name */
    public k f7468a;

    /* renamed from: b  reason: collision with root package name */
    public cb.g f7469b;

    /* renamed from: c  reason: collision with root package name */
    public Drawable f7470c;
    public ta.b d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f7471e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7472f;

    /* renamed from: h  reason: collision with root package name */
    public float f7474h;

    /* renamed from: i  reason: collision with root package name */
    public float f7475i;

    /* renamed from: j  reason: collision with root package name */
    public float f7476j;

    /* renamed from: k  reason: collision with root package name */
    public int f7477k;

    /* renamed from: l  reason: collision with root package name */
    public final ua.f f7478l;

    /* renamed from: m  reason: collision with root package name */
    public Animator f7479m;
    public ga.g n;

    /* renamed from: o  reason: collision with root package name */
    public ga.g f7480o;

    /* renamed from: p  reason: collision with root package name */
    public float f7481p;

    /* renamed from: r  reason: collision with root package name */
    public int f7483r;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f7485t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<Animator.AnimatorListener> f7486u;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<f> f7487v;

    /* renamed from: w  reason: collision with root package name */
    public final FloatingActionButton f7488w;

    /* renamed from: x  reason: collision with root package name */
    public final bb.b f7489x;

    /* renamed from: g  reason: collision with root package name */
    public boolean f7473g = true;

    /* renamed from: q  reason: collision with root package name */
    public float f7482q = 1.0f;

    /* renamed from: s  reason: collision with root package name */
    public int f7484s = 0;
    public final Rect y = new Rect();

    /* renamed from: z  reason: collision with root package name */
    public final RectF f7490z = new RectF();
    public final RectF A = new RectF();
    public final Matrix B = new Matrix();

    /* loaded from: classes.dex */
    public class a extends ga.f {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            e.this.f7482q = f10;
            matrix.getValues(this.f9894a);
            matrix2.getValues(this.f9895b);
            for (int i10 = 0; i10 < 9; i10++) {
                float[] fArr = this.f9895b;
                float f11 = fArr[i10];
                float[] fArr2 = this.f9894a;
                fArr[i10] = ((f11 - fArr2[i10]) * f10) + fArr2[i10];
            }
            this.f9896c.setValues(this.f9895b);
            return this.f9896c;
        }
    }

    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ float f7491a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f7492b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ float f7493c;
        public final /* synthetic */ float d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ float f7494e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ float f7495f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ float f7496g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ Matrix f7497h;

        public b(float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
            this.f7491a = f10;
            this.f7492b = f11;
            this.f7493c = f12;
            this.d = f13;
            this.f7494e = f14;
            this.f7495f = f15;
            this.f7496g = f16;
            this.f7497h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            e.this.f7488w.setAlpha(ga.a.b(this.f7491a, this.f7492b, 0.0f, 0.2f, floatValue));
            e.this.f7488w.setScaleX(ga.a.a(this.f7493c, this.d, floatValue));
            e.this.f7488w.setScaleY(ga.a.a(this.f7494e, this.d, floatValue));
            e.this.f7482q = ga.a.a(this.f7495f, this.f7496g, floatValue);
            e.this.a(ga.a.a(this.f7495f, this.f7496g, floatValue), this.f7497h);
            e.this.f7488w.setImageMatrix(this.f7497h);
        }
    }

    /* loaded from: classes.dex */
    public class c extends i {
        public c(e eVar) {
            super(null);
        }

        @Override // com.google.android.material.floatingactionbutton.e.i
        public float a() {
            return 0.0f;
        }
    }

    /* loaded from: classes.dex */
    public class d extends i {
        public d() {
            super(null);
        }

        @Override // com.google.android.material.floatingactionbutton.e.i
        public float a() {
            e eVar = e.this;
            return eVar.f7474h + eVar.f7475i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0093e extends i {
        public C0093e() {
            super(null);
        }

        @Override // com.google.android.material.floatingactionbutton.e.i
        public float a() {
            e eVar = e.this;
            return eVar.f7474h + eVar.f7476j;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    public interface g {
    }

    /* loaded from: classes.dex */
    public class h extends i {
        public h() {
            super(null);
        }

        @Override // com.google.android.material.floatingactionbutton.e.i
        public float a() {
            return e.this.f7474h;
        }
    }

    /* loaded from: classes.dex */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public boolean f7502a;

        /* renamed from: b  reason: collision with root package name */
        public float f7503b;

        /* renamed from: c  reason: collision with root package name */
        public float f7504c;

        public i(com.google.android.material.floatingactionbutton.c cVar) {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            e.this.x((int) this.f7504c);
            this.f7502a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f7502a) {
                cb.g gVar = e.this.f7469b;
                this.f7503b = gVar == null ? 0.0f : gVar.f3929c.f3950o;
                this.f7504c = a();
                this.f7502a = true;
            }
            e eVar = e.this;
            float f10 = this.f7503b;
            eVar.x((int) ((valueAnimator.getAnimatedFraction() * (this.f7504c - f10)) + f10));
        }
    }

    public e(FloatingActionButton floatingActionButton, bb.b bVar) {
        this.f7488w = floatingActionButton;
        this.f7489x = bVar;
        ua.f fVar = new ua.f();
        this.f7478l = fVar;
        fVar.a(E, d(new C0093e()));
        fVar.a(F, d(new d()));
        fVar.a(G, d(new d()));
        fVar.a(H, d(new d()));
        fVar.a(I, d(new h()));
        fVar.a(J, d(new c(this)));
        this.f7481p = floatingActionButton.getRotation();
    }

    public final void a(float f10, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f7488w.getDrawable();
        if (drawable != null && this.f7483r != 0) {
            RectF rectF = this.f7490z;
            RectF rectF2 = this.A;
            rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int i10 = this.f7483r;
            rectF2.set(0.0f, 0.0f, i10, i10);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i11 = this.f7483r;
            matrix.postScale(f10, f10, i11 / 2.0f, i11 / 2.0f);
        }
    }

    public final AnimatorSet b(ga.g gVar, float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7488w, View.ALPHA, f10);
        gVar.f("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f7488w, View.SCALE_X, f11);
        gVar.f("scale").a(ofFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            ofFloat2.setEvaluator(new ta.c(this));
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f7488w, View.SCALE_Y, f11);
        gVar.f("scale").a(ofFloat3);
        if (i10 == 26) {
            ofFloat3.setEvaluator(new ta.c(this));
        }
        arrayList.add(ofFloat3);
        a(f12, this.B);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f7488w, new ga.e(), new a(), new Matrix(this.B));
        gVar.f("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        a0.b.S(animatorSet, arrayList);
        return animatorSet;
    }

    public final AnimatorSet c(float f10, float f11, float f12) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new b(this.f7488w.getAlpha(), f10, this.f7488w.getScaleX(), f11, this.f7488w.getScaleY(), this.f7482q, f12, new Matrix(this.B)));
        arrayList.add(ofFloat);
        a0.b.S(animatorSet, arrayList);
        animatorSet.setDuration(va.a.c(this.f7488w.getContext(), R.attr.motionDurationLong1, this.f7488w.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(va.a.d(this.f7488w.getContext(), R.attr.motionEasingStandard, ga.a.f9887b));
        return animatorSet;
    }

    public final ValueAnimator d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(D);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public float e() {
        throw null;
    }

    public void f(Rect rect) {
        int sizeDimension = this.f7472f ? (this.f7477k - this.f7488w.getSizeDimension()) / 2 : 0;
        float e10 = this.f7473g ? e() + this.f7476j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(e10));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(e10 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public void g(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i10) {
        throw null;
    }

    public boolean h() {
        return this.f7488w.getVisibility() == 0 ? this.f7484s == 1 : this.f7484s != 2;
    }

    public boolean i() {
        return this.f7488w.getVisibility() != 0 ? this.f7484s == 2 : this.f7484s != 1;
    }

    public void j() {
        throw null;
    }

    public void k() {
        throw null;
    }

    public void l(int[] iArr) {
        throw null;
    }

    public void m(float f10, float f11, float f12) {
        throw null;
    }

    public void n() {
        ArrayList<f> arrayList = this.f7487v;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    public void o() {
        ArrayList<f> arrayList = this.f7487v;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public final void p(float f10) {
        this.f7482q = f10;
        Matrix matrix = this.B;
        a(f10, matrix);
        this.f7488w.setImageMatrix(matrix);
    }

    public void q(ColorStateList colorStateList) {
        throw null;
    }

    public final void r(k kVar) {
        this.f7468a = kVar;
        cb.g gVar = this.f7469b;
        if (gVar != null) {
            gVar.f3929c.f3938a = kVar;
            gVar.invalidateSelf();
        }
        Drawable drawable = this.f7470c;
        if (drawable instanceof o) {
            ((o) drawable).setShapeAppearanceModel(kVar);
        }
        ta.b bVar = this.d;
        if (bVar != null) {
            bVar.f15400o = kVar;
            bVar.invalidateSelf();
        }
    }

    public boolean s() {
        throw null;
    }

    public final boolean t() {
        FloatingActionButton floatingActionButton = this.f7488w;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        return x.g.c(floatingActionButton) && !this.f7488w.isInEditMode();
    }

    public final boolean u() {
        if (this.f7472f && this.f7488w.getSizeDimension() < this.f7477k) {
            return false;
        }
        return true;
    }

    public void v() {
        throw null;
    }

    public final void w() {
        Rect rect = this.y;
        f(rect);
        cb.e.u(this.f7471e, "Didn't initialize content background");
        if (s()) {
            InsetDrawable insetDrawable = new InsetDrawable(this.f7471e, rect.left, rect.top, rect.right, rect.bottom);
            FloatingActionButton.b bVar = (FloatingActionButton.b) this.f7489x;
            Objects.requireNonNull(bVar);
            super/*android.widget.ImageButton*/.setBackgroundDrawable(insetDrawable);
        } else {
            bb.b bVar2 = this.f7489x;
            Drawable drawable = this.f7471e;
            FloatingActionButton.b bVar3 = (FloatingActionButton.b) bVar2;
            Objects.requireNonNull(bVar3);
            if (drawable != null) {
                super/*android.widget.ImageButton*/.setBackgroundDrawable(drawable);
            }
        }
        bb.b bVar4 = this.f7489x;
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        FloatingActionButton.b bVar5 = (FloatingActionButton.b) bVar4;
        FloatingActionButton.this.C.set(i10, i11, i12, i13);
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        int i14 = floatingActionButton.f7452z;
        floatingActionButton.setPadding(i10 + i14, i11 + i14, i12 + i14, i13 + i14);
    }

    public void x(float f10) {
        cb.g gVar = this.f7469b;
        if (gVar != null) {
            g.b bVar = gVar.f3929c;
            if (bVar.f3950o != f10) {
                bVar.f3950o = f10;
                gVar.C();
            }
        }
    }
}
