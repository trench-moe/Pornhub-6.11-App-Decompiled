package h9;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class f1 implements Parcelable.Creator<e> {
    public static void a(e eVar, Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        int i11 = eVar.f10303c;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        int i12 = eVar.f10304f;
        parcel.writeInt(262146);
        parcel.writeInt(i12);
        int i13 = eVar.f10305j;
        parcel.writeInt(262147);
        parcel.writeInt(i13);
        t9.k0.r(parcel, 4, eVar.f10306m, false);
        t9.k0.n(parcel, 5, eVar.n, false);
        t9.k0.t(parcel, 6, eVar.f10307t, i10, false);
        t9.k0.l(parcel, 7, eVar.f10308u, false);
        t9.k0.q(parcel, 8, eVar.f10309w, i10, false);
        t9.k0.t(parcel, 10, eVar.y, i10, false);
        t9.k0.t(parcel, 11, eVar.f10310z, i10, false);
        boolean z10 = eVar.A;
        parcel.writeInt(262156);
        parcel.writeInt(z10 ? 1 : 0);
        int i14 = eVar.B;
        parcel.writeInt(262157);
        parcel.writeInt(i14);
        boolean z11 = eVar.C;
        parcel.writeInt(262158);
        parcel.writeInt(z11 ? 1 : 0);
        t9.k0.r(parcel, 15, eVar.D, false);
        t9.k0.z(parcel, v2);
    }

    @Override // android.os.Parcelable.Creator
    public final e createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        c9.d[] dVarArr = null;
        c9.d[] dVarArr2 = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i10 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 2:
                    i11 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 3:
                    i12 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 4:
                    str = SafeParcelReader.f(parcel, readInt);
                    break;
                case 5:
                    iBinder = SafeParcelReader.p(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.i(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.a(parcel, readInt);
                    break;
                case '\b':
                    account = (Account) SafeParcelReader.e(parcel, readInt, Account.CREATOR);
                    break;
                case '\t':
                default:
                    SafeParcelReader.t(parcel, readInt);
                    break;
                case '\n':
                    dVarArr = (c9.d[]) SafeParcelReader.i(parcel, readInt, c9.d.CREATOR);
                    break;
                case 11:
                    dVarArr2 = (c9.d[]) SafeParcelReader.i(parcel, readInt, c9.d.CREATOR);
                    break;
                case '\f':
                    z10 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\r':
                    i13 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 14:
                    z11 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 15:
                    str2 = SafeParcelReader.f(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new e(i10, i11, i12, str, iBinder, scopeArr, bundle, account, dVarArr, dVarArr2, z10, i13, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e[] newArray(int i10) {
        return new e[i10];
    }
}
