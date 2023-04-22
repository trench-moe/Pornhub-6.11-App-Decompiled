package u7;

import android.os.Parcel;
import android.os.Parcelable;
import o7.a;
import w6.d0;
import w6.y;

/* loaded from: classes2.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final long f15613c;

    /* renamed from: f  reason: collision with root package name */
    public final long f15614f;

    /* renamed from: j  reason: collision with root package name */
    public final long f15615j;

    /* renamed from: m  reason: collision with root package name */
    public final long f15616m;
    public final long n;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(long j10, long j11, long j12, long j13, long j14) {
        this.f15613c = j10;
        this.f15614f = j11;
        this.f15615j = j12;
        this.f15616m = j13;
        this.n = j14;
    }

    public b(Parcel parcel, a aVar) {
        this.f15613c = parcel.readLong();
        this.f15614f = parcel.readLong();
        this.f15615j = parcel.readLong();
        this.f15616m = parcel.readLong();
        this.n = parcel.readLong();
    }

    @Override // o7.a.b
    public /* synthetic */ y E() {
        return null;
    }

    @Override // o7.a.b
    public /* synthetic */ void J(d0.b bVar) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f15613c == bVar.f15613c && this.f15614f == bVar.f15614f && this.f15615j == bVar.f15615j && this.f15616m == bVar.f15616m && this.n == bVar.n;
        }
        return false;
    }

    public int hashCode() {
        int H = a0.b.H(this.f15614f);
        int H2 = a0.b.H(this.f15615j);
        int H3 = a0.b.H(this.f15616m);
        return a0.b.H(this.n) + ((H3 + ((H2 + ((H + ((a0.b.H(this.f15613c) + 527) * 31)) * 31)) * 31)) * 31);
    }

    @Override // o7.a.b
    public /* synthetic */ byte[] i0() {
        return null;
    }

    public String toString() {
        long j10 = this.f15613c;
        long j11 = this.f15614f;
        long j12 = this.f15615j;
        long j13 = this.f15616m;
        long j14 = this.n;
        StringBuilder sb2 = new StringBuilder(218);
        sb2.append("Motion photo metadata: photoStartPosition=");
        sb2.append(j10);
        sb2.append(", photoSize=");
        sb2.append(j11);
        sb2.append(", photoPresentationTimestampUs=");
        sb2.append(j12);
        sb2.append(", videoStartPosition=");
        sb2.append(j13);
        sb2.append(", videoSize=");
        sb2.append(j14);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f15613c);
        parcel.writeLong(this.f15614f);
        parcel.writeLong(this.f15615j);
        parcel.writeLong(this.f15616m);
        parcel.writeLong(this.n);
    }
}
