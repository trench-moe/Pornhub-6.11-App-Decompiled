package h9;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes2.dex */
public final class m1 extends r9.a implements h {
    public m1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // h9.h
    public final Account zzb() {
        Parcel a12 = a1(2, b1());
        Account account = (Account) u9.b.a(a12, Account.CREATOR);
        a12.recycle();
        return account;
    }
}
