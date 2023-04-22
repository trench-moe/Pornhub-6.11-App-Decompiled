package h9;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import h9.h;

/* loaded from: classes2.dex */
public final class j0 extends i9.a {
    public static final Parcelable.Creator<j0> CREATOR = new k0();

    /* renamed from: c  reason: collision with root package name */
    public final int f10335c;

    /* renamed from: f  reason: collision with root package name */
    public final IBinder f10336f;

    /* renamed from: j  reason: collision with root package name */
    public final c9.b f10337j;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f10338m;
    public final boolean n;

    public j0(int i10, IBinder iBinder, c9.b bVar, boolean z10, boolean z11) {
        this.f10335c = i10;
        this.f10336f = iBinder;
        this.f10337j = bVar;
        this.f10338m = z10;
        this.n = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            return this.f10337j.equals(j0Var.f10337j) && m.a(p0(), j0Var.p0());
        }
        return false;
    }

    public final h p0() {
        IBinder iBinder = this.f10336f;
        if (iBinder == null) {
            return null;
        }
        return h.a.b1(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        int i11 = this.f10335c;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        t9.k0.n(parcel, 2, this.f10336f, false);
        t9.k0.q(parcel, 3, this.f10337j, i10, false);
        boolean z10 = this.f10338m;
        parcel.writeInt(262148);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.n;
        parcel.writeInt(262149);
        parcel.writeInt(z11 ? 1 : 0);
        t9.k0.z(parcel, v2);
    }
}
