package v8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class l0 extends t9.a implements n0 {
    public l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastSession");
    }

    @Override // v8.n0
    public final void S0(Bundle bundle) {
        Parcel a12 = a1();
        t9.v.b(a12, null);
        c1(1, a12);
    }

    @Override // v8.n0
    public final void T(u8.d dVar, String str, String str2, boolean z10) {
        Parcel a12 = a1();
        t9.v.b(a12, dVar);
        a12.writeString(str);
        a12.writeString(str2);
        a12.writeInt(z10 ? 1 : 0);
        c1(4, a12);
    }

    @Override // v8.n0
    public final void V0(boolean z10, int i10) {
        Parcel a12 = a1();
        int i11 = t9.v.f15358a;
        a12.writeInt(z10 ? 1 : 0);
        a12.writeInt(0);
        c1(6, a12);
    }

    @Override // v8.n0
    public final void i0(c9.b bVar) {
        Parcel a12 = a1();
        t9.v.b(a12, bVar);
        c1(3, a12);
    }

    @Override // v8.n0
    public final void p(int i10) {
        Parcel a12 = a1();
        a12.writeInt(i10);
        c1(2, a12);
    }

    @Override // v8.n0
    public final void zzg(int i10) {
        Parcel a12 = a1();
        a12.writeInt(i10);
        c1(5, a12);
    }
}
