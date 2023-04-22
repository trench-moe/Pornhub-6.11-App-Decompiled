package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import a1.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes3.dex */
public final class TypeParameterUpperBoundEraser {
    private final Lazy erroneousErasedBound$delegate;
    private final MemoizedFunctionToNotNull<DataToEraseUpperBound, KotlinType> getErasedUpperBound;
    private final RawSubstitution rawSubstitution;
    private final LockBasedStorageManager storage;

    /* loaded from: classes3.dex */
    public static final class DataToEraseUpperBound {
        private final boolean isRaw;
        private final JavaTypeAttributes typeAttr;
        private final TypeParameterDescriptor typeParameter;

        public DataToEraseUpperBound(TypeParameterDescriptor typeParameter, boolean z10, JavaTypeAttributes typeAttr) {
            Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
            Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
            this.typeParameter = typeParameter;
            this.isRaw = z10;
            this.typeAttr = typeAttr;
        }

        public boolean equals(Object obj) {
            if (obj instanceof DataToEraseUpperBound) {
                DataToEraseUpperBound dataToEraseUpperBound = (DataToEraseUpperBound) obj;
                return Intrinsics.areEqual(dataToEraseUpperBound.typeParameter, this.typeParameter) && dataToEraseUpperBound.isRaw == this.isRaw && dataToEraseUpperBound.typeAttr.getFlexibility() == this.typeAttr.getFlexibility() && dataToEraseUpperBound.typeAttr.getHowThisTypeIsUsed() == this.typeAttr.getHowThisTypeIsUsed() && dataToEraseUpperBound.typeAttr.isForAnnotationParameter() == this.typeAttr.isForAnnotationParameter() && Intrinsics.areEqual(dataToEraseUpperBound.typeAttr.getDefaultType(), this.typeAttr.getDefaultType());
            }
            return false;
        }

        public final JavaTypeAttributes getTypeAttr() {
            return this.typeAttr;
        }

        public final TypeParameterDescriptor getTypeParameter() {
            return this.typeParameter;
        }

        public int hashCode() {
            int hashCode = this.typeParameter.hashCode();
            int i10 = (hashCode * 31) + (this.isRaw ? 1 : 0) + hashCode;
            int hashCode2 = this.typeAttr.getFlexibility().hashCode() + (i10 * 31) + i10;
            int hashCode3 = this.typeAttr.getHowThisTypeIsUsed().hashCode() + (hashCode2 * 31) + hashCode2;
            int i11 = (hashCode3 * 31) + (this.typeAttr.isForAnnotationParameter() ? 1 : 0) + hashCode3;
            int i12 = i11 * 31;
            SimpleType defaultType = this.typeAttr.getDefaultType();
            return i12 + (defaultType == null ? 0 : defaultType.hashCode()) + i11;
        }

        public final boolean isRaw() {
            return this.isRaw;
        }

        public String toString() {
            StringBuilder m10 = a.m("DataToEraseUpperBound(typeParameter=");
            m10.append(this.typeParameter);
            m10.append(", isRaw=");
            m10.append(this.isRaw);
            m10.append(", typeAttr=");
            m10.append(this.typeAttr);
            m10.append(')');
            return m10.toString();
        }
    }

    public TypeParameterUpperBoundEraser() {
        this(null, 1, null);
    }

    public TypeParameterUpperBoundEraser(RawSubstitution rawSubstitution) {
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasion results");
        this.storage = lockBasedStorageManager;
        this.erroneousErasedBound$delegate = LazyKt.lazy(new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.TypeParameterUpperBoundEraser$erroneousErasedBound$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final SimpleType invoke() {
                StringBuilder m10 = a.m("Can't compute erased upper bound of type parameter `");
                m10.append(TypeParameterUpperBoundEraser.this);
                m10.append('`');
                return ErrorUtils.createErrorType(m10.toString());
            }
        });
        this.rawSubstitution = rawSubstitution == null ? new RawSubstitution(this) : rawSubstitution;
        MemoizedFunctionToNotNull<DataToEraseUpperBound, KotlinType> createMemoizedFunction = lockBasedStorageManager.createMemoizedFunction(new Function1<DataToEraseUpperBound, KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.TypeParameterUpperBoundEraser$getErasedUpperBound$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final KotlinType invoke(TypeParameterUpperBoundEraser.DataToEraseUpperBound dataToEraseUpperBound) {
                KotlinType erasedUpperBoundInternal;
                erasedUpperBoundInternal = TypeParameterUpperBoundEraser.this.getErasedUpperBoundInternal(dataToEraseUpperBound.getTypeParameter(), dataToEraseUpperBound.isRaw(), dataToEraseUpperBound.getTypeAttr());
                return erasedUpperBoundInternal;
            }
        });
        Intrinsics.checkNotNullExpressionValue(createMemoizedFunction, "storage.createMemoizedFu… isRaw, typeAttr) }\n    }");
        this.getErasedUpperBound = createMemoizedFunction;
    }

    public /* synthetic */ TypeParameterUpperBoundEraser(RawSubstitution rawSubstitution, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : rawSubstitution);
    }

    private final KotlinType getDefaultType(JavaTypeAttributes javaTypeAttributes) {
        SimpleType defaultType = javaTypeAttributes.getDefaultType();
        if (defaultType == null) {
            SimpleType erroneousErasedBound = getErroneousErasedBound();
            Intrinsics.checkNotNullExpressionValue(erroneousErasedBound, "erroneousErasedBound");
            return erroneousErasedBound;
        }
        return TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KotlinType getErasedUpperBoundInternal(TypeParameterDescriptor typeParameterDescriptor, boolean z10, JavaTypeAttributes javaTypeAttributes) {
        TypeProjection computeProjection;
        Set<TypeParameterDescriptor> visitedTypeParameters = javaTypeAttributes.getVisitedTypeParameters();
        if (visitedTypeParameters != null && visitedTypeParameters.contains(typeParameterDescriptor.getOriginal())) {
            return getDefaultType(javaTypeAttributes);
        }
        SimpleType defaultType = typeParameterDescriptor.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "typeParameter.defaultType");
        Set<TypeParameterDescriptor> extractTypeParametersFromUpperBounds = TypeUtilsKt.extractTypeParametersFromUpperBounds(defaultType, visitedTypeParameters);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(extractTypeParametersFromUpperBounds, 10)), 16));
        for (TypeParameterDescriptor typeParameterDescriptor2 : extractTypeParametersFromUpperBounds) {
            if (visitedTypeParameters == null || !visitedTypeParameters.contains(typeParameterDescriptor2)) {
                RawSubstitution rawSubstitution = this.rawSubstitution;
                JavaTypeAttributes withFlexibility = z10 ? javaTypeAttributes : javaTypeAttributes.withFlexibility(JavaTypeFlexibility.INFLEXIBLE);
                KotlinType erasedUpperBound$descriptors_jvm = getErasedUpperBound$descriptors_jvm(typeParameterDescriptor2, z10, javaTypeAttributes.withNewVisitedTypeParameter(typeParameterDescriptor));
                Intrinsics.checkNotNullExpressionValue(erasedUpperBound$descriptors_jvm, "getErasedUpperBound(it, …Parameter(typeParameter))");
                computeProjection = rawSubstitution.computeProjection(typeParameterDescriptor2, withFlexibility, erasedUpperBound$descriptors_jvm);
            } else {
                computeProjection = JavaTypeResolverKt.makeStarProjection(typeParameterDescriptor2, javaTypeAttributes);
            }
            Pair pair = TuplesKt.to(typeParameterDescriptor2.getTypeConstructor(), computeProjection);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        TypeSubstitutor create = TypeSubstitutor.create(TypeConstructorSubstitution.Companion.createByConstructorsMap$default(TypeConstructorSubstitution.Companion, linkedHashMap, false, 2, null));
        Intrinsics.checkNotNullExpressionValue(create, "create(TypeConstructorSu…rsMap(erasedUpperBounds))");
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "typeParameter.upperBounds");
        KotlinType firstUpperBound = (KotlinType) CollectionsKt.first((List<? extends Object>) upperBounds);
        if (firstUpperBound.getConstructor().mo1278getDeclarationDescriptor() instanceof ClassDescriptor) {
            Intrinsics.checkNotNullExpressionValue(firstUpperBound, "firstUpperBound");
            return TypeUtilsKt.replaceArgumentsWithStarProjectionOrMapped(firstUpperBound, create, linkedHashMap, Variance.OUT_VARIANCE, javaTypeAttributes.getVisitedTypeParameters());
        }
        Set<TypeParameterDescriptor> visitedTypeParameters2 = javaTypeAttributes.getVisitedTypeParameters();
        if (visitedTypeParameters2 == null) {
            visitedTypeParameters2 = SetsKt.setOf(this);
        }
        ClassifierDescriptor mo1278getDeclarationDescriptor = firstUpperBound.getConstructor().mo1278getDeclarationDescriptor();
        Objects.requireNonNull(mo1278getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        while (true) {
            TypeParameterDescriptor typeParameterDescriptor3 = (TypeParameterDescriptor) mo1278getDeclarationDescriptor;
            if (visitedTypeParameters2.contains(typeParameterDescriptor3)) {
                return getDefaultType(javaTypeAttributes);
            }
            List<KotlinType> upperBounds2 = typeParameterDescriptor3.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds2, "current.upperBounds");
            KotlinType nextUpperBound = (KotlinType) CollectionsKt.first((List<? extends Object>) upperBounds2);
            if (nextUpperBound.getConstructor().mo1278getDeclarationDescriptor() instanceof ClassDescriptor) {
                Intrinsics.checkNotNullExpressionValue(nextUpperBound, "nextUpperBound");
                return TypeUtilsKt.replaceArgumentsWithStarProjectionOrMapped(nextUpperBound, create, linkedHashMap, Variance.OUT_VARIANCE, javaTypeAttributes.getVisitedTypeParameters());
            }
            mo1278getDeclarationDescriptor = nextUpperBound.getConstructor().mo1278getDeclarationDescriptor();
            Objects.requireNonNull(mo1278getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
        }
    }

    private final SimpleType getErroneousErasedBound() {
        return (SimpleType) this.erroneousErasedBound$delegate.getValue();
    }

    public final KotlinType getErasedUpperBound$descriptors_jvm(TypeParameterDescriptor typeParameter, boolean z10, JavaTypeAttributes typeAttr) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(typeAttr, "typeAttr");
        return this.getErasedUpperBound.invoke(new DataToEraseUpperBound(typeParameter, z10, typeAttr));
    }
}
