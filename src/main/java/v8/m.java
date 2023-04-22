package v8;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class m extends t9.a implements o {
    public m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    @Override // v8.o
    public final int Y0(Intent intent, int i10, int i11) {
        Parcel a12 = a1();
        t9.v.b(a12, intent);
        a12.writeInt(i10);
        a12.writeInt(i11);
        Parcel b1 = b1(2, a12);
        int readInt = b1.readInt();
        b1.recycle();
        return readInt;
    }

    @Override // v8.o
    public final void b() {
        c1(1, a1());
    }

    @Override // v8.o
    public final IBinder g0(Intent intent) {
        Parcel a12 = a1();
        t9.v.b(a12, intent);
        Parcel b1 = b1(3, a12);
        IBinder readStrongBinder = b1.readStrongBinder();
        b1.recycle();
        return readStrongBinder;
    }

    @Override // v8.o
    public final void zzh() {
        c1(4, a1());
    }
}
