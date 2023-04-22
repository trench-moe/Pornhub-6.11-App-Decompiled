package o6;

/* loaded from: classes2.dex */
public final class a<T> implements ie.a<T>, n6.a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f13601c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile ie.a<T> f13602a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f13603b = f13601c;

    public a(ie.a<T> aVar) {
        this.f13602a = aVar;
    }

    public static Object a(Object obj, Object obj2) {
        if (!(obj != f13601c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // ie.a
    public T get() {
        T t2 = (T) this.f13603b;
        Object obj = f13601c;
        if (t2 == obj) {
            synchronized (this) {
                t2 = this.f13603b;
                if (t2 == obj) {
                    t2 = this.f13602a.get();
                    a(this.f13603b, t2);
                    this.f13603b = t2;
                    this.f13602a = null;
                }
            }
        }
        return t2;
    }
}
