package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import u1.k;
import u1.n;
import u1.q;
import u1.s;
import u1.u;

/* loaded from: classes.dex */
public class ChangeBounds extends Transition {
    public static final String[] R = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<j, PointF> S;
    public static final Property<j, PointF> T;
    public static final Property<View, PointF> U;
    public static final Property<View, PointF> V;
    public static final Property<View, PointF> W;
    public static k X;
    public int[] P;
    public boolean Q;

    /* loaded from: classes.dex */
    public static class a extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f3177a;

        public a(Class cls, String str) {
            super(cls, str);
            this.f3177a = new Rect();
        }

        @Override // android.util.Property
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f3177a);
            Rect rect = this.f3177a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            drawable2.copyBounds(this.f3177a);
            this.f3177a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(this.f3177a);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property<j, PointF> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(j jVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(j jVar, PointF pointF) {
            j jVar2 = jVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(jVar2);
            jVar2.f3186a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            jVar2.f3187b = round;
            int i10 = jVar2.f3190f + 1;
            jVar2.f3190f = i10;
            if (i10 == jVar2.f3191g) {
                u.b(jVar2.f3189e, jVar2.f3186a, round, jVar2.f3188c, jVar2.d);
                jVar2.f3190f = 0;
                jVar2.f3191g = 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends Property<j, PointF> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(j jVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(j jVar, PointF pointF) {
            j jVar2 = jVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(jVar2);
            jVar2.f3188c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            jVar2.d = round;
            int i10 = jVar2.f3191g + 1;
            jVar2.f3191g = i10;
            if (jVar2.f3190f == i10) {
                u.b(jVar2.f3189e, jVar2.f3186a, jVar2.f3187b, jVar2.f3188c, round);
                jVar2.f3190f = 0;
                jVar2.f3191g = 0;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class d extends Property<View, PointF> {
        public d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            u.b(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* loaded from: classes.dex */
    public static class e extends Property<View, PointF> {
        public e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            u.b(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* loaded from: classes.dex */
    public static class f extends Property<View, PointF> {
        public f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            u.b(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* loaded from: classes.dex */
    public class g extends AnimatorListenerAdapter {
        private j mViewBounds;

        public g(ChangeBounds changeBounds, j jVar) {
            this.mViewBounds = jVar;
        }
    }

    /* loaded from: classes.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3178a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f3179b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Rect f3180c;
        public final /* synthetic */ int d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ int f3181e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f3182f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f3183g;

        public h(ChangeBounds changeBounds, View view, Rect rect, int i10, int i11, int i12, int i13) {
            this.f3179b = view;
            this.f3180c = rect;
            this.d = i10;
            this.f3181e = i11;
            this.f3182f = i12;
            this.f3183g = i13;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3178a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f3178a) {
                View view = this.f3179b;
                Rect rect = this.f3180c;
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                x.f.c(view, rect);
                u.b(this.f3179b, this.d, this.f3181e, this.f3182f, this.f3183g);
            }
        }
    }

    /* loaded from: classes.dex */
    public class i extends androidx.transition.c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3184a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f3185b;

        public i(ChangeBounds changeBounds, ViewGroup viewGroup) {
            this.f3185b = viewGroup;
        }

        @Override // androidx.transition.c, androidx.transition.Transition.d
        public void b(Transition transition) {
            s.a(this.f3185b, false);
        }

        @Override // androidx.transition.Transition.d
        public void c(Transition transition) {
            if (!this.f3184a) {
                s.a(this.f3185b, false);
            }
            transition.A(this);
        }

        @Override // androidx.transition.c, androidx.transition.Transition.d
        public void d(Transition transition) {
            s.a(this.f3185b, false);
            this.f3184a = true;
        }

        @Override // androidx.transition.c, androidx.transition.Transition.d
        public void e(Transition transition) {
            s.a(this.f3185b, true);
        }
    }

    /* loaded from: classes.dex */
    public static class j {

        /* renamed from: a  reason: collision with root package name */
        public int f3186a;

        /* renamed from: b  reason: collision with root package name */
        public int f3187b;

        /* renamed from: c  reason: collision with root package name */
        public int f3188c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public View f3189e;

        /* renamed from: f  reason: collision with root package name */
        public int f3190f;

        /* renamed from: g  reason: collision with root package name */
        public int f3191g;

        public j(View view) {
            this.f3189e = view;
        }
    }

    static {
        new a(PointF.class, "boundsOrigin");
        S = new b(PointF.class, "topLeft");
        T = new c(PointF.class, "bottomRight");
        U = new d(PointF.class, "bottomRight");
        V = new e(PointF.class, "topLeft");
        W = new f(PointF.class, "position");
        X = new k();
    }

    public ChangeBounds() {
        this.P = new int[2];
        this.Q = false;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = new int[2];
        this.Q = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f15490b);
        boolean a10 = d0.h.a(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        this.Q = a10;
    }

    public final void M(q qVar) {
        View view = qVar.f15501b;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        if (!x.g.c(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        qVar.f15500a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        qVar.f15500a.put("android:changeBounds:parent", qVar.f15501b.getParent());
        if (this.Q) {
            qVar.f15500a.put("android:changeBounds:clip", x.f.a(view));
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
        int i10;
        View view;
        int i11;
        Rect rect;
        boolean z10;
        ObjectAnimator objectAnimator;
        Animator a10;
        if (qVar == null || qVar2 == null) {
            return null;
        }
        Map<String, Object> map = qVar.f15500a;
        Map<String, Object> map2 = qVar2.f15500a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = qVar2.f15501b;
        Rect rect2 = (Rect) qVar.f15500a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) qVar2.f15500a.get("android:changeBounds:bounds");
        int i12 = rect2.left;
        int i13 = rect3.left;
        int i14 = rect2.top;
        int i15 = rect3.top;
        int i16 = rect2.right;
        int i17 = rect3.right;
        int i18 = rect2.bottom;
        int i19 = rect3.bottom;
        int i20 = i16 - i12;
        int i21 = i18 - i14;
        int i22 = i17 - i13;
        int i23 = i19 - i15;
        Rect rect4 = (Rect) qVar.f15500a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) qVar2.f15500a.get("android:changeBounds:clip");
        if ((i20 == 0 || i21 == 0) && (i22 == 0 || i23 == 0)) {
            i10 = 0;
        } else {
            i10 = (i12 == i13 && i14 == i15) ? 0 : 1;
            if (i16 != i17 || i18 != i19) {
                i10++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i10++;
        }
        int i24 = i10;
        if (i24 > 0) {
            if (this.Q) {
                view = view2;
                u.b(view, i12, i14, Math.max(i20, i22) + i12, Math.max(i21, i23) + i14);
                ObjectAnimator a11 = (i12 == i13 && i14 == i15) ? null : u1.j.a(view, W, this.L.a(i12, i14, i13, i15));
                if (rect4 == null) {
                    i11 = 0;
                    rect = new Rect(0, 0, i20, i21);
                } else {
                    i11 = 0;
                    rect = rect4;
                }
                Rect rect6 = rect5 == null ? new Rect(i11, i11, i22, i23) : rect5;
                if (rect.equals(rect6)) {
                    z10 = true;
                    objectAnimator = null;
                } else {
                    WeakHashMap<View, a0> weakHashMap = x.f13156a;
                    x.f.c(view, rect);
                    k kVar = X;
                    Object[] objArr = new Object[2];
                    objArr[i11] = rect;
                    objArr[1] = rect6;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", kVar, objArr);
                    z10 = true;
                    ofObject.addListener(new h(this, view, rect5, i13, i15, i17, i19));
                    objectAnimator = ofObject;
                }
                a10 = androidx.transition.e.a(a11, objectAnimator);
            } else {
                view = view2;
                u.b(view, i12, i14, i16, i18);
                if (i24 != 2) {
                    a10 = (i12 == i13 && i14 == i15) ? u1.j.a(view, U, this.L.a(i16, i18, i17, i19)) : u1.j.a(view, V, this.L.a(i12, i14, i13, i15));
                } else if (i20 == i22 && i21 == i23) {
                    a10 = u1.j.a(view, W, this.L.a(i12, i14, i13, i15));
                } else {
                    j jVar = new j(view);
                    ObjectAnimator a12 = u1.j.a(jVar, S, this.L.a(i12, i14, i13, i15));
                    ObjectAnimator a13 = u1.j.a(jVar, T, this.L.a(i16, i18, i17, i19));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(a12, a13);
                    animatorSet.addListener(new g(this, jVar));
                    a10 = animatorSet;
                }
                z10 = true;
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                s.a(viewGroup4, z10);
                a(new i(this, viewGroup4));
            }
            return a10;
        }
        return null;
    }

    @Override // androidx.transition.Transition
    public String[] u() {
        return R;
    }
}
