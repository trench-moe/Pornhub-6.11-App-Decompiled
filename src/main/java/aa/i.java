package aa;

import android.os.Parcel;
import android.os.Parcelable;
import t9.k0;

/* loaded from: classes.dex */
public final class i extends i9.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: c  reason: collision with root package name */
    public final long f330c;

    /* renamed from: f  reason: collision with root package name */
    public final a[] f331f;

    /* renamed from: j  reason: collision with root package name */
    public final int f332j;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f333m;

    public i(long j10, a[] aVarArr, int i10, boolean z10) {
        this.f330c = j10;
        this.f331f = aVarArr;
        this.f333m = z10;
        if (z10) {
            this.f332j = i10;
        } else {
            this.f332j = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        long j10 = this.f330c;
        parcel.writeInt(524290);
        parcel.writeLong(j10);
        k0.t(parcel, 3, this.f331f, i10, false);
        int i11 = this.f332j;
        parcel.writeInt(262148);
        parcel.writeInt(i11);
        boolean z10 = this.f333m;
        parcel.writeInt(262149);
        parcel.writeInt(z10 ? 1 : 0);
        k0.z(parcel, v2);
    }
}
