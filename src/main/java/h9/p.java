package h9;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: b  reason: collision with root package name */
    public static p f10366b;

    /* renamed from: c  reason: collision with root package name */
    public static final q f10367c = new q(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public q f10368a;

    public static synchronized p a() {
        p pVar;
        synchronized (p.class) {
            try {
                if (f10366b == null) {
                    f10366b = new p();
                }
                pVar = f10366b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }
}
