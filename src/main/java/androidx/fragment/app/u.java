package androidx.fragment.app;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a  reason: collision with root package name */
    public static final p.g<ClassLoader, p.g<String, Class<?>>> f2266a = new p.g<>();

    public static Class<?> b(ClassLoader classLoader, String str) {
        p.g<ClassLoader, p.g<String, Class<?>>> gVar = f2266a;
        p.g<String, Class<?>> orDefault = gVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new p.g<>();
            gVar.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 == null) {
            orDefault2 = Class.forName(str, false, classLoader);
            orDefault.put(str, orDefault2);
        }
        return orDefault2;
    }

    public static Class<? extends Fragment> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e10) {
            throw new Fragment.InstantiationException(android.support.v4.media.b.j("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new Fragment.InstantiationException(android.support.v4.media.b.j("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }

    public Fragment a(ClassLoader classLoader, String str) {
        throw null;
    }
}
