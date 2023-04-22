package e2;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;

/* loaded from: classes.dex */
public class g extends n2.a<PointF> {

    /* renamed from: q  reason: collision with root package name */
    public Path f9007q;

    /* renamed from: r  reason: collision with root package name */
    public final n2.a<PointF> f9008r;

    public g(b2.f fVar, n2.a<PointF> aVar) {
        super(fVar, aVar.f13260b, aVar.f13261c, aVar.d, aVar.f13262e, aVar.f13263f, aVar.f13264g, aVar.f13265h);
        this.f9008r = aVar;
        e();
    }

    public void e() {
        T t2;
        T t8;
        T t10 = this.f13261c;
        boolean z10 = (t10 == 0 || (t8 = this.f13260b) == 0 || !((PointF) t8).equals(((PointF) t10).x, ((PointF) t10).y)) ? false : true;
        T t11 = this.f13260b;
        if (t11 != 0 && (t2 = this.f13261c) != 0 && !z10) {
            PointF pointF = (PointF) t11;
            PointF pointF2 = (PointF) t2;
            n2.a<PointF> aVar = this.f9008r;
            PointF pointF3 = aVar.f13271o;
            PointF pointF4 = aVar.f13272p;
            ThreadLocal<PathMeasure> threadLocal = m2.g.f12877a;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
                path.lineTo(pointF2.x, pointF2.y);
            } else {
                float f10 = pointF.x;
                float f11 = pointF2.x;
                float f12 = pointF2.y;
                path.cubicTo(pointF3.x + f10, pointF.y + pointF3.y, f11 + pointF4.x, f12 + pointF4.y, f11, f12);
            }
            this.f9007q = path;
        }
    }
}
