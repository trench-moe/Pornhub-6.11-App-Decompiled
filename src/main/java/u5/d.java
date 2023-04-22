package u5;

import android.graphics.Bitmap;
import u5.f;

/* loaded from: classes2.dex */
public class d extends s5.c<c> {
    public d(c cVar) {
        super(cVar);
    }

    @Override // s5.c, j5.g
    public void a() {
        ((c) this.f14843c).b().prepareToDraw();
    }

    @Override // j5.i
    public void b() {
        ((c) this.f14843c).stop();
        c cVar = (c) this.f14843c;
        cVar.f15575m = true;
        f fVar = cVar.f15572c.f15580a;
        fVar.f15584c.clear();
        Bitmap bitmap = fVar.f15592l;
        if (bitmap != null) {
            fVar.f15585e.d(bitmap);
            fVar.f15592l = null;
        }
        fVar.f15586f = false;
        f.a aVar = fVar.f15589i;
        if (aVar != null) {
            fVar.d.l(aVar);
            fVar.f15589i = null;
        }
        f.a aVar2 = fVar.f15591k;
        if (aVar2 != null) {
            fVar.d.l(aVar2);
            fVar.f15591k = null;
        }
        f.a aVar3 = fVar.n;
        if (aVar3 != null) {
            fVar.d.l(aVar3);
            fVar.n = null;
        }
        fVar.f15582a.clear();
        fVar.f15590j = true;
    }

    @Override // j5.i
    public int c() {
        f fVar = ((c) this.f14843c).f15572c.f15580a;
        return fVar.f15582a.g() + fVar.f15594o;
    }

    @Override // j5.i
    public Class<c> d() {
        return c.class;
    }
}
