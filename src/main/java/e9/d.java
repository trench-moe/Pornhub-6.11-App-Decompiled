package e9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes.dex */
public class d implements Handler.Callback {
    public static final Status F = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status G = new Status(4, "The user must be signed in to make this API call.");
    public static final Object H = new Object();
    public static d I;
    @NotOnlyInitialized
    public final Handler D;
    public volatile boolean E;

    /* renamed from: j  reason: collision with root package name */
    public h9.r f9171j;

    /* renamed from: m  reason: collision with root package name */
    public h9.s f9172m;
    public final Context n;

    /* renamed from: t  reason: collision with root package name */
    public final c9.e f9173t;

    /* renamed from: u  reason: collision with root package name */
    public final h9.c0 f9174u;

    /* renamed from: c  reason: collision with root package name */
    public long f9169c = 10000;

    /* renamed from: f  reason: collision with root package name */
    public boolean f9170f = false;

    /* renamed from: w  reason: collision with root package name */
    public final AtomicInteger f9175w = new AtomicInteger(1);
    public final AtomicInteger y = new AtomicInteger(0);

    /* renamed from: z  reason: collision with root package name */
    public final Map<a<?>, z<?>> f9176z = new ConcurrentHashMap(5, 0.75f, 1);
    public q A = null;
    public final Set<a<?>> B = new p.c(0);
    public final Set<a<?>> C = new p.c(0);

    public d(Context context, Looper looper, c9.e eVar) {
        boolean z10 = true;
        this.E = true;
        this.n = context;
        s9.f fVar = new s9.f(looper, this);
        this.D = fVar;
        this.f9173t = eVar;
        this.f9174u = new h9.c0(eVar);
        PackageManager packageManager = context.getPackageManager();
        if (l9.c.d == null) {
            l9.c.d = Boolean.valueOf((l9.g.a() && packageManager.hasSystemFeature("android.hardware.type.automotive")) ? false : false);
        }
        if (l9.c.d.booleanValue()) {
            this.E = false;
        }
        fVar.sendMessage(fVar.obtainMessage(6));
    }

    public static Status d(a<?> aVar, c9.b bVar) {
        String str = aVar.f9147b.f8855c;
        String valueOf = String.valueOf(bVar);
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 63 + valueOf.length());
        sb2.append("API: ");
        sb2.append(str);
        sb2.append(" is not available on this device. Connection failed with: ");
        sb2.append(valueOf);
        return new Status(1, 17, sb2.toString(), bVar.f3859j, bVar);
    }

    public static d h(Context context) {
        d dVar;
        synchronized (H) {
            try {
                if (I == null) {
                    Looper looper = h9.g.b().getLooper();
                    Context applicationContext = context.getApplicationContext();
                    Object obj = c9.e.f3872c;
                    I = new d(applicationContext, looper, c9.e.d);
                }
                dVar = I;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final void a(q qVar) {
        synchronized (H) {
            if (this.A != qVar) {
                this.A = qVar;
                this.B.clear();
            }
            this.B.addAll(qVar.f9243t);
        }
    }

    public final boolean b() {
        if (this.f9170f) {
            return false;
        }
        h9.q qVar = h9.p.a().f10368a;
        if (qVar == null || qVar.f10370f) {
            int i10 = this.f9174u.f10292a.get(203400000, -1);
            if (i10 != -1 && i10 != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean c(c9.b bVar, int i10) {
        c9.e eVar = this.f9173t;
        Context context = this.n;
        Objects.requireNonNull(eVar);
        if (m9.a.z(context)) {
            return false;
        }
        PendingIntent b10 = bVar.p0() ? bVar.f3859j : eVar.b(context, bVar.f3858f, 0, null);
        if (b10 != null) {
            int i11 = bVar.f3858f;
            int i12 = GoogleApiActivity.f6851f;
            Intent intent = new Intent(context, GoogleApiActivity.class);
            intent.putExtra("pending_intent", b10);
            intent.putExtra("failing_client_id", i10);
            intent.putExtra("notify_manager", true);
            eVar.h(context, i11, null, PendingIntent.getActivity(context, 0, intent, s9.e.f14933a | 134217728));
            return true;
        }
        return false;
    }

    public final z<?> e(d9.b<?> bVar) {
        a<?> aVar = bVar.f8860e;
        z<?> zVar = this.f9176z.get(aVar);
        if (zVar == null) {
            zVar = new z<>(this, bVar);
            this.f9176z.put(aVar, zVar);
        }
        if (zVar.s()) {
            this.C.add(aVar);
        }
        zVar.o();
        return zVar;
    }

    public final void f() {
        h9.r rVar = this.f9171j;
        if (rVar != null) {
            if (rVar.f10374c <= 0) {
                if (b()) {
                }
                this.f9171j = null;
            }
            if (this.f9172m == null) {
                this.f9172m = new j9.c(this.n, h9.t.f10377c);
            }
            ((j9.c) this.f9172m).c(rVar);
            this.f9171j = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> void g(ea.h<T> r13, int r14, d9.b r15) {
        /*
            r12 = this;
            if (r14 == 0) goto L9d
            e9.a<O extends d9.a$d> r3 = r15.f8860e
            r11 = 1
            boolean r15 = r12.b()
            r10 = 0
            r0 = r10
            if (r15 != 0) goto Lf
            goto L7e
        Lf:
            h9.p r15 = h9.p.a()
            h9.q r15 = r15.f10368a
            r11 = 7
            r10 = 1
            r1 = r10
            if (r15 == 0) goto L5c
            r11 = 7
            boolean r2 = r15.f10370f
            if (r2 != 0) goto L21
            r11 = 4
            goto L7e
        L21:
            r11 = 6
            boolean r15 = r15.f10371j
            java.util.Map<e9.a<?>, e9.z<?>> r2 = r12.f9176z
            r11 = 2
            java.lang.Object r2 = r2.get(r3)
            e9.z r2 = (e9.z) r2
            if (r2 == 0) goto L5b
            d9.a$f r4 = r2.f9260b
            r11 = 1
            boolean r5 = r4 instanceof h9.b
            r11 = 4
            if (r5 != 0) goto L38
            goto L7e
        L38:
            h9.b r4 = (h9.b) r4
            r11 = 6
            boolean r10 = r4.hasConnectionInfo()
            r5 = r10
            if (r5 == 0) goto L5b
            boolean r10 = r4.isConnecting()
            r5 = r10
            if (r5 != 0) goto L5b
            r11 = 1
            h9.d r15 = e9.g0.a(r2, r4, r14)
            if (r15 != 0) goto L51
            goto L7e
        L51:
            int r0 = r2.f9269l
            int r0 = r0 + r1
            r11 = 5
            r2.f9269l = r0
            boolean r1 = r15.f10300j
            r11 = 6
            goto L5d
        L5b:
            r1 = r15
        L5c:
            r11 = 2
        L5d:
            e9.g0 r15 = new e9.g0
            r11 = 4
            r4 = 0
            r11 = 1
            if (r1 == 0) goto L6b
            r11 = 1
            long r6 = java.lang.System.currentTimeMillis()
            goto L6d
        L6b:
            r11 = 4
            r6 = r4
        L6d:
            if (r1 == 0) goto L75
            long r0 = android.os.SystemClock.elapsedRealtime()
            r8 = r0
            goto L76
        L75:
            r8 = r4
        L76:
            r0 = r15
            r1 = r12
            r2 = r14
            r4 = r6
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r6)
        L7e:
            if (r0 == 0) goto L9d
            ea.u<TResult> r13 = r13.f9273a
            android.os.Handler r14 = r12.D
            r11 = 6
            java.util.Objects.requireNonNull(r14)
            e9.t r15 = new e9.t
            r11 = 1
            r15.<init>()
            ea.q<TResult> r14 = r13.f9303b
            ea.l r1 = new ea.l
            r11 = 3
            r1.<init>(r15, r0)
            r11 = 5
            r14.a(r1)
            r13.s()
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.d.g(ea.h, int, d9.b):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r14) {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.d.handleMessage(android.os.Message):boolean");
    }

    public final void i(c9.b bVar, int i10) {
        if (!c(bVar, i10)) {
            Handler handler = this.D;
            handler.sendMessage(handler.obtainMessage(5, i10, 0, bVar));
        }
    }
}
