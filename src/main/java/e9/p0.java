package e9;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import d9.a;
import d9.c;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class p0 extends ca.d implements c.a, c.b {

    /* renamed from: h  reason: collision with root package name */
    public static final a.AbstractC0121a<? extends ba.d, ba.a> f9236h = ba.c.f3625a;

    /* renamed from: a  reason: collision with root package name */
    public final Context f9237a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f9238b;

    /* renamed from: c  reason: collision with root package name */
    public final a.AbstractC0121a<? extends ba.d, ba.a> f9239c;
    public final Set<Scope> d;

    /* renamed from: e  reason: collision with root package name */
    public final h9.c f9240e;

    /* renamed from: f  reason: collision with root package name */
    public ba.d f9241f;

    /* renamed from: g  reason: collision with root package name */
    public o0 f9242g;

    public p0(Context context, Handler handler, h9.c cVar) {
        a.AbstractC0121a<? extends ba.d, ba.a> abstractC0121a = f9236h;
        this.f9237a = context;
        this.f9238b = handler;
        this.f9240e = cVar;
        this.d = cVar.f10283b;
        this.f9239c = abstractC0121a;
    }

    @Override // e9.c
    public final void onConnected(Bundle bundle) {
        ca.a aVar = (ca.a) this.f9241f;
        Objects.requireNonNull(aVar);
        try {
            Account account = aVar.d.f10282a;
            if (account == null) {
                account = new Account(h9.b.DEFAULT_ACCOUNT, "com.google");
            }
            GoogleSignInAccount b10 = h9.b.DEFAULT_ACCOUNT.equals(account.name) ? s8.a.a(aVar.getContext()).b() : null;
            Integer num = aVar.f3907f;
            Objects.requireNonNull(num, "null reference");
            h9.h0 h0Var = new h9.h0(account, num.intValue(), b10);
            ca.f fVar = (ca.f) aVar.getService();
            ca.i iVar = new ca.i(1, h0Var);
            Parcel a12 = fVar.a1();
            s9.c.b(a12, iVar);
            a12.writeStrongBinder(this);
            Parcel obtain = Parcel.obtain();
            fVar.f14928a.transact(12, a12, obtain, 0);
            obtain.readException();
            a12.recycle();
            obtain.recycle();
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f9238b.post(new n0(this, new ca.k(1, new c9.b(8, null), null)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // e9.i
    public final void onConnectionFailed(c9.b bVar) {
        ((c0) this.f9242g).b(bVar);
    }

    @Override // e9.c
    public final void onConnectionSuspended(int i10) {
        ((h9.b) this.f9241f).disconnect();
    }
}
