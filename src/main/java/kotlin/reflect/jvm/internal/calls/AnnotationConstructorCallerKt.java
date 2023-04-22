package kotlin.reflect.jvm.internal.calls;

import a0.a;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.text.Typography;

@Metadata(d1 = {"\u00004\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u001aI\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0000¢\u0006\u0002\u0010\u000b\u001a$\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002\u001a\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u00022\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0002¨\u0006\u0014²\u0006\u0014\u0010\u0015\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0002X\u008a\u0084\u0002²\u0006\u0014\u0010\u0016\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0002X\u008a\u0084\u0002"}, d2 = {"createAnnotationInstance", "T", BuildConfig.FLAVOR, "annotationClass", "Ljava/lang/Class;", "values", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "methods", BuildConfig.FLAVOR, "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/List;)Ljava/lang/Object;", "throwIllegalArgumentType", BuildConfig.FLAVOR, "index", BuildConfig.FLAVOR, AppMeasurementSdk.ConditionalUserProperty.NAME, "expectedJvmType", "transformKotlinToJvm", "expectedType", "kotlin-reflection", "hashCode", "toString"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnnotationConstructorCallerKt {
    public static final <T> T createAnnotationInstance(final Class<T> annotationClass, final Map<String, ? extends Object> values, final List<Method> methods) {
        Intrinsics.checkNotNullParameter(annotationClass, "annotationClass");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(methods, "methods");
        final Lazy lazy = LazyKt.lazy(new Function0<Integer>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$hashCode$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                Iterator<T> it = values.entrySet().iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    i10 += (value instanceof boolean[] ? Arrays.hashCode((boolean[]) value) : value instanceof char[] ? Arrays.hashCode((char[]) value) : value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value instanceof short[] ? Arrays.hashCode((short[]) value) : value instanceof int[] ? Arrays.hashCode((int[]) value) : value instanceof float[] ? Arrays.hashCode((float[]) value) : value instanceof long[] ? Arrays.hashCode((long[]) value) : value instanceof double[] ? Arrays.hashCode((double[]) value) : value instanceof Object[] ? Arrays.hashCode((Object[]) value) : value.hashCode()) ^ (str.hashCode() * 127);
                }
                return Integer.valueOf(i10);
            }
        });
        final Lazy lazy2 = LazyKt.lazy(new Function0<String>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                Class<T> cls = annotationClass;
                Map<String, Object> map = values;
                StringBuilder m10 = a.m('@');
                m10.append(cls.getCanonicalName());
                CollectionsKt.joinTo$default(map.entrySet(), m10, ", ", "(", ")", 0, null, new Function1<Map.Entry<? extends String, ? extends Object>, CharSequence>() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$toString$2$1$1
                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final CharSequence invoke2(Map.Entry<String, ? extends Object> entry) {
                        String obj;
                        Intrinsics.checkNotNullParameter(entry, "entry");
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof boolean[]) {
                            obj = Arrays.toString((boolean[]) value);
                            Intrinsics.checkNotNullExpressionValue(obj, "toString(this)");
                        } else if (value instanceof char[]) {
                            obj = Arrays.toString((char[]) value);
                            Intrinsics.checkNotNullExpressionValue(obj, "toString(this)");
                        } else if (value instanceof byte[]) {
                            obj = Arrays.toString((byte[]) value);
                            Intrinsics.checkNotNullExpressionValue(obj, "toString(this)");
                        } else if (value instanceof short[]) {
                            obj = Arrays.toString((short[]) value);
                            Intrinsics.checkNotNullExpressionValue(obj, "toString(this)");
                        } else if (value instanceof int[]) {
                            obj = Arrays.toString((int[]) value);
                            Intrinsics.checkNotNullExpressionValue(obj, "toString(this)");
                        } else if (value instanceof float[]) {
                            obj = Arrays.toString((float[]) value);
                            Intrinsics.checkNotNullExpressionValue(obj, "toString(this)");
                        } else if (value instanceof long[]) {
                            obj = Arrays.toString((long[]) value);
                            Intrinsics.checkNotNullExpressionValue(obj, "toString(this)");
                        } else if (value instanceof double[]) {
                            obj = Arrays.toString((double[]) value);
                            Intrinsics.checkNotNullExpressionValue(obj, "toString(this)");
                        } else if (value instanceof Object[]) {
                            obj = Arrays.toString((Object[]) value);
                            Intrinsics.checkNotNullExpressionValue(obj, "toString(this)");
                        } else {
                            obj = value.toString();
                        }
                        return key + '=' + obj;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends String, ? extends Object> entry) {
                        return invoke2((Map.Entry<String, ? extends Object>) entry);
                    }
                }, 48, null);
                String sb2 = m10.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
        });
        T t2 = (T) Proxy.newProxyInstance(annotationClass.getClassLoader(), new Class[]{annotationClass}, new InvocationHandler() { // from class: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt$createAnnotationInstance$result$1
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] args) {
                boolean createAnnotationInstance$equals;
                String m1269createAnnotationInstance$lambda3;
                int m1268createAnnotationInstance$lambda2;
                String name = method.getName();
                if (name != null) {
                    int hashCode = name.hashCode();
                    if (hashCode != -1776922004) {
                        if (hashCode != 147696667) {
                            if (hashCode == 1444986633 && name.equals("annotationType")) {
                                return annotationClass;
                            }
                        } else if (name.equals("hashCode")) {
                            m1268createAnnotationInstance$lambda2 = AnnotationConstructorCallerKt.m1268createAnnotationInstance$lambda2(lazy);
                            return Integer.valueOf(m1268createAnnotationInstance$lambda2);
                        }
                    } else if (name.equals("toString")) {
                        m1269createAnnotationInstance$lambda3 = AnnotationConstructorCallerKt.m1269createAnnotationInstance$lambda3(lazy2);
                        return m1269createAnnotationInstance$lambda3;
                    }
                }
                if (Intrinsics.areEqual(name, "equals")) {
                    if (args != null && args.length == 1) {
                        Class<T> cls = annotationClass;
                        List<Method> list = methods;
                        Map<String, Object> map = values;
                        Intrinsics.checkNotNullExpressionValue(args, "args");
                        createAnnotationInstance$equals = AnnotationConstructorCallerKt.createAnnotationInstance$equals(cls, list, map, ArraysKt.single(args));
                        return Boolean.valueOf(createAnnotationInstance$equals);
                    }
                }
                if (values.containsKey(name)) {
                    return values.get(name);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Method is not supported: ");
                sb2.append(method);
                sb2.append(" (args: ");
                if (args == null) {
                    args = new Object[0];
                }
                sb2.append(ArraysKt.toList(args));
                sb2.append(')');
                throw new KotlinReflectionInternalError(sb2.toString());
            }
        });
        Objects.requireNonNull(t2, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return t2;
    }

    public static /* synthetic */ Object createAnnotationInstance$default(Class cls, Map map, List list, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            Set<String> keySet = map.keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keySet, 10));
            for (String str : keySet) {
                arrayList.add(cls.getDeclaredMethod(str, new Class[0]));
            }
            list = arrayList;
        }
        return createAnnotationInstance(cls, map, list);
    }

    public static final <T> boolean createAnnotationInstance$equals(Class<T> cls, List<Method> list, Map<String, ? extends Object> map, Object obj) {
        boolean areEqual;
        boolean z10;
        Annotation annotation = obj instanceof Annotation ? (Annotation) obj : null;
        if (Intrinsics.areEqual(annotation != null ? JvmClassMappingKt.getJavaClass(JvmClassMappingKt.getAnnotationClass(annotation)) : null, cls)) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (Method method : list) {
                    Object obj2 = map.get(method.getName());
                    Object invoke = method.invoke(obj, new Object[0]);
                    if (obj2 instanceof boolean[]) {
                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        areEqual = Arrays.equals((boolean[]) obj2, (boolean[]) invoke);
                        continue;
                    } else if (obj2 instanceof char[]) {
                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.CharArray");
                        areEqual = Arrays.equals((char[]) obj2, (char[]) invoke);
                        continue;
                    } else if (obj2 instanceof byte[]) {
                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        areEqual = Arrays.equals((byte[]) obj2, (byte[]) invoke);
                        continue;
                    } else if (obj2 instanceof short[]) {
                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        areEqual = Arrays.equals((short[]) obj2, (short[]) invoke);
                        continue;
                    } else if (obj2 instanceof int[]) {
                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.IntArray");
                        areEqual = Arrays.equals((int[]) obj2, (int[]) invoke);
                        continue;
                    } else if (obj2 instanceof float[]) {
                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        areEqual = Arrays.equals((float[]) obj2, (float[]) invoke);
                        continue;
                    } else if (obj2 instanceof long[]) {
                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.LongArray");
                        areEqual = Arrays.equals((long[]) obj2, (long[]) invoke);
                        continue;
                    } else if (obj2 instanceof double[]) {
                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        areEqual = Arrays.equals((double[]) obj2, (double[]) invoke);
                        continue;
                    } else if (obj2 instanceof Object[]) {
                        Objects.requireNonNull(invoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        areEqual = Arrays.equals((Object[]) obj2, (Object[]) invoke);
                        continue;
                    } else {
                        areEqual = Intrinsics.areEqual(obj2, invoke);
                        continue;
                    }
                    if (!areEqual) {
                        z10 = false;
                        break;
                    }
                }
            }
            z10 = true;
            if (z10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: createAnnotationInstance$lambda-2 */
    public static final int m1268createAnnotationInstance$lambda2(Lazy<Integer> lazy) {
        return lazy.getValue().intValue();
    }

    /* renamed from: createAnnotationInstance$lambda-3 */
    public static final String m1269createAnnotationInstance$lambda3(Lazy<String> lazy) {
        return lazy.getValue();
    }

    public static final Void throwIllegalArgumentType(int i10, String str, Class<?> cls) {
        String qualifiedName;
        KClass orCreateKotlinClass = Intrinsics.areEqual(cls, Class.class) ? Reflection.getOrCreateKotlinClass(KClass.class) : (cls.isArray() && Intrinsics.areEqual(cls.getComponentType(), Class.class)) ? Reflection.getOrCreateKotlinClass(KClass[].class) : JvmClassMappingKt.getKotlinClass(cls);
        if (Intrinsics.areEqual(orCreateKotlinClass.getQualifiedName(), Reflection.getOrCreateKotlinClass(Object[].class).getQualifiedName())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) orCreateKotlinClass.getQualifiedName());
            sb2.append(Typography.less);
            Class<?> componentType = JvmClassMappingKt.getJavaClass(orCreateKotlinClass).getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "kotlinClass.java.componentType");
            sb2.append((Object) JvmClassMappingKt.getKotlinClass(componentType).getQualifiedName());
            sb2.append(Typography.greater);
            qualifiedName = sb2.toString();
        } else {
            qualifiedName = orCreateKotlinClass.getQualifiedName();
        }
        throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + ((Object) qualifiedName));
    }

    public static final Object transformKotlinToJvm(Object obj, Class<?> cls) {
        if (obj instanceof Class) {
            return null;
        }
        if (obj instanceof KClass) {
            obj = JvmClassMappingKt.getJavaClass((KClass) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr instanceof Class[]) {
                return null;
            }
            if (objArr instanceof KClass[]) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                KClass[] kClassArr = (KClass[]) obj;
                ArrayList arrayList = new ArrayList(kClassArr.length);
                int length = kClassArr.length;
                int i10 = 0;
                while (i10 < length) {
                    KClass kClass = kClassArr[i10];
                    i10++;
                    arrayList.add(JvmClassMappingKt.getJavaClass(kClass));
                }
                obj = arrayList.toArray(new Class[0]);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            } else {
                obj = objArr;
            }
        }
        if (cls.isInstance(obj)) {
            return obj;
        }
        return null;
    }
}
