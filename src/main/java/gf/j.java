package gf;

import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.KotlinNullPointerException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

/* loaded from: classes2.dex */
public final class j implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ le.e f9969a;

    public j(le.e eVar) {
        this.f9969a = eVar;
    }

    @Override // gf.d
    public void a(b<Object> bVar, Throwable th) {
        le.e eVar = this.f9969a;
        Result.Companion companion = Result.Companion;
        eVar.resumeWith(Result.m16constructorimpl(ResultKt.createFailure(th)));
    }

    @Override // gf.d
    public void b(b<Object> bVar, t<Object> tVar) {
        if (!tVar.a()) {
            le.e eVar = this.f9969a;
            HttpException httpException = new HttpException(tVar);
            Result.Companion companion = Result.Companion;
            eVar.resumeWith(Result.m16constructorimpl(ResultKt.createFailure(httpException)));
            return;
        }
        Object obj = tVar.f10077b;
        if (obj != null) {
            le.e eVar2 = this.f9969a;
            Result.Companion companion2 = Result.Companion;
            eVar2.resumeWith(Result.m16constructorimpl(obj));
            return;
        }
        pe.u m10 = bVar.m();
        Objects.requireNonNull(m10);
        Intrinsics.checkNotNullParameter(i.class, "type");
        Object cast = i.class.cast(m10.f14052f.get(i.class));
        if (cast == null) {
            Intrinsics.throwNpe();
        }
        Intrinsics.checkExpressionValueIsNotNull(cast, "call.request().tag(Invocation::class.java)!!");
        Method method = ((i) cast).f9967a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Response from ");
        Intrinsics.checkExpressionValueIsNotNull(method, "method");
        Class<?> declaringClass = method.getDeclaringClass();
        Intrinsics.checkExpressionValueIsNotNull(declaringClass, "method.declaringClass");
        sb2.append(declaringClass.getName());
        sb2.append('.');
        sb2.append(method.getName());
        sb2.append(" was null but response body type was declared as non-null");
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb2.toString());
        le.e eVar3 = this.f9969a;
        Result.Companion companion3 = Result.Companion;
        eVar3.resumeWith(Result.m16constructorimpl(ResultKt.createFailure(kotlinNullPointerException)));
    }
}
