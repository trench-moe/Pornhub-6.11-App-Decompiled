package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.ExpandedTypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class DescriptorBasedTypeSignatureMappingKt {
    public static final String computeInternalName(ClassDescriptor klass, TypeMappingConfiguration<?> typeMappingConfiguration) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        String predefinedFullInternalNameForClass = typeMappingConfiguration.getPredefinedFullInternalNameForClass(klass);
        if (predefinedFullInternalNameForClass == null) {
            DeclarationDescriptor containingDeclaration = klass.getContainingDeclaration();
            Intrinsics.checkNotNullExpressionValue(containingDeclaration, "klass.containingDeclaration");
            String identifier = SpecialNames.safeIdentifier(klass.getName()).getIdentifier();
            Intrinsics.checkNotNullExpressionValue(identifier, "safeIdentifier(klass.name).identifier");
            if (containingDeclaration instanceof PackageFragmentDescriptor) {
                FqName fqName = ((PackageFragmentDescriptor) containingDeclaration).getFqName();
                if (fqName.isRoot()) {
                    return identifier;
                }
                StringBuilder sb2 = new StringBuilder();
                String asString = fqName.asString();
                Intrinsics.checkNotNullExpressionValue(asString, "fqName.asString()");
                sb2.append(StringsKt.replace$default(asString, '.', '/', false, 4, (Object) null));
                sb2.append('/');
                sb2.append(identifier);
                return sb2.toString();
            }
            ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
            if (classDescriptor == null) {
                throw new IllegalArgumentException("Unexpected container: " + containingDeclaration + " for " + klass);
            }
            String predefinedInternalNameForClass = typeMappingConfiguration.getPredefinedInternalNameForClass(classDescriptor);
            if (predefinedInternalNameForClass == null) {
                predefinedInternalNameForClass = computeInternalName(classDescriptor, typeMappingConfiguration);
            }
            return predefinedInternalNameForClass + Typography.dollar + identifier;
        }
        return predefinedFullInternalNameForClass;
    }

    public static /* synthetic */ String computeInternalName$default(ClassDescriptor classDescriptor, TypeMappingConfiguration typeMappingConfiguration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMappingConfiguration = TypeMappingConfigurationImpl.INSTANCE;
        }
        return computeInternalName(classDescriptor, typeMappingConfiguration);
    }

    public static final boolean hasVoidReturnType(CallableDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof ConstructorDescriptor) {
            return true;
        }
        KotlinType returnType = descriptor.getReturnType();
        Intrinsics.checkNotNull(returnType);
        if (KotlinBuiltIns.isUnit(returnType)) {
            KotlinType returnType2 = descriptor.getReturnType();
            Intrinsics.checkNotNull(returnType2);
            if (!TypeUtils.isNullableType(returnType2) && !(descriptor instanceof PropertyGetterDescriptor)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [T, java.lang.Object] */
    public static final <T> T mapType(KotlinType kotlinType, JvmTypeFactory<T> factory, TypeMappingMode mode, TypeMappingConfiguration<? extends T> typeMappingConfiguration, JvmDescriptorTypeWriter<T> jvmDescriptorTypeWriter, Function3<? super KotlinType, ? super T, ? super TypeMappingMode, Unit> writeGenericType) {
        Object obj;
        KotlinType kotlinType2;
        Object mapType;
        Intrinsics.checkNotNullParameter(kotlinType, "kotlinType");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(typeMappingConfiguration, "typeMappingConfiguration");
        Intrinsics.checkNotNullParameter(writeGenericType, "writeGenericType");
        KotlinType preprocessType = typeMappingConfiguration.preprocessType(kotlinType);
        if (preprocessType == null) {
            if (FunctionTypesKt.isSuspendFunctionType(kotlinType)) {
                return (T) mapType(SuspendFunctionTypesKt.transformSuspendFunctionToRuntimeFunctionType(kotlinType), factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
            }
            SimpleClassicTypeSystemContext simpleClassicTypeSystemContext = SimpleClassicTypeSystemContext.INSTANCE;
            Object mapBuiltInType = TypeSignatureMappingKt.mapBuiltInType(simpleClassicTypeSystemContext, kotlinType, factory, mode);
            if (mapBuiltInType != null) {
                ?? r92 = (Object) TypeSignatureMappingKt.boxTypeIfNeeded(factory, mapBuiltInType, mode.getNeedPrimitiveBoxing());
                writeGenericType.invoke(kotlinType, r92, mode);
                return r92;
            }
            TypeConstructor constructor = kotlinType.getConstructor();
            if (constructor instanceof IntersectionTypeConstructor) {
                IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) constructor;
                KotlinType alternativeType = intersectionTypeConstructor.getAlternativeType();
                if (alternativeType == null) {
                    alternativeType = typeMappingConfiguration.commonSupertype(intersectionTypeConstructor.mo1279getSupertypes());
                }
                return (T) mapType(TypeUtilsKt.replaceArgumentsWithStarProjections(alternativeType), factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
            }
            ClassifierDescriptor mo1278getDeclarationDescriptor = constructor.mo1278getDeclarationDescriptor();
            if (mo1278getDeclarationDescriptor != null) {
                if (ErrorUtils.isError(mo1278getDeclarationDescriptor)) {
                    T t2 = (T) factory.createObjectType("error/NonExistentClass");
                    typeMappingConfiguration.processErrorType(kotlinType, (ClassDescriptor) mo1278getDeclarationDescriptor);
                    if (jvmDescriptorTypeWriter != 0) {
                        jvmDescriptorTypeWriter.writeClass(t2);
                    }
                    return t2;
                }
                boolean z10 = mo1278getDeclarationDescriptor instanceof ClassDescriptor;
                if (z10 && KotlinBuiltIns.isArray(kotlinType)) {
                    if (kotlinType.getArguments().size() == 1) {
                        TypeProjection typeProjection = kotlinType.getArguments().get(0);
                        KotlinType type = typeProjection.getType();
                        Intrinsics.checkNotNullExpressionValue(type, "memberProjection.type");
                        if (typeProjection.getProjectionKind() == Variance.IN_VARIANCE) {
                            mapType = factory.createObjectType("java/lang/Object");
                            if (jvmDescriptorTypeWriter != 0) {
                                jvmDescriptorTypeWriter.writeArrayType();
                                jvmDescriptorTypeWriter.writeClass(mapType);
                                jvmDescriptorTypeWriter.writeArrayEnd();
                            }
                        } else {
                            if (jvmDescriptorTypeWriter != 0) {
                                jvmDescriptorTypeWriter.writeArrayType();
                            }
                            Variance projectionKind = typeProjection.getProjectionKind();
                            Intrinsics.checkNotNullExpressionValue(projectionKind, "memberProjection.projectionKind");
                            mapType = mapType(type, factory, mode.toGenericArgumentMode(projectionKind, true), typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
                            if (jvmDescriptorTypeWriter != 0) {
                                jvmDescriptorTypeWriter.writeArrayEnd();
                            }
                        }
                        return (T) factory.createFromString(Intrinsics.stringPlus("[", factory.toString(mapType)));
                    }
                    throw new UnsupportedOperationException("arrays must have one type argument");
                } else if (!z10) {
                    if (!(mo1278getDeclarationDescriptor instanceof TypeParameterDescriptor)) {
                        if ((mo1278getDeclarationDescriptor instanceof TypeAliasDescriptor) && mode.getMapTypeAliases()) {
                            return (T) mapType(((TypeAliasDescriptor) mo1278getDeclarationDescriptor).getExpandedType(), factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
                        }
                        throw new UnsupportedOperationException(Intrinsics.stringPlus("Unknown type ", kotlinType));
                    }
                    T t8 = (T) mapType(TypeUtilsKt.getRepresentativeUpperBound((TypeParameterDescriptor) mo1278getDeclarationDescriptor), factory, mode, typeMappingConfiguration, null, FunctionsKt.getDO_NOTHING_3());
                    if (jvmDescriptorTypeWriter != 0) {
                        Name name = mo1278getDeclarationDescriptor.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "descriptor.getName()");
                        jvmDescriptorTypeWriter.writeTypeVariable(name, t8);
                    }
                    return t8;
                } else if (!InlineClassesUtilsKt.isInlineClass(mo1278getDeclarationDescriptor) || mode.getNeedInlineClassWrapping() || (kotlinType2 = (KotlinType) ExpandedTypeUtilsKt.computeExpandedTypeForInlineClass(simpleClassicTypeSystemContext, kotlinType)) == null) {
                    if (mode.isForAnnotationParameter() && KotlinBuiltIns.isKClass((ClassDescriptor) mo1278getDeclarationDescriptor)) {
                        obj = (Object) factory.getJavaLangClassType();
                    } else {
                        ClassDescriptor classDescriptor = (ClassDescriptor) mo1278getDeclarationDescriptor;
                        ClassDescriptor original = classDescriptor.getOriginal();
                        Intrinsics.checkNotNullExpressionValue(original, "descriptor.original");
                        T predefinedTypeForClass = typeMappingConfiguration.getPredefinedTypeForClass(original);
                        if (predefinedTypeForClass == null) {
                            if (classDescriptor.getKind() == ClassKind.ENUM_ENTRY) {
                                classDescriptor = (ClassDescriptor) classDescriptor.getContainingDeclaration();
                            }
                            ClassDescriptor original2 = classDescriptor.getOriginal();
                            Intrinsics.checkNotNullExpressionValue(original2, "enumClassIfEnumEntry.original");
                            obj = (Object) factory.createObjectType(computeInternalName(original2, typeMappingConfiguration));
                        } else {
                            obj = (Object) predefinedTypeForClass;
                        }
                    }
                    writeGenericType.invoke(kotlinType, obj, mode);
                    return (T) obj;
                } else {
                    return (T) mapType(kotlinType2, factory, mode.wrapInlineClassesMode(), typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
                }
            }
            throw new UnsupportedOperationException(Intrinsics.stringPlus("no descriptor for type constructor of ", kotlinType));
        }
        return (T) mapType(preprocessType, factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
    }

    public static /* synthetic */ Object mapType$default(KotlinType kotlinType, JvmTypeFactory jvmTypeFactory, TypeMappingMode typeMappingMode, TypeMappingConfiguration typeMappingConfiguration, JvmDescriptorTypeWriter jvmDescriptorTypeWriter, Function3 function3, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            function3 = FunctionsKt.getDO_NOTHING_3();
        }
        return mapType(kotlinType, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, function3);
    }
}
