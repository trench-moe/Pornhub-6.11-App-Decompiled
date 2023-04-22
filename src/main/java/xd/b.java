package xd;

/* loaded from: classes2.dex */
public final class b<T> implements ie.a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f18349c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile ie.a<T> f18350a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f18351b = f18349c;

    public b(ie.a<T> aVar) {
        this.f18350a = aVar;
    }

    public static Object a(Object obj, Object obj2) {
        if ((obj != f18349c) && obj != obj2) {
            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
        }
        return obj2;
    }

    @Override // ie.a
    public T get() {
        T t2 = (T) this.f18351b;
        Object obj = f18349c;
        if (t2 == obj) {
            synchronized (this) {
                t2 = this.f18351b;
                if (t2 == obj) {
                    t2 = this.f18350a.get();
                    a(this.f18351b, t2);
                    this.f18351b = t2;
                    this.f18350a = null;
                }
            }
        }
        return t2;
    }
}
