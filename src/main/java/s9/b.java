package s9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import ca.g;
import ca.k;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import e9.n0;
import e9.p0;

/* loaded from: classes.dex */
public class b extends Binder implements IInterface {
    public b(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        ca.e eVar = (ca.e) this;
        switch (i10) {
            case 3:
                c9.b bVar = (c9.b) c.a(parcel, c9.b.CREATOR);
                ca.b bVar2 = (ca.b) c.a(parcel, ca.b.CREATOR);
                break;
            case 4:
                Status status = (Status) c.a(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                Status status2 = (Status) c.a(parcel, Status.CREATOR);
                break;
            case 7:
                Status status3 = (Status) c.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) c.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                p0 p0Var = (p0) eVar;
                p0Var.f9238b.post(new n0(p0Var, (k) c.a(parcel, k.CREATOR)));
                break;
            case 9:
                g gVar = (g) c.a(parcel, g.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
