package t7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k8.c0;

/* loaded from: classes2.dex */
public final class f extends h {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final String f15146f;

    /* renamed from: j  reason: collision with root package name */
    public final String f15147j;

    /* renamed from: m  reason: collision with root package name */
    public final String f15148m;
    public final byte[] n;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    public f(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i10 = c0.f11939a;
        this.f15146f = readString;
        this.f15147j = parcel.readString();
        this.f15148m = parcel.readString();
        this.n = parcel.createByteArray();
    }

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f15146f = str;
        this.f15147j = str2;
        this.f15148m = str3;
        this.n = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return c0.a(this.f15146f, fVar.f15146f) && c0.a(this.f15147j, fVar.f15147j) && c0.a(this.f15148m, fVar.f15148m) && Arrays.equals(this.n, fVar.n);
    }

    public int hashCode() {
        String str = this.f15146f;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15147j;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15148m;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return Arrays.hashCode(this.n) + ((hashCode2 + i10) * 31);
    }

    @Override // t7.h
    public String toString() {
        String str = this.f15154c;
        String str2 = this.f15146f;
        String str3 = this.f15147j;
        String str4 = this.f15148m;
        return android.support.v4.media.b.n(a0.a.n(a0.a.e(str4, a0.a.e(str3, a0.a.e(str2, a0.a.e(str, 36)))), str, ": mimeType=", str2, ", filename="), str3, ", description=", str4);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15146f);
        parcel.writeString(this.f15147j);
        parcel.writeString(this.f15148m);
        parcel.writeByteArray(this.n);
    }
}
