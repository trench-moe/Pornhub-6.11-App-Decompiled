package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import le.o0;
import ne.q;
import vb.y;

/* loaded from: classes3.dex */
public final class ThreadContextKt {
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public static final y f12118a = new y("NO_THREAD_ELEMENTS");

    /* renamed from: b  reason: collision with root package name */
    public static final Function2<Object, CoroutineContext.Element, Object> f12119b = new Function2<Object, CoroutineContext.Element, Object>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$countAll$1
        @Override // kotlin.jvm.functions.Function2
        public Object invoke(Object obj, CoroutineContext.Element element) {
            CoroutineContext.Element element2 = element;
            if (element2 instanceof o0) {
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int intValue = num == null ? 1 : num.intValue();
                return intValue == 0 ? element2 : Integer.valueOf(intValue + 1);
            }
            return obj;
        }
    };

    /* renamed from: c  reason: collision with root package name */
    public static final Function2<o0<?>, CoroutineContext.Element, o0<?>> f12120c = new Function2<o0<?>, CoroutineContext.Element, o0<?>>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$findOne$1
        @Override // kotlin.jvm.functions.Function2
        public o0<?> invoke(o0<?> o0Var, CoroutineContext.Element element) {
            o0<?> o0Var2 = o0Var;
            CoroutineContext.Element element2 = element;
            if (o0Var2 != null) {
                return o0Var2;
            }
            if (element2 instanceof o0) {
                return (o0) element2;
            }
            return null;
        }
    };
    public static final Function2<q, CoroutineContext.Element, q> d = new Function2<q, CoroutineContext.Element, q>() { // from class: kotlinx.coroutines.internal.ThreadContextKt$updateState$1
        @Override // kotlin.jvm.functions.Function2
        public q invoke(q qVar, CoroutineContext.Element element) {
            q qVar2 = qVar;
            CoroutineContext.Element element2 = element;
            if (element2 instanceof o0) {
                o0<Object> o0Var = (o0) element2;
                Object k10 = o0Var.k(qVar2.f13462a);
                Object[] objArr = qVar2.f13463b;
                int i10 = qVar2.d;
                objArr[i10] = k10;
                o0<Object>[] o0VarArr = qVar2.f13464c;
                qVar2.d = i10 + 1;
                o0VarArr[i10] = o0Var;
            }
            return qVar2;
        }
    };

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f12118a) {
            return;
        }
        if (!(obj instanceof q)) {
            Object fold = coroutineContext.fold(null, f12120c);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((o0) fold).h(coroutineContext, obj);
            return;
        }
        q qVar = (q) obj;
        int length = qVar.f13464c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i10 = length - 1;
            o0<Object> o0Var = qVar.f13464c[length];
            Intrinsics.checkNotNull(o0Var);
            o0Var.h(coroutineContext, qVar.f13463b[length]);
            if (i10 < 0) {
                return;
            }
            length = i10;
        }
    }

    public static final Object b(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = coroutineContext.fold(0, f12119b);
            Intrinsics.checkNotNull(obj);
        }
        return obj == 0 ? f12118a : obj instanceof Integer ? coroutineContext.fold(new q(coroutineContext, ((Number) obj).intValue()), d) : ((o0) obj).k(coroutineContext);
    }
}
