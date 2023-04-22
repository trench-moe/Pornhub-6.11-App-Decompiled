package u8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class c extends i9.a {

    /* renamed from: c  reason: collision with root package name */
    public final long f15643c;

    /* renamed from: f  reason: collision with root package name */
    public final long f15644f;

    /* renamed from: j  reason: collision with root package name */
    public final String f15645j;

    /* renamed from: m  reason: collision with root package name */
    public final String f15646m;
    public final long n;

    /* renamed from: t  reason: collision with root package name */
    public static final a9.b f15642t = new a9.b("AdBreakStatus");
    public static final Parcelable.Creator<c> CREATOR = new r0();

    public c(long j10, long j11, String str, String str2, long j12) {
        this.f15643c = j10;
        this.f15644f = j11;
        this.f15645j = str;
        this.f15646m = str2;
        this.n = j12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            return this.f15643c == cVar.f15643c && this.f15644f == cVar.f15644f && a9.a.h(this.f15645j, cVar.f15645j) && a9.a.h(this.f15646m, cVar.f15646m) && this.n == cVar.n;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f15643c), Long.valueOf(this.f15644f), this.f15645j, this.f15646m, Long.valueOf(this.n)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        long j10 = this.f15643c;
        parcel.writeInt(524290);
        parcel.writeLong(j10);
        long j11 = this.f15644f;
        parcel.writeInt(524291);
        parcel.writeLong(j11);
        t9.k0.r(parcel, 4, this.f15645j, false);
        t9.k0.r(parcel, 5, this.f15646m, false);
        long j12 = this.n;
        parcel.writeInt(524294);
        parcel.writeLong(j12);
        t9.k0.z(parcel, v2);
    }
}
