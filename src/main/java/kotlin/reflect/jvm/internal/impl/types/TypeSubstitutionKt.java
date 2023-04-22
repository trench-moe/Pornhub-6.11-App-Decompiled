package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes3.dex */
public final class TypeSubstitutionKt {
    public static final SimpleType asSimpleType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        UnwrappedType unwrap = kotlinType.unwrap();
        SimpleType simpleType = unwrap instanceof SimpleType ? (SimpleType) unwrap : null;
        if (simpleType != null) {
            return simpleType;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("This is should be simple type: ", kotlinType).toString());
    }

    @JvmOverloads
    public static final KotlinType replace(KotlinType kotlinType, List<? extends TypeProjection> newArguments, Annotations newAnnotations) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        return replace$default(kotlinType, newArguments, newAnnotations, null, 4, null);
    }

    @JvmOverloads
    public static final KotlinType replace(KotlinType kotlinType, List<? extends TypeProjection> newArguments, Annotations newAnnotations, List<? extends TypeProjection> newArgumentsForUpperBound) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        Intrinsics.checkNotNullParameter(newArgumentsForUpperBound, "newArgumentsForUpperBound");
        if ((newArguments.isEmpty() || newArguments == kotlinType.getArguments()) && newAnnotations == kotlinType.getAnnotations()) {
            return kotlinType;
        }
        UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrap;
            return KotlinTypeFactory.flexibleType(replace(flexibleType.getLowerBound(), newArguments, newAnnotations), replace(flexibleType.getUpperBound(), newArgumentsForUpperBound, newAnnotations));
        } else if (unwrap instanceof SimpleType) {
            return replace((SimpleType) unwrap, newArguments, newAnnotations);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @JvmOverloads
    public static final SimpleType replace(SimpleType simpleType, List<? extends TypeProjection> newArguments, Annotations newAnnotations) {
        Intrinsics.checkNotNullParameter(simpleType, "<this>");
        Intrinsics.checkNotNullParameter(newArguments, "newArguments");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        return (newArguments.isEmpty() && newAnnotations == simpleType.getAnnotations()) ? simpleType : newArguments.isEmpty() ? simpleType.replaceAnnotations(newAnnotations) : KotlinTypeFactory.simpleType$default(newAnnotations, simpleType.getConstructor(), newArguments, simpleType.isMarkedNullable(), (KotlinTypeRefiner) null, 16, (Object) null);
    }

    public static /* synthetic */ KotlinType replace$default(KotlinType kotlinType, List list, Annotations annotations, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = kotlinType.getArguments();
        }
        if ((i10 & 2) != 0) {
            annotations = kotlinType.getAnnotations();
        }
        if ((i10 & 4) != 0) {
            list2 = list;
        }
        return replace(kotlinType, list, annotations, list2);
    }

    public static /* synthetic */ SimpleType replace$default(SimpleType simpleType, List list, Annotations annotations, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = simpleType.getArguments();
        }
        if ((i10 & 2) != 0) {
            annotations = simpleType.getAnnotations();
        }
        return replace(simpleType, (List<? extends TypeProjection>) list, annotations);
    }
}
