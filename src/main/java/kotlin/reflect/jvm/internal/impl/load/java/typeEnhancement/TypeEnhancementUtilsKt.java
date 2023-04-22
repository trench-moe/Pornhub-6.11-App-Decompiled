package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNames;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;

/* loaded from: classes3.dex */
public final class TypeEnhancementUtilsKt {
    public static final JavaTypeQualifiers createJavaTypeQualifiers(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z10, boolean z11) {
        return (z11 && nullabilityQualifier == NullabilityQualifier.NOT_NULL) ? new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, true, z10) : new JavaTypeQualifiers(nullabilityQualifier, mutabilityQualifier, false, z10);
    }

    public static final boolean hasEnhancedNullability(TypeSystemCommonBackendContext typeSystemCommonBackendContext, KotlinTypeMarker type) {
        Intrinsics.checkNotNullParameter(typeSystemCommonBackendContext, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        FqName ENHANCED_NULLABILITY_ANNOTATION = JvmAnnotationNames.ENHANCED_NULLABILITY_ANNOTATION;
        Intrinsics.checkNotNullExpressionValue(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return typeSystemCommonBackendContext.hasAnnotation(type, ENHANCED_NULLABILITY_ANNOTATION);
    }

    public static final <T> T select(Set<? extends T> set, T low, T high, T t2, boolean z10) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(low, "low");
        Intrinsics.checkNotNullParameter(high, "high");
        if (!z10) {
            if (t2 != null) {
                set = CollectionsKt.toSet(SetsKt.plus(set, t2));
            }
            return (T) CollectionsKt.singleOrNull(set);
        }
        T t8 = set.contains(low) ? low : set.contains(high) ? high : null;
        if (Intrinsics.areEqual(t8, low) && Intrinsics.areEqual(t2, high)) {
            return null;
        }
        return t2 == null ? t8 : t2;
    }

    public static final NullabilityQualifier select(Set<? extends NullabilityQualifier> set, NullabilityQualifier nullabilityQualifier, boolean z10) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        return nullabilityQualifier == nullabilityQualifier2 ? nullabilityQualifier2 : (NullabilityQualifier) select(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier, z10);
    }
}
