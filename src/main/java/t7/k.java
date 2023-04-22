package t7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k8.c0;

/* loaded from: classes2.dex */
public final class k extends h {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final String f15162f;

    /* renamed from: j  reason: collision with root package name */
    public final byte[] f15163j;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    public k(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i10 = c0.f11939a;
        this.f15162f = readString;
        this.f15163j = parcel.createByteArray();
    }

    public k(String str, byte[] bArr) {
        super("PRIV");
        this.f15162f = str;
        this.f15163j = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            return c0.a(this.f15162f, kVar.f15162f) && Arrays.equals(this.f15163j, kVar.f15163j);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f15162f;
        return Arrays.hashCode(this.f15163j) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // t7.h
    public String toString() {
        String str = this.f15154c;
        String str2 = this.f15162f;
        return android.support.v4.media.b.f(a0.a.e(str2, a0.a.e(str, 8)), str, ": owner=", str2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15162f);
        parcel.writeByteArray(this.f15163j);
    }
}
