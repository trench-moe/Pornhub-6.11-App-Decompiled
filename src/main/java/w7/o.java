package w7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o implements Parcelable {

    /* renamed from: c  reason: collision with root package name */
    public final int f16944c;

    /* renamed from: f  reason: collision with root package name */
    public final n[] f16945f;

    /* renamed from: j  reason: collision with root package name */
    public int f16946j;

    /* renamed from: m  reason: collision with root package name */
    public static final o f16943m = new o(new n[0]);
    public static final Parcelable.Creator<o> CREATOR = new a();

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<o> {
        @Override // android.os.Parcelable.Creator
        public o createFromParcel(Parcel parcel) {
            return new o(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public o[] newArray(int i10) {
            return new o[i10];
        }
    }

    public o(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f16944c = readInt;
        this.f16945f = new n[readInt];
        for (int i10 = 0; i10 < this.f16944c; i10++) {
            this.f16945f[i10] = (n) parcel.readParcelable(n.class.getClassLoader());
        }
    }

    public o(n... nVarArr) {
        this.f16945f = nVarArr;
        this.f16944c = nVarArr.length;
    }

    public int a(n nVar) {
        for (int i10 = 0; i10 < this.f16944c; i10++) {
            if (this.f16945f[i10] == nVar) {
                return i10;
            }
        }
        return -1;
    }

    public boolean b() {
        return this.f16944c == 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            return this.f16944c == oVar.f16944c && Arrays.equals(this.f16945f, oVar.f16945f);
        }
        return false;
    }

    public int hashCode() {
        if (this.f16946j == 0) {
            this.f16946j = Arrays.hashCode(this.f16945f);
        }
        return this.f16946j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16944c);
        for (int i11 = 0; i11 < this.f16944c; i11++) {
            parcel.writeParcelable(this.f16945f[i11], 0);
        }
    }
}
