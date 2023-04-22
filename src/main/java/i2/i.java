package i2;

import b2.l;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class i implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f10486a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f10487b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10488c;

    public i(String str, List<b> list, boolean z10) {
        this.f10486a = str;
        this.f10487b = list;
        this.f10488c = z10;
    }

    @Override // i2.b
    public d2.c a(l lVar, com.airbnb.lottie.model.layer.a aVar) {
        return new d2.d(lVar, aVar, this);
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("ShapeGroup{name='");
        m10.append(this.f10486a);
        m10.append("' Shapes: ");
        m10.append(Arrays.toString(this.f10487b.toArray()));
        m10.append('}');
        return m10.toString();
    }
}
