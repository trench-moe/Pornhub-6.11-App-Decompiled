package c9;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import n9.a;
import t9.k0;

/* loaded from: classes.dex */
public final class x extends i9.a {
    public static final Parcelable.Creator<x> CREATOR = new y();

    /* renamed from: c  reason: collision with root package name */
    public final String f3898c;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f3899f;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f3900j;

    /* renamed from: m  reason: collision with root package name */
    public final Context f3901m;
    public final boolean n;

    public x(String str, boolean z10, boolean z11, IBinder iBinder, boolean z12) {
        this.f3898c = str;
        this.f3899f = z10;
        this.f3900j = z11;
        this.f3901m = (Context) n9.b.c1(a.AbstractBinderC0227a.b1(iBinder));
        this.n = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        k0.r(parcel, 1, this.f3898c, false);
        boolean z10 = this.f3899f;
        parcel.writeInt(262146);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f3900j;
        parcel.writeInt(262147);
        parcel.writeInt(z11 ? 1 : 0);
        k0.n(parcel, 4, new n9.b(this.f3901m), false);
        boolean z12 = this.n;
        parcel.writeInt(262149);
        parcel.writeInt(z12 ? 1 : 0);
        k0.z(parcel, v2);
    }
}
