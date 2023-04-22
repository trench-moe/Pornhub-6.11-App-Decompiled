package q5;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public class i extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f14380b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(h5.b.f10146a);

    @Override // h5.b
    public void b(MessageDigest messageDigest) {
        messageDigest.update(f14380b);
    }

    @Override // q5.e
    public Bitmap c(k5.c cVar, Bitmap bitmap, int i10, int i11) {
        Paint paint = r.f14399a;
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return r.b(cVar, bitmap, i10, i11);
        } else if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            return bitmap;
        } else {
            return bitmap;
        }
    }

    @Override // h5.b
    public boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // h5.b
    public int hashCode() {
        return -670243078;
    }
}
