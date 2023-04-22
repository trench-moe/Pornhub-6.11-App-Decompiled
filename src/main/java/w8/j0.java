package w8;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class j0 extends t9.a implements k0 {
    public j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.media.INotificationActionsProvider");
    }

    @Override // w8.k0
    public final int[] b() {
        Parcel b1 = b1(4, a1());
        int[] createIntArray = b1.createIntArray();
        b1.recycle();
        return createIntArray;
    }

    @Override // w8.k0
    public final List<e> e() {
        Parcel b1 = b1(3, a1());
        ArrayList createTypedArrayList = b1.createTypedArrayList(e.CREATOR);
        b1.recycle();
        return createTypedArrayList;
    }
}
