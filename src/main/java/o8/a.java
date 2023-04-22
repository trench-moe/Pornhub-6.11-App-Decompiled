package o8;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import h9.o;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
import r9.e;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public c9.a f13607a;

    /* renamed from: b  reason: collision with root package name */
    public e f13608b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13609c;
    public final Object d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public c f13610e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f13611f;

    /* renamed from: g  reason: collision with root package name */
    public final long f13612g;

    /* renamed from: o8.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0239a {

        /* renamed from: a  reason: collision with root package name */
        public final String f13613a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13614b;

        @Deprecated
        public C0239a(String str, boolean z10) {
            this.f13613a = str;
            this.f13614b = z10;
        }

        public String toString() {
            String str = this.f13613a;
            boolean z10 = this.f13614b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z10);
            return sb2.toString();
        }
    }

    public a(Context context, long j10, boolean z10, boolean z11) {
        Context applicationContext;
        Objects.requireNonNull(context, "null reference");
        if (z10 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f13611f = context;
        this.f13609c = false;
        this.f13612g = j10;
    }

    public static C0239a a(Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            aVar.c(false);
            C0239a e10 = aVar.e(-1);
            aVar.d(e10, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, null);
            return e10;
        } finally {
        }
    }

    public final void b() {
        o.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.f13611f != null && this.f13607a != null) {
                if (this.f13609c) {
                    k9.a.b().c(this.f13611f, this.f13607a);
                }
                this.f13609c = false;
                this.f13608b = null;
                this.f13607a = null;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void c(boolean r10) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.a.c(boolean):void");
    }

    public final boolean d(C0239a c0239a, boolean z10, float f10, long j10, Throwable th) {
        String str;
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            str = "1";
            hashMap.put("app_context", str);
            if (c0239a != null) {
                hashMap.put("limit_ad_tracking", true != c0239a.f13614b ? "0" : "1");
                String str2 = c0239a.f13613a;
                if (str2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(str2.length()));
                }
            }
            if (th != null) {
                hashMap.put("error", th.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j10));
            new b(hashMap).start();
            return true;
        }
        return false;
    }

    public final C0239a e(int i10) {
        C0239a c0239a;
        o.g("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.f13609c) {
                synchronized (this.d) {
                    c cVar = this.f13610e;
                    if (cVar == null || !cVar.f13619m) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    c(false);
                    if (!this.f13609c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e10) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e10);
                }
            }
            Objects.requireNonNull(this.f13607a, "null reference");
            Objects.requireNonNull(this.f13608b, "null reference");
            try {
                c0239a = new C0239a(this.f13608b.a(), this.f13608b.L(true));
            } catch (RemoteException e11) {
                Log.i("AdvertisingIdClient", "GMS remote exception ", e11);
                throw new IOException("Remote exception");
            }
        }
        f();
        return c0239a;
    }

    public final void f() {
        synchronized (this.d) {
            c cVar = this.f13610e;
            if (cVar != null) {
                cVar.f13618j.countDown();
                try {
                    this.f13610e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j10 = this.f13612g;
            if (j10 > 0) {
                this.f13610e = new c(this, j10);
            }
        }
    }

    public final void finalize() {
        b();
        super.finalize();
    }
}
