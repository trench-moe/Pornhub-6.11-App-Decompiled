package x0;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final Object f17656a;

    public abstract float a(Object obj);

    public abstract void b(Object obj, float f10);

    public abstract double c(Object obj, long j10);

    public abstract float d(Object obj, long j10);

    public abstract void e(Object obj, long j10, boolean z10);

    public abstract void f(Object obj, long j10, byte b10);

    public abstract void g(Object obj, long j10, double d);

    public abstract void h(Object obj, long j10, float f10);

    public abstract boolean i(Object obj, long j10);

    public int j(Class cls) {
        return ((Unsafe) this.f17656a).arrayBaseOffset(cls);
    }

    public int k(Class cls) {
        return ((Unsafe) this.f17656a).arrayIndexScale(cls);
    }

    public int l(Object obj, long j10) {
        return ((Unsafe) this.f17656a).getInt(obj, j10);
    }

    public long m(Object obj, long j10) {
        return ((Unsafe) this.f17656a).getLong(obj, j10);
    }

    public long n(Field field) {
        return ((Unsafe) this.f17656a).objectFieldOffset(field);
    }

    public Object o(Object obj, long j10) {
        return ((Unsafe) this.f17656a).getObject(obj, j10);
    }

    public void p(Object obj, long j10, int i10) {
        ((Unsafe) this.f17656a).putInt(obj, j10, i10);
    }

    public void q(Object obj, long j10, long j11) {
        ((Unsafe) this.f17656a).putLong(obj, j10, j11);
    }

    public void r(Object obj, long j10, Object obj2) {
        ((Unsafe) this.f17656a).putObject(obj, j10, obj2);
    }
}
