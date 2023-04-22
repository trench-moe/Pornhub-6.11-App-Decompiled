package e2;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class h extends f<PointF> {

    /* renamed from: i  reason: collision with root package name */
    public final PointF f9009i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f9010j;

    /* renamed from: k  reason: collision with root package name */
    public final PathMeasure f9011k;

    /* renamed from: l  reason: collision with root package name */
    public g f9012l;

    public h(List<? extends n2.a<PointF>> list) {
        super(list);
        this.f9009i = new PointF();
        this.f9010j = new float[2];
        this.f9011k = new PathMeasure();
    }

    @Override // e2.a
    public Object f(n2.a aVar, float f10) {
        PointF pointF;
        g gVar = (g) aVar;
        Path path = gVar.f9007q;
        if (path == null) {
            return (PointF) aVar.f13260b;
        }
        n2.c cVar = this.f8997e;
        if (cVar == null || (pointF = (PointF) cVar.a(gVar.f13264g, gVar.f13265h.floatValue(), gVar.f13260b, gVar.f13261c, d(), f10, this.d)) == null) {
            if (this.f9012l != gVar) {
                this.f9011k.setPath(path, false);
                this.f9012l = gVar;
            }
            PathMeasure pathMeasure = this.f9011k;
            pathMeasure.getPosTan(pathMeasure.getLength() * f10, this.f9010j, null);
            PointF pointF2 = this.f9009i;
            float[] fArr = this.f9010j;
            pointF2.set(fArr[0], fArr[1]);
            return this.f9009i;
        }
        return pointF;
    }
}
