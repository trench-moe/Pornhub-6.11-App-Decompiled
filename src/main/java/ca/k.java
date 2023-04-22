package ca;

import android.os.Parcel;
import android.os.Parcelable;
import h9.j0;
import t9.k0;

/* loaded from: classes.dex */
public final class k extends i9.a {
    public static final Parcelable.Creator<k> CREATOR = new l();

    /* renamed from: c  reason: collision with root package name */
    public final int f3915c;

    /* renamed from: f  reason: collision with root package name */
    public final c9.b f3916f;

    /* renamed from: j  reason: collision with root package name */
    public final j0 f3917j;

    public k(int i10, c9.b bVar, j0 j0Var) {
        this.f3915c = i10;
        this.f3916f = bVar;
        this.f3917j = j0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        int i11 = this.f3915c;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        k0.q(parcel, 2, this.f3916f, i10, false);
        k0.q(parcel, 3, this.f3917j, i10, false);
        k0.z(parcel, v2);
    }
}
