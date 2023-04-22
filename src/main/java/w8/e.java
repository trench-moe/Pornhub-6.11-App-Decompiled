package w8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class e extends i9.a {
    public static final Parcelable.Creator<e> CREATOR = new v0();

    /* renamed from: c  reason: collision with root package name */
    public final String f16976c;

    /* renamed from: f  reason: collision with root package name */
    public final int f16977f;

    /* renamed from: j  reason: collision with root package name */
    public final String f16978j;

    public e(String str, int i10, String str2) {
        this.f16976c = str;
        this.f16977f = i10;
        this.f16978j = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        t9.k0.r(parcel, 2, this.f16976c, false);
        int i11 = this.f16977f;
        parcel.writeInt(262147);
        parcel.writeInt(i11);
        t9.k0.r(parcel, 4, this.f16978j, false);
        t9.k0.z(parcel, v2);
    }
}
