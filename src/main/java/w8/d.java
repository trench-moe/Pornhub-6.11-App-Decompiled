package w8;

import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.util.SparseIntArray;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TimerTask;
import w8.g;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    public long f16964b;

    /* renamed from: c  reason: collision with root package name */
    public final g f16965c;
    public List<Integer> d;

    /* renamed from: e  reason: collision with root package name */
    public final SparseIntArray f16966e;

    /* renamed from: f  reason: collision with root package name */
    public LruCache<Integer, u8.m> f16967f;

    /* renamed from: g  reason: collision with root package name */
    public final List<Integer> f16968g;

    /* renamed from: h  reason: collision with root package name */
    public final Deque<Integer> f16969h;

    /* renamed from: i  reason: collision with root package name */
    public final Handler f16970i;

    /* renamed from: j  reason: collision with root package name */
    public TimerTask f16971j;

    /* renamed from: k  reason: collision with root package name */
    public d9.d<g.c> f16972k;

    /* renamed from: l  reason: collision with root package name */
    public d9.d<g.c> f16973l;

    /* renamed from: m  reason: collision with root package name */
    public Set<a> f16974m = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final a9.b f16963a = new a9.b("MediaQueue");

    /* loaded from: classes2.dex */
    public static abstract class a {
    }

    public d(g gVar, int i10) {
        this.f16965c = gVar;
        Math.max(20, 1);
        this.d = new ArrayList();
        this.f16966e = new SparseIntArray();
        this.f16968g = new ArrayList();
        this.f16969h = new ArrayDeque(20);
        this.f16970i = new t9.x(Looper.getMainLooper());
        this.f16971j = new s0(this);
        u0 u0Var = new u0(this);
        h9.o.d("Must be called from the main thread.");
        gVar.f17014h.add(u0Var);
        this.f16967f = new t0(this, 20);
        this.f16964b = e();
        d();
    }

    public static void a(d dVar, int[] iArr) {
        for (a aVar : dVar.f16974m) {
            Objects.requireNonNull(aVar);
        }
    }

    public static /* bridge */ /* synthetic */ void b(d dVar) {
        dVar.f16966e.clear();
        for (int i10 = 0; i10 < dVar.d.size(); i10++) {
            dVar.f16966e.put(dVar.d.get(i10).intValue(), i10);
        }
    }

    public final void c() {
        h();
        this.d.clear();
        this.f16966e.clear();
        this.f16967f.evictAll();
        this.f16968g.clear();
        this.f16970i.removeCallbacks(this.f16971j);
        this.f16969h.clear();
        d9.d<g.c> dVar = this.f16973l;
        if (dVar != null) {
            dVar.cancel();
            this.f16973l = null;
        }
        d9.d<g.c> dVar2 = this.f16972k;
        if (dVar2 != null) {
            dVar2.cancel();
            this.f16972k = null;
        }
        g();
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11, types: [d9.d] */
    public final void d() {
        d9.d<g.c> dVar;
        o oVar;
        h9.o.d("Must be called from the main thread.");
        if (this.f16964b != 0 && (dVar = this.f16973l) == null) {
            if (dVar != null) {
                dVar.cancel();
                this.f16973l = null;
            }
            d9.d<g.c> dVar2 = this.f16972k;
            if (dVar2 != null) {
                dVar2.cancel();
                this.f16972k = null;
            }
            g gVar = this.f16965c;
            Objects.requireNonNull(gVar);
            h9.o.d("Must be called from the main thread.");
            if (gVar.C()) {
                oVar = new o(gVar);
                g.D(oVar);
            } else {
                oVar = g.w(17, null);
            }
            this.f16973l = oVar;
            oVar.setResultCallback(new d9.g() { // from class: w8.q0
                @Override // d9.g
                public final void a(d9.f fVar) {
                    d dVar3 = d.this;
                    Objects.requireNonNull(dVar3);
                    Status V = ((g.c) fVar).V();
                    int i10 = V.f6859f;
                    if (i10 != 0) {
                        dVar3.f16963a.d(String.format("Error fetching queue item ids, statusCode=%s, statusMessage=%s", Integer.valueOf(i10), V.f6860j), new Object[0]);
                    }
                    dVar3.f16973l = null;
                    if (!dVar3.f16969h.isEmpty()) {
                        dVar3.f16970i.removeCallbacks(dVar3.f16971j);
                        dVar3.f16970i.postDelayed(dVar3.f16971j, 500L);
                    }
                }
            });
        }
    }

    public final long e() {
        u8.o g10 = this.f16965c.g();
        if (g10 != null) {
            MediaInfo mediaInfo = g10.f15736c;
            if (!u8.o.u0(g10.n, g10.f15740t, g10.B, mediaInfo == null ? -1 : mediaInfo.f6795f)) {
                return g10.f15737f;
            }
        }
        return 0L;
    }

    public final void f() {
        for (a aVar : this.f16974m) {
            Objects.requireNonNull(aVar);
        }
    }

    public final void g() {
        for (a aVar : this.f16974m) {
            Objects.requireNonNull(aVar);
        }
    }

    public final void h() {
        for (a aVar : this.f16974m) {
            Objects.requireNonNull(aVar);
        }
    }
}
