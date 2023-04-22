package u8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class h extends i9.a {

    /* renamed from: c  reason: collision with root package name */
    public final long f15675c;

    /* renamed from: f  reason: collision with root package name */
    public final long f15676f;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f15677j;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f15678m;
    public static final a9.b n = new a9.b("MediaLiveSeekableRange");
    public static final Parcelable.Creator<h> CREATOR = new p0();

    public h(long j10, long j11, boolean z10, boolean z11) {
        this.f15675c = Math.max(j10, 0L);
        this.f15676f = Math.max(j11, 0L);
        this.f15677j = z10;
        this.f15678m = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return this.f15675c == hVar.f15675c && this.f15676f == hVar.f15676f && this.f15677j == hVar.f15677j && this.f15678m == hVar.f15678m;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f15675c), Long.valueOf(this.f15676f), Boolean.valueOf(this.f15677j), Boolean.valueOf(this.f15678m)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        long j10 = this.f15675c;
        parcel.writeInt(524290);
        parcel.writeLong(j10);
        long j11 = this.f15676f;
        parcel.writeInt(524291);
        parcel.writeLong(j11);
        boolean z10 = this.f15677j;
        parcel.writeInt(262148);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f15678m;
        parcel.writeInt(262149);
        parcel.writeInt(z11 ? 1 : 0);
        t9.k0.z(parcel, v2);
    }
}
