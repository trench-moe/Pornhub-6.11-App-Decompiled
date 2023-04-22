package q5;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public class m extends e {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f14384b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(h5.b.f10146a);

    @Override // h5.b
    public void b(MessageDigest messageDigest) {
        messageDigest.update(f14384b);
    }

    @Override // q5.e
    public Bitmap c(k5.c cVar, Bitmap bitmap, int i10, int i11) {
        return r.b(cVar, bitmap, i10, i11);
    }

    @Override // h5.b
    public boolean equals(Object obj) {
        return obj instanceof m;
    }

    @Override // h5.b
    public int hashCode() {
        return 1572326941;
    }
}
