package u8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class v extends i9.a {
    public static final Parcelable.Creator<v> CREATOR = new w();

    /* renamed from: c  reason: collision with root package name */
    public final float f15762c;

    /* renamed from: f  reason: collision with root package name */
    public final float f15763f;

    /* renamed from: j  reason: collision with root package name */
    public final float f15764j;

    public v(float f10, float f11, float f12) {
        this.f15762c = f10;
        this.f15763f = f11;
        this.f15764j = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return this.f15762c == vVar.f15762c && this.f15763f == vVar.f15763f && this.f15764j == vVar.f15764j;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f15762c), Float.valueOf(this.f15763f), Float.valueOf(this.f15764j)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        float f10 = this.f15762c;
        parcel.writeInt(262146);
        parcel.writeFloat(f10);
        float f11 = this.f15763f;
        parcel.writeInt(262147);
        parcel.writeFloat(f11);
        float f12 = this.f15764j;
        parcel.writeInt(262148);
        parcel.writeFloat(f12);
        t9.k0.z(parcel, v2);
    }
}
