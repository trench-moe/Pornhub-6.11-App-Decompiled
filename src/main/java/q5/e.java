package q5;

import android.content.Context;
import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public abstract class e implements h5.g<Bitmap> {
    @Override // h5.g
    public final j5.i<Bitmap> a(Context context, j5.i<Bitmap> iVar, int i10, int i11) {
        if (!d6.l.j(i10, i11)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        k5.c cVar = com.bumptech.glide.b.b(context).f5619c;
        Bitmap bitmap = iVar.get();
        if (i10 == Integer.MIN_VALUE) {
            i10 = bitmap.getWidth();
        }
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getHeight();
        }
        Bitmap c10 = c(cVar, bitmap, i10, i11);
        return bitmap.equals(c10) ? iVar : d.e(c10, cVar);
    }

    public abstract Bitmap c(k5.c cVar, Bitmap bitmap, int i10, int i11);
}
