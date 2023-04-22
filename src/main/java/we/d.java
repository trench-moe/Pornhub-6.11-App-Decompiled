package we;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ErrorCode;
import okio.ByteString;
import we.l;
import xe.h;

/* loaded from: classes3.dex */
public final class d implements Closeable {
    public static final q S;
    public static final d T = null;
    public final se.c A;
    public final p B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public final q I;
    public q J;
    public long K;
    public long L;
    public long M;
    public long N;
    public final Socket O;
    public final n P;
    public final C0288d Q;
    public final Set<Integer> R;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f17493c;

    /* renamed from: f  reason: collision with root package name */
    public final c f17494f;

    /* renamed from: j  reason: collision with root package name */
    public final Map<Integer, m> f17495j;

    /* renamed from: m  reason: collision with root package name */
    public final String f17496m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public int f17497t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f17498u;

    /* renamed from: w  reason: collision with root package name */
    public final se.d f17499w;
    public final se.c y;

    /* renamed from: z  reason: collision with root package name */
    public final se.c f17500z;

    /* loaded from: classes3.dex */
    public static final class a extends se.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f17501e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ long f17502f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, d dVar, long j10) {
            super(str2, true);
            this.f17501e = dVar;
            this.f17502f = j10;
        }

        @Override // se.a
        public long a() {
            d dVar;
            boolean z10;
            synchronized (this.f17501e) {
                dVar = this.f17501e;
                long j10 = dVar.D;
                long j11 = dVar.C;
                if (j10 < j11) {
                    z10 = true;
                } else {
                    dVar.C = j11 + 1;
                    z10 = false;
                }
            }
            if (!z10) {
                dVar.k(false, 1, 0);
                return this.f17502f;
            }
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            dVar.a(errorCode, errorCode, null);
            return -1L;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Socket f17503a;

        /* renamed from: b  reason: collision with root package name */
        public String f17504b;

        /* renamed from: c  reason: collision with root package name */
        public bf.h f17505c;
        public bf.g d;

        /* renamed from: e  reason: collision with root package name */
        public c f17506e;

        /* renamed from: f  reason: collision with root package name */
        public p f17507f;

        /* renamed from: g  reason: collision with root package name */
        public int f17508g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f17509h;

        /* renamed from: i  reason: collision with root package name */
        public final se.d f17510i;

        public b(boolean z10, se.d taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f17509h = z10;
            this.f17510i = taskRunner;
            this.f17506e = c.f17511a;
            this.f17507f = p.f17598x;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class c {
        @JvmField

        /* renamed from: a  reason: collision with root package name */
        public static final c f17511a = new a();

        /* loaded from: classes3.dex */
        public static final class a extends c {
            @Override // we.d.c
            public void b(m stream) {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.c(ErrorCode.REFUSED_STREAM, null);
            }
        }

        public void a(d connection, q settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void b(m mVar);
    }

    /* renamed from: we.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C0288d implements l.b, Function0<Unit> {

        /* renamed from: c  reason: collision with root package name */
        public final l f17512c;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ d f17513f;

        /* renamed from: we.d$d$a */
        /* loaded from: classes3.dex */
        public static final class a extends se.a {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ m f17514e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ C0288d f17515f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ List f17516g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, boolean z10, String str2, boolean z11, m mVar, C0288d c0288d, m mVar2, int i10, List list, boolean z12) {
                super(str2, z11);
                this.f17514e = mVar;
                this.f17515f = c0288d;
                this.f17516g = list;
            }

            @Override // se.a
            public long a() {
                try {
                    this.f17515f.f17513f.f17494f.b(this.f17514e);
                    return -1L;
                } catch (IOException e10) {
                    h.a aVar = xe.h.f18380c;
                    xe.h hVar = xe.h.f18378a;
                    StringBuilder m10 = a1.a.m("Http2Connection.Listener failure for ");
                    m10.append(this.f17515f.f17513f.f17496m);
                    hVar.i(m10.toString(), 4, e10);
                    try {
                        this.f17514e.c(ErrorCode.PROTOCOL_ERROR, e10);
                        return -1L;
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
            }
        }

        /* renamed from: we.d$d$b */
        /* loaded from: classes3.dex */
        public static final class b extends se.a {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ C0288d f17517e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ int f17518f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ int f17519g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, boolean z10, String str2, boolean z11, C0288d c0288d, int i10, int i11) {
                super(str2, z11);
                this.f17517e = c0288d;
                this.f17518f = i10;
                this.f17519g = i11;
            }

            @Override // se.a
            public long a() {
                this.f17517e.f17513f.k(true, this.f17518f, this.f17519g);
                return -1L;
            }
        }

        /* renamed from: we.d$d$c */
        /* loaded from: classes3.dex */
        public static final class c extends se.a {

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ C0288d f17520e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ boolean f17521f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ q f17522g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str, boolean z10, String str2, boolean z11, C0288d c0288d, boolean z12, q qVar) {
                super(str2, z11);
                this.f17520e = c0288d;
                this.f17521f = z12;
                this.f17522g = qVar;
            }

            /* JADX WARN: Can't wrap try/catch for region: R(17:7|8|(1:10)(1:58)|11|(2:16|(12:18|19|20|21|22|23|24|25|26|27|28|(4:30|(3:32|f4|40)|45|46)(1:47))(2:55|56))|57|19|20|21|22|23|24|25|26|27|28|(0)(0)) */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00da, code lost:
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00db, code lost:
                r2 = r13.f17513f;
                r3 = okhttp3.internal.http2.ErrorCode.PROTOCOL_ERROR;
                r2.a(r3, r3, r0);
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00eb  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x010c A[ORIG_RETURN, RETURN] */
            /* JADX WARN: Type inference failed for: r3v1, types: [T, we.q] */
            /* JADX WARN: Type inference failed for: r3v15 */
            /* JADX WARN: Type inference failed for: r3v16 */
            @Override // se.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public long a() {
                /*
                    Method dump skipped, instructions count: 287
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: we.d.C0288d.c.a():long");
            }
        }

        public C0288d(d dVar, l reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f17513f = dVar;
            this.f17512c = reader;
        }

        @Override // we.l.b
        public void a() {
        }

        @Override // we.l.b
        public void b(boolean z10, int i10, int i11, List<we.a> requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "headerBlock");
            if (this.f17513f.d(i10)) {
                d dVar = this.f17513f;
                Objects.requireNonNull(dVar);
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                String str = dVar.f17496m + '[' + i10 + "] onHeaders";
                dVar.f17500z.c(new g(str, true, str, true, dVar, i10, requestHeaders, z10), 0L);
                return;
            }
            synchronized (this.f17513f) {
                m c10 = this.f17513f.c(i10);
                if (c10 != null) {
                    Unit unit = Unit.INSTANCE;
                    c10.j(qe.c.t(requestHeaders), z10);
                    return;
                }
                d dVar2 = this.f17513f;
                if (dVar2.f17498u) {
                    return;
                }
                if (i10 <= dVar2.n) {
                    return;
                }
                if (i10 % 2 == dVar2.f17497t % 2) {
                    return;
                }
                m mVar = new m(i10, this.f17513f, false, z10, qe.c.t(requestHeaders));
                d dVar3 = this.f17513f;
                dVar3.n = i10;
                dVar3.f17495j.put(Integer.valueOf(i10), mVar);
                String str2 = this.f17513f.f17496m + '[' + i10 + "] onStream";
                this.f17513f.f17499w.f().c(new a(str2, true, str2, true, mVar, this, c10, i10, requestHeaders, z10), 0L);
            }
        }

        @Override // we.l.b
        public void c(int i10, long j10) {
            if (i10 == 0) {
                synchronized (this.f17513f) {
                    d dVar = this.f17513f;
                    dVar.N += j10;
                    dVar.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            m c10 = this.f17513f.c(i10);
            if (c10 != null) {
                synchronized (c10) {
                    c10.d += j10;
                    if (j10 > 0) {
                        c10.notifyAll();
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }

        @Override // we.l.b
        public void d(boolean z10, q settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            se.c cVar = this.f17513f.y;
            String m10 = android.support.v4.media.b.m(new StringBuilder(), this.f17513f.f17496m, " applyAndAckSettings");
            cVar.c(new c(m10, true, m10, true, this, z10, settings), 0L);
        }

        /* JADX WARN: Code restructure failed: missing block: B:42:0x00f3, code lost:
            throw new java.lang.NullPointerException("null cannot be cast to non-null type java.lang.Object");
         */
        @Override // we.l.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void e(boolean r18, int r19, bf.h r20, int r21) {
            /*
                Method dump skipped, instructions count: 274
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: we.d.C0288d.e(boolean, int, bf.h, int):void");
        }

        @Override // we.l.b
        public void f(boolean z10, int i10, int i11) {
            if (!z10) {
                se.c cVar = this.f17513f.y;
                String m10 = android.support.v4.media.b.m(new StringBuilder(), this.f17513f.f17496m, " ping");
                cVar.c(new b(m10, true, m10, true, this, i10, i11), 0L);
                return;
            }
            synchronized (this.f17513f) {
                if (i10 == 1) {
                    this.f17513f.D++;
                } else if (i10 != 2) {
                    if (i10 == 3) {
                        d dVar = this.f17513f;
                        dVar.G++;
                        dVar.notifyAll();
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    this.f17513f.F++;
                }
            }
        }

        @Override // we.l.b
        public void g(int i10, int i11, int i12, boolean z10) {
        }

        @Override // we.l.b
        public void h(int i10, ErrorCode errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (!this.f17513f.d(i10)) {
                m e10 = this.f17513f.e(i10);
                if (e10 != null) {
                    e10.k(errorCode);
                    return;
                }
                return;
            }
            d dVar = this.f17513f;
            Objects.requireNonNull(dVar);
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            String str = dVar.f17496m + '[' + i10 + "] onReset";
            dVar.f17500z.c(new i(str, true, str, true, dVar, i10, errorCode), 0L);
        }

        @Override // we.l.b
        public void i(int i10, int i11, List<we.a> requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            d dVar = this.f17513f;
            Objects.requireNonNull(dVar);
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            synchronized (dVar) {
                if (dVar.R.contains(Integer.valueOf(i11))) {
                    dVar.m(i11, ErrorCode.PROTOCOL_ERROR);
                    return;
                }
                dVar.R.add(Integer.valueOf(i11));
                String str = dVar.f17496m + '[' + i11 + "] onRequest";
                dVar.f17500z.c(new h(str, true, str, true, dVar, i11, requestHeaders), 0L);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [okhttp3.internal.http2.ErrorCode] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.Unit] */
        @Override // kotlin.jvm.functions.Function0
        public Unit invoke() {
            Throwable th;
            ErrorCode errorCode;
            ErrorCode errorCode2;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            IOException e10 = null;
            try {
                try {
                    this.f17512c.d(this);
                    while (this.f17512c.c(false, this)) {
                    }
                    errorCode2 = ErrorCode.NO_ERROR;
                } catch (IOException e11) {
                    e10 = e11;
                } catch (Throwable th2) {
                    th = th2;
                    errorCode = errorCode3;
                    this.f17513f.a(errorCode, errorCode3, e10);
                    qe.c.d(this.f17512c);
                    throw th;
                }
                try {
                    this.f17513f.a(errorCode2, ErrorCode.CANCEL, null);
                    errorCode = errorCode2;
                } catch (IOException e12) {
                    e10 = e12;
                    ErrorCode errorCode4 = ErrorCode.PROTOCOL_ERROR;
                    d dVar = this.f17513f;
                    dVar.a(errorCode4, errorCode4, e10);
                    errorCode = dVar;
                    qe.c.d(this.f17512c);
                    errorCode3 = Unit.INSTANCE;
                    return errorCode3;
                }
                qe.c.d(this.f17512c);
                errorCode3 = Unit.INSTANCE;
                return errorCode3;
            } catch (Throwable th3) {
                th = th3;
                this.f17513f.a(errorCode, errorCode3, e10);
                qe.c.d(this.f17512c);
                throw th;
            }
        }

        @Override // we.l.b
        public void j(int i10, ErrorCode errorCode, ByteString debugData) {
            int i11;
            m[] mVarArr;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.f();
            synchronized (this.f17513f) {
                Object[] array = this.f17513f.f17495j.values().toArray(new m[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                mVarArr = (m[]) array;
                this.f17513f.f17498u = true;
                Unit unit = Unit.INSTANCE;
            }
            for (m mVar : mVarArr) {
                if (mVar.f17575m > i10 && mVar.h()) {
                    mVar.k(ErrorCode.REFUSED_STREAM);
                    this.f17513f.e(mVar.f17575m);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends se.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f17523e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f17524f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ ErrorCode f17525g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, boolean z10, String str2, boolean z11, d dVar, int i10, ErrorCode errorCode) {
            super(str2, z11);
            this.f17523e = dVar;
            this.f17524f = i10;
            this.f17525g = errorCode;
        }

        @Override // se.a
        public long a() {
            try {
                d dVar = this.f17523e;
                int i10 = this.f17524f;
                ErrorCode statusCode = this.f17525g;
                Objects.requireNonNull(dVar);
                Intrinsics.checkNotNullParameter(statusCode, "statusCode");
                dVar.P.i(i10, statusCode);
                return -1L;
            } catch (IOException e10) {
                d dVar2 = this.f17523e;
                ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                dVar2.a(errorCode, errorCode, e10);
                return -1L;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class f extends se.a {

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ d f17526e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f17527f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ long f17528g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, boolean z10, String str2, boolean z11, d dVar, int i10, long j10) {
            super(str2, z11);
            this.f17526e = dVar;
            this.f17527f = i10;
            this.f17528g = j10;
        }

        @Override // se.a
        public long a() {
            try {
                this.f17526e.P.k(this.f17527f, this.f17528g);
                return -1L;
            } catch (IOException e10) {
                d dVar = this.f17526e;
                ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                dVar.a(errorCode, errorCode, e10);
                return -1L;
            }
        }
    }

    static {
        q qVar = new q();
        qVar.c(7, 65535);
        qVar.c(5, 16384);
        S = qVar;
    }

    public d(b builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean z10 = builder.f17509h;
        this.f17493c = z10;
        this.f17494f = builder.f17506e;
        this.f17495j = new LinkedHashMap();
        String str = builder.f17504b;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
        }
        this.f17496m = str;
        this.f17497t = builder.f17509h ? 3 : 2;
        se.d dVar = builder.f17510i;
        this.f17499w = dVar;
        se.c f10 = dVar.f();
        this.y = f10;
        this.f17500z = dVar.f();
        this.A = dVar.f();
        this.B = builder.f17507f;
        q qVar = new q();
        if (builder.f17509h) {
            qVar.c(7, 16777216);
        }
        Unit unit = Unit.INSTANCE;
        this.I = qVar;
        q qVar2 = S;
        this.J = qVar2;
        this.N = qVar2.a();
        Socket socket = builder.f17503a;
        if (socket == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
        }
        this.O = socket;
        bf.g gVar = builder.d;
        if (gVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sink");
        }
        this.P = new n(gVar, z10);
        bf.h hVar = builder.f17505c;
        if (hVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("source");
        }
        this.Q = new C0288d(this, new l(hVar, z10));
        this.R = new LinkedHashSet();
        int i10 = builder.f17508g;
        if (i10 != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i10);
            String l10 = a1.a.l(str, " ping");
            f10.c(new a(l10, l10, this, nanos), nanos);
        }
    }

    public final void a(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) {
        int i10;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        byte[] bArr = qe.c.f14512a;
        try {
            f(connectionCode);
        } catch (IOException unused) {
        }
        m[] mVarArr = null;
        synchronized (this) {
            if (!this.f17495j.isEmpty()) {
                Object[] array = this.f17495j.values().toArray(new m[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                mVarArr = (m[]) array;
                this.f17495j.clear();
            }
            Unit unit = Unit.INSTANCE;
        }
        if (mVarArr != null) {
            for (m mVar : mVarArr) {
                try {
                    mVar.c(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.P.close();
        } catch (IOException unused3) {
        }
        try {
            this.O.close();
        } catch (IOException unused4) {
        }
        this.y.e();
        this.f17500z.e();
        this.A.e();
    }

    public final synchronized m c(int i10) {
        return this.f17495j.get(Integer.valueOf(i10));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final boolean d(int i10) {
        return i10 != 0 && (i10 & 1) == 0;
    }

    public final synchronized m e(int i10) {
        m remove;
        remove = this.f17495j.remove(Integer.valueOf(i10));
        notifyAll();
        return remove;
    }

    public final void f(ErrorCode statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.P) {
            synchronized (this) {
                if (this.f17498u) {
                    return;
                }
                this.f17498u = true;
                int i10 = this.n;
                Unit unit = Unit.INSTANCE;
                this.P.e(i10, statusCode, qe.c.f14512a);
            }
        }
    }

    public final synchronized void h(long j10) {
        long j11 = this.K + j10;
        this.K = j11;
        long j12 = j11 - this.L;
        if (j12 >= this.I.a() / 2) {
            n(0, j12);
            this.L += j12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        throw new java.io.IOException("stream closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r5 - r3), r8.P.f17588f);
        r6 = r3;
        r8.M += r6;
        r4 = kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r9, boolean r10, bf.f r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            we.n r12 = r8.P
            r12.c(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L6a
            monitor-enter(r8)
        L12:
            long r3 = r8.M     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            long r5 = r8.N     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L32
            java.util.Map<java.lang.Integer, we.m> r3 = r8.f17495j     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            if (r3 == 0) goto L2a
            r8.wait()     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            goto L12
        L2a:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
            throw r9     // Catch: java.lang.Throwable -> L59 java.lang.InterruptedException -> L5b
        L32:
            long r5 = r5 - r3
            long r3 = java.lang.Math.min(r12, r5)     // Catch: java.lang.Throwable -> L59
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L59
            we.n r3 = r8.P     // Catch: java.lang.Throwable -> L59
            int r3 = r3.f17588f     // Catch: java.lang.Throwable -> L59
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L59
            long r4 = r8.M     // Catch: java.lang.Throwable -> L59
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L59
            long r4 = r4 + r6
            r8.M = r4     // Catch: java.lang.Throwable -> L59
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L59
            monitor-exit(r8)
            long r12 = r12 - r6
            we.n r4 = r8.P
            if (r10 == 0) goto L54
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = 0
        L55:
            r4.c(r5, r9, r11, r3)
            goto Ld
        L59:
            r9 = move-exception
            goto L68
        L5b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L59
            r9.interrupt()     // Catch: java.lang.Throwable -> L59
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L59
            r9.<init>()     // Catch: java.lang.Throwable -> L59
            throw r9     // Catch: java.lang.Throwable -> L59
        L68:
            monitor-exit(r8)
            throw r9
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: we.d.i(int, boolean, bf.f, long):void");
    }

    public final void k(boolean z10, int i10, int i11) {
        try {
            this.P.h(z10, i10, i11);
        } catch (IOException e10) {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            a(errorCode, errorCode, e10);
        }
    }

    public final void m(int i10, ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        String str = this.f17496m + '[' + i10 + "] writeSynReset";
        this.y.c(new e(str, true, str, true, this, i10, errorCode), 0L);
    }

    public final void n(int i10, long j10) {
        String str = this.f17496m + '[' + i10 + "] windowUpdate";
        this.y.c(new f(str, true, str, true, this, i10, j10), 0L);
    }
}
