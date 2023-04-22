package w8;

import android.os.IBinder;
import android.os.Parcel;
import n9.a;

/* loaded from: classes2.dex */
public final class r extends t9.a implements i0 {
    public r(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.IImagePicker");
    }

    @Override // w8.i0
    public final n9.a b() {
        Parcel b1 = b1(2, a1());
        n9.a b12 = a.AbstractBinderC0227a.b1(b1.readStrongBinder());
        b1.recycle();
        return b12;
    }
}
