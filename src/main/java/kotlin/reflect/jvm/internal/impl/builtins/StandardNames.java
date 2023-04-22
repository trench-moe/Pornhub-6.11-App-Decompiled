package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* loaded from: classes3.dex */
public final class StandardNames {
    @JvmField
    public static final FqName ANNOTATION_PACKAGE_FQ_NAME;
    @JvmField
    public static final FqName BUILT_INS_PACKAGE_FQ_NAME;
    @JvmField
    public static final Set<FqName> BUILT_INS_PACKAGE_FQ_NAMES;
    @JvmField
    public static final Name BUILT_INS_PACKAGE_NAME;
    @JvmField
    public static final Name CHAR_CODE;
    @JvmField
    public static final FqName COLLECTIONS_PACKAGE_FQ_NAME;
    @JvmField
    public static final FqName CONTINUATION_INTERFACE_FQ_NAME;
    @JvmField
    public static final FqName COROUTINES_INTRINSICS_PACKAGE_FQ_NAME;
    @JvmField
    public static final FqName COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME;
    @JvmField
    public static final FqName COROUTINES_PACKAGE_FQ_NAME;
    @JvmField
    public static final Name ENUM_VALUES;
    @JvmField
    public static final Name ENUM_VALUE_OF;
    public static final StandardNames INSTANCE = new StandardNames();
    @JvmField
    public static final FqName KOTLIN_REFLECT_FQ_NAME;
    @JvmField
    public static final List<String> PREFIXES;
    @JvmField
    public static final FqName RANGES_PACKAGE_FQ_NAME;
    @JvmField
    public static final FqName RESULT_FQ_NAME;
    @JvmField
    public static final FqName TEXT_PACKAGE_FQ_NAME;

    /* loaded from: classes3.dex */
    public static final class FqNames {
        public static final FqNames INSTANCE;
        @JvmField
        public static final FqNameUnsafe _boolean;
        @JvmField
        public static final FqNameUnsafe _byte;
        @JvmField
        public static final FqNameUnsafe _char;
        @JvmField
        public static final FqNameUnsafe _double;
        @JvmField
        public static final FqNameUnsafe _enum;
        @JvmField
        public static final FqNameUnsafe _float;
        @JvmField
        public static final FqNameUnsafe _int;
        @JvmField
        public static final FqNameUnsafe _long;
        @JvmField
        public static final FqNameUnsafe _short;
        @JvmField
        public static final FqName annotation;
        @JvmField
        public static final FqName annotationRetention;
        @JvmField
        public static final FqName annotationTarget;
        @JvmField
        public static final FqNameUnsafe any;
        @JvmField
        public static final FqNameUnsafe array;
        @JvmField
        public static final Map<FqNameUnsafe, PrimitiveType> arrayClassFqNameToPrimitiveType;
        @JvmField
        public static final FqNameUnsafe charSequence;
        @JvmField
        public static final FqNameUnsafe cloneable;
        @JvmField
        public static final FqName collection;
        @JvmField
        public static final FqName comparable;
        @JvmField
        public static final FqName deprecated;
        @JvmField
        public static final FqName deprecatedSinceKotlin;
        @JvmField
        public static final FqName deprecationLevel;
        @JvmField
        public static final FqName extensionFunctionType;
        @JvmField
        public static final Map<FqNameUnsafe, PrimitiveType> fqNameToPrimitiveType;
        @JvmField
        public static final FqNameUnsafe functionSupertype;
        @JvmField
        public static final FqNameUnsafe intRange;
        @JvmField
        public static final FqName iterable;
        @JvmField
        public static final FqName iterator;
        @JvmField
        public static final FqNameUnsafe kCallable;
        @JvmField
        public static final FqNameUnsafe kClass;
        @JvmField
        public static final FqNameUnsafe kDeclarationContainer;
        @JvmField
        public static final FqNameUnsafe kMutableProperty0;
        @JvmField
        public static final FqNameUnsafe kMutableProperty1;
        @JvmField
        public static final FqNameUnsafe kMutableProperty2;
        @JvmField
        public static final FqNameUnsafe kMutablePropertyFqName;
        @JvmField
        public static final ClassId kProperty;
        @JvmField
        public static final FqNameUnsafe kProperty0;
        @JvmField
        public static final FqNameUnsafe kProperty1;
        @JvmField
        public static final FqNameUnsafe kProperty2;
        @JvmField
        public static final FqNameUnsafe kPropertyFqName;
        @JvmField
        public static final FqName list;
        @JvmField
        public static final FqName listIterator;
        @JvmField
        public static final FqNameUnsafe longRange;
        @JvmField
        public static final FqName map;
        @JvmField
        public static final FqName mapEntry;
        @JvmField
        public static final FqName mustBeDocumented;
        @JvmField
        public static final FqName mutableCollection;
        @JvmField
        public static final FqName mutableIterable;
        @JvmField
        public static final FqName mutableIterator;
        @JvmField
        public static final FqName mutableList;
        @JvmField
        public static final FqName mutableListIterator;
        @JvmField
        public static final FqName mutableMap;
        @JvmField
        public static final FqName mutableMapEntry;
        @JvmField
        public static final FqName mutableSet;
        @JvmField
        public static final FqNameUnsafe nothing;
        @JvmField
        public static final FqNameUnsafe number;
        @JvmField
        public static final FqName parameterName;
        @JvmField
        public static final Set<Name> primitiveArrayTypeShortNames;
        @JvmField
        public static final Set<Name> primitiveTypeShortNames;
        @JvmField
        public static final FqName publishedApi;
        @JvmField
        public static final FqName repeatable;
        @JvmField
        public static final FqName replaceWith;
        @JvmField
        public static final FqName retention;
        @JvmField
        public static final FqName set;
        @JvmField
        public static final FqNameUnsafe string;
        @JvmField
        public static final FqName suppress;
        @JvmField
        public static final FqName target;
        @JvmField
        public static final FqName throwable;
        @JvmField
        public static final ClassId uByte;
        @JvmField
        public static final FqName uByteArrayFqName;
        @JvmField
        public static final FqName uByteFqName;
        @JvmField
        public static final ClassId uInt;
        @JvmField
        public static final FqName uIntArrayFqName;
        @JvmField
        public static final FqName uIntFqName;
        @JvmField
        public static final ClassId uLong;
        @JvmField
        public static final FqName uLongArrayFqName;
        @JvmField
        public static final FqName uLongFqName;
        @JvmField
        public static final ClassId uShort;
        @JvmField
        public static final FqName uShortArrayFqName;
        @JvmField
        public static final FqName uShortFqName;
        @JvmField
        public static final FqNameUnsafe unit;
        @JvmField
        public static final FqName unsafeVariance;

        static {
            FqNames fqNames = new FqNames();
            INSTANCE = fqNames;
            any = fqNames.fqNameUnsafe("Any");
            nothing = fqNames.fqNameUnsafe("Nothing");
            cloneable = fqNames.fqNameUnsafe("Cloneable");
            suppress = fqNames.fqName("Suppress");
            unit = fqNames.fqNameUnsafe("Unit");
            charSequence = fqNames.fqNameUnsafe("CharSequence");
            string = fqNames.fqNameUnsafe("String");
            array = fqNames.fqNameUnsafe("Array");
            _boolean = fqNames.fqNameUnsafe("Boolean");
            _char = fqNames.fqNameUnsafe("Char");
            _byte = fqNames.fqNameUnsafe("Byte");
            _short = fqNames.fqNameUnsafe("Short");
            _int = fqNames.fqNameUnsafe("Int");
            _long = fqNames.fqNameUnsafe("Long");
            _float = fqNames.fqNameUnsafe("Float");
            _double = fqNames.fqNameUnsafe("Double");
            number = fqNames.fqNameUnsafe("Number");
            _enum = fqNames.fqNameUnsafe("Enum");
            functionSupertype = fqNames.fqNameUnsafe("Function");
            throwable = fqNames.fqName("Throwable");
            comparable = fqNames.fqName("Comparable");
            intRange = fqNames.rangesFqName("IntRange");
            longRange = fqNames.rangesFqName("LongRange");
            deprecated = fqNames.fqName("Deprecated");
            deprecatedSinceKotlin = fqNames.fqName("DeprecatedSinceKotlin");
            deprecationLevel = fqNames.fqName("DeprecationLevel");
            replaceWith = fqNames.fqName("ReplaceWith");
            extensionFunctionType = fqNames.fqName("ExtensionFunctionType");
            parameterName = fqNames.fqName("ParameterName");
            annotation = fqNames.fqName("Annotation");
            target = fqNames.annotationName("Target");
            annotationTarget = fqNames.annotationName("AnnotationTarget");
            annotationRetention = fqNames.annotationName("AnnotationRetention");
            retention = fqNames.annotationName("Retention");
            repeatable = fqNames.annotationName("Repeatable");
            mustBeDocumented = fqNames.annotationName("MustBeDocumented");
            unsafeVariance = fqNames.fqName("UnsafeVariance");
            publishedApi = fqNames.fqName("PublishedApi");
            iterator = fqNames.collectionsFqName("Iterator");
            iterable = fqNames.collectionsFqName("Iterable");
            collection = fqNames.collectionsFqName("Collection");
            list = fqNames.collectionsFqName("List");
            listIterator = fqNames.collectionsFqName("ListIterator");
            set = fqNames.collectionsFqName("Set");
            FqName collectionsFqName = fqNames.collectionsFqName("Map");
            map = collectionsFqName;
            FqName child = collectionsFqName.child(Name.identifier("Entry"));
            Intrinsics.checkNotNullExpressionValue(child, "map.child(Name.identifier(\"Entry\"))");
            mapEntry = child;
            mutableIterator = fqNames.collectionsFqName("MutableIterator");
            mutableIterable = fqNames.collectionsFqName("MutableIterable");
            mutableCollection = fqNames.collectionsFqName("MutableCollection");
            mutableList = fqNames.collectionsFqName("MutableList");
            mutableListIterator = fqNames.collectionsFqName("MutableListIterator");
            mutableSet = fqNames.collectionsFqName("MutableSet");
            FqName collectionsFqName2 = fqNames.collectionsFqName("MutableMap");
            mutableMap = collectionsFqName2;
            FqName child2 = collectionsFqName2.child(Name.identifier("MutableEntry"));
            Intrinsics.checkNotNullExpressionValue(child2, "mutableMap.child(Name.identifier(\"MutableEntry\"))");
            mutableMapEntry = child2;
            kClass = reflect("KClass");
            kCallable = reflect("KCallable");
            kProperty0 = reflect("KProperty0");
            kProperty1 = reflect("KProperty1");
            kProperty2 = reflect("KProperty2");
            kMutableProperty0 = reflect("KMutableProperty0");
            kMutableProperty1 = reflect("KMutableProperty1");
            kMutableProperty2 = reflect("KMutableProperty2");
            FqNameUnsafe reflect = reflect("KProperty");
            kPropertyFqName = reflect;
            kMutablePropertyFqName = reflect("KMutableProperty");
            ClassId classId = ClassId.topLevel(reflect.toSafe());
            Intrinsics.checkNotNullExpressionValue(classId, "topLevel(kPropertyFqName.toSafe())");
            kProperty = classId;
            kDeclarationContainer = reflect("KDeclarationContainer");
            FqName fqName = fqNames.fqName("UByte");
            uByteFqName = fqName;
            FqName fqName2 = fqNames.fqName("UShort");
            uShortFqName = fqName2;
            FqName fqName3 = fqNames.fqName("UInt");
            uIntFqName = fqName3;
            FqName fqName4 = fqNames.fqName("ULong");
            uLongFqName = fqName4;
            ClassId classId2 = ClassId.topLevel(fqName);
            Intrinsics.checkNotNullExpressionValue(classId2, "topLevel(uByteFqName)");
            uByte = classId2;
            ClassId classId3 = ClassId.topLevel(fqName2);
            Intrinsics.checkNotNullExpressionValue(classId3, "topLevel(uShortFqName)");
            uShort = classId3;
            ClassId classId4 = ClassId.topLevel(fqName3);
            Intrinsics.checkNotNullExpressionValue(classId4, "topLevel(uIntFqName)");
            uInt = classId4;
            ClassId classId5 = ClassId.topLevel(fqName4);
            Intrinsics.checkNotNullExpressionValue(classId5, "topLevel(uLongFqName)");
            uLong = classId5;
            uByteArrayFqName = fqNames.fqName("UByteArray");
            uShortArrayFqName = fqNames.fqName("UShortArray");
            uIntArrayFqName = fqNames.fqName("UIntArray");
            uLongArrayFqName = fqNames.fqName("ULongArray");
            HashSet newHashSetWithExpectedSize = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            PrimitiveType[] values = PrimitiveType.values();
            int length = values.length;
            int i10 = 0;
            int i11 = 0;
            while (i11 < length) {
                PrimitiveType primitiveType = values[i11];
                i11++;
                newHashSetWithExpectedSize.add(primitiveType.getTypeName());
            }
            primitiveTypeShortNames = newHashSetWithExpectedSize;
            HashSet newHashSetWithExpectedSize2 = CollectionsKt.newHashSetWithExpectedSize(PrimitiveType.values().length);
            PrimitiveType[] values2 = PrimitiveType.values();
            int length2 = values2.length;
            int i12 = 0;
            while (i12 < length2) {
                PrimitiveType primitiveType2 = values2[i12];
                i12++;
                newHashSetWithExpectedSize2.add(primitiveType2.getArrayTypeName());
            }
            primitiveArrayTypeShortNames = newHashSetWithExpectedSize2;
            HashMap newHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            PrimitiveType[] values3 = PrimitiveType.values();
            int length3 = values3.length;
            int i13 = 0;
            while (i13 < length3) {
                PrimitiveType primitiveType3 = values3[i13];
                i13++;
                FqNames fqNames2 = INSTANCE;
                String asString = primitiveType3.getTypeName().asString();
                Intrinsics.checkNotNullExpressionValue(asString, "primitiveType.typeName.asString()");
                newHashMapWithExpectedSize.put(fqNames2.fqNameUnsafe(asString), primitiveType3);
            }
            fqNameToPrimitiveType = newHashMapWithExpectedSize;
            HashMap newHashMapWithExpectedSize2 = CollectionsKt.newHashMapWithExpectedSize(PrimitiveType.values().length);
            PrimitiveType[] values4 = PrimitiveType.values();
            int length4 = values4.length;
            while (i10 < length4) {
                PrimitiveType primitiveType4 = values4[i10];
                i10++;
                FqNames fqNames3 = INSTANCE;
                String asString2 = primitiveType4.getArrayTypeName().asString();
                Intrinsics.checkNotNullExpressionValue(asString2, "primitiveType.arrayTypeName.asString()");
                newHashMapWithExpectedSize2.put(fqNames3.fqNameUnsafe(asString2), primitiveType4);
            }
            arrayClassFqNameToPrimitiveType = newHashMapWithExpectedSize2;
        }

        private FqNames() {
        }

        private final FqName annotationName(String str) {
            FqName child = StandardNames.ANNOTATION_PACKAGE_FQ_NAME.child(Name.identifier(str));
            Intrinsics.checkNotNullExpressionValue(child, "ANNOTATION_PACKAGE_FQ_NA…e.identifier(simpleName))");
            return child;
        }

        private final FqName collectionsFqName(String str) {
            FqName child = StandardNames.COLLECTIONS_PACKAGE_FQ_NAME.child(Name.identifier(str));
            Intrinsics.checkNotNullExpressionValue(child, "COLLECTIONS_PACKAGE_FQ_N…e.identifier(simpleName))");
            return child;
        }

        private final FqName fqName(String str) {
            FqName child = StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(Name.identifier(str));
            Intrinsics.checkNotNullExpressionValue(child, "BUILT_INS_PACKAGE_FQ_NAM…e.identifier(simpleName))");
            return child;
        }

        private final FqNameUnsafe fqNameUnsafe(String str) {
            FqNameUnsafe unsafe = fqName(str).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "fqName(simpleName).toUnsafe()");
            return unsafe;
        }

        private final FqNameUnsafe rangesFqName(String str) {
            FqNameUnsafe unsafe = StandardNames.RANGES_PACKAGE_FQ_NAME.child(Name.identifier(str)).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "RANGES_PACKAGE_FQ_NAME.c…r(simpleName)).toUnsafe()");
            return unsafe;
        }

        @JvmStatic
        public static final FqNameUnsafe reflect(String simpleName) {
            Intrinsics.checkNotNullParameter(simpleName, "simpleName");
            FqNameUnsafe unsafe = StandardNames.KOTLIN_REFLECT_FQ_NAME.child(Name.identifier(simpleName)).toUnsafe();
            Intrinsics.checkNotNullExpressionValue(unsafe, "KOTLIN_REFLECT_FQ_NAME.c…r(simpleName)).toUnsafe()");
            return unsafe;
        }
    }

    static {
        Name identifier = Name.identifier("values");
        Intrinsics.checkNotNullExpressionValue(identifier, "identifier(\"values\")");
        ENUM_VALUES = identifier;
        Name identifier2 = Name.identifier("valueOf");
        Intrinsics.checkNotNullExpressionValue(identifier2, "identifier(\"valueOf\")");
        ENUM_VALUE_OF = identifier2;
        Name identifier3 = Name.identifier("code");
        Intrinsics.checkNotNullExpressionValue(identifier3, "identifier(\"code\")");
        CHAR_CODE = identifier3;
        FqName fqName = new FqName("kotlin.coroutines");
        COROUTINES_PACKAGE_FQ_NAME = fqName;
        COROUTINES_JVM_INTERNAL_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.jvm.internal");
        COROUTINES_INTRINSICS_PACKAGE_FQ_NAME = new FqName("kotlin.coroutines.intrinsics");
        FqName child = fqName.child(Name.identifier("Continuation"));
        Intrinsics.checkNotNullExpressionValue(child, "COROUTINES_PACKAGE_FQ_NA…entifier(\"Continuation\"))");
        CONTINUATION_INTERFACE_FQ_NAME = child;
        RESULT_FQ_NAME = new FqName("kotlin.Result");
        FqName fqName2 = new FqName("kotlin.reflect");
        KOTLIN_REFLECT_FQ_NAME = fqName2;
        PREFIXES = kotlin.collections.CollectionsKt.listOf((Object[]) new String[]{"KProperty", "KMutableProperty", "KFunction", "KSuspendFunction"});
        Name identifier4 = Name.identifier("kotlin");
        Intrinsics.checkNotNullExpressionValue(identifier4, "identifier(\"kotlin\")");
        BUILT_INS_PACKAGE_NAME = identifier4;
        FqName fqName3 = FqName.topLevel(identifier4);
        Intrinsics.checkNotNullExpressionValue(fqName3, "topLevel(BUILT_INS_PACKAGE_NAME)");
        BUILT_INS_PACKAGE_FQ_NAME = fqName3;
        FqName child2 = fqName3.child(Name.identifier("annotation"));
        Intrinsics.checkNotNullExpressionValue(child2, "BUILT_INS_PACKAGE_FQ_NAM…identifier(\"annotation\"))");
        ANNOTATION_PACKAGE_FQ_NAME = child2;
        FqName child3 = fqName3.child(Name.identifier("collections"));
        Intrinsics.checkNotNullExpressionValue(child3, "BUILT_INS_PACKAGE_FQ_NAM…dentifier(\"collections\"))");
        COLLECTIONS_PACKAGE_FQ_NAME = child3;
        FqName child4 = fqName3.child(Name.identifier("ranges"));
        Intrinsics.checkNotNullExpressionValue(child4, "BUILT_INS_PACKAGE_FQ_NAM…ame.identifier(\"ranges\"))");
        RANGES_PACKAGE_FQ_NAME = child4;
        FqName child5 = fqName3.child(Name.identifier("text"));
        Intrinsics.checkNotNullExpressionValue(child5, "BUILT_INS_PACKAGE_FQ_NAM…(Name.identifier(\"text\"))");
        TEXT_PACKAGE_FQ_NAME = child5;
        FqName child6 = fqName3.child(Name.identifier("internal"));
        Intrinsics.checkNotNullExpressionValue(child6, "BUILT_INS_PACKAGE_FQ_NAM…e.identifier(\"internal\"))");
        BUILT_INS_PACKAGE_FQ_NAMES = SetsKt.setOf((Object[]) new FqName[]{fqName3, child3, child4, child2, fqName2, child6, fqName});
    }

    private StandardNames() {
    }

    @JvmStatic
    public static final ClassId getFunctionClassId(int i10) {
        return new ClassId(BUILT_INS_PACKAGE_FQ_NAME, Name.identifier(getFunctionName(i10)));
    }

    @JvmStatic
    public static final String getFunctionName(int i10) {
        return Intrinsics.stringPlus("Function", Integer.valueOf(i10));
    }

    @JvmStatic
    public static final FqName getPrimitiveFqName(PrimitiveType primitiveType) {
        Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
        FqName child = BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.getTypeName());
        Intrinsics.checkNotNullExpressionValue(child, "BUILT_INS_PACKAGE_FQ_NAM…d(primitiveType.typeName)");
        return child;
    }

    @JvmStatic
    public static final String getSuspendFunctionName(int i10) {
        return Intrinsics.stringPlus(FunctionClassKind.SuspendFunction.getClassNamePrefix(), Integer.valueOf(i10));
    }

    @JvmStatic
    public static final boolean isPrimitiveArray(FqNameUnsafe arrayFqName) {
        Intrinsics.checkNotNullParameter(arrayFqName, "arrayFqName");
        return FqNames.arrayClassFqNameToPrimitiveType.get(arrayFqName) != null;
    }
}
