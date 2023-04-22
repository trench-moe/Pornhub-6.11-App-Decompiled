package vb;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class f implements ea.a<Void, Object> {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Callable f16128c;

    public f(e eVar, Callable callable) {
        this.f16128c = callable;
    }

    @Override // ea.a
    public Object f(ea.g<Void> gVar) {
        return this.f16128c.call();
    }
}
