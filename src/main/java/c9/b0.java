package c9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import h9.n1;
import h9.o1;
import h9.p1;
import t9.k0;

/* loaded from: classes.dex */
public final class b0 extends i9.a {
    public static final Parcelable.Creator<b0> CREATOR = new c0();

    /* renamed from: c  reason: collision with root package name */
    public final String f3861c;

    /* renamed from: f  reason: collision with root package name */
    public final s f3862f;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3863j;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f3864m;

    public b0(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f3861c = str;
        t tVar = null;
        if (iBinder != null) {
            try {
                int i10 = o1.f10365a;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
                n9.a c10 = (queryLocalInterface instanceof p1 ? (p1) queryLocalInterface : new n1(iBinder)).c();
                byte[] bArr = c10 == null ? null : (byte[]) n9.b.c1(c10);
                if (bArr != null) {
                    tVar = new t(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f3862f = tVar;
        this.f3863j = z10;
        this.f3864m = z11;
    }

    public b0(String str, s sVar, boolean z10, boolean z11) {
        this.f3861c = str;
        this.f3862f = sVar;
        this.f3863j = z10;
        this.f3864m = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        k0.r(parcel, 1, this.f3861c, false);
        s sVar = this.f3862f;
        if (sVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            sVar = null;
        }
        k0.n(parcel, 2, sVar, false);
        boolean z10 = this.f3863j;
        parcel.writeInt(262147);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f3864m;
        parcel.writeInt(262148);
        parcel.writeInt(z11 ? 1 : 0);
        k0.z(parcel, v2);
    }
}
