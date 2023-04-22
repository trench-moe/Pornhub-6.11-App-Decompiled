package a2;

import a9.c0;
import a9.f;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import e9.l;
import ea.h;
import h9.o;
import j5.i;
import u8.e;
import u8.l0;

/* loaded from: classes.dex */
public final class c implements v5.b, l {

    /* renamed from: c  reason: collision with root package name */
    public final Object f166c;

    /* renamed from: f  reason: collision with root package name */
    public final Object f167f;

    /* renamed from: j  reason: collision with root package name */
    public final Object f168j;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3) {
        this.f166c = obj;
        this.f167f = obj2;
        this.f168j = obj3;
    }

    @Override // v5.b
    public i a(i iVar, h5.d dVar) {
        Drawable drawable = (Drawable) iVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((v5.b) this.f167f).a(q5.d.e(((BitmapDrawable) drawable).getBitmap(), (k5.c) this.f166c), dVar);
        }
        if (drawable instanceof u5.c) {
            return ((v5.b) this.f168j).a(iVar, dVar);
        }
        return null;
    }

    @Override // e9.l
    public void accept(Object obj, Object obj2) {
        String str = (String) this.f167f;
        e.d dVar = (e.d) this.f168j;
        c0 c0Var = (c0) obj;
        h hVar = (h) obj2;
        o.k(((l0) this.f166c).F != 1, "Not active connection");
        f fVar = (f) c0Var.getService();
        Parcel a12 = fVar.a1();
        a12.writeString(str);
        fVar.d1(12, a12);
        if (dVar != null) {
            f fVar2 = (f) c0Var.getService();
            Parcel a13 = fVar2.a1();
            a13.writeString(str);
            fVar2.d1(11, a13);
        }
        hVar.f9273a.p(null);
    }
}
