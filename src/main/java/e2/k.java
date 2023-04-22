package e2;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class k extends a<i2.g, Path> {

    /* renamed from: i  reason: collision with root package name */
    public final i2.g f9015i;

    /* renamed from: j  reason: collision with root package name */
    public final Path f9016j;

    public k(List<n2.a<i2.g>> list) {
        super(list);
        this.f9015i = new i2.g();
        this.f9016j = new Path();
    }

    @Override // e2.a
    public Path f(n2.a<i2.g> aVar, float f10) {
        List<g2.a> list;
        i2.g gVar = aVar.f13260b;
        i2.g gVar2 = aVar.f13261c;
        i2.g gVar3 = this.f9015i;
        if (gVar3.f10479b == null) {
            gVar3.f10479b = new PointF();
        }
        gVar3.f10480c = gVar.f10480c || gVar2.f10480c;
        if (gVar.f10478a.size() != gVar2.f10478a.size()) {
            StringBuilder m10 = a1.a.m("Curves must have the same number of control points. Shape 1: ");
            m10.append(gVar.f10478a.size());
            m10.append("\tShape 2: ");
            m10.append(gVar2.f10478a.size());
            m2.c.a(m10.toString());
        }
        int min = Math.min(gVar.f10478a.size(), gVar2.f10478a.size());
        if (gVar3.f10478a.size() < min) {
            for (int size = gVar3.f10478a.size(); size < min; size++) {
                gVar3.f10478a.add(new g2.a());
            }
        } else if (gVar3.f10478a.size() > min) {
            for (int size2 = gVar3.f10478a.size() - 1; size2 >= min; size2--) {
                gVar3.f10478a.remove(list.size() - 1);
            }
        }
        PointF pointF = gVar.f10479b;
        PointF pointF2 = gVar2.f10479b;
        float e10 = m2.f.e(pointF.x, pointF2.x, f10);
        float e11 = m2.f.e(pointF.y, pointF2.y, f10);
        if (gVar3.f10479b == null) {
            gVar3.f10479b = new PointF();
        }
        gVar3.f10479b.set(e10, e11);
        for (int size3 = gVar3.f10478a.size() - 1; size3 >= 0; size3--) {
            g2.a aVar2 = gVar.f10478a.get(size3);
            g2.a aVar3 = gVar2.f10478a.get(size3);
            PointF pointF3 = aVar2.f9701a;
            PointF pointF4 = aVar2.f9702b;
            PointF pointF5 = aVar2.f9703c;
            PointF pointF6 = aVar3.f9701a;
            PointF pointF7 = aVar3.f9702b;
            PointF pointF8 = aVar3.f9703c;
            gVar3.f10478a.get(size3).f9701a.set(m2.f.e(pointF3.x, pointF6.x, f10), m2.f.e(pointF3.y, pointF6.y, f10));
            gVar3.f10478a.get(size3).f9702b.set(m2.f.e(pointF4.x, pointF7.x, f10), m2.f.e(pointF4.y, pointF7.y, f10));
            gVar3.f10478a.get(size3).f9703c.set(m2.f.e(pointF5.x, pointF8.x, f10), m2.f.e(pointF5.y, pointF8.y, f10));
        }
        i2.g gVar4 = this.f9015i;
        Path path = this.f9016j;
        path.reset();
        PointF pointF9 = gVar4.f10479b;
        path.moveTo(pointF9.x, pointF9.y);
        m2.f.f12876a.set(pointF9.x, pointF9.y);
        for (int i10 = 0; i10 < gVar4.f10478a.size(); i10++) {
            g2.a aVar4 = gVar4.f10478a.get(i10);
            PointF pointF10 = aVar4.f9701a;
            PointF pointF11 = aVar4.f9702b;
            PointF pointF12 = aVar4.f9703c;
            if (pointF10.equals(m2.f.f12876a) && pointF11.equals(pointF12)) {
                path.lineTo(pointF12.x, pointF12.y);
            } else {
                path.cubicTo(pointF10.x, pointF10.y, pointF11.x, pointF11.y, pointF12.x, pointF12.y);
            }
            m2.f.f12876a.set(pointF12.x, pointF12.y);
        }
        if (gVar4.f10480c) {
            path.close();
        }
        return this.f9016j;
    }
}
