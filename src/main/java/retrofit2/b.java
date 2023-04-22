package retrofit2;

import bf.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import pe.a0;
import pe.r;
import pe.z;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Type[] f14767a = new Type[0];

    /* loaded from: classes3.dex */
    public static final class a implements GenericArrayType {

        /* renamed from: c  reason: collision with root package name */
        public final Type f14768c;

        public a(Type type) {
            this.f14768c = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && b.c(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f14768c;
        }

        public int hashCode() {
            return this.f14768c.hashCode();
        }

        public String toString() {
            return b.p(this.f14768c) + "[]";
        }
    }

    /* renamed from: retrofit2.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0258b implements ParameterizedType {

        /* renamed from: c  reason: collision with root package name */
        public final Type f14769c;

        /* renamed from: f  reason: collision with root package name */
        public final Type f14770f;

        /* renamed from: j  reason: collision with root package name */
        public final Type[] f14771j;

        public C0258b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                b.b(type3);
            }
            this.f14769c = type;
            this.f14770f = type2;
            this.f14771j = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && b.c(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f14771j.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f14769c;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f14770f;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f14771j) ^ this.f14770f.hashCode();
            Type type = this.f14769c;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f14771j;
            if (typeArr.length == 0) {
                return b.p(this.f14770f);
            }
            StringBuilder sb2 = new StringBuilder((typeArr.length + 1) * 30);
            sb2.append(b.p(this.f14770f));
            sb2.append("<");
            sb2.append(b.p(this.f14771j[0]));
            for (int i10 = 1; i10 < this.f14771j.length; i10++) {
                sb2.append(", ");
                sb2.append(b.p(this.f14771j[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements WildcardType {

        /* renamed from: c  reason: collision with root package name */
        public final Type f14772c;

        /* renamed from: f  reason: collision with root package name */
        public final Type f14773f;

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                b.b(typeArr[0]);
                this.f14773f = null;
                this.f14772c = typeArr[0];
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            b.b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f14773f = typeArr2[0];
            this.f14772c = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && b.c(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f14773f;
            return type != null ? new Type[]{type} : b.f14767a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f14772c};
        }

        public int hashCode() {
            Type type = this.f14773f;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f14772c.hashCode() + 31);
        }

        public String toString() {
            if (this.f14773f != null) {
                StringBuilder m10 = a1.a.m("? super ");
                m10.append(b.p(this.f14773f));
                return m10.toString();
            } else if (this.f14772c == Object.class) {
                return "?";
            } else {
                StringBuilder m11 = a1.a.m("? extends ");
                m11.append(b.p(this.f14772c));
                return m11.toString();
            }
        }
    }

    public static a0 a(a0 a0Var) {
        f asResponseBody = new f();
        a0Var.f().I(asResponseBody);
        r e10 = a0Var.e();
        long d = a0Var.d();
        Intrinsics.checkNotNullParameter(asResponseBody, "content");
        Intrinsics.checkNotNullParameter(asResponseBody, "$this$asResponseBody");
        return new z(asResponseBody, e10, d);
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean c(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return c(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        } else if (type instanceof WildcardType) {
            if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
            }
            return false;
        } else if ((type instanceof TypeVariable) && (type2 instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        } else {
            return false;
        }
    }

    public static Type d(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (interfaces[i10] == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(interfaces[i10])) {
                    return d(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type e(int i10, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i10 >= 0 && i10 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i10];
            return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
        }
        StringBuilder n = a1.a.n("Index ", i10, " not in range [0,");
        n.append(actualTypeArguments.length);
        n.append(") for ");
        n.append(parameterizedType);
        throw new IllegalArgumentException(n.toString());
    }

    public static Class<?> f(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(f(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return f(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    public static Type g(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return n(type, cls, d(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static boolean h(Type type) {
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (h(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return h(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
        }
    }

    public static boolean i(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static RuntimeException j(Method method, String str, Object... objArr) {
        return k(method, null, str, objArr);
    }

    public static RuntimeException k(Method method, Throwable th, String str, Object... objArr) {
        StringBuilder l10 = android.support.v4.media.a.l(String.format(str, objArr), "\n    for method ");
        l10.append(method.getDeclaringClass().getSimpleName());
        l10.append(".");
        l10.append(method.getName());
        return new IllegalArgumentException(l10.toString(), th);
    }

    public static RuntimeException l(Method method, int i10, String str, Object... objArr) {
        StringBuilder l10 = android.support.v4.media.a.l(str, " (parameter #");
        l10.append(i10 + 1);
        l10.append(")");
        return j(method, l10.toString(), objArr);
    }

    public static RuntimeException m(Method method, Throwable th, int i10, String str, Object... objArr) {
        StringBuilder l10 = android.support.v4.media.a.l(str, " (parameter #");
        l10.append(i10 + 1);
        l10.append(")");
        return k(method, th, l10.toString(), objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[LOOP:0: B:2:0x0000->B:24:0x0043, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0042 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type n(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.b.n(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static void o(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static String p(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
