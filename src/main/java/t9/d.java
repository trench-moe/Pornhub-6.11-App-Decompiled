package t9;

import android.os.Handler;
import android.os.Looper;
import j1.l;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class d implements l.f {

    /* renamed from: c  reason: collision with root package name */
    public static final a9.b f15201c = new a9.b("MediaRouterOPTListener");

    /* renamed from: a  reason: collision with root package name */
    public final g f15202a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f15203b;

    public d(g gVar) {
        Objects.requireNonNull(gVar, "null reference");
        this.f15202a = gVar;
        this.f15203b = new x(Looper.getMainLooper());
    }
}
