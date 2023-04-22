package t7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k8.c0;

/* loaded from: classes2.dex */
public final class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final int f15158f;

    /* renamed from: j  reason: collision with root package name */
    public final int f15159j;

    /* renamed from: m  reason: collision with root package name */
    public final int f15160m;
    public final int[] n;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f15161t;

    /* loaded from: classes2.dex */
    public class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public j[] newArray(int i10) {
            return new j[i10];
        }
    }

    public j(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f15158f = i10;
        this.f15159j = i11;
        this.f15160m = i12;
        this.n = iArr;
        this.f15161t = iArr2;
    }

    public j(Parcel parcel) {
        super("MLLT");
        this.f15158f = parcel.readInt();
        this.f15159j = parcel.readInt();
        this.f15160m = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i10 = c0.f11939a;
        this.n = createIntArray;
        this.f15161t = parcel.createIntArray();
    }

    @Override // t7.h, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f15158f == jVar.f15158f && this.f15159j == jVar.f15159j && this.f15160m == jVar.f15160m && Arrays.equals(this.n, jVar.n) && Arrays.equals(this.f15161t, jVar.f15161t);
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.n);
        return Arrays.hashCode(this.f15161t) + ((hashCode + ((((((527 + this.f15158f) * 31) + this.f15159j) * 31) + this.f15160m) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f15158f);
        parcel.writeInt(this.f15159j);
        parcel.writeInt(this.f15160m);
        parcel.writeIntArray(this.n);
        parcel.writeIntArray(this.f15161t);
    }
}
