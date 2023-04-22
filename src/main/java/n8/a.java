package n8;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import h6.b;
import h6.c;

/* loaded from: classes2.dex */
public interface a extends IInterface {

    /* renamed from: n8.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC0225a extends b implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f13415a = 0;

        /* renamed from: n8.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0226a extends h6.a implements a {
            public C0226a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // n8.a
            public final Bundle a0(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                int i10 = c.f10153a;
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    try {
                        this.f10152a.transact(1, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain.recycle();
                        Bundle bundle2 = (Bundle) (obtain2.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(obtain2));
                        obtain2.recycle();
                        return bundle2;
                    } catch (RuntimeException e10) {
                        obtain2.recycle();
                        throw e10;
                    }
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }
        }
    }

    Bundle a0(Bundle bundle);
}
