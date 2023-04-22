package le;

/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final p0 f12827a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<w> f12828b = new ThreadLocal<>();

    public static final w a() {
        ThreadLocal<w> threadLocal = f12828b;
        w wVar = threadLocal.get();
        if (wVar == null) {
            c cVar = new c(Thread.currentThread());
            threadLocal.set(cVar);
            return cVar;
        }
        return wVar;
    }
}
