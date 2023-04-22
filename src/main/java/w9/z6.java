package w9;

import java.nio.charset.Charset;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class z6 {

    /* renamed from: c  reason: collision with root package name */
    public static final z6 f17390c = new z6();

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentMap f17392b = new ConcurrentHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final d7 f17391a = new k6();

    public final c7 a(Class cls) {
        v6 v6Var;
        Class cls2;
        Charset charset = b6.f17081a;
        Objects.requireNonNull(cls, "messageType");
        u6 u6Var = (c7) this.f17392b.get(cls);
        if (u6Var == null) {
            k6 k6Var = (k6) this.f17391a;
            Objects.requireNonNull(k6Var);
            Class cls3 = e7.f17123a;
            if (!u5.class.isAssignableFrom(cls) && (cls2 = e7.f17123a) != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
            o6 a10 = k6Var.f17214a.a(cls);
            if (a10.zzb()) {
                if (u5.class.isAssignableFrom(cls)) {
                    o7 o7Var = e7.d;
                    j5 j5Var = l5.f17222a;
                    v6Var = new v6(o7Var, l5.f17222a, a10.zza());
                } else {
                    o7 o7Var2 = e7.f17124b;
                    j5 j5Var2 = l5.f17223b;
                    if (j5Var2 == null) {
                        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                    }
                    v6Var = new v6(o7Var2, j5Var2, a10.zza());
                }
                u6Var = v6Var;
            } else {
                boolean z10 = false;
                if (u5.class.isAssignableFrom(cls)) {
                    if (a10.a() == 1) {
                        z10 = true;
                    }
                    if (z10) {
                        w6 w6Var = x6.f17364b;
                        g6 g6Var = g6.f17168b;
                        o7 o7Var3 = e7.d;
                        j5 j5Var3 = l5.f17222a;
                        u6Var = u6.C(a10, w6Var, g6Var, o7Var3, l5.f17222a, n6.f17252b);
                    } else {
                        u6Var = u6.C(a10, x6.f17364b, g6.f17168b, e7.d, null, n6.f17252b);
                    }
                } else {
                    if (a10.a() == 1) {
                        z10 = true;
                    }
                    if (z10) {
                        w6 w6Var2 = x6.f17363a;
                        g6 g6Var2 = g6.f17167a;
                        o7 o7Var4 = e7.f17124b;
                        j5 j5Var4 = l5.f17223b;
                        if (j5Var4 == null) {
                            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                        }
                        u6Var = u6.C(a10, w6Var2, g6Var2, o7Var4, j5Var4, n6.f17251a);
                    } else {
                        u6Var = u6.C(a10, x6.f17363a, g6.f17167a, e7.f17125c, null, n6.f17251a);
                    }
                }
            }
            c7 c7Var = (c7) this.f17392b.putIfAbsent(cls, u6Var);
            if (c7Var != null) {
                return c7Var;
            }
        }
        return u6Var;
    }
}
