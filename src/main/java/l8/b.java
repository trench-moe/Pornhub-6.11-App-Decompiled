package l8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k8.c0;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes2.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public final int f12651c;

    /* renamed from: f  reason: collision with root package name */
    public final int f12652f;

    /* renamed from: j  reason: collision with root package name */
    public final int f12653j;

    /* renamed from: m  reason: collision with root package name */
    public final byte[] f12654m;
    public int n;

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

    public b(int i10, int i11, int i12, byte[] bArr) {
        this.f12651c = i10;
        this.f12652f = i11;
        this.f12653j = i12;
        this.f12654m = bArr;
    }

    public b(Parcel parcel) {
        this.f12651c = parcel.readInt();
        this.f12652f = parcel.readInt();
        this.f12653j = parcel.readInt();
        int i10 = c0.f11939a;
        this.f12654m = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    @Pure
    public static int a(int i10) {
        if (i10 != 1) {
            if (i10 != 9) {
                return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
            }
            return 6;
        }
        return 1;
    }

    @Pure
    public static int b(int i10) {
        if (i10 != 1) {
            if (i10 == 16) {
                return 6;
            }
            if (i10 == 18) {
                return 7;
            }
            if (i10 != 6 && i10 != 7) {
                return -1;
            }
        }
        return 3;
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
            return this.f12651c == bVar.f12651c && this.f12652f == bVar.f12652f && this.f12653j == bVar.f12653j && Arrays.equals(this.f12654m, bVar.f12654m);
        }
        return false;
    }

    public int hashCode() {
        if (this.n == 0) {
            this.n = Arrays.hashCode(this.f12654m) + ((((((527 + this.f12651c) * 31) + this.f12652f) * 31) + this.f12653j) * 31);
        }
        return this.n;
    }

    public String toString() {
        int i10 = this.f12651c;
        int i11 = this.f12652f;
        int i12 = this.f12653j;
        boolean z10 = this.f12654m != null;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("ColorInfo(");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f12651c);
        parcel.writeInt(this.f12652f);
        parcel.writeInt(this.f12653j);
        int i11 = this.f12654m != null ? 1 : 0;
        int i12 = c0.f11939a;
        parcel.writeInt(i11);
        byte[] bArr = this.f12654m;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
