package h9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes2.dex */
public final class i0 implements Parcelable.Creator<h0> {
    @Override // android.os.Parcelable.Creator
    public final h0 createFromParcel(Parcel parcel) {
        int u2 = SafeParcelReader.u(parcel);
        int i10 = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i11 = 0;
        while (parcel.dataPosition() < u2) {
            int readInt = parcel.readInt();
            char c10 = (char) readInt;
            if (c10 == 1) {
                i10 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 == 2) {
                account = (Account) SafeParcelReader.e(parcel, readInt, Account.CREATOR);
            } else if (c10 == 3) {
                i11 = SafeParcelReader.q(parcel, readInt);
            } else if (c10 != 4) {
                SafeParcelReader.t(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.e(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.k(parcel, u2);
        return new h0(i10, account, i11, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h0[] newArray(int i10) {
        return new h0[i10];
    }
}
