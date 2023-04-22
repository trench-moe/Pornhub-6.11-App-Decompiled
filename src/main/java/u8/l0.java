package u8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import d9.b;
import e9.g;
import e9.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import l.InterfaceC0186;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import u8.e;

@SuppressLint({"UseSparseArrays"})
/* loaded from: classes2.dex */
public final class l0 extends d9.b<e.b> implements e1 {
    public static final a9.b G = new a9.b("CastClient");
    public static final d9.a<e.b> H = new d9.a<>("Cast.API_CXLESS", new d0(), a9.j.f279b);
    public final CastDevice A;
    public final Map<Long, ea.h<Void>> B;
    public final Map<String, e.d> C;
    public final e.c D;
    public final List<d1> E;
    public int F;

    /* renamed from: k  reason: collision with root package name */
    public final k0 f15712k;

    /* renamed from: l  reason: collision with root package name */
    public Handler f15713l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f15714m;
    public boolean n;

    /* renamed from: o  reason: collision with root package name */
    public ea.h<e.a> f15715o;

    /* renamed from: p  reason: collision with root package name */
    public ea.h<Status> f15716p;

    /* renamed from: q  reason: collision with root package name */
    public final AtomicLong f15717q;

    /* renamed from: r  reason: collision with root package name */
    public final Object f15718r;

    /* renamed from: s  reason: collision with root package name */
    public final Object f15719s;

    /* renamed from: t  reason: collision with root package name */
    public d f15720t;

    /* renamed from: u  reason: collision with root package name */
    public String f15721u;

    /* renamed from: v  reason: collision with root package name */
    public double f15722v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f15723w;

    /* renamed from: x  reason: collision with root package name */
    public int f15724x;
    public int y;

    /* renamed from: z  reason: collision with root package name */
    public x f15725z;

    public l0(Context context, e.b bVar) {
        super(context, H, bVar, b.a.f8866c);
        this.f15712k = new k0(this);
        this.f15718r = new Object();
        this.f15719s = new Object();
        this.E = Collections.synchronizedList(new ArrayList());
        h9.o.i(context, "context cannot be null");
        h9.o.i(bVar, "CastOptions cannot be null");
        this.D = bVar.f15658c;
        this.A = bVar.f15657b;
        this.B = new HashMap();
        this.C = new HashMap();
        this.f15717q = new AtomicLong(0L);
        this.F = 1;
        l();
    }

    public static void c(l0 l0Var, long j10, int i10) {
        ea.h<Void> hVar;
        synchronized (l0Var.B) {
            Map<Long, ea.h<Void>> map = l0Var.B;
            Long valueOf = Long.valueOf(j10);
            hVar = map.get(valueOf);
            l0Var.B.remove(valueOf);
        }
        if (hVar != null) {
            if (i10 == 0) {
                hVar.f9273a.p(null);
            } else {
                hVar.f9273a.o(e(i10));
            }
        }
    }

    public static void d(l0 l0Var, int i10) {
        synchronized (l0Var.f15719s) {
            try {
                ea.h<Status> hVar = l0Var.f15716p;
                if (hVar == null) {
                    return;
                }
                if (i10 == 0) {
                    hVar.f9273a.p(new Status(0, null));
                } else {
                    hVar.f9273a.o(e(i10));
                }
                l0Var.f15716p = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ApiException e(int i10) {
        return a0.b.v(new Status(i10, null));
    }

    public static Handler m(l0 l0Var) {
        if (l0Var.f15713l == null) {
            l0Var.f15713l = new t9.x(l0Var.f8861f);
        }
        return l0Var.f15713l;
    }

    public final ea.g<Boolean> f(a9.h hVar) {
        Looper looper = this.f8861f;
        h9.o.i(hVar, "Listener must not be null");
        h9.o.i(looper, "Looper must not be null");
        new u9.d(looper);
        h9.o.e("castDeviceControllerListenerKey");
        g.a aVar = new g.a(hVar, "castDeviceControllerListenerKey");
        e9.d dVar = this.f8865j;
        Objects.requireNonNull(dVar);
        ea.h hVar2 = new ea.h();
        dVar.g(hVar2, 8415, this);
        e9.w0 w0Var = new e9.w0(aVar, hVar2);
        Handler handler = dVar.D;
        handler.sendMessage(handler.obtainMessage(13, new e9.i0(w0Var, dVar.y.get(), this)));
        return hVar2.f9273a;
    }

    public final void g() {
        h9.o.k(this.F == 2, "Not connected to device");
    }

    public final void h() {
        G.a("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.C) {
            this.C.clear();
        }
    }

    public final void i(ea.h<e.a> hVar) {
        synchronized (this.f15718r) {
            if (this.f15715o != null) {
                j(2477);
            }
            this.f15715o = hVar;
        }
    }

    public final void j(int i10) {
        synchronized (this.f15718r) {
            try {
                ea.h<e.a> hVar = this.f15715o;
                if (hVar != null) {
                    hVar.f9273a.o(e(i10));
                }
                this.f15715o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ea.g<Void> k() {
        m.a aVar = new m.a();
        aVar.f9224a = b7.k.f3600d0;
        aVar.d = 8403;
        ea.g b10 = b(1, aVar.a());
        h();
        f(this.f15712k);
        return b10;
    }

    @RequiresNonNull({"device"})
    public final double l() {
        if (this.A.q0(InterfaceC0186.f43)) {
            return 0.02d;
        }
        return (!this.A.q0(4) || this.A.q0(1) || "Chromecast Audio".equals(this.A.n)) ? 0.05d : 0.02d;
    }
}
