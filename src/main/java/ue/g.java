package ue;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pe.q;
import pe.u;
import pe.y;

/* loaded from: classes3.dex */
public final class g implements q.a {

    /* renamed from: a  reason: collision with root package name */
    public int f15884a;

    /* renamed from: b  reason: collision with root package name */
    public final te.e f15885b;

    /* renamed from: c  reason: collision with root package name */
    public final List<q> f15886c;
    public final int d;

    /* renamed from: e  reason: collision with root package name */
    public final te.c f15887e;

    /* renamed from: f  reason: collision with root package name */
    public final u f15888f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15889g;

    /* renamed from: h  reason: collision with root package name */
    public final int f15890h;

    /* renamed from: i  reason: collision with root package name */
    public final int f15891i;

    /* JADX WARN: Multi-variable type inference failed */
    public g(te.e call, List<? extends q> interceptors, int i10, te.c cVar, u request, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f15885b = call;
        this.f15886c = interceptors;
        this.d = i10;
        this.f15887e = cVar;
        this.f15888f = request;
        this.f15889g = i11;
        this.f15890h = i12;
        this.f15891i = i13;
    }

    public static g b(g gVar, int i10, te.c cVar, u uVar, int i11, int i12, int i13, int i14) {
        int i15 = (i14 & 1) != 0 ? gVar.d : i10;
        te.c cVar2 = (i14 & 2) != 0 ? gVar.f15887e : cVar;
        u request = (i14 & 4) != 0 ? gVar.f15888f : uVar;
        int i16 = (i14 & 8) != 0 ? gVar.f15889g : i11;
        int i17 = (i14 & 16) != 0 ? gVar.f15890h : i12;
        int i18 = (i14 & 32) != 0 ? gVar.f15891i : i13;
        Intrinsics.checkNotNullParameter(request, "request");
        return new g(gVar.f15885b, gVar.f15886c, i15, cVar2, request, i16, i17, i18);
    }

    public pe.g a() {
        te.c cVar = this.f15887e;
        if (cVar != null) {
            return cVar.f15420b;
        }
        return null;
    }

    public y c(u request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.d < this.f15886c.size()) {
            this.f15884a++;
            te.c cVar = this.f15887e;
            if (cVar != null) {
                if (!cVar.f15422e.b(request.f14049b)) {
                    StringBuilder m10 = a1.a.m("network interceptor ");
                    m10.append(this.f15886c.get(this.d - 1));
                    m10.append(" must retain the same host and port");
                    throw new IllegalStateException(m10.toString().toString());
                }
                if (!(this.f15884a == 1)) {
                    StringBuilder m11 = a1.a.m("network interceptor ");
                    m11.append(this.f15886c.get(this.d - 1));
                    m11.append(" must call proceed() exactly once");
                    throw new IllegalStateException(m11.toString().toString());
                }
            }
            g b10 = b(this, this.d + 1, null, request, 0, 0, 0, 58);
            q qVar = this.f15886c.get(this.d);
            y a10 = qVar.a(b10);
            if (a10 == null) {
                throw new NullPointerException("interceptor " + qVar + " returned null");
            }
            if (this.f15887e != null) {
                if (!(this.d + 1 >= this.f15886c.size() || b10.f15884a == 1)) {
                    throw new IllegalStateException(("network interceptor " + qVar + " must call proceed() exactly once").toString());
                }
            }
            if (a10.f14067u != null) {
                return a10;
            }
            throw new IllegalStateException(("interceptor " + qVar + " returned a response with no body").toString());
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
