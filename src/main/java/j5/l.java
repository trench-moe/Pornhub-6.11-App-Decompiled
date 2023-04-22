package j5;

import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.c;
import n5.m;

/* loaded from: classes2.dex */
public class l implements d.a<Object> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m.a f11415c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ com.bumptech.glide.load.engine.k f11416f;

    public l(com.bumptech.glide.load.engine.k kVar, m.a aVar) {
        this.f11416f = kVar;
        this.f11415c = aVar;
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(Exception exc) {
        com.bumptech.glide.load.engine.k kVar = this.f11416f;
        m.a<?> aVar = this.f11415c;
        m.a<?> aVar2 = kVar.f5831t;
        if (aVar2 != null && aVar2 == aVar) {
            com.bumptech.glide.load.engine.k kVar2 = this.f11416f;
            m.a aVar3 = this.f11415c;
            c.a aVar4 = kVar2.f5828f;
            h5.b bVar = kVar2.f5832u;
            com.bumptech.glide.load.data.d<Data> dVar = aVar3.f13340c;
            aVar4.d(bVar, exc, dVar, dVar.d());
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        com.bumptech.glide.load.engine.k kVar = this.f11416f;
        m.a<?> aVar = this.f11415c;
        m.a<?> aVar2 = kVar.f5831t;
        if (aVar2 != null && aVar2 == aVar) {
            com.bumptech.glide.load.engine.k kVar2 = this.f11416f;
            m.a aVar3 = this.f11415c;
            d dVar = kVar2.f5827c.f5765p;
            if (obj != null && dVar.c(aVar3.f13340c.d())) {
                kVar2.n = obj;
                kVar2.f5828f.b();
                return;
            }
            c.a aVar4 = kVar2.f5828f;
            h5.b bVar = aVar3.f13338a;
            com.bumptech.glide.load.data.d<Data> dVar2 = aVar3.f13340c;
            aVar4.c(bVar, obj, dVar2, dVar2.d(), kVar2.f5832u);
        }
    }
}
