package androidx.lifecycle;

import androidx.lifecycle.x;
import androidx.lifecycle.z;
import kotlin.Lazy;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public final class y<VM extends x> implements Lazy<VM> {

    /* renamed from: c  reason: collision with root package name */
    public final KClass<VM> f2413c;

    /* renamed from: f  reason: collision with root package name */
    public final Function0<a0> f2414f;

    /* renamed from: j  reason: collision with root package name */
    public final Function0<z.b> f2415j;

    /* renamed from: m  reason: collision with root package name */
    public VM f2416m;

    /* JADX WARN: Multi-variable type inference failed */
    public y(KClass<VM> viewModelClass, Function0<? extends a0> storeProducer, Function0<? extends z.b> factoryProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        this.f2413c = viewModelClass;
        this.f2414f = storeProducer;
        this.f2415j = factoryProducer;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        VM vm = this.f2416m;
        if (vm == null) {
            vm = (VM) new z(this.f2414f.invoke(), this.f2415j.invoke()).a(JvmClassMappingKt.getJavaClass((KClass) this.f2413c));
            this.f2416m = vm;
        }
        return vm;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.f2416m != null;
    }
}
