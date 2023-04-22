package h9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes2.dex */
public final class l0 extends i9.a {
    public static final Parcelable.Creator<l0> CREATOR = new m0();

    /* renamed from: c  reason: collision with root package name */
    public final int f10352c;

    /* renamed from: f  reason: collision with root package name */
    public final int f10353f;

    /* renamed from: j  reason: collision with root package name */
    public final int f10354j;
    @Deprecated

    /* renamed from: m  reason: collision with root package name */
    public final Scope[] f10355m;

    public l0(int i10, int i11, int i12, Scope[] scopeArr) {
        this.f10352c = i10;
        this.f10353f = i11;
        this.f10354j = i12;
        this.f10355m = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        int i11 = this.f10352c;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        int i12 = this.f10353f;
        parcel.writeInt(262146);
        parcel.writeInt(i12);
        int i13 = this.f10354j;
        parcel.writeInt(262147);
        parcel.writeInt(i13);
        t9.k0.t(parcel, 4, this.f10355m, i10, false);
        t9.k0.z(parcel, v2);
    }
}
