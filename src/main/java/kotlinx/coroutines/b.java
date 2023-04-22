package kotlinx.coroutines;

import kotlin.ExperimentalStdlibApi;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class b extends AbstractCoroutineContextElement implements ContinuationInterceptor {

    /* renamed from: c  reason: collision with root package name */
    public static final a f12109c = new a(null);

    @ExperimentalStdlibApi
    /* loaded from: classes3.dex */
    public static final class a extends AbstractCoroutineContextKey<ContinuationInterceptor, b> {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
            super(ContinuationInterceptor.Key, new Function1<CoroutineContext.Element, b>() { // from class: kotlinx.coroutines.CoroutineDispatcher$Key$1
                @Override // kotlin.jvm.functions.Function1
                public b invoke(CoroutineContext.Element element) {
                    CoroutineContext.Element element2 = element;
                    if (element2 instanceof b) {
                        return (b) element2;
                    }
                    return null;
                }
            });
        }
    }

    public b() {
        super(ContinuationInterceptor.Key);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.Key<E> key) {
        return (E) ContinuationInterceptor.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final <T> Continuation<T> interceptContinuation(Continuation<? super T> continuation) {
        return new ne.d(this, continuation);
    }

    public abstract void m(CoroutineContext coroutineContext, Runnable runnable);

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key<?> key) {
        return ContinuationInterceptor.DefaultImpls.minusKey(this, key);
    }

    public boolean n(CoroutineContext coroutineContext) {
        return !(this instanceof f);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public void releaseInterceptedContinuation(Continuation<?> continuation) {
        ((ne.d) continuation).i();
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + a0.b.B(this);
    }
}
