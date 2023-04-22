package d2;

import android.graphics.Path;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import e2.a;
import java.util.List;

/* loaded from: classes.dex */
public class q implements m, a.b {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f8733b;

    /* renamed from: c  reason: collision with root package name */
    public final b2.l f8734c;
    public final e2.a<?, Path> d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8735e;

    /* renamed from: a  reason: collision with root package name */
    public final Path f8732a = new Path();

    /* renamed from: f  reason: collision with root package name */
    public b f8736f = new b();

    public q(b2.l lVar, com.airbnb.lottie.model.layer.a aVar, i2.j jVar) {
        this.f8733b = jVar.d;
        this.f8734c = lVar;
        e2.a<?, Path> a10 = jVar.f10491c.a();
        this.d = a10;
        aVar.e(a10);
        a10.f8994a.add(this);
    }

    @Override // e2.a.b
    public void a() {
        this.f8735e = false;
        this.f8734c.invalidateSelf();
    }

    @Override // d2.c
    public void b(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.f8744c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f8736f.f8645a.add(sVar);
                    sVar.f8743b.add(this);
                }
            }
        }
    }

    @Override // d2.m
    public Path g() {
        if (this.f8735e) {
            return this.f8732a;
        }
        this.f8732a.reset();
        if (this.f8733b) {
            this.f8735e = true;
            return this.f8732a;
        }
        this.f8732a.set(this.d.e());
        this.f8732a.setFillType(Path.FillType.EVEN_ODD);
        this.f8736f.c(this.f8732a);
        this.f8735e = true;
        return this.f8732a;
    }
}
