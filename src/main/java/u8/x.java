package u8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class x extends i9.a {
    public static final Parcelable.Creator<x> CREATOR = new y();

    /* renamed from: c  reason: collision with root package name */
    public final v f15765c;

    /* renamed from: f  reason: collision with root package name */
    public final v f15766f;

    public x(v vVar, v vVar2) {
        this.f15765c = vVar;
        this.f15766f = vVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return a9.a.h(this.f15765c, xVar.f15765c) && a9.a.h(this.f15766f, xVar.f15766f);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15765c, this.f15766f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        t9.k0.q(parcel, 2, this.f15765c, i10, false);
        t9.k0.q(parcel, 3, this.f15766f, i10, false);
        t9.k0.z(parcel, v2);
    }
}
