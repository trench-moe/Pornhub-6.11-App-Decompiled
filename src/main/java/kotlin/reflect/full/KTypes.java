package kotlin.reflect.full;

import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0007¨\u0006\u0007"}, d2 = {"isSubtypeOf", BuildConfig.FLAVOR, "Lkotlin/reflect/KType;", "other", "isSupertypeOf", "withNullability", "nullable", "kotlin-reflection"}, k = 2, mv = {1, 6, 0}, xi = 48)
@JvmName(name = "KTypes")
/* loaded from: classes3.dex */
public final class KTypes {
    @SinceKotlin(version = "1.1")
    public static final boolean isSubtypeOf(KType kType, KType other) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return TypeUtilsKt.isSubtypeOf(((KTypeImpl) kType).getType(), ((KTypeImpl) other).getType());
    }

    @SinceKotlin(version = "1.1")
    public static final boolean isSupertypeOf(KType kType, KType other) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return isSubtypeOf(other, kType);
    }

    @SinceKotlin(version = "1.1")
    public static final KType withNullability(KType kType, boolean z10) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        return ((KTypeImpl) kType).makeNullableAsSpecified$kotlin_reflection(z10);
    }
}
