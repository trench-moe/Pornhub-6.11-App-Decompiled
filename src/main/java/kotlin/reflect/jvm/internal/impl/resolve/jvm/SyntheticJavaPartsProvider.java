package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes3.dex */
public interface SyntheticJavaPartsProvider {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes3.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final CompositeSyntheticJavaPartsProvider EMPTY = new CompositeSyntheticJavaPartsProvider(CollectionsKt.emptyList());

        private Companion() {
        }

        public final CompositeSyntheticJavaPartsProvider getEMPTY() {
            return EMPTY;
        }
    }

    void generateConstructors(ClassDescriptor classDescriptor, List<ClassConstructorDescriptor> list);

    void generateMethods(ClassDescriptor classDescriptor, Name name, Collection<SimpleFunctionDescriptor> collection);

    void generateStaticFunctions(ClassDescriptor classDescriptor, Name name, Collection<SimpleFunctionDescriptor> collection);

    List<Name> getMethodNames(ClassDescriptor classDescriptor);

    List<Name> getStaticFunctionNames(ClassDescriptor classDescriptor);
}
