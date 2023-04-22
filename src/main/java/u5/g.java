package u5;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class g implements h5.e<g5.a, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final k5.c f15601a;

    public g(k5.c cVar) {
        this.f15601a = cVar;
    }

    @Override // h5.e
    public j5.i<Bitmap> a(g5.a aVar, int i10, int i11, h5.d dVar) {
        return q5.d.e(aVar.a(), this.f15601a);
    }

    @Override // h5.e
    public /* bridge */ /* synthetic */ boolean b(g5.a aVar, h5.d dVar) {
        return true;
    }
}
