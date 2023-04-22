package s5;

import android.graphics.drawable.Drawable;
import j5.i;

/* loaded from: classes2.dex */
public class f implements h5.e<Drawable, Drawable> {
    @Override // h5.e
    public i<Drawable> a(Drawable drawable, int i10, int i11, h5.d dVar) {
        Drawable drawable2 = drawable;
        if (drawable2 != null) {
            return new d(drawable2);
        }
        return null;
    }

    @Override // h5.e
    public /* bridge */ /* synthetic */ boolean b(Drawable drawable, h5.d dVar) {
        return true;
    }
}
