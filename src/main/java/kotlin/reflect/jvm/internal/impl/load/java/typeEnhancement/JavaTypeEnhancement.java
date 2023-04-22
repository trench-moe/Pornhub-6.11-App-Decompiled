package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes3.dex */
public final class JavaTypeEnhancement {
    private final JavaResolverSettings javaResolverSettings;

    /* loaded from: classes3.dex */
    public static final class Result {
        private final int subtreeSize;
        private final KotlinType type;

        public Result(KotlinType kotlinType, int i10) {
            this.type = kotlinType;
            this.subtreeSize = i10;
        }

        public final int getSubtreeSize() {
            return this.subtreeSize;
        }

        public final KotlinType getType() {
            return this.type;
        }
    }

    /* loaded from: classes3.dex */
    public static final class SimpleResult {
        private final boolean forWarnings;
        private final int subtreeSize;
        private final SimpleType type;

        public SimpleResult(SimpleType simpleType, int i10, boolean z10) {
            this.type = simpleType;
            this.subtreeSize = i10;
            this.forWarnings = z10;
        }

        public final boolean getForWarnings() {
            return this.forWarnings;
        }

        public final int getSubtreeSize() {
            return this.subtreeSize;
        }

        public final SimpleType getType() {
            return this.type;
        }
    }

    public JavaTypeEnhancement(JavaResolverSettings javaResolverSettings) {
        Intrinsics.checkNotNullParameter(javaResolverSettings, "javaResolverSettings");
        this.javaResolverSettings = javaResolverSettings;
    }

    private final SimpleResult enhanceInflexible(SimpleType simpleType, Function1<? super Integer, JavaTypeQualifiers> function1, int i10, TypeComponentPosition typeComponentPosition, boolean z10, boolean z11) {
        ClassifierDescriptor mo1278getDeclarationDescriptor;
        ClassifierDescriptor enhanceMutability;
        Boolean enhancedNullability;
        EnhancedTypeAnnotations enhancedTypeAnnotations;
        EnhancedTypeAnnotations enhancedTypeAnnotations2;
        Annotations compositeAnnotationsOrSingle;
        boolean z12;
        boolean z13;
        boolean z14;
        Result result;
        TypeProjection makeStarProjection;
        Function1<? super Integer, JavaTypeQualifiers> function12 = function1;
        boolean shouldEnhance = TypeComponentPositionKt.shouldEnhance(typeComponentPosition);
        boolean z15 = (z11 && z10) ? false : true;
        KotlinType kotlinType = null;
        if ((shouldEnhance || !simpleType.getArguments().isEmpty()) && (mo1278getDeclarationDescriptor = simpleType.getConstructor().mo1278getDeclarationDescriptor()) != null) {
            JavaTypeQualifiers invoke = function12.invoke(Integer.valueOf(i10));
            enhanceMutability = TypeEnhancementKt.enhanceMutability(mo1278getDeclarationDescriptor, invoke, typeComponentPosition);
            enhancedNullability = TypeEnhancementKt.getEnhancedNullability(invoke, typeComponentPosition);
            TypeConstructor constructor = enhanceMutability == null ? simpleType.getConstructor() : enhanceMutability.getTypeConstructor();
            Intrinsics.checkNotNullExpressionValue(constructor, "enhancedClassifier?.typeConstructor ?: constructor");
            int i11 = i10 + 1;
            List<TypeProjection> arguments = simpleType.getArguments();
            List<TypeParameterDescriptor> parameters = constructor.getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "typeConstructor.parameters");
            Iterator<T> it = arguments.iterator();
            Iterator<T> it2 = parameters.iterator();
            ArrayList<TypeProjection> arrayList = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(arguments, 10), CollectionsKt.collectionSizeOrDefault(parameters, 10)));
            while (it.hasNext() && it2.hasNext()) {
                Object next = it.next();
                TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) it2.next();
                TypeProjection typeProjection = (TypeProjection) next;
                if (z15) {
                    z14 = z15;
                    if (!typeProjection.isStarProjection()) {
                        result = enhancePossiblyFlexible(typeProjection.getType().unwrap(), function12, i11, z11);
                    } else if (function12.invoke(Integer.valueOf(i11)).getNullability() == NullabilityQualifier.FORCE_FLEXIBILITY) {
                        UnwrappedType unwrap = typeProjection.getType().unwrap();
                        result = new Result(KotlinTypeFactory.flexibleType(FlexibleTypesKt.lowerIfFlexible(unwrap).makeNullableAsSpecified(false), FlexibleTypesKt.upperIfFlexible(unwrap).makeNullableAsSpecified(true)), 1);
                    } else {
                        result = new Result(null, 1);
                    }
                } else {
                    z14 = z15;
                    result = new Result(kotlinType, 0);
                }
                i11 += result.getSubtreeSize();
                if (result.getType() != null) {
                    KotlinType type = result.getType();
                    Variance projectionKind = typeProjection.getProjectionKind();
                    Intrinsics.checkNotNullExpressionValue(projectionKind, "arg.projectionKind");
                    makeStarProjection = TypeUtilsKt.createProjection(type, projectionKind, typeParameterDescriptor);
                } else if (enhanceMutability == null || typeProjection.isStarProjection()) {
                    makeStarProjection = enhanceMutability != null ? TypeUtils.makeStarProjection(typeParameterDescriptor) : null;
                } else {
                    KotlinType type2 = typeProjection.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "arg.type");
                    Variance projectionKind2 = typeProjection.getProjectionKind();
                    Intrinsics.checkNotNullExpressionValue(projectionKind2, "arg.projectionKind");
                    makeStarProjection = TypeUtilsKt.createProjection(type2, projectionKind2, typeParameterDescriptor);
                }
                arrayList.add(makeStarProjection);
                function12 = function1;
                z15 = z14;
                kotlinType = null;
            }
            int i12 = i11 - i10;
            if (enhanceMutability == null && enhancedNullability == null) {
                if (!arrayList.isEmpty()) {
                    for (TypeProjection typeProjection2 : arrayList) {
                        if (typeProjection2 == null) {
                            z12 = true;
                            continue;
                        } else {
                            z12 = false;
                            continue;
                        }
                        if (!z12) {
                            z13 = false;
                            break;
                        }
                    }
                }
                z13 = true;
                if (z13) {
                    return new SimpleResult(null, i12, false);
                }
            }
            Annotations[] annotationsArr = new Annotations[3];
            annotationsArr[0] = simpleType.getAnnotations();
            enhancedTypeAnnotations = TypeEnhancementKt.ENHANCED_MUTABILITY_ANNOTATIONS;
            if (!(enhanceMutability != null)) {
                enhancedTypeAnnotations = null;
            }
            annotationsArr[1] = enhancedTypeAnnotations;
            enhancedTypeAnnotations2 = TypeEnhancementKt.ENHANCED_NULLABILITY_ANNOTATIONS;
            if (!(enhancedNullability != null)) {
                enhancedTypeAnnotations2 = null;
            }
            annotationsArr[2] = enhancedTypeAnnotations2;
            compositeAnnotationsOrSingle = TypeEnhancementKt.compositeAnnotationsOrSingle(CollectionsKt.listOfNotNull((Object[]) annotationsArr));
            List<TypeProjection> arguments2 = simpleType.getArguments();
            Iterator it3 = arrayList.iterator();
            Iterator<T> it4 = arguments2.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(CollectionsKt.collectionSizeOrDefault(arrayList, 10), CollectionsKt.collectionSizeOrDefault(arguments2, 10)));
            while (it3.hasNext() && it4.hasNext()) {
                Object next2 = it3.next();
                TypeProjection typeProjection3 = (TypeProjection) it4.next();
                TypeProjection typeProjection4 = (TypeProjection) next2;
                if (typeProjection4 != null) {
                    typeProjection3 = typeProjection4;
                }
                arrayList2.add(typeProjection3);
            }
            SimpleType simpleType$default = KotlinTypeFactory.simpleType$default(compositeAnnotationsOrSingle, constructor, arrayList2, enhancedNullability == null ? simpleType.isMarkedNullable() : enhancedNullability.booleanValue(), (KotlinTypeRefiner) null, 16, (Object) null);
            if (invoke.getDefinitelyNotNull()) {
                simpleType$default = notNullTypeParameter(simpleType$default);
            }
            return new SimpleResult(simpleType$default, i12, enhancedNullability != null && invoke.isNullabilityQualifierForWarning());
        }
        return new SimpleResult(null, 1, false);
    }

    public static /* synthetic */ SimpleResult enhanceInflexible$default(JavaTypeEnhancement javaTypeEnhancement, SimpleType simpleType, Function1 function1, int i10, TypeComponentPosition typeComponentPosition, boolean z10, boolean z11, int i11, Object obj) {
        return javaTypeEnhancement.enhanceInflexible(simpleType, function1, i10, typeComponentPosition, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? false : z11);
    }

    private final Result enhancePossiblyFlexible(UnwrappedType unwrappedType, Function1<? super Integer, JavaTypeQualifiers> function1, int i10, boolean z10) {
        KotlinType flexibleType;
        KotlinType kotlinType = null;
        if (KotlinTypeKt.isError(unwrappedType)) {
            return new Result(null, 1);
        }
        if (!(unwrappedType instanceof FlexibleType)) {
            if (unwrappedType instanceof SimpleType) {
                SimpleResult enhanceInflexible$default = enhanceInflexible$default(this, (SimpleType) unwrappedType, function1, i10, TypeComponentPosition.INFLEXIBLE, false, z10, 8, null);
                return new Result(enhanceInflexible$default.getForWarnings() ? TypeWithEnhancementKt.wrapEnhancement(unwrappedType, enhanceInflexible$default.getType()) : enhanceInflexible$default.getType(), enhanceInflexible$default.getSubtreeSize());
            }
            throw new NoWhenBranchMatchedException();
        }
        boolean z11 = unwrappedType instanceof RawType;
        FlexibleType flexibleType2 = (FlexibleType) unwrappedType;
        SimpleResult enhanceInflexible = enhanceInflexible(flexibleType2.getLowerBound(), function1, i10, TypeComponentPosition.FLEXIBLE_LOWER, z11, z10);
        SimpleResult enhanceInflexible2 = enhanceInflexible(flexibleType2.getUpperBound(), function1, i10, TypeComponentPosition.FLEXIBLE_UPPER, z11, z10);
        enhanceInflexible.getSubtreeSize();
        enhanceInflexible2.getSubtreeSize();
        if (enhanceInflexible.getType() != null || enhanceInflexible2.getType() != null) {
            if (enhanceInflexible.getForWarnings() || enhanceInflexible2.getForWarnings()) {
                SimpleType type = enhanceInflexible2.getType();
                if (type == null) {
                    flexibleType = enhanceInflexible.getType();
                    Intrinsics.checkNotNull(flexibleType);
                } else {
                    SimpleType type2 = enhanceInflexible.getType();
                    if (type2 == null) {
                        type2 = type;
                    }
                    flexibleType = KotlinTypeFactory.flexibleType(type2, type);
                }
                kotlinType = TypeWithEnhancementKt.wrapEnhancement(unwrappedType, flexibleType);
            } else if (z11) {
                SimpleType type3 = enhanceInflexible.getType();
                if (type3 == null) {
                    type3 = flexibleType2.getLowerBound();
                }
                SimpleType type4 = enhanceInflexible2.getType();
                if (type4 == null) {
                    type4 = flexibleType2.getUpperBound();
                }
                kotlinType = new RawTypeImpl(type3, type4);
            } else {
                SimpleType type5 = enhanceInflexible.getType();
                if (type5 == null) {
                    type5 = flexibleType2.getLowerBound();
                }
                SimpleType type6 = enhanceInflexible2.getType();
                if (type6 == null) {
                    type6 = flexibleType2.getUpperBound();
                }
                kotlinType = KotlinTypeFactory.flexibleType(type5, type6);
            }
        }
        return new Result(kotlinType, enhanceInflexible.getSubtreeSize());
    }

    private final SimpleType notNullTypeParameter(SimpleType simpleType) {
        return this.javaResolverSettings.getCorrectNullabilityForNotNullTypeParameter() ? SpecialTypesKt.makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType, true) : new NotNullTypeParameter(simpleType);
    }

    public final KotlinType enhance(KotlinType kotlinType, Function1<? super Integer, JavaTypeQualifiers> qualifiers, boolean z10) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
        return enhancePossiblyFlexible(kotlinType.unwrap(), qualifiers, 0, z10).getType();
    }
}
