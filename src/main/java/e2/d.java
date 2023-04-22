package e2;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public class d extends f<i2.c> {

    /* renamed from: i  reason: collision with root package name */
    public final i2.c f9006i;

    public d(List<n2.a<i2.c>> list) {
        super(list);
        i2.c cVar = list.get(0).f13260b;
        int length = cVar != null ? cVar.f10462b.length : 0;
        this.f9006i = new i2.c(new float[length], new int[length]);
    }

    @Override // e2.a
    public Object f(n2.a aVar, float f10) {
        i2.c cVar = this.f9006i;
        i2.c cVar2 = (i2.c) aVar.f13260b;
        i2.c cVar3 = (i2.c) aVar.f13261c;
        Objects.requireNonNull(cVar);
        if (cVar2.f10462b.length != cVar3.f10462b.length) {
            StringBuilder m10 = a1.a.m("Cannot interpolate between gradients. Lengths vary (");
            m10.append(cVar2.f10462b.length);
            m10.append(" vs ");
            throw new IllegalArgumentException(android.support.v4.media.a.j(m10, cVar3.f10462b.length, ")"));
        }
        for (int i10 = 0; i10 < cVar2.f10462b.length; i10++) {
            cVar.f10461a[i10] = m2.f.e(cVar2.f10461a[i10], cVar3.f10461a[i10], f10);
            cVar.f10462b[i10] = m9.a.s(f10, cVar2.f10462b[i10], cVar3.f10462b[i10]);
        }
        return this.f9006i;
    }
}
