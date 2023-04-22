package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.c;
import d6.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import w5.b;
import w5.i;
import w5.j;
import w5.m;
import w5.n;
import w5.r;

/* loaded from: classes.dex */
public class g implements ComponentCallbacks2, i {
    public static final z5.f A;

    /* renamed from: c  reason: collision with root package name */
    public final com.bumptech.glide.b f5656c;

    /* renamed from: f  reason: collision with root package name */
    public final Context f5657f;

    /* renamed from: j  reason: collision with root package name */
    public final w5.h f5658j;

    /* renamed from: m  reason: collision with root package name */
    public final n f5659m;
    public final m n;

    /* renamed from: t  reason: collision with root package name */
    public final r f5660t;

    /* renamed from: u  reason: collision with root package name */
    public final Runnable f5661u;

    /* renamed from: w  reason: collision with root package name */
    public final w5.b f5662w;
    public final CopyOnWriteArrayList<z5.e<Object>> y;

    /* renamed from: z  reason: collision with root package name */
    public z5.f f5663z;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.f5658j.g(gVar);
        }
    }

    /* loaded from: classes.dex */
    public class b implements b.a {

        /* renamed from: a  reason: collision with root package name */
        public final n f5665a;

        public b(n nVar) {
            this.f5665a = nVar;
        }

        @Override // w5.b.a
        public void a(boolean z10) {
            if (z10) {
                synchronized (g.this) {
                    n nVar = this.f5665a;
                    Iterator it = ((ArrayList) l.e(nVar.f16415a)).iterator();
                    while (true) {
                        while (it.hasNext()) {
                            z5.c cVar = (z5.c) it.next();
                            if (!cVar.k() && !cVar.f()) {
                                cVar.clear();
                                if (nVar.f16417c) {
                                    nVar.f16416b.add(cVar);
                                } else {
                                    cVar.i();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        z5.f c10 = new z5.f().c(Bitmap.class);
        c10.J = true;
        A = c10;
        new z5.f().c(u5.c.class).J = true;
        new z5.f().d(j5.d.f11391b).k(Priority.LOW).p(true);
    }

    public g(com.bumptech.glide.b bVar, w5.h hVar, m mVar, Context context) {
        z5.f fVar;
        n nVar = new n();
        w5.c cVar = bVar.f5624u;
        this.f5660t = new r();
        a aVar = new a();
        this.f5661u = aVar;
        this.f5656c = bVar;
        this.f5658j = hVar;
        this.n = mVar;
        this.f5659m = nVar;
        this.f5657f = context;
        Context applicationContext = context.getApplicationContext();
        b bVar2 = new b(nVar);
        Objects.requireNonNull((w5.e) cVar);
        boolean z10 = c0.a.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        w5.b dVar = z10 ? new w5.d(applicationContext, bVar2) : new j();
        this.f5662w = dVar;
        if (l.h()) {
            l.k(aVar);
        } else {
            hVar.g(this);
        }
        hVar.g(dVar);
        this.y = new CopyOnWriteArrayList<>(bVar.f5621j.f5644e);
        d dVar2 = bVar.f5621j;
        synchronized (dVar2) {
            if (dVar2.f5649j == null) {
                Objects.requireNonNull((c.a) dVar2.d);
                z5.f fVar2 = new z5.f();
                fVar2.J = true;
                dVar2.f5649j = fVar2;
            }
            fVar = dVar2.f5649j;
        }
        synchronized (this) {
            z5.f clone = fVar.clone();
            if (clone.J && !clone.L) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            clone.L = true;
            clone.J = true;
            this.f5663z = clone;
        }
        synchronized (bVar.f5625w) {
            if (bVar.f5625w.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            bVar.f5625w.add(this);
        }
    }

    public f<Bitmap> b() {
        return new f(this.f5656c, this, Bitmap.class, this.f5657f).a(A);
    }

    @Override // w5.i
    public synchronized void e() {
        this.f5660t.e();
        for (a6.g<?> gVar : l.e(this.f5660t.f16441c)) {
            l(gVar);
        }
        this.f5660t.f16441c.clear();
        n nVar = this.f5659m;
        Iterator it = ((ArrayList) l.e(nVar.f16415a)).iterator();
        while (it.hasNext()) {
            nVar.a((z5.c) it.next());
        }
        nVar.f16416b.clear();
        this.f5658j.c(this);
        this.f5658j.c(this.f5662w);
        l.f().removeCallbacks(this.f5661u);
        com.bumptech.glide.b bVar = this.f5656c;
        synchronized (bVar.f5625w) {
            if (!bVar.f5625w.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            bVar.f5625w.remove(this);
        }
    }

    @Override // w5.i
    public synchronized void g() {
        try {
            p();
            this.f5660t.g();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void l(a6.g<?> gVar) {
        boolean z10;
        if (gVar == null) {
            return;
        }
        boolean r10 = r(gVar);
        z5.c j10 = gVar.j();
        if (r10) {
            return;
        }
        com.bumptech.glide.b bVar = this.f5656c;
        synchronized (bVar.f5625w) {
            Iterator<g> it = bVar.f5625w.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                } else if (it.next().r(gVar)) {
                    z10 = true;
                    break;
                }
            }
        }
        if (z10 || j10 == null) {
            return;
        }
        gVar.h(null);
        j10.clear();
    }

    @Override // w5.i
    public synchronized void m() {
        try {
            q();
            this.f5660t.m();
        } catch (Throwable th) {
            throw th;
        }
    }

    public f<Drawable> n(Integer num) {
        PackageInfo packageInfo;
        f fVar = new f(this.f5656c, this, Drawable.class, this.f5657f);
        f C = fVar.C(num);
        Context context = fVar.Q;
        ConcurrentMap<String, h5.b> concurrentMap = c6.b.f3763a;
        String packageName = context.getPackageName();
        h5.b bVar = (h5.b) ((ConcurrentHashMap) c6.b.f3763a).get(packageName);
        if (bVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e10) {
                StringBuilder m10 = a1.a.m("Cannot resolve info for");
                m10.append(context.getPackageName());
                Log.e("AppVersionSignature", m10.toString(), e10);
                packageInfo = null;
            }
            c6.d dVar = new c6.d(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            bVar = (h5.b) ((ConcurrentHashMap) c6.b.f3763a).putIfAbsent(packageName, dVar);
            if (bVar == null) {
                bVar = dVar;
            }
        }
        return C.a(new z5.f().o(new c6.a(context.getResources().getConfiguration().uiMode & 48, bVar)));
    }

    public f<Drawable> o(String str) {
        return new f(this.f5656c, this, Drawable.class, this.f5657f).C(str);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
    }

    public synchronized void p() {
        try {
            n nVar = this.f5659m;
            nVar.f16417c = true;
            Iterator it = ((ArrayList) l.e(nVar.f16415a)).iterator();
            while (true) {
                while (it.hasNext()) {
                    z5.c cVar = (z5.c) it.next();
                    if (cVar.isRunning()) {
                        cVar.pause();
                        nVar.f16416b.add(cVar);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void q() {
        try {
            n nVar = this.f5659m;
            nVar.f16417c = false;
            Iterator it = ((ArrayList) l.e(nVar.f16415a)).iterator();
            while (true) {
                while (it.hasNext()) {
                    z5.c cVar = (z5.c) it.next();
                    if (!cVar.k() && !cVar.isRunning()) {
                        cVar.i();
                    }
                }
                nVar.f16416b.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean r(a6.g<?> gVar) {
        z5.c j10 = gVar.j();
        if (j10 == null) {
            return true;
        }
        if (this.f5659m.a(j10)) {
            this.f5660t.f16441c.remove(gVar);
            gVar.h(null);
            return true;
        }
        return false;
    }

    public synchronized String toString() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return super.toString() + "{tracker=" + this.f5659m + ", treeNode=" + this.n + "}";
    }
}
