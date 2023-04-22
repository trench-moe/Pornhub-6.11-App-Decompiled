package t9;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class q2 {

    /* renamed from: c  reason: collision with root package name */
    public static final q2 f15328c = new q2();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap<Class<?>, t2<?>> f15330b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final u2 f15329a = new c2();

    public final <T> t2<T> a(Class<T> cls) {
        m2 m2Var;
        Class<?> cls2;
        Charset charset = t1.f15353a;
        Objects.requireNonNull(cls, "messageType");
        m2 m2Var2 = (t2<T>) this.f15330b.get(cls);
        if (m2Var2 == null) {
            c2 c2Var = (c2) this.f15329a;
            Objects.requireNonNull(c2Var);
            Class<?> cls3 = v2.f15360a;
            if (!com.google.android.gms.internal.cast.l1.class.isAssignableFrom(cls) && (cls2 = v2.f15360a) != null) {
                if (!cls2.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
            }
            h2 a10 = c2Var.f15194a.a(cls);
            if (a10.zzb()) {
                if (com.google.android.gms.internal.cast.l1.class.isAssignableFrom(cls)) {
                    f3<?, ?> f3Var = v2.d;
                    d1<?> d1Var = f1.f15210a;
                    m2Var = new m2(f3Var, f1.f15210a, a10.zza());
                } else {
                    f3<?, ?> f3Var2 = v2.f15361b;
                    d1<?> d1Var2 = f1.f15211b;
                    if (d1Var2 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    m2Var = new m2(f3Var2, d1Var2, a10.zza());
                }
                m2Var2 = m2Var;
            } else {
                boolean z10 = false;
                if (com.google.android.gms.internal.cast.l1.class.isAssignableFrom(cls)) {
                    if (a10.a() == 1) {
                        z10 = true;
                    }
                    if (z10) {
                        n2 n2Var = o2.f15310b;
                        y1 y1Var = y1.f15371b;
                        f3<?, ?> f3Var3 = v2.d;
                        d1<?> d1Var3 = f1.f15210a;
                        m2Var2 = l2.n(a10, n2Var, y1Var, f3Var3, f1.f15210a, g2.f15224b);
                    } else {
                        m2Var2 = l2.n(a10, o2.f15310b, y1.f15371b, v2.d, null, g2.f15224b);
                    }
                } else {
                    if (a10.a() == 1) {
                        z10 = true;
                    }
                    if (z10) {
                        n2 n2Var2 = o2.f15309a;
                        y1 y1Var2 = y1.f15370a;
                        f3<?, ?> f3Var4 = v2.f15361b;
                        d1<?> d1Var4 = f1.f15211b;
                        if (d1Var4 == null) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                        m2Var2 = l2.n(a10, n2Var2, y1Var2, f3Var4, d1Var4, g2.f15223a);
                    } else {
                        m2Var2 = l2.n(a10, o2.f15309a, y1.f15370a, v2.f15362c, null, g2.f15223a);
                    }
                }
            }
            t2<?> putIfAbsent = this.f15330b.putIfAbsent(cls, m2Var2);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return m2Var2;
    }
}
