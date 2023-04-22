package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import a1.a;
import com.appsflyer.oaid.BuildConfig;
import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.FqNamesUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class JavaToKotlinClassMap {
    private static final ClassId CLASS_CLASS_ID;
    private static final ClassId FUNCTION_N_CLASS_ID;
    private static final FqName FUNCTION_N_FQ_NAME;
    public static final JavaToKotlinClassMap INSTANCE;
    private static final ClassId K_CLASS_CLASS_ID;
    private static final ClassId K_FUNCTION_CLASS_ID;
    private static final String NUMBERED_FUNCTION_PREFIX;
    private static final String NUMBERED_K_FUNCTION_PREFIX;
    private static final String NUMBERED_K_SUSPEND_FUNCTION_PREFIX;
    private static final String NUMBERED_SUSPEND_FUNCTION_PREFIX;
    private static final HashMap<FqNameUnsafe, ClassId> javaToKotlin;
    private static final HashMap<FqNameUnsafe, ClassId> kotlinToJava;
    private static final List<PlatformMutabilityMapping> mutabilityMappings;
    private static final HashMap<FqNameUnsafe, FqName> mutableToReadOnly;
    private static final HashMap<FqNameUnsafe, FqName> readOnlyToMutable;

    /* loaded from: classes3.dex */
    public static final class PlatformMutabilityMapping {
        private final ClassId javaClass;
        private final ClassId kotlinMutable;
        private final ClassId kotlinReadOnly;

        public PlatformMutabilityMapping(ClassId javaClass, ClassId kotlinReadOnly, ClassId kotlinMutable) {
            Intrinsics.checkNotNullParameter(javaClass, "javaClass");
            Intrinsics.checkNotNullParameter(kotlinReadOnly, "kotlinReadOnly");
            Intrinsics.checkNotNullParameter(kotlinMutable, "kotlinMutable");
            this.javaClass = javaClass;
            this.kotlinReadOnly = kotlinReadOnly;
            this.kotlinMutable = kotlinMutable;
        }

        public final ClassId component1() {
            return this.javaClass;
        }

        public final ClassId component2() {
            return this.kotlinReadOnly;
        }

        public final ClassId component3() {
            return this.kotlinMutable;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PlatformMutabilityMapping) {
                PlatformMutabilityMapping platformMutabilityMapping = (PlatformMutabilityMapping) obj;
                return Intrinsics.areEqual(this.javaClass, platformMutabilityMapping.javaClass) && Intrinsics.areEqual(this.kotlinReadOnly, platformMutabilityMapping.kotlinReadOnly) && Intrinsics.areEqual(this.kotlinMutable, platformMutabilityMapping.kotlinMutable);
            }
            return false;
        }

        public final ClassId getJavaClass() {
            return this.javaClass;
        }

        public int hashCode() {
            int hashCode = this.kotlinReadOnly.hashCode();
            return this.kotlinMutable.hashCode() + ((hashCode + (this.javaClass.hashCode() * 31)) * 31);
        }

        public String toString() {
            StringBuilder m10 = a.m("PlatformMutabilityMapping(javaClass=");
            m10.append(this.javaClass);
            m10.append(", kotlinReadOnly=");
            m10.append(this.kotlinReadOnly);
            m10.append(", kotlinMutable=");
            m10.append(this.kotlinMutable);
            m10.append(')');
            return m10.toString();
        }
    }

    static {
        JavaToKotlinClassMap javaToKotlinClassMap = new JavaToKotlinClassMap();
        INSTANCE = javaToKotlinClassMap;
        StringBuilder sb2 = new StringBuilder();
        FunctionClassKind functionClassKind = FunctionClassKind.Function;
        sb2.append(functionClassKind.getPackageFqName().toString());
        sb2.append('.');
        sb2.append(functionClassKind.getClassNamePrefix());
        NUMBERED_FUNCTION_PREFIX = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        FunctionClassKind functionClassKind2 = FunctionClassKind.KFunction;
        sb3.append(functionClassKind2.getPackageFqName().toString());
        sb3.append('.');
        sb3.append(functionClassKind2.getClassNamePrefix());
        NUMBERED_K_FUNCTION_PREFIX = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        FunctionClassKind functionClassKind3 = FunctionClassKind.SuspendFunction;
        sb4.append(functionClassKind3.getPackageFqName().toString());
        sb4.append('.');
        sb4.append(functionClassKind3.getClassNamePrefix());
        NUMBERED_SUSPEND_FUNCTION_PREFIX = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        FunctionClassKind functionClassKind4 = FunctionClassKind.KSuspendFunction;
        sb5.append(functionClassKind4.getPackageFqName().toString());
        sb5.append('.');
        sb5.append(functionClassKind4.getClassNamePrefix());
        NUMBERED_K_SUSPEND_FUNCTION_PREFIX = sb5.toString();
        ClassId classId = ClassId.topLevel(new FqName("kotlin.jvm.functions.FunctionN"));
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(FqName(\"kotlin.jvm.functions.FunctionN\"))");
        FUNCTION_N_CLASS_ID = classId;
        FqName asSingleFqName = classId.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(asSingleFqName, "FUNCTION_N_CLASS_ID.asSingleFqName()");
        FUNCTION_N_FQ_NAME = asSingleFqName;
        ClassId classId2 = ClassId.topLevel(new FqName("kotlin.reflect.KFunction"));
        Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(FqName(\"kotlin.reflect.KFunction\"))");
        K_FUNCTION_CLASS_ID = classId2;
        ClassId classId3 = ClassId.topLevel(new FqName("kotlin.reflect.KClass"));
        Intrinsics.checkNotNullExpressionValue(classId3, "topLevel(FqName(\"kotlin.reflect.KClass\"))");
        K_CLASS_CLASS_ID = classId3;
        CLASS_CLASS_ID = javaToKotlinClassMap.classId(Class.class);
        javaToKotlin = new HashMap<>();
        kotlinToJava = new HashMap<>();
        mutableToReadOnly = new HashMap<>();
        readOnlyToMutable = new HashMap<>();
        ClassId classId4 = ClassId.topLevel(StandardNames.FqNames.iterable);
        Intrinsics.checkNotNullExpressionValue(classId4, "topLevel(FqNames.iterable)");
        FqName fqName = StandardNames.FqNames.mutableIterable;
        FqName packageFqName = classId4.getPackageFqName();
        FqName packageFqName2 = classId4.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName2, "kotlinReadOnly.packageFqName");
        FqName tail = FqNamesUtilKt.tail(fqName, packageFqName2);
        ClassId classId5 = new ClassId(packageFqName, tail, false);
        ClassId classId6 = ClassId.topLevel(StandardNames.FqNames.iterator);
        Intrinsics.checkNotNullExpressionValue(classId6, "topLevel(FqNames.iterator)");
        FqName fqName2 = StandardNames.FqNames.mutableIterator;
        FqName packageFqName3 = classId6.getPackageFqName();
        FqName packageFqName4 = classId6.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName4, "kotlinReadOnly.packageFqName");
        ClassId classId7 = new ClassId(packageFqName3, FqNamesUtilKt.tail(fqName2, packageFqName4), false);
        ClassId classId8 = ClassId.topLevel(StandardNames.FqNames.collection);
        Intrinsics.checkNotNullExpressionValue(classId8, "topLevel(FqNames.collection)");
        FqName fqName3 = StandardNames.FqNames.mutableCollection;
        FqName packageFqName5 = classId8.getPackageFqName();
        FqName packageFqName6 = classId8.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName6, "kotlinReadOnly.packageFqName");
        ClassId classId9 = new ClassId(packageFqName5, FqNamesUtilKt.tail(fqName3, packageFqName6), false);
        ClassId classId10 = ClassId.topLevel(StandardNames.FqNames.list);
        Intrinsics.checkNotNullExpressionValue(classId10, "topLevel(FqNames.list)");
        FqName fqName4 = StandardNames.FqNames.mutableList;
        FqName packageFqName7 = classId10.getPackageFqName();
        FqName packageFqName8 = classId10.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName8, "kotlinReadOnly.packageFqName");
        ClassId classId11 = new ClassId(packageFqName7, FqNamesUtilKt.tail(fqName4, packageFqName8), false);
        ClassId classId12 = ClassId.topLevel(StandardNames.FqNames.set);
        Intrinsics.checkNotNullExpressionValue(classId12, "topLevel(FqNames.set)");
        FqName fqName5 = StandardNames.FqNames.mutableSet;
        FqName packageFqName9 = classId12.getPackageFqName();
        FqName packageFqName10 = classId12.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName10, "kotlinReadOnly.packageFqName");
        ClassId classId13 = new ClassId(packageFqName9, FqNamesUtilKt.tail(fqName5, packageFqName10), false);
        ClassId classId14 = ClassId.topLevel(StandardNames.FqNames.listIterator);
        Intrinsics.checkNotNullExpressionValue(classId14, "topLevel(FqNames.listIterator)");
        FqName fqName6 = StandardNames.FqNames.mutableListIterator;
        FqName packageFqName11 = classId14.getPackageFqName();
        FqName packageFqName12 = classId14.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName12, "kotlinReadOnly.packageFqName");
        ClassId classId15 = new ClassId(packageFqName11, FqNamesUtilKt.tail(fqName6, packageFqName12), false);
        FqName fqName7 = StandardNames.FqNames.map;
        ClassId classId16 = ClassId.topLevel(fqName7);
        Intrinsics.checkNotNullExpressionValue(classId16, "topLevel(FqNames.map)");
        FqName fqName8 = StandardNames.FqNames.mutableMap;
        FqName packageFqName13 = classId16.getPackageFqName();
        FqName packageFqName14 = classId16.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName14, "kotlinReadOnly.packageFqName");
        ClassId classId17 = new ClassId(packageFqName13, FqNamesUtilKt.tail(fqName8, packageFqName14), false);
        ClassId createNestedClassId = ClassId.topLevel(fqName7).createNestedClassId(StandardNames.FqNames.mapEntry.shortName());
        Intrinsics.checkNotNullExpressionValue(createNestedClassId, "topLevel(FqNames.map).cr…mes.mapEntry.shortName())");
        FqName fqName9 = StandardNames.FqNames.mutableMapEntry;
        FqName packageFqName15 = createNestedClassId.getPackageFqName();
        FqName packageFqName16 = createNestedClassId.getPackageFqName();
        Intrinsics.checkNotNullExpressionValue(packageFqName16, "kotlinReadOnly.packageFqName");
        List<PlatformMutabilityMapping> listOf = CollectionsKt.listOf((Object[]) new PlatformMutabilityMapping[]{new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Iterable.class), classId4, classId5), new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Iterator.class), classId6, classId7), new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Collection.class), classId8, classId9), new PlatformMutabilityMapping(javaToKotlinClassMap.classId(List.class), classId10, classId11), new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Set.class), classId12, classId13), new PlatformMutabilityMapping(javaToKotlinClassMap.classId(ListIterator.class), classId14, classId15), new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Map.class), classId16, classId17), new PlatformMutabilityMapping(javaToKotlinClassMap.classId(Map.Entry.class), createNestedClassId, new ClassId(packageFqName15, FqNamesUtilKt.tail(fqName9, packageFqName16), false))});
        mutabilityMappings = listOf;
        javaToKotlinClassMap.addTopLevel(Object.class, StandardNames.FqNames.any);
        javaToKotlinClassMap.addTopLevel(String.class, StandardNames.FqNames.string);
        javaToKotlinClassMap.addTopLevel(CharSequence.class, StandardNames.FqNames.charSequence);
        javaToKotlinClassMap.addTopLevel(Throwable.class, StandardNames.FqNames.throwable);
        javaToKotlinClassMap.addTopLevel(Cloneable.class, StandardNames.FqNames.cloneable);
        javaToKotlinClassMap.addTopLevel(Number.class, StandardNames.FqNames.number);
        javaToKotlinClassMap.addTopLevel(Comparable.class, StandardNames.FqNames.comparable);
        javaToKotlinClassMap.addTopLevel(Enum.class, StandardNames.FqNames._enum);
        javaToKotlinClassMap.addTopLevel(Annotation.class, StandardNames.FqNames.annotation);
        for (PlatformMutabilityMapping platformMutabilityMapping : listOf) {
            INSTANCE.addMapping(platformMutabilityMapping);
        }
        JvmPrimitiveType[] values = JvmPrimitiveType.values();
        int length = values.length;
        int i10 = 0;
        while (i10 < length) {
            JvmPrimitiveType jvmPrimitiveType = values[i10];
            i10++;
            JavaToKotlinClassMap javaToKotlinClassMap2 = INSTANCE;
            ClassId classId18 = ClassId.topLevel(jvmPrimitiveType.getWrapperFqName());
            Intrinsics.checkNotNullExpressionValue(classId18, "topLevel(jvmType.wrapperFqName)");
            PrimitiveType primitiveType = jvmPrimitiveType.getPrimitiveType();
            Intrinsics.checkNotNullExpressionValue(primitiveType, "jvmType.primitiveType");
            ClassId classId19 = ClassId.topLevel(StandardNames.getPrimitiveFqName(primitiveType));
            Intrinsics.checkNotNullExpressionValue(classId19, "topLevel(StandardNames.g…e(jvmType.primitiveType))");
            javaToKotlinClassMap2.add(classId18, classId19);
        }
        for (ClassId classId20 : CompanionObjectMapping.INSTANCE.allClassesWithIntrinsicCompanions()) {
            JavaToKotlinClassMap javaToKotlinClassMap3 = INSTANCE;
            StringBuilder m10 = a.m("kotlin.jvm.internal.");
            m10.append(classId20.getShortClassName().asString());
            m10.append("CompanionObject");
            ClassId classId21 = ClassId.topLevel(new FqName(m10.toString()));
            Intrinsics.checkNotNullExpressionValue(classId21, "topLevel(FqName(\"kotlin.…g() + \"CompanionObject\"))");
            ClassId createNestedClassId2 = classId20.createNestedClassId(SpecialNames.DEFAULT_NAME_FOR_COMPANION_OBJECT);
            Intrinsics.checkNotNullExpressionValue(createNestedClassId2, "classId.createNestedClas…AME_FOR_COMPANION_OBJECT)");
            javaToKotlinClassMap3.add(classId21, createNestedClassId2);
        }
        for (int i11 = 0; i11 < 23; i11++) {
            JavaToKotlinClassMap javaToKotlinClassMap4 = INSTANCE;
            ClassId classId22 = ClassId.topLevel(new FqName(Intrinsics.stringPlus("kotlin.jvm.functions.Function", Integer.valueOf(i11))));
            Intrinsics.checkNotNullExpressionValue(classId22, "topLevel(FqName(\"kotlin.…m.functions.Function$i\"))");
            javaToKotlinClassMap4.add(classId22, StandardNames.getFunctionClassId(i11));
            javaToKotlinClassMap4.addKotlinToJava(new FqName(Intrinsics.stringPlus(NUMBERED_K_FUNCTION_PREFIX, Integer.valueOf(i11))), K_FUNCTION_CLASS_ID);
        }
        for (int i12 = 0; i12 < 22; i12++) {
            FunctionClassKind functionClassKind5 = FunctionClassKind.KSuspendFunction;
            INSTANCE.addKotlinToJava(new FqName(Intrinsics.stringPlus(functionClassKind5.getPackageFqName().toString() + '.' + functionClassKind5.getClassNamePrefix(), Integer.valueOf(i12))), K_FUNCTION_CLASS_ID);
        }
        JavaToKotlinClassMap javaToKotlinClassMap5 = INSTANCE;
        FqName safe = StandardNames.FqNames.nothing.toSafe();
        Intrinsics.checkNotNullExpressionValue(safe, "nothing.toSafe()");
        javaToKotlinClassMap5.addKotlinToJava(safe, javaToKotlinClassMap5.classId(Void.class));
    }

    private JavaToKotlinClassMap() {
    }

    private final void add(ClassId classId, ClassId classId2) {
        addJavaToKotlin(classId, classId2);
        FqName asSingleFqName = classId2.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(asSingleFqName, "kotlinClassId.asSingleFqName()");
        addKotlinToJava(asSingleFqName, classId);
    }

    private final void addJavaToKotlin(ClassId classId, ClassId classId2) {
        HashMap<FqNameUnsafe, ClassId> hashMap = javaToKotlin;
        FqNameUnsafe unsafe = classId.asSingleFqName().toUnsafe();
        Intrinsics.checkNotNullExpressionValue(unsafe, "javaClassId.asSingleFqName().toUnsafe()");
        hashMap.put(unsafe, classId2);
    }

    private final void addKotlinToJava(FqName fqName, ClassId classId) {
        HashMap<FqNameUnsafe, ClassId> hashMap = kotlinToJava;
        FqNameUnsafe unsafe = fqName.toUnsafe();
        Intrinsics.checkNotNullExpressionValue(unsafe, "kotlinFqNameUnsafe.toUnsafe()");
        hashMap.put(unsafe, classId);
    }

    private final void addMapping(PlatformMutabilityMapping platformMutabilityMapping) {
        ClassId component1 = platformMutabilityMapping.component1();
        ClassId component2 = platformMutabilityMapping.component2();
        ClassId component3 = platformMutabilityMapping.component3();
        add(component1, component2);
        FqName asSingleFqName = component3.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(asSingleFqName, "mutableClassId.asSingleFqName()");
        addKotlinToJava(asSingleFqName, component1);
        FqName asSingleFqName2 = component2.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(asSingleFqName2, "readOnlyClassId.asSingleFqName()");
        FqName asSingleFqName3 = component3.asSingleFqName();
        Intrinsics.checkNotNullExpressionValue(asSingleFqName3, "mutableClassId.asSingleFqName()");
        HashMap<FqNameUnsafe, FqName> hashMap = mutableToReadOnly;
        FqNameUnsafe unsafe = component3.asSingleFqName().toUnsafe();
        Intrinsics.checkNotNullExpressionValue(unsafe, "mutableClassId.asSingleFqName().toUnsafe()");
        hashMap.put(unsafe, asSingleFqName2);
        HashMap<FqNameUnsafe, FqName> hashMap2 = readOnlyToMutable;
        FqNameUnsafe unsafe2 = asSingleFqName2.toUnsafe();
        Intrinsics.checkNotNullExpressionValue(unsafe2, "readOnlyFqName.toUnsafe()");
        hashMap2.put(unsafe2, asSingleFqName3);
    }

    private final void addTopLevel(Class<?> cls, FqName fqName) {
        ClassId classId = classId(cls);
        ClassId classId2 = ClassId.topLevel(fqName);
        Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(kotlinFqName)");
        add(classId, classId2);
    }

    private final void addTopLevel(Class<?> cls, FqNameUnsafe fqNameUnsafe) {
        FqName safe = fqNameUnsafe.toSafe();
        Intrinsics.checkNotNullExpressionValue(safe, "kotlinFqName.toSafe()");
        addTopLevel(cls, safe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ClassId classId(Class<?> cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ClassId classId = ClassId.topLevel(new FqName(cls.getCanonicalName()));
            Intrinsics.checkNotNullExpressionValue(classId, "topLevel(FqName(clazz.canonicalName))");
            return classId;
        }
        ClassId createNestedClassId = classId(declaringClass).createNestedClassId(Name.identifier(cls.getSimpleName()));
        Intrinsics.checkNotNullExpressionValue(createNestedClassId, "classId(outer).createNes…tifier(clazz.simpleName))");
        return createNestedClassId;
    }

    private final boolean isKotlinFunctionWithBigArity(FqNameUnsafe fqNameUnsafe, String str) {
        Integer intOrNull;
        String asString = fqNameUnsafe.asString();
        Intrinsics.checkNotNullExpressionValue(asString, "kotlinFqName.asString()");
        String substringAfter = StringsKt.substringAfter(asString, str, BuildConfig.FLAVOR);
        return (substringAfter.length() > 0) && !StringsKt.startsWith$default((CharSequence) substringAfter, '0', false, 2, (Object) null) && (intOrNull = StringsKt.toIntOrNull(substringAfter)) != null && intOrNull.intValue() >= 23;
    }

    public final FqName getFUNCTION_N_FQ_NAME() {
        return FUNCTION_N_FQ_NAME;
    }

    public final List<PlatformMutabilityMapping> getMutabilityMappings() {
        return mutabilityMappings;
    }

    public final boolean isMutable(FqNameUnsafe fqNameUnsafe) {
        return mutableToReadOnly.containsKey(fqNameUnsafe);
    }

    public final boolean isReadOnly(FqNameUnsafe fqNameUnsafe) {
        return readOnlyToMutable.containsKey(fqNameUnsafe);
    }

    public final ClassId mapJavaToKotlin(FqName fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return javaToKotlin.get(fqName.toUnsafe());
    }

    public final ClassId mapKotlinToJava(FqNameUnsafe kotlinFqName) {
        Intrinsics.checkNotNullParameter(kotlinFqName, "kotlinFqName");
        if (!isKotlinFunctionWithBigArity(kotlinFqName, NUMBERED_FUNCTION_PREFIX) && !isKotlinFunctionWithBigArity(kotlinFqName, NUMBERED_SUSPEND_FUNCTION_PREFIX)) {
            if (!isKotlinFunctionWithBigArity(kotlinFqName, NUMBERED_K_FUNCTION_PREFIX) && !isKotlinFunctionWithBigArity(kotlinFqName, NUMBERED_K_SUSPEND_FUNCTION_PREFIX)) {
                return kotlinToJava.get(kotlinFqName);
            }
            return K_FUNCTION_CLASS_ID;
        }
        return FUNCTION_N_CLASS_ID;
    }

    public final FqName mutableToReadOnly(FqNameUnsafe fqNameUnsafe) {
        return mutableToReadOnly.get(fqNameUnsafe);
    }

    public final FqName readOnlyToMutable(FqNameUnsafe fqNameUnsafe) {
        return readOnlyToMutable.get(fqNameUnsafe);
    }
}
