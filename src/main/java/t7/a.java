package t7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k8.c0;
import w6.d0;

/* loaded from: classes2.dex */
public final class a extends h {
    public static final Parcelable.Creator<a> CREATOR = new C0269a();

    /* renamed from: f  reason: collision with root package name */
    public final String f15130f;

    /* renamed from: j  reason: collision with root package name */
    public final String f15131j;

    /* renamed from: m  reason: collision with root package name */
    public final int f15132m;
    public final byte[] n;

    /* renamed from: t7.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0269a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i10 = c0.f11939a;
        this.f15130f = readString;
        this.f15131j = parcel.readString();
        this.f15132m = parcel.readInt();
        this.n = parcel.createByteArray();
    }

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f15130f = str;
        this.f15131j = str2;
        this.f15132m = i10;
        this.n = bArr;
    }

    @Override // t7.h, o7.a.b
    public void J(d0.b bVar) {
        bVar.b(this.n, this.f15132m);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            return this.f15132m == aVar.f15132m && c0.a(this.f15130f, aVar.f15130f) && c0.a(this.f15131j, aVar.f15131j) && Arrays.equals(this.n, aVar.n);
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f15132m) * 31;
        String str = this.f15130f;
        int i11 = 0;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15131j;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return Arrays.hashCode(this.n) + ((hashCode + i11) * 31);
    }

    @Override // t7.h
    public String toString() {
        String str = this.f15154c;
        String str2 = this.f15130f;
        String str3 = this.f15131j;
        StringBuilder n = a0.a.n(a0.a.e(str3, a0.a.e(str2, a0.a.e(str, 25))), str, ": mimeType=", str2, ", description=");
        n.append(str3);
        return n.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15130f);
        parcel.writeString(this.f15131j);
        parcel.writeInt(this.f15132m);
        parcel.writeByteArray(this.n);
    }
}
