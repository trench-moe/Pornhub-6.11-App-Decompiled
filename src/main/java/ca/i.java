package ca;

import android.os.Parcel;
import android.os.Parcelable;
import h9.h0;
import t9.k0;

/* loaded from: classes.dex */
public final class i extends i9.a {
    public static final Parcelable.Creator<i> CREATOR = new j();

    /* renamed from: c  reason: collision with root package name */
    public final int f3913c;

    /* renamed from: f  reason: collision with root package name */
    public final h0 f3914f;

    public i(int i10, h0 h0Var) {
        this.f3913c = i10;
        this.f3914f = h0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        int i11 = this.f3913c;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        k0.q(parcel, 2, this.f3914f, i10, false);
        k0.z(parcel, v2);
    }
}
