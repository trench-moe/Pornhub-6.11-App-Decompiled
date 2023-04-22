package q2;

import android.app.Application;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14303a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a f14304b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14305c;

    public u(ie.a aVar, ie.a aVar2) {
        this.f14303a = 2;
        this.f14304b = aVar;
        this.f14305c = aVar2;
    }

    public /* synthetic */ u(Object obj, ie.a aVar, int i10) {
        this.f14303a = i10;
        this.f14305c = obj;
        this.f14304b = aVar;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f14303a) {
            case 0:
                b3.e currentUserRepository = (b3.e) this.f14304b.get();
                Objects.requireNonNull((a0.b) this.f14305c);
                Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
                return new p2.b(currentUserRepository);
            case 1:
                Application application = (Application) this.f14304b.get();
                Objects.requireNonNull((cb.e) this.f14305c);
                Intrinsics.checkNotNullParameter(application, "application");
                return new q3.c(application);
            default:
                return new c3.a((b3.a) this.f14304b.get(), (b3.e) ((ie.a) this.f14305c).get());
        }
    }
}
