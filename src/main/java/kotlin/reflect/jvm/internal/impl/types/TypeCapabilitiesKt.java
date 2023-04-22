package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class TypeCapabilitiesKt {
    public static final CustomTypeVariable getCustomTypeVariable(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        UnwrappedType unwrap = kotlinType.unwrap();
        CustomTypeVariable customTypeVariable = unwrap instanceof CustomTypeVariable ? (CustomTypeVariable) unwrap : null;
        if (customTypeVariable != null && customTypeVariable.isTypeVariable()) {
            return customTypeVariable;
        }
        return null;
    }

    public static final boolean isCustomTypeVariable(KotlinType kotlinType) {
        Intrinsics.checkNotNullParameter(kotlinType, "<this>");
        UnwrappedType unwrap = kotlinType.unwrap();
        CustomTypeVariable customTypeVariable = unwrap instanceof CustomTypeVariable ? (CustomTypeVariable) unwrap : null;
        if (customTypeVariable == null) {
            return false;
        }
        return customTypeVariable.isTypeVariable();
    }
}
