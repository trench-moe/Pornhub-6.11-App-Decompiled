package o9;

import android.os.IBinder;
import android.os.Parcel;
import n9.a;

/* loaded from: classes2.dex */
public final class g extends r9.a {
    public g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final n9.a d1(n9.a aVar, String str, int i10, n9.a aVar2) {
        Parcel b1 = b1();
        u9.b.b(b1, aVar);
        b1.writeString(str);
        b1.writeInt(i10);
        u9.b.b(b1, aVar2);
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
        Parcel a12 = a1(3, b1);
        n9.a b12 = a.AbstractBinderC0227a.b1(a12.readStrongBinder());
        a12.recycle();
        return b12;
    }
}
