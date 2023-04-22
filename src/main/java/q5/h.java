package q5;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public class h extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f14379b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(h5.b.f10146a);

    @Override // h5.b
    public void b(MessageDigest messageDigest) {
        messageDigest.update(f14379b);
    }

    @Override // q5.e
    public Bitmap c(k5.c cVar, Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        Paint paint = r.f14399a;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f10 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            width = i11 / bitmap.getHeight();
            f10 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f10 + 0.5f), (int) (height + 0.5f));
        Bitmap e10 = cVar.e(i10, i11, r.c(bitmap));
        e10.setHasAlpha(bitmap.hasAlpha());
        r.a(bitmap, e10, matrix);
        return e10;
    }

    @Override // h5.b
    public boolean equals(Object obj) {
        return obj instanceof h;
    }

    @Override // h5.b
    public int hashCode() {
        return -599754482;
    }
}
