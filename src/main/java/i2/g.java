package i2;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final List<g2.a> f10478a;

    /* renamed from: b  reason: collision with root package name */
    public PointF f10479b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f10480c;

    public g() {
        this.f10478a = new ArrayList();
    }

    public g(PointF pointF, boolean z10, List<g2.a> list) {
        this.f10479b = pointF;
        this.f10480c = z10;
        this.f10478a = new ArrayList(list);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("ShapeData{numCurves=");
        m10.append(this.f10478a.size());
        m10.append("closed=");
        return a0.a.l(m10, this.f10480c, '}');
    }
}
