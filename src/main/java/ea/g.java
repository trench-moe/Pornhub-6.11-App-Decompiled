package ea;

import android.app.Activity;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class g<TResult> {
    public g<TResult> a(Executor executor, b bVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public g<TResult> b(c<TResult> cVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract g<TResult> c(Executor executor, d dVar);

    public abstract g<TResult> d(Activity activity, e<? super TResult> eVar);

    public abstract g<TResult> e(Executor executor, e<? super TResult> eVar);

    public <TContinuationResult> g<TContinuationResult> f(a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> g<TContinuationResult> g(Executor executor, a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> g<TContinuationResult> h(Executor executor, a<TResult, g<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception i();

    public abstract TResult j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();

    public <TContinuationResult> g<TContinuationResult> n(Executor executor, f<TResult, TContinuationResult> fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
