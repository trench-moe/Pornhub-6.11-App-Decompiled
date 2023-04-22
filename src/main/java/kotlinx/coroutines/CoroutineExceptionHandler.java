package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lkotlin/coroutines/CoroutineContext$Element;", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public interface CoroutineExceptionHandler extends CoroutineContext.Element {

    /* loaded from: classes3.dex */
    public static final class a implements CoroutineContext.Key<CoroutineExceptionHandler> {

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ a f12105c = new a();
    }

    void handleException(CoroutineContext coroutineContext, Throwable th);
}
