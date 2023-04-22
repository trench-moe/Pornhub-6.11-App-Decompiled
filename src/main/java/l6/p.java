package l6;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class p implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public final Executor f12307c;

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final Runnable f12308c;

        public a(Runnable runnable) {
            this.f12308c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f12308c.run();
            } catch (Exception e10) {
                cb.e.C("Executor", "Background execution failure.", e10);
            }
        }
    }

    public p(Executor executor) {
        this.f12307c = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f12307c.execute(new a(runnable));
    }
}
