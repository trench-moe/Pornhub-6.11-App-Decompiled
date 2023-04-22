package j1;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.VolumeProvider;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.internal.zzan;
import com.google.android.gms.internal.cast.f1;
import com.google.android.gms.internal.cast.g1;
import com.google.android.gms.internal.cast.y0;
import com.google.android.gms.internal.cast.zzju;
import g1.d;
import j1.e;
import j1.h;
import j1.h0;
import j1.i0;
import j1.j0;
import j1.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f11277c = Log.isLoggable("MediaRouter", 3);
    public static e d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f11278a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList<c> f11279b = new ArrayList<>();

    /* loaded from: classes.dex */
    public static abstract class b {
        public void a(l lVar, h hVar) {
        }

        public void b(l lVar, h hVar) {
        }

        public void c(l lVar, h hVar) {
        }

        public void d(l lVar, i iVar) {
        }

        public void e(l lVar, i iVar) {
        }

        public void f(l lVar, i iVar) {
        }

        @Deprecated
        public void g(l lVar, i iVar) {
        }

        public void h(l lVar, i iVar, int i10) {
            g(lVar, iVar);
        }

        @Deprecated
        public void i(l lVar, i iVar) {
        }

        public void j(l lVar, i iVar, int i10) {
            i(lVar, iVar);
        }

        public void k(l lVar, i iVar) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final l f11280a;

        /* renamed from: b  reason: collision with root package name */
        public final b f11281b;

        /* renamed from: c  reason: collision with root package name */
        public k f11282c = k.f11274c;
        public int d;

        public c(l lVar, b bVar) {
            this.f11280a = lVar;
            this.f11281b = bVar;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class d {
        @SuppressLint({"UnknownNullness"})
        public void a(String str, Bundle bundle) {
        }

        public void b(Bundle bundle) {
        }
    }

    /* loaded from: classes2.dex */
    public static final class e implements j0.e, h0.c {
        public d A;
        public MediaSessionCompat B;

        /* renamed from: a  reason: collision with root package name */
        public final Context f11283a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f11284b;

        /* renamed from: c  reason: collision with root package name */
        public final j1.e f11285c;

        /* renamed from: l  reason: collision with root package name */
        public final j0 f11293l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f11294m;
        public c0 n;

        /* renamed from: o  reason: collision with root package name */
        public i f11295o;

        /* renamed from: p  reason: collision with root package name */
        public i f11296p;

        /* renamed from: q  reason: collision with root package name */
        public i f11297q;

        /* renamed from: r  reason: collision with root package name */
        public h.e f11298r;

        /* renamed from: s  reason: collision with root package name */
        public i f11299s;

        /* renamed from: t  reason: collision with root package name */
        public h.e f11300t;

        /* renamed from: v  reason: collision with root package name */
        public j1.g f11302v;

        /* renamed from: w  reason: collision with root package name */
        public j1.g f11303w;

        /* renamed from: x  reason: collision with root package name */
        public int f11304x;
        public f y;

        /* renamed from: z  reason: collision with root package name */
        public g f11305z;
        public final ArrayList<WeakReference<l>> d = new ArrayList<>();

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList<i> f11286e = new ArrayList<>();

        /* renamed from: f  reason: collision with root package name */
        public final Map<m0.b<String, String>, String> f11287f = new HashMap();

        /* renamed from: g  reason: collision with root package name */
        public final ArrayList<h> f11288g = new ArrayList<>();

        /* renamed from: h  reason: collision with root package name */
        public final ArrayList<g> f11289h = new ArrayList<>();

        /* renamed from: i  reason: collision with root package name */
        public final i0.a f11290i = new i0.a();

        /* renamed from: j  reason: collision with root package name */
        public final f f11291j = new f();

        /* renamed from: k  reason: collision with root package name */
        public final c f11292k = new c();

        /* renamed from: u  reason: collision with root package name */
        public final Map<String, h.e> f11301u = new HashMap();
        public MediaSessionCompat.h C = new a();
        public h.b.c D = new b();

        /* loaded from: classes2.dex */
        public class a implements MediaSessionCompat.h {
            public a() {
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.h
            public void a() {
                Objects.requireNonNull(e.this);
            }
        }

        /* loaded from: classes2.dex */
        public class b implements h.b.c {
            public b() {
            }

            public void a(h.b bVar, j1.f fVar, Collection<h.b.C0162b> collection) {
                e eVar = e.this;
                if (bVar != eVar.f11300t || fVar == null) {
                    if (bVar == eVar.f11298r) {
                        if (fVar != null) {
                            eVar.p(eVar.f11297q, fVar);
                        }
                        e.this.f11297q.o(collection);
                    }
                    return;
                }
                h hVar = eVar.f11299s.f11330a;
                String i10 = fVar.i();
                i iVar = new i(hVar, i10, e.this.b(hVar, i10));
                iVar.j(fVar);
                e eVar2 = e.this;
                if (eVar2.f11297q == iVar) {
                    return;
                }
                eVar2.j(eVar2, iVar, eVar2.f11300t, 3, eVar2.f11299s, collection);
                e eVar3 = e.this;
                eVar3.f11299s = null;
                eVar3.f11300t = null;
            }
        }

        /* loaded from: classes2.dex */
        public final class c extends Handler {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<c> f11308a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public final List<i> f11309b = new ArrayList();

            public c() {
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
            /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void a(j1.l.c r9, int r10, java.lang.Object r11, int r12) {
                /*
                    Method dump skipped, instructions count: 240
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: j1.l.e.c.a(j1.l$c, int, java.lang.Object, int):void");
            }

            public void b(int i10, Object obj) {
                obtainMessage(i10, obj).sendToTarget();
            }

            public void c(int i10, Object obj, int i11) {
                Message obtainMessage = obtainMessage(i10, obj);
                obtainMessage.arg1 = i11;
                obtainMessage.sendToTarget();
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                int i10 = message.what;
                Object obj = message.obj;
                int i11 = message.arg1;
                if (i10 == 259 && e.this.g().f11332c.equals(((i) obj).f11332c)) {
                    e.this.q(true);
                }
                if (i10 == 262) {
                    i iVar = (i) ((m0.b) obj).f12857b;
                    e.this.f11293l.u(iVar);
                    if (e.this.f11295o != null && iVar.e()) {
                        for (i iVar2 : this.f11309b) {
                            e.this.f11293l.t(iVar2);
                        }
                        this.f11309b.clear();
                    }
                } else if (i10 != 264) {
                    switch (i10) {
                        case 257:
                            e.this.f11293l.r((i) obj);
                            break;
                        case 258:
                            e.this.f11293l.t((i) obj);
                            break;
                        case 259:
                            e.this.f11293l.s((i) obj);
                            break;
                    }
                } else {
                    i iVar3 = (i) ((m0.b) obj).f12857b;
                    this.f11309b.add(iVar3);
                    e.this.f11293l.r(iVar3);
                    e.this.f11293l.u(iVar3);
                }
                try {
                    int size = e.this.d.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            int size2 = this.f11308a.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                a(this.f11308a.get(i12), i10, obj, i11);
                            }
                            this.f11308a.clear();
                            return;
                        }
                        l lVar = e.this.d.get(size).get();
                        if (lVar == null) {
                            e.this.d.remove(size);
                        } else {
                            this.f11308a.addAll(lVar.f11279b);
                        }
                    }
                } catch (Throwable th) {
                    this.f11308a.clear();
                    throw th;
                }
            }
        }

        /* loaded from: classes2.dex */
        public final class d {

            /* renamed from: a  reason: collision with root package name */
            public final MediaSessionCompat f11311a;

            /* renamed from: b  reason: collision with root package name */
            public g1.d f11312b;

            public d(MediaSessionCompat mediaSessionCompat) {
                this.f11311a = mediaSessionCompat;
            }

            public void a() {
                MediaSessionCompat mediaSessionCompat = this.f11311a;
                if (mediaSessionCompat != null) {
                    mediaSessionCompat.f399a.e(e.this.f11290i.d);
                    this.f11312b = null;
                }
            }
        }

        /* renamed from: j1.l$e$e  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public final class C0164e extends e.a {
            public C0164e(a aVar) {
            }
        }

        /* loaded from: classes2.dex */
        public final class f extends h.a {
            public f() {
            }
        }

        /* loaded from: classes2.dex */
        public final class g {

            /* renamed from: a  reason: collision with root package name */
            public final i0 f11316a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ e f11317b;
        }

        @SuppressLint({"SyntheticAccessor", "NewApi"})
        public e(Context context) {
            this.f11283a = context;
            WeakHashMap<Context, g0.a> weakHashMap = g0.a.f9689a;
            synchronized (weakHashMap) {
                if (weakHashMap.get(context) == null) {
                    weakHashMap.put(context, new g0.a(context));
                }
            }
            this.f11294m = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                int i11 = d0.f11144a;
                Intent intent = new Intent(context, d0.class);
                intent.setPackage(context.getPackageName());
                this.f11284b = context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0;
            } else {
                this.f11284b = false;
            }
            if (this.f11284b) {
                this.f11285c = new j1.e(context, new C0164e(null));
            } else {
                this.f11285c = null;
            }
            this.f11293l = i10 >= 24 ? new j0.a(context, this) : new j0.d(context, this);
        }

        public void a(j1.h hVar) {
            if (d(hVar) == null) {
                h hVar2 = new h(hVar);
                this.f11288g.add(hVar2);
                if (l.f11277c) {
                    Log.d("MediaRouter", "Provider added: " + hVar2);
                }
                this.f11292k.b(513, hVar2);
                o(hVar2, hVar.f11221g);
                f fVar = this.f11291j;
                l.b();
                hVar.d = fVar;
                hVar.q(this.f11302v);
            }
        }

        public String b(h hVar, String str) {
            String flattenToShortString = hVar.f11329c.f11236a.flattenToShortString();
            String j10 = android.support.v4.media.b.j(flattenToShortString, ":", str);
            if (e(j10) < 0) {
                this.f11287f.put(new m0.b<>(flattenToShortString, str), j10);
                return j10;
            }
            Log.w("MediaRouter", "Either " + str + " isn't unique in " + flattenToShortString + " or we're trying to assign a unique ID for an already added route");
            int i10 = 2;
            while (true) {
                String format = String.format(Locale.US, "%s_%d", j10, Integer.valueOf(i10));
                if (e(format) < 0) {
                    this.f11287f.put(new m0.b<>(flattenToShortString, str), format);
                    return format;
                }
                i10++;
            }
        }

        public i c() {
            Iterator<i> it = this.f11286e.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next != this.f11295o && h(next) && next.g()) {
                    return next;
                }
            }
            return this.f11295o;
        }

        public final h d(j1.h hVar) {
            int size = this.f11288g.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f11288g.get(i10).f11327a == hVar) {
                    return this.f11288g.get(i10);
                }
            }
            return null;
        }

        public final int e(String str) {
            int size = this.f11286e.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f11286e.get(i10).f11332c.equals(str)) {
                    return i10;
                }
            }
            return -1;
        }

        public i f() {
            i iVar = this.f11295o;
            if (iVar != null) {
                return iVar;
            }
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }

        public i g() {
            i iVar = this.f11297q;
            if (iVar != null) {
                return iVar;
            }
            throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
        }

        public final boolean h(i iVar) {
            return iVar.d() == this.f11293l && iVar.n("android.media.intent.category.LIVE_AUDIO") && !iVar.n("android.media.intent.category.LIVE_VIDEO");
        }

        public void i() {
            if (this.f11297q.f()) {
                List<i> c10 = this.f11297q.c();
                HashSet hashSet = new HashSet();
                for (i iVar : c10) {
                    hashSet.add(iVar.f11332c);
                }
                Iterator<Map.Entry<String, h.e>> it = this.f11301u.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, h.e> next = it.next();
                    if (!hashSet.contains(next.getKey())) {
                        h.e value = next.getValue();
                        value.h(0);
                        value.d();
                        it.remove();
                    }
                }
                for (i iVar2 : c10) {
                    if (!this.f11301u.containsKey(iVar2.f11332c)) {
                        h.e n = iVar2.d().n(iVar2.f11331b, this.f11297q.f11331b);
                        n.e();
                        this.f11301u.put(iVar2.f11332c, n);
                    }
                }
            }
        }

        public void j(e eVar, i iVar, h.e eVar2, int i10, i iVar2, Collection<h.b.C0162b> collection) {
            f fVar;
            y0 y0Var;
            g gVar = this.f11305z;
            if (gVar != null) {
                gVar.a();
                this.f11305z = null;
            }
            g gVar2 = new g(eVar, iVar, eVar2, i10, iVar2, collection);
            this.f11305z = gVar2;
            if (gVar2.f11319b != 3 || (fVar = this.y) == null) {
                gVar2.b();
                return;
            }
            final i iVar3 = this.f11297q;
            final i iVar4 = gVar2.d;
            final t9.d dVar = (t9.d) fVar;
            t9.d.f15201c.a("Prepare transfer from Route(%s) to Route(%s)", iVar3, iVar4);
            final g1 g1Var = new g1();
            dVar.f15203b.post(new Runnable() { // from class: t9.c
                @Override // java.lang.Runnable
                public final void run() {
                    v8.d c10;
                    Void r22;
                    v8.d c11;
                    Object c12;
                    u8.p pVar;
                    d dVar2 = d.this;
                    l.i iVar5 = iVar3;
                    l.i iVar6 = iVar4;
                    com.google.android.gms.internal.cast.g1<Void> g1Var2 = g1Var;
                    g gVar3 = dVar2.f15202a;
                    Objects.requireNonNull(gVar3);
                    if (new HashSet(gVar3.f15213a).isEmpty()) {
                        g.f15212f.a("No need to prepare transfer without any callback", new Object[0]);
                        g1Var2.o(null);
                    } else if (iVar5.f11339k != 1 || iVar6.f11339k != 0) {
                        g.f15212f.a("No need to prepare transfer for non cast-to-phone case", new Object[0]);
                        g1Var2.o(null);
                    } else {
                        v8.g gVar4 = gVar3.f15215c;
                        if (gVar4 == null) {
                            c10 = null;
                        } else {
                            c10 = gVar4.c();
                            if (c10 != null) {
                                c10.f16088l = gVar3;
                            }
                        }
                        if (c10 == null) {
                            g.f15212f.a("No need to prepare transfer when there is no Cast session", new Object[0]);
                            g1Var2.o(null);
                            return;
                        }
                        w8.g l10 = c10.l();
                        if (l10 == null || !l10.j()) {
                            g.f15212f.a("No need to prepare transfer when there is no media session", new Object[0]);
                            v8.g gVar5 = gVar3.f15215c;
                            if (gVar5 == null || (c11 = gVar5.c()) == null) {
                                r22 = null;
                            } else {
                                r22 = null;
                                c11.f16088l = null;
                            }
                            g1Var2.o(r22);
                            return;
                        }
                        g.f15212f.a("Prepare route transfer for changing endpoint", new Object[0]);
                        gVar3.f15216e = null;
                        gVar3.f15214b = 1;
                        gVar3.d = g1Var2;
                        h9.o.d("Must be called from the main thread.");
                        if (l10.C()) {
                            u8.o g10 = l10.g();
                            Objects.requireNonNull(g10, "null reference");
                            if (g10.r0(262144L)) {
                                a9.m mVar = l10.f17010c;
                                Objects.requireNonNull(mVar);
                                JSONObject jSONObject = new JSONObject();
                                long a10 = mVar.a();
                                try {
                                    jSONObject.put("requestId", a10);
                                    jSONObject.put("type", "STORE_SESSION");
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("assistant_supported", true);
                                    jSONObject2.put("display_supported", true);
                                    jSONObject2.put("is_group", false);
                                    jSONObject.put("targetDeviceCapabilities", jSONObject2);
                                } catch (JSONException e10) {
                                    a9.b bVar = mVar.f309a;
                                    Log.w(bVar.f254a, bVar.e("store session failed to create JSON message", new Object[0]), e10);
                                }
                                try {
                                    mVar.b(jSONObject.toString(), a10, null);
                                    mVar.f299v.a(a10, new sc.c(mVar, 8));
                                    ea.h<u8.p> hVar = new ea.h<>();
                                    mVar.f300w = hVar;
                                    c12 = hVar.f9273a;
                                } catch (IllegalStateException e11) {
                                    c12 = ea.j.c(e11);
                                }
                            } else {
                                ea.u uVar = new ea.u();
                                Log.d("RemoteMediaClient", "create SessionState with cached mediaInfo and mediaStatus");
                                MediaInfo f10 = l10.f();
                                u8.o g11 = l10.g();
                                if (f10 == null || g11 == null) {
                                    pVar = null;
                                } else {
                                    Boolean bool = Boolean.TRUE;
                                    long c13 = l10.c();
                                    u8.l lVar = g11.L;
                                    double d10 = g11.f15739m;
                                    if (Double.compare(d10, 2.0d) > 0 || Double.compare(d10, 0.5d) < 0) {
                                        throw new IllegalArgumentException("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                                    }
                                    pVar = new u8.p(new u8.i(f10, lVar, bool, c13, d10, g11.A, g11.E, null, null, null, null, 0L), null);
                                }
                                uVar.p(pVar);
                                c12 = uVar;
                            }
                        } else {
                            c12 = ea.j.c(new zzan());
                        }
                        sc.c cVar = new sc.c(gVar3, 9);
                        ea.u uVar2 = (ea.u) c12;
                        Objects.requireNonNull(uVar2);
                        Executor executor = ea.i.f9274a;
                        uVar2.e(executor, cVar);
                        uVar2.c(executor, new e.p(gVar3));
                        t0.b(zzju.CAST_TRANSFER_TO_LOCAL_USED);
                    }
                }
            });
            g gVar3 = this.f11305z;
            e eVar3 = gVar3.f11323g.get();
            if (eVar3 != null && eVar3.f11305z == gVar3) {
                if (gVar3.f11324h != null) {
                    throw new IllegalStateException("future is already set");
                }
                gVar3.f11324h = g1Var;
                p pVar = new p(gVar3, 0);
                final c cVar = eVar3.f11292k;
                Objects.requireNonNull(cVar);
                Executor executor = new Executor() { // from class: j1.q
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        l.e.c.this.post(runnable);
                    }
                };
                if (!g1Var.isDone() && (y0Var = g1Var.f6902f) != y0.d) {
                    y0 y0Var2 = new y0(pVar, executor);
                    do {
                        y0Var2.f6913c = y0Var;
                        if (f1.f6899t.c(g1Var, y0Var, y0Var2)) {
                            return;
                        }
                        y0Var = g1Var.f6902f;
                    } while (y0Var != y0.d);
                }
                f1.l(pVar, executor);
                return;
            }
            Log.w("MediaRouter", "Router is released. Cancel transfer");
            gVar3.a();
        }

        public void k(i iVar, int i10) {
            if (!this.f11286e.contains(iVar)) {
                Log.w("MediaRouter", "Ignoring attempt to select removed route: " + iVar);
            } else if (!iVar.f11335g) {
                Log.w("MediaRouter", "Ignoring attempt to select disabled route: " + iVar);
            } else {
                if (Build.VERSION.SDK_INT >= 30) {
                    j1.h d10 = iVar.d();
                    j1.e eVar = this.f11285c;
                    if (d10 == eVar && this.f11297q != iVar) {
                        String str = iVar.f11331b;
                        MediaRoute2Info r10 = eVar.r(str);
                        if (r10 != null) {
                            eVar.f11146i.transferTo(r10);
                            return;
                        }
                        Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
                        return;
                    }
                }
                l(iVar, i10);
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
        public void l(j1.l.i r14, int r15) {
            /*
                Method dump skipped, instructions count: 489
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j1.l.e.l(j1.l$i, int):void");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        public void m() {
            /*
                Method dump skipped, instructions count: 503
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j1.l.e.m():void");
        }

        @SuppressLint({"NewApi"})
        public void n() {
            MediaRouter2.RoutingController routingController;
            i iVar = this.f11297q;
            if (iVar != null) {
                i0.a aVar = this.f11290i;
                aVar.f11250a = iVar.f11342o;
                aVar.f11251b = iVar.f11343p;
                aVar.f11252c = iVar.n;
                aVar.d = iVar.f11340l;
                aVar.f11253e = iVar.f11339k;
                String str = null;
                if (this.f11284b && iVar.d() == this.f11285c) {
                    i0.a aVar2 = this.f11290i;
                    h.e eVar = this.f11298r;
                    int i10 = j1.e.f11145r;
                    if ((eVar instanceof e.c) && (routingController = ((e.c) eVar).f11156g) != null) {
                        str = routingController.getId();
                    }
                    aVar2.f11254f = str;
                } else {
                    this.f11290i.f11254f = null;
                }
                int size = this.f11289h.size();
                for (int i11 = 0; i11 < size; i11++) {
                    g gVar = this.f11289h.get(i11);
                    gVar.f11316a.a(gVar.f11317b.f11290i);
                }
                if (this.A != null) {
                    if (this.f11297q != f() && this.f11297q != this.f11296p) {
                        i0.a aVar3 = this.f11290i;
                        int i12 = aVar3.f11252c == 1 ? 2 : 0;
                        d dVar = this.A;
                        int i13 = aVar3.f11251b;
                        int i14 = aVar3.f11250a;
                        String str2 = aVar3.f11254f;
                        MediaSessionCompat mediaSessionCompat = dVar.f11311a;
                        if (mediaSessionCompat != null) {
                            g1.d dVar2 = dVar.f11312b;
                            if (dVar2 == null || i12 != 0 || i13 != 0) {
                                o oVar = new o(dVar, i12, i13, i14, str2);
                                dVar.f11312b = oVar;
                                mediaSessionCompat.f399a.n(oVar);
                                return;
                            }
                            dVar2.d = i14;
                            d.c.a((VolumeProvider) dVar2.a(), i14);
                            d.AbstractC0138d abstractC0138d = dVar2.f9697e;
                            if (abstractC0138d != null) {
                                MediaSessionCompat.g gVar2 = ((MediaSessionCompat.g.a) abstractC0138d).f428a;
                                if (gVar2.f427c != dVar2) {
                                    return;
                                }
                                gVar2.o(new ParcelableVolumeInfo(gVar2.f425a, gVar2.f426b, dVar2.f9694a, dVar2.f9695b, dVar2.d));
                                return;
                            }
                        }
                    }
                    this.A.a();
                }
            } else {
                d dVar3 = this.A;
                if (dVar3 != null) {
                    dVar3.a();
                }
            }
        }

        public final void o(h hVar, j jVar) {
            boolean z10;
            boolean z11;
            int i10;
            int i11;
            if (hVar.d != jVar) {
                hVar.d = jVar;
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (jVar == null || !(jVar.b() || jVar == this.f11293l.f11221g)) {
                    Log.w("MediaRouter", "Ignoring invalid provider descriptor: " + jVar);
                    z11 = false;
                    i10 = 0;
                } else {
                    List<j1.f> list = jVar.f11255a;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    boolean z12 = false;
                    i10 = 0;
                    for (j1.f fVar : list) {
                        if (fVar == null || !fVar.r()) {
                            Log.w("MediaRouter", "Ignoring invalid system route descriptor: " + fVar);
                        } else {
                            String i12 = fVar.i();
                            int size = hVar.f11328b.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size) {
                                    i13 = -1;
                                    break;
                                } else if (hVar.f11328b.get(i13).f11331b.equals(i12)) {
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                            if (i13 < 0) {
                                i iVar = new i(hVar, i12, b(hVar, i12));
                                i11 = i10 + 1;
                                hVar.f11328b.add(i10, iVar);
                                this.f11286e.add(iVar);
                                if (fVar.g().size() > 0) {
                                    arrayList.add(new m0.b(iVar, fVar));
                                } else {
                                    iVar.j(fVar);
                                    if (l.f11277c) {
                                        Log.d("MediaRouter", "Route added: " + iVar);
                                    }
                                    this.f11292k.b(257, iVar);
                                }
                            } else if (i13 < i10) {
                                Log.w("MediaRouter", "Ignoring route descriptor with duplicate id: " + fVar);
                            } else {
                                i iVar2 = hVar.f11328b.get(i13);
                                i11 = i10 + 1;
                                Collections.swap(hVar.f11328b, i13, i10);
                                if (fVar.g().size() > 0) {
                                    arrayList2.add(new m0.b(iVar2, fVar));
                                } else if (p(iVar2, fVar) != 0 && iVar2 == this.f11297q) {
                                    i10 = i11;
                                    z12 = true;
                                }
                            }
                            i10 = i11;
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m0.b bVar = (m0.b) it.next();
                        i iVar3 = (i) bVar.f12856a;
                        iVar3.j((j1.f) bVar.f12857b);
                        if (l.f11277c) {
                            Log.d("MediaRouter", "Route added: " + iVar3);
                        }
                        this.f11292k.b(257, iVar3);
                    }
                    Iterator it2 = arrayList2.iterator();
                    z11 = z12;
                    while (it2.hasNext()) {
                        m0.b bVar2 = (m0.b) it2.next();
                        i iVar4 = (i) bVar2.f12856a;
                        if (p(iVar4, (j1.f) bVar2.f12857b) != 0 && iVar4 == this.f11297q) {
                            z11 = true;
                        }
                    }
                }
                for (int size2 = hVar.f11328b.size() - 1; size2 >= i10; size2--) {
                    i iVar5 = hVar.f11328b.get(size2);
                    iVar5.j(null);
                    this.f11286e.remove(iVar5);
                }
                q(z11);
                for (int size3 = hVar.f11328b.size() - 1; size3 >= i10; size3--) {
                    i remove = hVar.f11328b.remove(size3);
                    if (l.f11277c) {
                        Log.d("MediaRouter", "Route removed: " + remove);
                    }
                    this.f11292k.b(258, remove);
                }
                if (l.f11277c) {
                    Log.d("MediaRouter", "Provider changed: " + hVar);
                }
                this.f11292k.b(515, hVar);
            }
        }

        public int p(i iVar, j1.f fVar) {
            int j10 = iVar.j(fVar);
            if (j10 != 0) {
                if ((j10 & 1) != 0) {
                    if (l.f11277c) {
                        Log.d("MediaRouter", "Route changed: " + iVar);
                    }
                    this.f11292k.b(259, iVar);
                }
                if ((j10 & 2) != 0) {
                    if (l.f11277c) {
                        Log.d("MediaRouter", "Route volume changed: " + iVar);
                    }
                    this.f11292k.b(260, iVar);
                }
                if ((j10 & 4) != 0) {
                    if (l.f11277c) {
                        Log.d("MediaRouter", "Route presentation display changed: " + iVar);
                    }
                    this.f11292k.b(261, iVar);
                }
            }
            return j10;
        }

        public void q(boolean z10) {
            i iVar = this.f11295o;
            if (iVar != null && !iVar.g()) {
                StringBuilder m10 = a1.a.m("Clearing the default route because it is no longer selectable: ");
                m10.append(this.f11295o);
                Log.i("MediaRouter", m10.toString());
                this.f11295o = null;
            }
            if (this.f11295o == null && !this.f11286e.isEmpty()) {
                Iterator<i> it = this.f11286e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    i next = it.next();
                    if ((next.d() == this.f11293l && next.f11331b.equals("DEFAULT_ROUTE")) && next.g()) {
                        this.f11295o = next;
                        StringBuilder m11 = a1.a.m("Found default route: ");
                        m11.append(this.f11295o);
                        Log.i("MediaRouter", m11.toString());
                        break;
                    }
                }
            }
            i iVar2 = this.f11296p;
            if (iVar2 != null && !iVar2.g()) {
                StringBuilder m12 = a1.a.m("Clearing the bluetooth route because it is no longer selectable: ");
                m12.append(this.f11296p);
                Log.i("MediaRouter", m12.toString());
                this.f11296p = null;
            }
            if (this.f11296p == null && !this.f11286e.isEmpty()) {
                Iterator<i> it2 = this.f11286e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    i next2 = it2.next();
                    if (h(next2) && next2.g()) {
                        this.f11296p = next2;
                        StringBuilder m13 = a1.a.m("Found bluetooth route: ");
                        m13.append(this.f11296p);
                        Log.i("MediaRouter", m13.toString());
                        break;
                    }
                }
            }
            i iVar3 = this.f11297q;
            if (iVar3 != null && iVar3.f11335g) {
                if (z10) {
                    i();
                    n();
                    return;
                }
                return;
            }
            StringBuilder m14 = a1.a.m("Unselecting the current route because it is no longer selectable: ");
            m14.append(this.f11297q);
            Log.i("MediaRouter", m14.toString());
            l(c(), 0);
        }
    }

    /* loaded from: classes2.dex */
    public interface f {
    }

    /* loaded from: classes2.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final h.e f11318a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11319b;

        /* renamed from: c  reason: collision with root package name */
        public final i f11320c;
        public final i d;

        /* renamed from: e  reason: collision with root package name */
        public final i f11321e;

        /* renamed from: f  reason: collision with root package name */
        public final List<h.b.C0162b> f11322f;

        /* renamed from: g  reason: collision with root package name */
        public final WeakReference<e> f11323g;

        /* renamed from: h  reason: collision with root package name */
        public lb.a<Void> f11324h = null;

        /* renamed from: i  reason: collision with root package name */
        public boolean f11325i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f11326j = false;

        public g(e eVar, i iVar, h.e eVar2, int i10, i iVar2, Collection<h.b.C0162b> collection) {
            this.f11323g = new WeakReference<>(eVar);
            this.d = iVar;
            this.f11318a = eVar2;
            this.f11319b = i10;
            this.f11320c = eVar.f11297q;
            this.f11321e = iVar2;
            this.f11322f = collection != null ? new ArrayList(collection) : null;
            eVar.f11292k.postDelayed(new u.a(this, 1), 15000L);
        }

        public void a() {
            if (!this.f11325i) {
                if (this.f11326j) {
                    return;
                }
                this.f11326j = true;
                h.e eVar = this.f11318a;
                if (eVar != null) {
                    eVar.h(0);
                    this.f11318a.d();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void b() {
            /*
                Method dump skipped, instructions count: 262
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j1.l.g.b():void");
        }
    }

    /* loaded from: classes2.dex */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final j1.h f11327a;

        /* renamed from: b  reason: collision with root package name */
        public final List<i> f11328b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final h.d f11329c;
        public j d;

        public h(j1.h hVar) {
            this.f11327a = hVar;
            this.f11329c = hVar.f11217b;
        }

        public i a(String str) {
            int size = this.f11328b.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f11328b.get(i10).f11331b.equals(str)) {
                    return this.f11328b.get(i10);
                }
            }
            return null;
        }

        public List<i> b() {
            l.b();
            return Collections.unmodifiableList(this.f11328b);
        }

        public String toString() {
            StringBuilder m10 = a1.a.m("MediaRouter.RouteProviderInfo{ packageName=");
            m10.append(this.f11329c.f11236a.getPackageName());
            m10.append(" }");
            return m10.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public final h f11330a;

        /* renamed from: b  reason: collision with root package name */
        public final String f11331b;

        /* renamed from: c  reason: collision with root package name */
        public final String f11332c;
        public String d;

        /* renamed from: e  reason: collision with root package name */
        public String f11333e;

        /* renamed from: f  reason: collision with root package name */
        public Uri f11334f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f11335g;

        /* renamed from: h  reason: collision with root package name */
        public int f11336h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f11337i;

        /* renamed from: k  reason: collision with root package name */
        public int f11339k;

        /* renamed from: l  reason: collision with root package name */
        public int f11340l;

        /* renamed from: m  reason: collision with root package name */
        public int f11341m;
        public int n;

        /* renamed from: o  reason: collision with root package name */
        public int f11342o;

        /* renamed from: p  reason: collision with root package name */
        public int f11343p;

        /* renamed from: r  reason: collision with root package name */
        public Bundle f11345r;

        /* renamed from: s  reason: collision with root package name */
        public IntentSender f11346s;

        /* renamed from: t  reason: collision with root package name */
        public j1.f f11347t;

        /* renamed from: v  reason: collision with root package name */
        public Map<String, h.b.C0162b> f11349v;

        /* renamed from: j  reason: collision with root package name */
        public final ArrayList<IntentFilter> f11338j = new ArrayList<>();

        /* renamed from: q  reason: collision with root package name */
        public int f11344q = -1;

        /* renamed from: u  reason: collision with root package name */
        public List<i> f11348u = new ArrayList();

        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public final h.b.C0162b f11350a;

            public a(h.b.C0162b c0162b) {
                this.f11350a = c0162b;
            }

            public boolean a() {
                h.b.C0162b c0162b = this.f11350a;
                return c0162b != null && c0162b.d;
            }
        }

        public i(h hVar, String str, String str2) {
            this.f11330a = hVar;
            this.f11331b = str;
            this.f11332c = str2;
        }

        public h.b a() {
            h.e eVar = l.d.f11298r;
            if (eVar instanceof h.b) {
                return (h.b) eVar;
            }
            return null;
        }

        public a b(i iVar) {
            Map<String, h.b.C0162b> map = this.f11349v;
            if (map == null || !map.containsKey(iVar.f11332c)) {
                return null;
            }
            return new a(this.f11349v.get(iVar.f11332c));
        }

        public List<i> c() {
            return Collections.unmodifiableList(this.f11348u);
        }

        public j1.h d() {
            h hVar = this.f11330a;
            Objects.requireNonNull(hVar);
            l.b();
            return hVar.f11327a;
        }

        public boolean e() {
            l.b();
            boolean z10 = false;
            if (!(l.d.f() == this) && this.f11341m != 3) {
                if (TextUtils.equals(d().f11217b.f11236a.getPackageName(), "android") && n("android.media.intent.category.LIVE_AUDIO") && !n("android.media.intent.category.LIVE_VIDEO")) {
                    z10 = true;
                }
                return z10;
            }
            return true;
        }

        public boolean f() {
            return c().size() >= 1;
        }

        public boolean g() {
            return this.f11347t != null && this.f11335g;
        }

        public boolean h() {
            l.b();
            return l.d.g() == this;
        }

        public boolean i(k kVar) {
            if (kVar != null) {
                l.b();
                ArrayList<IntentFilter> arrayList = this.f11338j;
                if (arrayList != null) {
                    kVar.a();
                    int size = kVar.f11276b.size();
                    if (size != 0) {
                        int size2 = arrayList.size();
                        for (int i10 = 0; i10 < size2; i10++) {
                            IntentFilter intentFilter = arrayList.get(i10);
                            if (intentFilter != null) {
                                for (int i11 = 0; i11 < size; i11++) {
                                    if (intentFilter.hasCategory(kVar.f11276b.get(i11))) {
                                        return true;
                                    }
                                }
                                continue;
                            }
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x021c  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0243  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0250  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x02b2  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x02ba  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x012d A[EDGE_INSN: B:137:0x012d->B:69:0x012d ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0131  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0160  */
        /* JADX WARN: Removed duplicated region for block: B:80:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0188  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x019a  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01ae  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01c5  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01fe  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int j(j1.f r15) {
            /*
                Method dump skipped, instructions count: 700
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j1.l.i.j(j1.f):int");
        }

        public void k(int i10) {
            h.e eVar;
            h.e eVar2;
            l.b();
            e eVar3 = l.d;
            int min = Math.min(this.f11343p, Math.max(0, i10));
            if (this == eVar3.f11297q && (eVar2 = eVar3.f11298r) != null) {
                eVar2.f(min);
            } else if (eVar3.f11301u.isEmpty() || (eVar = eVar3.f11301u.get(this.f11332c)) == null) {
            } else {
                eVar.f(min);
            }
        }

        public void l(int i10) {
            h.e eVar;
            h.e eVar2;
            l.b();
            if (i10 != 0) {
                e eVar3 = l.d;
                if (this == eVar3.f11297q && (eVar2 = eVar3.f11298r) != null) {
                    eVar2.i(i10);
                } else if (!eVar3.f11301u.isEmpty() && (eVar = eVar3.f11301u.get(this.f11332c)) != null) {
                    eVar.i(i10);
                }
            }
        }

        public void m() {
            l.b();
            l.d.k(this, 3);
        }

        public boolean n(String str) {
            l.b();
            int size = this.f11338j.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.f11338j.get(i10).hasCategory(str)) {
                    return true;
                }
            }
            return false;
        }

        public void o(Collection<h.b.C0162b> collection) {
            this.f11348u.clear();
            if (this.f11349v == null) {
                this.f11349v = new p.a();
            }
            this.f11349v.clear();
            while (true) {
                for (h.b.C0162b c0162b : collection) {
                    i a10 = this.f11330a.a(c0162b.f11231a.i());
                    if (a10 != null) {
                        this.f11349v.put(a10.f11332c, c0162b);
                        int i10 = c0162b.f11232b;
                        if (i10 == 2 || i10 == 3) {
                            this.f11348u.add(a10);
                        }
                    }
                }
                l.d.f11292k.b(259, this);
                return;
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder m10 = a1.a.m("MediaRouter.RouteInfo{ uniqueId=");
            m10.append(this.f11332c);
            m10.append(", name=");
            m10.append(this.d);
            m10.append(", description=");
            m10.append(this.f11333e);
            m10.append(", iconUri=");
            m10.append(this.f11334f);
            m10.append(", enabled=");
            m10.append(this.f11335g);
            m10.append(", connectionState=");
            m10.append(this.f11336h);
            m10.append(", canDisconnect=");
            m10.append(this.f11337i);
            m10.append(", playbackType=");
            m10.append(this.f11339k);
            m10.append(", playbackStream=");
            m10.append(this.f11340l);
            m10.append(", deviceType=");
            m10.append(this.f11341m);
            m10.append(", volumeHandling=");
            m10.append(this.n);
            m10.append(", volume=");
            m10.append(this.f11342o);
            m10.append(", volumeMax=");
            m10.append(this.f11343p);
            m10.append(", presentationDisplayId=");
            m10.append(this.f11344q);
            m10.append(", extras=");
            m10.append(this.f11345r);
            m10.append(", settingsIntent=");
            m10.append(this.f11346s);
            m10.append(", providerPackageName=");
            m10.append(this.f11330a.f11329c.f11236a.getPackageName());
            sb2.append(m10.toString());
            if (f()) {
                sb2.append(", members=[");
                int size = this.f11348u.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (i10 > 0) {
                        sb2.append(", ");
                    }
                    if (this.f11348u.get(i10) != this) {
                        sb2.append(this.f11348u.get(i10).f11332c);
                    }
                }
                sb2.append(']');
            }
            sb2.append(" }");
            return sb2.toString();
        }
    }

    public l(Context context) {
        this.f11278a = context;
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static l d(Context context) {
        l lVar;
        if (context != null) {
            b();
            if (d == null) {
                e eVar = new e(context.getApplicationContext());
                d = eVar;
                eVar.a(eVar.f11293l);
                j1.e eVar2 = eVar.f11285c;
                if (eVar2 != null) {
                    eVar.a(eVar2);
                }
                h0 h0Var = new h0(eVar.f11283a, eVar);
                if (!h0Var.f11241f) {
                    h0Var.f11241f = true;
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                    intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                    intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                    intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                    intentFilter.addDataScheme("package");
                    h0Var.f11237a.registerReceiver(h0Var.f11242g, intentFilter, null, h0Var.f11239c);
                    h0Var.f11239c.post(h0Var.f11243h);
                }
            }
            e eVar3 = d;
            int size = eVar3.d.size();
            do {
                while (true) {
                    size--;
                    if (size < 0) {
                        l lVar2 = new l(context);
                        eVar3.d.add(new WeakReference<>(lVar2));
                        return lVar2;
                    }
                    lVar = eVar3.d.get(size).get();
                    if (lVar == null) {
                        eVar3.d.remove(size);
                    }
                }
            } while (lVar.f11278a != context);
            return lVar;
        }
        throw new IllegalArgumentException("context must not be null");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void a(j1.k r8, j1.l.b r9, int r10) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.l.a(j1.k, j1.l$b, int):void");
    }

    public final int c(b bVar) {
        int size = this.f11279b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f11279b.get(i10).f11281b == bVar) {
                return i10;
            }
        }
        return -1;
    }

    public MediaSessionCompat.Token e() {
        e eVar = d;
        e.d dVar = eVar.A;
        MediaSessionCompat.Token token = null;
        if (dVar != null) {
            MediaSessionCompat mediaSessionCompat = dVar.f11311a;
            if (mediaSessionCompat != null) {
                return mediaSessionCompat.b();
            }
        } else {
            MediaSessionCompat mediaSessionCompat2 = eVar.B;
            if (mediaSessionCompat2 != null) {
                token = mediaSessionCompat2.b();
            }
        }
        return token;
    }

    public List<i> f() {
        b();
        return d.f11286e;
    }

    public i g() {
        b();
        return d.g();
    }

    public boolean h(k kVar, int i10) {
        if (kVar != null) {
            b();
            e eVar = d;
            Objects.requireNonNull(eVar);
            if (kVar.c()) {
                return false;
            }
            if ((i10 & 2) != 0 || !eVar.f11294m) {
                c0 c0Var = eVar.n;
                boolean z10 = c0Var != null && c0Var.f11139b && eVar.f11284b;
                int size = eVar.f11286e.size();
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = eVar.f11286e.get(i11);
                    if (((i10 & 1) == 0 || !iVar.e()) && ((!z10 || iVar.e() || iVar.d() == eVar.f11285c) && iVar.i(kVar))) {
                    }
                }
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public void i(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        if (f11277c) {
            Log.d("MediaRouter", "removeCallback: callback=" + bVar);
        }
        int c10 = c(bVar);
        if (c10 >= 0) {
            this.f11279b.remove(c10);
            d.m();
        }
    }

    public void j(i iVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("route must not be null");
        }
        b();
        if (f11277c) {
            Log.d("MediaRouter", "selectRoute: " + iVar);
        }
        d.k(iVar, 3);
    }

    public void k(int i10) {
        if (i10 < 0 || i10 > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        b();
        i c10 = d.c();
        if (d.g() != c10) {
            d.k(c10, i10);
        }
    }
}
