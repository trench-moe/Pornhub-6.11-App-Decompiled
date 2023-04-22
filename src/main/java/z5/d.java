package z5;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.SingleRequest;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public class d<R> implements Future, a6.g, e<R> {
    public static final a y = new a();

    /* renamed from: c  reason: collision with root package name */
    public final int f21793c;

    /* renamed from: f  reason: collision with root package name */
    public final int f21794f;

    /* renamed from: j  reason: collision with root package name */
    public R f21795j;

    /* renamed from: m  reason: collision with root package name */
    public c f21796m;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public boolean f21797t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f21798u;

    /* renamed from: w  reason: collision with root package name */
    public GlideException f21799w;

    /* loaded from: classes2.dex */
    public static class a {
    }

    public d(int i10, int i11) {
        this.f21793c = i10;
        this.f21794f = i11;
    }

    @Override // a6.g
    public void a(a6.f fVar) {
    }

    @Override // z5.e
    public synchronized boolean b(R r10, Object obj, a6.g<R> gVar, DataSource dataSource, boolean z10) {
        this.f21797t = true;
        this.f21795j = r10;
        notifyAll();
        return false;
    }

    @Override // a6.g
    public void c(a6.f fVar) {
        ((SingleRequest) fVar).b(this.f21793c, this.f21794f);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.n = true;
            notifyAll();
            c cVar = null;
            if (z10) {
                c cVar2 = this.f21796m;
                this.f21796m = null;
                cVar = cVar2;
            }
            if (cVar != null) {
                cVar.clear();
            }
            return true;
        }
    }

    @Override // a6.g
    public synchronized void d(R r10, b6.b<? super R> bVar) {
    }

    @Override // w5.i
    public void e() {
    }

    @Override // a6.g
    public synchronized void f(Drawable drawable) {
    }

    @Override // w5.i
    public void g() {
    }

    @Override // java.util.concurrent.Future
    public R get() {
        try {
            return n(null);
        } catch (TimeoutException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // java.util.concurrent.Future
    public R get(long j10, TimeUnit timeUnit) {
        return n(Long.valueOf(timeUnit.toMillis(j10)));
    }

    @Override // a6.g
    public synchronized void h(c cVar) {
        this.f21796m = cVar;
    }

    @Override // a6.g
    public void i(Drawable drawable) {
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.n;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        boolean z10;
        if (!this.n && !this.f21797t) {
            if (!this.f21798u) {
                z10 = false;
            }
        }
        z10 = true;
        return z10;
    }

    @Override // a6.g
    public synchronized c j() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.f21796m;
    }

    @Override // a6.g
    public void k(Drawable drawable) {
    }

    @Override // z5.e
    public synchronized boolean l(GlideException glideException, Object obj, a6.g<R> gVar, boolean z10) {
        this.f21798u = true;
        this.f21799w = glideException;
        notifyAll();
        return false;
    }

    @Override // w5.i
    public void m() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final synchronized R n(java.lang.Long r9) {
        /*
            Method dump skipped, instructions count: 188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.d.n(java.lang.Long):java.lang.Object");
    }

    public String toString() {
        c cVar;
        String str;
        String m10 = android.support.v4.media.b.m(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            cVar = null;
            if (this.n) {
                str = "CANCELLED";
            } else if (this.f21798u) {
                str = "FAILURE";
            } else if (this.f21797t) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                cVar = this.f21796m;
            }
        }
        if (cVar != null) {
            return m10 + str + ", request=[" + cVar + "]]";
        }
        return android.support.v4.media.b.j(m10, str, "]");
    }
}
