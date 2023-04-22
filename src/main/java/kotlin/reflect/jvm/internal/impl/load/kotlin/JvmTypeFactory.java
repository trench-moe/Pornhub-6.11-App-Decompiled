package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* loaded from: classes3.dex */
public interface JvmTypeFactory<T> {
    T boxType(T t2);

    T createFromString(String str);

    T createObjectType(String str);

    T createPrimitiveType(PrimitiveType primitiveType);

    T getJavaLangClassType();

    String toString(T t2);
}
