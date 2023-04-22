package d2;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import e2.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class s implements c, a.b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f8742a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a.b> f8743b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ShapeTrimPath.Type f8744c;
    public final e2.a<?, Float> d;

    /* renamed from: e  reason: collision with root package name */
    public final e2.a<?, Float> f8745e;

    /* renamed from: f  reason: collision with root package name */
    public final e2.a<?, Float> f8746f;

    public s(com.airbnb.lottie.model.layer.a aVar, ShapeTrimPath shapeTrimPath) {
        this.f8742a = shapeTrimPath.f4173f;
        this.f8744c = shapeTrimPath.f4170b;
        e2.a<Float, Float> a10 = shapeTrimPath.f4171c.a();
        this.d = a10;
        e2.a<Float, Float> a11 = shapeTrimPath.d.a();
        this.f8745e = a11;
        e2.a<Float, Float> a12 = shapeTrimPath.f4172e.a();
        this.f8746f = a12;
        aVar.e(a10);
        aVar.e(a11);
        aVar.e(a12);
        a10.f8994a.add(this);
        a11.f8994a.add(this);
        a12.f8994a.add(this);
    }

    @Override // e2.a.b
    public void a() {
        for (int i10 = 0; i10 < this.f8743b.size(); i10++) {
            this.f8743b.get(i10).a();
        }
    }

    @Override // d2.c
    public void b(List<c> list, List<c> list2) {
    }
}
