package ca;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import t9.k0;

/* loaded from: classes.dex */
public final class b extends i9.a implements d9.f {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: c  reason: collision with root package name */
    public final int f3908c;

    /* renamed from: f  reason: collision with root package name */
    public int f3909f;

    /* renamed from: j  reason: collision with root package name */
    public Intent f3910j;

    public b() {
        this.f3908c = 2;
        this.f3909f = 0;
        this.f3910j = null;
    }

    public b(int i10, int i11, Intent intent) {
        this.f3908c = i10;
        this.f3909f = i11;
        this.f3910j = intent;
    }

    @Override // d9.f
    public final Status V() {
        return this.f3909f == 0 ? Status.f6855t : Status.y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        int i11 = this.f3908c;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        int i12 = this.f3909f;
        parcel.writeInt(262146);
        parcel.writeInt(i12);
        k0.q(parcel, 3, this.f3910j, i10, false);
        k0.z(parcel, v2);
    }
}
