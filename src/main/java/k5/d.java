package k5;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public class d implements c {
    @Override // k5.c
    public void a(int i10) {
    }

    @Override // k5.c
    public void b() {
    }

    @Override // k5.c
    public Bitmap c(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // k5.c
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // k5.c
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return Bitmap.createBitmap(i10, i11, config);
    }
}
