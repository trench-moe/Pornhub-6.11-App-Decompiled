package o5;

import com.bumptech.glide.load.data.j;
import java.io.InputStream;
import java.util.Objects;
import n5.f;
import n5.l;
import n5.m;
import n5.n;
import n5.q;

/* loaded from: classes2.dex */
public class a implements m<f, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final h5.c<Integer> f13580b = h5.c.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a  reason: collision with root package name */
    public final l<f, f> f13581a;

    /* renamed from: o5.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0236a implements n<f, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final l<f, f> f13582a = new l<>(500);

        @Override // n5.n
        public m<f, InputStream> a(q qVar) {
            return new a(this.f13582a);
        }
    }

    public a(l<f, f> lVar) {
        this.f13581a = lVar;
    }

    @Override // n5.m
    public /* bridge */ /* synthetic */ boolean a(f fVar) {
        return true;
    }

    @Override // n5.m
    public m.a<InputStream> b(f fVar, int i10, int i11, h5.d dVar) {
        f fVar2 = fVar;
        l<f, f> lVar = this.f13581a;
        if (lVar != null) {
            l.b<f> a10 = l.b.a(fVar2, 0, 0);
            f a11 = lVar.f13334a.a(a10);
            a10.b();
            f fVar3 = a11;
            if (fVar3 == null) {
                l<f, f> lVar2 = this.f13581a;
                Objects.requireNonNull(lVar2);
                lVar2.f13334a.d(l.b.a(fVar2, 0, 0), fVar2);
                return new m.a<>(fVar2, new j(fVar2, ((Integer) dVar.c(f13580b)).intValue()));
            }
            fVar2 = fVar3;
        }
        return new m.a<>(fVar2, new j(fVar2, ((Integer) dVar.c(f13580b)).intValue()));
    }
}
