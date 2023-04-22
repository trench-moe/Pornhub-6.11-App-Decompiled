package te;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.connection.b;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import pe.b0;
import pe.m;
import pe.p;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public b.a f15433a;

    /* renamed from: b  reason: collision with root package name */
    public okhttp3.internal.connection.b f15434b;

    /* renamed from: c  reason: collision with root package name */
    public int f15435c;
    public int d;

    /* renamed from: e  reason: collision with root package name */
    public int f15436e;

    /* renamed from: f  reason: collision with root package name */
    public b0 f15437f;

    /* renamed from: g  reason: collision with root package name */
    public final g f15438g;

    /* renamed from: h  reason: collision with root package name */
    public final pe.a f15439h;

    /* renamed from: i  reason: collision with root package name */
    public final e f15440i;

    /* renamed from: j  reason: collision with root package name */
    public final m f15441j;

    public d(g connectionPool, pe.a address, e call, m eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f15438g = connectionPool;
        this.f15439h = address;
        this.f15440i = call;
        this.f15441j = eventListener;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0319 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final okhttp3.internal.connection.a a(int r16, int r17, int r18, int r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 871
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: te.d.a(int, int, int, int, boolean, boolean):okhttp3.internal.connection.a");
    }

    public final boolean b(p url) {
        Intrinsics.checkNotNullParameter(url, "url");
        p pVar = this.f15439h.f13906a;
        return url.f13991f == pVar.f13991f && Intrinsics.areEqual(url.f13990e, pVar.f13990e);
    }

    public final void c(IOException e10) {
        Intrinsics.checkNotNullParameter(e10, "e");
        this.f15437f = null;
        if ((e10 instanceof StreamResetException) && ((StreamResetException) e10).errorCode == ErrorCode.REFUSED_STREAM) {
            this.f15435c++;
        } else if (e10 instanceof ConnectionShutdownException) {
            this.d++;
        } else {
            this.f15436e++;
        }
    }
}
