package w8;

import android.os.Parcel;

/* loaded from: classes2.dex */
public abstract class h0 extends t9.l implements i0 {
    public h0() {
        super("com.google.android.gms.cast.framework.media.IImagePicker");
    }

    @Override // t9.l
    public final boolean a1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            int readInt = parcel.readInt();
            g9.a a10 = ((m0) this).f17023a.a((u8.j) t9.v.a(parcel, u8.j.CREATOR), readInt);
            parcel2.writeNoException();
            t9.v.c(parcel2, a10);
        } else if (i10 == 2) {
            n9.b bVar = new n9.b(((m0) this).f17023a);
            parcel2.writeNoException();
            t9.v.d(parcel2, bVar);
        } else if (i10 == 3) {
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
        } else if (i10 != 4) {
            return false;
        } else {
            g9.a b10 = ((m0) this).f17023a.b((u8.j) t9.v.a(parcel, u8.j.CREATOR), (b) t9.v.a(parcel, b.CREATOR));
            parcel2.writeNoException();
            t9.v.c(parcel2, b10);
        }
        return true;
    }
}
