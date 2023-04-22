package k3;

import b3.i;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final i f11784a;

    public g(i performersRepository) {
        Intrinsics.checkNotNullParameter(performersRepository, "performersRepository");
        this.f11784a = performersRepository;
    }

    public final void a(Map<String, String> map) {
        if (map != null) {
            this.f11784a.g(map);
        } else {
            this.f11784a.c();
        }
    }
}
