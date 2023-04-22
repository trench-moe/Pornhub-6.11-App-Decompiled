package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FieldDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyGetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertySetterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoTypeTableUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedTypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.NonEmptyDeserializedAnnotations;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes3.dex */
public final class MemberDeserializer {
    private final AnnotationDeserializer annotationDeserializer;

    /* renamed from: c  reason: collision with root package name */
    private final DeserializationContext f12098c;

    public MemberDeserializer(DeserializationContext c10) {
        Intrinsics.checkNotNullParameter(c10, "c");
        this.f12098c = c10;
        this.annotationDeserializer = new AnnotationDeserializer(c10.getComponents().getModuleDescriptor(), c10.getComponents().getNotFoundClasses());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ProtoContainer asProtoContainer(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor instanceof PackageFragmentDescriptor) {
            return new ProtoContainer.Package(((PackageFragmentDescriptor) declarationDescriptor).getFqName(), this.f12098c.getNameResolver(), this.f12098c.getTypeTable(), this.f12098c.getContainerSource());
        }
        if (declarationDescriptor instanceof DeserializedClassDescriptor) {
            return ((DeserializedClassDescriptor) declarationDescriptor).getThisAsProtoContainer$deserialization();
        }
        return null;
    }

    private final Annotations getAnnotations(final MessageLite messageLite, int i10, final AnnotatedCallableKind annotatedCallableKind) {
        return !Flags.HAS_ANNOTATIONS.get(i10).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f12098c.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AnnotationDescriptor> invoke() {
                DeserializationContext deserializationContext;
                ProtoContainer asProtoContainer;
                DeserializationContext deserializationContext2;
                List<? extends AnnotationDescriptor> list;
                MemberDeserializer memberDeserializer = MemberDeserializer.this;
                deserializationContext = memberDeserializer.f12098c;
                asProtoContainer = memberDeserializer.asProtoContainer(deserializationContext.getContainingDeclaration());
                if (asProtoContainer == null) {
                    list = null;
                } else {
                    MemberDeserializer memberDeserializer2 = MemberDeserializer.this;
                    MessageLite messageLite2 = messageLite;
                    AnnotatedCallableKind annotatedCallableKind2 = annotatedCallableKind;
                    deserializationContext2 = memberDeserializer2.f12098c;
                    list = CollectionsKt.toList(deserializationContext2.getComponents().getAnnotationAndConstantLoader().loadCallableAnnotations(asProtoContainer, messageLite2, annotatedCallableKind2));
                }
                return list == null ? CollectionsKt.emptyList() : list;
            }
        });
    }

    private final ReceiverParameterDescriptor getDispatchReceiverParameter() {
        DeclarationDescriptor containingDeclaration = this.f12098c.getContainingDeclaration();
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor == null) {
            return null;
        }
        return classDescriptor.getThisAsReceiverParameter();
    }

    private final Annotations getPropertyFieldAnnotations(final ProtoBuf.Property property, final boolean z10) {
        return !Flags.HAS_ANNOTATIONS.get(property.getFlags()).booleanValue() ? Annotations.Companion.getEMPTY() : new NonEmptyDeserializedAnnotations(this.f12098c.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getPropertyFieldAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AnnotationDescriptor> invoke() {
                DeserializationContext deserializationContext;
                ProtoContainer asProtoContainer;
                DeserializationContext deserializationContext2;
                List<? extends AnnotationDescriptor> list;
                DeserializationContext deserializationContext3;
                MemberDeserializer memberDeserializer = MemberDeserializer.this;
                deserializationContext = memberDeserializer.f12098c;
                asProtoContainer = memberDeserializer.asProtoContainer(deserializationContext.getContainingDeclaration());
                if (asProtoContainer == null) {
                    list = null;
                } else {
                    boolean z11 = z10;
                    MemberDeserializer memberDeserializer2 = MemberDeserializer.this;
                    ProtoBuf.Property property2 = property;
                    if (z11) {
                        deserializationContext3 = memberDeserializer2.f12098c;
                        list = CollectionsKt.toList(deserializationContext3.getComponents().getAnnotationAndConstantLoader().loadPropertyDelegateFieldAnnotations(asProtoContainer, property2));
                    } else {
                        deserializationContext2 = memberDeserializer2.f12098c;
                        list = CollectionsKt.toList(deserializationContext2.getComponents().getAnnotationAndConstantLoader().loadPropertyBackingFieldAnnotations(asProtoContainer, property2));
                    }
                }
                return list == null ? CollectionsKt.emptyList() : list;
            }
        });
    }

    private final Annotations getReceiverParameterAnnotations(final MessageLite messageLite, final AnnotatedCallableKind annotatedCallableKind) {
        return new DeserializedAnnotations(this.f12098c.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$getReceiverParameterAnnotations$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final List<? extends AnnotationDescriptor> invoke() {
                DeserializationContext deserializationContext;
                ProtoContainer asProtoContainer;
                DeserializationContext deserializationContext2;
                List<AnnotationDescriptor> loadExtensionReceiverParameterAnnotations;
                MemberDeserializer memberDeserializer = MemberDeserializer.this;
                deserializationContext = memberDeserializer.f12098c;
                asProtoContainer = memberDeserializer.asProtoContainer(deserializationContext.getContainingDeclaration());
                if (asProtoContainer == null) {
                    loadExtensionReceiverParameterAnnotations = null;
                } else {
                    MemberDeserializer memberDeserializer2 = MemberDeserializer.this;
                    MessageLite messageLite2 = messageLite;
                    AnnotatedCallableKind annotatedCallableKind2 = annotatedCallableKind;
                    deserializationContext2 = memberDeserializer2.f12098c;
                    loadExtensionReceiverParameterAnnotations = deserializationContext2.getComponents().getAnnotationAndConstantLoader().loadExtensionReceiverParameterAnnotations(asProtoContainer, messageLite2, annotatedCallableKind2);
                }
                return loadExtensionReceiverParameterAnnotations == null ? CollectionsKt.emptyList() : loadExtensionReceiverParameterAnnotations;
            }
        });
    }

    private final void initializeWithCoroutinesExperimentalityStatus(DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<? extends TypeParameterDescriptor> list, List<? extends ValueParameterDescriptor> list2, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility, Map<? extends CallableDescriptor.UserDataKey<?>, ?> map) {
        deserializedSimpleFunctionDescriptor.initialize(receiverParameterDescriptor, receiverParameterDescriptor2, list, list2, kotlinType, modality, descriptorVisibility, map);
    }

    private final int loadOldFlags(int i10) {
        return (i10 & 63) + ((i10 >> 8) << 6);
    }

    private final List<ValueParameterDescriptor> valueParameters(List<ProtoBuf.ValueParameter> list, final MessageLite messageLite, final AnnotatedCallableKind annotatedCallableKind) {
        NonEmptyDeserializedAnnotations empty;
        CallableDescriptor callableDescriptor = (CallableDescriptor) this.f12098c.getContainingDeclaration();
        DeclarationDescriptor containingDeclaration = callableDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "callableDescriptor.containingDeclaration");
        final ProtoContainer asProtoContainer = asProtoContainer(containingDeclaration);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final ProtoBuf.ValueParameter valueParameter = (ProtoBuf.ValueParameter) obj;
            int flags = valueParameter.hasFlags() ? valueParameter.getFlags() : 0;
            if (asProtoContainer == null || !a.q(Flags.HAS_ANNOTATIONS, flags, "HAS_ANNOTATIONS.get(flags)")) {
                empty = Annotations.Companion.getEMPTY();
            } else {
                final int i12 = i10;
                empty = new NonEmptyDeserializedAnnotations(this.f12098c.getStorageManager(), new Function0<List<? extends AnnotationDescriptor>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$valueParameters$1$annotations$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final List<? extends AnnotationDescriptor> invoke() {
                        DeserializationContext deserializationContext;
                        deserializationContext = MemberDeserializer.this.f12098c;
                        return CollectionsKt.toList(deserializationContext.getComponents().getAnnotationAndConstantLoader().loadValueParameterAnnotations(asProtoContainer, messageLite, annotatedCallableKind, i12, valueParameter));
                    }
                });
            }
            Name name = NameResolverUtilKt.getName(this.f12098c.getNameResolver(), valueParameter.getName());
            KotlinType type = this.f12098c.getTypeDeserializer().type(ProtoTypeTableUtilKt.type(valueParameter, this.f12098c.getTypeTable()));
            boolean q10 = a.q(Flags.DECLARES_DEFAULT_VALUE, flags, "DECLARES_DEFAULT_VALUE.get(flags)");
            boolean q11 = a.q(Flags.IS_CROSSINLINE, flags, "IS_CROSSINLINE.get(flags)");
            boolean q12 = a.q(Flags.IS_NOINLINE, flags, "IS_NOINLINE.get(flags)");
            ProtoBuf.Type varargElementType = ProtoTypeTableUtilKt.varargElementType(valueParameter, this.f12098c.getTypeTable());
            KotlinType type2 = varargElementType == null ? null : this.f12098c.getTypeDeserializer().type(varargElementType);
            SourceElement NO_SOURCE = SourceElement.NO_SOURCE;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new ValueParameterDescriptorImpl(callableDescriptor, null, i10, empty, name, type, q10, q11, q12, type2, NO_SOURCE));
            arrayList = arrayList2;
            i10 = i11;
        }
        return CollectionsKt.toList(arrayList);
    }

    public final ClassConstructorDescriptor loadConstructor(ProtoBuf.Constructor proto, boolean z10) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        ClassDescriptor classDescriptor = (ClassDescriptor) this.f12098c.getContainingDeclaration();
        int flags = proto.getFlags();
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor(classDescriptor, null, getAnnotations(proto, flags, annotatedCallableKind), z10, CallableMemberDescriptor.Kind.DECLARATION, proto, this.f12098c.getNameResolver(), this.f12098c.getTypeTable(), this.f12098c.getVersionRequirementTable(), this.f12098c.getContainerSource(), null, 1024, null);
        MemberDeserializer memberDeserializer = DeserializationContext.childContext$default(this.f12098c, deserializedClassConstructorDescriptor, CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "proto.valueParameterList");
        deserializedClassConstructorDescriptor.initialize(memberDeserializer.valueParameters(valueParameterList, proto, annotatedCallableKind), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(proto.getFlags())));
        deserializedClassConstructorDescriptor.setReturnType(classDescriptor.getDefaultType());
        deserializedClassConstructorDescriptor.setHasStableParameterNames(!Flags.IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES.get(proto.getFlags()).booleanValue());
        return deserializedClassConstructorDescriptor;
    }

    public final SimpleFunctionDescriptor loadFunction(ProtoBuf.Function proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        int flags = proto.hasFlags() ? proto.getFlags() : loadOldFlags(proto.getOldFlags());
        AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.FUNCTION;
        Annotations annotations = getAnnotations(proto, flags, annotatedCallableKind);
        Annotations receiverParameterAnnotations = ProtoTypeTableUtilKt.hasReceiver(proto) ? getReceiverParameterAnnotations(proto, annotatedCallableKind) : Annotations.Companion.getEMPTY();
        VersionRequirementTable empty = Intrinsics.areEqual(DescriptorUtilsKt.getFqNameSafe(this.f12098c.getContainingDeclaration()).child(NameResolverUtilKt.getName(this.f12098c.getNameResolver(), proto.getName())), SuspendFunctionTypeUtilKt.KOTLIN_SUSPEND_BUILT_IN_FUNCTION_FQ_NAME) ? VersionRequirementTable.Companion.getEMPTY() : this.f12098c.getVersionRequirementTable();
        DeclarationDescriptor containingDeclaration = this.f12098c.getContainingDeclaration();
        Name name = NameResolverUtilKt.getName(this.f12098c.getNameResolver(), proto.getName());
        ProtoEnumFlags protoEnumFlags = ProtoEnumFlags.INSTANCE;
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(containingDeclaration, null, annotations, name, ProtoEnumFlagsUtilsKt.memberKind(protoEnumFlags, Flags.MEMBER_KIND.get(flags)), proto, this.f12098c.getNameResolver(), this.f12098c.getTypeTable(), empty, this.f12098c.getContainerSource(), null, 1024, null);
        DeserializationContext deserializationContext = this.f12098c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "proto.typeParameterList");
        DeserializationContext childContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedSimpleFunctionDescriptor, typeParameterList, null, null, null, null, 60, null);
        ProtoBuf.Type receiverType = ProtoTypeTableUtilKt.receiverType(proto, this.f12098c.getTypeTable());
        ReceiverParameterDescriptor createExtensionReceiverParameterForCallable = receiverType == null ? null : DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedSimpleFunctionDescriptor, childContext$default.getTypeDeserializer().type(receiverType), receiverParameterAnnotations);
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        List<TypeParameterDescriptor> ownTypeParameters = childContext$default.getTypeDeserializer().getOwnTypeParameters();
        MemberDeserializer memberDeserializer = childContext$default.getMemberDeserializer();
        List<ProtoBuf.ValueParameter> valueParameterList = proto.getValueParameterList();
        Intrinsics.checkNotNullExpressionValue(valueParameterList, "proto.valueParameterList");
        initializeWithCoroutinesExperimentalityStatus(deserializedSimpleFunctionDescriptor, createExtensionReceiverParameterForCallable, dispatchReceiverParameter, ownTypeParameters, memberDeserializer.valueParameters(valueParameterList, proto, annotatedCallableKind), childContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(proto, this.f12098c.getTypeTable())), protoEnumFlags.modality(Flags.MODALITY.get(flags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags, Flags.VISIBILITY.get(flags)), MapsKt.emptyMap());
        Boolean bool = Flags.IS_OPERATOR.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool, "IS_OPERATOR.get(flags)");
        deserializedSimpleFunctionDescriptor.setOperator(bool.booleanValue());
        Boolean bool2 = Flags.IS_INFIX.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool2, "IS_INFIX.get(flags)");
        deserializedSimpleFunctionDescriptor.setInfix(bool2.booleanValue());
        Boolean bool3 = Flags.IS_EXTERNAL_FUNCTION.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool3, "IS_EXTERNAL_FUNCTION.get(flags)");
        deserializedSimpleFunctionDescriptor.setExternal(bool3.booleanValue());
        Boolean bool4 = Flags.IS_INLINE.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool4, "IS_INLINE.get(flags)");
        deserializedSimpleFunctionDescriptor.setInline(bool4.booleanValue());
        Boolean bool5 = Flags.IS_TAILREC.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool5, "IS_TAILREC.get(flags)");
        deserializedSimpleFunctionDescriptor.setTailrec(bool5.booleanValue());
        Boolean bool6 = Flags.IS_SUSPEND.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool6, "IS_SUSPEND.get(flags)");
        deserializedSimpleFunctionDescriptor.setSuspend(bool6.booleanValue());
        Boolean bool7 = Flags.IS_EXPECT_FUNCTION.get(flags);
        Intrinsics.checkNotNullExpressionValue(bool7, "IS_EXPECT_FUNCTION.get(flags)");
        deserializedSimpleFunctionDescriptor.setExpect(bool7.booleanValue());
        deserializedSimpleFunctionDescriptor.setHasStableParameterNames(!Flags.IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES.get(flags).booleanValue());
        Pair<CallableDescriptor.UserDataKey<?>, Object> deserializeContractFromFunction = this.f12098c.getComponents().getContractDeserializer().deserializeContractFromFunction(proto, deserializedSimpleFunctionDescriptor, this.f12098c.getTypeTable(), childContext$default.getTypeDeserializer());
        if (deserializeContractFromFunction != null) {
            deserializedSimpleFunctionDescriptor.putInUserDataMap(deserializeContractFromFunction.getFirst(), deserializeContractFromFunction.getSecond());
        }
        return deserializedSimpleFunctionDescriptor;
    }

    public final PropertyDescriptor loadProperty(ProtoBuf.Property proto) {
        final ProtoBuf.Property property;
        Annotations empty;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor;
        ReceiverParameterDescriptor createExtensionReceiverParameterForCallable;
        Flags.FlagField<ProtoBuf.Visibility> flagField;
        Flags.FlagField<ProtoBuf.Modality> flagField2;
        final DeserializedPropertyDescriptor deserializedPropertyDescriptor2;
        ProtoEnumFlags protoEnumFlags;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl;
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl2;
        boolean z10;
        PropertySetterDescriptorImpl propertySetterDescriptorImpl;
        final MemberDeserializer memberDeserializer;
        Intrinsics.checkNotNullParameter(proto, "proto");
        int flags = proto.hasFlags() ? proto.getFlags() : loadOldFlags(proto.getOldFlags());
        DeclarationDescriptor containingDeclaration = this.f12098c.getContainingDeclaration();
        Annotations annotations = getAnnotations(proto, flags, AnnotatedCallableKind.PROPERTY);
        ProtoEnumFlags protoEnumFlags2 = ProtoEnumFlags.INSTANCE;
        Flags.FlagField<ProtoBuf.Modality> flagField3 = Flags.MODALITY;
        Modality modality = protoEnumFlags2.modality(flagField3.get(flags));
        Flags.FlagField<ProtoBuf.Visibility> flagField4 = Flags.VISIBILITY;
        DeserializedPropertyDescriptor deserializedPropertyDescriptor3 = new DeserializedPropertyDescriptor(containingDeclaration, null, annotations, modality, ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags2, flagField4.get(flags)), a.q(Flags.IS_VAR, flags, "IS_VAR.get(flags)"), NameResolverUtilKt.getName(this.f12098c.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.memberKind(protoEnumFlags2, Flags.MEMBER_KIND.get(flags)), a.q(Flags.IS_LATEINIT, flags, "IS_LATEINIT.get(flags)"), a.q(Flags.IS_CONST, flags, "IS_CONST.get(flags)"), a.q(Flags.IS_EXTERNAL_PROPERTY, flags, "IS_EXTERNAL_PROPERTY.get(flags)"), a.q(Flags.IS_DELEGATED, flags, "IS_DELEGATED.get(flags)"), a.q(Flags.IS_EXPECT_PROPERTY, flags, "IS_EXPECT_PROPERTY.get(flags)"), proto, this.f12098c.getNameResolver(), this.f12098c.getTypeTable(), this.f12098c.getVersionRequirementTable(), this.f12098c.getContainerSource());
        DeserializationContext deserializationContext = this.f12098c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "proto.typeParameterList");
        DeserializationContext childContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedPropertyDescriptor3, typeParameterList, null, null, null, null, 60, null);
        boolean q10 = a.q(Flags.HAS_GETTER, flags, "HAS_GETTER.get(flags)");
        if (q10 && ProtoTypeTableUtilKt.hasReceiver(proto)) {
            property = proto;
            empty = getReceiverParameterAnnotations(property, AnnotatedCallableKind.PROPERTY_GETTER);
        } else {
            property = proto;
            empty = Annotations.Companion.getEMPTY();
        }
        KotlinType type = childContext$default.getTypeDeserializer().type(ProtoTypeTableUtilKt.returnType(property, this.f12098c.getTypeTable()));
        List<TypeParameterDescriptor> ownTypeParameters = childContext$default.getTypeDeserializer().getOwnTypeParameters();
        ReceiverParameterDescriptor dispatchReceiverParameter = getDispatchReceiverParameter();
        ProtoBuf.Type receiverType = ProtoTypeTableUtilKt.receiverType(property, this.f12098c.getTypeTable());
        if (receiverType == null) {
            createExtensionReceiverParameterForCallable = null;
            deserializedPropertyDescriptor = deserializedPropertyDescriptor3;
        } else {
            deserializedPropertyDescriptor = deserializedPropertyDescriptor3;
            createExtensionReceiverParameterForCallable = DescriptorFactory.createExtensionReceiverParameterForCallable(deserializedPropertyDescriptor, childContext$default.getTypeDeserializer().type(receiverType), empty);
        }
        deserializedPropertyDescriptor.setType(type, ownTypeParameters, dispatchReceiverParameter, createExtensionReceiverParameterForCallable);
        int accessorFlags = Flags.getAccessorFlags(a.q(Flags.HAS_ANNOTATIONS, flags, "HAS_ANNOTATIONS.get(flags)"), flagField4.get(flags), flagField3.get(flags), false, false, false);
        if (q10) {
            int getterFlags = proto.hasGetterFlags() ? proto.getGetterFlags() : accessorFlags;
            boolean q11 = a.q(Flags.IS_NOT_DEFAULT, getterFlags, "IS_NOT_DEFAULT.get(getterFlags)");
            boolean q12 = a.q(Flags.IS_EXTERNAL_ACCESSOR, getterFlags, "IS_EXTERNAL_ACCESSOR.get(getterFlags)");
            boolean q13 = a.q(Flags.IS_INLINE_ACCESSOR, getterFlags, "IS_INLINE_ACCESSOR.get(getterFlags)");
            Annotations annotations2 = getAnnotations(property, getterFlags, AnnotatedCallableKind.PROPERTY_GETTER);
            if (q11) {
                flagField = flagField4;
                flagField2 = flagField3;
                protoEnumFlags = protoEnumFlags2;
                deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
                propertyGetterDescriptorImpl = new PropertyGetterDescriptorImpl(deserializedPropertyDescriptor, annotations2, protoEnumFlags2.modality(flagField3.get(getterFlags)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags2, flagField4.get(getterFlags)), !q11, q12, q13, deserializedPropertyDescriptor.getKind(), null, SourceElement.NO_SOURCE);
            } else {
                flagField = flagField4;
                flagField2 = flagField3;
                deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
                protoEnumFlags = protoEnumFlags2;
                propertyGetterDescriptorImpl = DescriptorFactory.createDefaultGetter(deserializedPropertyDescriptor2, annotations2);
                Intrinsics.checkNotNullExpressionValue(propertyGetterDescriptorImpl, "{\n                Descri…nnotations)\n            }");
            }
            propertyGetterDescriptorImpl.initialize(deserializedPropertyDescriptor2.getReturnType());
        } else {
            flagField = flagField4;
            flagField2 = flagField3;
            deserializedPropertyDescriptor2 = deserializedPropertyDescriptor;
            protoEnumFlags = protoEnumFlags2;
            propertyGetterDescriptorImpl = null;
        }
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl3 = propertyGetterDescriptorImpl;
        if (a.q(Flags.HAS_SETTER, flags, "HAS_SETTER.get(flags)")) {
            if (proto.hasSetterFlags()) {
                accessorFlags = proto.getSetterFlags();
            }
            int i10 = accessorFlags;
            boolean q14 = a.q(Flags.IS_NOT_DEFAULT, i10, "IS_NOT_DEFAULT.get(setterFlags)");
            boolean q15 = a.q(Flags.IS_EXTERNAL_ACCESSOR, i10, "IS_EXTERNAL_ACCESSOR.get(setterFlags)");
            boolean q16 = a.q(Flags.IS_INLINE_ACCESSOR, i10, "IS_INLINE_ACCESSOR.get(setterFlags)");
            AnnotatedCallableKind annotatedCallableKind = AnnotatedCallableKind.PROPERTY_SETTER;
            Annotations annotations3 = getAnnotations(property, i10, annotatedCallableKind);
            if (q14) {
                ProtoEnumFlags protoEnumFlags3 = protoEnumFlags;
                propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl3;
                PropertySetterDescriptorImpl propertySetterDescriptorImpl2 = new PropertySetterDescriptorImpl(deserializedPropertyDescriptor2, annotations3, protoEnumFlags3.modality(flagField2.get(i10)), ProtoEnumFlagsUtilsKt.descriptorVisibility(protoEnumFlags3, flagField.get(i10)), !q14, q15, q16, deserializedPropertyDescriptor2.getKind(), null, SourceElement.NO_SOURCE);
                z10 = true;
                propertySetterDescriptorImpl2.initialize((ValueParameterDescriptor) CollectionsKt.single((List<? extends Object>) DeserializationContext.childContext$default(childContext$default, propertySetterDescriptorImpl2, CollectionsKt.emptyList(), null, null, null, null, 60, null).getMemberDeserializer().valueParameters(CollectionsKt.listOf(proto.getSetterValueParameter()), property, annotatedCallableKind)));
                propertySetterDescriptorImpl = propertySetterDescriptorImpl2;
            } else {
                propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl3;
                z10 = true;
                propertySetterDescriptorImpl = DescriptorFactory.createDefaultSetter(deserializedPropertyDescriptor2, annotations3, Annotations.Companion.getEMPTY());
                Intrinsics.checkNotNullExpressionValue(propertySetterDescriptorImpl, "{\n                Descri…          )\n            }");
            }
        } else {
            propertyGetterDescriptorImpl2 = propertyGetterDescriptorImpl3;
            z10 = true;
            propertySetterDescriptorImpl = null;
        }
        if (a.q(Flags.HAS_CONSTANT, flags, "HAS_CONSTANT.get(flags)")) {
            memberDeserializer = this;
            deserializedPropertyDescriptor2.setCompileTimeInitializer(memberDeserializer.f12098c.getStorageManager().createNullableLazyValue(new Function0<ConstantValue<?>>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer$loadProperty$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final ConstantValue<?> invoke() {
                    DeserializationContext deserializationContext2;
                    ProtoContainer asProtoContainer;
                    DeserializationContext deserializationContext3;
                    MemberDeserializer memberDeserializer2 = MemberDeserializer.this;
                    deserializationContext2 = memberDeserializer2.f12098c;
                    asProtoContainer = memberDeserializer2.asProtoContainer(deserializationContext2.getContainingDeclaration());
                    Intrinsics.checkNotNull(asProtoContainer);
                    deserializationContext3 = MemberDeserializer.this.f12098c;
                    AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> annotationAndConstantLoader = deserializationContext3.getComponents().getAnnotationAndConstantLoader();
                    ProtoBuf.Property property2 = property;
                    KotlinType returnType = deserializedPropertyDescriptor2.getReturnType();
                    Intrinsics.checkNotNullExpressionValue(returnType, "property.returnType");
                    return annotationAndConstantLoader.loadPropertyConstant(asProtoContainer, property2, returnType);
                }
            }));
        } else {
            memberDeserializer = this;
        }
        deserializedPropertyDescriptor2.initialize(propertyGetterDescriptorImpl2, propertySetterDescriptorImpl, new FieldDescriptorImpl(memberDeserializer.getPropertyFieldAnnotations(property, false), deserializedPropertyDescriptor2), new FieldDescriptorImpl(memberDeserializer.getPropertyFieldAnnotations(property, z10), deserializedPropertyDescriptor2));
        return deserializedPropertyDescriptor2;
    }

    public final TypeAliasDescriptor loadTypeAlias(ProtoBuf.TypeAlias proto) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Annotations.Companion companion = Annotations.Companion;
        List<ProtoBuf.Annotation> annotationList = proto.getAnnotationList();
        Intrinsics.checkNotNullExpressionValue(annotationList, "proto.annotationList");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(annotationList, 10));
        for (ProtoBuf.Annotation it : annotationList) {
            AnnotationDeserializer annotationDeserializer = this.annotationDeserializer;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            arrayList.add(annotationDeserializer.deserializeAnnotation(it, this.f12098c.getNameResolver()));
        }
        DeserializedTypeAliasDescriptor deserializedTypeAliasDescriptor = new DeserializedTypeAliasDescriptor(this.f12098c.getStorageManager(), this.f12098c.getContainingDeclaration(), companion.create(arrayList), NameResolverUtilKt.getName(this.f12098c.getNameResolver(), proto.getName()), ProtoEnumFlagsUtilsKt.descriptorVisibility(ProtoEnumFlags.INSTANCE, Flags.VISIBILITY.get(proto.getFlags())), proto, this.f12098c.getNameResolver(), this.f12098c.getTypeTable(), this.f12098c.getVersionRequirementTable(), this.f12098c.getContainerSource());
        DeserializationContext deserializationContext = this.f12098c;
        List<ProtoBuf.TypeParameter> typeParameterList = proto.getTypeParameterList();
        Intrinsics.checkNotNullExpressionValue(typeParameterList, "proto.typeParameterList");
        DeserializationContext childContext$default = DeserializationContext.childContext$default(deserializationContext, deserializedTypeAliasDescriptor, typeParameterList, null, null, null, null, 60, null);
        deserializedTypeAliasDescriptor.initialize(childContext$default.getTypeDeserializer().getOwnTypeParameters(), childContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.underlyingType(proto, this.f12098c.getTypeTable()), false), childContext$default.getTypeDeserializer().simpleType(ProtoTypeTableUtilKt.expandedType(proto, this.f12098c.getTypeTable()), false));
        return deserializedTypeAliasDescriptor;
    }
}
