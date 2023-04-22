package ue;

import bf.l;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import pe.a0;
import pe.o;
import pe.q;
import pe.r;
import pe.u;
import pe.x;
import pe.y;

/* loaded from: classes3.dex */
public final class a implements q {

    /* renamed from: a  reason: collision with root package name */
    public final pe.j f15877a;

    public a(pe.j cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f15877a = cookieJar;
    }

    @Override // pe.q
    public y a(q.a chain) {
        boolean z10;
        a0 a0Var;
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        u uVar = gVar.f15888f;
        Objects.requireNonNull(uVar);
        u.a aVar = new u.a(uVar);
        x xVar = uVar.f14051e;
        if (xVar != null) {
            r b10 = xVar.b();
            if (b10 != null) {
                aVar.c("Content-Type", b10.f14005a);
            }
            long a10 = xVar.a();
            if (a10 != -1) {
                aVar.c("Content-Length", String.valueOf(a10));
                aVar.e("Transfer-Encoding");
            } else {
                aVar.c("Transfer-Encoding", "chunked");
                aVar.e("Content-Length");
            }
        }
        int i10 = 0;
        if (uVar.b("Host") == null) {
            aVar.c("Host", qe.c.u(uVar.f14049b, false));
        }
        if (uVar.b("Connection") == null) {
            aVar.c("Connection", "Keep-Alive");
        }
        if (uVar.b("Accept-Encoding") == null && uVar.b("Range") == null) {
            aVar.c("Accept-Encoding", "gzip");
            z10 = true;
        } else {
            z10 = false;
        }
        List<pe.i> a11 = this.f15877a.a(uVar.f14049b);
        if (!a11.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            for (Object obj : a11) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                pe.i iVar = (pe.i) obj;
                if (i10 > 0) {
                    sb2.append("; ");
                }
                sb2.append(iVar.f13962a);
                sb2.append('=');
                sb2.append(iVar.f13963b);
                i10 = i11;
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
            aVar.c("Cookie", sb3);
        }
        if (uVar.b("User-Agent") == null) {
            aVar.c("User-Agent", "okhttp/4.9.1");
        }
        y c10 = gVar.c(aVar.a());
        e.b(this.f15877a, uVar.f14049b, c10.f14066t);
        y.a aVar2 = new y.a(c10);
        aVar2.g(uVar);
        if (z10 && StringsKt.equals("gzip", y.d(c10, "Content-Encoding", null, 2), true) && e.a(c10) && (a0Var = c10.f14067u) != null) {
            l lVar = new l(a0Var.f());
            o.a g10 = c10.f14066t.g();
            g10.d("Content-Encoding");
            g10.d("Content-Length");
            aVar2.d(g10.c());
            aVar2.f14075g = new h(y.d(c10, "Content-Type", null, 2), -1L, cb.e.o(lVar));
        }
        return aVar2.a();
    }
}
