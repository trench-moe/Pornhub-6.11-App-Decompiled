package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.List;
import t9.k0;

/* loaded from: classes.dex */
public final class g extends i9.a implements d9.f {
    public static final Parcelable.Creator<g> CREATOR = new h();

    /* renamed from: c  reason: collision with root package name */
    public final List<String> f3911c;

    /* renamed from: f  reason: collision with root package name */
    public final String f3912f;

    public g(List<String> list, String str) {
        this.f3911c = list;
        this.f3912f = str;
    }

    @Override // d9.f
    public final Status V() {
        return this.f3912f != null ? Status.f6855t : Status.y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        k0.s(parcel, 1, this.f3911c, false);
        k0.r(parcel, 2, this.f3912f, false);
        k0.z(parcel, v2);
    }
}
