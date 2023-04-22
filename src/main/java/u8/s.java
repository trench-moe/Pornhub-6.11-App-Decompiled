package u8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class s extends i9.a {

    /* renamed from: c  reason: collision with root package name */
    public int f15759c;

    /* renamed from: f  reason: collision with root package name */
    public int f15760f;

    /* renamed from: j  reason: collision with root package name */
    public int f15761j;

    /* renamed from: m  reason: collision with root package name */
    public static final a9.b f15758m = new a9.b("VideoInfo");
    public static final Parcelable.Creator<s> CREATOR = new c1();

    public s(int i10, int i11, int i12) {
        this.f15759c = i10;
        this.f15760f = i11;
        this.f15761j = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f15760f == sVar.f15760f && this.f15759c == sVar.f15759c && this.f15761j == sVar.f15761j;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15760f), Integer.valueOf(this.f15759c), Integer.valueOf(this.f15761j)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        int i11 = this.f15759c;
        parcel.writeInt(262146);
        parcel.writeInt(i11);
        int i12 = this.f15760f;
        parcel.writeInt(262147);
        parcel.writeInt(i12);
        int i13 = this.f15761j;
        parcel.writeInt(262148);
        parcel.writeInt(i13);
        t9.k0.z(parcel, v2);
    }
}
