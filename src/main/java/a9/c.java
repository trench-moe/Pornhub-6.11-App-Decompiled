package a9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import t9.k0;

/* loaded from: classes.dex */
public final class c extends i9.a {
    public static final Parcelable.Creator<c> CREATOR = new r();

    /* renamed from: c  reason: collision with root package name */
    public final String f267c;

    public c() {
        this.f267c = null;
    }

    public c(String str) {
        this.f267c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return a.h(this.f267c, ((c) obj).f267c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f267c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = k0.v(parcel, 20293);
        k0.r(parcel, 2, this.f267c, false);
        k0.z(parcel, v2);
    }
}
