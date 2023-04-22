package h9;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import h9.h;

/* loaded from: classes2.dex */
public class e extends i9.a {
    public static final Parcelable.Creator<e> CREATOR = new f1();
    public boolean A;
    public int B;
    public boolean C;
    public String D;

    /* renamed from: c  reason: collision with root package name */
    public final int f10303c;

    /* renamed from: f  reason: collision with root package name */
    public final int f10304f;

    /* renamed from: j  reason: collision with root package name */
    public int f10305j;

    /* renamed from: m  reason: collision with root package name */
    public String f10306m;
    public IBinder n;

    /* renamed from: t  reason: collision with root package name */
    public Scope[] f10307t;

    /* renamed from: u  reason: collision with root package name */
    public Bundle f10308u;

    /* renamed from: w  reason: collision with root package name */
    public Account f10309w;
    public c9.d[] y;

    /* renamed from: z  reason: collision with root package name */
    public c9.d[] f10310z;

    public e(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, c9.d[] dVarArr, c9.d[] dVarArr2, boolean z10, int i13, boolean z11, String str2) {
        this.f10303c = i10;
        this.f10304f = i11;
        this.f10305j = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f10306m = "com.google.android.gms";
        } else {
            this.f10306m = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                h b1 = h.a.b1(iBinder);
                int i14 = a.f10275a;
                if (b1 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        try {
                            account2 = b1.zzb();
                        } catch (RemoteException unused) {
                            Log.w("AccountAccessor", "Remote account accessor probably died");
                        }
                    } finally {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    }
                }
            }
            this.f10309w = account2;
        } else {
            this.n = iBinder;
            this.f10309w = account;
        }
        this.f10307t = scopeArr;
        this.f10308u = bundle;
        this.y = dVarArr;
        this.f10310z = dVarArr2;
        this.A = z10;
        this.B = i13;
        this.C = z11;
        this.D = str2;
    }

    public e(int i10, String str) {
        this.f10303c = 6;
        this.f10305j = c9.f.f3876a;
        this.f10304f = i10;
        this.A = true;
        this.D = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        f1.a(this, parcel, i10);
    }
}
