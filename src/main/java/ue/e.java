package ue;

import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.ByteString;
import pe.y;

@JvmName(name = "HttpHeaders")
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteString f15882a;

    /* renamed from: b  reason: collision with root package name */
    public static final ByteString f15883b;

    static {
        ByteString.a aVar = ByteString.f13728m;
        f15882a = aVar.c("\"\\");
        f15883b = aVar.c("\t ,=");
    }

    public static final boolean a(y promisesBody) {
        Intrinsics.checkNotNullParameter(promisesBody, "$this$promisesBody");
        if (Intrinsics.areEqual(promisesBody.f14062c.f14050c, "HEAD")) {
            return false;
        }
        int i10 = promisesBody.f14065m;
        return (((i10 >= 100 && i10 < 200) || i10 == 204 || i10 == 304) && qe.c.k(promisesBody) == -1 && !StringsKt.equals("chunked", y.d(promisesBody, "Transfer-Encoding", null, 2), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0245, code lost:
        if (qe.c.f14515e.matches(r0) == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0260, code lost:
        if (okhttp3.internal.publicsuffix.PublicSuffixDatabase.f13714g.a(r4) == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(pe.j r34, pe.p r35, pe.o r36) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ue.e.b(pe.j, pe.p, pe.o):void");
    }
}
