package h9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class p0 extends u9.a implements j {
    public p0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // u9.a
    public final boolean a1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            y0 y0Var = (y0) this;
            o.i(y0Var.f10393a, "onPostInitComplete can be called only once per call to getRemoteService");
            y0Var.f10393a.onPostInitHandler(parcel.readInt(), parcel.readStrongBinder(), (Bundle) u9.b.a(parcel, Bundle.CREATOR), y0Var.f10394b);
            y0Var.f10393a = null;
        } else if (i10 == 2) {
            parcel.readInt();
            Bundle bundle = (Bundle) u9.b.a(parcel, Bundle.CREATOR);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else if (i10 != 3) {
            return false;
        } else {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            c1 c1Var = (c1) u9.b.a(parcel, c1.CREATOR);
            y0 y0Var2 = (y0) this;
            b bVar = y0Var2.f10393a;
            o.i(bVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            Objects.requireNonNull(c1Var, "null reference");
            b.zzj(bVar, c1Var);
            Bundle bundle2 = c1Var.f10294c;
            o.i(y0Var2.f10393a, "onPostInitComplete can be called only once per call to getRemoteService");
            y0Var2.f10393a.onPostInitHandler(readInt, readStrongBinder, bundle2, y0Var2.f10394b);
            y0Var2.f10393a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
