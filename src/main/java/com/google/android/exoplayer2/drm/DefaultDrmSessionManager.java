package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.emoji2.text.k;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.drm.d;
import com.google.android.exoplayer2.drm.g;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import g4.s;
import j8.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import k8.c0;
import k8.p;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import w6.y;

/* loaded from: classes.dex */
public class DefaultDrmSessionManager implements com.google.android.exoplayer2.drm.d {

    /* renamed from: b  reason: collision with root package name */
    public final UUID f6140b;

    /* renamed from: c  reason: collision with root package name */
    public final g.c f6141c;
    public final j d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap<String, String> f6142e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6143f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f6144g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6145h;

    /* renamed from: i  reason: collision with root package name */
    public final e f6146i;

    /* renamed from: j  reason: collision with root package name */
    public final r f6147j;

    /* renamed from: k  reason: collision with root package name */
    public final f f6148k;

    /* renamed from: l  reason: collision with root package name */
    public final long f6149l;

    /* renamed from: m  reason: collision with root package name */
    public final List<DefaultDrmSession> f6150m;
    public final Set<d> n;

    /* renamed from: o  reason: collision with root package name */
    public final Set<DefaultDrmSession> f6151o;

    /* renamed from: p  reason: collision with root package name */
    public int f6152p;

    /* renamed from: q  reason: collision with root package name */
    public g f6153q;

    /* renamed from: r  reason: collision with root package name */
    public DefaultDrmSession f6154r;

    /* renamed from: s  reason: collision with root package name */
    public DefaultDrmSession f6155s;

    /* renamed from: t  reason: collision with root package name */
    public Looper f6156t;

    /* renamed from: u  reason: collision with root package name */
    public Handler f6157u;

    /* renamed from: v  reason: collision with root package name */
    public int f6158v;

    /* renamed from: w  reason: collision with root package name */
    public byte[] f6159w;

    /* renamed from: x  reason: collision with root package name */
    public volatile c f6160x;

    /* loaded from: classes.dex */
    public static final class MissingSchemeDataException extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public MissingSchemeDataException(java.util.UUID r2, com.google.android.exoplayer2.drm.DefaultDrmSessionManager.a r3) {
            /*
                r1 = this;
                java.lang.String r2 = java.lang.String.valueOf(r2)
                int r3 = r2.length()
                int r3 = r3 + 29
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>(r3)
                java.lang.String r3 = "Media does not support uuid: "
                r0.append(r3)
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MissingSchemeDataException.<init>(java.util.UUID, com.google.android.exoplayer2.drm.DefaultDrmSessionManager$a):void");
        }
    }

    /* loaded from: classes.dex */
    public class b implements g.b {
        public b(a aVar) {
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            Iterator<DefaultDrmSession> it = DefaultDrmSessionManager.this.f6150m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession next = it.next();
                if (Arrays.equals(next.f6130t, bArr)) {
                    if (message.what != 2) {
                        return;
                    }
                    if (next.f6116e == 0 && next.n == 4) {
                        int i10 = c0.f11939a;
                        next.g(false);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements d.b {

        /* renamed from: c  reason: collision with root package name */
        public final c.a f6163c;

        /* renamed from: f  reason: collision with root package name */
        public DrmSession f6164f;

        /* renamed from: j  reason: collision with root package name */
        public boolean f6165j;

        public d(c.a aVar) {
            this.f6163c = aVar;
        }

        @Override // com.google.android.exoplayer2.drm.d.b
        public void a() {
            Handler handler = DefaultDrmSessionManager.this.f6157u;
            Objects.requireNonNull(handler);
            c0.C(handler, new k(this, 6));
        }
    }

    /* loaded from: classes.dex */
    public class e implements DefaultDrmSession.a {

        /* renamed from: a  reason: collision with root package name */
        public final Set<DefaultDrmSession> f6167a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public DefaultDrmSession f6168b;

        public void a(Exception exc, boolean z10) {
            this.f6168b = null;
            ImmutableList r10 = ImmutableList.r(this.f6167a);
            this.f6167a.clear();
            kb.a listIterator = r10.listIterator();
            while (listIterator.hasNext()) {
                ((DefaultDrmSession) listIterator.next()).i(exc, z10 ? 1 : 3);
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements DefaultDrmSession.b {
        public f(a aVar) {
        }
    }

    public DefaultDrmSessionManager(UUID uuid, g.c cVar, j jVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, r rVar, long j10, a aVar) {
        Objects.requireNonNull(uuid);
        k8.a.d(!w6.g.f16589b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f6140b = uuid;
        this.f6141c = cVar;
        this.d = jVar;
        this.f6142e = hashMap;
        this.f6143f = z10;
        this.f6144g = iArr;
        this.f6145h = z11;
        this.f6147j = rVar;
        this.f6146i = new e();
        this.f6148k = new f(null);
        this.f6158v = 0;
        this.f6150m = new ArrayList();
        this.n = Collections.newSetFromMap(new IdentityHashMap());
        this.f6151o = Collections.newSetFromMap(new IdentityHashMap());
        this.f6149l = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        if ((r6.getCause() instanceof android.media.ResourceBusyException) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean g(com.google.android.exoplayer2.drm.DrmSession r6) {
        /*
            com.google.android.exoplayer2.drm.DefaultDrmSession r6 = (com.google.android.exoplayer2.drm.DefaultDrmSession) r6
            java.lang.String r5 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
            int r0 = r6.n
            r5 = 7
            r3 = 1
            r1 = r3
            if (r0 != r1) goto L23
            int r0 = k8.c0.f11939a
            r2 = 19
            r5 = 7
            if (r0 < r2) goto L25
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r6 = r6.getError()
            java.util.Objects.requireNonNull(r6)
            java.lang.Throwable r3 = r6.getCause()
            r6 = r3
            boolean r6 = r6 instanceof android.media.ResourceBusyException
            if (r6 == 0) goto L23
            goto L26
        L23:
            r3 = 0
            r1 = r3
        L25:
            r4 = 3
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.g(com.google.android.exoplayer2.drm.DrmSession):boolean");
    }

    public static List<b.C0080b> j(com.google.android.exoplayer2.drm.b bVar, UUID uuid, boolean z10) {
        boolean z11;
        ArrayList arrayList = new ArrayList(bVar.f6176m);
        for (int i10 = 0; i10 < bVar.f6176m; i10++) {
            b.C0080b c0080b = bVar.f6173c[i10];
            if (!c0080b.a(uuid) && (!w6.g.f16590c.equals(uuid) || !c0080b.a(w6.g.f16589b))) {
                z11 = false;
                if (z11 && (c0080b.n != null || z10)) {
                    arrayList.add(c0080b);
                }
            }
            z11 = true;
            if (z11) {
                arrayList.add(c0080b);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final void a() {
        int i10 = this.f6152p - 1;
        this.f6152p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f6149l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f6150m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((DefaultDrmSession) arrayList.get(i11)).b(null);
            }
        }
        m();
        l();
    }

    @Override // com.google.android.exoplayer2.drm.d
    public d.b b(Looper looper, c.a aVar, y yVar) {
        k8.a.f(this.f6152p > 0);
        k(looper);
        d dVar = new d(aVar);
        Handler handler = this.f6157u;
        Objects.requireNonNull(handler);
        handler.post(new s(dVar, yVar, 3));
        return dVar;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public DrmSession c(Looper looper, c.a aVar, y yVar) {
        k8.a.f(this.f6152p > 0);
        k(looper);
        return e(looper, aVar, yVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ca A[ORIG_RETURN, RETURN] */
    @Override // com.google.android.exoplayer2.drm.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Class<? extends b7.h> d(w6.y r11) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.d(w6.y):java.lang.Class");
    }

    public final DrmSession e(Looper looper, c.a aVar, y yVar, boolean z10) {
        List<b.C0080b> list;
        if (this.f6160x == null) {
            this.f6160x = new c(looper);
        }
        com.google.android.exoplayer2.drm.b bVar = yVar.E;
        DefaultDrmSession defaultDrmSession = null;
        int i10 = 0;
        if (bVar == null) {
            int g10 = p.g(yVar.B);
            g gVar = this.f6153q;
            Objects.requireNonNull(gVar);
            if (!(b7.i.class.equals(gVar.b()) && b7.i.f3590m)) {
                int[] iArr = this.f6144g;
                int i11 = c0.f11939a;
                while (true) {
                    if (i10 >= iArr.length) {
                        i10 = -1;
                        break;
                    } else if (iArr[i10] == g10) {
                        break;
                    } else {
                        i10++;
                    }
                }
                if (i10 != -1) {
                    if (b7.k.class.equals(gVar.b())) {
                        return defaultDrmSession;
                    }
                    DefaultDrmSession defaultDrmSession2 = this.f6154r;
                    if (defaultDrmSession2 == null) {
                        DefaultDrmSession i12 = i(ImmutableList.w(), true, null, z10);
                        this.f6150m.add(i12);
                        this.f6154r = i12;
                    } else {
                        defaultDrmSession2.a(null);
                    }
                    defaultDrmSession = this.f6154r;
                }
            }
            return defaultDrmSession;
        }
        if (this.f6159w == null) {
            list = j(bVar, this.f6140b, false);
            if (((ArrayList) list).isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f6140b, null);
                k8.a.i("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.e(missingSchemeDataException);
                }
                return new com.google.android.exoplayer2.drm.f(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            list = null;
        }
        if (this.f6143f) {
            Iterator<DefaultDrmSession> it = this.f6150m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession next = it.next();
                if (c0.a(next.f6113a, list)) {
                    defaultDrmSession = next;
                    break;
                }
            }
        } else {
            defaultDrmSession = this.f6155s;
        }
        if (defaultDrmSession == null) {
            defaultDrmSession = i(list, false, aVar, z10);
            if (!this.f6143f) {
                this.f6155s = defaultDrmSession;
            }
            this.f6150m.add(defaultDrmSession);
        } else {
            defaultDrmSession.a(aVar);
        }
        return defaultDrmSession;
    }

    @Override // com.google.android.exoplayer2.drm.d
    public final void f() {
        int i10 = this.f6152p;
        this.f6152p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f6153q == null) {
            g a10 = this.f6141c.a(this.f6140b);
            this.f6153q = a10;
            a10.i(new b(null));
        } else if (this.f6149l != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f6150m.size(); i11++) {
                this.f6150m.get(i11).a(null);
            }
        }
    }

    public final DefaultDrmSession h(List<b.C0080b> list, boolean z10, c.a aVar) {
        Objects.requireNonNull(this.f6153q);
        UUID uuid = this.f6140b;
        g gVar = this.f6153q;
        e eVar = this.f6146i;
        f fVar = this.f6148k;
        int i10 = this.f6158v;
        byte[] bArr = this.f6159w;
        HashMap<String, String> hashMap = this.f6142e;
        j jVar = this.d;
        Looper looper = this.f6156t;
        Objects.requireNonNull(looper);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(uuid, gVar, eVar, fVar, list, i10, this.f6145h | z10, z10, bArr, hashMap, jVar, looper, this.f6147j);
        defaultDrmSession.a(aVar);
        if (this.f6149l != -9223372036854775807L) {
            defaultDrmSession.a(null);
        }
        return defaultDrmSession;
    }

    public final DefaultDrmSession i(List<b.C0080b> list, boolean z10, c.a aVar, boolean z11) {
        DefaultDrmSession h10 = h(list, z10, aVar);
        if (g(h10) && !this.f6151o.isEmpty()) {
            Iterator it = ImmutableSet.q(this.f6151o).iterator();
            while (it.hasNext()) {
                ((DrmSession) it.next()).b(null);
            }
            h10.b(aVar);
            if (this.f6149l != -9223372036854775807L) {
                h10.b(null);
            }
            h10 = h(list, z10, aVar);
        }
        if (g(h10) && z11 && !this.n.isEmpty()) {
            m();
            h10.b(aVar);
            if (this.f6149l != -9223372036854775807L) {
                h10.b(null);
            }
            h10 = h(list, z10, aVar);
        }
        return h10;
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    public final synchronized void k(Looper looper) {
        try {
            Looper looper2 = this.f6156t;
            if (looper2 == null) {
                this.f6156t = looper;
                this.f6157u = new Handler(looper);
            } else {
                k8.a.f(looper2 == looper);
                Objects.requireNonNull(this.f6157u);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void l() {
        if (this.f6153q != null && this.f6152p == 0 && this.f6150m.isEmpty() && this.n.isEmpty()) {
            g gVar = this.f6153q;
            Objects.requireNonNull(gVar);
            gVar.a();
            this.f6153q = null;
        }
    }

    public final void m() {
        Iterator it = ImmutableSet.q(this.n).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            Handler handler = DefaultDrmSessionManager.this.f6157u;
            Objects.requireNonNull(handler);
            c0.C(handler, new k(dVar, 6));
        }
    }
}
