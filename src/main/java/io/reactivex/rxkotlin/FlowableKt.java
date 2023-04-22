package io.reactivex.rxkotlin;

import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import df.b;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(bv = {}, d1 = {"\u0000 \u0001\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0001*\u00020\u0004H\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001*\u00020\u0006H\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\u0001*\u00020\bH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\nH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\u0001*\u00020\fH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0001*\u00020\u000eH\u0007\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001*\u00020\u0010H\u0007\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0007¢\u0006\u0004\b\u0003\u0010\u0015\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001*\u00020\u0016H\u0007\u001a \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0017\u001a\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0007\u001a \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0019\u001a*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\u0018H\u0007\u001a*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00010\u0018H\u0007\u001aI\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001c*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\b\u0004\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00190\u001dH\u0087\b\u001a^\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001c*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u00182)\b\u0004\u0010$\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00028\u00010\u001dH\u0087\b\u001a^\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001c*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u00182)\b\u0004\u0010&\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000 ¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00028\u00010\u001dH\u0087\b\u001a#\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010\u001c\u0018\u0001*\u00020\u0012*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001a#\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\n\b\u0000\u0010\u001c\u0018\u0001*\u00020\u0012*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001a\"\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\b\b\u0000\u0010\u0013*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0002\u001aF\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,0\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001c*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0007\u001ad\u0010%\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012\"\b\b\u0001\u0010\u001c*\u00020\u0012\"\b\b\u0002\u0010-*\u00020\u0012*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010\u00012\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001H\u0007\u001a(\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001a(\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001a(\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001a(\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0001H\u0007\u001aD\u00109\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010807\"\b\b\u0000\u00105*\u00020\u0012\"\b\b\u0001\u00106*\u00020\u0012*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,0\u0001H\u0007\u001aJ\u0010;\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010:0807\"\b\b\u0000\u00105*\u00020\u0012\"\b\b\u0001\u00106*\u00020\u0012*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010,0\u0001H\u0007\u001a(\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0013*\u00020\u0012*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<0\u0018H\u0007¨\u0006="}, d2 = {BuildConfig.FLAVOR, "Lio/reactivex/Flowable;", BuildConfig.FLAVOR, "toFlowable", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "T", BuildConfig.FLAVOR, "([Ljava/lang/Object;)Lio/reactivex/Flowable;", "Lkotlin/ranges/IntProgression;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lkotlin/sequences/Sequence;", "merge", "mergeDelayError", "R", "Lkotlin/Function1;", "body", "flatMapSequence", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "args", "combineFunction", "combineLatest", "zipFunction", "zip", "cast", "ofType", "toIterable", "flowable", "Lkotlin/Pair;", "U", "flowable1", "flowable2", "Lkotlin/Triple;", "mergeAll", "concatAll", "switchLatest", "switchOnNext", "A", "B", "Lio/reactivex/Single;", BuildConfig.FLAVOR, "toMap", BuildConfig.FLAVOR, "toMultimap", "Ldf/b;", "rxkotlin"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class FlowableKt {
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final /* synthetic */ <R> Flowable<R> cast(Flowable<?> flowable) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Flowable<R> flowable2 = (Flowable<R>) flowable.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "cast(R::class.java)");
        return flowable2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.reactivex.rxkotlin.FlowableKt$sam$io_reactivex_functions_BiFunction$0] */
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<Pair<T, R>> combineLatest(Flowable<T> flowable, Flowable<R> flowable2) {
        final FlowableKt$combineLatest$2 flowableKt$combineLatest$2 = FlowableKt$combineLatest$2.INSTANCE;
        if (flowableKt$combineLatest$2 != null) {
            flowableKt$combineLatest$2 = new BiFunction() { // from class: io.reactivex.rxkotlin.FlowableKt$sam$io_reactivex_functions_BiFunction$0
                @Override // io.reactivex.functions.BiFunction
                @NonNull
                public final /* synthetic */ Object apply(@NonNull Object obj, @NonNull Object obj2) {
                    return Function2.this.invoke(obj, obj2);
                }
            };
        }
        Flowable<Pair<T, R>> combineLatest = Flowable.combineLatest(flowable, flowable2, (BiFunction) flowableKt$combineLatest$2);
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Flowable.combineLatest(t…able, BiFunction(::Pair))");
        return combineLatest;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [io.reactivex.rxkotlin.FlowableKt$sam$io_reactivex_functions_Function3$0] */
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R, U> Flowable<Triple<T, R, U>> combineLatest(Flowable<T> flowable, Flowable<R> flowable2, Flowable<U> flowable3) {
        final FlowableKt$combineLatest$3 flowableKt$combineLatest$3 = FlowableKt$combineLatest$3.INSTANCE;
        if (flowableKt$combineLatest$3 != null) {
            flowableKt$combineLatest$3 = new Function3() { // from class: io.reactivex.rxkotlin.FlowableKt$sam$io_reactivex_functions_Function3$0
                @Override // io.reactivex.functions.Function3
                @NonNull
                public final /* synthetic */ Object apply(@NonNull Object obj, @NonNull Object obj2, @NonNull Object obj3) {
                    return kotlin.jvm.functions.Function3.this.invoke(obj, obj2, obj3);
                }
            };
        }
        Flowable<Triple<T, R, U>> combineLatest = Flowable.combineLatest(flowable, flowable2, flowable3, (Function3) flowableKt$combineLatest$3);
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Flowable.combineLatest(t…le2, Function3(::Triple))");
        return combineLatest;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<R> combineLatest(Iterable<? extends Flowable<T>> iterable, final Function1<? super List<? extends T>, ? extends R> function1) {
        Flowable<R> combineLatest = Flowable.combineLatest(iterable, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.FlowableKt$combineLatest$1
            @Override // io.reactivex.functions.Function
            public final R apply(Object[] objArr) {
                Function1 function12 = Function1.this;
                List asList = ArraysKt.asList(objArr);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asList, 10));
                for (T t2 : asList) {
                    if (t2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t2);
                }
                return (R) function12.invoke(arrayList);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Flowable.combineLatest(t…List().map { it as T }) }");
        return combineLatest;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(Flowable<Flowable<T>> flowable) {
        Flowable<T> flowable2 = (Flowable<T>) flowable.concatMap(new Function<T, b<? extends R>>() { // from class: io.reactivex.rxkotlin.FlowableKt$concatAll$1
            public final Flowable<T> apply(Flowable<T> flowable3) {
                return flowable3;
            }

            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((Flowable) ((Flowable) obj));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "concatMap { it }");
        return flowable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> concatAll(Iterable<? extends b<T>> iterable) {
        Flowable<T> concat = Flowable.concat(iterable);
        Intrinsics.checkExpressionValueIsNotNull(concat, "Flowable.concat(this)");
        return concat;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<R> flatMapSequence(Flowable<T> flowable, final Function1<? super T, ? extends Sequence<? extends R>> function1) {
        Flowable<R> flatMap = flowable.flatMap(new Function<T, b<? extends R>>() { // from class: io.reactivex.rxkotlin.FlowableKt$flatMapSequence$1
            @Override // io.reactivex.functions.Function
            public final Flowable<R> apply(T t2) {
                return FlowableKt.toFlowable((Sequence) Function1.this.invoke(t2));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((FlowableKt$flatMapSequence$1<T, R>) obj);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flatMap, "flatMap { body(it).toFlowable() }");
        return flatMap;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> merge(Iterable<? extends Flowable<? extends T>> iterable) {
        Flowable<T> merge = Flowable.merge(toFlowable(iterable));
        Intrinsics.checkExpressionValueIsNotNull(merge, "Flowable.merge(this.toFlowable())");
        return merge;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeAll(Flowable<Flowable<T>> flowable) {
        Flowable<T> flowable2 = (Flowable<T>) flowable.flatMap(new Function<T, b<? extends R>>() { // from class: io.reactivex.rxkotlin.FlowableKt$mergeAll$1
            public final Flowable<T> apply(Flowable<T> flowable3) {
                return flowable3;
            }

            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((Flowable) ((Flowable) obj));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "flatMap { it }");
        return flowable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> mergeDelayError(Iterable<? extends Flowable<? extends T>> iterable) {
        Flowable<T> mergeDelayError = Flowable.mergeDelayError(toFlowable(iterable));
        Intrinsics.checkExpressionValueIsNotNull(mergeDelayError, "Flowable.mergeDelayError(this.toFlowable())");
        return mergeDelayError;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static final /* synthetic */ <R> Flowable<R> ofType(Flowable<?> flowable) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Flowable<R> flowable2 = (Flowable<R>) flowable.ofType(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "ofType(R::class.java)");
        return flowable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> switchLatest(Flowable<Flowable<T>> flowable) {
        Flowable<T> flowable2 = (Flowable<T>) flowable.switchMap(new Function<T, b<? extends R>>() { // from class: io.reactivex.rxkotlin.FlowableKt$switchLatest$1
            public final Flowable<T> apply(Flowable<T> flowable3) {
                return flowable3;
            }

            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((Flowable) ((Flowable) obj));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flowable2, "switchMap { it }");
        return flowable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> switchOnNext(Flowable<Flowable<T>> flowable) {
        Flowable<T> switchOnNext = Flowable.switchOnNext(flowable);
        Intrinsics.checkExpressionValueIsNotNull(switchOnNext, "Flowable.switchOnNext(this)");
        return switchOnNext;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> toFlowable(Iterable<? extends T> iterable) {
        Flowable<T> fromIterable = Flowable.fromIterable(iterable);
        Intrinsics.checkExpressionValueIsNotNull(fromIterable, "Flowable.fromIterable(this)");
        return fromIterable;
    }

    public static final <T> Flowable<T> toFlowable(Iterator<? extends T> it) {
        return toFlowable(toIterable(it));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final Flowable<Integer> toFlowable(IntProgression intProgression) {
        if (intProgression.getStep() != 1 || intProgression.getLast() - intProgression.getFirst() >= ((long) IntCompanionObject.MAX_VALUE)) {
            Flowable<Integer> fromIterable = Flowable.fromIterable(intProgression);
            Intrinsics.checkExpressionValueIsNotNull(fromIterable, "Flowable.fromIterable(this)");
            return fromIterable;
        }
        Flowable<Integer> range = Flowable.range(intProgression.getFirst(), Math.max(0, (intProgression.getLast() - intProgression.getFirst()) + 1));
        Intrinsics.checkExpressionValueIsNotNull(range, "Flowable.range(first, Ma…max(0, last - first + 1))");
        return range;
    }

    public static final <T> Flowable<T> toFlowable(Sequence<? extends T> sequence) {
        return toFlowable(SequencesKt.asIterable(sequence));
    }

    @CheckReturnValue
    public static final Flowable<Byte> toFlowable(byte[] bArr) {
        return toFlowable(ArraysKt.asIterable(bArr));
    }

    @CheckReturnValue
    public static final Flowable<Character> toFlowable(char[] cArr) {
        return toFlowable(ArraysKt.asIterable(cArr));
    }

    @CheckReturnValue
    public static final Flowable<Double> toFlowable(double[] dArr) {
        return toFlowable(ArraysKt.asIterable(dArr));
    }

    @CheckReturnValue
    public static final Flowable<Float> toFlowable(float[] fArr) {
        return toFlowable(ArraysKt.asIterable(fArr));
    }

    @CheckReturnValue
    public static final Flowable<Integer> toFlowable(int[] iArr) {
        return toFlowable(ArraysKt.asIterable(iArr));
    }

    @CheckReturnValue
    public static final Flowable<Long> toFlowable(long[] jArr) {
        return toFlowable(ArraysKt.asIterable(jArr));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T> Flowable<T> toFlowable(T[] tArr) {
        Flowable<T> fromArray = Flowable.fromArray(Arrays.copyOf(tArr, tArr.length));
        Intrinsics.checkExpressionValueIsNotNull(fromArray, "Flowable.fromArray(*this)");
        return fromArray;
    }

    @CheckReturnValue
    public static final Flowable<Short> toFlowable(short[] sArr) {
        return toFlowable(ArraysKt.asIterable(sArr));
    }

    @CheckReturnValue
    public static final Flowable<Boolean> toFlowable(boolean[] zArr) {
        return toFlowable(ArraysKt.asIterable(zArr));
    }

    private static final <T> Iterable<T> toIterable(Iterator<? extends T> it) {
        return new FlowableKt$toIterable$1(it);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <A, B> Single<Map<A, B>> toMap(Flowable<Pair<A, B>> flowable) {
        Single<Map<A, B>> single = (Single<Map<A, B>>) flowable.toMap(new Function() { // from class: io.reactivex.rxkotlin.FlowableKt$toMap$1
            @Override // io.reactivex.functions.Function
            public final Object apply(Pair<Object, Object> pair) {
                return pair.getFirst();
            }
        }, new Function() { // from class: io.reactivex.rxkotlin.FlowableKt$toMap$2
            @Override // io.reactivex.functions.Function
            public final Object apply(Pair<Object, Object> pair) {
                return pair.getSecond();
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(single, "toMap({ it.first }, { it.second })");
        return single;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public static final <A, B> Single<Map<A, Collection<B>>> toMultimap(Flowable<Pair<A, B>> flowable) {
        Single<Map<A, Collection<B>>> single = (Single<Map<A, Collection<B>>>) flowable.toMultimap(new Function() { // from class: io.reactivex.rxkotlin.FlowableKt$toMultimap$1
            @Override // io.reactivex.functions.Function
            public final Object apply(Pair<Object, Object> pair) {
                return pair.getFirst();
            }
        }, new Function() { // from class: io.reactivex.rxkotlin.FlowableKt$toMultimap$2
            @Override // io.reactivex.functions.Function
            public final Object apply(Pair<Object, Object> pair) {
                return pair.getSecond();
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(single, "toMultimap({ it.first }, { it.second })");
        return single;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static final <T, R> Flowable<R> zip(Iterable<? extends Flowable<T>> iterable, final Function1<? super List<? extends T>, ? extends R> function1) {
        Flowable<R> zip = Flowable.zip(iterable, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.FlowableKt$zip$1
            @Override // io.reactivex.functions.Function
            public final R apply(Object[] objArr) {
                Function1 function12 = Function1.this;
                List asList = ArraysKt.asList(objArr);
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(asList, 10));
                for (T t2 : asList) {
                    if (t2 == null) {
                        throw new TypeCastException("null cannot be cast to non-null type T");
                    }
                    arrayList.add(t2);
                }
                return (R) function12.invoke(arrayList);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(zip, "Flowable.zip(this) { zip…List().map { it as T }) }");
        return zip;
    }
}
