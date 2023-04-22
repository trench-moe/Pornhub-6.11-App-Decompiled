package kotlin.reflect.jvm;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001c\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\"\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\b¨\u0006\t"}, d2 = {"jvmErasure", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/KClassifier;", "getJvmErasure", "(Lkotlin/reflect/KClassifier;)Lkotlin/reflect/KClass;", "Lkotlin/reflect/KType;", "getJvmErasure$annotations", "(Lkotlin/reflect/KType;)V", "(Lkotlin/reflect/KType;)Lkotlin/reflect/KClass;", "kotlin-reflection"}, k = 2, mv = {1, 6, 0}, xi = 48)
@JvmName(name = "KTypesJvm")
/* loaded from: classes3.dex */
public final class KTypesJvm {
    /* JADX WARN: Multi-variable type inference failed */
    public static final KClass<?> getJvmErasure(KClassifier kClassifier) {
        ClassDescriptor classDescriptor;
        boolean z10;
        Intrinsics.checkNotNullParameter(kClassifier, "<this>");
        if (kClassifier instanceof KClass) {
            return (KClass) kClassifier;
        }
        if (kClassifier instanceof KTypeParameter) {
            List<KType> upperBounds = ((KTypeParameter) kClassifier).getUpperBounds();
            Iterator<T> it = upperBounds.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                ClassifierDescriptor mo1278getDeclarationDescriptor = ((KTypeImpl) ((KType) next)).getType().getConstructor().mo1278getDeclarationDescriptor();
                classDescriptor = mo1278getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) mo1278getDeclarationDescriptor : null;
                if (classDescriptor == null || classDescriptor.getKind() == ClassKind.INTERFACE || classDescriptor.getKind() == ClassKind.ANNOTATION_CLASS) {
                    z10 = false;
                    continue;
                } else {
                    z10 = true;
                    continue;
                }
                if (z10) {
                    classDescriptor = next;
                    break;
                }
            }
            KType kType = (KType) classDescriptor;
            if (kType == null) {
                kType = (KType) CollectionsKt.firstOrNull((List<? extends Object>) upperBounds);
            }
            return kType == null ? Reflection.getOrCreateKotlinClass(Object.class) : getJvmErasure(kType);
        }
        throw new KotlinReflectionInternalError(Intrinsics.stringPlus("Cannot calculate JVM erasure for type: ", kClassifier));
    }

    public static final KClass<?> getJvmErasure(KType kType) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        KClassifier classifier = kType.getClassifier();
        if (classifier != null) {
            return getJvmErasure(classifier);
        }
        throw new KotlinReflectionInternalError(Intrinsics.stringPlus("Cannot calculate JVM erasure for type: ", kType));
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getJvmErasure$annotations(KType kType) {
    }
}
