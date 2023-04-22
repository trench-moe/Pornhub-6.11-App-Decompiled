package t7;

import android.os.Parcel;
import android.os.Parcelable;
import k8.c0;

/* loaded from: classes2.dex */
public final class e extends h {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final String f15143f;

    /* renamed from: j  reason: collision with root package name */
    public final String f15144j;

    /* renamed from: m  reason: collision with root package name */
    public final String f15145m;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i10 = c0.f11939a;
        this.f15143f = readString;
        this.f15144j = parcel.readString();
        this.f15145m = parcel.readString();
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f15143f = str;
        this.f15144j = str2;
        this.f15145m = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            return c0.a(this.f15144j, eVar.f15144j) && c0.a(this.f15143f, eVar.f15143f) && c0.a(this.f15145m, eVar.f15145m);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f15143f;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15144j;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15145m;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    @Override // t7.h
    public String toString() {
        String str = this.f15154c;
        String str2 = this.f15143f;
        String str3 = this.f15144j;
        StringBuilder n = a0.a.n(a0.a.e(str3, a0.a.e(str2, a0.a.e(str, 25))), str, ": language=", str2, ", description=");
        n.append(str3);
        return n.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15154c);
        parcel.writeString(this.f15143f);
        parcel.writeString(this.f15145m);
    }
}
