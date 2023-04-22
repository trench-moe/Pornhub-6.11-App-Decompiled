package w9;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import w9.r5;
import w9.u5;

/* loaded from: classes2.dex */
public abstract class u5<MessageType extends u5<MessageType, BuilderType>, BuilderType extends r5<MessageType, BuilderType>> extends com.google.android.gms.internal.measurement.c<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    public p7 zzc = p7.f17276f;
    public int zzd = -1;

    public static Object j(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void k(Class cls, u5 u5Var) {
        zza.put(cls, u5Var);
    }

    public static u5 o(Class cls) {
        Map map = zza;
        u5 u5Var = (u5) map.get(cls);
        if (u5Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                u5Var = (u5) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (u5Var == null) {
            u5Var = (u5) ((u5) v7.i(cls)).r(6, null, null);
            if (u5Var == null) {
                throw new IllegalStateException();
            }
            map.put(cls, u5Var);
        }
        return u5Var;
    }

    public static z5 p(z5 z5Var) {
        h6 h6Var = (h6) z5Var;
        int i10 = h6Var.f17184j;
        return h6Var.i(i10 == 0 ? 10 : i10 + i10);
    }

    public static a6 q(a6 a6Var) {
        int size = a6Var.size();
        return a6Var.i(size == 0 ? 10 : size + size);
    }

    @Override // w9.s6
    public final /* synthetic */ r6 a() {
        return (r5) r(5, null, null);
    }

    @Override // w9.s6
    public final int b() {
        int i10 = this.zzd;
        if (i10 == -1) {
            int c10 = z6.f17390c.a(getClass()).c(this);
            this.zzd = c10;
            return c10;
        }
        return i10;
    }

    @Override // w9.s6
    public final /* synthetic */ r6 c() {
        r5 r5Var = (r5) r(5, null, null);
        r5Var.j(this);
        return r5Var;
    }

    @Override // w9.t6
    public final /* synthetic */ s6 d() {
        return (u5) r(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final int e() {
        return this.zzd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return z6.f17390c.a(getClass()).h(this, (u5) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.c
    public final void h(int i10) {
        this.zzd = i10;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        if (i10 != 0) {
            return i10;
        }
        int b10 = z6.f17390c.a(getClass()).b(this);
        this.zzb = b10;
        return b10;
    }

    public final void l(com.google.android.gms.internal.measurement.e eVar) {
        c7 a10 = z6.f17390c.a(getClass());
        f5 f5Var = eVar.P;
        if (f5Var == null) {
            f5Var = new f5(eVar);
        }
        a10.e(this, f5Var);
    }

    public final r5 m() {
        return (r5) r(5, null, null);
    }

    public final r5 n() {
        r5 r5Var = (r5) r(5, null, null);
        r5Var.j(this);
        return r5Var;
    }

    public abstract Object r(int i10, Object obj, Object obj2);

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(obj);
        com.google.android.gms.internal.measurement.g.c(this, sb2, 0);
        return sb2.toString();
    }
}
