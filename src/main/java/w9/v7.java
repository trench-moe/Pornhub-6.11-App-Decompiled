package w9;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class v7 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f17347a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class f17348b;

    /* renamed from: c  reason: collision with root package name */
    public static final x0.c f17349c;
    public static final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f17350e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f17351f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f17352g;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0133  */
    static {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w9.v7.<clinit>():void");
    }

    public static int a(Class cls) {
        if (f17350e) {
            return f17349c.k(cls);
        }
        return -1;
    }

    public static Field b() {
        Field field;
        Field field2;
        int i10 = a5.f17066a;
        try {
            field = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            field = null;
        }
        if (field == null) {
            try {
                field2 = Buffer.class.getDeclaredField("address");
            } catch (Throwable unused2) {
                field2 = null;
            }
            if (field2 == null || field2.getType() != Long.TYPE) {
                return null;
            }
            return field2;
        }
        return field;
    }

    public static void c(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        x0.c cVar = f17349c;
        int l10 = cVar.l(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        cVar.p(obj, j11, ((255 & b10) << i10) | (l10 & (~(KotlinVersion.MAX_COMPONENT_VALUE << i10))));
    }

    public static void d(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        x0.c cVar = f17349c;
        int i10 = (((int) j10) & 3) << 3;
        cVar.p(obj, j11, ((255 & b10) << i10) | (cVar.l(obj, j11) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i10))));
    }

    public static double e(Object obj, long j10) {
        return f17349c.c(obj, j10);
    }

    public static float f(Object obj, long j10) {
        return f17349c.d(obj, j10);
    }

    public static int g(Object obj, long j10) {
        return f17349c.l(obj, j10);
    }

    public static long h(Object obj, long j10) {
        return f17349c.m(obj, j10);
    }

    public static Object i(Class cls) {
        try {
            return f17347a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object j(Object obj, long j10) {
        return f17349c.o(obj, j10);
    }

    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new s7());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void l(Throwable th) {
        Logger.getLogger(v7.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void m(Object obj, long j10, double d10) {
        f17349c.g(obj, j10, d10);
    }

    public static void n(Object obj, long j10, long j11) {
        f17349c.q(obj, j10, j11);
    }

    public static /* synthetic */ boolean o(Object obj, long j10) {
        return ((byte) ((f17349c.l(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static /* synthetic */ boolean p(Object obj, long j10) {
        return ((byte) ((f17349c.l(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean q(Class cls) {
        int i10 = a5.f17066a;
        try {
            Class cls2 = f17348b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean r(Object obj, long j10) {
        return f17349c.i(obj, j10);
    }

    public static int s(Class cls) {
        if (f17350e) {
            return f17349c.j(cls);
        }
        return -1;
    }
}
