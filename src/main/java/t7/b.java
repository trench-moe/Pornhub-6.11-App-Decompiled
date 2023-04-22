package t7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b extends h {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f15133f;

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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = k8.c0.f11939a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f15133f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.b.<init>(android.os.Parcel):void");
    }

    public b(String str, byte[] bArr) {
        super(str);
        this.f15133f = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            return this.f15154c.equals(bVar.f15154c) && Arrays.equals(this.f15133f, bVar.f15133f);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f15133f) + a1.a.b(this.f15154c, 527, 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f15154c);
        parcel.writeByteArray(this.f15133f);
    }
}
