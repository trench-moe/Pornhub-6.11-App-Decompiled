package h9;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class q extends i9.a {
    public static final Parcelable.Creator<q> CREATOR = new v0();

    /* renamed from: c  reason: collision with root package name */
    public final int f10369c;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f10370f;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f10371j;

    /* renamed from: m  reason: collision with root package name */
    public final int f10372m;
    public final int n;

    public q(int i10, boolean z10, boolean z11, int i11, int i12) {
        this.f10369c = i10;
        this.f10370f = z10;
        this.f10371j = z11;
        this.f10372m = i11;
        this.n = i12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        int i11 = this.f10369c;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        boolean z10 = this.f10370f;
        parcel.writeInt(262146);
        parcel.writeInt(z10 ? 1 : 0);
        boolean z11 = this.f10371j;
        parcel.writeInt(262147);
        parcel.writeInt(z11 ? 1 : 0);
        int i12 = this.f10372m;
        parcel.writeInt(262148);
        parcel.writeInt(i12);
        int i13 = this.n;
        parcel.writeInt(262149);
        parcel.writeInt(i13);
        t9.k0.z(parcel, v2);
    }
}
