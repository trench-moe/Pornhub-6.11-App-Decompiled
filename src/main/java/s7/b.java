package s7;

import android.os.Parcel;
import android.os.Parcelable;
import k8.c0;
import o7.a;
import w6.d0;
import w6.y;

/* loaded from: classes2.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final int f14917c;

    /* renamed from: f  reason: collision with root package name */
    public final String f14918f;

    /* renamed from: j  reason: collision with root package name */
    public final String f14919j;

    /* renamed from: m  reason: collision with root package name */
    public final String f14920m;
    public final boolean n;

    /* renamed from: t  reason: collision with root package name */
    public final int f14921t;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        k8.a.c(i11 == -1 || i11 > 0);
        this.f14917c = i10;
        this.f14918f = str;
        this.f14919j = str2;
        this.f14920m = str3;
        this.n = z10;
        this.f14921t = i11;
    }

    public b(Parcel parcel) {
        this.f14917c = parcel.readInt();
        this.f14918f = parcel.readString();
        this.f14919j = parcel.readString();
        this.f14920m = parcel.readString();
        int i10 = c0.f11939a;
        this.n = parcel.readInt() != 0;
        this.f14921t = parcel.readInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static s7.b a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r14) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s7.b.a(java.util.Map):s7.b");
    }

    @Override // o7.a.b
    public /* synthetic */ y E() {
        return null;
    }

    @Override // o7.a.b
    public /* synthetic */ void J(d0.b bVar) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f14917c == bVar.f14917c && c0.a(this.f14918f, bVar.f14918f) && c0.a(this.f14919j, bVar.f14919j) && c0.a(this.f14920m, bVar.f14920m) && this.n == bVar.n && this.f14921t == bVar.f14921t;
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f14917c) * 31;
        String str = this.f14918f;
        int hashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14919j;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f14920m;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.n ? 1 : 0)) * 31) + this.f14921t;
    }

    @Override // o7.a.b
    public /* synthetic */ byte[] i0() {
        return null;
    }

    public String toString() {
        String str = this.f14919j;
        String str2 = this.f14918f;
        int i10 = this.f14917c;
        int i11 = this.f14921t;
        StringBuilder n = a0.a.n(a0.a.e(str2, a0.a.e(str, 80)), "IcyHeaders: name=\"", str, "\", genre=\"", str2);
        n.append("\", bitrate=");
        n.append(i10);
        n.append(", metadataInterval=");
        n.append(i11);
        return n.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f14917c);
        parcel.writeString(this.f14918f);
        parcel.writeString(this.f14919j);
        parcel.writeString(this.f14920m);
        boolean z10 = this.n;
        int i11 = c0.f11939a;
        parcel.writeInt(z10 ? 1 : 0);
        parcel.writeInt(this.f14921t);
    }
}
