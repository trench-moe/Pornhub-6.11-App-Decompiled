package d6;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f8788a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final Executor f8789b = new b();

    /* loaded from: classes.dex */
    public class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            l.k(runnable);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
