package e9;

import android.os.Handler;
import android.os.Looper;
import d9.a;
import d9.a.d;
import java.util.Objects;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes.dex */
public final class d0<O extends a.d> extends s {
    @NotOnlyInitialized

    /* renamed from: a  reason: collision with root package name */
    public final d9.b<O> f9177a;

    public d0(d9.b<O> bVar) {
        this.f9177a = bVar;
    }

    @Override // d9.c
    public final <A extends a.b, R extends d9.f, T extends com.google.android.gms.common.api.internal.a<R, A>> T a(T t2) {
        d9.b<O> bVar = this.f9177a;
        Objects.requireNonNull(bVar);
        t2.zak();
        d dVar = bVar.f8865j;
        Objects.requireNonNull(dVar);
        t0 t0Var = new t0(0, t2);
        Handler handler = dVar.D;
        handler.sendMessage(handler.obtainMessage(4, new i0(t0Var, dVar.y.get(), bVar)));
        return t2;
    }

    @Override // d9.c
    public final Looper b() {
        return this.f9177a.f8861f;
    }
}
