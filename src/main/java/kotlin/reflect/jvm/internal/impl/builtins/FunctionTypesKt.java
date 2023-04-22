package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* loaded from: classes3.dex */
public final class FunctionTypesKt {
    @JvmOverloads
    public static final SimpleType createFunctionType(KotlinBuiltIns builtIns, Annotations annotations, KotlinType kotlinType, List<? extends KotlinType> parameterTypes, List<Name> list, KotlinType returnType, boolean z10) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(returnType, "returnType");
        List<TypeProjection> functionTypeArgumentProjections = getFunctionTypeArgumentProjections(kotlinType, parameterTypes, list, returnType, builtIns);
        int size = parameterTypes.size();
        if (kotlinType != null) {
            size++;
        }
        ClassDescriptor functionDescriptor = getFunctionDescriptor(builtIns, size, z10);
        if (kotlinType != null) {
            annotations = withExtensionFunctionAnnotation(annotations, builtIns);
        }
        return KotlinTypeFactory.simpleNotNullType(annotations, functionDescriptor, functionTypeArgumentProjections);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        if (kotlin.reflect.jvm.internal.impl.name.Name.isValidIdentifier(r2) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.reflect.jvm.internal.impl.name.Name extractParameterNameFromFunctionTypeArgument(kotlin.reflect.jvm.internal.impl.types.KotlinType r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r2 = r2.getAnnotations()
            kotlin.reflect.jvm.internal.impl.name.FqName r0 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.parameterName
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor r2 = r2.mo1272findAnnotation(r0)
            r0 = 0
            if (r2 != 0) goto L13
            return r0
        L13:
            java.util.Map r2 = r2.getAllValueArguments()
            java.util.Collection r2 = r2.values()
            java.lang.Object r2 = kotlin.collections.CollectionsKt.singleOrNull(r2)
            boolean r1 = r2 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue
            if (r1 == 0) goto L26
            kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue r2 = (kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue) r2
            goto L27
        L26:
            r2 = r0
        L27:
            if (r2 != 0) goto L2b
        L29:
            r2 = r0
            goto L37
        L2b:
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = kotlin.reflect.jvm.internal.impl.name.Name.isValidIdentifier(r2)
            if (r1 == 0) goto L29
        L37:
            if (r2 != 0) goto L3a
            return r0
        L3a:
            kotlin.reflect.jvm.internal.impl.name.Name r2 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.extractParameterNameFromFunctionTypeArgument(kotlin.reflect.jvm.internal.impl.types.KotlinType):kotlin.reflect.jvm.internal.impl.name.Name");
    }

    public static final ClassDescriptor getFunctionDescriptor(KotlinBuiltIns builtIns, int i10, boolean z10) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        ClassDescriptor suspendFunction = z10 ? builtIns.getSuspendFunction(i10) : builtIns.getFunction(i10);
        Intrinsics.checkNotNullExpressionValue(suspendFunction, "if (isSuspendFunction) b…tFunction(parameterCount)");
        return suspendFunction;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r2.isSpecial() == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getFunctionTypeArgumentProjections(kotlin.reflect.jvm.internal.impl.types.KotlinType r9, java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.KotlinType> r10, java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> r11, kotlin.reflect.jvm.internal.impl.types.KotlinType r12, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns r13) {
        /*
            java.lang.String r0 = "parameterTypes"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "returnType"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.size()
            r2 = 0
            r3 = 1
            if (r9 == 0) goto L1b
            r4 = 1
            goto L1c
        L1b:
            r4 = 0
        L1c:
            int r1 = r1 + r4
            int r1 = r1 + r3
            r0.<init>(r1)
            r1 = 0
            if (r9 != 0) goto L26
            r9 = r1
            goto L2a
        L26:
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r9 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(r9)
        L2a:
            kotlin.reflect.jvm.internal.impl.utils.CollectionsKt.addIfNotNull(r0, r9)
            java.util.Iterator r9 = r10.iterator()
        L31:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L94
            java.lang.Object r10 = r9.next()
            int r3 = r2 + 1
            if (r2 >= 0) goto L42
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L42:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r10 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r10
            if (r11 != 0) goto L48
        L46:
            r2 = r1
            goto L54
        L48:
            java.lang.Object r2 = r11.get(r2)
            kotlin.reflect.jvm.internal.impl.name.Name r2 = (kotlin.reflect.jvm.internal.impl.name.Name) r2
            boolean r4 = r2.isSpecial()
            if (r4 != 0) goto L46
        L54:
            if (r2 == 0) goto L8b
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor r4 = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor
            kotlin.reflect.jvm.internal.impl.name.FqName r5 = kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.parameterName
            java.lang.String r6 = "name"
            kotlin.reflect.jvm.internal.impl.name.Name r6 = kotlin.reflect.jvm.internal.impl.name.Name.identifier(r6)
            kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue r7 = new kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue
            java.lang.String r2 = r2.asString()
            java.lang.String r8 = "name.asString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r8)
            r7.<init>(r2)
            kotlin.Pair r2 = kotlin.TuplesKt.to(r6, r7)
            java.util.Map r2 = kotlin.collections.MapsKt.mapOf(r2)
            r4.<init>(r13, r5, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations$Companion r2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations.Companion
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r5 = r10.getAnnotations()
            java.util.List r4 = kotlin.collections.CollectionsKt.plus(r5, r4)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r2 = r2.create(r4)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r10 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.replaceAnnotations(r10, r2)
        L8b:
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r10 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(r10)
            r0.add(r10)
            r2 = r3
            goto L31
        L94:
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r9 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection(r12)
            r0.add(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt.getFunctionTypeArgumentProjections(kotlin.reflect.jvm.internal.impl.types.KotlinType, java.util.List, java.util.List, kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns):java.util.List");
    }

    public static final FunctionClassKind getFunctionalClassKind(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        if ((declarationDescriptor instanceof ClassDescriptor) && KotlinBuiltIns.isUnderKotlinPackage(declarationDescriptor)) {
            return getFunctionalClassKind(DescriptorUtilsKt.getFqNameUnsafe(declarationDescriptor));
        }
        return null;
    }

    private static final FunctionClassKind getFunctionalClassKind(FqNameUnsafe fqNameUnsafe) {
        if (!fqNameUnsafe.isSafe() || fqNameUnsafe.isRoot()) {
            return null;
        }
        FunctionClassKind.Companion companion = FunctionClassKind.Companion;
        String asString = fqNameUnsafe.shortName().asString();
        Intrinsics.checkNotNullExpressionValue(asString, "shortName().asString()");
        FqName parent = fqNameUnsafe.toSafe().parent();
        Intrinsics.checkNotNullExpressionValue(parent, "toSafe().parent()");
        return companion.getFunctionalClassKind(asString, parent);
    }

    public static final KotlinType getReceiverTypeFromFunctionType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        if (isTypeAnnotatedWithExtensionFunctionType(kotlinType)) {
            return ((TypeProjection) CollectionsKt.first((List<? extends Object>) kotlinType.getArguments())).getType();
        }
        return null;
    }

    public static final KotlinType getReturnTypeFromFunctionType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        KotlinType type = ((TypeProjection) CollectionsKt.last((List<? extends Object>) kotlinType.getArguments())).getType();
        Intrinsics.checkNotNullExpressionValue(type, "arguments.last().type");
        return type;
    }

    public static final List<TypeProjection> getValueParameterTypesFromFunctionType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        isBuiltinFunctionalType(kotlinType);
        List<TypeProjection> arguments = kotlinType.getArguments();
        return arguments.subList(isBuiltinExtensionFunctionalType(kotlinType) ? 1 : 0, arguments.size() - 1);
    }

    public static final boolean isBuiltinExtensionFunctionalType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        return isBuiltinFunctionalType(kotlinType) && isTypeAnnotatedWithExtensionFunctionType(kotlinType);
    }

    public static final boolean isBuiltinFunctionalClassDescriptor(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        FunctionClassKind functionalClassKind = getFunctionalClassKind(declarationDescriptor);
        return functionalClassKind == FunctionClassKind.Function || functionalClassKind == FunctionClassKind.SuspendFunction;
    }

    public static final boolean isBuiltinFunctionalType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor mo1278getDeclarationDescriptor = kotlinType.getConstructor().mo1278getDeclarationDescriptor();
        return mo1278getDeclarationDescriptor != null && isBuiltinFunctionalClassDescriptor(mo1278getDeclarationDescriptor);
    }

    public static final boolean isFunctionType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor mo1278getDeclarationDescriptor = kotlinType.getConstructor().mo1278getDeclarationDescriptor();
        return (mo1278getDeclarationDescriptor == null ? null : getFunctionalClassKind(mo1278getDeclarationDescriptor)) == FunctionClassKind.Function;
    }

    public static final boolean isSuspendFunctionType(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        ClassifierDescriptor mo1278getDeclarationDescriptor = kotlinType.getConstructor().mo1278getDeclarationDescriptor();
        return (mo1278getDeclarationDescriptor == null ? null : getFunctionalClassKind(mo1278getDeclarationDescriptor)) == FunctionClassKind.SuspendFunction;
    }

    private static final boolean isTypeAnnotatedWithExtensionFunctionType(KotlinType kotlinType) {
        return kotlinType.getAnnotations().mo1272findAnnotation(StandardNames.FqNames.extensionFunctionType) != null;
    }

    public static final Annotations withExtensionFunctionAnnotation(Annotations annotations, KotlinBuiltIns builtIns) {
        Intrinsics.checkNotNullParameter(annotations, "<this>");
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        FqName fqName = StandardNames.FqNames.extensionFunctionType;
        return annotations.hasAnnotation(fqName) ? annotations : Annotations.Companion.create(CollectionsKt.plus(annotations, new BuiltInAnnotationDescriptor(builtIns, fqName, MapsKt.emptyMap())));
    }
}
