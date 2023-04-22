package w8;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class b extends i9.a {
    public static final Parcelable.Creator<b> CREATOR = new l0();

    /* renamed from: c  reason: collision with root package name */
    public final int f16954c;

    /* renamed from: f  reason: collision with root package name */
    public final int f16955f;

    /* renamed from: j  reason: collision with root package name */
    public final int f16956j;

    public b(int i10, int i11, int i12) {
        this.f16954c = i10;
        this.f16955f = i11;
        this.f16956j = i12;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        int i11 = this.f16954c;
        parcel.writeInt(262146);
        parcel.writeInt(i11);
        int i12 = this.f16955f;
        parcel.writeInt(262147);
        parcel.writeInt(i12);
        int i13 = this.f16956j;
        parcel.writeInt(262148);
        parcel.writeInt(i13);
        t9.k0.z(parcel, v2);
    }
}
