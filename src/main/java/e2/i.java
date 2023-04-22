package e2;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class i extends f<PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f9013i;

    public i(List<n2.a<PointF>> list) {
        super(list);
        this.f9013i = new PointF();
    }

    @Override // e2.a
    public Object f(n2.a aVar, float f10) {
        return g(aVar, f10, f10, f10);
    }

    @Override // e2.a
    /* renamed from: k */
    public PointF g(n2.a<PointF> aVar, float f10, float f11, float f12) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.f13260b;
        if (pointF3 == null || (pointF = aVar.f13261c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        n2.c cVar = this.f8997e;
        if (cVar == null || (pointF2 = (PointF) cVar.a(aVar.f13264g, aVar.f13265h.floatValue(), pointF4, pointF5, f10, d(), this.d)) == null) {
            PointF pointF6 = this.f9013i;
            float f13 = pointF4.x;
            float b10 = a0.a.b(pointF5.x, f13, f11, f13);
            float f14 = pointF4.y;
            pointF6.set(b10, ((pointF5.y - f14) * f12) + f14);
            return this.f9013i;
        }
        return pointF2;
    }
}
