package a9;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class d extends t9.l implements e {
    public d() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    @Override // t9.l
    public final boolean a1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            x0((Bundle) t9.v.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
