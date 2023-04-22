package v8;

import android.os.IBinder;
import android.os.Parcel;
import n9.a;

/* loaded from: classes2.dex */
public final class p extends t9.a implements r {
    public p(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    @Override // v8.r
    public final n9.a b() {
        Parcel b1 = b1(1, a1());
        n9.a b12 = a.AbstractBinderC0227a.b1(b1.readStrongBinder());
        b1.recycle();
        return b12;
    }

    @Override // v8.r
    public final int d() {
        Parcel b1 = b1(17, a1());
        int readInt = b1.readInt();
        b1.recycle();
        return readInt;
    }

    @Override // v8.r
    public final int e() {
        Parcel b1 = b1(18, a1());
        int readInt = b1.readInt();
        b1.recycle();
        return readInt;
    }

    @Override // v8.r
    public final boolean j() {
        Parcel b1 = b1(5, a1());
        int i10 = t9.v.f15358a;
        boolean z10 = b1.readInt() != 0;
        b1.recycle();
        return z10;
    }

    @Override // v8.r
    public final void j0(int i10) {
        Parcel a12 = a1();
        a12.writeInt(i10);
        c1(13, a12);
    }

    @Override // v8.r
    public final void l(int i10) {
        Parcel a12 = a1();
        a12.writeInt(i10);
        c1(12, a12);
    }

    @Override // v8.r
    public final void p(int i10) {
        Parcel a12 = a1();
        a12.writeInt(i10);
        c1(15, a12);
    }

    @Override // v8.r
    public final boolean t() {
        Parcel b1 = b1(9, a1());
        int i10 = t9.v.f15358a;
        boolean z10 = b1.readInt() != 0;
        b1.recycle();
        return z10;
    }
}
