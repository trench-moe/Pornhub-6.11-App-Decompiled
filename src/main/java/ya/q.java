package ya;

import android.animation.ObjectAnimator;
import android.util.Property;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class q extends m<ObjectAnimator> {

    /* renamed from: j  reason: collision with root package name */
    public static final Property<q, Float> f18613j = new a(Float.class, "animationFraction");
    public ObjectAnimator d;

    /* renamed from: e  reason: collision with root package name */
    public c1.b f18614e;

    /* renamed from: f  reason: collision with root package name */
    public final c f18615f;

    /* renamed from: g  reason: collision with root package name */
    public int f18616g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f18617h;

    /* renamed from: i  reason: collision with root package name */
    public float f18618i;

    /* loaded from: classes2.dex */
    public static class a extends Property<q, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public Float get(q qVar) {
            return Float.valueOf(qVar.f18618i);
        }

        @Override // android.util.Property
        public void set(q qVar, Float f10) {
            q qVar2 = qVar;
            float floatValue = f10.floatValue();
            qVar2.f18618i = floatValue;
            qVar2.f18608b[0] = 0.0f;
            float b10 = qVar2.b((int) (floatValue * 333.0f), 0, 667);
            float[] fArr = qVar2.f18608b;
            float interpolation = qVar2.f18614e.getInterpolation(b10);
            fArr[2] = interpolation;
            fArr[1] = interpolation;
            float[] fArr2 = qVar2.f18608b;
            float interpolation2 = qVar2.f18614e.getInterpolation(b10 + 0.49925038f);
            fArr2[4] = interpolation2;
            fArr2[3] = interpolation2;
            float[] fArr3 = qVar2.f18608b;
            fArr3[5] = 1.0f;
            if (qVar2.f18617h && fArr3[3] < 1.0f) {
                int[] iArr = qVar2.f18609c;
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = l9.e.b(qVar2.f18615f.f18576c[qVar2.f18616g], qVar2.f18607a.f18604z);
                qVar2.f18617h = false;
            }
            qVar2.f18607a.invalidateSelf();
        }
    }

    public q(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f18616g = 1;
        this.f18615f = linearProgressIndicatorSpec;
        this.f18614e = new c1.b();
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
    }

    @Override // ya.m
    public void e() {
    }

    @Override // ya.m
    public void f() {
        if (this.d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f18613j, 0.0f, 1.0f);
            this.d = ofFloat;
            ofFloat.setDuration(333L);
            this.d.setInterpolator(null);
            this.d.setRepeatCount(-1);
            this.d.addListener(new p(this));
        }
        h();
        this.d.start();
    }

    @Override // ya.m
    public void g() {
    }

    public void h() {
        this.f18617h = true;
        this.f18616g = 1;
        Arrays.fill(this.f18609c, l9.e.b(this.f18615f.f18576c[0], this.f18607a.f18604z));
    }
}
