package v8;

import android.os.Parcel;
import n9.a;

/* loaded from: classes2.dex */
public abstract class u extends t9.l implements v {
    public u() {
        super("com.google.android.gms.cast.framework.ISessionManagerListener");
    }

    @Override // t9.l
    public final boolean a1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        h<T> hVar;
        h<T> hVar2;
        h<T> hVar3;
        h<T> hVar4;
        h<T> hVar5;
        h<T> hVar6;
        h<T> hVar7;
        h<T> hVar8;
        h<T> hVar9;
        boolean z10 = false;
        switch (i10) {
            case 1:
                n9.b bVar = new n9.b(((z) this).f16106a);
                parcel2.writeNoException();
                t9.v.d(parcel2, bVar);
                break;
            case 2:
                z zVar = (z) this;
                f fVar = (f) n9.b.c1(a.AbstractBinderC0227a.b1(parcel.readStrongBinder()));
                if (zVar.f16107b.isInstance(fVar) && (hVar = zVar.f16106a) != 0) {
                    hVar.k((f) zVar.f16107b.cast(fVar));
                }
                parcel2.writeNoException();
                break;
            case 3:
                n9.a b1 = a.AbstractBinderC0227a.b1(parcel.readStrongBinder());
                String readString = parcel.readString();
                z zVar2 = (z) this;
                f fVar2 = (f) n9.b.c1(b1);
                if (zVar2.f16107b.isInstance(fVar2) && (hVar2 = zVar2.f16106a) != 0) {
                    hVar2.h((f) zVar2.f16107b.cast(fVar2), readString);
                }
                parcel2.writeNoException();
                break;
            case 4:
                n9.a b12 = a.AbstractBinderC0227a.b1(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                z zVar3 = (z) this;
                f fVar3 = (f) n9.b.c1(b12);
                if (zVar3.f16107b.isInstance(fVar3) && (hVar3 = zVar3.f16106a) != 0) {
                    hVar3.l((f) zVar3.f16107b.cast(fVar3), readInt);
                }
                parcel2.writeNoException();
                break;
            case 5:
                z zVar4 = (z) this;
                f fVar4 = (f) n9.b.c1(a.AbstractBinderC0227a.b1(parcel.readStrongBinder()));
                if (zVar4.f16107b.isInstance(fVar4) && (hVar4 = zVar4.f16106a) != 0) {
                    hVar4.g((f) zVar4.f16107b.cast(fVar4));
                }
                parcel2.writeNoException();
                break;
            case 6:
                n9.a b13 = a.AbstractBinderC0227a.b1(parcel.readStrongBinder());
                int readInt2 = parcel.readInt();
                z zVar5 = (z) this;
                f fVar5 = (f) n9.b.c1(b13);
                if (zVar5.f16107b.isInstance(fVar5) && (hVar5 = zVar5.f16106a) != 0) {
                    hVar5.n((f) zVar5.f16107b.cast(fVar5), readInt2);
                }
                parcel2.writeNoException();
                break;
            case 7:
                n9.a b14 = a.AbstractBinderC0227a.b1(parcel.readStrongBinder());
                String readString2 = parcel.readString();
                z zVar6 = (z) this;
                f fVar6 = (f) n9.b.c1(b14);
                if (zVar6.f16107b.isInstance(fVar6) && (hVar6 = zVar6.f16106a) != 0) {
                    hVar6.j((f) zVar6.f16107b.cast(fVar6), readString2);
                }
                parcel2.writeNoException();
                break;
            case 8:
                n9.a b15 = a.AbstractBinderC0227a.b1(parcel.readStrongBinder());
                int i12 = t9.v.f15358a;
                if (parcel.readInt() != 0) {
                    z10 = true;
                }
                z zVar7 = (z) this;
                f fVar7 = (f) n9.b.c1(b15);
                if (zVar7.f16107b.isInstance(fVar7) && (hVar7 = zVar7.f16106a) != 0) {
                    hVar7.f((f) zVar7.f16107b.cast(fVar7), z10);
                }
                parcel2.writeNoException();
                break;
            case 9:
                n9.a b16 = a.AbstractBinderC0227a.b1(parcel.readStrongBinder());
                int readInt3 = parcel.readInt();
                z zVar8 = (z) this;
                f fVar8 = (f) n9.b.c1(b16);
                if (zVar8.f16107b.isInstance(fVar8) && (hVar8 = zVar8.f16106a) != 0) {
                    hVar8.e((f) zVar8.f16107b.cast(fVar8), readInt3);
                }
                parcel2.writeNoException();
                break;
            case 10:
                n9.a b17 = a.AbstractBinderC0227a.b1(parcel.readStrongBinder());
                int readInt4 = parcel.readInt();
                z zVar9 = (z) this;
                f fVar9 = (f) n9.b.c1(b17);
                if (zVar9.f16107b.isInstance(fVar9) && (hVar9 = zVar9.f16106a) != 0) {
                    hVar9.a((f) zVar9.f16107b.cast(fVar9), readInt4);
                }
                parcel2.writeNoException();
                break;
            case 11:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                break;
            default:
                return false;
        }
        return true;
    }
}
