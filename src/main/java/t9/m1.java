package t9;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m1 extends a implements f2 {
    public m1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    @Override // t9.f2
    public final v8.r A0(String str, String str2, v8.x xVar) {
        v8.r pVar;
        Parcel a12 = a1();
        a12.writeString(str);
        a12.writeString(str2);
        v.d(a12, xVar);
        Parcel b1 = b1(2, a12);
        IBinder readStrongBinder = b1.readStrongBinder();
        int i10 = v8.q.f16104a;
        if (readStrongBinder == null) {
            pVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            pVar = queryLocalInterface instanceof v8.r ? (v8.r) queryLocalInterface : new v8.p(readStrongBinder);
        }
        b1.recycle();
        return pVar;
    }

    @Override // t9.f2
    public final v8.o C0(n9.a aVar, n9.a aVar2, n9.a aVar3) {
        v8.o mVar;
        Parcel a12 = a1();
        v.d(a12, aVar);
        v.d(a12, aVar2);
        v.d(a12, aVar3);
        Parcel b1 = b1(5, a12);
        IBinder readStrongBinder = b1.readStrongBinder();
        int i10 = v8.n.f16103a;
        if (readStrongBinder == null) {
            mVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            mVar = queryLocalInterface instanceof v8.o ? (v8.o) queryLocalInterface : new v8.m(readStrongBinder);
        }
        b1.recycle();
        return mVar;
    }

    @Override // t9.f2
    public final v8.n0 O(v8.c cVar, n9.a aVar, v8.h0 h0Var) {
        v8.n0 l0Var;
        Parcel a12 = a1();
        v.b(a12, cVar);
        v.d(a12, aVar);
        v.d(a12, h0Var);
        Parcel b1 = b1(3, a12);
        IBinder readStrongBinder = b1.readStrongBinder();
        int i10 = v8.m0.f16102a;
        if (readStrongBinder == null) {
            l0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            l0Var = queryLocalInterface instanceof v8.n0 ? (v8.n0) queryLocalInterface : new v8.l0(readStrongBinder);
        }
        b1.recycle();
        return l0Var;
    }

    @Override // t9.f2
    public final v8.k0 R(n9.a aVar, v8.c cVar, p3 p3Var, Map map) {
        v8.k0 i0Var;
        Parcel a12 = a1();
        v.d(a12, aVar);
        v.b(a12, cVar);
        v.d(a12, p3Var);
        a12.writeMap(map);
        Parcel b1 = b1(1, a12);
        IBinder readStrongBinder = b1.readStrongBinder();
        int i10 = v8.j0.f16101a;
        if (readStrongBinder == null) {
            i0Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            i0Var = queryLocalInterface instanceof v8.k0 ? (v8.k0) queryLocalInterface : new v8.i0(readStrongBinder);
        }
        b1.recycle();
        return i0Var;
    }

    @Override // t9.f2
    public final x8.g o0(n9.a aVar, x8.h hVar, int i10, int i11, boolean z10, long j10, int i12, int i13, int i14) {
        x8.g eVar;
        Parcel a12 = a1();
        v.d(a12, aVar);
        v.d(a12, hVar);
        a12.writeInt(i10);
        a12.writeInt(i11);
        a12.writeInt(0);
        a12.writeLong(2097152L);
        a12.writeInt(5);
        a12.writeInt(333);
        a12.writeInt(10000);
        Parcel b1 = b1(6, a12);
        IBinder readStrongBinder = b1.readStrongBinder();
        int i15 = x8.f.f18071a;
        if (readStrongBinder == null) {
            eVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            eVar = queryLocalInterface instanceof x8.g ? (x8.g) queryLocalInterface : new x8.e(readStrongBinder);
        }
        b1.recycle();
        return eVar;
    }
}
