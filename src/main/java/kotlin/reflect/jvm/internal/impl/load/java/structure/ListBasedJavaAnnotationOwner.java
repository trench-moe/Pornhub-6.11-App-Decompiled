package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes3.dex */
public interface ListBasedJavaAnnotationOwner extends JavaAnnotationOwner {

    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static JavaAnnotation findAnnotation(ListBasedJavaAnnotationOwner listBasedJavaAnnotationOwner, FqName fqName) {
            Object obj;
            Intrinsics.checkNotNullParameter(listBasedJavaAnnotationOwner, "this");
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Iterator<T> it = listBasedJavaAnnotationOwner.getAnnotations().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ClassId classId = ((JavaAnnotation) next).getClassId();
                if (Intrinsics.areEqual(classId != null ? classId.asSingleFqName() : null, fqName)) {
                    obj = next;
                    break;
                }
            }
            return (JavaAnnotation) obj;
        }
    }
}
