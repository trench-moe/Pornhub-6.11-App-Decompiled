package a9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t9.k0;

/* loaded from: classes.dex */
public final class d0 extends i9.a {
    public static final Parcelable.Creator<d0> CREATOR = new e0();

    /* renamed from: c  reason: collision with root package name */
    public double f272c;

    /* renamed from: f  reason: collision with root package name */
    public boolean f273f;

    /* renamed from: j  reason: collision with root package name */
    public int f274j;

    /* renamed from: m  reason: collision with root package name */
    public u8.d f275m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public u8.x f276t;

    /* renamed from: u  reason: collision with root package name */
    public double f277u;

    public d0() {
        this.f272c = Double.NaN;
        this.f273f = false;
        this.f274j = -1;
        this.f275m = null;
        this.n = -1;
        this.f276t = null;
        this.f277u = Double.NaN;
    }

    public d0(double d, boolean z10, int i10, u8.d dVar, int i11, u8.x xVar, double d10) {
        this.f272c = d;
        this.f273f = z10;
        this.f274j = i10;
        this.f275m = dVar;
        this.n = i11;
        this.f276t = xVar;
        this.f277u = d10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            d0 d0Var = (d0) obj;
            if (this.f272c == d0Var.f272c && this.f273f == d0Var.f273f && this.f274j == d0Var.f274j && a.h(this.f275m, d0Var.f275m) && this.n == d0Var.n) {
                u8.x xVar = this.f276t;
                if (a.h(xVar, xVar) && this.f277u == d0Var.f277u) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.f272c), Boolean.valueOf(this.f273f), Integer.valueOf(this.f274j), this.f275m, Integer.valueOf(this.n), this.f276t, Double.valueOf(this.f277u)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        double d = this.f272c;
        parcel.writeInt(524290);
        parcel.writeDouble(d);
        boolean z10 = this.f273f;
        parcel.writeInt(262147);
        parcel.writeInt(z10 ? 1 : 0);
        int i11 = this.f274j;
        parcel.writeInt(262148);
        parcel.writeInt(i11);
        k0.q(parcel, 5, this.f275m, i10, false);
        int i12 = this.n;
        parcel.writeInt(262150);
        parcel.writeInt(i12);
        k0.q(parcel, 7, this.f276t, i10, false);
        double d10 = this.f277u;
        parcel.writeInt(524296);
        parcel.writeDouble(d10);
        k0.z(parcel, v2);
    }
}
