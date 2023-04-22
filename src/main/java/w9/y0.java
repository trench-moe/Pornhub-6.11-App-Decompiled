package w9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class y0 extends i9.a {
    public static final Parcelable.Creator<y0> CREATOR = new z0();

    /* renamed from: c  reason: collision with root package name */
    public final long f17372c;

    /* renamed from: f  reason: collision with root package name */
    public final long f17373f;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f17374j;

    /* renamed from: m  reason: collision with root package name */
    public final String f17375m;
    public final String n;

    /* renamed from: t  reason: collision with root package name */
    public final String f17376t;

    /* renamed from: u  reason: collision with root package name */
    public final Bundle f17377u;

    /* renamed from: w  reason: collision with root package name */
    public final String f17378w;

    public y0(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f17372c = j10;
        this.f17373f = j11;
        this.f17374j = z10;
        this.f17375m = str;
        this.n = str2;
        this.f17376t = str3;
        this.f17377u = bundle;
        this.f17378w = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        long j10 = this.f17372c;
        parcel.writeInt(524289);
        parcel.writeLong(j10);
        long j11 = this.f17373f;
        parcel.writeInt(524290);
        parcel.writeLong(j11);
        boolean z10 = this.f17374j;
        parcel.writeInt(262147);
        parcel.writeInt(z10 ? 1 : 0);
        t9.k0.r(parcel, 4, this.f17375m, false);
        t9.k0.r(parcel, 5, this.n, false);
        t9.k0.r(parcel, 6, this.f17376t, false);
        t9.k0.l(parcel, 7, this.f17377u, false);
        t9.k0.r(parcel, 8, this.f17378w, false);
        t9.k0.z(parcel, v2);
    }
}
