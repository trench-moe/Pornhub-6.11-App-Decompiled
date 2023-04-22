package e2;

import java.util.List;

/* loaded from: classes.dex */
public class b extends f<Integer> {
    public b(List<n2.a<Integer>> list) {
        super(list);
    }

    @Override // e2.a
    public Object f(n2.a aVar, float f10) {
        return Integer.valueOf(k(aVar, f10));
    }

    public int k(n2.a<Integer> aVar, float f10) {
        Integer num;
        Integer num2 = aVar.f13260b;
        if (num2 == null || aVar.f13261c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = num2.intValue();
        int intValue2 = aVar.f13261c.intValue();
        n2.c cVar = this.f8997e;
        return (cVar == null || (num = (Integer) cVar.a(aVar.f13264g, aVar.f13265h.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f10, d(), this.d)) == null) ? m9.a.s(m2.f.b(f10, 0.0f, 1.0f), intValue, intValue2) : num.intValue();
    }
}
