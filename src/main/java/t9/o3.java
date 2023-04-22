package t9;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class o3 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f15311a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f15312b;

    /* renamed from: c  reason: collision with root package name */
    public static final h2.k f15313c;
    public static final boolean d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f15314e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f15315f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f15316g;

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013a  */
    static {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t9.o3.<clinit>():void");
    }

    public static int a(Class<?> cls) {
        if (f15314e) {
            return f15313c.n(cls);
        }
        return -1;
    }

    public static Field b() {
        Field field;
        Field field2;
        int i10 = y0.f15369a;
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
        h2.k kVar = f15313c;
        int o10 = kVar.o(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        kVar.s(obj, j11, ((255 & b10) << i10) | (o10 & (~(KotlinVersion.MAX_COMPONENT_VALUE << i10))));
    }

    public static void d(Object obj, long j10, byte b10) {
        long j11 = (-4) & j10;
        h2.k kVar = f15313c;
        int i10 = (((int) j10) & 3) << 3;
        kVar.s(obj, j11, ((255 & b10) << i10) | (kVar.o(obj, j11) & (~(KotlinVersion.MAX_COMPONENT_VALUE << i10))));
    }

    public static double e(Object obj, long j10) {
        return f15313c.f(obj, j10);
    }

    public static float f(Object obj, long j10) {
        return f15313c.g(obj, j10);
    }

    public static int g(Object obj, long j10) {
        return f15313c.o(obj, j10);
    }

    public static long h(Object obj, long j10) {
        return f15313c.p(obj, j10);
    }

    public static <T> T i(Class<T> cls) {
        try {
            return (T) f15311a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object j(Object obj, long j10) {
        return f15313c.r(obj, j10);
    }

    public static Unsafe k() {
        try {
            return (Unsafe) AccessController.doPrivileged(new l3());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ void l(Throwable th) {
        Logger.getLogger(o3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void m(Object obj, long j10, long j11) {
        f15313c.t(obj, j10, j11);
    }

    public static /* synthetic */ boolean n(Object obj, long j10) {
        return ((byte) ((f15313c.o(obj, (-4) & j10) >>> ((int) (((~j10) & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static /* synthetic */ boolean o(Object obj, long j10) {
        return ((byte) ((f15313c.o(obj, (-4) & j10) >>> ((int) ((j10 & 3) << 3))) & KotlinVersion.MAX_COMPONENT_VALUE)) != 0;
    }

    public static boolean p(Class<?> cls) {
        int i10 = y0.f15369a;
        try {
            Class<?> cls2 = f15312b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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

    public static boolean q(Object obj, long j10) {
        return f15313c.l(obj, j10);
    }

    public static int r(Class<?> cls) {
        if (f15314e) {
            return f15313c.m(cls);
        }
        return -1;
    }
}
