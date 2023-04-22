package h9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public class r extends i9.a {
    public static final Parcelable.Creator<r> CREATOR = new u();

    /* renamed from: c  reason: collision with root package name */
    public final int f10374c;

    /* renamed from: f  reason: collision with root package name */
    public List<l> f10375f;

    public r(int i10, List<l> list) {
        this.f10374c = i10;
        this.f10375f = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        int i11 = this.f10374c;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        t9.k0.u(parcel, 2, this.f10375f, false);
        t9.k0.z(parcel, v2);
    }
}
