package mb;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.UserManager;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e9.b;
import h9.m;
import h9.o;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l9.h;
import p.g;
import qb.i;
import qb.n;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: i  reason: collision with root package name */
    public static final Object f13063i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static final Executor f13064j = new d(null);

    /* renamed from: k  reason: collision with root package name */
    public static final Map<String, c> f13065k = new p.a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f13066a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13067b;

    /* renamed from: c  reason: collision with root package name */
    public final mb.d f13068c;
    public final i d;

    /* renamed from: g  reason: collision with root package name */
    public final n<rc.a> f13071g;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f13069e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f13070f = new AtomicBoolean();

    /* renamed from: h  reason: collision with root package name */
    public final List<b> f13072h = new CopyOnWriteArrayList();

    /* loaded from: classes2.dex */
    public interface b {
        void a(boolean z10);
    }

    @TargetApi(14)
    /* renamed from: mb.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0214c implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public static AtomicReference<C0214c> f13073a = new AtomicReference<>();

        @Override // e9.b.a
        public void a(boolean z10) {
            Object obj = c.f13063i;
            synchronized (c.f13063i) {
                Iterator it = new ArrayList(((p.a) c.f13065k).values()).iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.f13069e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        for (b bVar : cVar.f13072h) {
                            bVar.a(z10);
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class d implements Executor {

        /* renamed from: c  reason: collision with root package name */
        public static final Handler f13074c = new Handler(Looper.getMainLooper());

        public d(a aVar) {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f13074c.post(runnable);
        }
    }

    @TargetApi(24)
    /* loaded from: classes2.dex */
    public static class e extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static AtomicReference<e> f13075b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        public final Context f13076a;

        public e(Context context) {
            this.f13076a = context;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object obj = c.f13063i;
            synchronized (c.f13063i) {
                try {
                    for (c cVar : ((p.a) c.f13065k).values()) {
                        cVar.d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f13076a.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[LOOP:0: B:25:0x00b5->B:27:0x00bb, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(final android.content.Context r9, java.lang.String r10, mb.d r11) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.c.<init>(android.content.Context, java.lang.String, mb.d):void");
    }

    public static c b() {
        c cVar;
        synchronized (f13063i) {
            cVar = (c) ((g) f13065k).get("[DEFAULT]");
            if (cVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + h.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return cVar;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static mb.c e(android.content.Context r10, mb.d r11) {
        /*
            java.util.concurrent.atomic.AtomicReference<mb.c$c> r0 = mb.c.C0214c.f13073a
            r9 = 2
            android.content.Context r6 = r10.getApplicationContext()
            r0 = r6
            boolean r0 = r0 instanceof android.app.Application
            if (r0 != 0) goto Le
            r7 = 3
            goto L4a
        Le:
            r8 = 7
            android.content.Context r6 = r10.getApplicationContext()
            r0 = r6
            android.app.Application r0 = (android.app.Application) r0
            r8 = 5
            java.util.concurrent.atomic.AtomicReference<mb.c$c> r1 = mb.c.C0214c.f13073a
            java.lang.Object r6 = r1.get()
            r1 = r6
            if (r1 != 0) goto L49
            r8 = 5
            mb.c$c r1 = new mb.c$c
            r1.<init>()
            r7 = 7
            java.util.concurrent.atomic.AtomicReference<mb.c$c> r2 = mb.c.C0214c.f13073a
            r3 = 0
            boolean r6 = r2.compareAndSet(r3, r1)
            r2 = r6
            if (r2 == 0) goto L49
            e9.b.a(r0)
            r7 = 5
            e9.b r0 = e9.b.n
            java.util.Objects.requireNonNull(r0)
            monitor-enter(r0)
            r9 = 1
            java.util.ArrayList<e9.b$a> r2 = r0.f9155j     // Catch: java.lang.Throwable -> L45
            r8 = 2
            r2.add(r1)     // Catch: java.lang.Throwable -> L45
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            r8 = 1
            goto L4a
        L45:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r10
            r8 = 5
        L49:
            r9 = 6
        L4a:
            java.lang.String r6 = "[DEFAULT]"
            r0 = r6
            android.content.Context r6 = r10.getApplicationContext()
            r1 = r6
            if (r1 != 0) goto L55
            goto L5b
        L55:
            r9 = 3
            android.content.Context r6 = r10.getApplicationContext()
            r10 = r6
        L5b:
            java.lang.Object r1 = mb.c.f13063i
            r8 = 4
            monitor-enter(r1)
            r7 = 7
            java.util.Map<java.lang.String, mb.c> r2 = mb.c.f13065k     // Catch: java.lang.Throwable -> L99
            r3 = r2
            p.g r3 = (p.g) r3     // Catch: java.lang.Throwable -> L99
            int r3 = r3.e(r0)     // Catch: java.lang.Throwable -> L99
            r4 = 1
            r7 = 2
            r6 = 0
            r5 = r6
            if (r3 < 0) goto L73
            r7 = 7
            r3 = 1
            r7 = 4
            goto L75
        L73:
            r6 = 0
            r3 = r6
        L75:
            if (r3 != 0) goto L79
            r8 = 2
            goto L7b
        L79:
            r6 = 0
            r4 = r6
        L7b:
            java.lang.String r3 = "FirebaseApp name [DEFAULT] already exists!"
            r9 = 6
            h9.o.k(r4, r3)     // Catch: java.lang.Throwable -> L99
            r7 = 7
            java.lang.String r6 = "Application context cannot be null."
            r3 = r6
            h9.o.i(r10, r3)     // Catch: java.lang.Throwable -> L99
            mb.c r3 = new mb.c     // Catch: java.lang.Throwable -> L99
            r8 = 6
            r3.<init>(r10, r0, r11)     // Catch: java.lang.Throwable -> L99
            p.g r2 = (p.g) r2     // Catch: java.lang.Throwable -> L99
            r7 = 5
            r2.put(r0, r3)     // Catch: java.lang.Throwable -> L99
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L99
            r3.d()
            return r3
        L99:
            r10 = move-exception
            r9 = 6
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L99
            throw r10
            r7 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.c.e(android.content.Context, mb.d):mb.c");
    }

    public final void a() {
        o.k(!this.f13070f.get(), "FirebaseApp was deleted");
    }

    public String c() {
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f13067b.getBytes(Charset.defaultCharset());
        sb2.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb2.append("+");
        a();
        byte[] bytes2 = this.f13068c.f13078b.getBytes(Charset.defaultCharset());
        sb2.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb2.toString();
    }

    public final void d() {
        HashMap hashMap;
        if (!(Build.VERSION.SDK_INT >= 24 ? ((UserManager) this.f13066a.getSystemService(UserManager.class)).isUserUnlocked() : true)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f13067b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f13066a;
            if (e.f13075b.get() == null) {
                e eVar = new e(context);
                if (e.f13075b.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Device unlocked: initializing all Firebase APIs for app ");
            a();
            sb3.append(this.f13067b);
            Log.i("FirebaseApp", sb3.toString());
            i iVar = this.d;
            boolean g10 = g();
            if (!iVar.f14464t.compareAndSet(null, Boolean.valueOf(g10))) {
                return;
            }
            synchronized (iVar) {
                hashMap = new HashMap(iVar.f14460c);
            }
            iVar.i(hashMap, g10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            String str = this.f13067b;
            c cVar = (c) obj;
            cVar.a();
            return str.equals(cVar.f13067b);
        }
        return false;
    }

    public boolean f() {
        boolean z10;
        a();
        rc.a aVar = this.f13071g.get();
        synchronized (aVar) {
            try {
                z10 = aVar.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    public boolean g() {
        a();
        return "[DEFAULT]".equals(this.f13067b);
    }

    public int hashCode() {
        return this.f13067b.hashCode();
    }

    public String toString() {
        m.a aVar = new m.a(this);
        aVar.a(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f13067b);
        aVar.a("options", this.f13068c);
        return aVar.toString();
    }
}
