package kotlin.reflect.jvm.internal.impl.types.checker;

import android.support.v4.media.b;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractStubType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.DynamicType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextKt;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* loaded from: classes3.dex */
public interface ClassicTypeSystemContext extends TypeSystemCommonBackendContext, TypeSystemInferenceExtensionContext {

    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static boolean areEqualTypeConstructors(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker c12, TypeConstructorMarker c22) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(c12, "c1");
            Intrinsics.checkNotNullParameter(c22, "c2");
            if (!(c12 instanceof TypeConstructor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c12 + ", " + Reflection.getOrCreateKotlinClass(c12.getClass())).toString());
            } else if (c22 instanceof TypeConstructor) {
                return Intrinsics.areEqual(c12, c22);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c22 + ", " + Reflection.getOrCreateKotlinClass(c22.getClass())).toString());
            }
        }

        public static int argumentsCount(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getArguments().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static TypeArgumentListMarker asArgumentList(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof SimpleType) {
                return (TypeArgumentListMarker) receiver;
            }
            StringBuilder p10 = b.p("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            p10.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
            throw new IllegalArgumentException(p10.toString().toString());
        }

        public static CapturedTypeMarker asCapturedType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (!(receiver instanceof SimpleType)) {
                StringBuilder p10 = b.p("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
                p10.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
                throw new IllegalArgumentException(p10.toString().toString());
            } else if (receiver instanceof SimpleTypeWithEnhancement) {
                return classicTypeSystemContext.asCapturedType(((SimpleTypeWithEnhancement) receiver).getOrigin());
            } else {
                if (receiver instanceof NewCapturedType) {
                    return (NewCapturedType) receiver;
                }
                return null;
            }
        }

        public static DefinitelyNotNullTypeMarker asDefinitelyNotNullType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof SimpleType) {
                if (receiver instanceof DefinitelyNotNullType) {
                    return (DefinitelyNotNullType) receiver;
                }
                return null;
            }
            StringBuilder p10 = b.p("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            p10.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
            throw new IllegalArgumentException(p10.toString().toString());
        }

        public static DynamicTypeMarker asDynamicType(ClassicTypeSystemContext classicTypeSystemContext, FlexibleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof FlexibleType) {
                if (receiver instanceof DynamicType) {
                    return (DynamicType) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static FlexibleTypeMarker asFlexibleType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof KotlinType) {
                UnwrappedType unwrap = ((KotlinType) receiver).unwrap();
                if (unwrap instanceof FlexibleType) {
                    return (FlexibleType) unwrap;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static SimpleTypeMarker asSimpleType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof KotlinType) {
                UnwrappedType unwrap = ((KotlinType) receiver).unwrap();
                if (unwrap instanceof SimpleType) {
                    return (SimpleType) unwrap;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static TypeArgumentMarker asTypeArgument(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof KotlinType) {
                return TypeUtilsKt.asTypeProjection((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static SimpleTypeMarker captureFromArguments(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker type, CaptureStatus status) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(status, "status");
            if (type instanceof SimpleType) {
                return NewCapturedTypeKt.captureFromArguments((SimpleType) type, status);
            }
            StringBuilder p10 = b.p("ClassicTypeSystemContext couldn't handle: ", type, ", ");
            p10.append(Reflection.getOrCreateKotlinClass(type.getClass()));
            throw new IllegalArgumentException(p10.toString().toString());
        }

        public static CaptureStatus captureStatus(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).getCaptureStatus();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static KotlinTypeMarker createFlexibleType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker lowerBound, SimpleTypeMarker upperBound) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
            Intrinsics.checkNotNullParameter(upperBound, "upperBound");
            if (!(lowerBound instanceof SimpleType)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + classicTypeSystemContext + ", " + Reflection.getOrCreateKotlinClass(classicTypeSystemContext.getClass())).toString());
            } else if (upperBound instanceof SimpleType) {
                return KotlinTypeFactory.flexibleType((SimpleType) lowerBound, (SimpleType) upperBound);
            } else {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + classicTypeSystemContext + ", " + Reflection.getOrCreateKotlinClass(classicTypeSystemContext.getClass())).toString());
            }
        }

        public static List<SimpleTypeMarker> fastCorrespondingSupertypes(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver, TypeConstructorMarker constructor) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            return TypeSystemInferenceExtensionContext.DefaultImpls.fastCorrespondingSupertypes(classicTypeSystemContext, receiver, constructor);
        }

        public static TypeArgumentMarker get(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentListMarker receiver, int i10) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return TypeSystemInferenceExtensionContext.DefaultImpls.get(classicTypeSystemContext, receiver, i10);
        }

        public static TypeArgumentMarker getArgument(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver, int i10) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getArguments().get(i10);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static TypeArgumentMarker getArgumentOrNull(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver, int i10) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return TypeSystemInferenceExtensionContext.DefaultImpls.getArgumentOrNull(classicTypeSystemContext, receiver, i10);
        }

        public static FqNameUnsafe getClassFqNameUnsafe(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor mo1278getDeclarationDescriptor = ((TypeConstructor) receiver).mo1278getDeclarationDescriptor();
                Objects.requireNonNull(mo1278getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return DescriptorUtilsKt.getFqNameUnsafe((ClassDescriptor) mo1278getDeclarationDescriptor);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static TypeParameterMarker getParameter(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver, int i10) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeConstructor) {
                TypeParameterDescriptor typeParameterDescriptor = ((TypeConstructor) receiver).getParameters().get(i10);
                Intrinsics.checkNotNullExpressionValue(typeParameterDescriptor, "this.parameters[index]");
                return typeParameterDescriptor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static PrimitiveType getPrimitiveArrayType(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor mo1278getDeclarationDescriptor = ((TypeConstructor) receiver).mo1278getDeclarationDescriptor();
                Objects.requireNonNull(mo1278getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return KotlinBuiltIns.getPrimitiveArrayType((ClassDescriptor) mo1278getDeclarationDescriptor);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static PrimitiveType getPrimitiveType(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor mo1278getDeclarationDescriptor = ((TypeConstructor) receiver).mo1278getDeclarationDescriptor();
                Objects.requireNonNull(mo1278getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return KotlinBuiltIns.getPrimitiveType((ClassDescriptor) mo1278getDeclarationDescriptor);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static KotlinTypeMarker getRepresentativeUpperBound(ClassicTypeSystemContext classicTypeSystemContext, TypeParameterMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                return TypeUtilsKt.getRepresentativeUpperBound((TypeParameterDescriptor) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static KotlinTypeMarker getSubstitutedUnderlyingType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof KotlinType) {
                return InlineClassesUtilsKt.substitutedUnderlyingType((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static KotlinTypeMarker getType(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeProjection) {
                return ((TypeProjection) receiver).getType().unwrap();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static TypeParameterMarker getTypeParameter(ClassicTypeSystemContext classicTypeSystemContext, TypeVariableTypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof NewTypeVariableConstructor) {
                return ((NewTypeVariableConstructor) receiver).getOriginalTypeParameter();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static TypeParameterMarker getTypeParameterClassifier(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor mo1278getDeclarationDescriptor = ((TypeConstructor) receiver).mo1278getDeclarationDescriptor();
                if (mo1278getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                    return (TypeParameterDescriptor) mo1278getDeclarationDescriptor;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static TypeVariance getVariance(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeProjection) {
                Variance projectionKind = ((TypeProjection) receiver).getProjectionKind();
                Intrinsics.checkNotNullExpressionValue(projectionKind, "this.projectionKind");
                return TypeSystemContextKt.convertVariance(projectionKind);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static TypeVariance getVariance(ClassicTypeSystemContext classicTypeSystemContext, TypeParameterMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeParameterDescriptor) {
                Variance variance = ((TypeParameterDescriptor) receiver).getVariance();
                Intrinsics.checkNotNullExpressionValue(variance, "this.variance");
                return TypeSystemContextKt.convertVariance(variance);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean hasAnnotation(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver, FqName fqName) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            if (receiver instanceof KotlinType) {
                return ((KotlinType) receiver).getAnnotations().hasAnnotation(fqName);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean hasFlexibleNullability(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return TypeSystemInferenceExtensionContext.DefaultImpls.hasFlexibleNullability(classicTypeSystemContext, receiver);
        }

        public static boolean hasRecursiveBounds(ClassicTypeSystemContext classicTypeSystemContext, TypeParameterMarker receiver, TypeConstructorMarker typeConstructorMarker) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (!(receiver instanceof TypeParameterDescriptor)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
            }
            if (typeConstructorMarker == null ? true : typeConstructorMarker instanceof TypeConstructor) {
                return TypeUtilsKt.hasTypeParameterRecursiveBounds$default((TypeParameterDescriptor) receiver, (TypeConstructor) typeConstructorMarker, null, 4, null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean identicalArguments(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker a10, SimpleTypeMarker b10) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(a10, "a");
            Intrinsics.checkNotNullParameter(b10, "b");
            if (!(a10 instanceof SimpleType)) {
                StringBuilder p10 = b.p("ClassicTypeSystemContext couldn't handle: ", a10, ", ");
                p10.append(Reflection.getOrCreateKotlinClass(a10.getClass()));
                throw new IllegalArgumentException(p10.toString().toString());
            } else if (b10 instanceof SimpleType) {
                return ((SimpleType) a10).getArguments() == ((SimpleType) b10).getArguments();
            } else {
                StringBuilder p11 = b.p("ClassicTypeSystemContext couldn't handle: ", b10, ", ");
                p11.append(Reflection.getOrCreateKotlinClass(b10.getClass()));
                throw new IllegalArgumentException(p11.toString().toString());
            }
        }

        public static KotlinTypeMarker intersectTypes(ClassicTypeSystemContext classicTypeSystemContext, List<? extends KotlinTypeMarker> types) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(types, "types");
            return IntersectionTypeKt.intersectTypes(types);
        }

        public static boolean isAnyConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) receiver, StandardNames.FqNames.any);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isCapturedType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return TypeSystemInferenceExtensionContext.DefaultImpls.isCapturedType(classicTypeSystemContext, receiver);
        }

        public static boolean isClassType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return TypeSystemInferenceExtensionContext.DefaultImpls.isClassType(classicTypeSystemContext, receiver);
        }

        public static boolean isClassTypeConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).mo1278getDeclarationDescriptor() instanceof ClassDescriptor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isCommonFinalClassConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor mo1278getDeclarationDescriptor = ((TypeConstructor) receiver).mo1278getDeclarationDescriptor();
                ClassDescriptor classDescriptor = mo1278getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo1278getDeclarationDescriptor : null;
                return (classDescriptor == null || !ModalityUtilsKt.isFinalClass(classDescriptor) || classDescriptor.getKind() == ClassKind.ENUM_ENTRY || classDescriptor.getKind() == ClassKind.ANNOTATION_CLASS) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isDefinitelyNotNullType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return TypeSystemInferenceExtensionContext.DefaultImpls.isDefinitelyNotNullType(classicTypeSystemContext, receiver);
        }

        public static boolean isDenotable(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).isDenotable();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isDynamic(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return TypeSystemInferenceExtensionContext.DefaultImpls.isDynamic(classicTypeSystemContext, receiver);
        }

        public static boolean isError(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof KotlinType) {
                return KotlinTypeKt.isError((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isInlineClass(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor mo1278getDeclarationDescriptor = ((TypeConstructor) receiver).mo1278getDeclarationDescriptor();
                ClassDescriptor classDescriptor = mo1278getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo1278getDeclarationDescriptor : null;
                return classDescriptor != null && InlineClassesUtilsKt.isInlineClass(classDescriptor);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isIntegerLiteralType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return TypeSystemInferenceExtensionContext.DefaultImpls.isIntegerLiteralType(classicTypeSystemContext, receiver);
        }

        public static boolean isIntegerLiteralTypeConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeConstructor) {
                return receiver instanceof IntegerLiteralTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isIntersection(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeConstructor) {
                return receiver instanceof IntersectionTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isMarkedNullable(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return TypeSystemInferenceExtensionContext.DefaultImpls.isMarkedNullable(classicTypeSystemContext, receiver);
        }

        public static boolean isMarkedNullable(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).isMarkedNullable();
            }
            StringBuilder p10 = b.p("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            p10.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
            throw new IllegalArgumentException(p10.toString().toString());
        }

        public static boolean isNothing(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return TypeSystemInferenceExtensionContext.DefaultImpls.isNothing(classicTypeSystemContext, receiver);
        }

        public static boolean isNothingConstructor(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeConstructor) {
                return KotlinBuiltIns.isTypeConstructorForGivenClass((TypeConstructor) receiver, StandardNames.FqNames.nothing);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isNullableType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof KotlinType) {
                return TypeUtils.isNullableType((KotlinType) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isOldCapturedType(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return receiver instanceof CapturedType;
        }

        public static boolean isPrimitiveType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof KotlinType) {
                return KotlinBuiltIns.isPrimitiveType((KotlinType) receiver);
            }
            StringBuilder p10 = b.p("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            p10.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
            throw new IllegalArgumentException(p10.toString().toString());
        }

        public static boolean isProjectionNotNull(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).isProjectionNotNull();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isSingleClassifierType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (!(receiver instanceof SimpleType)) {
                StringBuilder p10 = b.p("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
                p10.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
                throw new IllegalArgumentException(p10.toString().toString());
            }
            if (!KotlinTypeKt.isError((KotlinType) receiver)) {
                SimpleType simpleType = (SimpleType) receiver;
                if (!(simpleType.getConstructor().mo1278getDeclarationDescriptor() instanceof TypeAliasDescriptor) && (simpleType.getConstructor().mo1278getDeclarationDescriptor() != null || (receiver instanceof CapturedType) || (receiver instanceof NewCapturedType) || (receiver instanceof DefinitelyNotNullType) || (simpleType.getConstructor() instanceof IntegerLiteralTypeConstructor) || isSingleClassifierTypeWithEnhancement(classicTypeSystemContext, receiver))) {
                    return true;
                }
            }
            return false;
        }

        private static boolean isSingleClassifierTypeWithEnhancement(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker simpleTypeMarker) {
            return (simpleTypeMarker instanceof SimpleTypeWithEnhancement) && classicTypeSystemContext.isSingleClassifierType(((SimpleTypeWithEnhancement) simpleTypeMarker).getOrigin());
        }

        public static boolean isStarProjection(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeProjection) {
                return ((TypeProjection) receiver).isStarProjection();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static boolean isStubType(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (!(receiver instanceof SimpleType)) {
                StringBuilder p10 = b.p("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
                p10.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
                throw new IllegalArgumentException(p10.toString().toString());
            }
            if (!(receiver instanceof AbstractStubType)) {
                if (!((receiver instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) receiver).getOriginal() instanceof AbstractStubType))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean isStubTypeForBuilderInference(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (!(receiver instanceof SimpleType)) {
                StringBuilder p10 = b.p("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
                p10.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
                throw new IllegalArgumentException(p10.toString().toString());
            }
            if (!(receiver instanceof StubTypeForBuilderInference)) {
                if (!((receiver instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) receiver).getOriginal() instanceof StubTypeForBuilderInference))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean isTypeVariableType(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return (receiver instanceof UnwrappedType) && (((UnwrappedType) receiver).getConstructor() instanceof NewTypeVariableConstructor);
        }

        public static boolean isUnderKotlinPackage(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeConstructor) {
                ClassifierDescriptor mo1278getDeclarationDescriptor = ((TypeConstructor) receiver).mo1278getDeclarationDescriptor();
                return mo1278getDeclarationDescriptor != null && KotlinBuiltIns.isUnderKotlinPackage(mo1278getDeclarationDescriptor);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static SimpleTypeMarker lowerBound(ClassicTypeSystemContext classicTypeSystemContext, FlexibleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof FlexibleType) {
                return ((FlexibleType) receiver).getLowerBound();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static SimpleTypeMarker lowerBoundIfFlexible(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return TypeSystemInferenceExtensionContext.DefaultImpls.lowerBoundIfFlexible(classicTypeSystemContext, receiver);
        }

        public static KotlinTypeMarker lowerType(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).getLowerType();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static KotlinTypeMarker makeDefinitelyNotNullOrNotNull(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            UnwrappedType makeDefinitelyNotNullOrNotNullInternal;
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof UnwrappedType) {
                makeDefinitelyNotNullOrNotNullInternal = ClassicTypeSystemContextKt.makeDefinitelyNotNullOrNotNullInternal((UnwrappedType) receiver);
                return makeDefinitelyNotNullOrNotNullInternal;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static KotlinTypeMarker makeNullable(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return TypeSystemCommonBackendContext.DefaultImpls.makeNullable(classicTypeSystemContext, receiver);
        }

        public static TypeCheckerState newTypeCheckerState(ClassicTypeSystemContext classicTypeSystemContext, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            return ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(z10, z11, classicTypeSystemContext, null, null, 24, null);
        }

        public static SimpleTypeMarker original(ClassicTypeSystemContext classicTypeSystemContext, DefinitelyNotNullTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof DefinitelyNotNullType) {
                return ((DefinitelyNotNullType) receiver).getOriginal();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static int parametersCount(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeConstructor) {
                return ((TypeConstructor) receiver).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static Collection<KotlinTypeMarker> possibleIntegerTypes(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            TypeConstructorMarker typeConstructor = classicTypeSystemContext.typeConstructor(receiver);
            if (typeConstructor instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) typeConstructor).getPossibleTypes();
            }
            StringBuilder p10 = b.p("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            p10.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
            throw new IllegalArgumentException(p10.toString().toString());
        }

        public static TypeArgumentMarker projection(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) receiver).getProjection();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static int size(ClassicTypeSystemContext classicTypeSystemContext, TypeArgumentListMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return TypeSystemInferenceExtensionContext.DefaultImpls.size(classicTypeSystemContext, receiver);
        }

        public static TypeCheckerState.SupertypesPolicy substitutionSupertypePolicy(final ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker type) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(type, "type");
            if (type instanceof SimpleType) {
                final TypeSubstitutor buildSubstitutor = TypeConstructorSubstitution.Companion.create((KotlinType) type).buildSubstitutor();
                return new TypeCheckerState.SupertypesPolicy.DoCustomTransform() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2
                    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
                    /* renamed from: transformType */
                    public SimpleTypeMarker mo1284transformType(TypeCheckerState state, KotlinTypeMarker type2) {
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(type2, "type");
                        ClassicTypeSystemContext classicTypeSystemContext2 = ClassicTypeSystemContext.this;
                        KotlinType safeSubstitute = buildSubstitutor.safeSubstitute((KotlinType) classicTypeSystemContext2.lowerBoundIfFlexible(type2), Variance.INVARIANT);
                        Intrinsics.checkNotNullExpressionValue(safeSubstitute, "substitutor.safeSubstitu…VARIANT\n                )");
                        SimpleTypeMarker asSimpleType = classicTypeSystemContext2.asSimpleType(safeSubstitute);
                        Intrinsics.checkNotNull(asSimpleType);
                        return asSimpleType;
                    }
                };
            }
            StringBuilder p10 = b.p("ClassicTypeSystemContext couldn't handle: ", type, ", ");
            p10.append(Reflection.getOrCreateKotlinClass(type.getClass()));
            throw new IllegalArgumentException(p10.toString().toString());
        }

        public static Collection<KotlinTypeMarker> supertypes(ClassicTypeSystemContext classicTypeSystemContext, TypeConstructorMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof TypeConstructor) {
                Collection<KotlinType> mo1279getSupertypes = ((TypeConstructor) receiver).mo1279getSupertypes();
                Intrinsics.checkNotNullExpressionValue(mo1279getSupertypes, "this.supertypes");
                return mo1279getSupertypes;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static CapturedTypeConstructorMarker typeConstructor(ClassicTypeSystemContext classicTypeSystemContext, CapturedTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof NewCapturedType) {
                return ((NewCapturedType) receiver).getConstructor();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static TypeConstructorMarker typeConstructor(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return TypeSystemInferenceExtensionContext.DefaultImpls.typeConstructor(classicTypeSystemContext, receiver);
        }

        public static TypeConstructorMarker typeConstructor(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).getConstructor();
            }
            StringBuilder p10 = b.p("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            p10.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
            throw new IllegalArgumentException(p10.toString().toString());
        }

        public static SimpleTypeMarker upperBound(ClassicTypeSystemContext classicTypeSystemContext, FlexibleTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof FlexibleType) {
                return ((FlexibleType) receiver).getUpperBound();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + Reflection.getOrCreateKotlinClass(receiver.getClass())).toString());
        }

        public static SimpleTypeMarker upperBoundIfFlexible(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            return TypeSystemInferenceExtensionContext.DefaultImpls.upperBoundIfFlexible(classicTypeSystemContext, receiver);
        }

        public static KotlinTypeMarker withNullability(ClassicTypeSystemContext classicTypeSystemContext, KotlinTypeMarker receiver, boolean z10) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof SimpleTypeMarker) {
                return classicTypeSystemContext.withNullability((SimpleTypeMarker) receiver, z10);
            }
            if (receiver instanceof FlexibleTypeMarker) {
                FlexibleTypeMarker flexibleTypeMarker = (FlexibleTypeMarker) receiver;
                return classicTypeSystemContext.createFlexibleType(classicTypeSystemContext.withNullability(classicTypeSystemContext.lowerBound(flexibleTypeMarker), z10), classicTypeSystemContext.withNullability(classicTypeSystemContext.upperBound(flexibleTypeMarker), z10));
            }
            throw new IllegalStateException("sealed".toString());
        }

        public static SimpleTypeMarker withNullability(ClassicTypeSystemContext classicTypeSystemContext, SimpleTypeMarker receiver, boolean z10) {
            Intrinsics.checkNotNullParameter(classicTypeSystemContext, "this");
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            if (receiver instanceof SimpleType) {
                return ((SimpleType) receiver).makeNullableAsSpecified(z10);
            }
            StringBuilder p10 = b.p("ClassicTypeSystemContext couldn't handle: ", receiver, ", ");
            p10.append(Reflection.getOrCreateKotlinClass(receiver.getClass()));
            throw new IllegalArgumentException(p10.toString().toString());
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    CapturedTypeMarker asCapturedType(SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    SimpleTypeMarker asSimpleType(KotlinTypeMarker kotlinTypeMarker);

    KotlinTypeMarker createFlexibleType(SimpleTypeMarker simpleTypeMarker, SimpleTypeMarker simpleTypeMarker2);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    boolean isSingleClassifierType(SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    SimpleTypeMarker lowerBound(FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    TypeConstructorMarker typeConstructor(SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    SimpleTypeMarker upperBound(FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    SimpleTypeMarker withNullability(SimpleTypeMarker simpleTypeMarker, boolean z10);
}
