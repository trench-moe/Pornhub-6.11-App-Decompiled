package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes3.dex */
public interface CustomTypeVariable {
    boolean isTypeVariable();

    KotlinType substitutionResult(KotlinType kotlinType);
}
