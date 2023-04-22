package h9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import h9.b;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class a1 extends o0 {

    /* renamed from: g  reason: collision with root package name */
    public final IBinder f10277g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ b f10278h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(b bVar, int i10, IBinder iBinder, Bundle bundle) {
        super(bVar, i10, bundle);
        this.f10278h = bVar;
        this.f10277g = iBinder;
    }

    @Override // h9.o0
    public final void d(c9.b bVar) {
        if (this.f10278h.zzx != null) {
            this.f10278h.zzx.onConnectionFailed(bVar);
        }
        this.f10278h.onConnectionFailed(bVar);
    }

    @Override // h9.o0
    public final boolean e() {
        b.a aVar;
        b.a aVar2;
        try {
            IBinder iBinder = this.f10277g;
            Objects.requireNonNull(iBinder, "null reference");
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f10278h.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = this.f10278h.getServiceDescriptor();
                StringBuilder sb2 = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(serviceDescriptor);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface createServiceInterface = this.f10278h.createServiceInterface(this.f10277g);
            if (createServiceInterface == null || !(b.zzn(this.f10278h, 2, 4, createServiceInterface) || b.zzn(this.f10278h, 3, 4, createServiceInterface))) {
                return false;
            }
            this.f10278h.zzB = null;
            Bundle connectionHint = this.f10278h.getConnectionHint();
            b bVar = this.f10278h;
            aVar = bVar.zzw;
            if (aVar != null) {
                aVar2 = bVar.zzw;
                aVar2.onConnected(connectionHint);
            }
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
