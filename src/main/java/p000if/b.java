package p000if;

import gf.f;
import jd.i;
import jd.j;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import pe.r;
import pe.v;
import pe.x;

/* renamed from: if.b  reason: invalid package */
/* loaded from: classes2.dex */
public final class b<T> implements f<T, x> {

    /* renamed from: b  reason: collision with root package name */
    public static final r f10706b = r.b("application/json; charset=UTF-8");

    /* renamed from: a  reason: collision with root package name */
    public final com.squareup.moshi.f<T> f10707a;

    public b(com.squareup.moshi.f<T> fVar) {
        this.f10707a = fVar;
    }

    @Override // gf.f
    public x a(Object obj) {
        bf.f fVar = new bf.f();
        this.f10707a.toJson((j) new i(fVar), (i) obj);
        r rVar = f10706b;
        ByteString toRequestBody = fVar.t();
        Intrinsics.checkNotNullParameter(toRequestBody, "content");
        Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
        return new v(toRequestBody, rVar);
    }
}
