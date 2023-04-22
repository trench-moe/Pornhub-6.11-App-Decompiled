package h2;

import android.graphics.PointF;
import e2.l;
import java.util.List;

/* loaded from: classes2.dex */
public class g implements j<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    public final b f10095a;

    /* renamed from: b  reason: collision with root package name */
    public final b f10096b;

    public g(b bVar, b bVar2) {
        this.f10095a = bVar;
        this.f10096b = bVar2;
    }

    @Override // h2.j
    public e2.a<PointF, PointF> a() {
        return new l(this.f10095a.a(), this.f10096b.a());
    }

    @Override // h2.j
    public List<n2.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // h2.j
    public boolean isStatic() {
        return this.f10095a.isStatic() && this.f10096b.isStatic();
    }
}
