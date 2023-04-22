package l;

import af.c;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class a extends c {

    /* renamed from: b  reason: collision with root package name */
    public static volatile a f12144b;

    /* renamed from: c  reason: collision with root package name */
    public static final Executor f12145c = new ExecutorC0177a();
    public static final Executor d = new b();

    /* renamed from: a  reason: collision with root package name */
    public c f12146a = new l.b();

    /* renamed from: l.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class ExecutorC0177a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.s().f12146a.q(runnable);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.s().f12146a.f(runnable);
        }
    }

    public static a s() {
        if (f12144b != null) {
            return f12144b;
        }
        synchronized (a.class) {
            if (f12144b == null) {
                f12144b = new a();
            }
        }
        return f12144b;
    }

    @Override // af.c
    public void f(Runnable runnable) {
        this.f12146a.f(runnable);
    }

    @Override // af.c
    public boolean k() {
        return this.f12146a.k();
    }

    @Override // af.c
    public void q(Runnable runnable) {
        this.f12146a.q(runnable);
    }
}
