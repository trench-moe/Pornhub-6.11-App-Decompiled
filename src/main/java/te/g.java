package te;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import pe.b0;
import te.e;
import xe.h;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final long f15455a;

    /* renamed from: b  reason: collision with root package name */
    public final se.c f15456b;

    /* renamed from: c  reason: collision with root package name */
    public final a f15457c;
    public final ConcurrentLinkedQueue<okhttp3.internal.connection.a> d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15458e;

    /* loaded from: classes3.dex */
    public static final class a extends se.a {
        public a(String str) {
            super(str, true);
        }

        @Override // se.a
        public long a() {
            g gVar = g.this;
            long nanoTime = System.nanoTime();
            Iterator<okhttp3.internal.connection.a> it = gVar.d.iterator();
            okhttp3.internal.connection.a aVar = null;
            long j10 = Long.MIN_VALUE;
            int i10 = 0;
            int i11 = 0;
            while (it.hasNext()) {
                okhttp3.internal.connection.a connection = it.next();
                Intrinsics.checkNotNullExpressionValue(connection, "connection");
                synchronized (connection) {
                    if (gVar.b(connection, nanoTime) > 0) {
                        i11++;
                    } else {
                        i10++;
                        long j11 = nanoTime - connection.f13695p;
                        if (j11 > j10) {
                            Unit unit = Unit.INSTANCE;
                            aVar = connection;
                            j10 = j11;
                        } else {
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                }
            }
            long j12 = gVar.f15455a;
            if (j10 < j12 && i10 <= gVar.f15458e) {
                if (i10 > 0) {
                    return j12 - j10;
                }
                if (i11 > 0) {
                    return j12;
                }
                return -1L;
            }
            Intrinsics.checkNotNull(aVar);
            synchronized (aVar) {
                if (!aVar.f13694o.isEmpty()) {
                    return 0L;
                }
                if (aVar.f13695p + j10 != nanoTime) {
                    return 0L;
                }
                aVar.f13689i = true;
                gVar.d.remove(aVar);
                Socket socket = aVar.f13684c;
                Intrinsics.checkNotNull(socket);
                qe.c.e(socket);
                if (gVar.d.isEmpty()) {
                    gVar.f15456b.a();
                    return 0L;
                }
                return 0L;
            }
        }
    }

    public g(se.d taskRunner, int i10, long j10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.f15458e = i10;
        this.f15455a = timeUnit.toNanos(j10);
        this.f15456b = taskRunner.f();
        this.f15457c = new a(android.support.v4.media.b.m(new StringBuilder(), qe.c.f14516f, " ConnectionPool"));
        this.d = new ConcurrentLinkedQueue<>();
        if (!(j10 > 0)) {
            throw new IllegalArgumentException(android.support.v4.media.b.h("keepAliveDuration <= 0: ", j10).toString());
        }
    }

    public final boolean a(pe.a address, e call, List<b0> list, boolean z10) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Iterator<okhttp3.internal.connection.a> it = this.d.iterator();
        while (it.hasNext()) {
            okhttp3.internal.connection.a connection = it.next();
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (z10) {
                    if (!connection.j()) {
                        Unit unit = Unit.INSTANCE;
                    }
                }
                if (connection.h(address, list)) {
                    call.b(connection);
                    return true;
                }
                Unit unit2 = Unit.INSTANCE;
            }
        }
        return false;
    }

    public final int b(okhttp3.internal.connection.a aVar, long j10) {
        byte[] bArr = qe.c.f14512a;
        List<Reference<e>> list = aVar.f13694o;
        int i10 = 0;
        while (i10 < list.size()) {
            Reference<e> reference = list.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                StringBuilder m10 = a1.a.m("A connection to ");
                m10.append(aVar.f13696q.f13917a.f13906a);
                m10.append(" was leaked. ");
                m10.append("Did you forget to close a response body?");
                String sb2 = m10.toString();
                h.a aVar2 = xe.h.f18380c;
                xe.h.f18378a.k(sb2, ((e.b) reference).f15453a);
                list.remove(i10);
                aVar.f13689i = true;
                if (list.isEmpty()) {
                    aVar.f13695p = j10 - this.f15455a;
                    return 0;
                }
            }
        }
        return list.size();
    }
}
