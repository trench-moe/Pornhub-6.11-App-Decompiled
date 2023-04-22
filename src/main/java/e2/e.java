package e2;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class e extends f<Integer> {
    public e(List<n2.a<Integer>> list) {
        super(list);
    }

    @Override // e2.a
    public Object f(n2.a aVar, float f10) {
        return Integer.valueOf(k(aVar, f10));
    }

    public int k(n2.a<Integer> aVar, float f10) {
        Integer num;
        if (aVar.f13260b == null || aVar.f13261c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        n2.c cVar = this.f8997e;
        if (cVar == null || (num = (Integer) cVar.a(aVar.f13264g, aVar.f13265h.floatValue(), aVar.f13260b, aVar.f13261c, f10, d(), this.d)) == null) {
            if (aVar.f13268k == 784923401) {
                aVar.f13268k = aVar.f13260b.intValue();
            }
            int i10 = aVar.f13268k;
            if (aVar.f13269l == 784923401) {
                aVar.f13269l = aVar.f13261c.intValue();
            }
            int i11 = aVar.f13269l;
            PointF pointF = m2.f.f12876a;
            return (int) ((f10 * (i11 - i10)) + i10);
        }
        return num.intValue();
    }
}
