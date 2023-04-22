package e2;

import java.util.List;

/* loaded from: classes.dex */
public class c extends f<Float> {
    public c(List<n2.a<Float>> list) {
        super(list);
    }

    @Override // e2.a
    public Object f(n2.a aVar, float f10) {
        return Float.valueOf(l(aVar, f10));
    }

    public float k() {
        return l(a(), c());
    }

    public float l(n2.a<Float> aVar, float f10) {
        Float f11;
        if (aVar.f13260b == null || aVar.f13261c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        n2.c cVar = this.f8997e;
        if (cVar == null || (f11 = (Float) cVar.a(aVar.f13264g, aVar.f13265h.floatValue(), aVar.f13260b, aVar.f13261c, f10, d(), this.d)) == null) {
            if (aVar.f13266i == -3987645.8f) {
                aVar.f13266i = aVar.f13260b.floatValue();
            }
            float f12 = aVar.f13266i;
            if (aVar.f13267j == -3987645.8f) {
                aVar.f13267j = aVar.f13261c.floatValue();
            }
            return m2.f.e(f12, aVar.f13267j, f10);
        }
        return f11.floatValue();
    }
}
