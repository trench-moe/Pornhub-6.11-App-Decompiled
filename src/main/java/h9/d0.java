package h9;

import android.os.IBinder;
import android.os.Parcel;
import n9.a;

/* loaded from: classes2.dex */
public final class d0 extends s9.a {
    public d0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final n9.a b1(n9.a aVar, l0 l0Var) {
        Parcel a12 = a1();
        int i10 = s9.c.f14930a;
        a12.writeStrongBinder((u9.a) aVar);
        s9.c.b(a12, l0Var);
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f14928a.transact(2, a12, obtain, 0);
                obtain.readException();
                a12.recycle();
                n9.a b1 = a.AbstractBinderC0227a.b1(obtain.readStrongBinder());
                obtain.recycle();
                return b1;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } catch (Throwable th) {
            a12.recycle();
            throw th;
        }
    }
}
