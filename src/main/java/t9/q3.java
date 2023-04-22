package t9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class q3 extends a implements r3 {
    public q3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
    }

    @Override // t9.r3
    public final void E0(String str, Bundle bundle, int i10) {
        Parcel a12 = a1();
        a12.writeString(str);
        v.b(a12, bundle);
        a12.writeInt(i10);
        c1(6, a12);
    }

    @Override // t9.r3
    public final void M(String str, Bundle bundle) {
        Parcel a12 = a1();
        a12.writeString(str);
        v.b(a12, bundle);
        c1(4, a12);
    }

    @Override // t9.r3
    public final void Z(String str, Bundle bundle) {
        Parcel a12 = a1();
        a12.writeString(str);
        v.b(a12, bundle);
        c1(3, a12);
    }

    @Override // t9.r3
    public final void h0(String str, Bundle bundle) {
        Parcel a12 = a1();
        a12.writeString(str);
        v.b(a12, bundle);
        c1(2, a12);
    }

    @Override // t9.r3
    public final void p0(String str, Bundle bundle) {
        Parcel a12 = a1();
        a12.writeString(str);
        v.b(a12, bundle);
        c1(1, a12);
    }
}
