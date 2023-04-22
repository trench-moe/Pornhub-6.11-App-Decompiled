package gf;

import kotlin.Result;
import kotlin.ResultKt;

/* loaded from: classes2.dex */
public final class k implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ le.e f9970a;

    public k(le.e eVar) {
        this.f9970a = eVar;
    }

    @Override // gf.d
    public void a(b<Object> bVar, Throwable th) {
        le.e eVar = this.f9970a;
        Result.Companion companion = Result.Companion;
        eVar.resumeWith(Result.m16constructorimpl(ResultKt.createFailure(th)));
    }

    @Override // gf.d
    public void b(b<Object> bVar, t<Object> tVar) {
        le.e eVar = this.f9970a;
        Result.Companion companion = Result.Companion;
        eVar.resumeWith(Result.m16constructorimpl(tVar));
    }
}
