package io.reactivex.rxkotlin;

import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Flowable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0086\b\u001a(\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\b0\u0007H\u0007\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\u0005H\u0007\u001a(\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00060\n\"\b\b\u0000\u0010\u0006*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00010\nH\u0007¨\u0006\u000b"}, d2 = {"cast", "Lio/reactivex/Single;", "R", BuildConfig.FLAVOR, "concatAll", "Lio/reactivex/Flowable;", "T", BuildConfig.FLAVOR, "Lio/reactivex/SingleSource;", "mergeAllSingles", "Lio/reactivex/Observable;", "rxkotlin"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class SingleKt {
    public static final /* synthetic */ <R> Single<R> cast(Single<?> single) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Single<R> single2 = (Single<R>) single.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(single2, "cast(R::class.java)");
        return single2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(Iterable<? extends SingleSource<T>> iterable) {
        Flowable<T> concat = Single.concat(iterable);
        Intrinsics.checkExpressionValueIsNotNull(concat, "Single.concat(this)");
        return concat;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeAllSingles(Flowable<Single<T>> flowable) {
        Flowable<T> flowable2 = (Flowable<T>) flowable.flatMapSingle(new Function<T, SingleSource<? extends R>>() { // from class: io.reactivex.rxkotlin.SingleKt$mergeAllSingles$2
            public final Single<T> apply(Single<T> single) {
                return single;
            }

            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((Single) ((Single) obj));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "flatMapSingle { it }");
        return flowable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T> Observable<T> mergeAllSingles(Observable<Single<T>> observable) {
        Observable<T> observable2 = (Observable<T>) observable.flatMapSingle(new Function<T, SingleSource<? extends R>>() { // from class: io.reactivex.rxkotlin.SingleKt$mergeAllSingles$1
            public final Single<T> apply(Single<T> single) {
                return single;
            }

            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((Single) ((Single) obj));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable2, "flatMapSingle { it }");
        return observable2;
    }
}
