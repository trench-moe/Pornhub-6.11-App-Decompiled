package o9;

import android.os.IBinder;
import android.os.Parcel;
import n9.a;

/* loaded from: classes2.dex */
public final class f extends r9.a {
    public f(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final n9.a d1(n9.a aVar, String str, int i10) {
        Parcel b1 = b1();
        u9.b.b(b1, aVar);
        b1.writeString(str);
        b1.writeInt(i10);
        Parcel a12 = a1(2, b1);
        n9.a b12 = a.AbstractBinderC0227a.b1(a12.readStrongBinder());
        a12.recycle();
        return b12;
    }

    public final n9.a e1(n9.a aVar, String str, int i10, n9.a aVar2) {
        Parcel b1 = b1();
        u9.b.b(b1, aVar);
        b1.writeString(str);
        b1.writeInt(i10);
        u9.b.b(b1, aVar2);
        Parcel a12 = a1(8, b1);
        n9.a b12 = a.AbstractBinderC0227a.b1(a12.readStrongBinder());
        a12.recycle();
        return b12;
    }

    public final n9.a f1(n9.a aVar, String str, int i10) {
        Parcel b1 = b1();
        u9.b.b(b1, aVar);
        b1.writeString(str);
        b1.writeInt(i10);
        Parcel a12 = a1(4, b1);
        n9.a b12 = a.AbstractBinderC0227a.b1(a12.readStrongBinder());
        a12.recycle();
        return b12;
    }

    public final n9.a g1(n9.a aVar, String str, boolean z10, long j10) {
        Parcel b1 = b1();
        u9.b.b(b1, aVar);
        b1.writeString(str);
        b1.writeInt(z10 ? 1 : 0);
        b1.writeLong(j10);
        Parcel a12 = a1(7, b1);
        n9.a b12 = a.AbstractBinderC0227a.b1(a12.readStrongBinder());
        a12.recycle();
        return b12;
    }
}
