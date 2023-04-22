package io.reactivex.rxkotlin;

import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function3;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ad\u0010\u0000\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u00050\u00020\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\bH\u0007\u001a\u007f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2 \b\u0004\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\n0\fH\u0087\b\u001a\u009d\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\r*\u00020\u0006\"\b\b\u0004\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\b2&\b\u0004\u0010\u000b\u001a \u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\n0\u000fH\u0087\b\u001a»\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0004*\u00020\u0006\"\b\b\u0002\u0010\u0005*\u00020\u0006\"\b\b\u0003\u0010\r*\u00020\u0006\"\b\b\u0004\u0010\u0010*\u00020\u0006\"\b\b\u0005\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\r0\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\b2,\b\u0004\u0010\u000b\u001a&\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\n0\u0012H\u0087\b\u001aF\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00140\u00130\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\bH\u0007\u001aa\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006\"\b\b\u0002\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\b2\u001a\b\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\n0\u0016H\u0087\b\u001aF\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00140\u00130\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\bH\u0007\u001aa\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\n0\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0006\"\b\b\u0001\u0010\u0014*\u00020\u0006\"\b\b\u0002\u0010\n*\u00020\u0006*\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\b2\u001a\b\u0004\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0014\u0012\u0004\u0012\u0002H\n0\u0016H\u0087\b¨\u0006\u0019"}, d2 = {"withLatestFrom", "Lio/reactivex/Observable;", "Lkotlin/Triple;", "T", "T1", "T2", BuildConfig.FLAVOR, "o1", "Lio/reactivex/ObservableSource;", "o2", "R", "combiner", "Lkotlin/Function3;", "T3", "o3", "Lkotlin/Function4;", "T4", "o4", "Lkotlin/Function5;", "Lkotlin/Pair;", "U", "other", "Lkotlin/Function2;", "zipWith", "zipper", "rxkotlin"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class ObservablesKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T, U> Observable<Pair<T, U>> withLatestFrom(Observable<T> observable, ObservableSource<U> observableSource) {
        Observable<Pair<T, U>> observable2 = (Observable<Pair<T, U>>) observable.withLatestFrom(observableSource, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.ObservablesKt$withLatestFrom$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((ObservablesKt$withLatestFrom$2<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T, U> apply(T t2, U u2) {
                return new Pair<>(t2, u2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable2, "withLatestFrom(other, Bi…n { t, u -> Pair(t, u) })");
        return observable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T, T1, T2> Observable<Triple<T, T1, T2>> withLatestFrom(Observable<T> observable, ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2) {
        Observable<Triple<T, T1, T2>> observable2 = (Observable<Triple<T, T1, T2>>) observable.withLatestFrom(observableSource, observableSource2, new Function3<T, T1, T2, Triple<? extends T, ? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.ObservablesKt$withLatestFrom$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
                return apply((ObservablesKt$withLatestFrom$4<T1, T2, T3, R, T>) obj, obj2, obj3);
            }

            @Override // io.reactivex.functions.Function3
            public final Triple<T, T1, T2> apply(T t2, T1 t12, T2 t22) {
                return new Triple<>(t2, t12, t22);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable2, "withLatestFrom(o1, o2, F…2 -> Triple(t, t1, t2) })");
        return observable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T, T1, T2, T3, T4, R> Observable<R> withLatestFrom(Observable<T> observable, ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, ObservableSource<T3> observableSource3, ObservableSource<T4> observableSource4, final Function5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function5) {
        Observable<R> withLatestFrom = observable.withLatestFrom(observableSource, observableSource2, observableSource3, observableSource4, new io.reactivex.functions.Function5<T, T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt$withLatestFrom$6
            @Override // io.reactivex.functions.Function5
            public final R apply(T t2, T1 t12, T2 t22, T3 t32, T4 t42) {
                return (R) Function5.this.invoke(t2, t12, t22, t32, t42);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, o…oke(t, t1, t2, t3, t4) })");
        return withLatestFrom;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T, T1, T2, T3, R> Observable<R> withLatestFrom(Observable<T> observable, ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, ObservableSource<T3> observableSource3, final Function4<? super T, ? super T1, ? super T2, ? super T3, ? extends R> function4) {
        Observable<R> withLatestFrom = observable.withLatestFrom(observableSource, observableSource2, observableSource3, new io.reactivex.functions.Function4<T, T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt$withLatestFrom$5
            @Override // io.reactivex.functions.Function4
            public final R apply(T t2, T1 t12, T2 t22, T3 t32) {
                return (R) Function4.this.invoke(t2, t12, t22, t32);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        return withLatestFrom;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T, T1, T2, R> Observable<R> withLatestFrom(Observable<T> observable, ObservableSource<T1> observableSource, ObservableSource<T2> observableSource2, final kotlin.jvm.functions.Function3<? super T, ? super T1, ? super T2, ? extends R> function3) {
        Observable<R> withLatestFrom = observable.withLatestFrom(observableSource, observableSource2, new Function3<T, T1, T2, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt$withLatestFrom$3
            @Override // io.reactivex.functions.Function3
            public final R apply(T t2, T1 t12, T2 t22) {
                return (R) kotlin.jvm.functions.Function3.this.invoke(t2, t12, t22);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        return withLatestFrom;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T, U, R> Observable<R> withLatestFrom(Observable<T> observable, ObservableSource<U> observableSource, final Function2<? super T, ? super U, ? extends R> function2) {
        Observable<R> withLatestFrom = observable.withLatestFrom(observableSource, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt$withLatestFrom$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T t2, U u2) {
                return (R) Function2.this.invoke(t2, u2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(other, Bi… combiner.invoke(t, u) })");
        return withLatestFrom;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T, U> Observable<Pair<T, U>> zipWith(Observable<T> observable, ObservableSource<U> observableSource) {
        Observable<Pair<T, U>> observable2 = (Observable<Pair<T, U>>) observable.zipWith(observableSource, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.ObservablesKt$zipWith$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((ObservablesKt$zipWith$2<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T, U> apply(T t2, U u2) {
                return new Pair<>(t2, u2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable2, "zipWith(other, BiFunction { t, u -> Pair(t, u) })");
        return observable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T, U, R> Observable<R> zipWith(Observable<T> observable, ObservableSource<U> observableSource, final Function2<? super T, ? super U, ? extends R> function2) {
        Observable<R> zipWith = observable.zipWith(observableSource, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.ObservablesKt$zipWith$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T t2, U u2) {
                return (R) Function2.this.invoke(t2, u2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zipWith, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
        return zipWith;
    }
}
