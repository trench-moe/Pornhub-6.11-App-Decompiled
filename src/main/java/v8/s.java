package v8;

import android.os.IBinder;
import android.os.Parcel;
import n9.a;

/* loaded from: classes2.dex */
public final class s extends t9.a implements t {
    public s(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISessionManager");
    }

    @Override // v8.t
    public final void C(boolean z10, boolean z11) {
        Parcel a12 = a1();
        int i10 = t9.v.f15358a;
        a12.writeInt(1);
        a12.writeInt(z11 ? 1 : 0);
        c1(6, a12);
    }

    @Override // v8.t
    public final void Q(v vVar) {
        Parcel a12 = a1();
        t9.v.d(a12, vVar);
        c1(3, a12);
    }

    @Override // v8.t
    public final void Q0(v vVar) {
        Parcel a12 = a1();
        t9.v.d(a12, vVar);
        c1(2, a12);
    }

    @Override // v8.t
    public final n9.a b() {
        Parcel b1 = b1(7, a1());
        n9.a b12 = a.AbstractBinderC0227a.b1(b1.readStrongBinder());
        b1.recycle();
        return b12;
    }

    @Override // v8.t
    public final n9.a e() {
        Parcel b1 = b1(1, a1());
        n9.a b12 = a.AbstractBinderC0227a.b1(b1.readStrongBinder());
        b1.recycle();
        return b12;
    }
}
