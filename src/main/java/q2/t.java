package q2;

import com.app.pornhub.data.util.AppManager;
import com.squareup.moshi.k;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14301a;

    /* renamed from: b  reason: collision with root package name */
    public final a0.b f14302b;

    public /* synthetic */ t(a0.b bVar, int i10) {
        this.f14301a = i10;
        this.f14302b = bVar;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f14301a) {
            case 0:
                Objects.requireNonNull(this.f14302b);
                return new AppManager();
            default:
                Objects.requireNonNull(this.f14302b);
                k.a aVar = new k.a();
                aVar.f8555a.add(new ld.b());
                com.squareup.moshi.k kVar = new com.squareup.moshi.k(aVar);
                Intrinsics.checkNotNullExpressionValue(kVar, "Builder()\n            .a…y())\n            .build()");
                return kVar;
        }
    }
}
