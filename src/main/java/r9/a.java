package r9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes2.dex */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14733a;

    /* renamed from: b  reason: collision with root package name */
    public final IBinder f14734b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14735c;

    public a(IBinder iBinder) {
        this.f14733a = 0;
        this.f14734b = iBinder;
        this.f14735c = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService";
    }

    public a(IBinder iBinder, String str) {
        this.f14733a = 1;
        this.f14734b = iBinder;
        this.f14735c = str;
    }

    public Parcel a1(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f14734b.transact(i10, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f14733a) {
            case 0:
                return this.f14734b;
            default:
                return this.f14734b;
        }
    }

    public final Parcel b1() {
        switch (this.f14733a) {
            case 0:
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(this.f14735c);
                return obtain;
            default:
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(this.f14735c);
                return obtain2;
        }
    }

    public Parcel c1(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f14734b.transact(i10, parcel, obtain, 0);
                obtain.readException();
                parcel.recycle();
                return obtain;
            } catch (RuntimeException e10) {
                obtain.recycle();
                throw e10;
            }
        } catch (Throwable th) {
            parcel.recycle();
            throw th;
        }
    }
}
