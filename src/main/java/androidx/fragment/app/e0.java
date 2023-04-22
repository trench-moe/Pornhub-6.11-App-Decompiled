package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new a();
    public final boolean A;
    public final int B;
    public Bundle C;

    /* renamed from: c  reason: collision with root package name */
    public final String f2114c;

    /* renamed from: f  reason: collision with root package name */
    public final String f2115f;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f2116j;

    /* renamed from: m  reason: collision with root package name */
    public final int f2117m;
    public final int n;

    /* renamed from: t  reason: collision with root package name */
    public final String f2118t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f2119u;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f2120w;
    public final boolean y;

    /* renamed from: z  reason: collision with root package name */
    public final Bundle f2121z;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<e0> {
        @Override // android.os.Parcelable.Creator
        public e0 createFromParcel(Parcel parcel) {
            return new e0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public e0[] newArray(int i10) {
            return new e0[i10];
        }
    }

    public e0(Parcel parcel) {
        this.f2114c = parcel.readString();
        this.f2115f = parcel.readString();
        this.f2116j = parcel.readInt() != 0;
        this.f2117m = parcel.readInt();
        this.n = parcel.readInt();
        this.f2118t = parcel.readString();
        this.f2119u = parcel.readInt() != 0;
        this.f2120w = parcel.readInt() != 0;
        this.y = parcel.readInt() != 0;
        this.f2121z = parcel.readBundle();
        this.A = parcel.readInt() != 0;
        this.C = parcel.readBundle();
        this.B = parcel.readInt();
    }

    public e0(Fragment fragment) {
        this.f2114c = fragment.getClass().getName();
        this.f2115f = fragment.f2018t;
        this.f2116j = fragment.D;
        this.f2117m = fragment.M;
        this.n = fragment.N;
        this.f2118t = fragment.O;
        this.f2119u = fragment.R;
        this.f2120w = fragment.C;
        this.y = fragment.Q;
        this.f2121z = fragment.f2019u;
        this.A = fragment.P;
        this.B = fragment.f2007e0.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f2114c);
        sb2.append(" (");
        sb2.append(this.f2115f);
        sb2.append(")}:");
        if (this.f2116j) {
            sb2.append(" fromLayout");
        }
        if (this.n != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.n));
        }
        String str = this.f2118t;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f2118t);
        }
        if (this.f2119u) {
            sb2.append(" retainInstance");
        }
        if (this.f2120w) {
            sb2.append(" removing");
        }
        if (this.y) {
            sb2.append(" detached");
        }
        if (this.A) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2114c);
        parcel.writeString(this.f2115f);
        parcel.writeInt(this.f2116j ? 1 : 0);
        parcel.writeInt(this.f2117m);
        parcel.writeInt(this.n);
        parcel.writeString(this.f2118t);
        parcel.writeInt(this.f2119u ? 1 : 0);
        parcel.writeInt(this.f2120w ? 1 : 0);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeBundle(this.f2121z);
        parcel.writeInt(this.A ? 1 : 0);
        parcel.writeBundle(this.C);
        parcel.writeInt(this.B);
    }
}
