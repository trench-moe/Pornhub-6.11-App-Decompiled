package n3;

import b3.n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final n f13283a;

    public b(n userRepository, int i10) {
        if (i10 != 1) {
            Intrinsics.checkNotNullParameter(userRepository, "userRepository");
            this.f13283a = userRepository;
            return;
        }
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f13283a = userRepository;
    }
}
