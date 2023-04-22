package w6;

import android.os.Looper;
import android.util.Log;
import java.util.concurrent.TimeoutException;
import k8.y;

/* loaded from: classes2.dex */
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f16693a;

    /* renamed from: b  reason: collision with root package name */
    public final a f16694b;

    /* renamed from: c  reason: collision with root package name */
    public final k8.b f16695c;
    public final x0 d;

    /* renamed from: e  reason: collision with root package name */
    public int f16696e;

    /* renamed from: f  reason: collision with root package name */
    public Object f16697f;

    /* renamed from: g  reason: collision with root package name */
    public Looper f16698g;

    /* renamed from: h  reason: collision with root package name */
    public int f16699h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f16700i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f16701j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f16702k;

    /* loaded from: classes2.dex */
    public interface a {
    }

    /* loaded from: classes.dex */
    public interface b {
        void r(int i10, Object obj);
    }

    public o0(a aVar, b bVar, x0 x0Var, int i10, k8.b bVar2, Looper looper) {
        this.f16694b = aVar;
        this.f16693a = bVar;
        this.d = x0Var;
        this.f16698g = looper;
        this.f16695c = bVar2;
        this.f16699h = i10;
    }

    public synchronized boolean a(long j10) {
        boolean z10;
        k8.a.f(this.f16700i);
        k8.a.f(this.f16698g.getThread() != Thread.currentThread());
        long d = this.f16695c.d() + j10;
        while (true) {
            z10 = this.f16702k;
            if (z10 || j10 <= 0) {
                break;
            }
            this.f16695c.c();
            wait(j10);
            j10 = d - this.f16695c.d();
        }
        if (!z10) {
            throw new TimeoutException("Message delivery timed out.");
        }
        return this.f16701j;
    }

    public synchronized boolean b() {
        return false;
    }

    public synchronized void c(boolean z10) {
        try {
            this.f16701j = z10 | this.f16701j;
            this.f16702k = true;
            notifyAll();
        } catch (Throwable th) {
            throw th;
        }
    }

    public o0 d() {
        k8.a.f(!this.f16700i);
        this.f16700i = true;
        w wVar = (w) this.f16694b;
        synchronized (wVar) {
            try {
                if (!wVar.O && wVar.f16804w.isAlive()) {
                    ((y.b) wVar.f16803u.j(14, this)).b();
                }
                Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                c(false);
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public o0 e(Object obj) {
        k8.a.f(!this.f16700i);
        this.f16697f = obj;
        return this;
    }

    public o0 f(int i10) {
        k8.a.f(!this.f16700i);
        this.f16696e = i10;
        return this;
    }
}
