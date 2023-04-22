package q1;

import android.content.Context;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a {
    public static volatile a d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f14171e = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Context f14174c;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Class<? extends b<?>>> f14173b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f14172a = new HashMap();

    public a(Context context) {
        this.f14174c = context.getApplicationContext();
    }

    public static a b(Context context) {
        if (d == null) {
            synchronized (f14171e) {
                if (d == null) {
                    d = new a(context);
                }
            }
        }
        return d;
    }

    public <T> T a(Class<? extends b<?>> cls, Set<Class<?>> set) {
        T t2;
        synchronized (f14171e) {
            if (t1.a.a()) {
                Trace.beginSection(cls.getSimpleName());
            }
            if (set.contains(cls)) {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
            }
            if (this.f14172a.containsKey(cls)) {
                t2 = (T) this.f14172a.get(cls);
            } else {
                set.add(cls);
                b<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends b<?>>> a10 = newInstance.a();
                if (!a10.isEmpty()) {
                    for (Class<? extends b<?>> cls2 : a10) {
                        if (!this.f14172a.containsKey(cls2)) {
                            a(cls2, set);
                        }
                    }
                }
                t2 = (T) newInstance.b(this.f14174c);
                set.remove(cls);
                this.f14172a.put(cls, t2);
            }
            Trace.endSection();
        }
        return t2;
    }
}
