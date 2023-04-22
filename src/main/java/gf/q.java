package gf;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: c  reason: collision with root package name */
    public static final q f10026c;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10027a;

    /* renamed from: b  reason: collision with root package name */
    public final Constructor<MethodHandles.Lookup> f10028b;

    /* loaded from: classes2.dex */
    public static final class a extends q {

        /* renamed from: gf.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class ExecutorC0143a implements Executor {

            /* renamed from: c  reason: collision with root package name */
            public final Handler f10029c = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f10029c.post(runnable);
            }
        }

        public a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // gf.q
        public Executor a() {
            return new ExecutorC0143a();
        }

        @Override // gf.q
        public Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.b(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        f10026c = "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new q(true);
    }

    public q(boolean z10) {
        this.f10027a = z10;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z10) {
            try {
                constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f10028b = constructor;
    }

    public Executor a() {
        return null;
    }

    @IgnoreJRERequirement
    public Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
        Constructor<MethodHandles.Lookup> constructor = this.f10028b;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
