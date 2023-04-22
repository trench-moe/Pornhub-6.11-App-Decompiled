package e9;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import d9.a;
import d9.a.d;
import d9.c;
import e9.g;
import h9.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes.dex */
public final class z<O extends a.d> implements c.a, c.b {
    @NotOnlyInitialized

    /* renamed from: b  reason: collision with root package name */
    public final a.f f9260b;

    /* renamed from: c  reason: collision with root package name */
    public final a<O> f9261c;
    public final p d;

    /* renamed from: g  reason: collision with root package name */
    public final int f9264g;

    /* renamed from: h  reason: collision with root package name */
    public final p0 f9265h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f9266i;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ d f9270m;

    /* renamed from: a  reason: collision with root package name */
    public final Queue<x0> f9259a = new LinkedList();

    /* renamed from: e  reason: collision with root package name */
    public final Set<y0> f9262e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Map<g.a<?>, j0> f9263f = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public final List<a0> f9267j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public c9.b f9268k = null;

    /* renamed from: l  reason: collision with root package name */
    public int f9269l = 0;

    /* JADX WARN: Type inference failed for: r1v5, types: [d9.a$f] */
    public z(d dVar, d9.b<O> bVar) {
        this.f9270m = dVar;
        Looper looper = dVar.D.getLooper();
        h9.c a10 = bVar.a().a();
        a.AbstractC0121a<?, O> abstractC0121a = bVar.f8859c.f8853a;
        Objects.requireNonNull(abstractC0121a, "null reference");
        ?? a11 = abstractC0121a.a(bVar.f8857a, looper, a10, bVar.d, this, this);
        String str = bVar.f8858b;
        if (str != null && (a11 instanceof h9.b)) {
            ((h9.b) a11).setAttributionTag(str);
        }
        if (str != null && (a11 instanceof h)) {
            Objects.requireNonNull((h) a11);
        }
        this.f9260b = a11;
        this.f9261c = bVar.f8860e;
        this.d = new p();
        this.f9264g = bVar.f8862g;
        if (a11.requiresSignIn()) {
            this.f9265h = new p0(dVar.n, dVar.D, bVar.a().a());
        } else {
            this.f9265h = null;
        }
    }

    public final c9.d a(c9.d[] dVarArr) {
        int i10;
        if (dVarArr != null) {
            if (dVarArr.length == 0) {
                return null;
            }
            c9.d[] availableFeatures = this.f9260b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new c9.d[0];
            }
            p.a aVar = new p.a(availableFeatures.length);
            for (c9.d dVar : availableFeatures) {
                aVar.put(dVar.f3868c, Long.valueOf(dVar.p0()));
            }
            for (c9.d dVar2 : dVarArr) {
                Long l10 = (Long) aVar.get(dVar2.f3868c);
                i10 = (l10 != null && l10.longValue() >= dVar2.p0()) ? i10 + 1 : 0;
                return dVar2;
            }
        }
        return null;
    }

    public final void b(c9.b bVar) {
        Iterator<y0> it = this.f9262e.iterator();
        if (!it.hasNext()) {
            this.f9262e.clear();
            return;
        }
        y0 next = it.next();
        if (h9.m.a(bVar, c9.b.n)) {
            this.f9260b.getEndpointPackageName();
        }
        Objects.requireNonNull(next);
        throw null;
    }

    public final void c(Status status) {
        h9.o.c(this.f9270m.D);
        d(status, null, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        r1.a(r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(com.google.android.gms.common.api.Status r9, java.lang.Exception r10, boolean r11) {
        /*
            r8 = this;
            r4 = r8
            e9.d r0 = r4.f9270m
            android.os.Handler r0 = r0.D
            r6 = 1
            h9.o.c(r0)
            r7 = 0
            r0 = r7
            r1 = 1
            r7 = 5
            if (r9 == 0) goto L12
            r6 = 0
            r2 = r6
            goto L14
        L12:
            r7 = 4
            r2 = 1
        L14:
            if (r10 == 0) goto L17
            goto L18
        L17:
            r0 = 1
        L18:
            if (r2 == r0) goto L48
            java.util.Queue<e9.x0> r0 = r4.f9259a
            java.util.Iterator r7 = r0.iterator()
            r0 = r7
        L21:
            r7 = 7
        L22:
            boolean r7 = r0.hasNext()
            r1 = r7
            if (r1 == 0) goto L47
            java.lang.Object r1 = r0.next()
            e9.x0 r1 = (e9.x0) r1
            if (r11 == 0) goto L38
            int r2 = r1.f9257a
            r7 = 2
            r3 = r7
            if (r2 != r3) goto L21
            r7 = 7
        L38:
            if (r9 == 0) goto L3f
            r1.a(r9)
            r7 = 5
            goto L43
        L3f:
            r1.b(r10)
            r6 = 1
        L43:
            r0.remove()
            goto L22
        L47:
            return
        L48:
            r6 = 6
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Status XOR exception should be null"
            r10 = r7
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.z.d(com.google.android.gms.common.api.Status, java.lang.Exception, boolean):void");
    }

    public final void e() {
        ArrayList arrayList = new ArrayList(this.f9259a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            x0 x0Var = (x0) arrayList.get(i10);
            if (!this.f9260b.isConnected()) {
                return;
            }
            if (k(x0Var)) {
                this.f9259a.remove(x0Var);
            }
        }
    }

    public final void f() {
        n();
        b(c9.b.n);
        j();
        Iterator<j0> it = this.f9263f.values().iterator();
        while (it.hasNext()) {
            j0 next = it.next();
            if (a(next.f9212a.f9210b) != null) {
                it.remove();
            } else {
                try {
                    j<a.b, ?> jVar = next.f9212a;
                    ((l0) jVar).f9220e.f9215a.accept(this.f9260b, new ea.h<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.f9260b.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        e();
        h();
    }

    public final void g(int i10) {
        n();
        this.f9266i = true;
        p pVar = this.d;
        String lastDisconnectMessage = this.f9260b.getLastDisconnectMessage();
        Objects.requireNonNull(pVar);
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(lastDisconnectMessage);
        }
        pVar.a(true, new Status(20, sb2.toString()));
        Handler handler = this.f9270m.D;
        Message obtain = Message.obtain(handler, 9, this.f9261c);
        Objects.requireNonNull(this.f9270m);
        handler.sendMessageDelayed(obtain, 5000L);
        Handler handler2 = this.f9270m.D;
        Message obtain2 = Message.obtain(handler2, 11, this.f9261c);
        Objects.requireNonNull(this.f9270m);
        handler2.sendMessageDelayed(obtain2, 120000L);
        this.f9270m.f9174u.f10292a.clear();
        for (j0 j0Var : this.f9263f.values()) {
            j0Var.f9214c.run();
        }
    }

    public final void h() {
        this.f9270m.D.removeMessages(12, this.f9261c);
        Handler handler = this.f9270m.D;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.f9261c), this.f9270m.f9169c);
    }

    public final void i(x0 x0Var) {
        x0Var.d(this.d, s());
        try {
            x0Var.c(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f9260b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void j() {
        if (this.f9266i) {
            this.f9270m.D.removeMessages(11, this.f9261c);
            this.f9270m.D.removeMessages(9, this.f9261c);
            this.f9266i = false;
        }
    }

    public final boolean k(x0 x0Var) {
        if (!(x0Var instanceof f0)) {
            i(x0Var);
            return true;
        }
        f0 f0Var = (f0) x0Var;
        c9.d a10 = a(f0Var.g(this));
        if (a10 == null) {
            i(x0Var);
            return true;
        }
        String name = this.f9260b.getClass().getName();
        String str = a10.f3868c;
        long p02 = a10.p0();
        StringBuilder sb2 = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
        android.support.v4.media.a.o(sb2, name, " could not execute call because it requires feature (", str, ", ");
        sb2.append(p02);
        sb2.append(").");
        Log.w("GoogleApiManager", sb2.toString());
        if (!this.f9270m.E || !f0Var.f(this)) {
            f0Var.b(new UnsupportedApiCallException(a10));
            return true;
        }
        a0 a0Var = new a0(this.f9261c, a10);
        int indexOf = this.f9267j.indexOf(a0Var);
        if (indexOf >= 0) {
            a0 a0Var2 = this.f9267j.get(indexOf);
            this.f9270m.D.removeMessages(15, a0Var2);
            Handler handler = this.f9270m.D;
            Message obtain = Message.obtain(handler, 15, a0Var2);
            Objects.requireNonNull(this.f9270m);
            handler.sendMessageDelayed(obtain, 5000L);
        } else {
            this.f9267j.add(a0Var);
            Handler handler2 = this.f9270m.D;
            Message obtain2 = Message.obtain(handler2, 15, a0Var);
            Objects.requireNonNull(this.f9270m);
            handler2.sendMessageDelayed(obtain2, 5000L);
            Handler handler3 = this.f9270m.D;
            Message obtain3 = Message.obtain(handler3, 16, a0Var);
            Objects.requireNonNull(this.f9270m);
            handler3.sendMessageDelayed(obtain3, 120000L);
            c9.b bVar = new c9.b(2, null);
            if (!l(bVar)) {
                this.f9270m.c(bVar, this.f9264g);
            }
        }
        return false;
    }

    public final boolean l(c9.b bVar) {
        synchronized (d.H) {
            d dVar = this.f9270m;
            if (dVar.A == null || !dVar.B.contains(this.f9261c)) {
                return false;
            }
            q qVar = this.f9270m.A;
            int i10 = this.f9264g;
            Objects.requireNonNull(qVar);
            z0 z0Var = new z0(bVar, i10);
            if (qVar.f9167j.compareAndSet(null, z0Var)) {
                qVar.f9168m.post(new b1(qVar, z0Var));
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(boolean r8) {
        /*
            r7 = this;
            r4 = r7
            e9.d r0 = r4.f9270m
            r6 = 5
            android.os.Handler r0 = r0.D
            r6 = 6
            h9.o.c(r0)
            d9.a$f r0 = r4.f9260b
            r6 = 1
            boolean r0 = r0.isConnected()
            r1 = 0
            r6 = 3
            if (r0 == 0) goto L51
            java.util.Map<e9.g$a<?>, e9.j0> r0 = r4.f9263f
            int r6 = r0.size()
            r0 = r6
            if (r0 != 0) goto L51
            r6 = 7
            e9.p r0 = r4.d
            r6 = 5
            java.util.Map<com.google.android.gms.common.api.internal.BasePendingResult<?>, java.lang.Boolean> r2 = r0.f9234a
            boolean r6 = r2.isEmpty()
            r2 = r6
            r6 = 1
            r3 = r6
            if (r2 == 0) goto L3c
            r6 = 2
            java.util.Map<ea.h<?>, java.lang.Boolean> r0 = r0.f9235b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L38
            r6 = 2
            goto L3c
        L38:
            r6 = 7
            r6 = 0
            r0 = r6
            goto L3e
        L3c:
            r0 = 1
            r6 = 5
        L3e:
            if (r0 == 0) goto L48
            r6 = 7
            if (r8 == 0) goto L47
            r6 = 6
            r4.h()
        L47:
            return r1
        L48:
            d9.a$f r8 = r4.f9260b
            java.lang.String r6 = "Timing out service connection."
            r0 = r6
            r8.disconnect(r0)
            return r3
        L51:
            r6 = 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e9.z.m(boolean):boolean");
    }

    public final void n() {
        h9.o.c(this.f9270m.D);
        this.f9268k = null;
    }

    public final void o() {
        h9.o.c(this.f9270m.D);
        if (this.f9260b.isConnected() || this.f9260b.isConnecting()) {
            return;
        }
        try {
            d dVar = this.f9270m;
            int a10 = dVar.f9174u.a(dVar.n, this.f9260b);
            if (a10 != 0) {
                c9.b bVar = new c9.b(a10, null);
                String name = this.f9260b.getClass().getName();
                String bVar2 = bVar.toString();
                StringBuilder sb2 = new StringBuilder(name.length() + 35 + bVar2.length());
                sb2.append("The service for ");
                sb2.append(name);
                sb2.append(" is not available: ");
                sb2.append(bVar2);
                Log.w("GoogleApiManager", sb2.toString());
                q(bVar, null);
                return;
            }
            d dVar2 = this.f9270m;
            a.f fVar = this.f9260b;
            c0 c0Var = new c0(dVar2, fVar, this.f9261c);
            if (fVar.requiresSignIn()) {
                p0 p0Var = this.f9265h;
                Objects.requireNonNull(p0Var, "null reference");
                ba.d dVar3 = p0Var.f9241f;
                if (dVar3 != null) {
                    ((h9.b) dVar3).disconnect();
                }
                p0Var.f9240e.f10288h = Integer.valueOf(System.identityHashCode(p0Var));
                a.AbstractC0121a<? extends ba.d, ba.a> abstractC0121a = p0Var.f9239c;
                Context context = p0Var.f9237a;
                Looper looper = p0Var.f9238b.getLooper();
                h9.c cVar = p0Var.f9240e;
                p0Var.f9241f = abstractC0121a.a(context, looper, cVar, cVar.f10287g, p0Var, p0Var);
                p0Var.f9242g = c0Var;
                Set<Scope> set = p0Var.d;
                if (set != null && !set.isEmpty()) {
                    ca.a aVar = (ca.a) p0Var.f9241f;
                    Objects.requireNonNull(aVar);
                    aVar.connect(new b.d());
                }
                p0Var.f9238b.post(new a9.p(p0Var, 1));
            }
            try {
                this.f9260b.connect(c0Var);
            } catch (SecurityException e10) {
                q(new c9.b(10), e10);
            }
        } catch (IllegalStateException e11) {
            q(new c9.b(10), e11);
        }
    }

    @Override // e9.c
    public final void onConnected(Bundle bundle) {
        if (Looper.myLooper() == this.f9270m.D.getLooper()) {
            f();
        } else {
            this.f9270m.D.post(new v(this));
        }
    }

    @Override // e9.i
    public final void onConnectionFailed(c9.b bVar) {
        q(bVar, null);
    }

    @Override // e9.c
    public final void onConnectionSuspended(int i10) {
        if (Looper.myLooper() == this.f9270m.D.getLooper()) {
            g(i10);
        } else {
            this.f9270m.D.post(new w(this, i10));
        }
    }

    public final void p(x0 x0Var) {
        h9.o.c(this.f9270m.D);
        if (this.f9260b.isConnected()) {
            if (k(x0Var)) {
                h();
                return;
            } else {
                this.f9259a.add(x0Var);
                return;
            }
        }
        this.f9259a.add(x0Var);
        c9.b bVar = this.f9268k;
        if (bVar == null || !bVar.p0()) {
            o();
        } else {
            q(this.f9268k, null);
        }
    }

    public final void q(c9.b bVar, Exception exc) {
        ba.d dVar;
        h9.o.c(this.f9270m.D);
        p0 p0Var = this.f9265h;
        if (p0Var != null && (dVar = p0Var.f9241f) != null) {
            ((h9.b) dVar).disconnect();
        }
        n();
        this.f9270m.f9174u.f10292a.clear();
        b(bVar);
        if ((this.f9260b instanceof j9.d) && bVar.f3858f != 24) {
            d dVar2 = this.f9270m;
            dVar2.f9170f = true;
            Handler handler = dVar2.D;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000L);
        }
        if (bVar.f3858f == 4) {
            c(d.G);
        } else if (this.f9259a.isEmpty()) {
            this.f9268k = bVar;
        } else if (exc != null) {
            h9.o.c(this.f9270m.D);
            d(null, exc, false);
        } else if (!this.f9270m.E) {
            Status d = d.d(this.f9261c, bVar);
            h9.o.c(this.f9270m.D);
            d(d, null, false);
        } else {
            d(d.d(this.f9261c, bVar), null, true);
            if (!this.f9259a.isEmpty() && !l(bVar)) {
                if (!this.f9270m.c(bVar, this.f9264g)) {
                    if (bVar.f3858f == 18) {
                        this.f9266i = true;
                    }
                    if (this.f9266i) {
                        Handler handler2 = this.f9270m.D;
                        Message obtain = Message.obtain(handler2, 9, this.f9261c);
                        Objects.requireNonNull(this.f9270m);
                        handler2.sendMessageDelayed(obtain, 5000L);
                        return;
                    }
                    Status d10 = d.d(this.f9261c, bVar);
                    h9.o.c(this.f9270m.D);
                    d(d10, null, false);
                }
            }
        }
    }

    public final void r() {
        h9.o.c(this.f9270m.D);
        Status status = d.F;
        c(status);
        p pVar = this.d;
        Objects.requireNonNull(pVar);
        pVar.a(false, status);
        for (g.a aVar : (g.a[]) this.f9263f.keySet().toArray(new g.a[0])) {
            p(new w0(aVar, new ea.h()));
        }
        b(new c9.b(4));
        if (this.f9260b.isConnected()) {
            this.f9260b.onUserSignOut(new y(this));
        }
    }

    public final boolean s() {
        return this.f9260b.requiresSignIn();
    }
}
