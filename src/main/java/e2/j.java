package e2;

import java.util.List;

/* loaded from: classes.dex */
public class j extends f<n2.d> {

    /* renamed from: i  reason: collision with root package name */
    public final n2.d f9014i;

    public j(List<n2.a<n2.d>> list) {
        super(list);
        this.f9014i = new n2.d();
    }

    @Override // e2.a
    public Object f(n2.a aVar, float f10) {
        T t2;
        n2.d dVar;
        T t8 = aVar.f13260b;
        if (t8 == 0 || (t2 = aVar.f13261c) == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        n2.d dVar2 = (n2.d) t8;
        n2.d dVar3 = (n2.d) t2;
        n2.c cVar = this.f8997e;
        if (cVar == null || (dVar = (n2.d) cVar.a(aVar.f13264g, aVar.f13265h.floatValue(), dVar2, dVar3, f10, d(), this.d)) == null) {
            n2.d dVar4 = this.f9014i;
            float e10 = m2.f.e(dVar2.f13279a, dVar3.f13279a, f10);
            float e11 = m2.f.e(dVar2.f13280b, dVar3.f13280b, f10);
            dVar4.f13279a = e10;
            dVar4.f13280b = e11;
            return this.f9014i;
        }
        return dVar;
    }
}
