package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.e;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.TypeCastException;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public final class f<Args extends e> implements Lazy<Args> {

    /* renamed from: c  reason: collision with root package name */
    public Args f2646c;

    /* renamed from: f  reason: collision with root package name */
    public final KClass<Args> f2647f;

    /* renamed from: j  reason: collision with root package name */
    public final Function0<Bundle> f2648j;

    public f(KClass<Args> kClass, Function0<Bundle> function0) {
        this.f2647f = kClass;
        this.f2648j = function0;
    }

    @Override // kotlin.Lazy
    /* renamed from: a */
    public Args getValue() {
        Args args = this.f2646c;
        if (args == null) {
            Bundle invoke = this.f2648j.invoke();
            Class<Bundle>[] clsArr = g.f2661a;
            p.a<KClass<? extends e>, Method> aVar = g.f2662b;
            Method method = aVar.get(this.f2647f);
            if (method == null) {
                Class javaClass = JvmClassMappingKt.getJavaClass((KClass) this.f2647f);
                Class<Bundle>[] clsArr2 = g.f2661a;
                method = javaClass.getMethod("fromBundle", (Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                aVar.put(this.f2647f, method);
                Intrinsics.checkExpressionValueIsNotNull(method, "navArgsClass.java.getMet…hod\n                    }");
            }
            Object invoke2 = method.invoke(null, invoke);
            if (invoke2 != null) {
                Args args2 = (Args) invoke2;
                this.f2646c = args2;
                return args2;
            }
            throw new TypeCastException("null cannot be cast to non-null type Args");
        }
        return args;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.f2646c != null;
    }
}
