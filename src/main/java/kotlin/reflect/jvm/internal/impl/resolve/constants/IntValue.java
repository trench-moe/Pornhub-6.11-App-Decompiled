package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* loaded from: classes3.dex */
public final class IntValue extends IntegerValueConstant<Integer> {
    public IntValue(int i10) {
        super(Integer.valueOf(i10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    public SimpleType getType(ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        SimpleType intType = module.getBuiltIns().getIntType();
        Intrinsics.checkNotNullExpressionValue(intType, "module.builtIns.intType");
        return intType;
    }
}
