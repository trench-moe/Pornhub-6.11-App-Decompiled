package aa;

import android.os.Parcel;
import android.os.Parcelable;
import t9.k0;

/* loaded from: classes.dex */
public final class f extends i9.a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* renamed from: c  reason: collision with root package name */
    public final String f329c;

    public f(String str) {
        this.f329c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        k0.r(parcel, 2, this.f329c, false);
        k0.z(parcel, v2);
    }
}
