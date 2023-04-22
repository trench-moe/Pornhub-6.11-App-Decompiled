package fd;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f9543a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f9544b;

    /* renamed from: c  reason: collision with root package name */
    public final Class<?> f9545c;
    public final Class<?> d;

    /* renamed from: e  reason: collision with root package name */
    public final Method f9546e;

    public a(Class<?> cls, String str, Object[] objArr, Class<?> cls2) {
        Method method;
        this.f9543a = str;
        this.f9544b = objArr;
        this.f9545c = cls2;
        Class[] clsArr = new Class[objArr.length];
        int i10 = 0;
        while (true) {
            Object[] objArr2 = this.f9544b;
            if (i10 >= objArr2.length) {
                break;
            }
            clsArr[i10] = objArr2[i10].getClass();
            i10++;
        }
        Method[] methods = cls.getMethods();
        int length = methods.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                method = null;
                break;
            }
            method = methods[i11];
            String name = method.getName();
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (name.equals(this.f9543a) && parameterTypes.length == this.f9544b.length && b(this.f9545c).isAssignableFrom(b(method.getReturnType()))) {
                boolean z10 = true;
                for (int i12 = 0; i12 < parameterTypes.length && z10; i12++) {
                    z10 = b(parameterTypes[i12]).isAssignableFrom(b(clsArr[i12]));
                }
                if (z10) {
                    break;
                }
            }
            i11++;
        }
        this.f9546e = method;
        if (method != null) {
            this.d = method.getDeclaringClass();
            return;
        }
        StringBuilder m10 = a1.a.m("Method ");
        m10.append(cls.getName());
        m10.append(".");
        throw new NoSuchMethodException(android.support.v4.media.b.m(m10, this.f9543a, " doesn't exit"));
    }

    public static Class<?> b(Class<?> cls) {
        return cls == Byte.class ? Byte.TYPE : cls == Short.class ? Short.TYPE : cls == Integer.class ? Integer.TYPE : cls == Long.class ? Long.TYPE : cls == Float.class ? Float.TYPE : cls == Double.class ? Double.TYPE : cls == Boolean.class ? Boolean.TYPE : cls == Character.class ? Character.TYPE : cls;
    }

    public Object a(View view, Object[] objArr) {
        if (this.d.isAssignableFrom(view.getClass())) {
            try {
                return this.f9546e.invoke(view, objArr);
            } catch (IllegalAccessException e10) {
                StringBuilder m10 = a1.a.m("Method ");
                m10.append(this.f9546e.getName());
                m10.append(" appears not to be public");
                cb.e.D("MixpanelABTest.Caller", m10.toString(), e10);
            } catch (IllegalArgumentException e11) {
                StringBuilder m11 = a1.a.m("Method ");
                m11.append(this.f9546e.getName());
                m11.append(" called with arguments of the wrong type");
                cb.e.D("MixpanelABTest.Caller", m11.toString(), e11);
            } catch (InvocationTargetException e12) {
                StringBuilder m12 = a1.a.m("Method ");
                m12.append(this.f9546e.getName());
                m12.append(" threw an exception");
                cb.e.D("MixpanelABTest.Caller", m12.toString(), e12);
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("[Caller ");
        m10.append(this.f9543a);
        m10.append("(");
        m10.append(this.f9544b);
        m10.append(")]");
        return m10.toString();
    }
}
