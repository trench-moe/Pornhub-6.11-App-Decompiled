package h9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class c1 extends i9.a {
    public static final Parcelable.Creator<c1> CREATOR = new d1();

    /* renamed from: c  reason: collision with root package name */
    public Bundle f10294c;

    /* renamed from: f  reason: collision with root package name */
    public c9.d[] f10295f;

    /* renamed from: j  reason: collision with root package name */
    public int f10296j;

    /* renamed from: m  reason: collision with root package name */
    public d f10297m;

    public c1() {
    }

    public c1(Bundle bundle, c9.d[] dVarArr, int i10, d dVar) {
        this.f10294c = bundle;
        this.f10295f = dVarArr;
        this.f10296j = i10;
        this.f10297m = dVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        t9.k0.l(parcel, 1, this.f10294c, false);
        t9.k0.t(parcel, 2, this.f10295f, i10, false);
        int i11 = this.f10296j;
        parcel.writeInt(262147);
        parcel.writeInt(i11);
        t9.k0.q(parcel, 4, this.f10297m, i10, false);
        t9.k0.z(parcel, v2);
    }
}
