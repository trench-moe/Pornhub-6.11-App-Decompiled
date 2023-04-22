package bf;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class k extends z {

    /* renamed from: e  reason: collision with root package name */
    public z f3673e;

    public k(z delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f3673e = delegate;
    }

    @Override // bf.z
    public z a() {
        return this.f3673e.a();
    }

    @Override // bf.z
    public z b() {
        return this.f3673e.b();
    }

    @Override // bf.z
    public long c() {
        return this.f3673e.c();
    }

    @Override // bf.z
    public z d(long j10) {
        return this.f3673e.d(j10);
    }

    @Override // bf.z
    public boolean e() {
        return this.f3673e.e();
    }

    @Override // bf.z
    public void f() {
        this.f3673e.f();
    }

    @Override // bf.z
    public z g(long j10, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f3673e.g(j10, unit);
    }
}
