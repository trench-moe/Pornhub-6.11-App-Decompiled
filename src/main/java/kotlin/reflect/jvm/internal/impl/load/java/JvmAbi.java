package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class JvmAbi {
    public static final JvmAbi INSTANCE = new JvmAbi();
    @JvmField
    public static final FqName JVM_FIELD_ANNOTATION_FQ_NAME = new FqName("kotlin.jvm.JvmField");
    private static final ClassId REFLECTION_FACTORY_IMPL;
    private static final ClassId REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION;

    static {
        ClassId classId = ClassId.topLevel(new FqName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(FqName(\"kotlin.….ReflectionFactoryImpl\"))");
        REFLECTION_FACTORY_IMPL = classId;
        ClassId fromString = ClassId.fromString("kotlin/jvm/internal/RepeatableContainer");
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(\"kotlin/jvm/i…nal/RepeatableContainer\")");
        REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION = fromString;
    }

    private JvmAbi() {
    }

    @JvmStatic
    public static final String getterName(String propertyName) {
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        return startsWithIsPrefix(propertyName) ? propertyName : Intrinsics.stringPlus("get", CapitalizeDecapitalizeKt.capitalizeAsciiOnly(propertyName));
    }

    @JvmStatic
    public static final boolean isGetterName(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.startsWith$default(name, "get", false, 2, (Object) null) || StringsKt.startsWith$default(name, "is", false, 2, (Object) null);
    }

    @JvmStatic
    public static final boolean isSetterName(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return StringsKt.startsWith$default(name, "set", false, 2, (Object) null);
    }

    @JvmStatic
    public static final String setterName(String propertyName) {
        String capitalizeAsciiOnly;
        Intrinsics.checkNotNullParameter(propertyName, "propertyName");
        if (startsWithIsPrefix(propertyName)) {
            capitalizeAsciiOnly = propertyName.substring(2);
            Intrinsics.checkNotNullExpressionValue(capitalizeAsciiOnly, "this as java.lang.String).substring(startIndex)");
        } else {
            capitalizeAsciiOnly = CapitalizeDecapitalizeKt.capitalizeAsciiOnly(propertyName);
        }
        return Intrinsics.stringPlus("set", capitalizeAsciiOnly);
    }

    @JvmStatic
    public static final boolean startsWithIsPrefix(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (StringsKt.startsWith$default(name, "is", false, 2, (Object) null) && name.length() != 2) {
            char charAt = name.charAt(2);
            return Intrinsics.compare(97, (int) charAt) > 0 || Intrinsics.compare((int) charAt, 122) > 0;
        }
        return false;
    }

    public final ClassId getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION() {
        return REPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION;
    }
}
