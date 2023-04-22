package v7;

import android.os.Parcel;
import android.os.Parcelable;
import k8.t;

/* loaded from: classes2.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final long f16056c;

    /* renamed from: f  reason: collision with root package name */
    public final long f16057f;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    public g(long j10, long j11) {
        this.f16056c = j10;
        this.f16057f = j11;
    }

    public g(long j10, long j11, a aVar) {
        this.f16056c = j10;
        this.f16057f = j11;
    }

    public static long a(t tVar, long j10) {
        long s10 = tVar.s();
        if ((128 & s10) != 0) {
            return 8589934591L & ((((s10 & 1) << 32) | tVar.t()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f16056c);
        parcel.writeLong(this.f16057f);
    }
}
