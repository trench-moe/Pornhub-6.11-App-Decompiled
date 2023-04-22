package com.google.android.gms.internal.gtm;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public class zzas implements IInterface {
    private final IBinder zza;
    private final String zzb;

    public zzas(IBinder iBinder, String str) {
        this.zza = iBinder;
        this.zzb = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.zza;
    }

    public final Parcel zza() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.zzb);
        return obtain;
    }

    public final void zzl(int i10, Parcel parcel) {
        Parcel obtain = Parcel.obtain();
        try {
            this.zza.transact(i10, parcel, obtain, 0);
            obtain.readException();
            parcel.recycle();
            obtain.recycle();
        } catch (Throwable th) {
            parcel.recycle();
            obtain.recycle();
            throw th;
        }
    }
}
