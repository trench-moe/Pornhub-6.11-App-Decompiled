package h9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class l extends i9.a {
    public static final Parcelable.Creator<l> CREATOR = new e0();

    /* renamed from: c  reason: collision with root package name */
    public final int f10345c;

    /* renamed from: f  reason: collision with root package name */
    public final int f10346f;

    /* renamed from: j  reason: collision with root package name */
    public final int f10347j;

    /* renamed from: m  reason: collision with root package name */
    public final long f10348m;
    public final long n;

    /* renamed from: t  reason: collision with root package name */
    public final String f10349t;

    /* renamed from: u  reason: collision with root package name */
    public final String f10350u;

    /* renamed from: w  reason: collision with root package name */
    public final int f10351w;
    public final int y;

    public l(int i10, int i11, int i12, long j10, long j11, String str, String str2, int i13, int i14) {
        this.f10345c = i10;
        this.f10346f = i11;
        this.f10347j = i12;
        this.f10348m = j10;
        this.n = j11;
        this.f10349t = str;
        this.f10350u = str2;
        this.f10351w = i13;
        this.y = i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        int i11 = this.f10345c;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        int i12 = this.f10346f;
        parcel.writeInt(262146);
        parcel.writeInt(i12);
        int i13 = this.f10347j;
        parcel.writeInt(262147);
        parcel.writeInt(i13);
        long j10 = this.f10348m;
        parcel.writeInt(524292);
        parcel.writeLong(j10);
        long j11 = this.n;
        parcel.writeInt(524293);
        parcel.writeLong(j11);
        t9.k0.r(parcel, 6, this.f10349t, false);
        t9.k0.r(parcel, 7, this.f10350u, false);
        int i14 = this.f10351w;
        parcel.writeInt(262152);
        parcel.writeInt(i14);
        int i15 = this.y;
        parcel.writeInt(262153);
        parcel.writeInt(i15);
        t9.k0.z(parcel, v2);
    }
}
