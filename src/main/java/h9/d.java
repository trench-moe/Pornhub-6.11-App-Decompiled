package h9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class d extends i9.a {
    public static final Parcelable.Creator<d> CREATOR = new e1();

    /* renamed from: c  reason: collision with root package name */
    public final q f10298c;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10299f;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f10300j;

    /* renamed from: m  reason: collision with root package name */
    public final int[] f10301m;
    public final int n;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f10302t;

    public d(q qVar, boolean z10, boolean z11, int[] iArr, int i10, int[] iArr2) {
        this.f10298c = qVar;
        this.f10299f = z10;
        this.f10300j = z11;
        this.f10301m = iArr;
        this.n = i10;
        this.f10302t = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        t9.k0.q(parcel, 1, this.f10298c, i10, false);
        boolean z10 = this.f10299f;
        parcel.writeInt(262146);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f10300j;
        parcel.writeInt(262147);
        parcel.writeInt(z11 ? 1 : 0);
        t9.k0.o(parcel, 4, this.f10301m, false);
        int i11 = this.n;
        parcel.writeInt(262149);
        parcel.writeInt(i11);
        t9.k0.o(parcel, 6, this.f10302t, false);
        t9.k0.z(parcel, v2);
    }
}
