package io.reactivex.rxkotlin;

import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u001a\u0010\u0010\u0007\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\t0\b\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\n\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\t0\u000b\u001a\u0012\u0010\u0007\u001a\u00020\u0001*\n\u0012\u0006\b\u0001\u0012\u00020\t0\f¨\u0006\r"}, d2 = {"concatAll", "Lio/reactivex/Completable;", BuildConfig.FLAVOR, "Lio/reactivex/CompletableSource;", "mergeAllCompletables", "Lio/reactivex/Flowable;", "Lio/reactivex/Observable;", "toCompletable", "Lkotlin/Function0;", BuildConfig.FLAVOR, "Lio/reactivex/functions/Action;", "Ljava/util/concurrent/Callable;", "Ljava/util/concurrent/Future;", "rxkotlin"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class CompletableKt {
    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final Completable concatAll(Iterable<? extends CompletableSource> iterable) {
        Completable concat = Completable.concat(iterable);
        Intrinsics.checkExpressionValueIsNotNull(concat, "Completable.concat(this)");
        return concat;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final Completable mergeAllCompletables(Flowable<Completable> flowable) {
        Completable flatMapCompletable = flowable.flatMapCompletable(new Function<Completable, CompletableSource>() { // from class: io.reactivex.rxkotlin.CompletableKt$mergeAllCompletables$2
            @Override // io.reactivex.functions.Function
            public final Completable apply(Completable completable) {
                return completable;
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flatMapCompletable, "flatMapCompletable { it }");
        return flatMapCompletable;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final Completable mergeAllCompletables(Observable<Completable> observable) {
        Completable flatMapCompletable = observable.flatMapCompletable(new Function<Completable, CompletableSource>() { // from class: io.reactivex.rxkotlin.CompletableKt$mergeAllCompletables$1
            @Override // io.reactivex.functions.Function
            public final Completable apply(Completable completable) {
                return completable;
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flatMapCompletable, "flatMapCompletable { it }");
        return flatMapCompletable;
    }

    public static final Completable toCompletable(Action action) {
        Completable fromAction = Completable.fromAction(action);
        Intrinsics.checkExpressionValueIsNotNull(fromAction, "Completable.fromAction(this)");
        return fromAction;
    }

    public static final Completable toCompletable(Callable<? extends Object> callable) {
        Completable fromCallable = Completable.fromCallable(callable);
        Intrinsics.checkExpressionValueIsNotNull(fromCallable, "Completable.fromCallable(this)");
        return fromCallable;
    }

    public static final Completable toCompletable(Future<? extends Object> future) {
        Completable fromFuture = Completable.fromFuture(future);
        Intrinsics.checkExpressionValueIsNotNull(fromFuture, "Completable.fromFuture(this)");
        return fromFuture;
    }

    public static final Completable toCompletable(final Function0<? extends Object> function0) {
        Completable fromCallable = Completable.fromCallable(new Callable() { // from class: io.reactivex.rxkotlin.CompletableKt$sam$java_util_concurrent_Callable$0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return Function0.this.invoke();
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(fromCallable, "Completable.fromCallable(this)");
        return fromCallable;
    }
}
