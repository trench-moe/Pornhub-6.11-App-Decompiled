package b0;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f3440a = new Object();

    public static Bundle[] a(q[] qVarArr) {
        if (qVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[qVarArr.length];
        for (int i10 = 0; i10 < qVarArr.length; i10++) {
            q qVar = qVarArr[i10];
            Bundle bundle = new Bundle();
            Objects.requireNonNull(qVar);
            bundle.putString("resultKey", null);
            bundle.putCharSequence("label", null);
            bundle.putCharSequenceArray("choices", null);
            bundle.putBoolean("allowFreeFormInput", false);
            bundle.putBundle("extras", null);
            bundleArr[i10] = bundle;
        }
        return bundleArr;
    }
}
