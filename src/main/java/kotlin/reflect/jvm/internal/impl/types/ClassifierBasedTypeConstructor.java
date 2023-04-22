package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;

/* loaded from: classes3.dex */
public abstract class ClassifierBasedTypeConstructor implements TypeConstructor {
    private int hashCode;

    private final boolean hasMeaningfulFqName(ClassifierDescriptor classifierDescriptor) {
        return (ErrorUtils.isError(classifierDescriptor) || DescriptorUtils.isLocal(classifierDescriptor)) ? false : true;
    }

    public final boolean areFqNamesEqual(ClassifierDescriptor first, ClassifierDescriptor second) {
        Intrinsics.checkNotNullParameter(first, "first");
        Intrinsics.checkNotNullParameter(second, "second");
        if (Intrinsics.areEqual(first.getName(), second.getName())) {
            DeclarationDescriptor containingDeclaration = first.getContainingDeclaration();
            for (DeclarationDescriptor containingDeclaration2 = second.getContainingDeclaration(); containingDeclaration != null && containingDeclaration2 != null; containingDeclaration2 = containingDeclaration2.getContainingDeclaration()) {
                if (containingDeclaration instanceof ModuleDescriptor) {
                    return containingDeclaration2 instanceof ModuleDescriptor;
                }
                if (containingDeclaration2 instanceof ModuleDescriptor) {
                    return false;
                }
                if (containingDeclaration instanceof PackageFragmentDescriptor) {
                    return (containingDeclaration2 instanceof PackageFragmentDescriptor) && Intrinsics.areEqual(((PackageFragmentDescriptor) containingDeclaration).getFqName(), ((PackageFragmentDescriptor) containingDeclaration2).getFqName());
                } else if ((containingDeclaration2 instanceof PackageFragmentDescriptor) || !Intrinsics.areEqual(containingDeclaration.getName(), containingDeclaration2.getName())) {
                    return false;
                } else {
                    containingDeclaration = containingDeclaration.getContainingDeclaration();
                }
            }
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TypeConstructor) && obj.hashCode() == hashCode()) {
            TypeConstructor typeConstructor = (TypeConstructor) obj;
            if (typeConstructor.getParameters().size() != getParameters().size()) {
                return false;
            }
            ClassifierDescriptor mo1278getDeclarationDescriptor = mo1278getDeclarationDescriptor();
            ClassifierDescriptor mo1278getDeclarationDescriptor2 = typeConstructor.mo1278getDeclarationDescriptor();
            if (mo1278getDeclarationDescriptor2 != null && hasMeaningfulFqName(mo1278getDeclarationDescriptor) && hasMeaningfulFqName(mo1278getDeclarationDescriptor2)) {
                return isSameClassifier(mo1278getDeclarationDescriptor2);
            }
            return false;
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* renamed from: getDeclarationDescriptor */
    public abstract ClassifierDescriptor mo1278getDeclarationDescriptor();

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        ClassifierDescriptor mo1278getDeclarationDescriptor = mo1278getDeclarationDescriptor();
        int hashCode = hasMeaningfulFqName(mo1278getDeclarationDescriptor) ? DescriptorUtils.getFqName(mo1278getDeclarationDescriptor).hashCode() : System.identityHashCode(this);
        this.hashCode = hashCode;
        return hashCode;
    }

    public abstract boolean isSameClassifier(ClassifierDescriptor classifierDescriptor);
}
