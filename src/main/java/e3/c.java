package e3;

import b3.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final d f9037a;

    public c(d commentsRepository, int i10) {
        if (i10 != 1) {
            Intrinsics.checkNotNullParameter(commentsRepository, "commentsRepository");
            this.f9037a = commentsRepository;
            return;
        }
        Intrinsics.checkNotNullParameter(commentsRepository, "commentsRepository");
        this.f9037a = commentsRepository;
    }
}
