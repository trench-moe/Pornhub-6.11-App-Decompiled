package s9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f14928a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14929b;

    public a(IBinder iBinder, String str) {
        this.f14928a = iBinder;
        this.f14929b = str;
    }

    public final Parcel a1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f14929b);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f14928a;
    }
}
