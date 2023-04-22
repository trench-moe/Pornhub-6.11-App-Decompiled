package xd;

/* loaded from: classes2.dex */
public final class e<T> implements ie.a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f18353c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile ie.a<T> f18354a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f18355b = f18353c;

    public e(ie.a<T> aVar) {
        this.f18354a = aVar;
    }

    public static <P extends ie.a<T>, T> ie.a<T> a(P p10) {
        return ((p10 instanceof e) || (p10 instanceof b)) ? p10 : new e(p10);
    }

    @Override // ie.a
    public T get() {
        T t2 = (T) this.f18355b;
        if (t2 == f18353c) {
            ie.a<T> aVar = this.f18354a;
            if (aVar == null) {
                return (T) this.f18355b;
            }
            T t8 = aVar.get();
            this.f18355b = t8;
            this.f18354a = null;
            return t8;
        }
        return t2;
    }
}
