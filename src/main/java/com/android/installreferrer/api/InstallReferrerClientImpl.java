package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.android.installreferrer.commons.InstallReferrerCommons;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import n8.a;

/* loaded from: classes.dex */
public class InstallReferrerClientImpl extends InstallReferrerClient {

    /* renamed from: a  reason: collision with root package name */
    public int f4260a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4261b;

    /* renamed from: c  reason: collision with root package name */
    public n8.a f4262c;
    public ServiceConnection d;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED = 0;
    }

    /* loaded from: classes.dex */
    public final class b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final InstallReferrerStateListener f4263a;

        public b(InstallReferrerStateListener installReferrerStateListener, a aVar) {
            if (installReferrerStateListener == null) {
                throw new RuntimeException("Please specify a listener to know when setup is done.");
            }
            this.f4263a = installReferrerStateListener;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            n8.a c0226a;
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
            InstallReferrerClientImpl installReferrerClientImpl = InstallReferrerClientImpl.this;
            int i10 = a.AbstractBinderC0225a.f13415a;
            if (iBinder == null) {
                c0226a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                c0226a = queryLocalInterface instanceof n8.a ? (n8.a) queryLocalInterface : new a.AbstractBinderC0225a.C0226a(iBinder);
            }
            installReferrerClientImpl.f4262c = c0226a;
            InstallReferrerClientImpl.this.f4260a = 2;
            this.f4263a.onInstallReferrerSetupFinished(0);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
            InstallReferrerClientImpl installReferrerClientImpl = InstallReferrerClientImpl.this;
            installReferrerClientImpl.f4262c = null;
            installReferrerClientImpl.f4260a = 0;
            this.f4263a.onInstallReferrerServiceDisconnected();
        }
    }

    public InstallReferrerClientImpl(Context context) {
        this.f4261b = context.getApplicationContext();
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public void endConnection() {
        this.f4260a = 3;
        if (this.d != null) {
            InstallReferrerCommons.logVerbose("InstallReferrerClient", "Unbinding from service.");
            this.f4261b.unbindService(this.d);
            this.d = null;
        }
        this.f4262c = null;
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public ReferrerDetails getInstallReferrer() {
        if (isReady()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f4261b.getPackageName());
            try {
                return new ReferrerDetails(this.f4262c.a0(bundle));
            } catch (RemoteException e10) {
                InstallReferrerCommons.logWarn("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f4260a = 0;
                throw e10;
            }
        }
        throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
    }

    @Override // com.android.installreferrer.api.InstallReferrerClient
    public boolean isReady() {
        return (this.f4260a != 2 || this.f4262c == null || this.d == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5  */
    @Override // com.android.installreferrer.api.InstallReferrerClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void startConnection(com.android.installreferrer.api.InstallReferrerStateListener r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.installreferrer.api.InstallReferrerClientImpl.startConnection(com.android.installreferrer.api.InstallReferrerStateListener):void");
    }
}
