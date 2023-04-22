package x8;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import t9.v;

/* loaded from: classes2.dex */
public final class e extends t9.a implements g {
    public e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
    }

    @Override // x8.g
    public final Bitmap F(Uri uri) {
        Parcel a12 = a1();
        v.b(a12, uri);
        Parcel b1 = b1(1, a12);
        Bitmap bitmap = (Bitmap) v.a(b1, Bitmap.CREATOR);
        b1.recycle();
        return bitmap;
    }
}
