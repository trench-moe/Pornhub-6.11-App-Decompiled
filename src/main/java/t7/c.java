package t7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k8.c0;

/* loaded from: classes2.dex */
public final class c extends h {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final String f15134f;

    /* renamed from: j  reason: collision with root package name */
    public final int f15135j;

    /* renamed from: m  reason: collision with root package name */
    public final int f15136m;
    public final long n;

    /* renamed from: t  reason: collision with root package name */
    public final long f15137t;

    /* renamed from: u  reason: collision with root package name */
    public final h[] f15138u;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    public c(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i10 = c0.f11939a;
        this.f15134f = readString;
        this.f15135j = parcel.readInt();
        this.f15136m = parcel.readInt();
        this.n = parcel.readLong();
        this.f15137t = parcel.readLong();
        int readInt = parcel.readInt();
        this.f15138u = new h[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f15138u[i11] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }

    public c(String str, int i10, int i11, long j10, long j11, h[] hVarArr) {
        super("CHAP");
        this.f15134f = str;
        this.f15135j = i10;
        this.f15136m = i11;
        this.n = j10;
        this.f15137t = j11;
        this.f15138u = hVarArr;
    }

    @Override // t7.h, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            return this.f15135j == cVar.f15135j && this.f15136m == cVar.f15136m && this.n == cVar.n && this.f15137t == cVar.f15137t && c0.a(this.f15134f, cVar.f15134f) && Arrays.equals(this.f15138u, cVar.f15138u);
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((((527 + this.f15135j) * 31) + this.f15136m) * 31) + ((int) this.n)) * 31) + ((int) this.f15137t)) * 31;
        String str = this.f15134f;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15134f);
        parcel.writeInt(this.f15135j);
        parcel.writeInt(this.f15136m);
        parcel.writeLong(this.n);
        parcel.writeLong(this.f15137t);
        parcel.writeInt(this.f15138u.length);
        for (h hVar : this.f15138u) {
            parcel.writeParcelable(hVar, 0);
        }
    }
}
