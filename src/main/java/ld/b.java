package ld;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.f;
import com.squareup.moshi.k;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.KCallablesJvm;
import kotlin.reflect.jvm.ReflectJvmMapping;
import ld.a;

/* loaded from: classes2.dex */
public final class b implements f.e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.Object] */
    @Override // com.squareup.moshi.f.e
    public f<?> a(Type type, Set<? extends Annotation> annotations, k moshi) {
        Object obj;
        Iterator it;
        Type javaType;
        ?? r12;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        boolean z10 = true;
        if (!annotations.isEmpty()) {
            return null;
        }
        Intrinsics.checkNotNullParameter(type, "<this>");
        Class<?> c10 = jd.k.c(type);
        Intrinsics.checkNotNullExpressionValue(c10, "getRawType(this)");
        if (c10.isInterface() || c10.isEnum()) {
            return null;
        }
        Class<Metadata> cls = c.f12789a;
        if (c10.isAnnotationPresent(c.f12789a) && !kd.c.e(c10)) {
            try {
                f<?> c11 = kd.c.c(moshi, type, c10);
                if (c11 != null) {
                    return c11;
                }
            } catch (RuntimeException e10) {
                if (!(e10.getCause() instanceof ClassNotFoundException)) {
                    throw e10;
                }
            }
            if (!c10.isLocalClass()) {
                KClass kotlinClass = JvmClassMappingKt.getKotlinClass(c10);
                if (!kotlinClass.isAbstract()) {
                    if (!kotlinClass.isInner()) {
                        if (kotlinClass.getObjectInstance() == null) {
                            if (!(!kotlinClass.isSealed())) {
                                StringBuilder m10 = a1.a.m("Cannot reflectively serialize sealed class ");
                                m10.append((Object) c10.getName());
                                m10.append(". Please register an adapter.");
                                throw new IllegalArgumentException(m10.toString().toString());
                            }
                            KFunction primaryConstructor = KClasses.getPrimaryConstructor(kotlinClass);
                            if (primaryConstructor == null) {
                                return null;
                            }
                            List<KParameter> parameters = primaryConstructor.getParameters();
                            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(parameters, 10)), 16));
                            for (Object obj2 : parameters) {
                                linkedHashMap.put(((KParameter) obj2).getName(), obj2);
                            }
                            KCallablesJvm.setAccessible(primaryConstructor, true);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            Iterator it2 = KClasses.getMemberProperties(kotlinClass).iterator();
                            while (it2.hasNext()) {
                                KProperty1 kProperty1 = (KProperty1) it2.next();
                                KParameter kParameter = (KParameter) linkedHashMap.get(kProperty1.getName());
                                KCallablesJvm.setAccessible(kProperty1, z10);
                                Iterator it3 = kProperty1.getAnnotations().iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        obj = null;
                                        break;
                                    }
                                    obj = it3.next();
                                    if (((Annotation) obj) instanceof jd.f) {
                                        break;
                                    }
                                }
                                jd.f fVar = (jd.f) obj;
                                List mutableList = CollectionsKt.toMutableList((Collection) kProperty1.getAnnotations());
                                if (kParameter != null) {
                                    CollectionsKt.addAll(mutableList, kParameter.getAnnotations());
                                    if (fVar == null) {
                                        Iterator it4 = kParameter.getAnnotations().iterator();
                                        while (true) {
                                            if (!it4.hasNext()) {
                                                r12 = 0;
                                                break;
                                            }
                                            r12 = it4.next();
                                            if (((Annotation) r12) instanceof jd.f) {
                                                break;
                                            }
                                        }
                                        fVar = r12;
                                    }
                                }
                                Field javaField = ReflectJvmMapping.getJavaField(kProperty1);
                                if (Modifier.isTransient(javaField == null ? 0 : javaField.getModifiers())) {
                                    if (!(kParameter == null || kParameter.isOptional())) {
                                        throw new IllegalArgumentException(Intrinsics.stringPlus("No default value for transient constructor ", kParameter).toString());
                                    }
                                } else if (fVar != null && fVar.ignore() == z10) {
                                    if (!(kParameter == null || kParameter.isOptional())) {
                                        throw new IllegalArgumentException(Intrinsics.stringPlus("No default value for ignored constructor ", kParameter).toString());
                                    }
                                } else if (!(kParameter == null || Intrinsics.areEqual(kParameter.getType(), kProperty1.getReturnType()))) {
                                    StringBuilder m11 = a0.a.m('\'');
                                    m11.append(kProperty1.getName());
                                    m11.append("' has a constructor parameter of type ");
                                    Intrinsics.checkNotNull(kParameter);
                                    m11.append(kParameter.getType());
                                    m11.append(" but a property of type ");
                                    m11.append(kProperty1.getReturnType());
                                    m11.append('.');
                                    throw new IllegalArgumentException(m11.toString().toString());
                                } else if ((kProperty1 instanceof KMutableProperty1) || kParameter != null) {
                                    String str = (fVar == null || (str = fVar.name()) == null || Intrinsics.areEqual(str, "\u0000")) ? null : null;
                                    if (str == null) {
                                        str = kProperty1.getName();
                                    }
                                    String str2 = str;
                                    KClassifier classifier = kProperty1.getReturnType().getClassifier();
                                    if (classifier instanceof KClass) {
                                        KClass kClass = (KClass) classifier;
                                        if (kClass.isValue()) {
                                            javaType = JvmClassMappingKt.getJavaClass(kClass);
                                            if (kProperty1.getReturnType().getArguments().isEmpty()) {
                                                it = it2;
                                            } else {
                                                List<KTypeProjection> arguments = kProperty1.getReturnType().getArguments();
                                                ArrayList arrayList = new ArrayList();
                                                for (KTypeProjection kTypeProjection : arguments) {
                                                    KType type2 = kTypeProjection.getType();
                                                    Iterator it5 = it2;
                                                    Type javaType2 = type2 == null ? null : ReflectJvmMapping.getJavaType(type2);
                                                    if (javaType2 != null) {
                                                        arrayList.add(javaType2);
                                                    }
                                                    it2 = it5;
                                                }
                                                it = it2;
                                                Object[] array = arrayList.toArray(new Type[0]);
                                                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                                Type[] typeArr = (Type[]) array;
                                                javaType = jd.k.e(javaType, (Type[]) Arrays.copyOf(typeArr, typeArr.length));
                                            }
                                        } else {
                                            it = it2;
                                            javaType = ReflectJvmMapping.getJavaType(kProperty1.getReturnType());
                                        }
                                    } else {
                                        it = it2;
                                        if (!(classifier instanceof KTypeParameter)) {
                                            throw new IllegalStateException("Not possible!".toString());
                                        }
                                        javaType = ReflectJvmMapping.getJavaType(kProperty1.getReturnType());
                                    }
                                    Type i10 = kd.c.i(type, c10, javaType);
                                    Object[] array2 = mutableList.toArray(new Annotation[0]);
                                    Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                                    f adapter = moshi.d(i10, kd.c.f((Annotation[]) array2), kProperty1.getName());
                                    String name = kProperty1.getName();
                                    Intrinsics.checkNotNullExpressionValue(adapter, "adapter");
                                    linkedHashMap2.put(name, new a.C0203a(str2, adapter, kProperty1, kParameter, kParameter == null ? -1 : kParameter.getIndex()));
                                    z10 = true;
                                    it2 = it;
                                }
                                it = it2;
                                z10 = true;
                                it2 = it;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (KParameter kParameter2 : primaryConstructor.getParameters()) {
                                a.C0203a c0203a = (a.C0203a) linkedHashMap2.remove(kParameter2.getName());
                                if (!(c0203a != null || kParameter2.isOptional())) {
                                    throw new IllegalArgumentException(Intrinsics.stringPlus("No property for required constructor ", kParameter2).toString());
                                }
                                arrayList2.add(c0203a);
                            }
                            int size = arrayList2.size();
                            int i11 = size;
                            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                                a.C0203a c0203a2 = (a.C0203a) entry.getValue();
                                String jsonName = c0203a2.f12783a;
                                f adapter2 = c0203a2.f12784b;
                                KProperty1 property = c0203a2.f12785c;
                                KParameter kParameter3 = c0203a2.d;
                                Intrinsics.checkNotNullParameter(jsonName, "jsonName");
                                Intrinsics.checkNotNullParameter(adapter2, "adapter");
                                Intrinsics.checkNotNullParameter(property, "property");
                                arrayList2.add(new a.C0203a(jsonName, adapter2, property, kParameter3, i11));
                                i11++;
                            }
                            List<a.C0203a> filterNotNull = CollectionsKt.filterNotNull(arrayList2);
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(filterNotNull, 10));
                            for (a.C0203a c0203a3 : filterNotNull) {
                                arrayList3.add(c0203a3.f12783a);
                            }
                            Object[] array3 = arrayList3.toArray(new String[0]);
                            Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                            String[] strArr = (String[]) array3;
                            JsonReader.a options = JsonReader.a.a((String[]) Arrays.copyOf(strArr, strArr.length));
                            Intrinsics.checkNotNullExpressionValue(options, "options");
                            return new a(primaryConstructor, arrayList2, filterNotNull, options).nullSafe();
                        }
                        throw new IllegalArgumentException(Intrinsics.stringPlus("Cannot serialize object declaration ", c10.getName()).toString());
                    }
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Cannot serialize inner class ", c10.getName()).toString());
                }
                throw new IllegalArgumentException(Intrinsics.stringPlus("Cannot serialize abstract class ", c10.getName()).toString());
            }
            throw new IllegalArgumentException(Intrinsics.stringPlus("Cannot serialize local class or object expression ", c10.getName()).toString());
        }
        return null;
    }
}
