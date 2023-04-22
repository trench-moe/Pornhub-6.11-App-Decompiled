package h9;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public interface h extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class a extends u9.a implements h {
        public static h b1(IBinder iBinder) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof h ? (h) queryLocalInterface : new m1(iBinder);
        }
    }

    Account zzb();
}
