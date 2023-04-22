package h9;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* loaded from: classes2.dex */
public final class h0 extends i9.a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: c  reason: collision with root package name */
    public final int f10324c;

    /* renamed from: f  reason: collision with root package name */
    public final Account f10325f;

    /* renamed from: j  reason: collision with root package name */
    public final int f10326j;

    /* renamed from: m  reason: collision with root package name */
    public final GoogleSignInAccount f10327m;

    public h0(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f10324c = i10;
        this.f10325f = account;
        this.f10326j = i11;
        this.f10327m = googleSignInAccount;
    }

    public h0(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f10324c = 2;
        this.f10325f = account;
        this.f10326j = i10;
        this.f10327m = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int v2 = t9.k0.v(parcel, 20293);
        int i11 = this.f10324c;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        t9.k0.q(parcel, 2, this.f10325f, i10, false);
        int i12 = this.f10326j;
        parcel.writeInt(262147);
        parcel.writeInt(i12);
        t9.k0.q(parcel, 4, this.f10327m, i10, false);
        t9.k0.z(parcel, v2);
    }
}
