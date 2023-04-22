package t7;

import android.os.Parcel;
import android.os.Parcelable;
import k8.c0;

/* loaded from: classes2.dex */
public final class i extends h {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final String f15155f;

    /* renamed from: j  reason: collision with root package name */
    public final String f15156j;

    /* renamed from: m  reason: collision with root package name */
    public final String f15157m;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<i> {
        @Override // android.os.Parcelable.Creator
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public i[] newArray(int i10) {
            return new i[i10];
        }
    }

    public i(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i10 = c0.f11939a;
        this.f15155f = readString;
        this.f15156j = parcel.readString();
        this.f15157m = parcel.readString();
    }

    public i(String str, String str2, String str3) {
        super("----");
        this.f15155f = str;
        this.f15156j = str2;
        this.f15157m = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i.class == obj.getClass()) {
            i iVar = (i) obj;
            return c0.a(this.f15156j, iVar.f15156j) && c0.a(this.f15155f, iVar.f15155f) && c0.a(this.f15157m, iVar.f15157m);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f15155f;
        int i10 = 0;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15156j;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15157m;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    @Override // t7.h
    public String toString() {
        String str = this.f15154c;
        String str2 = this.f15155f;
        String str3 = this.f15156j;
        StringBuilder n = a0.a.n(a0.a.e(str3, a0.a.e(str2, a0.a.e(str, 23))), str, ": domain=", str2, ", description=");
        n.append(str3);
        return n.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15154c);
        parcel.writeString(this.f15155f);
        parcel.writeString(this.f15157m);
    }
}
