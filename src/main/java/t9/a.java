package t9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f15168a;

    /* renamed from: b  reason: collision with root package name */
    public final String f15169b;

    public a(IBinder iBinder, String str) {
        this.f15168a = iBinder;
        this.f15169b = str;
    }

    public final Parcel a1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f15169b);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f15168a;
    }

    public final Parcel b1(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f15168a.transact(i10, parcel, obtain, 0);
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

    public final void c1(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.f15168a.transact(i10, parcel, obtain, 0);
            obtain.readException();
            parcel.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            throw th;
        }
    }

    public final void d1(int i10, Parcel parcel) {
        try {
            this.f15168a.transact(i10, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
