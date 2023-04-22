package h9;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class q0 implements k {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f10373a;

    public q0(IBinder iBinder) {
        this.f10373a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f10373a;
    }

    @Override // h9.k
    public final void w0(j jVar, e eVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder((u9.a) jVar);
            obtain.writeInt(1);
            f1.a(eVar, obtain, 0);
            this.f10373a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
            obtain2.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
