package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes3.dex */
public final class ProtoTypeTableUtilKt {
    public static final ProtoBuf.Type abbreviatedType(ProtoBuf.Type type, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (type.hasAbbreviatedType()) {
            return type.getAbbreviatedType();
        }
        if (type.hasAbbreviatedTypeId()) {
            return typeTable.get(type.getAbbreviatedTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type expandedType(ProtoBuf.TypeAlias typeAlias, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(typeAlias, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (typeAlias.hasExpandedType()) {
            ProtoBuf.Type expandedType = typeAlias.getExpandedType();
            Intrinsics.checkNotNullExpressionValue(expandedType, "expandedType");
            return expandedType;
        } else if (typeAlias.hasExpandedTypeId()) {
            return typeTable.get(typeAlias.getExpandedTypeId());
        } else {
            throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias".toString());
        }
    }

    public static final ProtoBuf.Type flexibleUpperBound(ProtoBuf.Type type, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (type.hasFlexibleUpperBound()) {
            return type.getFlexibleUpperBound();
        }
        if (type.hasFlexibleUpperBoundId()) {
            return typeTable.get(type.getFlexibleUpperBoundId());
        }
        return null;
    }

    public static final boolean hasReceiver(ProtoBuf.Function function) {
        Intrinsics.checkNotNullParameter(function, "<this>");
        return function.hasReceiverType() || function.hasReceiverTypeId();
    }

    public static final boolean hasReceiver(ProtoBuf.Property property) {
        Intrinsics.checkNotNullParameter(property, "<this>");
        return property.hasReceiverType() || property.hasReceiverTypeId();
    }

    public static final ProtoBuf.Type inlineClassUnderlyingType(ProtoBuf.Class r1, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(r1, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (r1.hasInlineClassUnderlyingType()) {
            return r1.getInlineClassUnderlyingType();
        }
        if (r1.hasInlineClassUnderlyingTypeId()) {
            return typeTable.get(r1.getInlineClassUnderlyingTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type outerType(ProtoBuf.Type type, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(type, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (type.hasOuterType()) {
            return type.getOuterType();
        }
        if (type.hasOuterTypeId()) {
            return typeTable.get(type.getOuterTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type receiverType(ProtoBuf.Function function, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(function, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (function.hasReceiverType()) {
            return function.getReceiverType();
        }
        if (function.hasReceiverTypeId()) {
            return typeTable.get(function.getReceiverTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type receiverType(ProtoBuf.Property property, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(property, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (property.hasReceiverType()) {
            return property.getReceiverType();
        }
        if (property.hasReceiverTypeId()) {
            return typeTable.get(property.getReceiverTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type returnType(ProtoBuf.Function function, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(function, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (function.hasReturnType()) {
            ProtoBuf.Type returnType = function.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "returnType");
            return returnType;
        } else if (function.hasReturnTypeId()) {
            return typeTable.get(function.getReturnTypeId());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
        }
    }

    public static final ProtoBuf.Type returnType(ProtoBuf.Property property, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(property, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (property.hasReturnType()) {
            ProtoBuf.Type returnType = property.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "returnType");
            return returnType;
        } else if (property.hasReturnTypeId()) {
            return typeTable.get(property.getReturnTypeId());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
        }
    }

    public static final List<ProtoBuf.Type> supertypes(ProtoBuf.Class r32, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(r32, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf.Type> supertypeList = r32.getSupertypeList();
        if (!(!supertypeList.isEmpty())) {
            supertypeList = null;
        }
        if (supertypeList == null) {
            List<Integer> supertypeIdList = r32.getSupertypeIdList();
            Intrinsics.checkNotNullExpressionValue(supertypeIdList, "supertypeIdList");
            supertypeList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(supertypeIdList, 10));
            for (Integer it : supertypeIdList) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                supertypeList.add(typeTable.get(it.intValue()));
            }
        }
        return supertypeList;
    }

    public static final ProtoBuf.Type type(ProtoBuf.Type.Argument argument, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(argument, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (argument.hasType()) {
            return argument.getType();
        }
        if (argument.hasTypeId()) {
            return typeTable.get(argument.getTypeId());
        }
        return null;
    }

    public static final ProtoBuf.Type type(ProtoBuf.ValueParameter valueParameter, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(valueParameter, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (valueParameter.hasType()) {
            ProtoBuf.Type type = valueParameter.getType();
            Intrinsics.checkNotNullExpressionValue(type, "type");
            return type;
        } else if (valueParameter.hasTypeId()) {
            return typeTable.get(valueParameter.getTypeId());
        } else {
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
        }
    }

    public static final ProtoBuf.Type underlyingType(ProtoBuf.TypeAlias typeAlias, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(typeAlias, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (typeAlias.hasUnderlyingType()) {
            ProtoBuf.Type underlyingType = typeAlias.getUnderlyingType();
            Intrinsics.checkNotNullExpressionValue(underlyingType, "underlyingType");
            return underlyingType;
        } else if (typeAlias.hasUnderlyingTypeId()) {
            return typeTable.get(typeAlias.getUnderlyingTypeId());
        } else {
            throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias".toString());
        }
    }

    public static final List<ProtoBuf.Type> upperBounds(ProtoBuf.TypeParameter typeParameter, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(typeParameter, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        List<ProtoBuf.Type> upperBoundList = typeParameter.getUpperBoundList();
        if (!(!upperBoundList.isEmpty())) {
            upperBoundList = null;
        }
        if (upperBoundList == null) {
            List<Integer> upperBoundIdList = typeParameter.getUpperBoundIdList();
            Intrinsics.checkNotNullExpressionValue(upperBoundIdList, "upperBoundIdList");
            upperBoundList = new ArrayList<>(CollectionsKt.collectionSizeOrDefault(upperBoundIdList, 10));
            for (Integer it : upperBoundIdList) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                upperBoundList.add(typeTable.get(it.intValue()));
            }
        }
        return upperBoundList;
    }

    public static final ProtoBuf.Type varargElementType(ProtoBuf.ValueParameter valueParameter, TypeTable typeTable) {
        Intrinsics.checkNotNullParameter(valueParameter, "<this>");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        if (valueParameter.hasVarargElementType()) {
            return valueParameter.getVarargElementType();
        }
        if (valueParameter.hasVarargElementTypeId()) {
            return typeTable.get(valueParameter.getVarargElementTypeId());
        }
        return null;
    }
}
