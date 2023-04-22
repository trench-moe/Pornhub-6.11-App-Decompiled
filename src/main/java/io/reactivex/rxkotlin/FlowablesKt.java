package io.reactivex.rxkotlin;

import com.appsflyer.oaid.BuildConfig;
import df.b;
import io.reactivex.Flowable;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
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

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aa\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u001a\b\u0004\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007H\u0087\b\u001aF\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0007\u001a\u007f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00030\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u000b*\u00020\u0000\"\b\b\u0002\u0010\f*\u00020\u0000\"\b\b\u0003\u0010\u0003*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u00052 \b\u0004\u0010\b\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000fH\u0087\b\u001ad\u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00100\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u000b*\u00020\u0000\"\b\b\u0002\u0010\f*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\u0007\u001a\u009d\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00040\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u000b*\u00020\u0000\"\b\b\u0002\u0010\f*\u00020\u0000\"\b\b\u0003\u0010\u0011*\u00020\u0000\"\b\b\u0004\u0010\u0003*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00030\u00052&\b\u0004\u0010\b\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0013H\u0087\b\u001a»\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00050\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u000b*\u00020\u0000\"\b\b\u0002\u0010\f*\u00020\u0000\"\b\b\u0003\u0010\u0011*\u00020\u0000\"\b\b\u0004\u0010\u0014*\u00020\u0000\"\b\b\u0005\u0010\u0003*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00030\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00040\u00052,\b\u0004\u0010\b\u001a&\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0016H\u0087\b\u001aa\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u001a\b\u0004\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007H\u0087\b\u001aF\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0007¨\u0006\u0019"}, d2 = {BuildConfig.FLAVOR, "T", "U", "R", "Lio/reactivex/Flowable;", "Ldf/b;", "other", "Lkotlin/Function2;", "combiner", "withLatestFrom", "Lkotlin/Pair;", "T1", "T2", "o1", "o2", "Lkotlin/Function3;", "Lkotlin/Triple;", "T3", "o3", "Lkotlin/Function4;", "T4", "o4", "Lkotlin/Function5;", "zipper", "zipWith", "rxkotlin"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class FlowablesKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, U> Flowable<Pair<T, U>> withLatestFrom(Flowable<T> flowable, b<U> bVar) {
        Flowable<Pair<T, U>> flowable2 = (Flowable<Pair<T, U>>) flowable.withLatestFrom(bVar, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.FlowablesKt$withLatestFrom$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((FlowablesKt$withLatestFrom$2<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T, U> apply(T t2, U u2) {
                return new Pair<>(t2, u2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "withLatestFrom(other, Bi…n { t, u -> Pair(t, u) })");
        return flowable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, T1, T2> Flowable<Triple<T, T1, T2>> withLatestFrom(Flowable<T> flowable, b<T1> bVar, b<T2> bVar2) {
        Flowable<Triple<T, T1, T2>> flowable2 = (Flowable<Triple<T, T1, T2>>) flowable.withLatestFrom(bVar, bVar2, new Function3<T, T1, T2, Triple<? extends T, ? extends T1, ? extends T2>>() { // from class: io.reactivex.rxkotlin.FlowablesKt$withLatestFrom$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function3
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2, Object obj3) {
                return apply((FlowablesKt$withLatestFrom$4<T1, T2, T3, R, T>) obj, obj2, obj3);
            }

            @Override // io.reactivex.functions.Function3
            public final Triple<T, T1, T2> apply(T t2, T1 t12, T2 t22) {
                return new Triple<>(t2, t12, t22);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "withLatestFrom(o1, o2, F…2 -> Triple(t, t1, t2) })");
        return flowable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, T1, T2, T3, T4, R> Flowable<R> withLatestFrom(Flowable<T> flowable, b<T1> bVar, b<T2> bVar2, b<T3> bVar3, b<T4> bVar4, final Function5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function5) {
        Flowable<R> withLatestFrom = flowable.withLatestFrom(bVar, bVar2, bVar3, bVar4, new io.reactivex.functions.Function5<T, T1, T2, T3, T4, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt$withLatestFrom$6
            @Override // io.reactivex.functions.Function5
            public final R apply(T t2, T1 t12, T2 t22, T3 t32, T4 t42) {
                return (R) Function5.this.invoke(t2, t12, t22, t32, t42);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, o…oke(t, t1, t2, t3, t4) })");
        return withLatestFrom;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, T1, T2, T3, R> Flowable<R> withLatestFrom(Flowable<T> flowable, b<T1> bVar, b<T2> bVar2, b<T3> bVar3, final Function4<? super T, ? super T1, ? super T2, ? super T3, ? extends R> function4) {
        Flowable<R> withLatestFrom = flowable.withLatestFrom(bVar, bVar2, bVar3, new io.reactivex.functions.Function4<T, T1, T2, T3, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt$withLatestFrom$5
            @Override // io.reactivex.functions.Function4
            public final R apply(T t2, T1 t12, T2 t22, T3 t32) {
                return (R) Function4.this.invoke(t2, t12, t22, t32);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, o….invoke(t, t1, t2, t3) })");
        return withLatestFrom;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, T1, T2, R> Flowable<R> withLatestFrom(Flowable<T> flowable, b<T1> bVar, b<T2> bVar2, final kotlin.jvm.functions.Function3<? super T, ? super T1, ? super T2, ? extends R> function3) {
        Flowable<R> withLatestFrom = flowable.withLatestFrom(bVar, bVar2, new Function3<T, T1, T2, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt$withLatestFrom$3
            @Override // io.reactivex.functions.Function3
            public final R apply(T t2, T1 t12, T2 t22) {
                return (R) kotlin.jvm.functions.Function3.this.invoke(t2, t12, t22);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(withLatestFrom, "withLatestFrom(o1, o2, F…iner.invoke(t, t1, t2) })");
        return withLatestFrom;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, U, R> Flowable<R> withLatestFrom(Flowable<T> flowable, b<U> bVar, final Function2<? super T, ? super U, ? extends R> function2) {
        Flowable<R> withLatestFrom = flowable.withLatestFrom(bVar, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt$withLatestFrom$1
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
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, U> Flowable<Pair<T, U>> zipWith(Flowable<T> flowable, b<U> bVar) {
        Flowable<Pair<T, U>> flowable2 = (Flowable<Pair<T, U>>) flowable.zipWith(bVar, new BiFunction<T, U, Pair<? extends T, ? extends U>>() { // from class: io.reactivex.rxkotlin.FlowablesKt$zipWith$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
                return apply((FlowablesKt$zipWith$2<T1, T2, R, T, U>) obj, obj2);
            }

            @Override // io.reactivex.functions.BiFunction
            public final Pair<T, U> apply(T t2, U u2) {
                return new Pair<>(t2, u2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "zipWith(other, BiFunction { t, u -> Pair(t, u) })");
        return flowable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final <T, U, R> Flowable<R> zipWith(Flowable<T> flowable, b<U> bVar, final Function2<? super T, ? super U, ? extends R> function2) {
        Flowable<R> zipWith = flowable.zipWith(bVar, new BiFunction<T, U, R>() { // from class: io.reactivex.rxkotlin.FlowablesKt$zipWith$1
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T t2, U u2) {
                return (R) Function2.this.invoke(t2, u2);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zipWith, "zipWith(other, BiFunctio…-> zipper.invoke(t, u) })");
        return zipWith;
    }
}
