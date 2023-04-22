package w9;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class aa extends i {

    /* renamed from: j  reason: collision with root package name */
    public final Callable f17071j;

    public aa(Callable callable) {
        super("internal.appMetadata");
        this.f17071j = callable;
    }

    @Override // w9.i
    public final o a(h2.h hVar, List list) {
        try {
            return a0.b.o0(this.f17071j.call());
        } catch (Exception unused) {
            return o.f17256k;
        }
    }
}
