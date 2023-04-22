package pe;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pe.r;

/* loaded from: classes3.dex */
public final class n extends x {

    /* renamed from: c  reason: collision with root package name */
    public static final r f13976c;

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f13977a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f13978b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public final Charset f13981c = null;

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f13979a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f13980b = new ArrayList();
    }

    static {
        r.a aVar = r.f14004f;
        f13976c = r.a.a("application/x-www-form-urlencoded");
    }

    public n(List<String> encodedNames, List<String> encodedValues) {
        Intrinsics.checkNotNullParameter(encodedNames, "encodedNames");
        Intrinsics.checkNotNullParameter(encodedValues, "encodedValues");
        this.f13977a = qe.c.v(encodedNames);
        this.f13978b = qe.c.v(encodedValues);
    }

    @Override // pe.x
    public long a() {
        return d(null, true);
    }

    @Override // pe.x
    public r b() {
        return f13976c;
    }

    @Override // pe.x
    public void c(bf.g sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        d(sink, false);
    }

    public final long d(bf.g gVar, boolean z10) {
        bf.f b10;
        if (z10) {
            b10 = new bf.f();
        } else {
            Intrinsics.checkNotNull(gVar);
            b10 = gVar.b();
        }
        int size = this.f13977a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 > 0) {
                b10.i0(38);
            }
            b10.s0(this.f13977a.get(i10));
            b10.i0(61);
            b10.s0(this.f13978b.get(i10));
        }
        if (z10) {
            long j10 = b10.f3669f;
            b10.l(j10);
            return j10;
        }
        return 0L;
    }
}
