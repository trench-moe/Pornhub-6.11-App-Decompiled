package kd;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import jd.f;
import jd.h;
import jd.k;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Set<Annotation> f12067a;

    /* renamed from: b  reason: collision with root package name */
    public static final Type[] f12068b;

    /* renamed from: c  reason: collision with root package name */
    public static final Class<?> f12069c;
    public static final Class<? extends Annotation> d;

    /* renamed from: e  reason: collision with root package name */
    public static final Map<Class<?>, Class<?>> f12070e;

    /* loaded from: classes2.dex */
    public static final class a implements GenericArrayType {

        /* renamed from: c  reason: collision with root package name */
        public final Type f12071c;

        public a(Type type) {
            this.f12071c = c.a(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && k.b(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f12071c;
        }

        public int hashCode() {
            return this.f12071c.hashCode();
        }

        public String toString() {
            return c.m(this.f12071c) + "[]";
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements ParameterizedType {

        /* renamed from: c  reason: collision with root package name */
        public final Type f12072c;

        /* renamed from: f  reason: collision with root package name */
        public final Type f12073f;

        /* renamed from: j  reason: collision with root package name */
        public final Type[] f12074j;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class<?> enclosingClass = ((Class) type2).getEnclosingClass();
                if (type != null) {
                    if (enclosingClass == null || k.c(type) != enclosingClass) {
                        throw new IllegalArgumentException("unexpected owner type for " + type2 + ": " + type);
                    }
                } else if (enclosingClass != null) {
                    throw new IllegalArgumentException("unexpected owner type for " + type2 + ": null");
                }
            }
            this.f12072c = type == null ? null : c.a(type);
            this.f12073f = c.a(type2);
            this.f12074j = (Type[]) typeArr.clone();
            int i10 = 0;
            while (true) {
                Type[] typeArr2 = this.f12074j;
                if (i10 >= typeArr2.length) {
                    return;
                }
                Objects.requireNonNull(typeArr2[i10]);
                c.b(typeArr2[i10]);
                Type[] typeArr3 = this.f12074j;
                typeArr3[i10] = c.a(typeArr3[i10]);
                i10++;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && k.b(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f12074j.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f12072c;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f12073f;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f12074j) ^ this.f12073f.hashCode();
            Type type = this.f12072c;
            Set<Annotation> set = c.f12067a;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder((this.f12074j.length + 1) * 30);
            sb2.append(c.m(this.f12073f));
            if (this.f12074j.length == 0) {
                return sb2.toString();
            }
            sb2.append("<");
            sb2.append(c.m(this.f12074j[0]));
            for (int i10 = 1; i10 < this.f12074j.length; i10++) {
                sb2.append(", ");
                sb2.append(c.m(this.f12074j[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    /* renamed from: kd.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0173c implements WildcardType {

        /* renamed from: c  reason: collision with root package name */
        public final Type f12075c;

        /* renamed from: f  reason: collision with root package name */
        public final Type f12076f;

        public C0173c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            }
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                c.b(typeArr[0]);
                this.f12076f = null;
                this.f12075c = c.a(typeArr[0]);
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            c.b(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                throw new IllegalArgumentException();
            }
            this.f12076f = c.a(typeArr2[0]);
            this.f12075c = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && k.b(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f12076f;
            return type != null ? new Type[]{type} : c.f12068b;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f12075c};
        }

        public int hashCode() {
            Type type = this.f12076f;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f12075c.hashCode() + 31);
        }

        public String toString() {
            if (this.f12076f != null) {
                StringBuilder m10 = a1.a.m("? super ");
                m10.append(c.m(this.f12076f));
                return m10.toString();
            } else if (this.f12075c == Object.class) {
                return "?";
            } else {
                StringBuilder m11 = a1.a.m("? extends ");
                m11.append(c.m(this.f12075c));
                return m11.toString();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:10:0x001a
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            java.util.Set r0 = java.util.Collections.emptySet()
            kd.c.f12067a = r0
            r0 = 0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            kd.c.f12068b = r0
            r0 = 0
            java.lang.String r1 = getKotlinMetadataClassName()     // Catch: java.lang.ClassNotFoundException -> L15
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> L15
            goto L16
        L15:
            r1 = r0
        L16:
            kd.c.d = r1
            java.lang.Class<kotlin.jvm.internal.DefaultConstructorMarker> r0 = kotlin.jvm.internal.DefaultConstructorMarker.class
        L1a:
            kd.c.f12069c = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 16
            r0.<init>(r1)
            java.lang.Class r1 = java.lang.Boolean.TYPE
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Byte.TYPE
            java.lang.Class<java.lang.Byte> r2 = java.lang.Byte.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Character.TYPE
            java.lang.Class<java.lang.Character> r2 = java.lang.Character.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r2 = java.lang.Long.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Short.TYPE
            java.lang.Class<java.lang.Short> r2 = java.lang.Short.class
            r0.put(r1, r2)
            java.lang.Class r1 = java.lang.Void.TYPE
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            r0.put(r1, r2)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            kd.c.f12070e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.c.<clinit>():void");
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new a(a(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            if (type instanceof b) {
                return type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return type instanceof a ? type : new a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof WildcardType) && !(type instanceof C0173c)) {
                WildcardType wildcardType = (WildcardType) type;
                return new C0173c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
            }
            return type;
        }
    }

    public static void b(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Unexpected primitive " + type + ". Use the boxed type.");
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static com.squareup.moshi.f<?> c(com.squareup.moshi.k r11, java.lang.reflect.Type r12, java.lang.Class<?> r13) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.c.c(com.squareup.moshi.k, java.lang.reflect.Type, java.lang.Class):com.squareup.moshi.f");
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

    public static boolean e(Class<?> cls) {
        String name = cls.getName();
        if (!name.startsWith("android.") && !name.startsWith("androidx.") && !name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("kotlin.") && !name.startsWith("kotlinx.") && !name.startsWith("scala.")) {
            return false;
        }
        return true;
    }

    public static Set<? extends Annotation> f(Annotation[] annotationArr) {
        LinkedHashSet linkedHashSet = null;
        for (Annotation annotation : annotationArr) {
            if (annotation.annotationType().isAnnotationPresent(h.class)) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(annotation);
            }
        }
        return linkedHashSet != null ? Collections.unmodifiableSet(linkedHashSet) : f12067a;
    }

    public static String g(String str, f fVar) {
        if (fVar == null) {
            return str;
        }
        String name = fVar.name();
        return "\u0000".equals(name) ? str : name;
    }

    private static String getKotlinMetadataClassName() {
        return "kotlin.Metadata";
    }

    public static JsonDataException h(String str, String str2, JsonReader jsonReader) {
        String f10 = jsonReader.f();
        return new JsonDataException(str2.equals(str) ? String.format("Required value '%s' missing at %s", str, f10) : String.format("Required value '%s' (JSON name '%s') missing at %s", str, str2, f10));
    }

    public static Type i(Type type, Class<?> cls, Type type2) {
        return j(type, cls, type2, new LinkedHashSet());
    }

    public static Type j(Type type, Class<?> cls, Type type2, Collection<TypeVariable<?>> collection) {
        TypeVariable<?> typeVariable;
        do {
            int i10 = 0;
            if (!(type2 instanceof TypeVariable)) {
                if (type2 instanceof Class) {
                    Class cls2 = (Class) type2;
                    if (cls2.isArray()) {
                        Class<?> componentType = cls2.getComponentType();
                        Type j10 = j(type, cls, componentType, collection);
                        return componentType == j10 ? cls2 : new a(j10);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type j11 = j(type, cls, genericComponentType, collection);
                    return genericComponentType == j11 ? genericArrayType : new a(j11);
                } else if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type j12 = j(type, cls, ownerType, collection);
                    boolean z10 = j12 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length = actualTypeArguments.length;
                    while (i10 < length) {
                        Type j13 = j(type, cls, actualTypeArguments[i10], collection);
                        if (j13 != actualTypeArguments[i10]) {
                            if (!z10) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z10 = true;
                            }
                            actualTypeArguments[i10] = j13;
                        }
                        i10++;
                    }
                    return z10 ? new b(j12, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                } else {
                    boolean z11 = type2 instanceof WildcardType;
                    WildcardType wildcardType = type2;
                    if (z11) {
                        WildcardType wildcardType2 = (WildcardType) type2;
                        Type[] lowerBounds = wildcardType2.getLowerBounds();
                        Type[] upperBounds = wildcardType2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type j14 = j(type, cls, lowerBounds[0], collection);
                            wildcardType = wildcardType2;
                            if (j14 != lowerBounds[0]) {
                                return new C0173c(new Type[]{Object.class}, j14 instanceof WildcardType ? ((WildcardType) j14).getLowerBounds() : new Type[]{j14});
                            }
                        } else {
                            wildcardType = wildcardType2;
                            if (upperBounds.length == 1) {
                                Type j15 = j(type, cls, upperBounds[0], collection);
                                wildcardType = wildcardType2;
                                if (j15 != upperBounds[0]) {
                                    return new C0173c(j15 instanceof WildcardType ? ((WildcardType) j15).getUpperBounds() : new Type[]{j15}, f12068b);
                                }
                            }
                        }
                    }
                    return wildcardType;
                }
            }
            typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            Object genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls3 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls3 != null) {
                Type d10 = d(type, cls, cls3);
                if (d10 instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls3.getTypeParameters();
                    while (i10 < typeParameters.length) {
                        if (typeVariable.equals(typeParameters[i10])) {
                            type2 = ((ParameterizedType) d10).getActualTypeArguments()[i10];
                            continue;
                        } else {
                            i10++;
                        }
                    }
                    throw new NoSuchElementException();
                }
            }
            type2 = typeVariable;
            continue;
        } while (type2 != typeVariable);
        return type2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static java.lang.RuntimeException k(java.lang.reflect.InvocationTargetException r5) {
        /*
            java.lang.Throwable r1 = r5.getTargetException()
            r5 = r1
            boolean r0 = r5 instanceof java.lang.RuntimeException
            r4 = 4
            if (r0 != 0) goto L19
            r4 = 2
            boolean r0 = r5 instanceof java.lang.Error
            if (r0 == 0) goto L13
            java.lang.Error r5 = (java.lang.Error) r5
            throw r5
            r3 = 2
        L13:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            throw r0
        L19:
            r4 = 1
            java.lang.RuntimeException r5 = (java.lang.RuntimeException) r5
            r4 = 4
            throw r5
            r3 = 4
        */
        throw new UnsupportedOperationException("Method not decompiled: kd.c.k(java.lang.reflect.InvocationTargetException):java.lang.RuntimeException");
    }

    public static String l(Type type, Set<? extends Annotation> set) {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(type);
        if (set.isEmpty()) {
            str = " (with no annotations)";
        } else {
            str = " annotated " + set;
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static String m(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static JsonDataException n(String str, String str2, JsonReader jsonReader) {
        String f10 = jsonReader.f();
        return new JsonDataException(str2.equals(str) ? String.format("Non-null value '%s' was null at %s", str, f10) : String.format("Non-null value '%s' (JSON name '%s') was null at %s", str, str2, f10));
    }
}
