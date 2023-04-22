package t7;

import android.os.Parcel;
import android.os.Parcelable;
import k8.c0;

/* loaded from: classes2.dex */
public final class m extends h {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final String f15166f;

    /* renamed from: j  reason: collision with root package name */
    public final String f15167j;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public m(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = k8.c0.f11939a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f15166f = r0
            java.lang.String r3 = r3.readString()
            r2.f15167j = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.m.<init>(android.os.Parcel):void");
    }

    public m(String str, String str2, String str3) {
        super(str);
        this.f15166f = str2;
        this.f15167j = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            return this.f15154c.equals(mVar.f15154c) && c0.a(this.f15166f, mVar.f15166f) && c0.a(this.f15167j, mVar.f15167j);
        }
        return false;
    }

    public int hashCode() {
        int b10 = a1.a.b(this.f15154c, 527, 31);
        String str = this.f15166f;
        int hashCode = (b10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f15167j;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // t7.h
    public String toString() {
        String str = this.f15154c;
        String str2 = this.f15167j;
        return android.support.v4.media.b.f(a0.a.e(str2, a0.a.e(str, 6)), str, ": url=", str2);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15154c);
        parcel.writeString(this.f15166f);
        parcel.writeString(this.f15167j);
    }
}
