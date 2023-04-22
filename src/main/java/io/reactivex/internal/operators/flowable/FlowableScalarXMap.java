package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.ScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class FlowableScalarXMap {

    /* loaded from: classes2.dex */
    public static final class ScalarXMapFlowable<T, R> extends Flowable<R> {
        public final Function<? super T, ? extends b<? extends R>> mapper;
        public final T value;

        public ScalarXMapFlowable(T t2, Function<? super T, ? extends b<? extends R>> function) {
            this.value = t2;
            this.mapper = function;
        }

        @Override // io.reactivex.Flowable
        public void subscribeActual(c<? super R> cVar) {
            try {
                b bVar = (b) ObjectHelper.requireNonNull(this.mapper.apply((T) this.value), "The mapper returned a null Publisher");
                if (!(bVar instanceof Callable)) {
                    bVar.subscribe(cVar);
                    return;
                }
                try {
                    Object call = ((Callable) bVar).call();
                    if (call == null) {
                        EmptySubscription.complete(cVar);
                    } else {
                        cVar.onSubscribe(new ScalarSubscription(cVar, call));
                    }
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    EmptySubscription.error(th, cVar);
                }
            } catch (Throwable th2) {
                EmptySubscription.error(th2, cVar);
            }
        }
    }

    private FlowableScalarXMap() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Flowable<U> scalarXMap(T t2, Function<? super T, ? extends b<? extends U>> function) {
        return RxJavaPlugins.onAssembly(new ScalarXMapFlowable(t2, function));
    }

    public static <T, R> boolean tryScalarXMapSubscribe(b<T> bVar, c<? super R> cVar, Function<? super T, ? extends b<? extends R>> function) {
        if (bVar instanceof Callable) {
            try {
                Object obj = (Object) ((Callable) bVar).call();
                if (obj == 0) {
                    EmptySubscription.complete(cVar);
                    return true;
                }
                try {
                    b bVar2 = (b) ObjectHelper.requireNonNull(function.apply(obj), "The mapper returned a null Publisher");
                    if (bVar2 instanceof Callable) {
                        try {
                            Object call = ((Callable) bVar2).call();
                            if (call == null) {
                                EmptySubscription.complete(cVar);
                                return true;
                            }
                            cVar.onSubscribe(new ScalarSubscription(cVar, call));
                        } catch (Throwable th) {
                            Exceptions.throwIfFatal(th);
                            EmptySubscription.error(th, cVar);
                            return true;
                        }
                    } else {
                        bVar2.subscribe(cVar);
                    }
                    return true;
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    EmptySubscription.error(th2, cVar);
                    return true;
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                EmptySubscription.error(th3, cVar);
                return true;
            }
        }
        return false;
    }
}
