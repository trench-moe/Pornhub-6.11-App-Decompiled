package kotlin.reflect.jvm.internal;

import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeParameterReference;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.ReflectProperties;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u000eH\u0016J\u0010\u0010\"\u001a\u0006\u0012\u0002\b\u00030#*\u00020$H\u0002J\u0010\u0010%\u001a\u0006\u0012\u0002\b\u00030&*\u00020'H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "container", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "(Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;", "isReified", BuildConfig.FLAVOR, "()Z", AppMeasurementSdk.ConditionalUserProperty.NAME, BuildConfig.FLAVOR, "getName", "()Ljava/lang/String;", "upperBounds", BuildConfig.FLAVOR, "Lkotlin/reflect/KType;", "getUpperBounds", "()Ljava/util/List;", "upperBounds$delegate", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "variance", "Lkotlin/reflect/KVariance;", "getVariance", "()Lkotlin/reflect/KVariance;", "equals", "other", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "getContainerClass", "Ljava/lang/Class;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/descriptors/DeserializedMemberDescriptor;", "toKClassImpl", "Lkotlin/reflect/jvm/internal/KClassImpl;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "kotlin-reflection"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KTypeParameterImpl implements KTypeParameter, KClassifierImpl {
    public static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(KTypeParameterImpl.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    private final KTypeParameterOwnerImpl container;
    private final TypeParameterDescriptor descriptor;
    private final ReflectProperties.LazySoftVal upperBounds$delegate;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public KTypeParameterImpl(KTypeParameterOwnerImpl kTypeParameterOwnerImpl, TypeParameterDescriptor descriptor) {
        KClassImpl<?> kClassImpl;
        Object accept;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.descriptor = descriptor;
        this.upperBounds$delegate = ReflectProperties.lazySoft(new Function0<List<? extends KTypeImpl>>() { // from class: kotlin.reflect.jvm.internal.KTypeParameterImpl$upperBounds$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends KTypeImpl> invoke() {
                List<KotlinType> upperBounds = KTypeParameterImpl.this.getDescriptor().getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "descriptor.upperBounds");
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(upperBounds, 10));
                for (KotlinType kotlinType : upperBounds) {
                    arrayList.add(new KTypeImpl(kotlinType, null, 2, null));
                }
                return arrayList;
            }
        });
        if (kTypeParameterOwnerImpl == null) {
            DeclarationDescriptor containingDeclaration = getDescriptor().getContainingDeclaration();
            Intrinsics.checkNotNullExpressionValue(containingDeclaration, "descriptor.containingDeclaration");
            if (containingDeclaration instanceof ClassDescriptor) {
                accept = toKClassImpl((ClassDescriptor) containingDeclaration);
            } else if (!(containingDeclaration instanceof CallableMemberDescriptor)) {
                throw new KotlinReflectionInternalError(Intrinsics.stringPlus("Unknown type parameter container: ", containingDeclaration));
            } else {
                DeclarationDescriptor containingDeclaration2 = ((CallableMemberDescriptor) containingDeclaration).getContainingDeclaration();
                Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "declaration.containingDeclaration");
                if (containingDeclaration2 instanceof ClassDescriptor) {
                    kClassImpl = toKClassImpl((ClassDescriptor) containingDeclaration2);
                } else {
                    DeserializedMemberDescriptor deserializedMemberDescriptor = containingDeclaration instanceof DeserializedMemberDescriptor ? (DeserializedMemberDescriptor) containingDeclaration : null;
                    if (deserializedMemberDescriptor == null) {
                        throw new KotlinReflectionInternalError(Intrinsics.stringPlus("Non-class callable descriptor must be deserialized: ", containingDeclaration));
                    }
                    kClassImpl = (KClassImpl) JvmClassMappingKt.getKotlinClass(getContainerClass(deserializedMemberDescriptor));
                }
                accept = containingDeclaration.accept(new CreateKCallableVisitor(kClassImpl), Unit.INSTANCE);
            }
            Intrinsics.checkNotNullExpressionValue(accept, "when (val declaration = … $declaration\")\n        }");
            kTypeParameterOwnerImpl = (KTypeParameterOwnerImpl) accept;
        }
        this.container = kTypeParameterOwnerImpl;
    }

    private final Class<?> getContainerClass(DeserializedMemberDescriptor deserializedMemberDescriptor) {
        DeserializedContainerSource containerSource = deserializedMemberDescriptor.getContainerSource();
        if (!(containerSource instanceof JvmPackagePartSource)) {
            containerSource = null;
        }
        JvmPackagePartSource jvmPackagePartSource = (JvmPackagePartSource) containerSource;
        KotlinJvmBinaryClass knownJvmBinaryClass = jvmPackagePartSource == null ? null : jvmPackagePartSource.getKnownJvmBinaryClass();
        ReflectKotlinClass reflectKotlinClass = knownJvmBinaryClass instanceof ReflectKotlinClass ? knownJvmBinaryClass : null;
        if (reflectKotlinClass != null) {
            return reflectKotlinClass.getKlass();
        }
        throw new KotlinReflectionInternalError(Intrinsics.stringPlus("Container of deserialized member is not resolved: ", deserializedMemberDescriptor));
    }

    private final KClassImpl<?> toKClassImpl(ClassDescriptor classDescriptor) {
        Class<?> javaClass = UtilKt.toJavaClass(classDescriptor);
        KClassImpl<?> kClassImpl = (KClassImpl) (javaClass == null ? null : JvmClassMappingKt.getKotlinClass(javaClass));
        if (kClassImpl != null) {
            return kClassImpl;
        }
        throw new KotlinReflectionInternalError(Intrinsics.stringPlus("Type parameter container is not resolved: ", classDescriptor.getContainingDeclaration()));
    }

    public boolean equals(Object obj) {
        if (obj instanceof KTypeParameterImpl) {
            KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) obj;
            if (Intrinsics.areEqual(this.container, kTypeParameterImpl.container) && Intrinsics.areEqual(getName(), kTypeParameterImpl.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.KClassifierImpl
    public TypeParameterDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlin.reflect.KTypeParameter
    public String getName() {
        String asString = getDescriptor().getName().asString();
        Intrinsics.checkNotNullExpressionValue(asString, "descriptor.name.asString()");
        return asString;
    }

    @Override // kotlin.reflect.KTypeParameter
    public List<KType> getUpperBounds() {
        T value = this.upperBounds$delegate.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "<get-upperBounds>(...)");
        return (List) value;
    }

    @Override // kotlin.reflect.KTypeParameter
    public KVariance getVariance() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[getDescriptor().getVariance().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return KVariance.OUT;
                }
                throw new NoWhenBranchMatchedException();
            }
            return KVariance.IN;
        }
        return KVariance.INVARIANT;
    }

    public int hashCode() {
        return getName().hashCode() + (this.container.hashCode() * 31);
    }

    @Override // kotlin.reflect.KTypeParameter
    public boolean isReified() {
        return getDescriptor().isReified();
    }

    public String toString() {
        return TypeParameterReference.Companion.toString(this);
    }
}
