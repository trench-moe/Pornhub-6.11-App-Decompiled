package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes3.dex */
public interface JavaAnnotation extends JavaElement {

    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static boolean isFreshlySupportedTypeUseAnnotation(JavaAnnotation javaAnnotation) {
            Intrinsics.checkNotNullParameter(javaAnnotation, "this");
            return false;
        }

        public static boolean isIdeExternalAnnotation(JavaAnnotation javaAnnotation) {
            Intrinsics.checkNotNullParameter(javaAnnotation, "this");
            return false;
        }
    }

    Collection<JavaAnnotationArgument> getArguments();

    ClassId getClassId();

    boolean isFreshlySupportedTypeUseAnnotation();

    boolean isIdeExternalAnnotation();

    JavaClass resolve();
}
