package a;

import a.b;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Objects;

/* loaded from: classes.dex */
public interface a extends IInterface {

    /* renamed from: a.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractBinderC0000a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f113a = 0;

        /* renamed from: a.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0001a implements a {

            /* renamed from: a  reason: collision with root package name */
            public IBinder f114a;

            public C0001a(IBinder iBinder) {
                this.f114a = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f114a;
            }
        }

        public AbstractBinderC0000a() {
            attachInterface(this, "android.support.v4.os.IResultReceiver");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
            parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            int readInt = parcel.readInt();
            Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
            b.BinderC0002b binderC0002b = (b.BinderC0002b) this;
            Objects.requireNonNull(b.this);
            b.this.a(readInt, bundle);
            return true;
        }
    }
}
