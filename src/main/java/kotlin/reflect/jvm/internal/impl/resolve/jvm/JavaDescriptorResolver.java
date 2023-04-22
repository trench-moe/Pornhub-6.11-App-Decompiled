package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* loaded from: classes3.dex */
public final class JavaDescriptorResolver {
    private final JavaResolverCache javaResolverCache;
    private final LazyJavaPackageFragmentProvider packageFragmentProvider;

    public JavaDescriptorResolver(LazyJavaPackageFragmentProvider packageFragmentProvider, JavaResolverCache javaResolverCache) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        this.packageFragmentProvider = packageFragmentProvider;
        this.javaResolverCache = javaResolverCache;
    }

    public final LazyJavaPackageFragmentProvider getPackageFragmentProvider() {
        return this.packageFragmentProvider;
    }

    public final ClassDescriptor resolveClass(JavaClass javaClass) {
        Intrinsics.checkNotNullParameter(javaClass, "javaClass");
        FqName fqName = javaClass.getFqName();
        if (fqName == null || javaClass.getLightClassOriginKind() != LightClassOriginKind.SOURCE) {
            JavaClass outerClass = javaClass.getOuterClass();
            if (outerClass != null) {
                ClassDescriptor resolveClass = resolveClass(outerClass);
                MemberScope unsubstitutedInnerClassesScope = resolveClass == null ? null : resolveClass.getUnsubstitutedInnerClassesScope();
                ClassifierDescriptor mo1280getContributedClassifier = unsubstitutedInnerClassesScope == null ? null : unsubstitutedInnerClassesScope.mo1280getContributedClassifier(javaClass.getName(), NoLookupLocation.FROM_JAVA_LOADER);
                if (mo1280getContributedClassifier instanceof ClassDescriptor) {
                    return (ClassDescriptor) mo1280getContributedClassifier;
                }
                return null;
            } else if (fqName == null) {
                return null;
            } else {
                LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider = this.packageFragmentProvider;
                FqName parent = fqName.parent();
                Intrinsics.checkNotNullExpressionValue(parent, "fqName.parent()");
                LazyJavaPackageFragment lazyJavaPackageFragment = (LazyJavaPackageFragment) CollectionsKt.firstOrNull((List<? extends Object>) lazyJavaPackageFragmentProvider.getPackageFragments(parent));
                if (lazyJavaPackageFragment == null) {
                    return null;
                }
                return lazyJavaPackageFragment.findClassifierByJavaClass$descriptors_jvm(javaClass);
            }
        }
        return this.javaResolverCache.getClassResolvedFromSource(fqName);
    }
}
