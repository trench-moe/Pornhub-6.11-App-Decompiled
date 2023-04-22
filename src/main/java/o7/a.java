package o7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import k8.c0;
import w6.d0;
import w6.y;

/* loaded from: classes2.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0238a();

    /* renamed from: c  reason: collision with root package name */
    public final b[] f13605c;

    /* renamed from: o7.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0238a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* loaded from: classes2.dex */
    public interface b extends Parcelable {
        y E();

        void J(d0.b bVar);

        byte[] i0();
    }

    public a(Parcel parcel) {
        this.f13605c = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f13605c;
            if (i10 >= bVarArr.length) {
                return;
            }
            bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
            i10++;
        }
    }

    public a(List<? extends b> list) {
        this.f13605c = (b[]) list.toArray(new b[0]);
    }

    public a(b... bVarArr) {
        this.f13605c = bVarArr;
    }

    public a a(b... bVarArr) {
        if (bVarArr.length == 0) {
            return this;
        }
        b[] bVarArr2 = this.f13605c;
        int i10 = c0.f11939a;
        Object[] copyOf = Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
        System.arraycopy(bVarArr, 0, copyOf, bVarArr2.length, bVarArr.length);
        return new a((b[]) copyOf);
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
            return Arrays.equals(this.f13605c, ((a) obj).f13605c);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f13605c);
    }

    public String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f13605c));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13605c.length);
        for (b bVar : this.f13605c) {
            parcel.writeParcelable(bVar, 0);
        }
    }
}
