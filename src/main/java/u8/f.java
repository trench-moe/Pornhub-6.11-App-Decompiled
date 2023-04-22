package u8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class f extends i9.a {
    public static final Parcelable.Creator<f> CREATOR = new u();

    /* renamed from: c  reason: collision with root package name */
    public final String f15665c;

    /* renamed from: f  reason: collision with root package name */
    public final String f15666f;

    public f(String str, String str2) {
        this.f15665c = str;
        this.f15666f = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return h9.m.a(this.f15665c, fVar.f15665c) && h9.m.a(this.f15666f, fVar.f15666f);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15665c, this.f15666f});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        t9.k0.r(parcel, 1, this.f15665c, false);
        t9.k0.r(parcel, 2, this.f15666f, false);
        t9.k0.z(parcel, v2);
    }
}
