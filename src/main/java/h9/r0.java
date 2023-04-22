package h9;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class r0 extends r9.a implements t0 {
    public r0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // h9.t0
    public final boolean K0(c9.b0 b0Var, n9.a aVar) {
        Parcel b1 = b1();
        int i10 = u9.b.f15771a;
        boolean z10 = true;
        b1.writeInt(1);
        b0Var.writeToParcel(b1, 0);
        u9.b.b(b1, aVar);
        Parcel a12 = a1(5, b1);
        if (a12.readInt() == 0) {
            z10 = false;
        }
        a12.recycle();
        return z10;
    }

    @Override // h9.t0
    public final c9.z U(c9.x xVar) {
        Parcel b1 = b1();
        int i10 = u9.b.f15771a;
        b1.writeInt(1);
        xVar.writeToParcel(b1, 0);
        Parcel a12 = a1(6, b1);
        c9.z zVar = (c9.z) u9.b.a(a12, c9.z.CREATOR);
        a12.recycle();
        return zVar;
    }

    @Override // h9.t0
    public final boolean b() {
        Parcel a12 = a1(7, b1());
        int i10 = u9.b.f15771a;
        boolean z10 = a12.readInt() != 0;
        a12.recycle();
        return z10;
    }
}
