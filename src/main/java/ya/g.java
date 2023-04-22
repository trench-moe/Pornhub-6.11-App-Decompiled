package ya;

import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;

/* loaded from: classes2.dex */
public final class g extends m<ObjectAnimator> {

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f18584l = {0, 1350, 2700, 4050};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f18585m = {667, 2017, 3367, 4717};
    public static final int[] n = {1000, 2350, 3700, 5050};

    /* renamed from: o  reason: collision with root package name */
    public static final Property<g, Float> f18586o = new a(Float.class, "animationFraction");

    /* renamed from: p  reason: collision with root package name */
    public static final Property<g, Float> f18587p = new b(Float.class, "completeEndFraction");
    public ObjectAnimator d;

    /* renamed from: e  reason: collision with root package name */
    public ObjectAnimator f18588e;

    /* renamed from: f  reason: collision with root package name */
    public final c1.b f18589f;

    /* renamed from: g  reason: collision with root package name */
    public final c f18590g;

    /* renamed from: h  reason: collision with root package name */
    public int f18591h;

    /* renamed from: i  reason: collision with root package name */
    public float f18592i;

    /* renamed from: j  reason: collision with root package name */
    public float f18593j;

    /* renamed from: k  reason: collision with root package name */
    public v1.b f18594k;

    /* loaded from: classes2.dex */
    public static class a extends Property<g, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(g gVar) {
            return Float.valueOf(gVar.f18592i);
        }

        @Override // android.util.Property
        public void set(g gVar, Float f10) {
            g gVar2 = gVar;
            float floatValue = f10.floatValue();
            gVar2.f18592i = floatValue;
            int i10 = (int) (5400.0f * floatValue);
            float[] fArr = gVar2.f18608b;
            float f11 = floatValue * 1520.0f;
            fArr[0] = (-20.0f) + f11;
            fArr[1] = f11;
            for (int i11 = 0; i11 < 4; i11++) {
                float b10 = gVar2.b(i10, g.f18584l[i11], 667);
                float[] fArr2 = gVar2.f18608b;
                fArr2[1] = (gVar2.f18589f.getInterpolation(b10) * 250.0f) + fArr2[1];
                float b11 = gVar2.b(i10, g.f18585m[i11], 667);
                float[] fArr3 = gVar2.f18608b;
                fArr3[0] = (gVar2.f18589f.getInterpolation(b11) * 250.0f) + fArr3[0];
            }
            float[] fArr4 = gVar2.f18608b;
            fArr4[0] = ((fArr4[1] - fArr4[0]) * gVar2.f18593j) + fArr4[0];
            fArr4[0] = fArr4[0] / 360.0f;
            fArr4[1] = fArr4[1] / 360.0f;
            int i12 = 0;
            while (true) {
                if (i12 >= 4) {
                    break;
                }
                float b12 = gVar2.b(i10, g.n[i12], 333);
                if (b12 >= 0.0f && b12 <= 1.0f) {
                    int i13 = i12 + gVar2.f18591h;
                    int[] iArr = gVar2.f18590g.f18576c;
                    int length = i13 % iArr.length;
                    gVar2.f18609c[0] = ga.b.f9890a.evaluate(gVar2.f18589f.getInterpolation(b12), Integer.valueOf(l9.e.b(iArr[length], gVar2.f18607a.f18604z)), Integer.valueOf(l9.e.b(gVar2.f18590g.f18576c[(length + 1) % iArr.length], gVar2.f18607a.f18604z))).intValue();
                    break;
                }
                i12++;
            }
            gVar2.f18607a.invalidateSelf();
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends Property<g, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(g gVar) {
            return Float.valueOf(gVar.f18593j);
        }

        @Override // android.util.Property
        public void set(g gVar, Float f10) {
            gVar.f18593j = f10.floatValue();
        }
    }

    public g(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f18591h = 0;
        this.f18594k = null;
        this.f18590g = circularProgressIndicatorSpec;
        this.f18589f = new c1.b();
    }

    @Override // ya.m
    public void a() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // ya.m
    public void c() {
        h();
    }

    @Override // ya.m
    public void d(v1.b bVar) {
        this.f18594k = bVar;
    }

    @Override // ya.m
    public void e() {
        ObjectAnimator objectAnimator = this.f18588e;
        if (objectAnimator != null && !objectAnimator.isRunning()) {
            if (this.f18607a.isVisible()) {
                this.f18588e.start();
            } else {
                a();
            }
        }
    }

    @Override // ya.m
    public void f() {
        if (this.d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f18586o, 0.0f, 1.0f);
            this.d = ofFloat;
            ofFloat.setDuration(5400L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new e(this));
        }
        if (this.f18588e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f18587p, 0.0f, 1.0f);
            this.f18588e = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f18588e.setInterpolator(this.f18589f);
            this.f18588e.addListener(new f(this));
        }
        h();
        this.d.start();
    }

    @Override // ya.m
    public void g() {
        this.f18594k = null;
    }

    public void h() {
        this.f18591h = 0;
        this.f18609c[0] = l9.e.b(this.f18590g.f18576c[0], this.f18607a.f18604z);
        this.f18593j = 0.0f;
    }
}
