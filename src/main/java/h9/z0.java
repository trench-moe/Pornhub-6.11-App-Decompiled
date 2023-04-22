package h9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public final class z0 implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final int f10395a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f10396b;

    public z0(b bVar, int i10) {
        this.f10396b = bVar;
        this.f10395a = i10;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        b bVar = this.f10396b;
        if (iBinder == null) {
            b.zzk(bVar, 16);
            return;
        }
        obj = bVar.zzq;
        synchronized (obj) {
            b bVar2 = this.f10396b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            bVar2.zzr = (queryLocalInterface == null || !(queryLocalInterface instanceof k)) ? new q0(iBinder) : (k) queryLocalInterface;
        }
        this.f10396b.zzl(0, null, this.f10395a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f10396b.zzq;
        synchronized (obj) {
            this.f10396b.zzr = null;
        }
        Handler handler = this.f10396b.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.f10395a, 1));
    }
}
