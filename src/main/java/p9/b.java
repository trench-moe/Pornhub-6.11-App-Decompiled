package p9;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class b extends v9.a implements c {
    public static c asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new a(iBinder);
    }
}
