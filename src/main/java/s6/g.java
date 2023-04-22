package s6;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final ie.a<Context> f14857a;

    public g(ie.a<Context> aVar) {
        this.f14857a = aVar;
    }

    @Override // ie.a
    public Object get() {
        String packageName = this.f14857a.get().getPackageName();
        Objects.requireNonNull(packageName, "Cannot return null from a non-@Nullable @Provides method");
        return packageName;
    }
}
