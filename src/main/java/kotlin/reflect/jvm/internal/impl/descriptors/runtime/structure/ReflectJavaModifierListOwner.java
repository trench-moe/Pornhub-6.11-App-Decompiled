package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Modifier;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibility;
import kotlin.reflect.jvm.internal.impl.descriptors.java.JavaVisibilities;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner;

/* loaded from: classes3.dex */
public interface ReflectJavaModifierListOwner extends JavaModifierListOwner {

    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static Visibility getVisibility(ReflectJavaModifierListOwner reflectJavaModifierListOwner) {
            Intrinsics.checkNotNullParameter(reflectJavaModifierListOwner, "this");
            int modifiers = reflectJavaModifierListOwner.getModifiers();
            return Modifier.isPublic(modifiers) ? Visibilities.Public.INSTANCE : Modifier.isPrivate(modifiers) ? Visibilities.Private.INSTANCE : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? JavaVisibilities.ProtectedStaticVisibility.INSTANCE : JavaVisibilities.ProtectedAndPackage.INSTANCE : JavaVisibilities.PackageVisibility.INSTANCE;
        }

        public static boolean isAbstract(ReflectJavaModifierListOwner reflectJavaModifierListOwner) {
            Intrinsics.checkNotNullParameter(reflectJavaModifierListOwner, "this");
            return Modifier.isAbstract(reflectJavaModifierListOwner.getModifiers());
        }

        public static boolean isFinal(ReflectJavaModifierListOwner reflectJavaModifierListOwner) {
            Intrinsics.checkNotNullParameter(reflectJavaModifierListOwner, "this");
            return Modifier.isFinal(reflectJavaModifierListOwner.getModifiers());
        }

        public static boolean isStatic(ReflectJavaModifierListOwner reflectJavaModifierListOwner) {
            Intrinsics.checkNotNullParameter(reflectJavaModifierListOwner, "this");
            return Modifier.isStatic(reflectJavaModifierListOwner.getModifiers());
        }
    }

    int getModifiers();
}
