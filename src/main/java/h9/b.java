package h9;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class b<T extends IInterface> {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private c9.b zzB;
    private boolean zzC;
    private volatile c1 zzD;
    public l1 zza;
    public final Handler zzb;
    public c zzc;
    public AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final g zzn;
    private final c9.f zzo;
    private final Object zzp;
    private final Object zzq;
    private k zzr;
    private T zzs;
    private final ArrayList<x0<?>> zzt;
    private z0 zzu;
    private int zzv;
    private final a zzw;
    private final InterfaceC0147b zzx;
    private final int zzy;
    private final String zzz;
    private static final c9.d[] zze = new c9.d[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* loaded from: classes.dex */
    public interface a {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i10);
    }

    /* renamed from: h9.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0147b {
        void onConnectionFailed(c9.b bVar);
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(c9.b bVar);
    }

    /* loaded from: classes2.dex */
    public class d implements c {
        public d() {
        }

        @Override // h9.b.c
        public final void a(c9.b bVar) {
            if (bVar.q0()) {
                b bVar2 = b.this;
                bVar2.getRemoteService(null, bVar2.getScopes());
            } else if (b.this.zzx != null) {
                b.this.zzx.onConnectionFailed(bVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface e {
    }

    public b(Context context, Handler handler, g gVar, c9.f fVar, int i10, a aVar, InterfaceC0147b interfaceC0147b) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList<>();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        o.i(context, "Context must not be null");
        this.zzl = context;
        o.i(handler, "Handler must not be null");
        this.zzb = handler;
        this.zzm = handler.getLooper();
        o.i(gVar, "Supervisor must not be null");
        this.zzn = gVar;
        o.i(fVar, "API availability must not be null");
        this.zzo = fVar;
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = interfaceC0147b;
        this.zzz = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b(android.content.Context r10, android.os.Looper r11, int r12, h9.b.a r13, h9.b.InterfaceC0147b r14, java.lang.String r15) {
        /*
            r9 = this;
            h9.g r3 = h9.g.a(r10)
            c9.f r4 = c9.f.f3877b
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r13, r0)
            java.util.Objects.requireNonNull(r14, r0)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.b.<init>(android.content.Context, android.os.Looper, int, h9.b$a, h9.b$b, java.lang.String):void");
    }

    public b(Context context, Looper looper, g gVar, c9.f fVar, int i10, a aVar, InterfaceC0147b interfaceC0147b, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList<>();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        o.i(context, "Context must not be null");
        this.zzl = context;
        o.i(looper, "Looper must not be null");
        this.zzm = looper;
        o.i(gVar, "Supervisor must not be null");
        this.zzn = gVar;
        o.i(fVar, "API availability must not be null");
        this.zzo = fVar;
        this.zzb = new w0(this, looper);
        this.zzy = i10;
        this.zzw = aVar;
        this.zzx = interfaceC0147b;
        this.zzz = str;
    }

    public static void zzj(b bVar, c1 c1Var) {
        bVar.zzD = c1Var;
        if (bVar.usesClientTelemetry()) {
            h9.d dVar = c1Var.f10297m;
            p a10 = p.a();
            q qVar = dVar == null ? null : dVar.f10298c;
            synchronized (a10) {
                try {
                    if (qVar == null) {
                        qVar = p.f10367c;
                    } else {
                        q qVar2 = a10.f10368a;
                        if (qVar2 != null) {
                            if (qVar2.f10369c < qVar.f10369c) {
                            }
                        }
                    }
                    a10.f10368a = qVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public static /* bridge */ /* synthetic */ void zzk(b bVar, int i10) {
        int i11;
        int i12;
        synchronized (bVar.zzp) {
            try {
                i11 = bVar.zzv;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i11 == 3) {
            bVar.zzC = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = bVar.zzb;
        handler.sendMessage(handler.obtainMessage(i12, bVar.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(b bVar, int i10, int i11, IInterface iInterface) {
        synchronized (bVar.zzp) {
            if (bVar.zzv != i10) {
                return false;
            }
            bVar.zzp(i11, iInterface);
            return true;
        }
    }

    public static /* bridge */ /* synthetic */ boolean zzo(b bVar) {
        if (!bVar.zzC && !TextUtils.isEmpty(bVar.getServiceDescriptor()) && !TextUtils.isEmpty(bVar.getLocalStartServiceAction())) {
            try {
                Class.forName(bVar.getServiceDescriptor());
                return true;
            } catch (ClassNotFoundException unused) {
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzp(int i10, T t2) {
        l1 l1Var;
        l1 l1Var2;
        o.a((i10 == 4) == (t2 != null));
        synchronized (this.zzp) {
            this.zzv = i10;
            this.zzs = t2;
            if (i10 == 1) {
                z0 z0Var = this.zzu;
                if (z0Var != null) {
                    g gVar = this.zzn;
                    String str = this.zza.f10356a;
                    Objects.requireNonNull(str, "null reference");
                    gVar.c(str, this.zza.f10357b, 4225, z0Var, zze(), this.zza.f10358c);
                    this.zzu = null;
                }
            } else if (i10 == 2 || i10 == 3) {
                z0 z0Var2 = this.zzu;
                if (z0Var2 != null && (l1Var2 = this.zza) != null) {
                    String str2 = l1Var2.f10356a;
                    String str3 = l1Var2.f10357b;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 70 + String.valueOf(str3).length());
                    sb2.append("Calling connect() while still connected, missing disconnect() for ");
                    sb2.append(str2);
                    sb2.append(" on ");
                    sb2.append(str3);
                    Log.e("GmsClient", sb2.toString());
                    g gVar2 = this.zzn;
                    String str4 = this.zza.f10356a;
                    Objects.requireNonNull(str4, "null reference");
                    gVar2.c(str4, this.zza.f10357b, 4225, z0Var2, zze(), this.zza.f10358c);
                    this.zzd.incrementAndGet();
                }
                z0 z0Var3 = new z0(this, this.zzd.get());
                this.zzu = z0Var3;
                if (this.zzv != 3 || getLocalStartServiceAction() == null) {
                    String startServicePackage = getStartServicePackage();
                    String startServiceAction = getStartServiceAction();
                    Object obj = g.f10316a;
                    l1Var = new l1(startServicePackage, startServiceAction, 4225, getUseDynamicLookup());
                } else {
                    String packageName = getContext().getPackageName();
                    String localStartServiceAction = getLocalStartServiceAction();
                    Object obj2 = g.f10316a;
                    l1Var = new l1(packageName, localStartServiceAction, 4225, false);
                }
                this.zza = l1Var;
                if (l1Var.f10358c && getMinApkVersion() < 17895000) {
                    String valueOf = String.valueOf(this.zza.f10356a);
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
                g gVar3 = this.zzn;
                String str5 = this.zza.f10356a;
                Objects.requireNonNull(str5, "null reference");
                if (!gVar3.d(new g1(str5, this.zza.f10357b, 4225, this.zza.f10358c), z0Var3, zze(), getBindServiceExecutor())) {
                    l1 l1Var3 = this.zza;
                    String str6 = l1Var3.f10356a;
                    String str7 = l1Var3.f10357b;
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str6).length() + 34 + String.valueOf(str7).length());
                    sb3.append("unable to connect to service: ");
                    sb3.append(str6);
                    sb3.append(" on ");
                    sb3.append(str7);
                    Log.w("GmsClient", sb3.toString());
                    zzl(16, null, this.zzd.get());
                }
            } else if (i10 == 4) {
                Objects.requireNonNull(t2, "null reference");
                onConnectedLocked(t2);
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int c10 = this.zzo.c(this.zzl, getMinApkVersion());
        if (c10 == 0) {
            connect(new d());
            return;
        }
        zzp(1, null);
        triggerNotAvailable(new d(), c10, null);
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(c cVar) {
        o.i(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        zzp(2, null);
    }

    public abstract T createServiceInterface(IBinder iBinder);

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void disconnect() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r7.zzd
            r6 = 1
            r0.incrementAndGet()
            java.util.ArrayList<h9.x0<?>> r0 = r7.zzt
            r6 = 3
            monitor-enter(r0)
            r6 = 3
            java.util.ArrayList<h9.x0<?>> r1 = r7.zzt     // Catch: java.lang.Throwable -> L48
            r6 = 7
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L48
            r5 = 0
            r2 = r5
        L14:
            r5 = 0
            r3 = r5
            if (r2 >= r1) goto L2e
            java.util.ArrayList<h9.x0<?>> r4 = r7.zzt     // Catch: java.lang.Throwable -> L48
            r6 = 2
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L48
            h9.x0 r4 = (h9.x0) r4     // Catch: java.lang.Throwable -> L48
            r6 = 4
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L48
            r4.f10388a = r3     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            int r2 = r2 + 1
            r6 = 5
            goto L14
        L2a:
            r1 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2a
            throw r1     // Catch: java.lang.Throwable -> L48
            r6 = 5
        L2e:
            java.util.ArrayList<h9.x0<?>> r1 = r7.zzt     // Catch: java.lang.Throwable -> L48
            r6 = 7
            r1.clear()     // Catch: java.lang.Throwable -> L48
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            java.lang.Object r1 = r7.zzq
            r6 = 5
            monitor-enter(r1)
            r7.zzr = r3     // Catch: java.lang.Throwable -> L44
            r6 = 2
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            r5 = 1
            r0 = r5
            r7.zzp(r0, r3)
            r6 = 7
            return
        L44:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L44
            throw r0
            r6 = 2
        L48:
            r1 = move-exception
            r6 = 3
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L48
            throw r1
            r6 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.b.disconnect():void");
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void dump(java.lang.String r12, java.io.FileDescriptor r13, java.io.PrintWriter r14, java.lang.String[] r15) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.b.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public c9.d[] getApiFeatures() {
        return zze;
    }

    public final c9.d[] getAvailableFeatures() {
        c1 c1Var = this.zzD;
        if (c1Var == null) {
            return null;
        }
        return c1Var.f10295f;
    }

    public Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        l1 l1Var;
        if (!isConnected() || (l1Var = this.zza) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return l1Var.f10357b;
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return c9.f.f3876a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getRemoteService(h9.h r9, java.util.Set<com.google.android.gms.common.api.Scope> r10) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.b.getRemoteService(h9.h, java.util.Set):void");
    }

    public Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final T getService() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.zzp
            monitor-enter(r0)
            r4 = 7
            int r1 = r7.zzv     // Catch: java.lang.Throwable -> L22
            r4 = 5
            r3 = 5
            r2 = r3
            if (r1 == r2) goto L1a
            r7.checkConnected()     // Catch: java.lang.Throwable -> L22
            r6 = 5
            T extends android.os.IInterface r1 = r7.zzs     // Catch: java.lang.Throwable -> L22
            r4 = 4
            java.lang.String r3 = "Client is connected but service is null"
            r2 = r3
            h9.o.i(r1, r2)     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return r1
        L1a:
            android.os.DeadObjectException r1 = new android.os.DeadObjectException     // Catch: java.lang.Throwable -> L22
            r1.<init>()     // Catch: java.lang.Throwable -> L22
            r5 = 2
            throw r1     // Catch: java.lang.Throwable -> L22
            r6 = 1
        L22:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
            r5 = 1
        */
        throw new UnsupportedOperationException("Method not decompiled: h9.b.getService():android.os.IInterface");
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            k kVar = this.zzr;
            if (kVar == null) {
                return null;
            }
            return kVar.asBinder();
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public h9.d getTelemetryConfiguration() {
        c1 c1Var = this.zzD;
        if (c1Var == null) {
            return null;
        }
        return c1Var.f10297m;
    }

    public boolean getUseDynamicLookup() {
        return getMinApkVersion() >= 211700000;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z10;
        synchronized (this.zzp) {
            z10 = this.zzv == 4;
        }
        return z10;
    }

    public boolean isConnecting() {
        boolean z10;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public void onConnectedLocked(T t2) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(c9.b bVar) {
        this.zzi = bVar.f3858f;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new a1(this, i10, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        e9.y yVar = (e9.y) eVar;
        yVar.f9258a.f9270m.D.post(new e9.x(yVar));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.zzd.get(), i10));
    }

    public void triggerNotAvailable(c cVar, int i10, PendingIntent pendingIntent) {
        o.i(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, this.zzd.get(), i10, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        return str == null ? this.zzl.getClass().getName() : str;
    }

    public final void zzl(int i10, Bundle bundle, int i11) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new b1(this, i10)));
    }
}
