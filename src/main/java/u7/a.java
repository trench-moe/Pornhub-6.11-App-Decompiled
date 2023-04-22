package u7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k8.c0;
import o7.a;
import w6.d0;
import w6.y;

/* loaded from: classes2.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0273a();

    /* renamed from: c  reason: collision with root package name */
    public final String f15609c;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f15610f;

    /* renamed from: j  reason: collision with root package name */
    public final int f15611j;

    /* renamed from: m  reason: collision with root package name */
    public final int f15612m;

    /* renamed from: u7.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0273a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(Parcel parcel, C0273a c0273a) {
        String readString = parcel.readString();
        int i10 = c0.f11939a;
        this.f15609c = readString;
        this.f15610f = parcel.createByteArray();
        this.f15611j = parcel.readInt();
        this.f15612m = parcel.readInt();
    }

    public a(String str, byte[] bArr, int i10, int i11) {
        this.f15609c = str;
        this.f15610f = bArr;
        this.f15611j = i10;
        this.f15612m = i11;
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
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            return this.f15609c.equals(aVar.f15609c) && Arrays.equals(this.f15610f, aVar.f15610f) && this.f15611j == aVar.f15611j && this.f15612m == aVar.f15612m;
        }
        return false;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.f15610f) + a1.a.b(this.f15609c, 527, 31)) * 31) + this.f15611j) * 31) + this.f15612m;
    }

    @Override // o7.a.b
    public /* synthetic */ byte[] i0() {
        return null;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f15609c);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15609c);
        parcel.writeByteArray(this.f15610f);
        parcel.writeInt(this.f15611j);
        parcel.writeInt(this.f15612m);
    }
}
