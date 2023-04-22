package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class b<T> extends f<T> {
    public static final f.e d = new a();

    /* renamed from: a  reason: collision with root package name */
    public final jd.e f8527a;

    /* renamed from: b  reason: collision with root package name */
    public final C0116b<?>[] f8528b;

    /* renamed from: c  reason: collision with root package name */
    public final JsonReader.a f8529c;

    /* loaded from: classes.dex */
    public class a implements f.e {
        @Override // com.squareup.moshi.f.e
        public f<?> a(Type type, Set<? extends Annotation> set, k kVar) {
            jd.e dVar;
            Field[] declaredFields;
            jd.f fVar;
            Type type2 = type;
            if ((type2 instanceof Class) || (type2 instanceof ParameterizedType)) {
                Class<?> c10 = jd.k.c(type);
                if (c10.isInterface() || c10.isEnum() || !set.isEmpty()) {
                    return null;
                }
                if (kd.c.e(c10)) {
                    b(type2, List.class);
                    b(type2, Set.class);
                    b(type2, Map.class);
                    b(type2, Collection.class);
                    String str = "Platform " + c10;
                    if (type2 instanceof ParameterizedType) {
                        str = str + " in " + type2;
                    }
                    throw new IllegalArgumentException(a1.a.l(str, " requires explicit JsonAdapter to be registered"));
                } else if (c10.isAnonymousClass()) {
                    StringBuilder m10 = a1.a.m("Cannot serialize anonymous class ");
                    m10.append(c10.getName());
                    throw new IllegalArgumentException(m10.toString());
                } else if (c10.isLocalClass()) {
                    StringBuilder m11 = a1.a.m("Cannot serialize local class ");
                    m11.append(c10.getName());
                    throw new IllegalArgumentException(m11.toString());
                } else if (c10.getEnclosingClass() != null && !Modifier.isStatic(c10.getModifiers())) {
                    StringBuilder m12 = a1.a.m("Cannot serialize non-static nested class ");
                    m12.append(c10.getName());
                    throw new IllegalArgumentException(m12.toString());
                } else if (Modifier.isAbstract(c10.getModifiers())) {
                    StringBuilder m13 = a1.a.m("Cannot serialize abstract class ");
                    m13.append(c10.getName());
                    throw new IllegalArgumentException(m13.toString());
                } else {
                    Class<? extends Annotation> cls = kd.c.d;
                    if (cls != null && c10.isAnnotationPresent(cls)) {
                        StringBuilder m14 = a1.a.m("Cannot serialize Kotlin type ");
                        m14.append(c10.getName());
                        m14.append(". Reflective serialization of Kotlin classes without using kotlin-reflect has undefined and unexpected behavior. Please use KotlinJsonAdapterFactory from the moshi-kotlin artifact or use code gen from the moshi-kotlin-codegen artifact.");
                        throw new IllegalArgumentException(m14.toString());
                    }
                    try {
                        try {
                            Constructor<?> declaredConstructor = c10.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            dVar = new jd.a(declaredConstructor, c10);
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                            try {
                                try {
                                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                                    declaredMethod.setAccessible(true);
                                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                                    declaredMethod2.setAccessible(true);
                                    dVar = new jd.c(declaredMethod2, c10, intValue);
                                } catch (IllegalAccessException unused2) {
                                    throw new AssertionError();
                                } catch (NoSuchMethodException unused3) {
                                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                                    declaredMethod3.setAccessible(true);
                                    dVar = new jd.d(declaredMethod3, c10);
                                } catch (InvocationTargetException e10) {
                                    kd.c.k(e10);
                                    throw null;
                                }
                            } catch (Exception unused4) {
                                StringBuilder m15 = a1.a.m("cannot construct instances of ");
                                m15.append(c10.getName());
                                throw new IllegalArgumentException(m15.toString());
                            }
                        } catch (IllegalAccessException unused5) {
                            throw new AssertionError();
                        }
                    } catch (NoSuchMethodException unused6) {
                        Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                        Field declaredField = cls2.getDeclaredField("theUnsafe");
                        declaredField.setAccessible(true);
                        dVar = new jd.b(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), c10);
                    }
                    TreeMap treeMap = new TreeMap();
                    while (type2 != Object.class) {
                        Class<?> c11 = jd.k.c(type2);
                        boolean e11 = kd.c.e(c11);
                        for (Field field : c11.getDeclaredFields()) {
                            int modifiers = field.getModifiers();
                            if (((Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers) || (!Modifier.isPublic(modifiers) && !Modifier.isProtected(modifiers) && e11)) ? false : true) && ((fVar = (jd.f) field.getAnnotation(jd.f.class)) == null || !fVar.ignore())) {
                                Type i10 = kd.c.i(type2, c11, field.getGenericType());
                                Set<? extends Annotation> f10 = kd.c.f(field.getAnnotations());
                                String name = field.getName();
                                f<T> d = kVar.d(i10, f10, name);
                                field.setAccessible(true);
                                String g10 = kd.c.g(name, fVar);
                                C0116b c0116b = (C0116b) treeMap.put(g10, new C0116b(g10, field, d));
                                if (c0116b != null) {
                                    StringBuilder m16 = a1.a.m("Conflicting fields:\n    ");
                                    m16.append(c0116b.f8531b);
                                    m16.append("\n    ");
                                    m16.append(field);
                                    throw new IllegalArgumentException(m16.toString());
                                }
                            }
                        }
                        Class<?> c12 = jd.k.c(type2);
                        type2 = kd.c.i(type2, c12, c12.getGenericSuperclass());
                    }
                    return (f<T>) new b(dVar, treeMap).nullSafe();
                }
            }
            return null;
        }

        public final void b(Type type, Class<?> cls) {
            Class<?> c10 = jd.k.c(type);
            if (cls.isAssignableFrom(c10)) {
                throw new IllegalArgumentException("No JsonAdapter for " + type + ", you should probably use " + cls.getSimpleName() + " instead of " + c10.getSimpleName() + " (Moshi only supports the collection interfaces by default) or else register a custom JsonAdapter.");
            }
        }
    }

    /* renamed from: com.squareup.moshi.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0116b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f8530a;

        /* renamed from: b  reason: collision with root package name */
        public final Field f8531b;

        /* renamed from: c  reason: collision with root package name */
        public final f<T> f8532c;

        public C0116b(String str, Field field, f<T> fVar) {
            this.f8530a = str;
            this.f8531b = field;
            this.f8532c = fVar;
        }
    }

    public b(jd.e eVar, Map<String, C0116b<?>> map) {
        this.f8527a = eVar;
        this.f8528b = (C0116b[]) map.values().toArray(new C0116b[map.size()]);
        this.f8529c = JsonReader.a.a((String[]) map.keySet().toArray(new String[map.size()]));
    }

    @Override // com.squareup.moshi.f
    public T fromJson(JsonReader jsonReader) {
        try {
            T t2 = (T) this.f8527a.h();
            try {
                jsonReader.c();
                while (jsonReader.h()) {
                    int F = jsonReader.F(this.f8529c);
                    if (F == -1) {
                        jsonReader.P();
                        jsonReader.S();
                    } else {
                        C0116b<?> c0116b = this.f8528b[F];
                        c0116b.f8531b.set(t2, c0116b.f8532c.fromJson(jsonReader));
                    }
                }
                jsonReader.e();
                return t2;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        } catch (IllegalAccessException unused2) {
            throw new AssertionError();
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            kd.c.k(e11);
            throw null;
        }
    }

    @Override // com.squareup.moshi.f
    public void toJson(jd.j jVar, T t2) {
        C0116b<?>[] c0116bArr;
        try {
            jVar.c();
            for (C0116b<?> c0116b : this.f8528b) {
                jVar.i(c0116b.f8530a);
                c0116b.f8532c.toJson(jVar, (jd.j) c0116b.f8531b.get(t2));
            }
            jVar.f();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        }
    }

    public String toString() {
        StringBuilder m10 = a1.a.m("JsonAdapter(");
        m10.append(this.f8527a);
        m10.append(")");
        return m10.toString();
    }
}
