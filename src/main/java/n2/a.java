package n2;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import b2.f;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a */
    public final f f13259a;

    /* renamed from: b */
    public final T f13260b;

    /* renamed from: c */
    public T f13261c;
    public final Interpolator d;

    /* renamed from: e */
    public final Interpolator f13262e;

    /* renamed from: f */
    public final Interpolator f13263f;

    /* renamed from: g */
    public final float f13264g;

    /* renamed from: h */
    public Float f13265h;

    /* renamed from: i */
    public float f13266i;

    /* renamed from: j */
    public float f13267j;

    /* renamed from: k */
    public int f13268k;

    /* renamed from: l */
    public int f13269l;

    /* renamed from: m */
    public float f13270m;
    public float n;

    /* renamed from: o */
    public PointF f13271o;

    /* renamed from: p */
    public PointF f13272p;

    public a(f fVar, T t2, T t8, Interpolator interpolator, float f10, Float f11) {
        this.f13266i = -3987645.8f;
        this.f13267j = -3987645.8f;
        this.f13268k = 784923401;
        this.f13269l = 784923401;
        this.f13270m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.f13271o = null;
        this.f13272p = null;
        this.f13259a = fVar;
        this.f13260b = t2;
        this.f13261c = t8;
        this.d = interpolator;
        this.f13262e = null;
        this.f13263f = null;
        this.f13264g = f10;
        this.f13265h = f11;
    }

    public a(f fVar, T t2, T t8, Interpolator interpolator, Interpolator interpolator2, float f10, Float f11) {
        this.f13266i = -3987645.8f;
        this.f13267j = -3987645.8f;
        this.f13268k = 784923401;
        this.f13269l = 784923401;
        this.f13270m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.f13271o = null;
        this.f13272p = null;
        this.f13259a = fVar;
        this.f13260b = t2;
        this.f13261c = t8;
        this.d = null;
        this.f13262e = interpolator;
        this.f13263f = interpolator2;
        this.f13264g = f10;
        this.f13265h = null;
    }

    public a(f fVar, T t2, T t8, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f10, Float f11) {
        this.f13266i = -3987645.8f;
        this.f13267j = -3987645.8f;
        this.f13268k = 784923401;
        this.f13269l = 784923401;
        this.f13270m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.f13271o = null;
        this.f13272p = null;
        this.f13259a = fVar;
        this.f13260b = t2;
        this.f13261c = t8;
        this.d = interpolator;
        this.f13262e = interpolator2;
        this.f13263f = interpolator3;
        this.f13264g = f10;
        this.f13265h = f11;
    }

    public a(T t2) {
        this.f13266i = -3987645.8f;
        this.f13267j = -3987645.8f;
        this.f13268k = 784923401;
        this.f13269l = 784923401;
        this.f13270m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.f13271o = null;
        this.f13272p = null;
        this.f13259a = null;
        this.f13260b = t2;
        this.f13261c = t2;
        this.d = null;
        this.f13262e = null;
        this.f13263f = null;
        this.f13264g = Float.MIN_VALUE;
        this.f13265h = Float.valueOf(Float.MAX_VALUE);
    }

    public boolean a(float f10) {
        return f10 >= c() && f10 < b();
    }

    public float b() {
        if (this.f13259a == null) {
            return 1.0f;
        }
        if (this.n == Float.MIN_VALUE) {
            if (this.f13265h == null) {
                this.n = 1.0f;
                return this.n;
            }
            this.n = ((this.f13265h.floatValue() - this.f13264g) / this.f13259a.c()) + c();
        }
        return this.n;
    }

    public float c() {
        f fVar = this.f13259a;
        if (fVar == null) {
            return 0.0f;
        }
        if (this.f13270m == Float.MIN_VALUE) {
            this.f13270m = (this.f13264g - fVar.f3457k) / fVar.c();
        }
        return this.f13270m;
    }

    public boolean d() {
        return this.d == null && this.f13262e == null && this.f13263f == null;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("Keyframe{startValue=");
        m10.append(this.f13260b);
        m10.append(", endValue=");
        m10.append(this.f13261c);
        m10.append(", startFrame=");
        m10.append(this.f13264g);
        m10.append(", endFrame=");
        m10.append(this.f13265h);
        m10.append(", interpolator=");
        m10.append(this.d);
        m10.append('}');
        return m10.toString();
    }
}
