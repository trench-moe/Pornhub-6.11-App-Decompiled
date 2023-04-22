package qb;

/* loaded from: classes2.dex */
public class n<T> implements mc.b<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f14476c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f14477a = f14476c;

    /* renamed from: b  reason: collision with root package name */
    public volatile mc.b<T> f14478b;

    public n(mc.b<T> bVar) {
        this.f14478b = bVar;
    }

    @Override // mc.b
    public T get() {
        T t2 = (T) this.f14477a;
        Object obj = f14476c;
        if (t2 == obj) {
            synchronized (this) {
                t2 = this.f14477a;
                if (t2 == obj) {
                    t2 = this.f14478b.get();
                    this.f14477a = t2;
                    this.f14478b = null;
                }
            }
        }
        return t2;
    }
}
