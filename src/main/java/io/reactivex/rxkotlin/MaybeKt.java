package io.reactivex.rxkotlin;

import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001a(\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\b0\u0007H\u0007\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\u0005H\u0007\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\nH\u0007\u001a#\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b¨\u0006\f"}, d2 = {"cast", "Lio/reactivex/Maybe;", "R", BuildConfig.FLAVOR, "concatAll", "Lio/reactivex/Flowable;", "T", BuildConfig.FLAVOR, "Lio/reactivex/MaybeSource;", "mergeAllMaybes", "Lio/reactivex/Observable;", "ofType", "rxkotlin"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class MaybeKt {
    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final /* synthetic */ <R> Maybe<R> cast(Maybe<?> maybe) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Maybe<R> maybe2 = (Maybe<R>) maybe.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(maybe2, "cast(R::class.java)");
        return maybe2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(Iterable<? extends MaybeSource<T>> iterable) {
        Flowable<T> concat = Maybe.concat(iterable);
        Intrinsics.checkExpressionValueIsNotNull(concat, "Maybe.concat(this)");
        return concat;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeAllMaybes(Flowable<Maybe<T>> flowable) {
        Flowable<T> flowable2 = (Flowable<T>) flowable.flatMapMaybe(new Function<T, MaybeSource<? extends R>>() { // from class: io.reactivex.rxkotlin.MaybeKt$mergeAllMaybes$2
            public final Maybe<T> apply(Maybe<T> maybe) {
                return maybe;
            }

            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((Maybe) ((Maybe) obj));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "flatMapMaybe { it }");
        return flowable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T> Observable<T> mergeAllMaybes(Observable<Maybe<T>> observable) {
        Observable<T> observable2 = (Observable<T>) observable.flatMapMaybe(new Function<T, MaybeSource<? extends R>>() { // from class: io.reactivex.rxkotlin.MaybeKt$mergeAllMaybes$1
            public final Maybe<T> apply(Maybe<T> maybe) {
                return maybe;
            }

            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((Maybe) ((Maybe) obj));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable2, "flatMapMaybe { it }");
        return observable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final /* synthetic */ <R> Maybe<R> ofType(Maybe<?> maybe) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Maybe<R> maybe2 = (Maybe<R>) maybe.ofType(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(maybe2, "ofType(R::class.java)");
        return maybe2;
    }
}
