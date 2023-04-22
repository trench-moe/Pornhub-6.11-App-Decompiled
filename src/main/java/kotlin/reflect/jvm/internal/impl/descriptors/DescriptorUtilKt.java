package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes3.dex */
public final class DescriptorUtilKt {
    public static final ClassifierDescriptor getTopLevelContainingClassifier(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        DeclarationDescriptor containingDeclaration = declarationDescriptor.getContainingDeclaration();
        if (containingDeclaration == null || (declarationDescriptor instanceof PackageFragmentDescriptor)) {
            return null;
        }
        if (isTopLevelInPackage(containingDeclaration)) {
            if (containingDeclaration instanceof ClassifierDescriptor) {
                return (ClassifierDescriptor) containingDeclaration;
            }
            return null;
        }
        return getTopLevelContainingClassifier(containingDeclaration);
    }

    public static final boolean isTopLevelInPackage(DeclarationDescriptor declarationDescriptor) {
        Intrinsics.checkNotNullParameter(declarationDescriptor, "<this>");
        return declarationDescriptor.getContainingDeclaration() instanceof PackageFragmentDescriptor;
    }

    public static final ClassDescriptor resolveClassByFqName(ModuleDescriptor moduleDescriptor, FqName fqName, LookupLocation lookupLocation) {
        ClassifierDescriptor mo1280getContributedClassifier;
        Intrinsics.checkNotNullParameter(moduleDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(lookupLocation, "lookupLocation");
        if (fqName.isRoot()) {
            return null;
        }
        FqName parent = fqName.parent();
        Intrinsics.checkNotNullExpressionValue(parent, "fqName.parent()");
        MemberScope memberScope = moduleDescriptor.getPackage(parent).getMemberScope();
        Name shortName = fqName.shortName();
        Intrinsics.checkNotNullExpressionValue(shortName, "fqName.shortName()");
        ClassifierDescriptor mo1280getContributedClassifier2 = memberScope.mo1280getContributedClassifier(shortName, lookupLocation);
        ClassDescriptor classDescriptor = mo1280getContributedClassifier2 instanceof ClassDescriptor ? (ClassDescriptor) mo1280getContributedClassifier2 : null;
        if (classDescriptor == null) {
            FqName parent2 = fqName.parent();
            Intrinsics.checkNotNullExpressionValue(parent2, "fqName.parent()");
            ClassDescriptor resolveClassByFqName = resolveClassByFqName(moduleDescriptor, parent2, lookupLocation);
            if (resolveClassByFqName == null) {
                mo1280getContributedClassifier = null;
            } else {
                MemberScope unsubstitutedInnerClassesScope = resolveClassByFqName.getUnsubstitutedInnerClassesScope();
                Name shortName2 = fqName.shortName();
                Intrinsics.checkNotNullExpressionValue(shortName2, "fqName.shortName()");
                mo1280getContributedClassifier = unsubstitutedInnerClassesScope.mo1280getContributedClassifier(shortName2, lookupLocation);
            }
            if (mo1280getContributedClassifier instanceof ClassDescriptor) {
                return (ClassDescriptor) mo1280getContributedClassifier;
            }
            return null;
        }
        return classDescriptor;
    }
}
