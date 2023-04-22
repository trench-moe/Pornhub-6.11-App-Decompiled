package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* loaded from: classes3.dex */
public final class IntersectionTypeKt {
    public static final UnwrappedType intersectTypes(List<? extends UnwrappedType> types) {
        SimpleType lowerBound;
        Intrinsics.checkNotNullParameter(types, "types");
        int size = types.size();
        if (size != 0) {
            if (size != 1) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(types, 10));
                boolean z10 = false;
                boolean z11 = false;
                for (UnwrappedType unwrappedType : types) {
                    z10 = z10 || KotlinTypeKt.isError(unwrappedType);
                    if (unwrappedType instanceof SimpleType) {
                        lowerBound = (SimpleType) unwrappedType;
                    } else if (!(unwrappedType instanceof FlexibleType)) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        if (DynamicTypesKt.isDynamic(unwrappedType)) {
                            return unwrappedType;
                        }
                        lowerBound = ((FlexibleType) unwrappedType).getLowerBound();
                        z11 = true;
                    }
                    arrayList.add(lowerBound);
                }
                if (z10) {
                    SimpleType createErrorType = ErrorUtils.createErrorType(Intrinsics.stringPlus("Intersection of error types: ", types));
                    Intrinsics.checkNotNullExpressionValue(createErrorType, "createErrorType(\"Interse… of error types: $types\")");
                    return createErrorType;
                } else if (z11) {
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(types, 10));
                    for (UnwrappedType unwrappedType2 : types) {
                        arrayList2.add(FlexibleTypesKt.upperIfFlexible(unwrappedType2));
                    }
                    TypeIntersector typeIntersector = TypeIntersector.INSTANCE;
                    return KotlinTypeFactory.flexibleType(typeIntersector.intersectTypes$descriptors(arrayList), typeIntersector.intersectTypes$descriptors(arrayList2));
                } else {
                    return TypeIntersector.INSTANCE.intersectTypes$descriptors(arrayList);
                }
            }
            return (UnwrappedType) CollectionsKt.single((List<? extends Object>) types);
        }
        throw new IllegalStateException("Expected some types".toString());
    }
}
