package c9;

import android.os.Parcel;
import android.os.Parcelable;
import t9.k0;

/* loaded from: classes.dex */
public final class z extends i9.a {
    public static final Parcelable.Creator<z> CREATOR = new a0();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3902c;

    /* renamed from: f  reason: collision with root package name */
    public final String f3903f;

    /* renamed from: j  reason: collision with root package name */
    public final int f3904j;

    public z(boolean z10, String str, int i10) {
        this.f3902c = z10;
        this.f3903f = str;
        this.f3904j = l9.e.n(i10) - 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        boolean z10 = this.f3902c;
        parcel.writeInt(262145);
        parcel.writeInt(z10 ? 1 : 0);
        k0.r(parcel, 2, this.f3903f, false);
        int i11 = this.f3904j;
        parcel.writeInt(262147);
        parcel.writeInt(i11);
        k0.z(parcel, v2);
    }
}
