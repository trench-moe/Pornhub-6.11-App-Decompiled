package a;

import a.a;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public a.a f115c;

    /* loaded from: classes.dex */
    public class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* renamed from: a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class BinderC0002b extends a.AbstractBinderC0000a {
        public BinderC0002b() {
        }
    }

    public b(Parcel parcel) {
        a.a c0001a;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i10 = a.AbstractBinderC0000a.f113a;
        if (readStrongBinder == null) {
            c0001a = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            c0001a = (queryLocalInterface == null || !(queryLocalInterface instanceof a.a)) ? new a.AbstractBinderC0000a.C0001a(readStrongBinder) : (a.a) queryLocalInterface;
        }
        this.f115c = c0001a;
    }

    public void a(int i10, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.f115c == null) {
                this.f115c = new BinderC0002b();
            }
            parcel.writeStrongBinder(this.f115c.asBinder());
        }
    }
}
