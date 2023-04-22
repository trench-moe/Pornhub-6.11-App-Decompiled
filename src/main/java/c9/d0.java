package c9;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class d0 extends e0 {

    /* renamed from: e  reason: collision with root package name */
    public final Callable<String> f3871e;

    public /* synthetic */ d0(Callable callable) {
        super(false, null, null);
        this.f3871e = callable;
    }

    @Override // c9.e0
    public final String a() {
        try {
            return this.f3871e.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
