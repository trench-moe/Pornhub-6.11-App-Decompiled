package t7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k8.c0;

/* loaded from: classes2.dex */
public final class d extends h {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final String f15139f;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f15140j;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f15141m;
    public final String[] n;

    /* renamed from: t  reason: collision with root package name */
    public final h[] f15142t;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i10 = c0.f11939a;
        this.f15139f = readString;
        this.f15140j = parcel.readByte() != 0;
        this.f15141m = parcel.readByte() != 0;
        this.n = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f15142t = new h[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f15142t[i11] = (h) parcel.readParcelable(h.class.getClassLoader());
        }
    }

    public d(String str, boolean z10, boolean z11, String[] strArr, h[] hVarArr) {
        super("CTOC");
        this.f15139f = str;
        this.f15140j = z10;
        this.f15141m = z11;
        this.n = strArr;
        this.f15142t = hVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            return this.f15140j == dVar.f15140j && this.f15141m == dVar.f15141m && c0.a(this.f15139f, dVar.f15139f) && Arrays.equals(this.n, dVar.n) && Arrays.equals(this.f15142t, dVar.f15142t);
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((527 + (this.f15140j ? 1 : 0)) * 31) + (this.f15141m ? 1 : 0)) * 31;
        String str = this.f15139f;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15139f);
        parcel.writeByte(this.f15140j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f15141m ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.n);
        parcel.writeInt(this.f15142t.length);
        for (h hVar : this.f15142t) {
            parcel.writeParcelable(hVar, 0);
        }
    }
}
