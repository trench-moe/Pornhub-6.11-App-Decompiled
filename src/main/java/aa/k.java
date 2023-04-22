package aa;

import android.os.Parcel;
import android.os.Parcelable;
import t9.k0;

/* loaded from: classes.dex */
public final class k extends i9.a {
    public static final Parcelable.Creator<k> CREATOR = new l();

    /* renamed from: c  reason: collision with root package name */
    public final String f334c;

    public k(String str) {
        this.f334c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        k0.r(parcel, 2, this.f334c, false);
        k0.z(parcel, v2);
    }
}
