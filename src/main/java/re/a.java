package re;

import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Handshake;
import okhttp3.Protocol;
import pe.a0;
import pe.o;
import pe.q;
import pe.u;
import pe.y;
import te.c;
import te.e;
import ue.g;

/* loaded from: classes3.dex */
public final class a implements q {

    /* renamed from: a  reason: collision with root package name */
    public static final C0256a f14759a = new C0256a(null);

    /* renamed from: re.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0256a {
        public C0256a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final y a(C0256a c0256a, y response) {
            if ((response != null ? response.f14067u : null) != null) {
                Objects.requireNonNull(response);
                Intrinsics.checkNotNullParameter(response, "response");
                u uVar = response.f14062c;
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
                c cVar = response.C;
                if (i10 >= 0) {
                    if (uVar != null) {
                        if (protocol != null) {
                            if (str != null) {
                                return new y(uVar, protocol, str, i10, handshake, g10.c(), null, yVar, yVar2, yVar3, j10, j11, cVar);
                            }
                            throw new IllegalStateException("message == null".toString());
                        }
                        throw new IllegalStateException("protocol == null".toString());
                    }
                    throw new IllegalStateException("request == null".toString());
                }
                throw new IllegalStateException(a1.a.j("code < 0: ", i10).toString());
            }
            return response;
        }

        public final boolean b(String str) {
            return StringsKt.equals("Content-Length", str, true) || StringsKt.equals("Content-Encoding", str, true) || StringsKt.equals("Content-Type", str, true);
        }

        public final boolean c(String str) {
            return (StringsKt.equals("Connection", str, true) || StringsKt.equals("Keep-Alive", str, true) || StringsKt.equals("Proxy-Authenticate", str, true) || StringsKt.equals("Proxy-Authorization", str, true) || StringsKt.equals("TE", str, true) || StringsKt.equals("Trailers", str, true) || StringsKt.equals("Transfer-Encoding", str, true) || StringsKt.equals("Upgrade", str, true)) ? false : true;
        }
    }

    @Override // pe.q
    public y a(q.a chain) {
        o oVar;
        int i10;
        Intrinsics.checkNotNullParameter(chain, "chain");
        g gVar = (g) chain;
        e call = gVar.f15885b;
        System.currentTimeMillis();
        u request = gVar.f15888f;
        Intrinsics.checkNotNullParameter(request, "request");
        b bVar = new b(request, null);
        if (request != null && request.a().f13928j) {
            bVar = new b(null, null);
        }
        u uVar = bVar.f14760a;
        y cachedResponse = bVar.f14761b;
        boolean z10 = call instanceof e;
        if (uVar == null && cachedResponse == null) {
            y.a aVar = new y.a();
            aVar.g(gVar.f15888f);
            aVar.f(Protocol.HTTP_1_1);
            aVar.f14072c = 504;
            aVar.e("Unsatisfiable Request (only-if-cached)");
            aVar.f14075g = qe.c.f14514c;
            aVar.f14079k = -1L;
            aVar.f14080l = System.currentTimeMillis();
            y response = aVar.a();
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            return response;
        } else if (uVar == null) {
            Intrinsics.checkNotNull(cachedResponse);
            Objects.requireNonNull(cachedResponse);
            y.a aVar2 = new y.a(cachedResponse);
            aVar2.b(C0256a.a(f14759a, cachedResponse));
            y response2 = aVar2.a();
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response2, "response");
            return response2;
        } else {
            if (cachedResponse != null) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(cachedResponse, "cachedResponse");
            }
            y c10 = ((g) chain).c(uVar);
            if (cachedResponse != null) {
                if (c10.f14065m == 304) {
                    y.a aVar3 = new y.a(cachedResponse);
                    C0256a c0256a = f14759a;
                    o oVar2 = cachedResponse.f14066t;
                    o oVar3 = c10.f14066t;
                    ArrayList arrayList = new ArrayList(20);
                    int i11 = 0;
                    for (int size = oVar2.size(); i11 < size; size = i10) {
                        String name = oVar2.e(i11);
                        String value = oVar2.h(i11);
                        if (StringsKt.equals("Warning", name, true)) {
                            oVar = oVar2;
                            i10 = size;
                            if (StringsKt.startsWith$default(value, "1", false, 2, (Object) null)) {
                                i11++;
                                oVar2 = oVar;
                            }
                        } else {
                            oVar = oVar2;
                            i10 = size;
                        }
                        if (c0256a.b(name) || !c0256a.c(name) || oVar3.b(name) == null) {
                            Intrinsics.checkNotNullParameter(name, "name");
                            Intrinsics.checkNotNullParameter(value, "value");
                            arrayList.add(name);
                            arrayList.add(StringsKt.trim((CharSequence) value).toString());
                        }
                        i11++;
                        oVar2 = oVar;
                    }
                    int size2 = oVar3.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        String name2 = oVar3.e(i12);
                        if (!c0256a.b(name2) && c0256a.c(name2)) {
                            String value2 = oVar3.h(i12);
                            Intrinsics.checkNotNullParameter(name2, "name");
                            Intrinsics.checkNotNullParameter(value2, "value");
                            arrayList.add(name2);
                            arrayList.add(StringsKt.trim((CharSequence) value2).toString());
                        }
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    aVar3.d(new o((String[]) array, null));
                    aVar3.f14079k = c10.A;
                    aVar3.f14080l = c10.B;
                    C0256a c0256a2 = f14759a;
                    aVar3.b(C0256a.a(c0256a2, cachedResponse));
                    y a10 = C0256a.a(c0256a2, c10);
                    aVar3.c("networkResponse", a10);
                    aVar3.f14076h = a10;
                    aVar3.a();
                    a0 a0Var = c10.f14067u;
                    Intrinsics.checkNotNull(a0Var);
                    a0Var.close();
                    Intrinsics.checkNotNull(null);
                    throw null;
                }
                a0 a0Var2 = cachedResponse.f14067u;
                if (a0Var2 != null) {
                    qe.c.d(a0Var2);
                }
            }
            Intrinsics.checkNotNull(c10);
            y.a aVar4 = new y.a(c10);
            C0256a c0256a3 = f14759a;
            aVar4.b(C0256a.a(c0256a3, cachedResponse));
            y a11 = C0256a.a(c0256a3, c10);
            aVar4.c("networkResponse", a11);
            aVar4.f14076h = a11;
            return aVar4.a();
        }
    }
}
