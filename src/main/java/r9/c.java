package r9;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class c extends a implements e {
    public c(IBinder iBinder) {
        super(iBinder);
    }

    @Override // r9.e
    public final boolean L(boolean z10) {
        Parcel b1 = b1();
        int i10 = b.f14736a;
        boolean z11 = true;
        b1.writeInt(1);
        Parcel c12 = c1(2, b1);
        if (c12.readInt() == 0) {
            z11 = false;
        }
        c12.recycle();
        return z11;
    }

    @Override // r9.e
    public final String a() {
        Parcel c12 = c1(1, b1());
        String readString = c12.readString();
        c12.recycle();
        return readString;
    }
}
