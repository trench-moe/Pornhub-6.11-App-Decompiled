package w9;

import java.util.List;

/* loaded from: classes2.dex */
public final class z9 extends i {

    /* renamed from: j  reason: collision with root package name */
    public final x9 f17394j;

    public z9(x9 x9Var) {
        super("internal.logger");
        this.f17394j = x9Var;
        this.f17187f.put("log", new y9(this, false, true));
        this.f17187f.put("silent", new k9());
        ((i) this.f17187f.get("silent")).f17187f.put("log", new y9(this, true, true));
        this.f17187f.put("unmonitored", new w9(0));
        ((i) this.f17187f.get("unmonitored")).f17187f.put("log", new y9(this, false, false));
    }

    @Override // w9.i
    public final o a(h2.h hVar, List list) {
        return o.f17256k;
    }
}
