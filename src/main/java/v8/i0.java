package v8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class i0 extends t9.a implements k0 {
    public i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    @Override // v8.k0
    public final t b() {
        t sVar;
        Parcel b1 = b1(5, a1());
        IBinder readStrongBinder = b1.readStrongBinder();
        if (readStrongBinder == null) {
            sVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            sVar = queryLocalInterface instanceof t ? (t) queryLocalInterface : new s(readStrongBinder);
        }
        b1.recycle();
        return sVar;
    }

    @Override // v8.k0
    public final Bundle d() {
        Parcel b1 = b1(1, a1());
        Bundle bundle = (Bundle) t9.v.a(b1, Bundle.CREATOR);
        b1.recycle();
        return bundle;
    }

    @Override // v8.k0
    public final l e() {
        l kVar;
        Parcel b1 = b1(6, a1());
        IBinder readStrongBinder = b1.readStrongBinder();
        if (readStrongBinder == null) {
            kVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            kVar = queryLocalInterface instanceof l ? (l) queryLocalInterface : new k(readStrongBinder);
        }
        b1.recycle();
        return kVar;
    }

    @Override // v8.k0
    public final boolean zzi() {
        Parcel b1 = b1(12, a1());
        int i10 = t9.v.f15358a;
        boolean z10 = b1.readInt() != 0;
        b1.recycle();
        return z10;
    }
}
