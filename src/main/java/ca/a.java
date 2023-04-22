package ca;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import d9.c;

/* loaded from: classes.dex */
public class a extends h9.f<f> implements ba.d {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f3905c;
    public final h9.c d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f3906e;

    /* renamed from: f  reason: collision with root package name */
    public final Integer f3907f;

    public a(Context context, Looper looper, h9.c cVar, Bundle bundle, c.a aVar, c.b bVar) {
        super(context, looper, 44, cVar, aVar, bVar);
        this.f3905c = true;
        this.d = cVar;
        this.f3906e = bundle;
        this.f3907f = cVar.f10288h;
    }

    @Override // h9.b
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder);
    }

    @Override // h9.b
    public final Bundle getGetServiceRequestExtraArgs() {
        if (!getContext().getPackageName().equals(this.d.f10285e)) {
            this.f3906e.putString("com.google.android.gms.signin.internal.realClientPackageName", this.d.f10285e);
        }
        return this.f3906e;
    }

    @Override // h9.b, d9.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // h9.b
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // h9.b
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // h9.b, d9.a.f
    public final boolean requiresSignIn() {
        return this.f3905c;
    }
}
