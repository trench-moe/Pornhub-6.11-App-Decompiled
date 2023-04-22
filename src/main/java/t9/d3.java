package t9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import j1.l;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class d3 extends l implements p3 {
    public d3() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v5, types: [t9.r3] */
    @Override // t9.l
    public final boolean a1(int i10, Parcel parcel, Parcel parcel2, int i11) {
        q3 q3Var;
        int i12 = 0;
        switch (i10) {
            case 1:
                Bundle bundle = (Bundle) v.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    q3Var = r8;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    q3Var = queryLocalInterface instanceof r3 ? (r3) queryLocalInterface : new q3(readStrongBinder);
                }
                f fVar = (f) this;
                j1.k b10 = j1.k.b(bundle);
                if (!fVar.f15208b.containsKey(b10)) {
                    fVar.f15208b.put(b10, new HashSet());
                }
                fVar.f15208b.get(b10).add(new b(q3Var));
                parcel2.writeNoException();
                break;
            case 2:
                final int readInt = parcel.readInt();
                final f fVar2 = (f) this;
                final j1.k b11 = j1.k.b((Bundle) v.a(parcel, Bundle.CREATOR));
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    fVar2.c1(b11, readInt);
                } else {
                    new x(Looper.getMainLooper()).post(new Runnable() { // from class: t9.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            f fVar3 = f.this;
                            j1.k kVar = b11;
                            int i13 = readInt;
                            synchronized (fVar3.f15208b) {
                                fVar3.c1(kVar, i13);
                            }
                        }
                    });
                }
                parcel2.writeNoException();
                break;
            case 3:
                f fVar3 = (f) this;
                j1.k b12 = j1.k.b((Bundle) v.a(parcel, Bundle.CREATOR));
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    fVar3.d1(b12);
                } else {
                    new x(Looper.getMainLooper()).post(new e9.n0(fVar3, b12));
                }
                parcel2.writeNoException();
                break;
            case 4:
                boolean h10 = ((f) this).f15207a.h(j1.k.b((Bundle) v.a(parcel, Bundle.CREATOR)), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(h10 ? 1 : 0);
                break;
            case 5:
                String readString = parcel.readString();
                f fVar4 = (f) this;
                Iterator<l.i> it = fVar4.f15207a.f().iterator();
                while (true) {
                    if (it.hasNext()) {
                        l.i next = it.next();
                        if (next.f11332c.equals(readString)) {
                            fVar4.f15207a.j(next);
                        }
                    }
                }
                parcel2.writeNoException();
                break;
            case 6:
                j1.l lVar = ((f) this).f15207a;
                Objects.requireNonNull(lVar);
                j1.l.b();
                lVar.j(j1.l.d.f());
                parcel2.writeNoException();
                break;
            case 7:
                f fVar5 = (f) this;
                Objects.requireNonNull(fVar5.f15207a);
                j1.l.b();
                l.i f10 = j1.l.d.f();
                if (f10 != null && fVar5.f15207a.g().f11332c.equals(f10.f11332c)) {
                    i12 = 1;
                }
                parcel2.writeNoException();
                int i13 = v.f15358a;
                parcel2.writeInt(i12);
                break;
            case 8:
                String readString2 = parcel.readString();
                Iterator<l.i> it2 = ((f) this).f15207a.f().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        l.i next2 = it2.next();
                        r8 = next2.f11332c.equals(readString2) ? next2.f11345r : null;
                    }
                }
                parcel2.writeNoException();
                v.c(parcel2, r8);
                break;
            case 9:
                String str = ((f) this).f15207a.g().f11332c;
                parcel2.writeNoException();
                parcel2.writeString(str);
                break;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                break;
            case 11:
                f fVar6 = (f) this;
                for (Set<l.b> set : fVar6.f15208b.values()) {
                    for (l.b bVar : set) {
                        fVar6.f15207a.i(bVar);
                    }
                }
                fVar6.f15208b.clear();
                parcel2.writeNoException();
                break;
            case 12:
                f fVar7 = (f) this;
                Objects.requireNonNull(fVar7.f15207a);
                j1.l.b();
                l.i iVar = j1.l.d.f11296p;
                if (iVar != null && fVar7.f15207a.g().f11332c.equals(iVar.f11332c)) {
                    i12 = 1;
                }
                parcel2.writeNoException();
                int i14 = v.f15358a;
                parcel2.writeInt(i12);
                break;
            case 13:
                ((f) this).f15207a.k(parcel.readInt());
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
