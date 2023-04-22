package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.databinding.ViewDataBinding;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.b;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.drm.g;
import com.google.common.collect.ImmutableList;
import j8.r;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import k8.c0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
public class DefaultDrmSession implements DrmSession {

    /* renamed from: a  reason: collision with root package name */
    public final List<b.C0080b> f6113a;

    /* renamed from: b  reason: collision with root package name */
    public final g f6114b;

    /* renamed from: c  reason: collision with root package name */
    public final a f6115c;
    public final b d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6116e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6117f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6118g;

    /* renamed from: h  reason: collision with root package name */
    public final HashMap<String, String> f6119h;

    /* renamed from: i  reason: collision with root package name */
    public final k8.f<c.a> f6120i;

    /* renamed from: j  reason: collision with root package name */
    public final r f6121j;

    /* renamed from: k  reason: collision with root package name */
    public final j f6122k;

    /* renamed from: l  reason: collision with root package name */
    public final UUID f6123l;

    /* renamed from: m  reason: collision with root package name */
    public final e f6124m;
    public int n;

    /* renamed from: o  reason: collision with root package name */
    public int f6125o;

    /* renamed from: p  reason: collision with root package name */
    public HandlerThread f6126p;

    /* renamed from: q  reason: collision with root package name */
    public c f6127q;

    /* renamed from: r  reason: collision with root package name */
    public b7.h f6128r;

    /* renamed from: s  reason: collision with root package name */
    public DrmSession.DrmSessionException f6129s;

    /* renamed from: t  reason: collision with root package name */
    public byte[] f6130t;

    /* renamed from: u  reason: collision with root package name */
    public byte[] f6131u;

    /* renamed from: v  reason: collision with root package name */
    public g.a f6132v;

    /* renamed from: w  reason: collision with root package name */
    public g.d f6133w;

    /* loaded from: classes.dex */
    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th) {
            super(th);
        }
    }

    /* loaded from: classes.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public boolean f6134a;

        public c(Looper looper) {
            super(looper);
        }

        public void a(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(w7.c.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // android.os.Handler
        public void handleMessage(android.os.Message r12) {
            /*
                Method dump skipped, instructions count: 300
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.c.handleMessage(android.os.Message):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final long f6136a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6137b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f6138c;
        public int d;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f6136a = j10;
            this.f6137b = z10;
            this.f6138c = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Set<c.a> set;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                if (obj == defaultDrmSession.f6133w) {
                    if (defaultDrmSession.n != 2 && !defaultDrmSession.h()) {
                        return;
                    }
                    defaultDrmSession.f6133w = null;
                    if (obj2 instanceof Exception) {
                        ((DefaultDrmSessionManager.e) defaultDrmSession.f6115c).a((Exception) obj2, false);
                        return;
                    }
                    try {
                        defaultDrmSession.f6114b.k((byte[]) obj2);
                        DefaultDrmSessionManager.e eVar = (DefaultDrmSessionManager.e) defaultDrmSession.f6115c;
                        eVar.f6168b = null;
                        ImmutableList r10 = ImmutableList.r(eVar.f6167a);
                        eVar.f6167a.clear();
                        kb.a listIterator = r10.listIterator();
                        loop1: while (true) {
                            while (listIterator.hasNext()) {
                                DefaultDrmSession defaultDrmSession2 = (DefaultDrmSession) listIterator.next();
                                if (defaultDrmSession2.k()) {
                                    defaultDrmSession2.g(true);
                                }
                            }
                        }
                    } catch (Exception e10) {
                        ((DefaultDrmSessionManager.e) defaultDrmSession.f6115c).a(e10, true);
                    }
                }
            } else if (i10 == 1) {
                DefaultDrmSession defaultDrmSession3 = DefaultDrmSession.this;
                if (obj == defaultDrmSession3.f6132v) {
                    if (!defaultDrmSession3.h()) {
                        return;
                    }
                    defaultDrmSession3.f6132v = null;
                    if (obj2 instanceof Exception) {
                        defaultDrmSession3.j((Exception) obj2, false);
                        return;
                    }
                    try {
                        byte[] bArr = (byte[]) obj2;
                        if (defaultDrmSession3.f6116e != 3) {
                            byte[] j10 = defaultDrmSession3.f6114b.j(defaultDrmSession3.f6130t, bArr);
                            int i11 = defaultDrmSession3.f6116e;
                            if ((i11 == 2 || (i11 == 0 && defaultDrmSession3.f6131u != null)) && j10 != null && j10.length != 0) {
                                defaultDrmSession3.f6131u = j10;
                            }
                            defaultDrmSession3.n = 4;
                            defaultDrmSession3.f(k0.c.f11747z);
                            return;
                        }
                        g gVar = defaultDrmSession3.f6114b;
                        byte[] bArr2 = defaultDrmSession3.f6131u;
                        int i12 = c0.f11939a;
                        gVar.j(bArr2, bArr);
                        k8.f<c.a> fVar = defaultDrmSession3.f6120i;
                        synchronized (fVar.f11952c) {
                            set = fVar.f11954j;
                        }
                        for (c.a aVar : set) {
                            aVar.b();
                        }
                    } catch (Exception e11) {
                        defaultDrmSession3.j(e11, true);
                    }
                }
            }
        }
    }

    public DefaultDrmSession(UUID uuid, g gVar, a aVar, b bVar, List<b.C0080b> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> hashMap, j jVar, Looper looper, r rVar) {
        if (i10 == 1 || i10 == 3) {
            Objects.requireNonNull(bArr);
        }
        this.f6123l = uuid;
        this.f6115c = aVar;
        this.d = bVar;
        this.f6114b = gVar;
        this.f6116e = i10;
        this.f6117f = z10;
        this.f6118g = z11;
        if (bArr != null) {
            this.f6131u = bArr;
            this.f6113a = null;
        } else {
            Objects.requireNonNull(list);
            this.f6113a = Collections.unmodifiableList(list);
        }
        this.f6119h = hashMap;
        this.f6122k = jVar;
        this.f6120i = new k8.f<>();
        this.f6121j = rVar;
        this.n = 2;
        this.f6124m = new e(looper);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.drm.DrmSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.google.android.exoplayer2.drm.c.a r12) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.a(com.google.android.exoplayer2.drm.c$a):void");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0111  */
    @Override // com.google.android.exoplayer2.drm.DrmSession
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(com.google.android.exoplayer2.drm.c.a r12) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.b(com.google.android.exoplayer2.drm.c$a):void");
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID c() {
        return this.f6123l;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean d() {
        return this.f6117f;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final b7.h e() {
        return this.f6128r;
    }

    public final void f(k8.e<c.a> eVar) {
        Set<c.a> set;
        k8.f<c.a> fVar = this.f6120i;
        synchronized (fVar.f11952c) {
            try {
                set = fVar.f11954j;
            } catch (Throwable th) {
                throw th;
            }
        }
        for (c.a aVar : set) {
            aVar.a();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:66|(2:67|68)|(6:70|71|72|73|(1:75)|77)|80|71|72|73|(0)|77) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        if (r2 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
        if (r2 == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8 A[Catch: NumberFormatException -> 0x00bc, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x00bc, blocks: (B:45:0x00af, B:47:0x00b8), top: B:79:0x00af }] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sessionId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(boolean r13) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.g(boolean):void");
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        if (this.n == 1) {
            return this.f6129s;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.n;
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = ViewDataBinding.f1896i)
    public final boolean h() {
        int i10 = this.n;
        if (i10 != 3 && i10 != 4) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Finally extract failed */
    public final void i(Exception exc, int i10) {
        int i11;
        Set<c.a> set;
        int i12 = c0.f11939a;
        if (i12 < 21 || !b7.f.a(exc)) {
            if (i12 < 23 || !b7.g.a(exc)) {
                if (i12 < 18 || !b7.e.b(exc)) {
                    if (i12 >= 18 && b7.e.a(exc)) {
                        i11 = 6007;
                    } else if (exc instanceof UnsupportedDrmException) {
                        i11 = 6001;
                    } else if (exc instanceof DefaultDrmSessionManager.MissingSchemeDataException) {
                        i11 = 6003;
                    } else if (exc instanceof KeysExpiredException) {
                        i11 = 6008;
                    } else if (i10 != 1) {
                        if (i10 == 2) {
                            i11 = 6004;
                        } else if (i10 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i11 = 6002;
            }
            i11 = 6006;
        } else {
            i11 = b7.f.b(exc);
        }
        this.f6129s = new DrmSession.DrmSessionException(exc, i11);
        k8.a.i("DefaultDrmSession", "DRM session error", exc);
        k8.f<c.a> fVar = this.f6120i;
        synchronized (fVar.f11952c) {
            try {
                set = fVar.f11954j;
            } catch (Throwable th) {
                throw th;
            }
        }
        for (c.a aVar : set) {
            aVar.e(exc);
        }
        if (this.n != 4) {
            this.n = 1;
        }
    }

    public final void j(Exception exc, boolean z10) {
        if (!(exc instanceof NotProvisionedException)) {
            i(exc, z10 ? 1 : 2);
            return;
        }
        DefaultDrmSessionManager.e eVar = (DefaultDrmSessionManager.e) this.f6115c;
        eVar.f6167a.add(this);
        if (eVar.f6168b != null) {
            return;
        }
        eVar.f6168b = this;
        m();
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = ViewDataBinding.f1896i)
    public final boolean k() {
        Set<c.a> set;
        if (h()) {
            return true;
        }
        try {
            byte[] f10 = this.f6114b.f();
            this.f6130t = f10;
            this.f6128r = this.f6114b.d(f10);
            this.n = 3;
            k8.f<c.a> fVar = this.f6120i;
            synchronized (fVar.f11952c) {
                set = fVar.f11954j;
            }
            for (c.a aVar : set) {
                aVar.d(3);
            }
            Objects.requireNonNull(this.f6130t);
            return true;
        } catch (NotProvisionedException unused) {
            DefaultDrmSessionManager.e eVar = (DefaultDrmSessionManager.e) this.f6115c;
            eVar.f6167a.add(this);
            if (eVar.f6168b == null) {
                eVar.f6168b = this;
                m();
            }
            return false;
        } catch (Exception e10) {
            i(e10, 1);
            return false;
        }
    }

    public final void l(byte[] bArr, int i10, boolean z10) {
        try {
            g.a l10 = this.f6114b.l(bArr, this.f6113a, i10, this.f6119h);
            this.f6132v = l10;
            c cVar = this.f6127q;
            int i11 = c0.f11939a;
            Objects.requireNonNull(l10);
            cVar.a(1, l10, z10);
        } catch (Exception e10) {
            j(e10, true);
        }
    }

    public void m() {
        g.d e10 = this.f6114b.e();
        this.f6133w = e10;
        c cVar = this.f6127q;
        int i10 = c0.f11939a;
        Objects.requireNonNull(e10);
        cVar.a(0, e10, true);
    }

    public Map<String, String> n() {
        byte[] bArr = this.f6130t;
        if (bArr == null) {
            return null;
        }
        return this.f6114b.c(bArr);
    }
}
