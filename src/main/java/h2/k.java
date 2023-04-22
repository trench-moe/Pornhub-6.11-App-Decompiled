package h2;

import d6.l;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public abstract class k implements j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10108a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10109b;

    public k() {
        this.f10108a = 1;
        char[] cArr = l.f8803a;
        this.f10109b = new ArrayDeque(20);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Object obj) {
        this(Collections.singletonList(new n2.a(obj)), 0);
        this.f10108a = 0;
    }

    public /* synthetic */ k(Object obj, int i10) {
        this.f10108a = i10;
        this.f10109b = obj;
    }

    @Override // h2.j
    public List b() {
        return (List) this.f10109b;
    }

    public abstract k5.k c();

    public k5.k d() {
        k5.k kVar = (k5.k) ((Queue) this.f10109b).poll();
        if (kVar == null) {
            kVar = c();
        }
        return kVar;
    }

    public void e(k5.k kVar) {
        if (((Queue) this.f10109b).size() < 20) {
            ((Queue) this.f10109b).offer(kVar);
        }
    }

    public abstract double f(Object obj, long j10);

    public abstract float g(Object obj, long j10);

    public abstract void h(Object obj, long j10, boolean z10);

    public abstract void i(Object obj, long j10, byte b10);

    @Override // h2.j
    public boolean isStatic() {
        return ((List) this.f10109b).isEmpty() || (((List) this.f10109b).size() == 1 && ((n2.a) ((List) this.f10109b).get(0)).d());
    }

    public abstract void j(Object obj, long j10, double d);

    public abstract void k(Object obj, long j10, float f10);

    public abstract boolean l(Object obj, long j10);

    public int m(Class cls) {
        return ((Unsafe) this.f10109b).arrayBaseOffset(cls);
    }

    public int n(Class cls) {
        return ((Unsafe) this.f10109b).arrayIndexScale(cls);
    }

    public int o(Object obj, long j10) {
        return ((Unsafe) this.f10109b).getInt(obj, j10);
    }

    public long p(Object obj, long j10) {
        return ((Unsafe) this.f10109b).getLong(obj, j10);
    }

    public long q(Field field) {
        return ((Unsafe) this.f10109b).objectFieldOffset(field);
    }

    public Object r(Object obj, long j10) {
        return ((Unsafe) this.f10109b).getObject(obj, j10);
    }

    public void s(Object obj, long j10, int i10) {
        ((Unsafe) this.f10109b).putInt(obj, j10, i10);
    }

    public void t(Object obj, long j10, long j11) {
        ((Unsafe) this.f10109b).putLong(obj, j10, j11);
    }

    public String toString() {
        switch (this.f10108a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                if (!((List) this.f10109b).isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(((List) this.f10109b).toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u(Object obj, long j10, Object obj2) {
        ((Unsafe) this.f10109b).putObject(obj, j10, obj2);
    }
}
