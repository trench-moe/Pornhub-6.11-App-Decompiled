package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAnnotationNamesKt;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.PossiblyExternalAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypeWithEnhancement;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.RawType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes3.dex */
public final class SignatureEnhancement {
    private final AnnotationTypeQualifierResolver annotationTypeQualifierResolver;
    private final JavaTypeEnhancementState javaTypeEnhancementState;
    private final JavaTypeEnhancement typeEnhancement;

    /* loaded from: classes3.dex */
    public static class PartEnhancementResult {
        private final boolean containsFunctionN;
        private final KotlinType type;
        private final boolean wereChanges;

        public PartEnhancementResult(KotlinType type, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.wereChanges = z10;
            this.containsFunctionN = z11;
        }

        public final boolean getContainsFunctionN() {
            return this.containsFunctionN;
        }

        public final KotlinType getType() {
            return this.type;
        }

        public final boolean getWereChanges() {
            return this.wereChanges;
        }
    }

    /* loaded from: classes3.dex */
    public final class SignatureParts {
        private final AnnotationQualifierApplicabilityType containerApplicabilityType;
        private final LazyJavaResolverContext containerContext;
        private final Collection<KotlinType> fromOverridden;
        private final KotlinType fromOverride;
        private final boolean isCovariant;
        private final boolean isSuperTypesEnhancement;
        private final Annotated typeContainer;
        private final boolean typeParameterBounds;

        /* JADX WARN: Multi-variable type inference failed */
        public SignatureParts(SignatureEnhancement this$0, Annotated annotated, KotlinType fromOverride, Collection<? extends KotlinType> fromOverridden, boolean z10, LazyJavaResolverContext containerContext, AnnotationQualifierApplicabilityType containerApplicabilityType, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(fromOverride, "fromOverride");
            Intrinsics.checkNotNullParameter(fromOverridden, "fromOverridden");
            Intrinsics.checkNotNullParameter(containerContext, "containerContext");
            Intrinsics.checkNotNullParameter(containerApplicabilityType, "containerApplicabilityType");
            SignatureEnhancement.this = this$0;
            this.typeContainer = annotated;
            this.fromOverride = fromOverride;
            this.fromOverridden = fromOverridden;
            this.isCovariant = z10;
            this.containerContext = containerContext;
            this.containerApplicabilityType = containerApplicabilityType;
            this.typeParameterBounds = z11;
            this.isSuperTypesEnhancement = z12;
        }

        public /* synthetic */ SignatureParts(Annotated annotated, KotlinType kotlinType, Collection collection, boolean z10, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(SignatureEnhancement.this, annotated, kotlinType, collection, z10, lazyJavaResolverContext, annotationQualifierApplicabilityType, (i10 & 64) != 0 ? false : z11, (i10 & 128) != 0 ? false : z12);
        }

        private final NullabilityQualifierWithMigrationStatus boundsNullability(TypeParameterDescriptor typeParameterDescriptor) {
            boolean z10;
            boolean isNullabilityFlexible;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            if (typeParameterDescriptor instanceof LazyJavaTypeParameterDescriptor) {
                LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptor = (LazyJavaTypeParameterDescriptor) typeParameterDescriptor;
                List<KotlinType> upperBounds = lazyJavaTypeParameterDescriptor.getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "upperBounds");
                boolean z15 = false;
                boolean z16 = true;
                if (!(upperBounds instanceof Collection) || !upperBounds.isEmpty()) {
                    for (KotlinType kotlinType : upperBounds) {
                        if (!KotlinTypeKt.isError(kotlinType)) {
                            z10 = false;
                            break;
                        }
                    }
                }
                z10 = true;
                if (!z10) {
                    List<KotlinType> upperBounds2 = lazyJavaTypeParameterDescriptor.getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(upperBounds2, "upperBounds");
                    if (!(upperBounds2 instanceof Collection) || !upperBounds2.isEmpty()) {
                        for (KotlinType kotlinType2 : upperBounds2) {
                            isNullabilityFlexible = SignatureEnhancementKt.isNullabilityFlexible(kotlinType2);
                            if (!isNullabilityFlexible) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                    z11 = true;
                    if (!z11) {
                        List<KotlinType> upperBounds3 = lazyJavaTypeParameterDescriptor.getUpperBounds();
                        Intrinsics.checkNotNullExpressionValue(upperBounds3, "upperBounds");
                        if (!(upperBounds3 instanceof Collection) || !upperBounds3.isEmpty()) {
                            for (KotlinType it : upperBounds3) {
                                Intrinsics.checkNotNullExpressionValue(it, "it");
                                if (!KotlinTypeKt.isNullable(it)) {
                                    break;
                                }
                            }
                        }
                        z16 = false;
                        return new NullabilityQualifierWithMigrationStatus(z16 ? NullabilityQualifier.NOT_NULL : NullabilityQualifier.NULLABLE, false, 2, null);
                    }
                    List<KotlinType> upperBounds4 = lazyJavaTypeParameterDescriptor.getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(upperBounds4, "upperBounds");
                    if (!(upperBounds4 instanceof Collection) || !upperBounds4.isEmpty()) {
                        for (KotlinType kotlinType3 : upperBounds4) {
                            if (!(kotlinType3 instanceof FlexibleTypeWithEnhancement) || KotlinTypeKt.isNullable(((FlexibleTypeWithEnhancement) kotlinType3).getEnhancement())) {
                                z12 = false;
                                continue;
                            } else {
                                z12 = true;
                                continue;
                            }
                            if (z12) {
                                z13 = true;
                                break;
                            }
                        }
                    }
                    z13 = false;
                    if (z13) {
                        return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, true);
                    }
                    List<KotlinType> upperBounds5 = lazyJavaTypeParameterDescriptor.getUpperBounds();
                    Intrinsics.checkNotNullExpressionValue(upperBounds5, "upperBounds");
                    if (!(upperBounds5 instanceof Collection) || !upperBounds5.isEmpty()) {
                        Iterator<T> it2 = upperBounds5.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            KotlinType kotlinType4 = (KotlinType) it2.next();
                            if ((kotlinType4 instanceof FlexibleTypeWithEnhancement) && KotlinTypeKt.isNullable(((FlexibleTypeWithEnhancement) kotlinType4).getEnhancement())) {
                                z14 = true;
                                continue;
                            } else {
                                z14 = false;
                                continue;
                            }
                            if (z14) {
                                z15 = true;
                                break;
                            }
                        }
                    }
                    if (z15) {
                        return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, true);
                    }
                    return null;
                }
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers> computeIndexedQualifiersForOverride(boolean r18) {
            /*
                r17 = this;
                r8 = r17
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> r0 = r8.fromOverridden
                java.util.ArrayList r9 = new java.util.ArrayList
                r1 = 10
                int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r0, r1)
                r9.<init>(r1)
                java.util.Iterator r0 = r0.iterator()
            L13:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L27
                java.lang.Object r1 = r0.next()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r1
                java.util.List r1 = r8.toIndexed(r1)
                r9.add(r1)
                goto L13
            L27:
                kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r8.fromOverride
                java.util.List r10 = r8.toIndexed(r0)
                boolean r0 = r8.isCovariant
                r12 = 1
                if (r0 == 0) goto L60
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> r0 = r8.fromOverridden
                boolean r1 = r0 instanceof java.util.Collection
                if (r1 == 0) goto L40
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L40
            L3e:
                r0 = 0
                goto L5c
            L40:
                java.util.Iterator r0 = r0.iterator()
            L44:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L3e
                java.lang.Object r1 = r0.next()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r1
                kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker r2 = kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT
                kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r8.fromOverride
                boolean r1 = r2.equalTypes(r1, r3)
                r1 = r1 ^ r12
                if (r1 == 0) goto L44
                r0 = 1
            L5c:
                if (r0 == 0) goto L60
                r13 = 1
                goto L61
            L60:
                r13 = 0
            L61:
                if (r13 == 0) goto L65
                r14 = 1
                goto L6a
            L65:
                int r0 = r10.size()
                r14 = r0
            L6a:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[] r15 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers[r14]
                r7 = 0
            L6d:
                if (r7 >= r14) goto Lc4
                if (r7 != 0) goto L73
                r4 = 1
                goto L74
            L73:
                r4 = 0
            L74:
                java.lang.Object r0 = r10.get(r7)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers r0 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers) r0
                kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = r0.component1()
                kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers r3 = r0.component2()
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r5 = r0.component3()
                boolean r6 = r0.component4()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r0 = r9.iterator()
            L93:
                boolean r16 = r0.hasNext()
                if (r16 == 0) goto Lb6
                java.lang.Object r16 = r0.next()
                r11 = r16
                java.util.List r11 = (java.util.List) r11
                java.lang.Object r11 = kotlin.collections.CollectionsKt.getOrNull(r11, r7)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers r11 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.TypeAndDefaultQualifiers) r11
                if (r11 != 0) goto Lab
                r11 = 0
                goto Laf
            Lab:
                kotlin.reflect.jvm.internal.impl.types.KotlinType r11 = r11.getType()
            Laf:
                if (r11 != 0) goto Lb2
                goto L93
            Lb2:
                r2.add(r11)
                goto L93
            Lb6:
                r0 = r17
                r11 = r7
                r7 = r18
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r0 = r0.computeQualifiersForOverride(r1, r2, r3, r4, r5, r6, r7)
                r15[r11] = r0
                int r7 = r11 + 1
                goto L6d
            Lc4:
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1 r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$computeIndexedQualifiersForOverride$1
                r0.<init>()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeIndexedQualifiersForOverride(boolean):kotlin.jvm.functions.Function1");
        }

        private final NullabilityQualifierWithMigrationStatus computeNullabilityInfoInTheAbsenceOfExplicitAnnotation(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, JavaDefaultQualifiers javaDefaultQualifiers, TypeParameterDescriptor typeParameterDescriptor) {
            NullabilityQualifierWithMigrationStatus boundsNullability;
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2 = null;
            if (nullabilityQualifierWithMigrationStatus == null) {
                nullabilityQualifierWithMigrationStatus = javaDefaultQualifiers == null ? null : javaDefaultQualifiers.getNullabilityQualifier();
            }
            if (typeParameterDescriptor != null && (boundsNullability = boundsNullability(typeParameterDescriptor)) != null) {
                if (boundsNullability.getQualifier() == NullabilityQualifier.NULLABLE) {
                    boundsNullability = NullabilityQualifierWithMigrationStatus.copy$default(boundsNullability, NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null);
                }
                nullabilityQualifierWithMigrationStatus2 = boundsNullability;
            }
            return mostSpecific(nullabilityQualifierWithMigrationStatus2, nullabilityQualifierWithMigrationStatus);
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x013c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers computeQualifiersForOverride(kotlin.reflect.jvm.internal.impl.types.KotlinType r16, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> r17, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers r18, boolean r19, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r20, boolean r21, boolean r22) {
            /*
                Method dump skipped, instructions count: 322
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.computeQualifiersForOverride(kotlin.reflect.jvm.internal.impl.types.KotlinType, java.util.Collection, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers, boolean, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, boolean, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean enhance$containsFunctionN(UnwrappedType unwrappedType) {
            ClassifierDescriptor mo1278getDeclarationDescriptor = unwrappedType.getConstructor().mo1278getDeclarationDescriptor();
            if (mo1278getDeclarationDescriptor == null) {
                return false;
            }
            Name name = mo1278getDeclarationDescriptor.getName();
            JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
            return Intrinsics.areEqual(name, javaToKotlinClassMap.getFUNCTION_N_FQ_NAME().shortName()) && Intrinsics.areEqual(DescriptorUtilsKt.fqNameOrNull(mo1278getDeclarationDescriptor), javaToKotlinClassMap.getFUNCTION_N_FQ_NAME());
        }

        public static /* synthetic */ PartEnhancementResult enhance$default(SignatureParts signatureParts, TypeEnhancementInfo typeEnhancementInfo, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                typeEnhancementInfo = null;
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return signatureParts.enhance(typeEnhancementInfo, z10);
        }

        private final NullabilityQualifierWithMigrationStatus extractNullability(Annotations annotations, boolean z10, boolean z11) {
            SignatureEnhancement signatureEnhancement = SignatureEnhancement.this;
            Iterator<AnnotationDescriptor> it = annotations.iterator();
            NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus = null;
            while (it.hasNext()) {
                NullabilityQualifierWithMigrationStatus extractNullability = signatureEnhancement.extractNullability(it.next(), z10, z11);
                if (nullabilityQualifierWithMigrationStatus != null) {
                    if (extractNullability != null && !Intrinsics.areEqual(extractNullability, nullabilityQualifierWithMigrationStatus) && (!extractNullability.isForWarningOnly() || nullabilityQualifierWithMigrationStatus.isForWarningOnly())) {
                        if (extractNullability.isForWarningOnly() || !nullabilityQualifierWithMigrationStatus.isForWarningOnly()) {
                            return null;
                        }
                    }
                }
                nullabilityQualifierWithMigrationStatus = extractNullability;
            }
            return nullabilityQualifierWithMigrationStatus;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers extractQualifiers(kotlin.reflect.jvm.internal.impl.types.KotlinType r12) {
            /*
                r11 = this;
                boolean r0 = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(r12)
                if (r0 == 0) goto L18
                kotlin.reflect.jvm.internal.impl.types.FlexibleType r0 = kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.asFlexibleType(r12)
                kotlin.Pair r1 = new kotlin.Pair
                kotlin.reflect.jvm.internal.impl.types.SimpleType r2 = r0.getLowerBound()
                kotlin.reflect.jvm.internal.impl.types.SimpleType r0 = r0.getUpperBound()
                r1.<init>(r2, r0)
                goto L1d
            L18:
                kotlin.Pair r1 = new kotlin.Pair
                r1.<init>(r12, r12)
            L1d:
                java.lang.Object r0 = r1.component1()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r0
                java.lang.Object r1 = r1.component2()
                kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r1
                kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper r2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper.INSTANCE
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers r10 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers
                boolean r3 = r0.isMarkedNullable()
                r4 = 0
                if (r3 == 0) goto L38
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            L36:
                r5 = r3
                goto L42
            L38:
                boolean r3 = r1.isMarkedNullable()
                if (r3 != 0) goto L41
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
                goto L36
            L41:
                r5 = r4
            L42:
                boolean r0 = r2.isReadOnly(r0)
                if (r0 == 0) goto L4b
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
                goto L55
            L4b:
                boolean r0 = r2.isMutable(r1)
                if (r0 == 0) goto L54
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
                goto L55
            L54:
                r0 = r4
            L55:
                kotlin.reflect.jvm.internal.impl.types.UnwrappedType r1 = r12.unwrap()
                boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NotNullTypeParameter
                if (r1 != 0) goto L69
                kotlin.reflect.jvm.internal.impl.types.UnwrappedType r12 = r12.unwrap()
                boolean r12 = r12 instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType
                if (r12 == 0) goto L66
                goto L69
            L66:
                r12 = 0
                r6 = 0
                goto L6b
            L69:
                r12 = 1
                r6 = 1
            L6b:
                r7 = 0
                r8 = 8
                r9 = 0
                r3 = r10
                r4 = r5
                r5 = r0
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiers(kotlin.reflect.jvm.internal.impl.types.KotlinType):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers");
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
            if (r1.getQualifier() == kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00d9, code lost:
            r12 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00e8, code lost:
            if ((r13 != null && r13.getDefinitelyNotNull()) != false) goto L64;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers extractQualifiersFromAnnotations(kotlin.reflect.jvm.internal.impl.types.KotlinType r11, boolean r12, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers r13, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r14, boolean r15) {
            /*
                Method dump skipped, instructions count: 295
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.SignatureParts.extractQualifiersFromAnnotations(kotlin.reflect.jvm.internal.impl.types.KotlinType, boolean, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers, kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor, boolean):kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeQualifiers");
        }

        private static final <T> T extractQualifiersFromAnnotations$ifPresent(List<FqName> list, Annotations annotations, T t2) {
            boolean z10;
            boolean z11 = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (FqName fqName : list) {
                    if (annotations.mo1272findAnnotation(fqName) != null) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (z10) {
                        break;
                    }
                }
            }
            z11 = false;
            if (z11) {
                return t2;
            }
            return null;
        }

        private static final <T> T extractQualifiersFromAnnotations$uniqueNotNull(T t2, T t8) {
            if (t2 == null || t8 == null || Intrinsics.areEqual(t2, t8)) {
                return t2 == null ? t8 : t2;
            }
            return null;
        }

        private final boolean isForVarargParameter() {
            Annotated annotated = this.typeContainer;
            if (!(annotated instanceof ValueParameterDescriptor)) {
                annotated = null;
            }
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) annotated;
            return (valueParameterDescriptor != null ? valueParameterDescriptor.getVarargElementType() : null) != null;
        }

        private final NullabilityQualifierWithMigrationStatus mostSpecific(NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus, NullabilityQualifierWithMigrationStatus nullabilityQualifierWithMigrationStatus2) {
            return nullabilityQualifierWithMigrationStatus == null ? nullabilityQualifierWithMigrationStatus2 : nullabilityQualifierWithMigrationStatus2 == null ? nullabilityQualifierWithMigrationStatus : (!nullabilityQualifierWithMigrationStatus.isForWarningOnly() || nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) ? (nullabilityQualifierWithMigrationStatus.isForWarningOnly() || !nullabilityQualifierWithMigrationStatus2.isForWarningOnly()) ? (nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) >= 0 && nullabilityQualifierWithMigrationStatus.getQualifier().compareTo(nullabilityQualifierWithMigrationStatus2.getQualifier()) > 0) ? nullabilityQualifierWithMigrationStatus : nullabilityQualifierWithMigrationStatus2 : nullabilityQualifierWithMigrationStatus : nullabilityQualifierWithMigrationStatus2;
        }

        private final Pair<NullabilityQualifierWithMigrationStatus, Boolean> nullabilityInfoBoundsForTypeParameterUsage(KotlinType kotlinType) {
            ClassifierDescriptor mo1278getDeclarationDescriptor = kotlinType.getConstructor().mo1278getDeclarationDescriptor();
            TypeParameterDescriptor typeParameterDescriptor = mo1278getDeclarationDescriptor instanceof TypeParameterDescriptor ? (TypeParameterDescriptor) mo1278getDeclarationDescriptor : null;
            NullabilityQualifierWithMigrationStatus boundsNullability = typeParameterDescriptor == null ? null : boundsNullability(typeParameterDescriptor);
            if (boundsNullability == null) {
                return new Pair<>(null, Boolean.FALSE);
            }
            NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
            return new Pair<>(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, boundsNullability.isForWarningOnly()), Boolean.valueOf(boundsNullability.getQualifier() == nullabilityQualifier));
        }

        private final List<TypeAndDefaultQualifiers> toIndexed(KotlinType kotlinType) {
            ArrayList arrayList = new ArrayList(1);
            toIndexed$add(this, arrayList, kotlinType, this.containerContext, null);
            return arrayList;
        }

        private static final void toIndexed$add(SignatureParts signatureParts, ArrayList<TypeAndDefaultQualifiers> arrayList, KotlinType kotlinType, LazyJavaResolverContext lazyJavaResolverContext, TypeParameterDescriptor typeParameterDescriptor) {
            LazyJavaResolverContext copyWithNewDefaultTypeQualifiers = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, kotlinType.getAnnotations());
            JavaTypeQualifiersByElementType defaultTypeQualifiers = copyWithNewDefaultTypeQualifiers.getDefaultTypeQualifiers();
            JavaDefaultQualifiers javaDefaultQualifiers = defaultTypeQualifiers == null ? null : defaultTypeQualifiers.get(signatureParts.typeParameterBounds ? AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS : AnnotationQualifierApplicabilityType.TYPE_USE);
            arrayList.add(new TypeAndDefaultQualifiers(kotlinType, javaDefaultQualifiers, typeParameterDescriptor, false));
            if (signatureParts.isSuperTypesEnhancement && (kotlinType instanceof RawType)) {
                return;
            }
            List<TypeProjection> arguments = kotlinType.getArguments();
            List<TypeParameterDescriptor> parameters = kotlinType.getConstructor().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "type.constructor.parameters");
            for (Pair pair : CollectionsKt.zip(arguments, parameters)) {
                TypeProjection typeProjection = (TypeProjection) pair.component1();
                TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor) pair.component2();
                if (typeProjection.isStarProjection()) {
                    KotlinType type = typeProjection.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "arg.type");
                    arrayList.add(new TypeAndDefaultQualifiers(type, javaDefaultQualifiers, typeParameterDescriptor2, true));
                } else {
                    KotlinType type2 = typeProjection.getType();
                    Intrinsics.checkNotNullExpressionValue(type2, "arg.type");
                    toIndexed$add(signatureParts, arrayList, type2, copyWithNewDefaultTypeQualifiers, typeParameterDescriptor2);
                }
            }
        }

        public final PartEnhancementResult enhance(final TypeEnhancementInfo typeEnhancementInfo, boolean z10) {
            final Function1<Integer, JavaTypeQualifiers> computeIndexedQualifiersForOverride = computeIndexedQualifiersForOverride(z10);
            Function1<Integer, JavaTypeQualifiers> function1 = typeEnhancementInfo == null ? null : new Function1<Integer, JavaTypeQualifiers>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$qualifiersWithPredefined$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ JavaTypeQualifiers invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final JavaTypeQualifiers invoke(int i10) {
                    JavaTypeQualifiers javaTypeQualifiers = TypeEnhancementInfo.this.getMap().get(Integer.valueOf(i10));
                    return javaTypeQualifiers == null ? computeIndexedQualifiersForOverride.invoke(Integer.valueOf(i10)) : javaTypeQualifiers;
                }
            };
            boolean containsStoppingAt = this.isSuperTypesEnhancement ? TypeUtils.containsStoppingAt(this.fromOverride, SignatureEnhancement$SignatureParts$enhance$containsFunctionN$1.INSTANCE, new Function1<KotlinType, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$SignatureParts$enhance$containsFunctionN$2
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(KotlinType kotlinType) {
                    return Boolean.valueOf(kotlinType instanceof RawType);
                }
            }) : TypeUtils.contains(this.fromOverride, SignatureEnhancement$SignatureParts$enhance$containsFunctionN$3.INSTANCE);
            JavaTypeEnhancement javaTypeEnhancement = SignatureEnhancement.this.typeEnhancement;
            KotlinType kotlinType = this.fromOverride;
            if (function1 != null) {
                computeIndexedQualifiersForOverride = function1;
            }
            KotlinType enhance = javaTypeEnhancement.enhance(kotlinType, computeIndexedQualifiersForOverride, this.isSuperTypesEnhancement);
            return enhance == null ? new PartEnhancementResult(this.fromOverride, false, containsStoppingAt) : new PartEnhancementResult(enhance, true, containsStoppingAt);
        }
    }

    public SignatureEnhancement(AnnotationTypeQualifierResolver annotationTypeQualifierResolver, JavaTypeEnhancementState javaTypeEnhancementState, JavaTypeEnhancement typeEnhancement) {
        Intrinsics.checkNotNullParameter(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        Intrinsics.checkNotNullParameter(typeEnhancement, "typeEnhancement");
        this.annotationTypeQualifierResolver = annotationTypeQualifierResolver;
        this.javaTypeEnhancementState = javaTypeEnhancementState;
        this.typeEnhancement = typeEnhancement;
    }

    private final NullabilityQualifierWithMigrationStatus commonMigrationStatus(FqName fqName, AnnotationDescriptor annotationDescriptor, boolean z10) {
        ReportLevel invoke = this.javaTypeEnhancementState.getGetReportLevelForAnnotation().invoke(fqName);
        if (invoke.isIgnore()) {
            return null;
        }
        boolean z11 = invoke.isWarning() || z10;
        if (JvmAnnotationNamesKt.getNULLABLE_ANNOTATIONS().contains(fqName)) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z11);
        }
        if (JvmAnnotationNamesKt.getNOT_NULL_ANNOTATIONS().contains(fqName)) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, z11);
        }
        if (Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getJSPECIFY_NULLABLE())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z11);
        }
        if (Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getJSPECIFY_NULLNESS_UNKNOWN())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, z11);
        }
        if (Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getJAVAX_NONNULL_ANNOTATION())) {
            return extractNullabilityTypeFromArgument(annotationDescriptor, z11);
        }
        if (Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getCOMPATQUAL_NULLABLE_ANNOTATION())) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z11);
        }
        if (!Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getCOMPATQUAL_NONNULL_ANNOTATION()) && !Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getANDROIDX_RECENTLY_NON_NULL_ANNOTATION())) {
            if (Intrinsics.areEqual(fqName, JvmAnnotationNamesKt.getANDROIDX_RECENTLY_NULLABLE_ANNOTATION())) {
                return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z11);
            }
            return null;
        }
        return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, z11);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <D extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> D enhanceSignature(D r18, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext r19) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.enhanceSignature(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext):kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor");
    }

    private final NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations(AnnotationDescriptor annotationDescriptor, boolean z10, boolean z11) {
        FqName fqName = annotationDescriptor.getFqName();
        if (fqName == null) {
            return null;
        }
        NullabilityQualifierWithMigrationStatus commonMigrationStatus = commonMigrationStatus(fqName, annotationDescriptor, (annotationDescriptor instanceof LazyJavaAnnotationDescriptor) && (((LazyJavaAnnotationDescriptor) annotationDescriptor).isFreshlySupportedTypeUseAnnotation() || z11) && !z10);
        if (commonMigrationStatus == null) {
            return null;
        }
        return (!commonMigrationStatus.isForWarningOnly() && (annotationDescriptor instanceof PossiblyExternalAnnotationDescriptor) && ((PossiblyExternalAnnotationDescriptor) annotationDescriptor).isIdeExternalAnnotation()) ? NullabilityQualifierWithMigrationStatus.copy$default(commonMigrationStatus, null, true, 1, null) : commonMigrationStatus;
    }

    private final NullabilityQualifierWithMigrationStatus extractNullabilityTypeFromArgument(AnnotationDescriptor annotationDescriptor, boolean z10) {
        ConstantValue<?> firstArgument = DescriptorUtilsKt.firstArgument(annotationDescriptor);
        EnumValue enumValue = firstArgument instanceof EnumValue ? (EnumValue) firstArgument : null;
        if (enumValue == null) {
            return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, z10);
        }
        String asString = enumValue.getEnumEntryName().asString();
        switch (asString.hashCode()) {
            case 73135176:
                if (!asString.equals("MAYBE")) {
                    return null;
                }
                break;
            case 74175084:
                if (!asString.equals("NEVER")) {
                    return null;
                }
                break;
            case 433141802:
                if (asString.equals("UNKNOWN")) {
                    return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, z10);
                }
                return null;
            case 1933739535:
                if (asString.equals("ALWAYS")) {
                    return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NOT_NULL, z10);
                }
                return null;
            default:
                return null;
        }
        return new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, z10);
    }

    private final <D extends CallableMemberDescriptor> Annotations getDefaultAnnotations(D d, LazyJavaResolverContext lazyJavaResolverContext) {
        ClassifierDescriptor topLevelContainingClassifier = DescriptorUtilKt.getTopLevelContainingClassifier(d);
        if (topLevelContainingClassifier == null) {
            return d.getAnnotations();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptor = topLevelContainingClassifier instanceof LazyJavaClassDescriptor ? (LazyJavaClassDescriptor) topLevelContainingClassifier : null;
        List<JavaAnnotation> moduleAnnotations = lazyJavaClassDescriptor != null ? lazyJavaClassDescriptor.getModuleAnnotations() : null;
        if (moduleAnnotations == null || moduleAnnotations.isEmpty()) {
            return d.getAnnotations();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(moduleAnnotations, 10));
        for (JavaAnnotation javaAnnotation : moduleAnnotations) {
            arrayList.add(new LazyJavaAnnotationDescriptor(lazyJavaResolverContext, javaAnnotation, true));
        }
        return Annotations.Companion.create(CollectionsKt.plus((Iterable) d.getAnnotations(), (Iterable) arrayList));
    }

    private final SignatureParts parts(CallableMemberDescriptor callableMemberDescriptor, Annotated annotated, boolean z10, LazyJavaResolverContext lazyJavaResolverContext, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        KotlinType invoke = function1.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> overriddenDescriptors = callableMemberDescriptor.getOverriddenDescriptors();
        Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "this.overriddenDescriptors");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(overriddenDescriptors, 10));
        for (CallableMemberDescriptor it : overriddenDescriptors) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            arrayList.add(function1.invoke(it));
        }
        return new SignatureParts(annotated, invoke, arrayList, z10, ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, function1.invoke(callableMemberDescriptor).getAnnotations()), annotationQualifierApplicabilityType, false, false, 192, null);
    }

    private final SignatureParts partsForValueParameter(CallableMemberDescriptor callableMemberDescriptor, ValueParameterDescriptor valueParameterDescriptor, LazyJavaResolverContext lazyJavaResolverContext, Function1<? super CallableMemberDescriptor, ? extends KotlinType> function1) {
        if (valueParameterDescriptor != null) {
            lazyJavaResolverContext = ContextKt.copyWithNewDefaultTypeQualifiers(lazyJavaResolverContext, valueParameterDescriptor.getAnnotations());
        }
        return parts(callableMemberDescriptor, valueParameterDescriptor, false, lazyJavaResolverContext, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends CallableMemberDescriptor> Collection<D> enhanceSignatures(LazyJavaResolverContext c10, Collection<? extends D> platformSignatures) {
        Intrinsics.checkNotNullParameter(c10, "c");
        Intrinsics.checkNotNullParameter(platformSignatures, "platformSignatures");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(platformSignatures, 10));
        Iterator<T> it = platformSignatures.iterator();
        while (it.hasNext()) {
            arrayList.add(enhanceSignature((CallableMemberDescriptor) it.next(), c10));
        }
        return arrayList;
    }

    public final KotlinType enhanceSuperType(KotlinType type, LazyJavaResolverContext context) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        return SignatureParts.enhance$default(new SignatureParts(null, type, CollectionsKt.emptyList(), false, context, AnnotationQualifierApplicabilityType.TYPE_USE, false, true, 64, null), null, false, 3, null).getType();
    }

    public final List<KotlinType> enhanceTypeParameterBounds(TypeParameterDescriptor typeParameter, List<? extends KotlinType> bounds, LazyJavaResolverContext context) {
        Iterator it;
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(context, "context");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(bounds, 10));
        Iterator it2 = bounds.iterator();
        while (it2.hasNext()) {
            KotlinType kotlinType = (KotlinType) it2.next();
            if (TypeUtilsKt.contains(kotlinType, new Function1<UnwrappedType, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceTypeParameterBounds$1$1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(UnwrappedType it3) {
                    Intrinsics.checkNotNullParameter(it3, "it");
                    return Boolean.valueOf(it3 instanceof RawType);
                }
            })) {
                it = it2;
            } else {
                it = it2;
                kotlinType = SignatureParts.enhance$default(new SignatureParts(typeParameter, kotlinType, CollectionsKt.emptyList(), false, context, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, true, false, 128, null), null, false, 3, null).getType();
            }
            arrayList.add(kotlinType);
            it2 = it;
        }
        return arrayList;
    }

    public final NullabilityQualifierWithMigrationStatus extractNullability(AnnotationDescriptor annotationDescriptor, boolean z10, boolean z11) {
        NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations;
        Intrinsics.checkNotNullParameter(annotationDescriptor, "annotationDescriptor");
        NullabilityQualifierWithMigrationStatus extractNullabilityFromKnownAnnotations2 = extractNullabilityFromKnownAnnotations(annotationDescriptor, z10, z11);
        if (extractNullabilityFromKnownAnnotations2 == null) {
            AnnotationDescriptor resolveTypeQualifierAnnotation = this.annotationTypeQualifierResolver.resolveTypeQualifierAnnotation(annotationDescriptor);
            if (resolveTypeQualifierAnnotation == null) {
                return null;
            }
            ReportLevel resolveJsr305AnnotationState = this.annotationTypeQualifierResolver.resolveJsr305AnnotationState(annotationDescriptor);
            if (resolveJsr305AnnotationState.isIgnore() || (extractNullabilityFromKnownAnnotations = extractNullabilityFromKnownAnnotations(resolveTypeQualifierAnnotation, z10, z11)) == null) {
                return null;
            }
            return NullabilityQualifierWithMigrationStatus.copy$default(extractNullabilityFromKnownAnnotations, null, resolveJsr305AnnotationState.isWarning(), 1, null);
        }
        return extractNullabilityFromKnownAnnotations2;
    }
}
