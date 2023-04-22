package h9;

import android.os.IBinder;
import android.os.Parcel;
import n9.a;

/* loaded from: classes2.dex */
public final class n1 extends r9.a implements p1 {
    public n1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // h9.p1
    public final int a() {
        Parcel a12 = a1(2, b1());
        int readInt = a12.readInt();
        a12.recycle();
        return readInt;
    }

    @Override // h9.p1
    public final n9.a c() {
        Parcel a12 = a1(1, b1());
        n9.a b1 = a.AbstractBinderC0227a.b1(a12.readStrongBinder());
        a12.recycle();
        return b1;
    }
}
