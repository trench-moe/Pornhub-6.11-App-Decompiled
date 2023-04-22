package v;

import r.j;
import r.l;
import r.m;
import w.o;

/* loaded from: classes2.dex */
public class b extends o {

    /* renamed from: a  reason: collision with root package name */
    public m f15899a;

    /* renamed from: b  reason: collision with root package name */
    public j f15900b;

    /* renamed from: c  reason: collision with root package name */
    public l f15901c;

    public b() {
        m mVar = new m();
        this.f15899a = mVar;
        this.f15901c = mVar;
    }

    @Override // w.o
    public float a() {
        return this.f15901c.b();
    }

    public void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        m mVar = this.f15899a;
        this.f15901c = mVar;
        mVar.f14594l = f10;
        boolean z10 = f10 > f11;
        mVar.f14593k = z10;
        if (z10) {
            mVar.d(-f12, f10 - f11, f14, f15, f13);
        } else {
            mVar.d(f12, f11 - f10, f14, f15, f13);
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return this.f15901c.getInterpolation(f10);
    }
}
