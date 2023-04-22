package v7;

import android.os.Parcel;
import android.os.Parcelable;
import k8.c0;

/* loaded from: classes2.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0280a();

    /* renamed from: c  reason: collision with root package name */
    public final long f16026c;

    /* renamed from: f  reason: collision with root package name */
    public final long f16027f;

    /* renamed from: j  reason: collision with root package name */
    public final byte[] f16028j;

    /* renamed from: v7.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0280a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(long j10, byte[] bArr, long j11) {
        this.f16026c = j11;
        this.f16027f = j10;
        this.f16028j = bArr;
    }

    public a(Parcel parcel, C0280a c0280a) {
        this.f16026c = parcel.readLong();
        this.f16027f = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i10 = c0.f11939a;
        this.f16028j = createByteArray;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f16026c);
        parcel.writeLong(this.f16027f);
        parcel.writeByteArray(this.f16028j);
    }
}
