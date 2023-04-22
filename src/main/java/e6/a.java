package e6;

import android.util.Log;
import e6.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final e<Object> f9121a = new C0127a();

    /* renamed from: e6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0127a implements e<Object> {
        @Override // e6.a.e
        public void a(Object obj) {
        }
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        T a();
    }

    /* loaded from: classes.dex */
    public static final class c<T> implements m0.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final b<T> f9122a;

        /* renamed from: b  reason: collision with root package name */
        public final e<T> f9123b;

        /* renamed from: c  reason: collision with root package name */
        public final m0.c<T> f9124c;

        public c(m0.c<T> cVar, b<T> bVar, e<T> eVar) {
            this.f9124c = cVar;
            this.f9122a = bVar;
            this.f9123b = eVar;
        }

        @Override // m0.c
        public boolean a(T t2) {
            if (t2 instanceof d) {
                ((d.b) ((d) t2).e()).f9125a = true;
            }
            this.f9123b.a(t2);
            return this.f9124c.a(t2);
        }

        @Override // m0.c
        public T b() {
            T b10 = this.f9124c.b();
            if (b10 == null) {
                b10 = this.f9122a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder m10 = a1.a.m("Created new ");
                    m10.append(b10.getClass());
                    Log.v("FactoryPools", m10.toString());
                }
            }
            if (b10 instanceof d) {
                ((d.b) ((d) b10).e()).f9125a = false;
            }
            return b10;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        e6.d e();
    }

    /* loaded from: classes.dex */
    public interface e<T> {
        void a(T t2);
    }

    public static <T extends d> m0.c<T> a(int i10, b<T> bVar) {
        return new c(new m0.e(i10), bVar, f9121a);
    }
}
