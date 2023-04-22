package q5;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes2.dex */
public class a implements h5.e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14368a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14369b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14370c;

    public a(Resources resources, h5.e eVar) {
        this.f14370c = resources;
        this.f14369b = eVar;
    }

    public a(s5.e eVar, k5.c cVar) {
        this.f14369b = eVar;
        this.f14370c = cVar;
    }

    @Override // h5.e
    public j5.i a(Object obj, int i10, int i11, h5.d dVar) {
        switch (this.f14368a) {
            case 0:
                return p.e((Resources) this.f14370c, ((h5.e) this.f14369b).a(obj, i10, i11, dVar));
            default:
                j5.i c10 = ((s5.e) this.f14369b).c((Uri) obj);
                if (c10 == null) {
                    return null;
                }
                return j.a((k5.c) this.f14370c, (Drawable) ((s5.c) c10).get(), i10, i11);
        }
    }

    @Override // h5.e
    public boolean b(Object obj, h5.d dVar) {
        switch (this.f14368a) {
            case 0:
                return ((h5.e) this.f14369b).b(obj, dVar);
            default:
                return "android.resource".equals(((Uri) obj).getScheme());
        }
    }
}
