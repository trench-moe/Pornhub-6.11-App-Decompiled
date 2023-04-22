package m0;

/* loaded from: classes2.dex */
public class e<T> extends d<T> {

    /* renamed from: c  reason: collision with root package name */
    public final Object f12860c;

    public e(int i10) {
        super(i10);
        this.f12860c = new Object();
    }

    @Override // m0.d, m0.c
    public boolean a(T t2) {
        boolean a10;
        synchronized (this.f12860c) {
            a10 = super.a(t2);
        }
        return a10;
    }

    @Override // m0.d, m0.c
    public T b() {
        T t2;
        synchronized (this.f12860c) {
            t2 = (T) super.b();
        }
        return t2;
    }
}
