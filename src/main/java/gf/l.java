package gf;

import gf.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Handshake;
import okhttp3.Protocol;
import pe.a0;
import pe.d;
import pe.n;
import pe.o;
import pe.p;
import pe.s;
import pe.u;
import pe.y;

/* loaded from: classes2.dex */
public final class l<T> implements gf.b<T> {

    /* renamed from: c  reason: collision with root package name */
    public final s f9971c;

    /* renamed from: f  reason: collision with root package name */
    public final Object[] f9972f;

    /* renamed from: j  reason: collision with root package name */
    public final d.a f9973j;

    /* renamed from: m  reason: collision with root package name */
    public final f<a0, T> f9974m;
    public volatile boolean n;

    /* renamed from: t  reason: collision with root package name */
    public pe.d f9975t;

    /* renamed from: u  reason: collision with root package name */
    public Throwable f9976u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f9977w;

    /* loaded from: classes2.dex */
    public class a implements pe.e {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ d f9978a;

        public a(d dVar) {
            this.f9978a = dVar;
        }

        public void a(pe.d dVar, IOException iOException) {
            try {
                this.f9978a.a(l.this, iOException);
            } catch (Throwable th) {
                retrofit2.b.o(th);
                th.printStackTrace();
            }
        }

        public void b(pe.d dVar, y yVar) {
            try {
                try {
                    this.f9978a.b(l.this, l.this.c(yVar));
                } catch (Throwable th) {
                    retrofit2.b.o(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                retrofit2.b.o(th2);
                try {
                    this.f9978a.a(l.this, th2);
                } catch (Throwable th3) {
                    retrofit2.b.o(th3);
                    th3.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends a0 {

        /* renamed from: c  reason: collision with root package name */
        public final a0 f9980c;

        /* renamed from: f  reason: collision with root package name */
        public final bf.h f9981f;

        /* renamed from: j  reason: collision with root package name */
        public IOException f9982j;

        /* loaded from: classes2.dex */
        public class a extends bf.j {
            public a(bf.y yVar) {
                super(yVar);
            }

            @Override // bf.y
            public long O(bf.f sink, long j10) {
                try {
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    return this.f3672c.O(sink, j10);
                } catch (IOException e10) {
                    b.this.f9982j = e10;
                    throw e10;
                }
            }
        }

        public b(a0 a0Var) {
            this.f9980c = a0Var;
            this.f9981f = cb.e.o(new a(a0Var.f()));
        }

        @Override // pe.a0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f9980c.close();
        }

        @Override // pe.a0
        public long d() {
            return this.f9980c.d();
        }

        @Override // pe.a0
        public pe.r e() {
            return this.f9980c.e();
        }

        @Override // pe.a0
        public bf.h f() {
            return this.f9981f;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends a0 {

        /* renamed from: c  reason: collision with root package name */
        public final pe.r f9984c;

        /* renamed from: f  reason: collision with root package name */
        public final long f9985f;

        public c(pe.r rVar, long j10) {
            this.f9984c = rVar;
            this.f9985f = j10;
        }

        @Override // pe.a0
        public long d() {
            return this.f9985f;
        }

        @Override // pe.a0
        public pe.r e() {
            return this.f9984c;
        }

        @Override // pe.a0
        public bf.h f() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public l(s sVar, Object[] objArr, d.a aVar, f<a0, T> fVar) {
        this.f9971c = sVar;
        this.f9972f = objArr;
        this.f9973j = aVar;
        this.f9974m = fVar;
    }

    @Override // gf.b
    public gf.b S() {
        return new l(this.f9971c, this.f9972f, this.f9973j, this.f9974m);
    }

    @Override // gf.b
    public void V(d<T> dVar) {
        pe.d dVar2;
        Throwable th;
        synchronized (this) {
            if (this.f9977w) {
                throw new IllegalStateException("Already executed.");
            }
            this.f9977w = true;
            dVar2 = this.f9975t;
            th = this.f9976u;
            if (dVar2 == null && th == null) {
                pe.d a10 = a();
                this.f9975t = a10;
                dVar2 = a10;
            }
        }
        if (th != null) {
            dVar.a(this, th);
            return;
        }
        if (this.n) {
            dVar2.cancel();
        }
        dVar2.g0(new a(dVar));
    }

    public final pe.d a() {
        pe.p a10;
        d.a aVar = this.f9973j;
        s sVar = this.f9971c;
        Object[] objArr = this.f9972f;
        p<?>[] pVarArr = sVar.f10052j;
        int length = objArr.length;
        if (length == pVarArr.length) {
            r rVar = new r(sVar.f10046c, sVar.f10045b, sVar.d, sVar.f10047e, sVar.f10048f, sVar.f10049g, sVar.f10050h, sVar.f10051i);
            if (sVar.f10053k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(objArr[i10]);
                pVarArr[i10].a(rVar, objArr[i10]);
            }
            p.a aVar2 = rVar.d;
            if (aVar2 != null) {
                a10 = aVar2.a();
            } else {
                pe.p pVar = rVar.f10033b;
                String link = rVar.f10034c;
                Objects.requireNonNull(pVar);
                Intrinsics.checkNotNullParameter(link, "link");
                p.a f10 = pVar.f(link);
                a10 = f10 != null ? f10.a() : null;
                if (a10 == null) {
                    StringBuilder m10 = a1.a.m("Malformed URL. Base: ");
                    m10.append(rVar.f10033b);
                    m10.append(", Relative: ");
                    m10.append(rVar.f10034c);
                    throw new IllegalArgumentException(m10.toString());
                }
            }
            r.a aVar3 = rVar.f10041k;
            if (aVar3 == null) {
                n.a aVar4 = rVar.f10040j;
                if (aVar4 != null) {
                    aVar3 = new pe.n(aVar4.f13979a, aVar4.f13980b);
                } else {
                    s.a aVar5 = rVar.f10039i;
                    if (aVar5 != null) {
                        if (!(!aVar5.f14018c.isEmpty())) {
                            throw new IllegalStateException("Multipart body must have at least one part.".toString());
                        }
                        aVar3 = new pe.s(aVar5.f14016a, aVar5.f14017b, qe.c.v(aVar5.f14018c));
                    } else if (rVar.f10038h) {
                        byte[] toRequestBody = new byte[0];
                        Intrinsics.checkNotNullParameter(toRequestBody, "content");
                        Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
                        long j10 = 0;
                        qe.c.c(j10, j10, j10);
                        aVar3 = new pe.w(toRequestBody, null, 0, 0);
                    }
                }
            }
            pe.r rVar2 = rVar.f10037g;
            if (rVar2 != null) {
                if (aVar3 != null) {
                    aVar3 = new r.a(aVar3, rVar2);
                } else {
                    rVar.f10036f.a("Content-Type", rVar2.f14005a);
                }
            }
            u.a aVar6 = rVar.f10035e;
            aVar6.h(a10);
            pe.o headers = rVar.f10036f.c();
            Intrinsics.checkNotNullParameter(headers, "headers");
            aVar6.f14055c = headers.g();
            aVar6.d(rVar.f10032a, aVar3);
            aVar6.f(i.class, new i(sVar.f10044a, arrayList));
            pe.d a11 = aVar.a(aVar6.a());
            Objects.requireNonNull(a11, "Call.Factory returned null.");
            return a11;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.j(a1.a.n("Argument count (", length, ") doesn't match expected count ("), pVarArr.length, ")"));
    }

    public final pe.d b() {
        pe.d dVar = this.f9975t;
        if (dVar != null) {
            return dVar;
        }
        Throwable th = this.f9976u;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            pe.d a10 = a();
            this.f9975t = a10;
            return a10;
        } catch (IOException | Error | RuntimeException e10) {
            retrofit2.b.o(e10);
            this.f9976u = e10;
            throw e10;
        }
    }

    public t<T> c(y response) {
        a0 a0Var = response.f14067u;
        Intrinsics.checkNotNullParameter(response, "response");
        pe.u uVar = response.f14062c;
        Protocol protocol = response.f14063f;
        int i10 = response.f14065m;
        String str = response.f14064j;
        Handshake handshake = response.n;
        o.a g10 = response.f14066t.g();
        y yVar = response.f14068w;
        y yVar2 = response.y;
        y yVar3 = response.f14069z;
        long j10 = response.A;
        long j11 = response.B;
        te.c cVar = response.C;
        c cVar2 = new c(a0Var.e(), a0Var.d());
        if (i10 >= 0) {
            if (uVar != null) {
                if (protocol != null) {
                    if (str != null) {
                        y yVar4 = new y(uVar, protocol, str, i10, handshake, g10.c(), cVar2, yVar, yVar2, yVar3, j10, j11, cVar);
                        int i11 = yVar4.f14065m;
                        if (i11 < 200 || i11 >= 300) {
                            try {
                                a0 a10 = retrofit2.b.a(a0Var);
                                if (yVar4.f()) {
                                    throw new IllegalArgumentException("rawResponse should not be successful response");
                                }
                                return new t<>(yVar4, null, a10);
                            } finally {
                                a0Var.close();
                            }
                        } else if (i11 == 204 || i11 == 205) {
                            a0Var.close();
                            return t.b(null, yVar4);
                        } else {
                            b bVar = new b(a0Var);
                            try {
                                return t.b(this.f9974m.a(bVar), yVar4);
                            } catch (RuntimeException e10) {
                                IOException iOException = bVar.f9982j;
                                if (iOException == null) {
                                    throw e10;
                                }
                                throw iOException;
                            }
                        }
                    }
                    throw new IllegalStateException("message == null".toString());
                }
                throw new IllegalStateException("protocol == null".toString());
            }
            throw new IllegalStateException("request == null".toString());
        }
        throw new IllegalStateException(a1.a.j("code < 0: ", i10).toString());
    }

    @Override // gf.b
    public void cancel() {
        pe.d dVar;
        this.n = true;
        synchronized (this) {
            dVar = this.f9975t;
        }
        if (dVar != null) {
            dVar.cancel();
        }
    }

    public Object clone() {
        return new l(this.f9971c, this.f9972f, this.f9973j, this.f9974m);
    }

    @Override // gf.b
    public t<T> e() {
        pe.d b10;
        synchronized (this) {
            if (this.f9977w) {
                throw new IllegalStateException("Already executed.");
            }
            this.f9977w = true;
            b10 = b();
        }
        if (this.n) {
            b10.cancel();
        }
        return c(b10.e());
    }

    @Override // gf.b
    public boolean h() {
        boolean z10 = true;
        if (this.n) {
            return true;
        }
        synchronized (this) {
            pe.d dVar = this.f9975t;
            if (dVar == null || !dVar.h()) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // gf.b
    public synchronized pe.u m() {
        try {
        } catch (IOException e10) {
            throw new RuntimeException("Unable to create request.", e10);
        }
        return b().m();
    }
}
