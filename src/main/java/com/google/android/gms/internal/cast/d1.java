package com.google.android.gms.internal.cast;

import com.app.pornhub.domain.config.DvdsConfig;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class d1 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f6890a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f6891b;

    /* renamed from: c  reason: collision with root package name */
    public static final long f6892c;
    public static final long d;

    /* renamed from: e  reason: collision with root package name */
    public static final long f6893e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f6894f;

    /* loaded from: classes.dex */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        public static final Unsafe a() {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() {
            return a();
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e10) {
                throw new RuntimeException("Could not initialize intrinsics", e10.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new a());
        }
        try {
            f6892c = unsafe.objectFieldOffset(f1.class.getDeclaredField("j"));
            f6891b = unsafe.objectFieldOffset(f1.class.getDeclaredField("f"));
            d = unsafe.objectFieldOffset(f1.class.getDeclaredField(DvdsConfig.TYPE_CATEGORY));
            f6893e = unsafe.objectFieldOffset(e1.class.getDeclaredField("a"));
            f6894f = unsafe.objectFieldOffset(e1.class.getDeclaredField("b"));
            f6890a = unsafe;
        } catch (Exception e11) {
            Object obj = t9.a0.f15170a;
            if (!(e11 instanceof RuntimeException)) {
                throw new RuntimeException(e11);
            }
            throw ((RuntimeException) e11);
        }
    }

    @Override // com.google.android.gms.internal.cast.w0
    public final void a(e1 e1Var, e1 e1Var2) {
        f6890a.putObject(e1Var, f6894f, e1Var2);
    }

    @Override // com.google.android.gms.internal.cast.w0
    public final void b(e1 e1Var, Thread thread) {
        f6890a.putObject(e1Var, f6893e, thread);
    }

    @Override // com.google.android.gms.internal.cast.w0
    public final boolean c(f1<?> f1Var, y0 y0Var, y0 y0Var2) {
        return a0.a.v(f6890a, f1Var, f6891b, y0Var, y0Var2);
    }

    @Override // com.google.android.gms.internal.cast.w0
    public final boolean d(f1<?> f1Var, Object obj, Object obj2) {
        return a0.a.v(f6890a, f1Var, d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.cast.w0
    public final boolean e(f1<?> f1Var, e1 e1Var, e1 e1Var2) {
        return a0.a.v(f6890a, f1Var, f6892c, e1Var, e1Var2);
    }
}
