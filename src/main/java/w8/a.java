package w8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* loaded from: classes2.dex */
public class a extends i9.a {

    /* renamed from: c  reason: collision with root package name */
    public final String f16948c;

    /* renamed from: f  reason: collision with root package name */
    public final String f16949f;

    /* renamed from: j  reason: collision with root package name */
    public final i0 f16950j;

    /* renamed from: m  reason: collision with root package name */
    public final f f16951m;
    public final boolean n;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f16952t;

    /* renamed from: u  reason: collision with root package name */
    public static final a9.b f16947u = new a9.b("CastMediaOptions");
    public static final Parcelable.Creator<a> CREATOR = new i();

    public a(String str, String str2, IBinder iBinder, f fVar, boolean z10, boolean z11) {
        i0 rVar;
        this.f16948c = str;
        this.f16949f = str2;
        if (iBinder == null) {
            rVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.IImagePicker");
            rVar = queryLocalInterface instanceof i0 ? (i0) queryLocalInterface : new r(iBinder);
        }
        this.f16950j = rVar;
        this.f16951m = fVar;
        this.n = z10;
        this.f16952t = z11;
    }

    public c p0() {
        i0 i0Var = this.f16950j;
        if (i0Var != null) {
            try {
                return (c) n9.b.c1(i0Var.b());
            } catch (RemoteException e10) {
                f16947u.b(e10, "Unable to call %s on %s.", "getWrappedClientObject", i0.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        t9.k0.r(parcel, 2, this.f16948c, false);
        t9.k0.r(parcel, 3, this.f16949f, false);
        i0 i0Var = this.f16950j;
        t9.k0.n(parcel, 4, i0Var == null ? null : i0Var.asBinder(), false);
        t9.k0.q(parcel, 5, this.f16951m, i10, false);
        boolean z10 = this.n;
        parcel.writeInt(262150);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f16952t;
        parcel.writeInt(262151);
        parcel.writeInt(z11 ? 1 : 0);
        t9.k0.z(parcel, v2);
    }
}
