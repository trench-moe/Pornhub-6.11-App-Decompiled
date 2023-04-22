package aa;

import android.os.Parcel;
import android.os.Parcelable;
import t9.k0;

/* loaded from: classes.dex */
public final class m extends i9.a {
    public static final Parcelable.Creator<m> CREATOR = new n();

    /* renamed from: c  reason: collision with root package name */
    public final int f335c;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f336f;

    public m(int i10, boolean z10) {
        this.f335c = i10;
        this.f336f = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        int i11 = this.f335c;
        parcel.writeInt(262146);
        parcel.writeInt(i11);
        boolean z10 = this.f336f;
        parcel.writeInt(262147);
        parcel.writeInt(z10 ? 1 : 0);
        k0.z(parcel, v2);
    }
}
