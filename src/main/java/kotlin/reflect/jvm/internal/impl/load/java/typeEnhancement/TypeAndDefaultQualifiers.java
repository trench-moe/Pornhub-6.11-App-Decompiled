package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import a1.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class TypeAndDefaultQualifiers {
    private final JavaDefaultQualifiers defaultQualifiers;
    private final boolean isFromStarProjection;
    private final KotlinType type;
    private final TypeParameterDescriptor typeParameterForArgument;

    public TypeAndDefaultQualifiers(KotlinType type, JavaDefaultQualifiers javaDefaultQualifiers, TypeParameterDescriptor typeParameterDescriptor, boolean z10) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.defaultQualifiers = javaDefaultQualifiers;
        this.typeParameterForArgument = typeParameterDescriptor;
        this.isFromStarProjection = z10;
    }

    public final KotlinType component1() {
        return this.type;
    }

    public final JavaDefaultQualifiers component2() {
        return this.defaultQualifiers;
    }

    public final TypeParameterDescriptor component3() {
        return this.typeParameterForArgument;
    }

    public final boolean component4() {
        return this.isFromStarProjection;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TypeAndDefaultQualifiers) {
            TypeAndDefaultQualifiers typeAndDefaultQualifiers = (TypeAndDefaultQualifiers) obj;
            return Intrinsics.areEqual(this.type, typeAndDefaultQualifiers.type) && Intrinsics.areEqual(this.defaultQualifiers, typeAndDefaultQualifiers.defaultQualifiers) && Intrinsics.areEqual(this.typeParameterForArgument, typeAndDefaultQualifiers.typeParameterForArgument) && this.isFromStarProjection == typeAndDefaultQualifiers.isFromStarProjection;
        }
        return false;
    }

    public final KotlinType getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        JavaDefaultQualifiers javaDefaultQualifiers = this.defaultQualifiers;
        int hashCode2 = (hashCode + (javaDefaultQualifiers == null ? 0 : javaDefaultQualifiers.hashCode())) * 31;
        TypeParameterDescriptor typeParameterDescriptor = this.typeParameterForArgument;
        int hashCode3 = (hashCode2 + (typeParameterDescriptor != null ? typeParameterDescriptor.hashCode() : 0)) * 31;
        boolean z10 = this.isFromStarProjection;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode3 + i10;
    }

    public String toString() {
        StringBuilder m10 = a.m("TypeAndDefaultQualifiers(type=");
        m10.append(this.type);
        m10.append(", defaultQualifiers=");
        m10.append(this.defaultQualifiers);
        m10.append(", typeParameterForArgument=");
        m10.append(this.typeParameterForArgument);
        m10.append(", isFromStarProjection=");
        return a0.a.l(m10, this.isFromStarProjection, ')');
    }
}
