package r7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k8.c0;
import o7.a;
import w6.d0;
import w6.y;

/* loaded from: classes2.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0255a();

    /* renamed from: c  reason: collision with root package name */
    public final int f14724c;

    /* renamed from: f  reason: collision with root package name */
    public final String f14725f;

    /* renamed from: j  reason: collision with root package name */
    public final String f14726j;

    /* renamed from: m  reason: collision with root package name */
    public final int f14727m;
    public final int n;

    /* renamed from: t  reason: collision with root package name */
    public final int f14728t;

    /* renamed from: u  reason: collision with root package name */
    public final int f14729u;

    /* renamed from: w  reason: collision with root package name */
    public final byte[] f14730w;

    /* renamed from: r7.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0255a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f14724c = i10;
        this.f14725f = str;
        this.f14726j = str2;
        this.f14727m = i11;
        this.n = i12;
        this.f14728t = i13;
        this.f14729u = i14;
        this.f14730w = bArr;
    }

    public a(Parcel parcel) {
        this.f14724c = parcel.readInt();
        String readString = parcel.readString();
        int i10 = c0.f11939a;
        this.f14725f = readString;
        this.f14726j = parcel.readString();
        this.f14727m = parcel.readInt();
        this.n = parcel.readInt();
        this.f14728t = parcel.readInt();
        this.f14729u = parcel.readInt();
        this.f14730w = parcel.createByteArray();
    }

    @Override // o7.a.b
    public /* synthetic */ y E() {
        return null;
    }

    @Override // o7.a.b
    public void J(d0.b bVar) {
        bVar.b(this.f14730w, this.f14724c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            return this.f14724c == aVar.f14724c && this.f14725f.equals(aVar.f14725f) && this.f14726j.equals(aVar.f14726j) && this.f14727m == aVar.f14727m && this.n == aVar.n && this.f14728t == aVar.f14728t && this.f14729u == aVar.f14729u && Arrays.equals(this.f14730w, aVar.f14730w);
        }
        return false;
    }

    public int hashCode() {
        int b10 = a1.a.b(this.f14725f, (this.f14724c + 527) * 31, 31);
        return Arrays.hashCode(this.f14730w) + ((((((((a1.a.b(this.f14726j, b10, 31) + this.f14727m) * 31) + this.n) * 31) + this.f14728t) * 31) + this.f14729u) * 31);
    }

    @Override // o7.a.b
    public /* synthetic */ byte[] i0() {
        return null;
    }

    public String toString() {
        String str = this.f14725f;
        String str2 = this.f14726j;
        StringBuilder sb2 = new StringBuilder(a0.a.e(str2, a0.a.e(str, 32)));
        sb2.append("Picture: mimeType=");
        sb2.append(str);
        sb2.append(", description=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14724c);
        parcel.writeString(this.f14725f);
        parcel.writeString(this.f14726j);
        parcel.writeInt(this.f14727m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f14728t);
        parcel.writeInt(this.f14729u);
        parcel.writeByteArray(this.f14730w);
    }
}
