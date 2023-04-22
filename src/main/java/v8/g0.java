package v8;

import android.os.Parcel;
import e9.m;
import u8.e1;

/* loaded from: classes2.dex */
public abstract class g0 extends t9.l implements h0 {
    public g0() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    @Override // t9.l
    public final boolean a1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            c0 c0Var = (c0) this;
            e1 e1Var = c0Var.f16078a.f16084h;
            if (e1Var != null) {
                m.a aVar = new m.a();
                u8.l0 l0Var = (u8.l0) e1Var;
                aVar.f9224a = new l6.r(l0Var, readString, readString2);
                aVar.d = 8407;
                l0Var.b(1, aVar.a()).b(new k2.c(c0Var, 6));
            }
            parcel2.writeNoException();
        } else if (i10 == 2) {
            String readString3 = parcel.readString();
            u8.g gVar = (u8.g) t9.v.a(parcel, u8.g.CREATOR);
            c0 c0Var2 = (c0) this;
            e1 e1Var2 = c0Var2.f16078a.f16084h;
            if (e1Var2 != null) {
                m.a aVar2 = new m.a();
                u8.l0 l0Var2 = (u8.l0) e1Var2;
                aVar2.f9224a = new u8.c0(l0Var2, readString3, gVar);
                aVar2.d = 8406;
                l0Var2.b(1, aVar2.a()).b(new o3.d(c0Var2));
            }
            parcel2.writeNoException();
        } else if (i10 == 3) {
            String readString4 = parcel.readString();
            e1 e1Var3 = ((c0) this).f16078a.f16084h;
            if (e1Var3 != null) {
                m.a aVar3 = new m.a();
                u8.l0 l0Var3 = (u8.l0) e1Var3;
                aVar3.f9224a = new w6.z(l0Var3, readString4);
                aVar3.d = 8409;
                l0Var3.b(1, aVar3.a());
            }
            parcel2.writeNoException();
        } else if (i10 == 4) {
            d.o(((c0) this).f16078a, parcel.readInt());
            parcel2.writeNoException();
        } else if (i10 != 5) {
            return false;
        } else {
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
        }
        return true;
    }
}
