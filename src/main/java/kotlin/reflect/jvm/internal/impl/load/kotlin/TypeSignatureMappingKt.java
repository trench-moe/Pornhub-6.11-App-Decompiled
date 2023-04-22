package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeEnhancementUtilsKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;

/* loaded from: classes3.dex */
public final class TypeSignatureMappingKt {
    public static final <T> T boxTypeIfNeeded(JvmTypeFactory<T> jvmTypeFactory, T possiblyPrimitiveType, boolean z10) {
        Intrinsics.checkNotNullParameter(jvmTypeFactory, "<this>");
        Intrinsics.checkNotNullParameter(possiblyPrimitiveType, "possiblyPrimitiveType");
        return z10 ? jvmTypeFactory.boxType(possiblyPrimitiveType) : possiblyPrimitiveType;
    }

    public static final <T> T mapBuiltInType(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker type, JvmTypeFactory<T> typeFactory, TypeMappingMode mode) {
        Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(typeFactory, "typeFactory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        TypeConstructorMarker typeConstructor = typeSystemCommonBackendContext.typeConstructor(type);
        if (typeSystemCommonBackendContext.isClassTypeConstructor(typeConstructor)) {
            PrimitiveType primitiveType = typeSystemCommonBackendContext.getPrimitiveType(typeConstructor);
            boolean z10 = true;
            if (primitiveType != null) {
                T createPrimitiveType = typeFactory.createPrimitiveType(primitiveType);
                if (!typeSystemCommonBackendContext.isNullableType(type) && !TypeEnhancementUtilsKt.hasEnhancedNullability(typeSystemCommonBackendContext, type)) {
                    z10 = false;
                }
                return (T) boxTypeIfNeeded(typeFactory, createPrimitiveType, z10);
            }
            PrimitiveType primitiveArrayType = typeSystemCommonBackendContext.getPrimitiveArrayType(typeConstructor);
            if (primitiveArrayType != null) {
                return typeFactory.createFromString(Intrinsics.stringPlus("[", JvmPrimitiveType.get(primitiveArrayType).getDesc()));
            }
            if (typeSystemCommonBackendContext.isUnderKotlinPackage(typeConstructor)) {
                FqNameUnsafe classFqNameUnsafe = typeSystemCommonBackendContext.getClassFqNameUnsafe(typeConstructor);
                ClassId mapKotlinToJava = classFqNameUnsafe == null ? null : JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(classFqNameUnsafe);
                if (mapKotlinToJava != null) {
                    if (!mode.getKotlinCollectionsToJavaCollections()) {
                        List<JavaToKotlinClassMap.PlatformMutabilityMapping> mutabilityMappings = JavaToKotlinClassMap.INSTANCE.getMutabilityMappings();
                        if (!(mutabilityMappings instanceof Collection) || !mutabilityMappings.isEmpty()) {
                            for (JavaToKotlinClassMap.PlatformMutabilityMapping platformMutabilityMapping : mutabilityMappings) {
                                if (Intrinsics.areEqual(platformMutabilityMapping.getJavaClass(), mapKotlinToJava)) {
                                    break;
                                }
                            }
                        }
                        z10 = false;
                        if (z10) {
                            return null;
                        }
                    }
                    String internalName = JvmClassName.byClassId(mapKotlinToJava).getInternalName();
                    Intrinsics.checkNotNullExpressionValue(internalName, "byClassId(classId).internalName");
                    return typeFactory.createObjectType(internalName);
                }
            }
            return null;
        }
        return null;
    }
}
