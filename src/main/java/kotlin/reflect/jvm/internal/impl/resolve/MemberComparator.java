package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererModifier;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes3.dex */
public class MemberComparator implements Comparator<DeclarationDescriptor> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final MemberComparator INSTANCE = new MemberComparator();
    private static final DescriptorRenderer RENDERER = DescriptorRenderer.Companion.withOptions(new Function1<DescriptorRendererOptions, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.MemberComparator.1
        @Override // kotlin.jvm.functions.Function1
        public Unit invoke(DescriptorRendererOptions descriptorRendererOptions) {
            descriptorRendererOptions.setWithDefinedIn(false);
            descriptorRendererOptions.setVerbose(true);
            descriptorRendererOptions.setAnnotationArgumentsRenderingPolicy(AnnotationArgumentsRenderingPolicy.UNLESS_EMPTY);
            descriptorRendererOptions.setModifiers(DescriptorRendererModifier.ALL);
            return Unit.INSTANCE;
        }
    });

    /* loaded from: classes3.dex */
    public static class NameAndTypeMemberComparator implements Comparator<DeclarationDescriptor> {
        public static final NameAndTypeMemberComparator INSTANCE = new NameAndTypeMemberComparator();

        private NameAndTypeMemberComparator() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Integer compareInternal(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            int declarationPriority = getDeclarationPriority(declarationDescriptor2) - getDeclarationPriority(declarationDescriptor);
            if (declarationPriority != 0) {
                return Integer.valueOf(declarationPriority);
            }
            if (DescriptorUtils.isEnumEntry(declarationDescriptor) && DescriptorUtils.isEnumEntry(declarationDescriptor2)) {
                return 0;
            }
            int compareTo = declarationDescriptor.getName().compareTo(declarationDescriptor2.getName());
            if (compareTo != 0) {
                return Integer.valueOf(compareTo);
            }
            return null;
        }

        private static int getDeclarationPriority(DeclarationDescriptor declarationDescriptor) {
            if (DescriptorUtils.isEnumEntry(declarationDescriptor)) {
                return 8;
            }
            if (declarationDescriptor instanceof ConstructorDescriptor) {
                return 7;
            }
            if (declarationDescriptor instanceof PropertyDescriptor) {
                return ((PropertyDescriptor) declarationDescriptor).getExtensionReceiverParameter() == null ? 6 : 5;
            } else if (declarationDescriptor instanceof FunctionDescriptor) {
                return ((FunctionDescriptor) declarationDescriptor).getExtensionReceiverParameter() == null ? 4 : 3;
            } else if (declarationDescriptor instanceof ClassDescriptor) {
                return 2;
            } else {
                return declarationDescriptor instanceof TypeAliasDescriptor ? 1 : 0;
            }
        }

        @Override // java.util.Comparator
        public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
            Integer compareInternal = compareInternal(declarationDescriptor, declarationDescriptor2);
            if (compareInternal != null) {
                return compareInternal.intValue();
            }
            return 0;
        }
    }

    private MemberComparator() {
    }

    @Override // java.util.Comparator
    public int compare(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        int ordinal;
        Integer compareInternal = NameAndTypeMemberComparator.compareInternal(declarationDescriptor, declarationDescriptor2);
        if (compareInternal != null) {
            return compareInternal.intValue();
        }
        if ((declarationDescriptor instanceof TypeAliasDescriptor) && (declarationDescriptor2 instanceof TypeAliasDescriptor)) {
            DescriptorRenderer descriptorRenderer = RENDERER;
            int compareTo = descriptorRenderer.renderType(((TypeAliasDescriptor) declarationDescriptor).getUnderlyingType()).compareTo(descriptorRenderer.renderType(((TypeAliasDescriptor) declarationDescriptor2).getUnderlyingType()));
            if (compareTo != 0) {
                return compareTo;
            }
        } else if ((declarationDescriptor instanceof CallableDescriptor) && (declarationDescriptor2 instanceof CallableDescriptor)) {
            CallableDescriptor callableDescriptor = (CallableDescriptor) declarationDescriptor;
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) declarationDescriptor2;
            ReceiverParameterDescriptor extensionReceiverParameter = callableDescriptor.getExtensionReceiverParameter();
            ReceiverParameterDescriptor extensionReceiverParameter2 = callableDescriptor2.getExtensionReceiverParameter();
            if (extensionReceiverParameter != null) {
                DescriptorRenderer descriptorRenderer2 = RENDERER;
                int compareTo2 = descriptorRenderer2.renderType(extensionReceiverParameter.getType()).compareTo(descriptorRenderer2.renderType(extensionReceiverParameter2.getType()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
            }
            List<ValueParameterDescriptor> valueParameters = callableDescriptor.getValueParameters();
            List<ValueParameterDescriptor> valueParameters2 = callableDescriptor2.getValueParameters();
            for (int i10 = 0; i10 < Math.min(valueParameters.size(), valueParameters2.size()); i10++) {
                DescriptorRenderer descriptorRenderer3 = RENDERER;
                int compareTo3 = descriptorRenderer3.renderType(valueParameters.get(i10).getType()).compareTo(descriptorRenderer3.renderType(valueParameters2.get(i10).getType()));
                if (compareTo3 != 0) {
                    return compareTo3;
                }
            }
            int size = valueParameters.size() - valueParameters2.size();
            if (size != 0) {
                return size;
            }
            List<TypeParameterDescriptor> typeParameters = callableDescriptor.getTypeParameters();
            List<TypeParameterDescriptor> typeParameters2 = callableDescriptor2.getTypeParameters();
            for (int i11 = 0; i11 < Math.min(typeParameters.size(), typeParameters2.size()); i11++) {
                List<KotlinType> upperBounds = typeParameters.get(i11).getUpperBounds();
                List<KotlinType> upperBounds2 = typeParameters2.get(i11).getUpperBounds();
                int size2 = upperBounds.size() - upperBounds2.size();
                if (size2 != 0) {
                    return size2;
                }
                for (int i12 = 0; i12 < upperBounds.size(); i12++) {
                    DescriptorRenderer descriptorRenderer4 = RENDERER;
                    int compareTo4 = descriptorRenderer4.renderType(upperBounds.get(i12)).compareTo(descriptorRenderer4.renderType(upperBounds2.get(i12)));
                    if (compareTo4 != 0) {
                        return compareTo4;
                    }
                }
            }
            int size3 = typeParameters.size() - typeParameters2.size();
            if (size3 != 0) {
                return size3;
            }
            if ((callableDescriptor instanceof CallableMemberDescriptor) && (callableDescriptor2 instanceof CallableMemberDescriptor) && (ordinal = ((CallableMemberDescriptor) callableDescriptor).getKind().ordinal() - ((CallableMemberDescriptor) callableDescriptor2).getKind().ordinal()) != 0) {
                return ordinal;
            }
        } else if (!(declarationDescriptor instanceof ClassDescriptor) || !(declarationDescriptor2 instanceof ClassDescriptor)) {
            throw new AssertionError(String.format("Unsupported pair of descriptors:\n'%s' Class: %s\n%s' Class: %s", declarationDescriptor, declarationDescriptor.getClass(), declarationDescriptor2, declarationDescriptor2.getClass()));
        } else {
            ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
            ClassDescriptor classDescriptor2 = (ClassDescriptor) declarationDescriptor2;
            if (classDescriptor.getKind().ordinal() != classDescriptor2.getKind().ordinal()) {
                return classDescriptor.getKind().ordinal() - classDescriptor2.getKind().ordinal();
            }
            if (classDescriptor.isCompanionObject() != classDescriptor2.isCompanionObject()) {
                return classDescriptor.isCompanionObject() ? 1 : -1;
            }
        }
        DescriptorRenderer descriptorRenderer5 = RENDERER;
        int compareTo5 = descriptorRenderer5.render(declarationDescriptor).compareTo(descriptorRenderer5.render(declarationDescriptor2));
        return compareTo5 != 0 ? compareTo5 : DescriptorUtils.getContainingModule(declarationDescriptor).getName().compareTo(DescriptorUtils.getContainingModule(declarationDescriptor2).getName());
    }
}
