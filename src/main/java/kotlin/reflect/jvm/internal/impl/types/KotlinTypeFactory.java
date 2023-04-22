package kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleAwareClassDescriptorKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes3.dex */
public final class KotlinTypeFactory {
    public static final KotlinTypeFactory INSTANCE = new KotlinTypeFactory();
    private static final Function1<KotlinTypeRefiner, SimpleType> EMPTY_REFINED_TYPE_FACTORY = new Function1() { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1
        @Override // kotlin.jvm.functions.Function1
        public final Void invoke(KotlinTypeRefiner noName_0) {
            Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
            return null;
        }
    };

    /* loaded from: classes3.dex */
    public static final class ExpandedTypeOrRefinedConstructor {
        private final SimpleType expandedType;
        private final TypeConstructor refinedConstructor;

        public ExpandedTypeOrRefinedConstructor(SimpleType simpleType, TypeConstructor typeConstructor) {
            this.expandedType = simpleType;
            this.refinedConstructor = typeConstructor;
        }

        public final SimpleType getExpandedType() {
            return this.expandedType;
        }

        public final TypeConstructor getRefinedConstructor() {
            return this.refinedConstructor;
        }
    }

    private KotlinTypeFactory() {
    }

    @JvmStatic
    public static final SimpleType computeExpandedType(TypeAliasDescriptor typeAliasDescriptor, List<? extends TypeProjection> arguments) {
        Intrinsics.checkNotNullParameter(typeAliasDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false).expand(TypeAliasExpansion.Companion.create(null, typeAliasDescriptor, arguments), Annotations.Companion.getEMPTY());
    }

    private final MemberScope computeMemberScope(TypeConstructor typeConstructor, List<? extends TypeProjection> list, KotlinTypeRefiner kotlinTypeRefiner) {
        ClassifierDescriptor mo1278getDeclarationDescriptor = typeConstructor.mo1278getDeclarationDescriptor();
        if (mo1278getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return ((TypeParameterDescriptor) mo1278getDeclarationDescriptor).getDefaultType().getMemberScope();
        }
        if (mo1278getDeclarationDescriptor instanceof ClassDescriptor) {
            if (kotlinTypeRefiner == null) {
                kotlinTypeRefiner = DescriptorUtilsKt.getKotlinTypeRefiner(DescriptorUtilsKt.getModule(mo1278getDeclarationDescriptor));
            }
            return list.isEmpty() ? ModuleAwareClassDescriptorKt.getRefinedUnsubstitutedMemberScopeIfPossible((ClassDescriptor) mo1278getDeclarationDescriptor, kotlinTypeRefiner) : ModuleAwareClassDescriptorKt.getRefinedMemberScopeIfPossible((ClassDescriptor) mo1278getDeclarationDescriptor, TypeConstructorSubstitution.Companion.create(typeConstructor, list), kotlinTypeRefiner);
        } else if (mo1278getDeclarationDescriptor instanceof TypeAliasDescriptor) {
            MemberScope createErrorScope = ErrorUtils.createErrorScope(Intrinsics.stringPlus("Scope for abbreviation: ", ((TypeAliasDescriptor) mo1278getDeclarationDescriptor).getName()), true);
            Intrinsics.checkNotNullExpressionValue(createErrorScope, "createErrorScope(\"Scope …{descriptor.name}\", true)");
            return createErrorScope;
        } else if (typeConstructor instanceof IntersectionTypeConstructor) {
            return ((IntersectionTypeConstructor) typeConstructor).createScopeForKotlinType();
        } else {
            throw new IllegalStateException("Unsupported classifier: " + mo1278getDeclarationDescriptor + " for constructor: " + typeConstructor);
        }
    }

    @JvmStatic
    public static final UnwrappedType flexibleType(SimpleType lowerBound, SimpleType upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        return Intrinsics.areEqual(lowerBound, upperBound) ? lowerBound : new FlexibleTypeImpl(lowerBound, upperBound);
    }

    @JvmStatic
    public static final SimpleType integerLiteralType(Annotations annotations, IntegerLiteralTypeConstructor constructor, boolean z10) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        List emptyList = CollectionsKt.emptyList();
        MemberScope createErrorScope = ErrorUtils.createErrorScope("Scope for integer literal type", true);
        Intrinsics.checkNotNullExpressionValue(createErrorScope, "createErrorScope(\"Scope …eger literal type\", true)");
        return simpleTypeWithNonTrivialMemberScope(annotations, constructor, emptyList, z10, createErrorScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExpandedTypeOrRefinedConstructor refineConstructor(TypeConstructor typeConstructor, KotlinTypeRefiner kotlinTypeRefiner, List<? extends TypeProjection> list) {
        ClassifierDescriptor mo1278getDeclarationDescriptor = typeConstructor.mo1278getDeclarationDescriptor();
        ClassifierDescriptor refineDescriptor = mo1278getDeclarationDescriptor == null ? null : kotlinTypeRefiner.refineDescriptor(mo1278getDeclarationDescriptor);
        if (refineDescriptor == null) {
            return null;
        }
        if (refineDescriptor instanceof TypeAliasDescriptor) {
            return new ExpandedTypeOrRefinedConstructor(computeExpandedType((TypeAliasDescriptor) refineDescriptor, list), null);
        }
        TypeConstructor refine = refineDescriptor.getTypeConstructor().refine(kotlinTypeRefiner);
        Intrinsics.checkNotNullExpressionValue(refine, "descriptor.typeConstruct…refine(kotlinTypeRefiner)");
        return new ExpandedTypeOrRefinedConstructor(null, refine);
    }

    @JvmStatic
    public static final SimpleType simpleNotNullType(Annotations annotations, ClassDescriptor descriptor, List<? extends TypeProjection> arguments) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        TypeConstructor typeConstructor = descriptor.getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "descriptor.typeConstructor");
        return simpleType$default(annotations, typeConstructor, (List) arguments, false, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    @JvmStatic
    @JvmOverloads
    public static final SimpleType simpleType(final Annotations annotations, final TypeConstructor constructor, final List<? extends TypeProjection> arguments, final boolean z10, KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (!annotations.isEmpty() || !arguments.isEmpty() || z10 || constructor.mo1278getDeclarationDescriptor() == null) {
            return simpleTypeWithNonTrivialMemberScope(annotations, constructor, arguments, z10, INSTANCE.computeMemberScope(constructor, arguments, kotlinTypeRefiner), new Function1<KotlinTypeRefiner, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$simpleType$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final SimpleType invoke(KotlinTypeRefiner refiner) {
                    KotlinTypeFactory.ExpandedTypeOrRefinedConstructor refineConstructor;
                    Intrinsics.checkNotNullParameter(refiner, "refiner");
                    refineConstructor = KotlinTypeFactory.INSTANCE.refineConstructor(TypeConstructor.this, refiner, arguments);
                    if (refineConstructor == null) {
                        return null;
                    }
                    SimpleType expandedType = refineConstructor.getExpandedType();
                    if (expandedType == null) {
                        Annotations annotations2 = annotations;
                        TypeConstructor refinedConstructor = refineConstructor.getRefinedConstructor();
                        Intrinsics.checkNotNull(refinedConstructor);
                        return KotlinTypeFactory.simpleType(annotations2, refinedConstructor, arguments, z10, refiner);
                    }
                    return expandedType;
                }
            });
        }
        ClassifierDescriptor mo1278getDeclarationDescriptor = constructor.mo1278getDeclarationDescriptor();
        Intrinsics.checkNotNull(mo1278getDeclarationDescriptor);
        SimpleType defaultType = mo1278getDeclarationDescriptor.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "constructor.declarationDescriptor!!.defaultType");
        return defaultType;
    }

    @JvmStatic
    public static final SimpleType simpleType(SimpleType baseType, Annotations annotations, TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z10) {
        Intrinsics.checkNotNullParameter(baseType, "baseType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return simpleType$default(annotations, constructor, arguments, z10, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    public static /* synthetic */ SimpleType simpleType$default(Annotations annotations, TypeConstructor typeConstructor, List list, boolean z10, KotlinTypeRefiner kotlinTypeRefiner, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            kotlinTypeRefiner = null;
        }
        return simpleType(annotations, typeConstructor, list, z10, kotlinTypeRefiner);
    }

    public static /* synthetic */ SimpleType simpleType$default(SimpleType simpleType, Annotations annotations, TypeConstructor typeConstructor, List list, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            annotations = simpleType.getAnnotations();
        }
        if ((i10 & 4) != 0) {
            typeConstructor = simpleType.getConstructor();
        }
        if ((i10 & 8) != 0) {
            list = simpleType.getArguments();
        }
        if ((i10 & 16) != 0) {
            z10 = simpleType.isMarkedNullable();
        }
        return simpleType(simpleType, annotations, typeConstructor, list, z10);
    }

    @JvmStatic
    public static final SimpleType simpleTypeWithNonTrivialMemberScope(final Annotations annotations, final TypeConstructor constructor, final List<? extends TypeProjection> arguments, final boolean z10, final MemberScope memberScope) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(constructor, arguments, z10, memberScope, new Function1<KotlinTypeRefiner, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final SimpleType invoke(KotlinTypeRefiner kotlinTypeRefiner) {
                KotlinTypeFactory.ExpandedTypeOrRefinedConstructor refineConstructor;
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                refineConstructor = KotlinTypeFactory.INSTANCE.refineConstructor(TypeConstructor.this, kotlinTypeRefiner, arguments);
                if (refineConstructor == null) {
                    return null;
                }
                SimpleType expandedType = refineConstructor.getExpandedType();
                if (expandedType == null) {
                    Annotations annotations2 = annotations;
                    TypeConstructor refinedConstructor = refineConstructor.getRefinedConstructor();
                    Intrinsics.checkNotNull(refinedConstructor);
                    return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(annotations2, refinedConstructor, arguments, z10, memberScope);
                }
                return expandedType;
            }
        });
        return annotations.isEmpty() ? simpleTypeImpl : new AnnotatedSimpleType(simpleTypeImpl, annotations);
    }

    @JvmStatic
    public static final SimpleType simpleTypeWithNonTrivialMemberScope(Annotations annotations, TypeConstructor constructor, List<? extends TypeProjection> arguments, boolean z10, MemberScope memberScope, Function1<? super KotlinTypeRefiner, ? extends SimpleType> refinedTypeFactory) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(refinedTypeFactory, "refinedTypeFactory");
        SimpleTypeImpl simpleTypeImpl = new SimpleTypeImpl(constructor, arguments, z10, memberScope, refinedTypeFactory);
        return annotations.isEmpty() ? simpleTypeImpl : new AnnotatedSimpleType(simpleTypeImpl, annotations);
    }
}
