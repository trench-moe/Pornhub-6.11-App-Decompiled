package kotlinx.coroutines;

import java.io.Closeable;
import kotlin.ExperimentalStdlibApi;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public abstract class e extends b implements Closeable {

    @ExperimentalStdlibApi
    /* loaded from: classes3.dex */
    public static final class a extends AbstractCoroutineContextKey<b, e> {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
            super(b.f12109c, new Function1<CoroutineContext.Element, e>() { // from class: kotlinx.coroutines.ExecutorCoroutineDispatcher$Key$1
                @Override // kotlin.jvm.functions.Function1
                public e invoke(CoroutineContext.Element element) {
                    CoroutineContext.Element element2 = element;
                    if (element2 instanceof e) {
                        return (e) element2;
                    }
                    return null;
                }
            });
        }
    }

    static {
        new a(null);
    }
}
