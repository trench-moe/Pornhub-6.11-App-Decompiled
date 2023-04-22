package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.app.pornhub.R;
import d0.h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import org.xmlpull.v1.XmlPullParser;
import u1.n;
import u1.q;
import u1.u;

/* loaded from: classes.dex */
public class ChangeTransform extends Transition {
    public static final String[] S = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    public static final Property<d, float[]> T = new a(float[].class, "nonTranslations");
    public static final Property<d, PointF> U = new b(PointF.class, "translations");
    public static final boolean V = true;
    public boolean P;
    public boolean Q;
    public Matrix R;

    /* loaded from: classes.dex */
    public static class a extends Property<d, float[]> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ float[] get(d dVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(d dVar, float[] fArr) {
            d dVar2 = dVar;
            float[] fArr2 = fArr;
            System.arraycopy(fArr2, 0, dVar2.f3198c, 0, fArr2.length);
            dVar2.a();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property<d, PointF> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(d dVar) {
            return null;
        }

        @Override // android.util.Property
        public void set(d dVar, PointF pointF) {
            d dVar2 = dVar;
            PointF pointF2 = pointF;
            Objects.requireNonNull(dVar2);
            dVar2.d = pointF2.x;
            dVar2.f3199e = pointF2.y;
            dVar2.a();
        }
    }

    /* loaded from: classes.dex */
    public static class c extends androidx.transition.c {

        /* renamed from: a  reason: collision with root package name */
        public View f3194a;

        /* renamed from: b  reason: collision with root package name */
        public u1.d f3195b;

        public c(View view, u1.d dVar) {
            this.f3194a = view;
            this.f3195b = dVar;
        }

        @Override // androidx.transition.c, androidx.transition.Transition.d
        public void b(Transition transition) {
            this.f3195b.setVisibility(4);
        }

        @Override // androidx.transition.Transition.d
        public void c(Transition transition) {
            transition.A(this);
            View view = this.f3194a;
            if (Build.VERSION.SDK_INT == 28) {
                if (!u1.f.f15476u) {
                    try {
                        u1.f.c();
                        Method declaredMethod = u1.f.f15472f.getDeclaredMethod("removeGhost", View.class);
                        u1.f.f15475t = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e10) {
                        Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e10);
                    }
                    u1.f.f15476u = true;
                }
                Method method = u1.f.f15475t;
                if (method != null) {
                    try {
                        method.invoke(null, view);
                    } catch (IllegalAccessException unused) {
                    } catch (InvocationTargetException e11) {
                        throw new RuntimeException(e11.getCause());
                    }
                    this.f3194a.setTag(R.id.transition_transform, null);
                    this.f3194a.setTag(R.id.parent_matrix, null);
                }
            } else {
                int i10 = u1.g.f15478u;
                u1.g gVar = (u1.g) view.getTag(R.id.ghost_view);
                if (gVar != null) {
                    int i11 = gVar.f15482m - 1;
                    gVar.f15482m = i11;
                    if (i11 <= 0) {
                        ((u1.e) gVar.getParent()).removeView(gVar);
                    }
                }
            }
            this.f3194a.setTag(R.id.transition_transform, null);
            this.f3194a.setTag(R.id.parent_matrix, null);
        }

        @Override // androidx.transition.c, androidx.transition.Transition.d
        public void e(Transition transition) {
            this.f3195b.setVisibility(0);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f3196a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        public final View f3197b;

        /* renamed from: c  reason: collision with root package name */
        public final float[] f3198c;
        public float d;

        /* renamed from: e  reason: collision with root package name */
        public float f3199e;

        public d(View view, float[] fArr) {
            this.f3197b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f3198c = fArr2;
            this.d = fArr2[2];
            this.f3199e = fArr2[5];
            a();
        }

        public final void a() {
            float[] fArr = this.f3198c;
            fArr[2] = this.d;
            fArr[5] = this.f3199e;
            this.f3196a.setValues(fArr);
            u.f15511a.e(this.f3197b, this.f3196a);
        }
    }

    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final float f3200a;

        /* renamed from: b  reason: collision with root package name */
        public final float f3201b;

        /* renamed from: c  reason: collision with root package name */
        public final float f3202c;
        public final float d;

        /* renamed from: e  reason: collision with root package name */
        public final float f3203e;

        /* renamed from: f  reason: collision with root package name */
        public final float f3204f;

        /* renamed from: g  reason: collision with root package name */
        public final float f3205g;

        /* renamed from: h  reason: collision with root package name */
        public final float f3206h;

        public e(View view) {
            this.f3200a = view.getTranslationX();
            this.f3201b = view.getTranslationY();
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            this.f3202c = x.i.l(view);
            this.d = view.getScaleX();
            this.f3203e = view.getScaleY();
            this.f3204f = view.getRotationX();
            this.f3205g = view.getRotationY();
            this.f3206h = view.getRotation();
        }

        public void a(View view) {
            float f10 = this.f3200a;
            float f11 = this.f3201b;
            float f12 = this.f3202c;
            float f13 = this.d;
            float f14 = this.f3203e;
            float f15 = this.f3204f;
            float f16 = this.f3205g;
            float f17 = this.f3206h;
            String[] strArr = ChangeTransform.S;
            view.setTranslationX(f10);
            view.setTranslationY(f11);
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.i.w(view, f12);
            view.setScaleX(f13);
            view.setScaleY(f14);
            view.setRotationX(f15);
            view.setRotationY(f16);
            view.setRotation(f17);
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                return eVar.f3200a == this.f3200a && eVar.f3201b == this.f3201b && eVar.f3202c == this.f3202c && eVar.d == this.d && eVar.f3203e == this.f3203e && eVar.f3204f == this.f3204f && eVar.f3205g == this.f3205g && eVar.f3206h == this.f3206h;
            }
            return false;
        }

        public int hashCode() {
            float f10 = this.f3200a;
            int i10 = 0;
            int floatToIntBits = (f10 != 0.0f ? Float.floatToIntBits(f10) : 0) * 31;
            float f11 = this.f3201b;
            int floatToIntBits2 = (floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31;
            float f12 = this.f3202c;
            int floatToIntBits3 = (floatToIntBits2 + (f12 != 0.0f ? Float.floatToIntBits(f12) : 0)) * 31;
            float f13 = this.d;
            int floatToIntBits4 = (floatToIntBits3 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 31;
            float f14 = this.f3203e;
            int floatToIntBits5 = (floatToIntBits4 + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0)) * 31;
            float f15 = this.f3204f;
            int floatToIntBits6 = (floatToIntBits5 + (f15 != 0.0f ? Float.floatToIntBits(f15) : 0)) * 31;
            float f16 = this.f3205g;
            int floatToIntBits7 = (floatToIntBits6 + (f16 != 0.0f ? Float.floatToIntBits(f16) : 0)) * 31;
            float f17 = this.f3206h;
            if (f17 != 0.0f) {
                i10 = Float.floatToIntBits(f17);
            }
            return floatToIntBits7 + i10;
        }
    }

    public ChangeTransform() {
        this.P = true;
        this.Q = true;
        this.R = new Matrix();
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = true;
        this.Q = true;
        this.R = new Matrix();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.f15492e);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.P = h.a(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.Q = h.a(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }

    public static void N(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.i.w(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(u1.q r9) {
        /*
            r8 = this;
            r4 = r8
            android.view.View r0 = r9.f15501b
            int r7 = r0.getVisibility()
            r1 = r7
            r6 = 8
            r2 = r6
            if (r1 != r2) goto Le
            return
        Le:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f15500a
            android.view.ViewParent r2 = r0.getParent()
            java.lang.String r3 = "android:changeTransform:parent"
            r1.put(r3, r2)
            androidx.transition.ChangeTransform$e r1 = new androidx.transition.ChangeTransform$e
            r6 = 6
            r1.<init>(r0)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r9.f15500a
            java.lang.String r6 = "android:changeTransform:transforms"
            r3 = r6
            r2.put(r3, r1)
            android.graphics.Matrix r7 = r0.getMatrix()
            r1 = r7
            if (r1 == 0) goto L3e
            r7 = 6
            boolean r7 = r1.isIdentity()
            r2 = r7
            if (r2 == 0) goto L37
            goto L3f
        L37:
            android.graphics.Matrix r2 = new android.graphics.Matrix
            r6 = 4
            r2.<init>(r1)
            goto L41
        L3e:
            r6 = 2
        L3f:
            r2 = 0
            r7 = 3
        L41:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f15500a
            r6 = 4
            java.lang.String r3 = "android:changeTransform:matrix"
            r1.put(r3, r2)
            boolean r1 = r4.Q
            if (r1 == 0) goto L9e
            r7 = 4
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r7 = 6
            r1.<init>()
            android.view.ViewParent r2 = r0.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            mb.a r3 = u1.u.f15511a
            r3.i(r2, r1)
            r6 = 3
            int r3 = r2.getScrollX()
            int r3 = -r3
            float r3 = (float) r3
            r6 = 5
            int r7 = r2.getScrollY()
            r2 = r7
            int r2 = -r2
            r7 = 6
            float r2 = (float) r2
            r6 = 2
            r1.preTranslate(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r2 = r9.f15500a
            r6 = 3
            java.lang.String r7 = "android:changeTransform:parentMatrix"
            r3 = r7
            r2.put(r3, r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r9.f15500a
            r7 = 1
            r2 = 2131363088(0x7f0a0510, float:1.8345975E38)
            r6 = 3
            java.lang.Object r2 = r0.getTag(r2)
            java.lang.String r7 = "android:changeTransform:intermediateMatrix"
            r3 = r7
            r1.put(r3, r2)
            java.util.Map<java.lang.String, java.lang.Object> r9 = r9.f15500a
            r7 = 1
            r1 = 2131362720(0x7f0a03a0, float:1.8345229E38)
            r6 = 3
            java.lang.Object r0 = r0.getTag(r1)
            java.lang.String r6 = "android:changeTransform:intermediateParentMatrix"
            r1 = r6
            r9.put(r1, r0)
        L9e:
            r6 = 3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.M(u1.q):void");
    }

    @Override // androidx.transition.Transition
    public void d(q qVar) {
        M(qVar);
    }

    @Override // androidx.transition.Transition
    public void i(q qVar) {
        M(qVar);
        if (V) {
            return;
        }
        ((ViewGroup) qVar.f15501b.getParent()).startViewTransition(qVar.f15501b);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:118:0x031e
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // androidx.transition.Transition
    public android.animation.Animator n(android.view.ViewGroup r25, u1.q r26, u1.q r27) {
        /*
            Method dump skipped, instructions count: 1097
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.n(android.view.ViewGroup, u1.q, u1.q):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    public String[] u() {
        return S;
    }
}
