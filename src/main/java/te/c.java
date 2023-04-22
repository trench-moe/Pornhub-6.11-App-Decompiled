package te;

import bf.i;
import bf.j;
import bf.w;
import bf.y;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import pe.m;
import pe.u;
import pe.x;
import pe.y;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15419a;

    /* renamed from: b  reason: collision with root package name */
    public final okhttp3.internal.connection.a f15420b;

    /* renamed from: c  reason: collision with root package name */
    public final e f15421c;
    public final m d;

    /* renamed from: e  reason: collision with root package name */
    public final d f15422e;

    /* renamed from: f  reason: collision with root package name */
    public final ue.d f15423f;

    /* loaded from: classes3.dex */
    public final class a extends i {

        /* renamed from: f  reason: collision with root package name */
        public boolean f15424f;

        /* renamed from: j  reason: collision with root package name */
        public long f15425j;

        /* renamed from: m  reason: collision with root package name */
        public boolean f15426m;
        public final long n;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ c f15427t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, w delegate, long j10) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f15427t = cVar;
            this.n = j10;
        }

        public final <E extends IOException> E a(E e10) {
            if (this.f15424f) {
                return e10;
            }
            this.f15424f = true;
            return (E) this.f15427t.a(this.f15425j, false, true, e10);
        }

        @Override // bf.w, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f15426m) {
                return;
            }
            this.f15426m = true;
            long j10 = this.n;
            if (j10 != -1 && this.f15425j != j10) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                this.f3671c.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // bf.w, java.io.Flushable
        public void flush() {
            try {
                this.f3671c.flush();
            } catch (IOException e10) {
                throw a(e10);
            }
        }

        @Override // bf.w
        public void l0(bf.f source, long j10) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (!(!this.f15426m)) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.n;
            if (j11 != -1 && this.f15425j + j10 > j11) {
                StringBuilder m10 = a1.a.m("expected ");
                m10.append(this.n);
                m10.append(" bytes but received ");
                m10.append(this.f15425j + j10);
                throw new ProtocolException(m10.toString());
            }
            try {
                Intrinsics.checkNotNullParameter(source, "source");
                this.f3671c.l0(source, j10);
                this.f15425j += j10;
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    /* loaded from: classes3.dex */
    public final class b extends j {

        /* renamed from: f  reason: collision with root package name */
        public long f15428f;

        /* renamed from: j  reason: collision with root package name */
        public boolean f15429j;

        /* renamed from: m  reason: collision with root package name */
        public boolean f15430m;
        public boolean n;

        /* renamed from: t  reason: collision with root package name */
        public final long f15431t;

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ c f15432u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, y delegate, long j10) {
            super(delegate);
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f15432u = cVar;
            this.f15431t = j10;
            this.f15429j = true;
            if (j10 == 0) {
                a(null);
            }
        }

        @Override // bf.y
        public long O(bf.f sink, long j10) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (!this.n) {
                try {
                    long O = this.f3672c.O(sink, j10);
                    if (this.f15429j) {
                        this.f15429j = false;
                        c cVar = this.f15432u;
                        m mVar = cVar.d;
                        e call = cVar.f15421c;
                        Objects.requireNonNull(mVar);
                        Intrinsics.checkNotNullParameter(call, "call");
                    }
                    if (O == -1) {
                        a(null);
                        return -1L;
                    }
                    long j11 = this.f15428f + O;
                    long j12 = this.f15431t;
                    if (j12 != -1 && j11 > j12) {
                        throw new ProtocolException("expected " + this.f15431t + " bytes but received " + j11);
                    }
                    this.f15428f = j11;
                    if (j11 == j12) {
                        a(null);
                    }
                    return O;
                } catch (IOException e10) {
                    throw a(e10);
                }
            }
            throw new IllegalStateException("closed".toString());
        }

        public final <E extends IOException> E a(E e10) {
            if (this.f15430m) {
                return e10;
            }
            this.f15430m = true;
            if (e10 == null && this.f15429j) {
                this.f15429j = false;
                c cVar = this.f15432u;
                m mVar = cVar.d;
                e call = cVar.f15421c;
                Objects.requireNonNull(mVar);
                Intrinsics.checkNotNullParameter(call, "call");
            }
            return (E) this.f15432u.a(this.f15428f, true, false, e10);
        }

        @Override // bf.j, bf.y, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.n) {
                return;
            }
            this.n = true;
            try {
                this.f3672c.close();
                a(null);
            } catch (IOException e10) {
                throw a(e10);
            }
        }
    }

    public c(e call, m eventListener, d finder, ue.d codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f15421c = call;
        this.d = eventListener;
        this.f15422e = finder;
        this.f15423f = codec;
        this.f15420b = codec.f();
    }

    public final <E extends IOException> E a(long j10, boolean z10, boolean z11, E e10) {
        if (e10 != null) {
            e(e10);
        }
        if (z11) {
            if (e10 != null) {
                this.d.b(this.f15421c, e10);
            } else {
                m mVar = this.d;
                e call = this.f15421c;
                Objects.requireNonNull(mVar);
                Intrinsics.checkNotNullParameter(call, "call");
            }
        }
        if (z10) {
            if (e10 != null) {
                this.d.c(this.f15421c, e10);
            } else {
                m mVar2 = this.d;
                e call2 = this.f15421c;
                Objects.requireNonNull(mVar2);
                Intrinsics.checkNotNullParameter(call2, "call");
            }
        }
        return (E) this.f15421c.i(this, z11, z10, e10);
    }

    public final w b(u request, boolean z10) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f15419a = z10;
        x xVar = request.f14051e;
        Intrinsics.checkNotNull(xVar);
        long a10 = xVar.a();
        m mVar = this.d;
        e call = this.f15421c;
        Objects.requireNonNull(mVar);
        Intrinsics.checkNotNullParameter(call, "call");
        return new a(this, this.f15423f.h(request, a10), a10);
    }

    public final y.a c(boolean z10) {
        try {
            y.a e10 = this.f15423f.e(z10);
            if (e10 != null) {
                Intrinsics.checkNotNullParameter(this, "deferredTrailers");
                e10.f14081m = this;
            }
            return e10;
        } catch (IOException e11) {
            this.d.c(this.f15421c, e11);
            e(e11);
            throw e11;
        }
    }

    public final void d() {
        m mVar = this.d;
        e call = this.f15421c;
        Objects.requireNonNull(mVar);
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public final void e(IOException iOException) {
        this.f15422e.c(iOException);
        okhttp3.internal.connection.a f10 = this.f15423f.f();
        e call = this.f15421c;
        synchronized (f10) {
            Intrinsics.checkNotNullParameter(call, "call");
            if (iOException instanceof StreamResetException) {
                if (((StreamResetException) iOException).errorCode == ErrorCode.REFUSED_STREAM) {
                    int i10 = f10.f13693m + 1;
                    f10.f13693m = i10;
                    if (i10 > 1) {
                        f10.f13689i = true;
                        f10.f13691k++;
                    }
                } else if (((StreamResetException) iOException).errorCode != ErrorCode.CANCEL || !call.C) {
                    f10.f13689i = true;
                    f10.f13691k++;
                }
            } else if (!f10.j() || (iOException instanceof ConnectionShutdownException)) {
                f10.f13689i = true;
                if (f10.f13692l == 0) {
                    f10.d(call.F, f10.f13696q, iOException);
                    f10.f13691k++;
                }
            }
        }
    }
}
