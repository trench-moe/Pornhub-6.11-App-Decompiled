package v8;

import android.os.IBinder;
import android.os.Parcel;
import n9.a;

/* loaded from: classes2.dex */
public final class k extends t9.a implements l {
    public k(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IDiscoveryManager");
    }

    @Override // v8.l
    public final n9.a d() {
        Parcel b1 = b1(5, a1());
        n9.a b12 = a.AbstractBinderC0227a.b1(b1.readStrongBinder());
        b1.recycle();
        return b12;
    }
}
