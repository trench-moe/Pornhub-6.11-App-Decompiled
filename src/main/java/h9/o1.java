package h9;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class o1 extends u9.a implements p1 {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f10365a = 0;

    public o1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    @Override // u9.a
    public final boolean a1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            n9.a c10 = ((c9.s) this).c();
            parcel2.writeNoException();
            u9.b.b(parcel2, c10);
        } else if (i10 != 2) {
            return false;
        } else {
            int i12 = ((c9.s) this).f3890b;
            parcel2.writeNoException();
            parcel2.writeInt(i12);
        }
        return true;
    }
}
