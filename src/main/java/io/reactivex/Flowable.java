package io.reactivex;

import a1.a;
import df.b;
import df.c;
import df.d;
import io.reactivex.annotations.BackpressureKind;
import io.reactivex.annotations.BackpressureSupport;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.Experimental;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.flowables.GroupedFlowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Function3;
import io.reactivex.functions.Function4;
import io.reactivex.functions.Function5;
import io.reactivex.functions.Function6;
import io.reactivex.functions.Function7;
import io.reactivex.functions.Function8;
import io.reactivex.functions.Function9;
import io.reactivex.functions.LongConsumer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.operators.flowable.BlockingFlowableIterable;
import io.reactivex.internal.operators.flowable.BlockingFlowableLatest;
import io.reactivex.internal.operators.flowable.BlockingFlowableMostRecent;
import io.reactivex.internal.operators.flowable.BlockingFlowableNext;
import io.reactivex.internal.operators.flowable.FlowableAllSingle;
import io.reactivex.internal.operators.flowable.FlowableAmb;
import io.reactivex.internal.operators.flowable.FlowableAnySingle;
import io.reactivex.internal.operators.flowable.FlowableBlockingSubscribe;
import io.reactivex.internal.operators.flowable.FlowableBuffer;
import io.reactivex.internal.operators.flowable.FlowableBufferBoundary;
import io.reactivex.internal.operators.flowable.FlowableBufferBoundarySupplier;
import io.reactivex.internal.operators.flowable.FlowableBufferExactBoundary;
import io.reactivex.internal.operators.flowable.FlowableBufferTimed;
import io.reactivex.internal.operators.flowable.FlowableCache;
import io.reactivex.internal.operators.flowable.FlowableCollectSingle;
import io.reactivex.internal.operators.flowable.FlowableCombineLatest;
import io.reactivex.internal.operators.flowable.FlowableConcatArray;
import io.reactivex.internal.operators.flowable.FlowableConcatMap;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEager;
import io.reactivex.internal.operators.flowable.FlowableConcatMapEagerPublisher;
import io.reactivex.internal.operators.flowable.FlowableConcatWithCompletable;
import io.reactivex.internal.operators.flowable.FlowableConcatWithMaybe;
import io.reactivex.internal.operators.flowable.FlowableConcatWithSingle;
import io.reactivex.internal.operators.flowable.FlowableCountSingle;
import io.reactivex.internal.operators.flowable.FlowableCreate;
import io.reactivex.internal.operators.flowable.FlowableDebounce;
import io.reactivex.internal.operators.flowable.FlowableDebounceTimed;
import io.reactivex.internal.operators.flowable.FlowableDefer;
import io.reactivex.internal.operators.flowable.FlowableDelay;
import io.reactivex.internal.operators.flowable.FlowableDelaySubscriptionOther;
import io.reactivex.internal.operators.flowable.FlowableDematerialize;
import io.reactivex.internal.operators.flowable.FlowableDetach;
import io.reactivex.internal.operators.flowable.FlowableDistinct;
import io.reactivex.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.internal.operators.flowable.FlowableDoAfterNext;
import io.reactivex.internal.operators.flowable.FlowableDoFinally;
import io.reactivex.internal.operators.flowable.FlowableDoOnEach;
import io.reactivex.internal.operators.flowable.FlowableDoOnLifecycle;
import io.reactivex.internal.operators.flowable.FlowableElementAtMaybe;
import io.reactivex.internal.operators.flowable.FlowableElementAtSingle;
import io.reactivex.internal.operators.flowable.FlowableEmpty;
import io.reactivex.internal.operators.flowable.FlowableError;
import io.reactivex.internal.operators.flowable.FlowableFilter;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.internal.operators.flowable.FlowableFlatMapCompletableCompletable;
import io.reactivex.internal.operators.flowable.FlowableFlatMapMaybe;
import io.reactivex.internal.operators.flowable.FlowableFlatMapSingle;
import io.reactivex.internal.operators.flowable.FlowableFlattenIterable;
import io.reactivex.internal.operators.flowable.FlowableFromArray;
import io.reactivex.internal.operators.flowable.FlowableFromCallable;
import io.reactivex.internal.operators.flowable.FlowableFromFuture;
import io.reactivex.internal.operators.flowable.FlowableFromIterable;
import io.reactivex.internal.operators.flowable.FlowableFromPublisher;
import io.reactivex.internal.operators.flowable.FlowableGenerate;
import io.reactivex.internal.operators.flowable.FlowableGroupBy;
import io.reactivex.internal.operators.flowable.FlowableGroupJoin;
import io.reactivex.internal.operators.flowable.FlowableHide;
import io.reactivex.internal.operators.flowable.FlowableIgnoreElements;
import io.reactivex.internal.operators.flowable.FlowableIgnoreElementsCompletable;
import io.reactivex.internal.operators.flowable.FlowableInternalHelper;
import io.reactivex.internal.operators.flowable.FlowableInterval;
import io.reactivex.internal.operators.flowable.FlowableIntervalRange;
import io.reactivex.internal.operators.flowable.FlowableJoin;
import io.reactivex.internal.operators.flowable.FlowableJust;
import io.reactivex.internal.operators.flowable.FlowableLastMaybe;
import io.reactivex.internal.operators.flowable.FlowableLastSingle;
import io.reactivex.internal.operators.flowable.FlowableLift;
import io.reactivex.internal.operators.flowable.FlowableLimit;
import io.reactivex.internal.operators.flowable.FlowableMap;
import io.reactivex.internal.operators.flowable.FlowableMapNotification;
import io.reactivex.internal.operators.flowable.FlowableMaterialize;
import io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable;
import io.reactivex.internal.operators.flowable.FlowableMergeWithMaybe;
import io.reactivex.internal.operators.flowable.FlowableMergeWithSingle;
import io.reactivex.internal.operators.flowable.FlowableNever;
import io.reactivex.internal.operators.flowable.FlowableObserveOn;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBuffer;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureBufferStrategy;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureDrop;
import io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest;
import io.reactivex.internal.operators.flowable.FlowableOnErrorNext;
import io.reactivex.internal.operators.flowable.FlowableOnErrorReturn;
import io.reactivex.internal.operators.flowable.FlowablePublish;
import io.reactivex.internal.operators.flowable.FlowablePublishMulticast;
import io.reactivex.internal.operators.flowable.FlowableRange;
import io.reactivex.internal.operators.flowable.FlowableRangeLong;
import io.reactivex.internal.operators.flowable.FlowableReduceMaybe;
import io.reactivex.internal.operators.flowable.FlowableReduceSeedSingle;
import io.reactivex.internal.operators.flowable.FlowableReduceWithSingle;
import io.reactivex.internal.operators.flowable.FlowableRepeat;
import io.reactivex.internal.operators.flowable.FlowableRepeatUntil;
import io.reactivex.internal.operators.flowable.FlowableRepeatWhen;
import io.reactivex.internal.operators.flowable.FlowableReplay;
import io.reactivex.internal.operators.flowable.FlowableRetryBiPredicate;
import io.reactivex.internal.operators.flowable.FlowableRetryPredicate;
import io.reactivex.internal.operators.flowable.FlowableRetryWhen;
import io.reactivex.internal.operators.flowable.FlowableSamplePublisher;
import io.reactivex.internal.operators.flowable.FlowableSampleTimed;
import io.reactivex.internal.operators.flowable.FlowableScalarXMap;
import io.reactivex.internal.operators.flowable.FlowableScan;
import io.reactivex.internal.operators.flowable.FlowableScanSeed;
import io.reactivex.internal.operators.flowable.FlowableSequenceEqualSingle;
import io.reactivex.internal.operators.flowable.FlowableSerialized;
import io.reactivex.internal.operators.flowable.FlowableSingleMaybe;
import io.reactivex.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.internal.operators.flowable.FlowableSkip;
import io.reactivex.internal.operators.flowable.FlowableSkipLast;
import io.reactivex.internal.operators.flowable.FlowableSkipLastTimed;
import io.reactivex.internal.operators.flowable.FlowableSkipUntil;
import io.reactivex.internal.operators.flowable.FlowableSkipWhile;
import io.reactivex.internal.operators.flowable.FlowableSubscribeOn;
import io.reactivex.internal.operators.flowable.FlowableSwitchIfEmpty;
import io.reactivex.internal.operators.flowable.FlowableSwitchMap;
import io.reactivex.internal.operators.flowable.FlowableTake;
import io.reactivex.internal.operators.flowable.FlowableTakeLast;
import io.reactivex.internal.operators.flowable.FlowableTakeLastOne;
import io.reactivex.internal.operators.flowable.FlowableTakeLastTimed;
import io.reactivex.internal.operators.flowable.FlowableTakeUntil;
import io.reactivex.internal.operators.flowable.FlowableTakeUntilPredicate;
import io.reactivex.internal.operators.flowable.FlowableTakeWhile;
import io.reactivex.internal.operators.flowable.FlowableThrottleFirstTimed;
import io.reactivex.internal.operators.flowable.FlowableThrottleLatest;
import io.reactivex.internal.operators.flowable.FlowableTimeInterval;
import io.reactivex.internal.operators.flowable.FlowableTimeout;
import io.reactivex.internal.operators.flowable.FlowableTimeoutTimed;
import io.reactivex.internal.operators.flowable.FlowableTimer;
import io.reactivex.internal.operators.flowable.FlowableToListSingle;
import io.reactivex.internal.operators.flowable.FlowableUnsubscribeOn;
import io.reactivex.internal.operators.flowable.FlowableUsing;
import io.reactivex.internal.operators.flowable.FlowableWindow;
import io.reactivex.internal.operators.flowable.FlowableWindowBoundary;
import io.reactivex.internal.operators.flowable.FlowableWindowBoundarySelector;
import io.reactivex.internal.operators.flowable.FlowableWindowBoundarySupplier;
import io.reactivex.internal.operators.flowable.FlowableWindowTimed;
import io.reactivex.internal.operators.flowable.FlowableWithLatestFrom;
import io.reactivex.internal.operators.flowable.FlowableWithLatestFromMany;
import io.reactivex.internal.operators.flowable.FlowableZip;
import io.reactivex.internal.operators.flowable.FlowableZipIterable;
import io.reactivex.internal.operators.mixed.FlowableConcatMapCompletable;
import io.reactivex.internal.operators.mixed.FlowableConcatMapMaybe;
import io.reactivex.internal.operators.mixed.FlowableConcatMapSingle;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapCompletable;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapMaybe;
import io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle;
import io.reactivex.internal.operators.observable.ObservableFromPublisher;
import io.reactivex.internal.schedulers.ImmediateThinScheduler;
import io.reactivex.internal.subscribers.BlockingFirstSubscriber;
import io.reactivex.internal.subscribers.BlockingLastSubscriber;
import io.reactivex.internal.subscribers.ForEachWhileSubscriber;
import io.reactivex.internal.subscribers.FutureSubscriber;
import io.reactivex.internal.subscribers.LambdaSubscriber;
import io.reactivex.internal.subscribers.StrictSubscriber;
import io.reactivex.internal.util.ArrayListSupplier;
import io.reactivex.internal.util.ErrorMode;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.HashMapSupplier;
import io.reactivex.parallel.ParallelFlowable;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.schedulers.Timed;
import io.reactivex.subscribers.SafeSubscriber;
import io.reactivex.subscribers.TestSubscriber;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public abstract class Flowable<T> implements b<T> {
    public static final int BUFFER_SIZE = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> amb(Iterable<? extends b<? extends T>> iterable) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new FlowableAmb(null, iterable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> ambArray(b<? extends T>... bVarArr) {
        ObjectHelper.requireNonNull(bVarArr, "sources is null");
        int length = bVarArr.length;
        return length == 0 ? empty() : length == 1 ? fromPublisher(bVarArr[0]) : RxJavaPlugins.onAssembly(new FlowableAmb(bVarArr, null));
    }

    public static int bufferSize() {
        return BUFFER_SIZE;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Flowable<R> combineLatest(b<? extends T1> bVar, b<? extends T2> bVar2, b<? extends T3> bVar3, b<? extends T4> bVar4, b<? extends T5> bVar5, b<? extends T6> bVar6, b<? extends T7> bVar7, b<? extends T8> bVar8, b<? extends T9> bVar9, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        ObjectHelper.requireNonNull(bVar4, "source4 is null");
        ObjectHelper.requireNonNull(bVar5, "source5 is null");
        ObjectHelper.requireNonNull(bVar6, "source6 is null");
        ObjectHelper.requireNonNull(bVar7, "source7 is null");
        ObjectHelper.requireNonNull(bVar8, "source8 is null");
        ObjectHelper.requireNonNull(bVar9, "source9 is null");
        return combineLatest(Functions.toFunction(function9), bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Flowable<R> combineLatest(b<? extends T1> bVar, b<? extends T2> bVar2, b<? extends T3> bVar3, b<? extends T4> bVar4, b<? extends T5> bVar5, b<? extends T6> bVar6, b<? extends T7> bVar7, b<? extends T8> bVar8, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        ObjectHelper.requireNonNull(bVar4, "source4 is null");
        ObjectHelper.requireNonNull(bVar5, "source5 is null");
        ObjectHelper.requireNonNull(bVar6, "source6 is null");
        ObjectHelper.requireNonNull(bVar7, "source7 is null");
        ObjectHelper.requireNonNull(bVar8, "source8 is null");
        return combineLatest(Functions.toFunction(function8), bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, R> Flowable<R> combineLatest(b<? extends T1> bVar, b<? extends T2> bVar2, b<? extends T3> bVar3, b<? extends T4> bVar4, b<? extends T5> bVar5, b<? extends T6> bVar6, b<? extends T7> bVar7, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        ObjectHelper.requireNonNull(bVar4, "source4 is null");
        ObjectHelper.requireNonNull(bVar5, "source5 is null");
        ObjectHelper.requireNonNull(bVar6, "source6 is null");
        ObjectHelper.requireNonNull(bVar7, "source7 is null");
        return combineLatest(Functions.toFunction(function7), bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, R> Flowable<R> combineLatest(b<? extends T1> bVar, b<? extends T2> bVar2, b<? extends T3> bVar3, b<? extends T4> bVar4, b<? extends T5> bVar5, b<? extends T6> bVar6, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        ObjectHelper.requireNonNull(bVar4, "source4 is null");
        ObjectHelper.requireNonNull(bVar5, "source5 is null");
        ObjectHelper.requireNonNull(bVar6, "source6 is null");
        return combineLatest(Functions.toFunction(function6), bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, R> Flowable<R> combineLatest(b<? extends T1> bVar, b<? extends T2> bVar2, b<? extends T3> bVar3, b<? extends T4> bVar4, b<? extends T5> bVar5, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        ObjectHelper.requireNonNull(bVar4, "source4 is null");
        ObjectHelper.requireNonNull(bVar5, "source5 is null");
        return combineLatest(Functions.toFunction(function5), bVar, bVar2, bVar3, bVar4, bVar5);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, R> Flowable<R> combineLatest(b<? extends T1> bVar, b<? extends T2> bVar2, b<? extends T3> bVar3, b<? extends T4> bVar4, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        ObjectHelper.requireNonNull(bVar4, "source4 is null");
        return combineLatest(Functions.toFunction(function4), bVar, bVar2, bVar3, bVar4);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, R> Flowable<R> combineLatest(b<? extends T1> bVar, b<? extends T2> bVar2, b<? extends T3> bVar3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        return combineLatest(Functions.toFunction(function3), bVar, bVar2, bVar3);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T1, T2, R> Flowable<R> combineLatest(b<? extends T1> bVar, b<? extends T2> bVar2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        return combineLatest(Functions.toFunction(biFunction), bVar, bVar2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T, R> Flowable<R> combineLatest(Function<? super Object[], ? extends R> function, b<? extends T>... bVarArr) {
        return combineLatest(bVarArr, function, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T, R> Flowable<R> combineLatest(Iterable<? extends b<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        return combineLatest(iterable, function, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T, R> Flowable<R> combineLatest(Iterable<? extends b<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i10) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        ObjectHelper.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableCombineLatest((Iterable) iterable, (Function) function, i10, false));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T, R> Flowable<R> combineLatest(b<? extends T>[] bVarArr, Function<? super Object[], ? extends R> function) {
        return combineLatest(bVarArr, function, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T, R> Flowable<R> combineLatest(b<? extends T>[] bVarArr, Function<? super Object[], ? extends R> function, int i10) {
        ObjectHelper.requireNonNull(bVarArr, "sources is null");
        if (bVarArr.length == 0) {
            return empty();
        }
        ObjectHelper.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableCombineLatest((b[]) bVarArr, (Function) function, i10, false));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T, R> Flowable<R> combineLatestDelayError(Function<? super Object[], ? extends R> function, int i10, b<? extends T>... bVarArr) {
        return combineLatestDelayError(bVarArr, function, i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T, R> Flowable<R> combineLatestDelayError(Function<? super Object[], ? extends R> function, b<? extends T>... bVarArr) {
        return combineLatestDelayError(bVarArr, function, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T, R> Flowable<R> combineLatestDelayError(Iterable<? extends b<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        return combineLatestDelayError(iterable, function, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T, R> Flowable<R> combineLatestDelayError(Iterable<? extends b<? extends T>> iterable, Function<? super Object[], ? extends R> function, int i10) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        ObjectHelper.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableCombineLatest((Iterable) iterable, (Function) function, i10, true));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T, R> Flowable<R> combineLatestDelayError(b<? extends T>[] bVarArr, Function<? super Object[], ? extends R> function) {
        return combineLatestDelayError(bVarArr, function, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T, R> Flowable<R> combineLatestDelayError(b<? extends T>[] bVarArr, Function<? super Object[], ? extends R> function, int i10) {
        ObjectHelper.requireNonNull(bVarArr, "sources is null");
        ObjectHelper.requireNonNull(function, "combiner is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return bVarArr.length == 0 ? empty() : RxJavaPlugins.onAssembly(new FlowableCombineLatest((b[]) bVarArr, (Function) function, i10, true));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> concat(b<? extends b<? extends T>> bVar) {
        return concat(bVar, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> concat(b<? extends b<? extends T>> bVar, int i10) {
        return fromPublisher(bVar).concatMap(Functions.identity(), i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concat(b<? extends T> bVar, b<? extends T> bVar2) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        return concatArray(bVar, bVar2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concat(b<? extends T> bVar, b<? extends T> bVar2, b<? extends T> bVar3) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        return concatArray(bVar, bVar2, bVar3);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concat(b<? extends T> bVar, b<? extends T> bVar2, b<? extends T> bVar3, b<? extends T> bVar4) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        ObjectHelper.requireNonNull(bVar4, "source4 is null");
        return concatArray(bVar, bVar2, bVar3, bVar4);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concat(Iterable<? extends b<? extends T>> iterable) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(Functions.identity(), 2, false);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> concatArray(b<? extends T>... bVarArr) {
        return bVarArr.length == 0 ? empty() : bVarArr.length == 1 ? fromPublisher(bVarArr[0]) : RxJavaPlugins.onAssembly(new FlowableConcatArray(bVarArr, false));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> concatArrayDelayError(b<? extends T>... bVarArr) {
        return bVarArr.length == 0 ? empty() : bVarArr.length == 1 ? fromPublisher(bVarArr[0]) : RxJavaPlugins.onAssembly(new FlowableConcatArray(bVarArr, true));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concatArrayEager(int i10, int i11, b<? extends T>... bVarArr) {
        ObjectHelper.requireNonNull(bVarArr, "sources is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapEager(new FlowableFromArray(bVarArr), Functions.identity(), i10, i11, ErrorMode.IMMEDIATE));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> concatArrayEager(b<? extends T>... bVarArr) {
        return concatArrayEager(bufferSize(), bufferSize(), bVarArr);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> concatArrayEagerDelayError(int i10, int i11, b<? extends T>... bVarArr) {
        return fromArray(bVarArr).concatMapEagerDelayError(Functions.identity(), i10, i11, true);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> concatArrayEagerDelayError(b<? extends T>... bVarArr) {
        return concatArrayEagerDelayError(bufferSize(), bufferSize(), bVarArr);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> concatDelayError(b<? extends b<? extends T>> bVar) {
        return concatDelayError(bVar, bufferSize(), true);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> concatDelayError(b<? extends b<? extends T>> bVar, int i10, boolean z10) {
        return fromPublisher(bVar).concatMapDelayError(Functions.identity(), i10, z10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concatDelayError(Iterable<? extends b<? extends T>> iterable) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return fromIterable(iterable).concatMapDelayError(Functions.identity());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> concatEager(b<? extends b<? extends T>> bVar) {
        return concatEager(bVar, bufferSize(), bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concatEager(b<? extends b<? extends T>> bVar, int i10, int i11) {
        ObjectHelper.requireNonNull(bVar, "sources is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapEagerPublisher(bVar, Functions.identity(), i10, i11, ErrorMode.IMMEDIATE));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> concatEager(Iterable<? extends b<? extends T>> iterable) {
        return concatEager(iterable, bufferSize(), bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> concatEager(Iterable<? extends b<? extends T>> iterable, int i10, int i11) {
        ObjectHelper.requireNonNull(iterable, "sources is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapEager(new FlowableFromIterable(iterable), Functions.identity(), i10, i11, ErrorMode.IMMEDIATE));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> create(FlowableOnSubscribe<T> flowableOnSubscribe, BackpressureStrategy backpressureStrategy) {
        ObjectHelper.requireNonNull(flowableOnSubscribe, "source is null");
        ObjectHelper.requireNonNull(backpressureStrategy, "mode is null");
        return RxJavaPlugins.onAssembly(new FlowableCreate(flowableOnSubscribe, backpressureStrategy));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> defer(Callable<? extends b<? extends T>> callable) {
        ObjectHelper.requireNonNull(callable, "supplier is null");
        return RxJavaPlugins.onAssembly(new FlowableDefer(callable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    private Flowable<T> doOnEach(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        ObjectHelper.requireNonNull(consumer, "onNext is null");
        ObjectHelper.requireNonNull(consumer2, "onError is null");
        ObjectHelper.requireNonNull(action, "onComplete is null");
        ObjectHelper.requireNonNull(action2, "onAfterTerminate is null");
        return RxJavaPlugins.onAssembly(new FlowableDoOnEach(this, consumer, consumer2, action, action2));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static <T> Flowable<T> empty() {
        return RxJavaPlugins.onAssembly(FlowableEmpty.INSTANCE);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> error(Throwable th) {
        ObjectHelper.requireNonNull(th, "throwable is null");
        return error(Functions.justCallable(th));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> error(Callable<? extends Throwable> callable) {
        ObjectHelper.requireNonNull(callable, "supplier is null");
        return RxJavaPlugins.onAssembly(new FlowableError(callable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> fromArray(T... tArr) {
        ObjectHelper.requireNonNull(tArr, "items is null");
        return tArr.length == 0 ? empty() : tArr.length == 1 ? just(tArr[0]) : RxJavaPlugins.onAssembly(new FlowableFromArray(tArr));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> fromCallable(Callable<? extends T> callable) {
        ObjectHelper.requireNonNull(callable, "supplier is null");
        return RxJavaPlugins.onAssembly(new FlowableFromCallable(callable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> fromFuture(Future<? extends T> future) {
        ObjectHelper.requireNonNull(future, "future is null");
        return RxJavaPlugins.onAssembly(new FlowableFromFuture(future, 0L, null));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> fromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        ObjectHelper.requireNonNull(future, "future is null");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        return RxJavaPlugins.onAssembly(new FlowableFromFuture(future, j10, timeUnit));
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> fromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return fromFuture(future, j10, timeUnit).subscribeOn(scheduler);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> fromFuture(Future<? extends T> future, Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return fromFuture(future).subscribeOn(scheduler);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> fromIterable(Iterable<? extends T> iterable) {
        ObjectHelper.requireNonNull(iterable, "source is null");
        return RxJavaPlugins.onAssembly(new FlowableFromIterable(iterable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> fromPublisher(b<? extends T> bVar) {
        if (bVar instanceof Flowable) {
            return RxJavaPlugins.onAssembly((Flowable) bVar);
        }
        ObjectHelper.requireNonNull(bVar, "source is null");
        return RxJavaPlugins.onAssembly(new FlowableFromPublisher(bVar));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> generate(Consumer<Emitter<T>> consumer) {
        ObjectHelper.requireNonNull(consumer, "generator is null");
        return generate(Functions.nullSupplier(), FlowableInternalHelper.simpleGenerator(consumer), Functions.emptyConsumer());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T, S> Flowable<T> generate(Callable<S> callable, BiConsumer<S, Emitter<T>> biConsumer) {
        ObjectHelper.requireNonNull(biConsumer, "generator is null");
        return generate(callable, FlowableInternalHelper.simpleBiGenerator(biConsumer), Functions.emptyConsumer());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T, S> Flowable<T> generate(Callable<S> callable, BiConsumer<S, Emitter<T>> biConsumer, Consumer<? super S> consumer) {
        ObjectHelper.requireNonNull(biConsumer, "generator is null");
        return generate(callable, FlowableInternalHelper.simpleBiGenerator(biConsumer), consumer);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T, S> Flowable<T> generate(Callable<S> callable, BiFunction<S, Emitter<T>, S> biFunction) {
        return generate(callable, biFunction, Functions.emptyConsumer());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T, S> Flowable<T> generate(Callable<S> callable, BiFunction<S, Emitter<T>, S> biFunction, Consumer<? super S> consumer) {
        ObjectHelper.requireNonNull(callable, "initialState is null");
        ObjectHelper.requireNonNull(biFunction, "generator is null");
        ObjectHelper.requireNonNull(consumer, "disposeState is null");
        return RxJavaPlugins.onAssembly(new FlowableGenerate(callable, biFunction, consumer));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public static Flowable<Long> interval(long j10, long j11, TimeUnit timeUnit) {
        return interval(j10, j11, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public static Flowable<Long> interval(long j10, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableInterval(Math.max(0L, j10), Math.max(0L, j11), timeUnit, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public static Flowable<Long> interval(long j10, TimeUnit timeUnit) {
        return interval(j10, j10, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public static Flowable<Long> interval(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return interval(j10, j10, timeUnit, scheduler);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public static Flowable<Long> intervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit) {
        return intervalRange(j10, j11, j12, j13, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public static Flowable<Long> intervalRange(long j10, long j11, long j12, long j13, TimeUnit timeUnit, Scheduler scheduler) {
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (i10 == 0) {
                return empty().delay(j12, timeUnit, scheduler);
            }
            long j14 = (j11 - 1) + j10;
            if (j10 <= 0 || j14 >= 0) {
                ObjectHelper.requireNonNull(timeUnit, "unit is null");
                ObjectHelper.requireNonNull(scheduler, "scheduler is null");
                return RxJavaPlugins.onAssembly(new FlowableIntervalRange(j10, j14, Math.max(0L, j12), Math.max(0L, j13), timeUnit, scheduler));
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("count >= 0 required but it was ", j11));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> just(T t2) {
        ObjectHelper.requireNonNull(t2, "item is null");
        return RxJavaPlugins.onAssembly(new FlowableJust(t2));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> just(T t2, T t8) {
        ObjectHelper.requireNonNull(t2, "item1 is null");
        ObjectHelper.requireNonNull(t8, "item2 is null");
        return fromArray(t2, t8);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> just(T t2, T t8, T t10) {
        ObjectHelper.requireNonNull(t2, "item1 is null");
        ObjectHelper.requireNonNull(t8, "item2 is null");
        ObjectHelper.requireNonNull(t10, "item3 is null");
        return fromArray(t2, t8, t10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> just(T t2, T t8, T t10, T t11) {
        ObjectHelper.requireNonNull(t2, "item1 is null");
        ObjectHelper.requireNonNull(t8, "item2 is null");
        ObjectHelper.requireNonNull(t10, "item3 is null");
        ObjectHelper.requireNonNull(t11, "item4 is null");
        return fromArray(t2, t8, t10, t11);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> just(T t2, T t8, T t10, T t11, T t12) {
        ObjectHelper.requireNonNull(t2, "item1 is null");
        ObjectHelper.requireNonNull(t8, "item2 is null");
        ObjectHelper.requireNonNull(t10, "item3 is null");
        ObjectHelper.requireNonNull(t11, "item4 is null");
        ObjectHelper.requireNonNull(t12, "item5 is null");
        return fromArray(t2, t8, t10, t11, t12);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> just(T t2, T t8, T t10, T t11, T t12, T t13) {
        ObjectHelper.requireNonNull(t2, "item1 is null");
        ObjectHelper.requireNonNull(t8, "item2 is null");
        ObjectHelper.requireNonNull(t10, "item3 is null");
        ObjectHelper.requireNonNull(t11, "item4 is null");
        ObjectHelper.requireNonNull(t12, "item5 is null");
        ObjectHelper.requireNonNull(t13, "item6 is null");
        return fromArray(t2, t8, t10, t11, t12, t13);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> just(T t2, T t8, T t10, T t11, T t12, T t13, T t14) {
        ObjectHelper.requireNonNull(t2, "item1 is null");
        ObjectHelper.requireNonNull(t8, "item2 is null");
        ObjectHelper.requireNonNull(t10, "item3 is null");
        ObjectHelper.requireNonNull(t11, "item4 is null");
        ObjectHelper.requireNonNull(t12, "item5 is null");
        ObjectHelper.requireNonNull(t13, "item6 is null");
        ObjectHelper.requireNonNull(t14, "item7 is null");
        return fromArray(t2, t8, t10, t11, t12, t13, t14);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> just(T t2, T t8, T t10, T t11, T t12, T t13, T t14, T t15) {
        ObjectHelper.requireNonNull(t2, "item1 is null");
        ObjectHelper.requireNonNull(t8, "item2 is null");
        ObjectHelper.requireNonNull(t10, "item3 is null");
        ObjectHelper.requireNonNull(t11, "item4 is null");
        ObjectHelper.requireNonNull(t12, "item5 is null");
        ObjectHelper.requireNonNull(t13, "item6 is null");
        ObjectHelper.requireNonNull(t14, "item7 is null");
        ObjectHelper.requireNonNull(t15, "item8 is null");
        return fromArray(t2, t8, t10, t11, t12, t13, t14, t15);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> just(T t2, T t8, T t10, T t11, T t12, T t13, T t14, T t15, T t16) {
        ObjectHelper.requireNonNull(t2, "item1 is null");
        ObjectHelper.requireNonNull(t8, "item2 is null");
        ObjectHelper.requireNonNull(t10, "item3 is null");
        ObjectHelper.requireNonNull(t11, "item4 is null");
        ObjectHelper.requireNonNull(t12, "item5 is null");
        ObjectHelper.requireNonNull(t13, "item6 is null");
        ObjectHelper.requireNonNull(t14, "item7 is null");
        ObjectHelper.requireNonNull(t15, "item8 is null");
        ObjectHelper.requireNonNull(t16, "item9 is null");
        return fromArray(t2, t8, t10, t11, t12, t13, t14, t15, t16);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> just(T t2, T t8, T t10, T t11, T t12, T t13, T t14, T t15, T t16, T t17) {
        ObjectHelper.requireNonNull(t2, "item1 is null");
        ObjectHelper.requireNonNull(t8, "item2 is null");
        ObjectHelper.requireNonNull(t10, "item3 is null");
        ObjectHelper.requireNonNull(t11, "item4 is null");
        ObjectHelper.requireNonNull(t12, "item5 is null");
        ObjectHelper.requireNonNull(t13, "item6 is null");
        ObjectHelper.requireNonNull(t14, "item7 is null");
        ObjectHelper.requireNonNull(t15, "item8 is null");
        ObjectHelper.requireNonNull(t16, "item9 is null");
        ObjectHelper.requireNonNull(t17, "item10 is null");
        return fromArray(t2, t8, t10, t11, t12, t13, t14, t15, t16, t17);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> merge(b<? extends b<? extends T>> bVar) {
        return merge(bVar, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> merge(b<? extends b<? extends T>> bVar, int i10) {
        return fromPublisher(bVar).flatMap(Functions.identity(), i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> merge(b<? extends T> bVar, b<? extends T> bVar2) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        return fromArray(bVar, bVar2).flatMap(Functions.identity(), false, 2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> merge(b<? extends T> bVar, b<? extends T> bVar2, b<? extends T> bVar3) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        return fromArray(bVar, bVar2, bVar3).flatMap(Functions.identity(), false, 3);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> merge(b<? extends T> bVar, b<? extends T> bVar2, b<? extends T> bVar3, b<? extends T> bVar4) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        ObjectHelper.requireNonNull(bVar4, "source4 is null");
        return fromArray(bVar, bVar2, bVar3, bVar4).flatMap(Functions.identity(), false, 4);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> merge(Iterable<? extends b<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.identity());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> merge(Iterable<? extends b<? extends T>> iterable, int i10) {
        return fromIterable(iterable).flatMap(Functions.identity(), i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> merge(Iterable<? extends b<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(Functions.identity(), false, i10, i11);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> mergeArray(int i10, int i11, b<? extends T>... bVarArr) {
        return fromArray(bVarArr).flatMap(Functions.identity(), false, i10, i11);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> mergeArray(b<? extends T>... bVarArr) {
        return fromArray(bVarArr).flatMap(Functions.identity(), bVarArr.length);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> mergeArrayDelayError(int i10, int i11, b<? extends T>... bVarArr) {
        return fromArray(bVarArr).flatMap(Functions.identity(), true, i10, i11);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> mergeArrayDelayError(b<? extends T>... bVarArr) {
        return fromArray(bVarArr).flatMap(Functions.identity(), true, bVarArr.length);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> mergeDelayError(b<? extends b<? extends T>> bVar) {
        return mergeDelayError(bVar, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> mergeDelayError(b<? extends b<? extends T>> bVar, int i10) {
        return fromPublisher(bVar).flatMap(Functions.identity(), true, i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> mergeDelayError(b<? extends T> bVar, b<? extends T> bVar2) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        return fromArray(bVar, bVar2).flatMap(Functions.identity(), true, 2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> mergeDelayError(b<? extends T> bVar, b<? extends T> bVar2, b<? extends T> bVar3) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        return fromArray(bVar, bVar2, bVar3).flatMap(Functions.identity(), true, 3);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> mergeDelayError(b<? extends T> bVar, b<? extends T> bVar2, b<? extends T> bVar3, b<? extends T> bVar4) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        ObjectHelper.requireNonNull(bVar4, "source4 is null");
        return fromArray(bVar, bVar2, bVar3, bVar4).flatMap(Functions.identity(), true, 4);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> mergeDelayError(Iterable<? extends b<? extends T>> iterable) {
        return fromIterable(iterable).flatMap(Functions.identity(), true);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> mergeDelayError(Iterable<? extends b<? extends T>> iterable, int i10) {
        return fromIterable(iterable).flatMap(Functions.identity(), true, i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> mergeDelayError(Iterable<? extends b<? extends T>> iterable, int i10, int i11) {
        return fromIterable(iterable).flatMap(Functions.identity(), true, i10, i11);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static <T> Flowable<T> never() {
        return RxJavaPlugins.onAssembly(FlowableNever.INSTANCE);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static Flowable<Integer> range(int i10, int i11) {
        if (i11 >= 0) {
            if (i11 == 0) {
                return empty();
            }
            if (i11 == 1) {
                return just(Integer.valueOf(i10));
            }
            if (i10 + (i11 - 1) <= 2147483647L) {
                return RxJavaPlugins.onAssembly(new FlowableRange(i10, i11));
            }
            throw new IllegalArgumentException("Integer overflow");
        }
        throw new IllegalArgumentException(a.j("count >= 0 required but it was ", i11));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static Flowable<Long> rangeLong(long j10, long j11) {
        int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (i10 == 0) {
                return empty();
            }
            if (j11 == 1) {
                return just(Long.valueOf(j10));
            }
            long j12 = (j11 - 1) + j10;
            if (j10 > 0 && j12 < 0) {
                throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
            }
            return RxJavaPlugins.onAssembly(new FlowableRangeLong(j10, j11));
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("count >= 0 required but it was ", j11));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Single<Boolean> sequenceEqual(b<? extends T> bVar, b<? extends T> bVar2) {
        return sequenceEqual(bVar, bVar2, ObjectHelper.equalsPredicate(), bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Single<Boolean> sequenceEqual(b<? extends T> bVar, b<? extends T> bVar2, int i10) {
        return sequenceEqual(bVar, bVar2, ObjectHelper.equalsPredicate(), i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Single<Boolean> sequenceEqual(b<? extends T> bVar, b<? extends T> bVar2, BiPredicate<? super T, ? super T> biPredicate) {
        return sequenceEqual(bVar, bVar2, biPredicate, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T> Single<Boolean> sequenceEqual(b<? extends T> bVar, b<? extends T> bVar2, BiPredicate<? super T, ? super T> biPredicate, int i10) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(biPredicate, "isEqual is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableSequenceEqualSingle(bVar, bVar2, biPredicate, i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> switchOnNext(b<? extends b<? extends T>> bVar) {
        return fromPublisher(bVar).switchMap(Functions.identity());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> switchOnNext(b<? extends b<? extends T>> bVar, int i10) {
        return fromPublisher(bVar).switchMap(Functions.identity(), i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> switchOnNextDelayError(b<? extends b<? extends T>> bVar) {
        return switchOnNextDelayError(bVar, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public static <T> Flowable<T> switchOnNextDelayError(b<? extends b<? extends T>> bVar, int i10) {
        return fromPublisher(bVar).switchMapDelayError(Functions.identity(), i10);
    }

    private Flowable<T> timeout0(long j10, TimeUnit timeUnit, b<? extends T> bVar, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "timeUnit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableTimeoutTimed(this, j10, timeUnit, scheduler, bVar));
    }

    private <U, V> Flowable<T> timeout0(b<U> bVar, Function<? super T, ? extends b<V>> function, b<? extends T> bVar2) {
        ObjectHelper.requireNonNull(function, "itemTimeoutIndicator is null");
        return RxJavaPlugins.onAssembly(new FlowableTimeout(this, bVar, function, bVar2));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public static Flowable<Long> timer(long j10, TimeUnit timeUnit) {
        return timer(j10, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public static Flowable<Long> timer(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableTimer(Math.max(0L, j10), timeUnit, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.NONE)
    @CheckReturnValue
    @NonNull
    public static <T> Flowable<T> unsafeCreate(b<T> bVar) {
        ObjectHelper.requireNonNull(bVar, "onSubscribe is null");
        if (bVar instanceof Flowable) {
            throw new IllegalArgumentException("unsafeCreate(Flowable) should be upgraded");
        }
        return RxJavaPlugins.onAssembly(new FlowableFromPublisher(bVar));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public static <T, D> Flowable<T> using(Callable<? extends D> callable, Function<? super D, ? extends b<? extends T>> function, Consumer<? super D> consumer) {
        return using(callable, function, consumer, true);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public static <T, D> Flowable<T> using(Callable<? extends D> callable, Function<? super D, ? extends b<? extends T>> function, Consumer<? super D> consumer, boolean z10) {
        ObjectHelper.requireNonNull(callable, "resourceSupplier is null");
        ObjectHelper.requireNonNull(function, "sourceSupplier is null");
        ObjectHelper.requireNonNull(consumer, "resourceDisposer is null");
        return RxJavaPlugins.onAssembly(new FlowableUsing(callable, function, consumer, z10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Flowable<R> zip(b<? extends T1> bVar, b<? extends T2> bVar2, b<? extends T3> bVar3, b<? extends T4> bVar4, b<? extends T5> bVar5, b<? extends T6> bVar6, b<? extends T7> bVar7, b<? extends T8> bVar8, b<? extends T9> bVar9, Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> function9) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        ObjectHelper.requireNonNull(bVar4, "source4 is null");
        ObjectHelper.requireNonNull(bVar5, "source5 is null");
        ObjectHelper.requireNonNull(bVar6, "source6 is null");
        ObjectHelper.requireNonNull(bVar7, "source7 is null");
        ObjectHelper.requireNonNull(bVar8, "source8 is null");
        ObjectHelper.requireNonNull(bVar9, "source9 is null");
        return zipArray(Functions.toFunction(function9), false, bufferSize(), bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Flowable<R> zip(b<? extends T1> bVar, b<? extends T2> bVar2, b<? extends T3> bVar3, b<? extends T4> bVar4, b<? extends T5> bVar5, b<? extends T6> bVar6, b<? extends T7> bVar7, b<? extends T8> bVar8, Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> function8) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        ObjectHelper.requireNonNull(bVar4, "source4 is null");
        ObjectHelper.requireNonNull(bVar5, "source5 is null");
        ObjectHelper.requireNonNull(bVar6, "source6 is null");
        ObjectHelper.requireNonNull(bVar7, "source7 is null");
        ObjectHelper.requireNonNull(bVar8, "source8 is null");
        return zipArray(Functions.toFunction(function8), false, bufferSize(), bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, T7, R> Flowable<R> zip(b<? extends T1> bVar, b<? extends T2> bVar2, b<? extends T3> bVar3, b<? extends T4> bVar4, b<? extends T5> bVar5, b<? extends T6> bVar6, b<? extends T7> bVar7, Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> function7) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        ObjectHelper.requireNonNull(bVar4, "source4 is null");
        ObjectHelper.requireNonNull(bVar5, "source5 is null");
        ObjectHelper.requireNonNull(bVar6, "source6 is null");
        ObjectHelper.requireNonNull(bVar7, "source7 is null");
        return zipArray(Functions.toFunction(function7), false, bufferSize(), bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, T6, R> Flowable<R> zip(b<? extends T1> bVar, b<? extends T2> bVar2, b<? extends T3> bVar3, b<? extends T4> bVar4, b<? extends T5> bVar5, b<? extends T6> bVar6, Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> function6) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        ObjectHelper.requireNonNull(bVar4, "source4 is null");
        ObjectHelper.requireNonNull(bVar5, "source5 is null");
        ObjectHelper.requireNonNull(bVar6, "source6 is null");
        return zipArray(Functions.toFunction(function6), false, bufferSize(), bVar, bVar2, bVar3, bVar4, bVar5, bVar6);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, T5, R> Flowable<R> zip(b<? extends T1> bVar, b<? extends T2> bVar2, b<? extends T3> bVar3, b<? extends T4> bVar4, b<? extends T5> bVar5, Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> function5) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        ObjectHelper.requireNonNull(bVar4, "source4 is null");
        ObjectHelper.requireNonNull(bVar5, "source5 is null");
        return zipArray(Functions.toFunction(function5), false, bufferSize(), bVar, bVar2, bVar3, bVar4, bVar5);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, T4, R> Flowable<R> zip(b<? extends T1> bVar, b<? extends T2> bVar2, b<? extends T3> bVar3, b<? extends T4> bVar4, Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> function4) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        ObjectHelper.requireNonNull(bVar4, "source4 is null");
        return zipArray(Functions.toFunction(function4), false, bufferSize(), bVar, bVar2, bVar3, bVar4);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T1, T2, T3, R> Flowable<R> zip(b<? extends T1> bVar, b<? extends T2> bVar2, b<? extends T3> bVar3, Function3<? super T1, ? super T2, ? super T3, ? extends R> function3) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        return zipArray(Functions.toFunction(function3), false, bufferSize(), bVar, bVar2, bVar3);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T1, T2, R> Flowable<R> zip(b<? extends T1> bVar, b<? extends T2> bVar2, BiFunction<? super T1, ? super T2, ? extends R> biFunction) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        return zipArray(Functions.toFunction(biFunction), false, bufferSize(), bVar, bVar2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T1, T2, R> Flowable<R> zip(b<? extends T1> bVar, b<? extends T2> bVar2, BiFunction<? super T1, ? super T2, ? extends R> biFunction, boolean z10) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        return zipArray(Functions.toFunction(biFunction), z10, bufferSize(), bVar, bVar2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T1, T2, R> Flowable<R> zip(b<? extends T1> bVar, b<? extends T2> bVar2, BiFunction<? super T1, ? super T2, ? extends R> biFunction, boolean z10, int i10) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        return zipArray(Functions.toFunction(biFunction), z10, i10, bVar, bVar2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T, R> Flowable<R> zip(b<? extends b<? extends T>> bVar, Function<? super Object[], ? extends R> function) {
        ObjectHelper.requireNonNull(function, "zipper is null");
        return fromPublisher(bVar).toList().flatMapPublisher(FlowableInternalHelper.zipIterable(function));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T, R> Flowable<R> zip(Iterable<? extends b<? extends T>> iterable, Function<? super Object[], ? extends R> function) {
        ObjectHelper.requireNonNull(function, "zipper is null");
        ObjectHelper.requireNonNull(iterable, "sources is null");
        return RxJavaPlugins.onAssembly(new FlowableZip(null, iterable, function, bufferSize(), false));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T, R> Flowable<R> zipArray(Function<? super Object[], ? extends R> function, boolean z10, int i10, b<? extends T>... bVarArr) {
        if (bVarArr.length == 0) {
            return empty();
        }
        ObjectHelper.requireNonNull(function, "zipper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableZip(bVarArr, null, function, i10, z10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public static <T, R> Flowable<R> zipIterable(Iterable<? extends b<? extends T>> iterable, Function<? super Object[], ? extends R> function, boolean z10, int i10) {
        ObjectHelper.requireNonNull(function, "zipper is null");
        ObjectHelper.requireNonNull(iterable, "sources is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableZip(null, iterable, function, i10, z10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final Single<Boolean> all(Predicate<? super T> predicate) {
        ObjectHelper.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableAllSingle(this, predicate));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> ambWith(b<? extends T> bVar) {
        ObjectHelper.requireNonNull(bVar, "other is null");
        return ambArray(this, bVar);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final Single<Boolean> any(Predicate<? super T> predicate) {
        ObjectHelper.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableAnySingle(this, predicate));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    public final <R> R as(@NonNull FlowableConverter<T, ? extends R> flowableConverter) {
        return (R) ((FlowableConverter) ObjectHelper.requireNonNull(flowableConverter, "converter is null")).apply(this);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final T blockingFirst() {
        BlockingFirstSubscriber blockingFirstSubscriber = new BlockingFirstSubscriber();
        subscribe((FlowableSubscriber) blockingFirstSubscriber);
        T blockingGet = blockingFirstSubscriber.blockingGet();
        if (blockingGet != null) {
            return blockingGet;
        }
        throw new NoSuchElementException();
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final T blockingFirst(T t2) {
        BlockingFirstSubscriber blockingFirstSubscriber = new BlockingFirstSubscriber();
        subscribe((FlowableSubscriber) blockingFirstSubscriber);
        T blockingGet = blockingFirstSubscriber.blockingGet();
        if (blockingGet != null) {
            t2 = blockingGet;
        }
        return t2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    public final void blockingForEach(Consumer<? super T> consumer) {
        Iterator<T> it = blockingIterable().iterator();
        while (it.hasNext()) {
            try {
                consumer.accept(it.next());
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                ((Disposable) it).dispose();
                throw ExceptionHelper.wrapOrThrow(th);
            }
        }
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Iterable<T> blockingIterable() {
        return blockingIterable(bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Iterable<T> blockingIterable(int i10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return new BlockingFlowableIterable(this, i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final T blockingLast() {
        BlockingLastSubscriber blockingLastSubscriber = new BlockingLastSubscriber();
        subscribe((FlowableSubscriber) blockingLastSubscriber);
        T blockingGet = blockingLastSubscriber.blockingGet();
        if (blockingGet != null) {
            return blockingGet;
        }
        throw new NoSuchElementException();
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final T blockingLast(T t2) {
        BlockingLastSubscriber blockingLastSubscriber = new BlockingLastSubscriber();
        subscribe((FlowableSubscriber) blockingLastSubscriber);
        T blockingGet = blockingLastSubscriber.blockingGet();
        if (blockingGet != null) {
            t2 = blockingGet;
        }
        return t2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Iterable<T> blockingLatest() {
        return new BlockingFlowableLatest(this);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Iterable<T> blockingMostRecent(T t2) {
        return new BlockingFlowableMostRecent(this, t2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Iterable<T> blockingNext() {
        return new BlockingFlowableNext(this);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final T blockingSingle() {
        return singleOrError().blockingGet();
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final T blockingSingle(T t2) {
        return single(t2).blockingGet();
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    public final void blockingSubscribe() {
        FlowableBlockingSubscribe.subscribe(this);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    public final void blockingSubscribe(c<? super T> cVar) {
        FlowableBlockingSubscribe.subscribe(this, cVar);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    public final void blockingSubscribe(Consumer<? super T> consumer) {
        FlowableBlockingSubscribe.subscribe(this, consumer, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    public final void blockingSubscribe(Consumer<? super T> consumer, int i10) {
        FlowableBlockingSubscribe.subscribe(this, consumer, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION, i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    public final void blockingSubscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        FlowableBlockingSubscribe.subscribe(this, consumer, consumer2, Functions.EMPTY_ACTION);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    public final void blockingSubscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, int i10) {
        FlowableBlockingSubscribe.subscribe(this, consumer, consumer2, Functions.EMPTY_ACTION, i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    public final void blockingSubscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        FlowableBlockingSubscribe.subscribe(this, consumer, consumer2, action);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    public final void blockingSubscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, int i10) {
        FlowableBlockingSubscribe.subscribe(this, consumer, consumer2, action, i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<List<T>> buffer(int i10) {
        return buffer(i10, i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<List<T>> buffer(int i10, int i11) {
        return (Flowable<List<T>>) buffer(i10, i11, ArrayListSupplier.asCallable());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <U extends Collection<? super T>> Flowable<U> buffer(int i10, int i11, Callable<U> callable) {
        ObjectHelper.verifyPositive(i10, "count");
        ObjectHelper.verifyPositive(i11, "skip");
        ObjectHelper.requireNonNull(callable, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableBuffer(this, i10, i11, callable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <U extends Collection<? super T>> Flowable<U> buffer(int i10, Callable<U> callable) {
        return buffer(i10, i10, callable);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<List<T>> buffer(long j10, long j11, TimeUnit timeUnit) {
        return (Flowable<List<T>>) buffer(j10, j11, timeUnit, Schedulers.computation(), ArrayListSupplier.asCallable());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<List<T>> buffer(long j10, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return (Flowable<List<T>>) buffer(j10, j11, timeUnit, scheduler, ArrayListSupplier.asCallable());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public final <U extends Collection<? super T>> Flowable<U> buffer(long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, Callable<U> callable) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.requireNonNull(callable, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableBufferTimed(this, j10, j11, timeUnit, scheduler, callable, IntCompanionObject.MAX_VALUE, false));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<List<T>> buffer(long j10, TimeUnit timeUnit) {
        return buffer(j10, timeUnit, Schedulers.computation(), (int) IntCompanionObject.MAX_VALUE);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<List<T>> buffer(long j10, TimeUnit timeUnit, int i10) {
        return buffer(j10, timeUnit, Schedulers.computation(), i10);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<List<T>> buffer(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return (Flowable<List<T>>) buffer(j10, timeUnit, scheduler, IntCompanionObject.MAX_VALUE, ArrayListSupplier.asCallable(), false);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<List<T>> buffer(long j10, TimeUnit timeUnit, Scheduler scheduler, int i10) {
        return (Flowable<List<T>>) buffer(j10, timeUnit, scheduler, i10, ArrayListSupplier.asCallable(), false);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final <U extends Collection<? super T>> Flowable<U> buffer(long j10, TimeUnit timeUnit, Scheduler scheduler, int i10, Callable<U> callable, boolean z10) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.requireNonNull(callable, "bufferSupplier is null");
        ObjectHelper.verifyPositive(i10, "count");
        return RxJavaPlugins.onAssembly(new FlowableBufferTimed(this, j10, j10, timeUnit, scheduler, callable, i10, z10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final <B> Flowable<List<T>> buffer(b<B> bVar) {
        return (Flowable<List<T>>) buffer(bVar, ArrayListSupplier.asCallable());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final <B> Flowable<List<T>> buffer(b<B> bVar, int i10) {
        ObjectHelper.verifyPositive(i10, "initialCapacity");
        return (Flowable<List<T>>) buffer(bVar, Functions.createArrayList(i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final <B, U extends Collection<? super T>> Flowable<U> buffer(b<B> bVar, Callable<U> callable) {
        ObjectHelper.requireNonNull(bVar, "boundaryIndicator is null");
        ObjectHelper.requireNonNull(callable, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableBufferExactBoundary(this, bVar, callable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final <TOpening, TClosing> Flowable<List<T>> buffer(Flowable<? extends TOpening> flowable, Function<? super TOpening, ? extends b<? extends TClosing>> function) {
        return (Flowable<List<T>>) buffer(flowable, function, ArrayListSupplier.asCallable());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final <TOpening, TClosing, U extends Collection<? super T>> Flowable<U> buffer(Flowable<? extends TOpening> flowable, Function<? super TOpening, ? extends b<? extends TClosing>> function, Callable<U> callable) {
        ObjectHelper.requireNonNull(flowable, "openingIndicator is null");
        ObjectHelper.requireNonNull(function, "closingIndicator is null");
        ObjectHelper.requireNonNull(callable, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableBufferBoundary(this, flowable, function, callable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final <B> Flowable<List<T>> buffer(Callable<? extends b<B>> callable) {
        return (Flowable<List<T>>) buffer(callable, ArrayListSupplier.asCallable());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final <B, U extends Collection<? super T>> Flowable<U> buffer(Callable<? extends b<B>> callable, Callable<U> callable2) {
        ObjectHelper.requireNonNull(callable, "boundaryIndicatorSupplier is null");
        ObjectHelper.requireNonNull(callable2, "bufferSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableBufferBoundarySupplier(this, callable, callable2));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> cache() {
        return cacheWithInitialCapacity(16);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> cacheWithInitialCapacity(int i10) {
        ObjectHelper.verifyPositive(i10, "initialCapacity");
        return RxJavaPlugins.onAssembly(new FlowableCache(this, i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final <U> Flowable<U> cast(Class<U> cls) {
        ObjectHelper.requireNonNull(cls, "clazz is null");
        return (Flowable<U>) map(Functions.castFunction(cls));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final <U> Single<U> collect(Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        ObjectHelper.requireNonNull(callable, "initialItemSupplier is null");
        ObjectHelper.requireNonNull(biConsumer, "collector is null");
        return RxJavaPlugins.onAssembly(new FlowableCollectSingle(this, callable, biConsumer));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final <U> Single<U> collectInto(U u2, BiConsumer<? super U, ? super T> biConsumer) {
        ObjectHelper.requireNonNull(u2, "initialItem is null");
        return collect(Functions.justCallable(u2), biConsumer);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final <R> Flowable<R> compose(FlowableTransformer<? super T, ? extends R> flowableTransformer) {
        return fromPublisher(((FlowableTransformer) ObjectHelper.requireNonNull(flowableTransformer, "composer is null")).apply(this));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> concatMap(Function<? super T, ? extends b<? extends R>> function) {
        return concatMap(function, 2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> concatMap(Function<? super T, ? extends b<? extends R>> function, int i10) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "prefetch");
        if (this instanceof ScalarCallable) {
            Object call = ((ScalarCallable) this).call();
            return call == null ? empty() : FlowableScalarXMap.scalarXMap(call, function);
        }
        return RxJavaPlugins.onAssembly(new FlowableConcatMap(this, function, i10, ErrorMode.IMMEDIATE));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Completable concatMapCompletable(Function<? super T, ? extends CompletableSource> function) {
        return concatMapCompletable(function, 2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Completable concatMapCompletable(Function<? super T, ? extends CompletableSource> function, int i10) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapCompletable(this, function, ErrorMode.IMMEDIATE, i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Completable concatMapCompletableDelayError(Function<? super T, ? extends CompletableSource> function) {
        return concatMapCompletableDelayError(function, true, 2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Completable concatMapCompletableDelayError(Function<? super T, ? extends CompletableSource> function, boolean z10) {
        return concatMapCompletableDelayError(function, z10, 2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Completable concatMapCompletableDelayError(Function<? super T, ? extends CompletableSource> function, boolean z10, int i10) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapCompletable(this, function, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> concatMapDelayError(Function<? super T, ? extends b<? extends R>> function) {
        return concatMapDelayError(function, 2, true);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> concatMapDelayError(Function<? super T, ? extends b<? extends R>> function, int i10, boolean z10) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "prefetch");
        if (!(this instanceof ScalarCallable)) {
            return RxJavaPlugins.onAssembly(new FlowableConcatMap(this, function, i10, z10 ? ErrorMode.END : ErrorMode.BOUNDARY));
        }
        Object call = ((ScalarCallable) this).call();
        return call == null ? empty() : FlowableScalarXMap.scalarXMap(call, function);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> concatMapEager(Function<? super T, ? extends b<? extends R>> function) {
        return concatMapEager(function, bufferSize(), bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> concatMapEager(Function<? super T, ? extends b<? extends R>> function, int i10, int i11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapEager(this, function, i10, i11, ErrorMode.IMMEDIATE));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> concatMapEagerDelayError(Function<? super T, ? extends b<? extends R>> function, int i10, int i11, boolean z10) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapEager(this, function, i10, i11, z10 ? ErrorMode.END : ErrorMode.BOUNDARY));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> concatMapEagerDelayError(Function<? super T, ? extends b<? extends R>> function, boolean z10) {
        return concatMapEagerDelayError(function, bufferSize(), bufferSize(), z10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <U> Flowable<U> concatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return concatMapIterable(function, 2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <U> Flowable<U> concatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function, int i10) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableFlattenIterable(this, function, i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> concatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return concatMapMaybe(function, 2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> concatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function, int i10) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapMaybe(this, function, ErrorMode.IMMEDIATE, i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> concatMapMaybeDelayError(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return concatMapMaybeDelayError(function, true, 2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> concatMapMaybeDelayError(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10) {
        return concatMapMaybeDelayError(function, z10, 2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> concatMapMaybeDelayError(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10, int i10) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapMaybe(this, function, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> concatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return concatMapSingle(function, 2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> concatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function, int i10) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapSingle(this, function, ErrorMode.IMMEDIATE, i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> concatMapSingleDelayError(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return concatMapSingleDelayError(function, true, 2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> concatMapSingleDelayError(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10) {
        return concatMapSingleDelayError(function, z10, 2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> concatMapSingleDelayError(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10, int i10) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowableConcatMapSingle(this, function, z10 ? ErrorMode.END : ErrorMode.BOUNDARY, i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> concatWith(b<? extends T> bVar) {
        ObjectHelper.requireNonNull(bVar, "other is null");
        return concat(this, bVar);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> concatWith(@NonNull CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableConcatWithCompletable(this, completableSource));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> concatWith(@NonNull MaybeSource<? extends T> maybeSource) {
        ObjectHelper.requireNonNull(maybeSource, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableConcatWithMaybe(this, maybeSource));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> concatWith(@NonNull SingleSource<? extends T> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableConcatWithSingle(this, singleSource));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final Single<Boolean> contains(Object obj) {
        ObjectHelper.requireNonNull(obj, "item is null");
        return any(Functions.equalsWith(obj));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Single<Long> count() {
        return RxJavaPlugins.onAssembly(new FlowableCountSingle(this));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<T> debounce(long j10, TimeUnit timeUnit) {
        return debounce(j10, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> debounce(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableDebounceTimed(this, j10, timeUnit, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public final <U> Flowable<T> debounce(Function<? super T, ? extends b<U>> function) {
        ObjectHelper.requireNonNull(function, "debounceIndicator is null");
        return RxJavaPlugins.onAssembly(new FlowableDebounce(this, function));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> defaultIfEmpty(T t2) {
        ObjectHelper.requireNonNull(t2, "defaultItem is null");
        return switchIfEmpty(just(t2));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> delay(long j10, TimeUnit timeUnit) {
        return delay(j10, timeUnit, Schedulers.computation(), false);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> delay(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return delay(j10, timeUnit, scheduler, false);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> delay(long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableDelay(this, Math.max(0L, j10), timeUnit, scheduler, z10));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> delay(long j10, TimeUnit timeUnit, boolean z10) {
        return delay(j10, timeUnit, Schedulers.computation(), z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <U, V> Flowable<T> delay(b<U> bVar, Function<? super T, ? extends b<V>> function) {
        return delaySubscription(bVar).delay(function);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <U> Flowable<T> delay(Function<? super T, ? extends b<U>> function) {
        ObjectHelper.requireNonNull(function, "itemDelayIndicator is null");
        return (Flowable<T>) flatMap(FlowableInternalHelper.itemDelay(function));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> delaySubscription(long j10, TimeUnit timeUnit) {
        return delaySubscription(j10, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> delaySubscription(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return delaySubscription(timer(j10, timeUnit, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <U> Flowable<T> delaySubscription(b<U> bVar) {
        ObjectHelper.requireNonNull(bVar, "subscriptionIndicator is null");
        return RxJavaPlugins.onAssembly(new FlowableDelaySubscriptionOther(this, bVar));
    }

    @Deprecated
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final <T2> Flowable<T2> dematerialize() {
        return RxJavaPlugins.onAssembly(new FlowableDematerialize(this, Functions.identity()));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @Experimental
    @NonNull
    public final <R> Flowable<R> dematerialize(Function<? super T, Notification<R>> function) {
        ObjectHelper.requireNonNull(function, "selector is null");
        return RxJavaPlugins.onAssembly(new FlowableDematerialize(this, function));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> distinct() {
        return distinct(Functions.identity(), Functions.createHashSet());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <K> Flowable<T> distinct(Function<? super T, K> function) {
        return distinct(function, Functions.createHashSet());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <K> Flowable<T> distinct(Function<? super T, K> function, Callable<? extends Collection<? super K>> callable) {
        ObjectHelper.requireNonNull(function, "keySelector is null");
        ObjectHelper.requireNonNull(callable, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableDistinct(this, function, callable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> distinctUntilChanged() {
        return distinctUntilChanged(Functions.identity());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> distinctUntilChanged(BiPredicate<? super T, ? super T> biPredicate) {
        ObjectHelper.requireNonNull(biPredicate, "comparer is null");
        return RxJavaPlugins.onAssembly(new FlowableDistinctUntilChanged(this, Functions.identity(), biPredicate));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <K> Flowable<T> distinctUntilChanged(Function<? super T, K> function) {
        ObjectHelper.requireNonNull(function, "keySelector is null");
        return RxJavaPlugins.onAssembly(new FlowableDistinctUntilChanged(this, function, ObjectHelper.equalsPredicate()));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> doAfterNext(Consumer<? super T> consumer) {
        ObjectHelper.requireNonNull(consumer, "onAfterNext is null");
        return RxJavaPlugins.onAssembly(new FlowableDoAfterNext(this, consumer));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> doAfterTerminate(Action action) {
        return doOnEach(Functions.emptyConsumer(), Functions.emptyConsumer(), Functions.EMPTY_ACTION, action);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> doFinally(Action action) {
        ObjectHelper.requireNonNull(action, "onFinally is null");
        return RxJavaPlugins.onAssembly(new FlowableDoFinally(this, action));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> doOnCancel(Action action) {
        return doOnLifecycle(Functions.emptyConsumer(), Functions.EMPTY_LONG_CONSUMER, action);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> doOnComplete(Action action) {
        return doOnEach(Functions.emptyConsumer(), Functions.emptyConsumer(), action, Functions.EMPTY_ACTION);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> doOnEach(c<? super T> cVar) {
        ObjectHelper.requireNonNull(cVar, "subscriber is null");
        return doOnEach(FlowableInternalHelper.subscriberOnNext(cVar), FlowableInternalHelper.subscriberOnError(cVar), FlowableInternalHelper.subscriberOnComplete(cVar), Functions.EMPTY_ACTION);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> doOnEach(Consumer<? super Notification<T>> consumer) {
        ObjectHelper.requireNonNull(consumer, "onNotification is null");
        return doOnEach(Functions.notificationOnNext(consumer), Functions.notificationOnError(consumer), Functions.notificationOnComplete(consumer), Functions.EMPTY_ACTION);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> doOnError(Consumer<? super Throwable> consumer) {
        Consumer<? super T> emptyConsumer = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return doOnEach(emptyConsumer, consumer, action, action);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> doOnLifecycle(Consumer<? super d> consumer, LongConsumer longConsumer, Action action) {
        ObjectHelper.requireNonNull(consumer, "onSubscribe is null");
        ObjectHelper.requireNonNull(longConsumer, "onRequest is null");
        ObjectHelper.requireNonNull(action, "onCancel is null");
        return RxJavaPlugins.onAssembly(new FlowableDoOnLifecycle(this, consumer, longConsumer, action));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> doOnNext(Consumer<? super T> consumer) {
        Consumer<? super Throwable> emptyConsumer = Functions.emptyConsumer();
        Action action = Functions.EMPTY_ACTION;
        return doOnEach(consumer, emptyConsumer, action, action);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> doOnRequest(LongConsumer longConsumer) {
        return doOnLifecycle(Functions.emptyConsumer(), longConsumer, Functions.EMPTY_ACTION);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> doOnSubscribe(Consumer<? super d> consumer) {
        return doOnLifecycle(consumer, Functions.EMPTY_LONG_CONSUMER, Functions.EMPTY_ACTION);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> doOnTerminate(Action action) {
        return doOnEach(Functions.emptyConsumer(), Functions.actionConsumer(action), action, Functions.EMPTY_ACTION);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Maybe<T> elementAt(long j10) {
        if (j10 >= 0) {
            return RxJavaPlugins.onAssembly(new FlowableElementAtMaybe(this, j10));
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.b.h("index >= 0 required but it was ", j10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final Single<T> elementAt(long j10, T t2) {
        if (j10 >= 0) {
            ObjectHelper.requireNonNull(t2, "defaultItem is null");
            return RxJavaPlugins.onAssembly(new FlowableElementAtSingle(this, j10, t2));
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.b.h("index >= 0 required but it was ", j10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Single<T> elementAtOrError(long j10) {
        if (j10 >= 0) {
            return RxJavaPlugins.onAssembly(new FlowableElementAtSingle(this, j10, null));
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.b.h("index >= 0 required but it was ", j10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> filter(Predicate<? super T> predicate) {
        ObjectHelper.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableFilter(this, predicate));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    public final Single<T> first(T t2) {
        return elementAt(0L, t2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    public final Maybe<T> firstElement() {
        return elementAt(0L);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    public final Single<T> firstOrError() {
        return elementAtOrError(0L);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> flatMap(Function<? super T, ? extends b<? extends R>> function) {
        return flatMap((Function) function, false, bufferSize(), bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> flatMap(Function<? super T, ? extends b<? extends R>> function, int i10) {
        return flatMap((Function) function, false, i10, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <U, R> Flowable<R> flatMap(Function<? super T, ? extends b<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return flatMap(function, biFunction, false, bufferSize(), bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <U, R> Flowable<R> flatMap(Function<? super T, ? extends b<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, int i10) {
        return flatMap(function, biFunction, false, i10, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <U, R> Flowable<R> flatMap(Function<? super T, ? extends b<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z10) {
        return flatMap(function, biFunction, z10, bufferSize(), bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <U, R> Flowable<R> flatMap(Function<? super T, ? extends b<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z10, int i10) {
        return flatMap(function, biFunction, z10, i10, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <U, R> Flowable<R> flatMap(Function<? super T, ? extends b<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z10, int i10, int i11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.requireNonNull(biFunction, "combiner is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        return flatMap(FlowableInternalHelper.flatMapWithCombiner(function, biFunction), z10, i10, i11);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> flatMap(Function<? super T, ? extends b<? extends R>> function, Function<? super Throwable, ? extends b<? extends R>> function2, Callable<? extends b<? extends R>> callable) {
        ObjectHelper.requireNonNull(function, "onNextMapper is null");
        ObjectHelper.requireNonNull(function2, "onErrorMapper is null");
        ObjectHelper.requireNonNull(callable, "onCompleteSupplier is null");
        return merge(new FlowableMapNotification(this, function, function2, callable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> flatMap(Function<? super T, ? extends b<? extends R>> function, Function<Throwable, ? extends b<? extends R>> function2, Callable<? extends b<? extends R>> callable, int i10) {
        ObjectHelper.requireNonNull(function, "onNextMapper is null");
        ObjectHelper.requireNonNull(function2, "onErrorMapper is null");
        ObjectHelper.requireNonNull(callable, "onCompleteSupplier is null");
        return merge(new FlowableMapNotification(this, function, function2, callable), i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> flatMap(Function<? super T, ? extends b<? extends R>> function, boolean z10) {
        return flatMap(function, z10, bufferSize(), bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> flatMap(Function<? super T, ? extends b<? extends R>> function, boolean z10, int i10) {
        return flatMap(function, z10, i10, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> flatMap(Function<? super T, ? extends b<? extends R>> function, boolean z10, int i10, int i11) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        ObjectHelper.verifyPositive(i11, "bufferSize");
        if (this instanceof ScalarCallable) {
            Object call = ((ScalarCallable) this).call();
            return call == null ? empty() : FlowableScalarXMap.scalarXMap(call, function);
        }
        return RxJavaPlugins.onAssembly(new FlowableFlatMap(this, function, z10, i10, i11));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Completable flatMapCompletable(Function<? super T, ? extends CompletableSource> function) {
        return flatMapCompletable(function, false, IntCompanionObject.MAX_VALUE);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final Completable flatMapCompletable(Function<? super T, ? extends CompletableSource> function, boolean z10, int i10) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new FlowableFlatMapCompletableCompletable(this, function, z10, i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <U> Flowable<U> flatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return flatMapIterable(function, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <U> Flowable<U> flatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function, int i10) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableFlattenIterable(this, function, i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <U, V> Flowable<V> flatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.requireNonNull(biFunction, "resultSelector is null");
        return (Flowable<V>) flatMap(FlowableInternalHelper.flatMapIntoIterable(function), biFunction, false, bufferSize(), bufferSize());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <U, V> Flowable<V> flatMapIterable(Function<? super T, ? extends Iterable<? extends U>> function, BiFunction<? super T, ? super U, ? extends V> biFunction, int i10) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.requireNonNull(biFunction, "resultSelector is null");
        return (Flowable<V>) flatMap(FlowableInternalHelper.flatMapIntoIterable(function), biFunction, false, bufferSize(), i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final <R> Flowable<R> flatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function) {
        return flatMapMaybe(function, false, IntCompanionObject.MAX_VALUE);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> flatMapMaybe(Function<? super T, ? extends MaybeSource<? extends R>> function, boolean z10, int i10) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new FlowableFlatMapMaybe(this, function, z10, i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final <R> Flowable<R> flatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function) {
        return flatMapSingle(function, false, IntCompanionObject.MAX_VALUE);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> flatMapSingle(Function<? super T, ? extends SingleSource<? extends R>> function, boolean z10, int i10) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "maxConcurrency");
        return RxJavaPlugins.onAssembly(new FlowableFlatMapSingle(this, function, z10, i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.NONE)
    @CheckReturnValue
    public final Disposable forEach(Consumer<? super T> consumer) {
        return subscribe(consumer);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.NONE)
    @CheckReturnValue
    public final Disposable forEachWhile(Predicate<? super T> predicate) {
        return forEachWhile(predicate, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.NONE)
    @CheckReturnValue
    public final Disposable forEachWhile(Predicate<? super T> predicate, Consumer<? super Throwable> consumer) {
        return forEachWhile(predicate, consumer, Functions.EMPTY_ACTION);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.NONE)
    @CheckReturnValue
    @NonNull
    public final Disposable forEachWhile(Predicate<? super T> predicate, Consumer<? super Throwable> consumer, Action action) {
        ObjectHelper.requireNonNull(predicate, "onNext is null");
        ObjectHelper.requireNonNull(consumer, "onError is null");
        ObjectHelper.requireNonNull(action, "onComplete is null");
        ForEachWhileSubscriber forEachWhileSubscriber = new ForEachWhileSubscriber(predicate, consumer, action);
        subscribe((FlowableSubscriber) forEachWhileSubscriber);
        return forEachWhileSubscriber;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <K> Flowable<GroupedFlowable<K, T>> groupBy(Function<? super T, ? extends K> function) {
        return (Flowable<GroupedFlowable<K, T>>) groupBy(function, Functions.identity(), false, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <K, V> Flowable<GroupedFlowable<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return groupBy(function, function2, false, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <K, V> Flowable<GroupedFlowable<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, boolean z10) {
        return groupBy(function, function2, z10, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <K, V> Flowable<GroupedFlowable<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, boolean z10, int i10) {
        ObjectHelper.requireNonNull(function, "keySelector is null");
        ObjectHelper.requireNonNull(function2, "valueSelector is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableGroupBy(this, function, function2, i10, z10, null));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <K, V> Flowable<GroupedFlowable<K, V>> groupBy(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, boolean z10, int i10, Function<? super Consumer<Object>, ? extends Map<K, Object>> function3) {
        ObjectHelper.requireNonNull(function, "keySelector is null");
        ObjectHelper.requireNonNull(function2, "valueSelector is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        ObjectHelper.requireNonNull(function3, "evictingMapFactory is null");
        return RxJavaPlugins.onAssembly(new FlowableGroupBy(this, function, function2, i10, z10, function3));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <K> Flowable<GroupedFlowable<K, T>> groupBy(Function<? super T, ? extends K> function, boolean z10) {
        return (Flowable<GroupedFlowable<K, T>>) groupBy(function, Functions.identity(), z10, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public final <TRight, TLeftEnd, TRightEnd, R> Flowable<R> groupJoin(b<? extends TRight> bVar, Function<? super T, ? extends b<TLeftEnd>> function, Function<? super TRight, ? extends b<TRightEnd>> function2, BiFunction<? super T, ? super Flowable<TRight>, ? extends R> biFunction) {
        ObjectHelper.requireNonNull(bVar, "other is null");
        ObjectHelper.requireNonNull(function, "leftEnd is null");
        ObjectHelper.requireNonNull(function2, "rightEnd is null");
        ObjectHelper.requireNonNull(biFunction, "resultSelector is null");
        return RxJavaPlugins.onAssembly(new FlowableGroupJoin(this, bVar, function, function2, biFunction));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> hide() {
        return RxJavaPlugins.onAssembly(new FlowableHide(this));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Completable ignoreElements() {
        return RxJavaPlugins.onAssembly(new FlowableIgnoreElementsCompletable(this));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Single<Boolean> isEmpty() {
        return all(Functions.alwaysFalse());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public final <TRight, TLeftEnd, TRightEnd, R> Flowable<R> join(b<? extends TRight> bVar, Function<? super T, ? extends b<TLeftEnd>> function, Function<? super TRight, ? extends b<TRightEnd>> function2, BiFunction<? super T, ? super TRight, ? extends R> biFunction) {
        ObjectHelper.requireNonNull(bVar, "other is null");
        ObjectHelper.requireNonNull(function, "leftEnd is null");
        ObjectHelper.requireNonNull(function2, "rightEnd is null");
        ObjectHelper.requireNonNull(biFunction, "resultSelector is null");
        return RxJavaPlugins.onAssembly(new FlowableJoin(this, bVar, function, function2, biFunction));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final Single<T> last(T t2) {
        ObjectHelper.requireNonNull(t2, "defaultItem");
        return RxJavaPlugins.onAssembly(new FlowableLastSingle(this, t2));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Maybe<T> lastElement() {
        return RxJavaPlugins.onAssembly(new FlowableLastMaybe(this));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Single<T> lastOrError() {
        return RxJavaPlugins.onAssembly(new FlowableLastSingle(this, null));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> lift(FlowableOperator<? extends R, ? super T> flowableOperator) {
        ObjectHelper.requireNonNull(flowableOperator, "lifter is null");
        return RxJavaPlugins.onAssembly(new FlowableLift(this, flowableOperator));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    public final Flowable<T> limit(long j10) {
        if (j10 >= 0) {
            return RxJavaPlugins.onAssembly(new FlowableLimit(this, j10));
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("count >= 0 required but it was ", j10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> map(Function<? super T, ? extends R> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableMap(this, function));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<Notification<T>> materialize() {
        return RxJavaPlugins.onAssembly(new FlowableMaterialize(this));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> mergeWith(b<? extends T> bVar) {
        ObjectHelper.requireNonNull(bVar, "other is null");
        return merge(this, bVar);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> mergeWith(@NonNull CompletableSource completableSource) {
        ObjectHelper.requireNonNull(completableSource, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableMergeWithCompletable(this, completableSource));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> mergeWith(@NonNull MaybeSource<? extends T> maybeSource) {
        ObjectHelper.requireNonNull(maybeSource, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableMergeWithMaybe(this, maybeSource));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> mergeWith(@NonNull SingleSource<? extends T> singleSource) {
        ObjectHelper.requireNonNull(singleSource, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableMergeWithSingle(this, singleSource));
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> observeOn(Scheduler scheduler) {
        return observeOn(scheduler, false, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> observeOn(Scheduler scheduler, boolean z10) {
        return observeOn(scheduler, z10, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> observeOn(Scheduler scheduler, boolean z10, int i10) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableObserveOn(this, scheduler, z10, i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final <U> Flowable<U> ofType(Class<U> cls) {
        ObjectHelper.requireNonNull(cls, "clazz is null");
        return filter(Functions.isInstanceOf(cls)).cast(cls);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Flowable<T> onBackpressureBuffer() {
        return onBackpressureBuffer(bufferSize(), false, true);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<T> onBackpressureBuffer(int i10) {
        return onBackpressureBuffer(i10, false, false);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<T> onBackpressureBuffer(int i10, Action action) {
        return onBackpressureBuffer(i10, false, false, action);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<T> onBackpressureBuffer(int i10, boolean z10) {
        return onBackpressureBuffer(i10, z10, false);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    public final Flowable<T> onBackpressureBuffer(int i10, boolean z10, boolean z11) {
        ObjectHelper.verifyPositive(i10, "capacity");
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureBuffer(this, i10, z11, z10, Functions.EMPTY_ACTION));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> onBackpressureBuffer(int i10, boolean z10, boolean z11, Action action) {
        ObjectHelper.requireNonNull(action, "onOverflow is null");
        ObjectHelper.verifyPositive(i10, "capacity");
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureBuffer(this, i10, z11, z10, action));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> onBackpressureBuffer(long j10, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy) {
        ObjectHelper.requireNonNull(backpressureOverflowStrategy, "overflowStrategy is null");
        ObjectHelper.verifyPositive(j10, "capacity");
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureBufferStrategy(this, j10, action, backpressureOverflowStrategy));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Flowable<T> onBackpressureBuffer(boolean z10) {
        return onBackpressureBuffer(bufferSize(), z10, true);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Flowable<T> onBackpressureDrop() {
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureDrop(this));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> onBackpressureDrop(Consumer<? super T> consumer) {
        ObjectHelper.requireNonNull(consumer, "onDrop is null");
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureDrop(this, consumer));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Flowable<T> onBackpressureLatest() {
        return RxJavaPlugins.onAssembly(new FlowableOnBackpressureLatest(this));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> onErrorResumeNext(b<? extends T> bVar) {
        ObjectHelper.requireNonNull(bVar, "next is null");
        return onErrorResumeNext(Functions.justFunction(bVar));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> onErrorResumeNext(Function<? super Throwable, ? extends b<? extends T>> function) {
        ObjectHelper.requireNonNull(function, "resumeFunction is null");
        return RxJavaPlugins.onAssembly(new FlowableOnErrorNext(this, function, false));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> onErrorReturn(Function<? super Throwable, ? extends T> function) {
        ObjectHelper.requireNonNull(function, "valueSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableOnErrorReturn(this, function));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> onErrorReturnItem(T t2) {
        ObjectHelper.requireNonNull(t2, "item is null");
        return onErrorReturn(Functions.justFunction(t2));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> onExceptionResumeNext(b<? extends T> bVar) {
        ObjectHelper.requireNonNull(bVar, "next is null");
        return RxJavaPlugins.onAssembly(new FlowableOnErrorNext(this, Functions.justFunction(bVar), true));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> onTerminateDetach() {
        return RxJavaPlugins.onAssembly(new FlowableDetach(this));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final ParallelFlowable<T> parallel() {
        return ParallelFlowable.from(this);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final ParallelFlowable<T> parallel(int i10) {
        ObjectHelper.verifyPositive(i10, "parallelism");
        return ParallelFlowable.from(this, i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final ParallelFlowable<T> parallel(int i10, int i11) {
        ObjectHelper.verifyPositive(i10, "parallelism");
        ObjectHelper.verifyPositive(i11, "prefetch");
        return ParallelFlowable.from(this, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> publish(Function<? super Flowable<T>, ? extends b<R>> function) {
        return publish(function, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> publish(Function<? super Flowable<T>, ? extends b<? extends R>> function, int i10) {
        ObjectHelper.requireNonNull(function, "selector is null");
        ObjectHelper.verifyPositive(i10, "prefetch");
        return RxJavaPlugins.onAssembly(new FlowablePublishMulticast(this, function, i10, false));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final ConnectableFlowable<T> publish() {
        return publish(bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final ConnectableFlowable<T> publish(int i10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return FlowablePublish.create(this, i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> rebatchRequests(int i10) {
        return observeOn(ImmediateThinScheduler.INSTANCE, true, i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final Maybe<T> reduce(BiFunction<T, T, T> biFunction) {
        ObjectHelper.requireNonNull(biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new FlowableReduceMaybe(this, biFunction));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final <R> Single<R> reduce(R r10, BiFunction<R, ? super T, R> biFunction) {
        ObjectHelper.requireNonNull(r10, "seed is null");
        ObjectHelper.requireNonNull(biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new FlowableReduceSeedSingle(this, r10, biFunction));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final <R> Single<R> reduceWith(Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        ObjectHelper.requireNonNull(callable, "seedSupplier is null");
        ObjectHelper.requireNonNull(biFunction, "reducer is null");
        return RxJavaPlugins.onAssembly(new FlowableReduceWithSingle(this, callable, biFunction));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> repeat() {
        return repeat(Long.MAX_VALUE);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> repeat(long j10) {
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? empty() : RxJavaPlugins.onAssembly(new FlowableRepeat(this, j10));
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("times >= 0 required but it was ", j10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> repeatUntil(BooleanSupplier booleanSupplier) {
        ObjectHelper.requireNonNull(booleanSupplier, "stop is null");
        return RxJavaPlugins.onAssembly(new FlowableRepeatUntil(this, booleanSupplier));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> repeatWhen(Function<? super Flowable<Object>, ? extends b<?>> function) {
        ObjectHelper.requireNonNull(function, "handler is null");
        return RxJavaPlugins.onAssembly(new FlowableRepeatWhen(this, function));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> replay(Function<? super Flowable<T>, ? extends b<R>> function) {
        ObjectHelper.requireNonNull(function, "selector is null");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replayCallable(this), function);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> replay(Function<? super Flowable<T>, ? extends b<R>> function, int i10) {
        ObjectHelper.requireNonNull(function, "selector is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replayCallable(this, i10), function);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> replay(Function<? super Flowable<T>, ? extends b<R>> function, int i10, long j10, TimeUnit timeUnit) {
        return replay(function, i10, j10, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> replay(Function<? super Flowable<T>, ? extends b<R>> function, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(function, "selector is null");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replayCallable(this, i10, j10, timeUnit, scheduler), function);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> replay(Function<? super Flowable<T>, ? extends b<R>> function, int i10, Scheduler scheduler) {
        ObjectHelper.requireNonNull(function, "selector is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replayCallable(this, i10), FlowableInternalHelper.replayFunction(function, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> replay(Function<? super Flowable<T>, ? extends b<R>> function, long j10, TimeUnit timeUnit) {
        return replay(function, j10, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> replay(Function<? super Flowable<T>, ? extends b<R>> function, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(function, "selector is null");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replayCallable(this, j10, timeUnit, scheduler), function);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> replay(Function<? super Flowable<T>, ? extends b<R>> function, Scheduler scheduler) {
        ObjectHelper.requireNonNull(function, "selector is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return FlowableReplay.multicastSelector(FlowableInternalHelper.replayCallable(this), FlowableInternalHelper.replayFunction(function, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final ConnectableFlowable<T> replay() {
        return FlowableReplay.createFrom(this);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final ConnectableFlowable<T> replay(int i10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return FlowableReplay.create(this, i10);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final ConnectableFlowable<T> replay(int i10, long j10, TimeUnit timeUnit) {
        return replay(i10, j10, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final ConnectableFlowable<T> replay(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return FlowableReplay.create(this, j10, timeUnit, scheduler, i10);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final ConnectableFlowable<T> replay(int i10, Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return FlowableReplay.observeOn(replay(i10), scheduler);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final ConnectableFlowable<T> replay(long j10, TimeUnit timeUnit) {
        return replay(j10, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final ConnectableFlowable<T> replay(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return FlowableReplay.create(this, j10, timeUnit, scheduler);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final ConnectableFlowable<T> replay(Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return FlowableReplay.observeOn(replay(), scheduler);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> retry() {
        return retry(Long.MAX_VALUE, Functions.alwaysTrue());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> retry(long j10) {
        return retry(j10, Functions.alwaysTrue());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> retry(long j10, Predicate<? super Throwable> predicate) {
        if (j10 >= 0) {
            ObjectHelper.requireNonNull(predicate, "predicate is null");
            return RxJavaPlugins.onAssembly(new FlowableRetryPredicate(this, j10, predicate));
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("times >= 0 required but it was ", j10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> retry(BiPredicate<? super Integer, ? super Throwable> biPredicate) {
        ObjectHelper.requireNonNull(biPredicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableRetryBiPredicate(this, biPredicate));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> retry(Predicate<? super Throwable> predicate) {
        return retry(Long.MAX_VALUE, predicate);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> retryUntil(BooleanSupplier booleanSupplier) {
        ObjectHelper.requireNonNull(booleanSupplier, "stop is null");
        return retry(Long.MAX_VALUE, Functions.predicateReverseFor(booleanSupplier));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> retryWhen(Function<? super Flowable<Throwable>, ? extends b<?>> function) {
        ObjectHelper.requireNonNull(function, "handler is null");
        return RxJavaPlugins.onAssembly(new FlowableRetryWhen(this, function));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    public final void safeSubscribe(c<? super T> cVar) {
        ObjectHelper.requireNonNull(cVar, "s is null");
        if (cVar instanceof SafeSubscriber) {
            subscribe((FlowableSubscriber) ((SafeSubscriber) cVar));
        } else {
            subscribe((FlowableSubscriber) new SafeSubscriber(cVar));
        }
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<T> sample(long j10, TimeUnit timeUnit) {
        return sample(j10, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> sample(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableSampleTimed(this, j10, timeUnit, scheduler, false));
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> sample(long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableSampleTimed(this, j10, timeUnit, scheduler, z10));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<T> sample(long j10, TimeUnit timeUnit, boolean z10) {
        return sample(j10, timeUnit, Schedulers.computation(), z10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public final <U> Flowable<T> sample(b<U> bVar) {
        ObjectHelper.requireNonNull(bVar, "sampler is null");
        return RxJavaPlugins.onAssembly(new FlowableSamplePublisher(this, bVar, false));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public final <U> Flowable<T> sample(b<U> bVar, boolean z10) {
        ObjectHelper.requireNonNull(bVar, "sampler is null");
        return RxJavaPlugins.onAssembly(new FlowableSamplePublisher(this, bVar, z10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> scan(BiFunction<T, T, T> biFunction) {
        ObjectHelper.requireNonNull(biFunction, "accumulator is null");
        return RxJavaPlugins.onAssembly(new FlowableScan(this, biFunction));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> scan(R r10, BiFunction<R, ? super T, R> biFunction) {
        ObjectHelper.requireNonNull(r10, "initialValue is null");
        return scanWith(Functions.justCallable(r10), biFunction);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> scanWith(Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        ObjectHelper.requireNonNull(callable, "seedSupplier is null");
        ObjectHelper.requireNonNull(biFunction, "accumulator is null");
        return RxJavaPlugins.onAssembly(new FlowableScanSeed(this, callable, biFunction));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> serialize() {
        return RxJavaPlugins.onAssembly(new FlowableSerialized(this));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> share() {
        return publish().refCount();
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final Single<T> single(T t2) {
        ObjectHelper.requireNonNull(t2, "defaultItem is null");
        return RxJavaPlugins.onAssembly(new FlowableSingleSingle(this, t2));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Maybe<T> singleElement() {
        return RxJavaPlugins.onAssembly(new FlowableSingleMaybe(this));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Single<T> singleOrError() {
        return RxJavaPlugins.onAssembly(new FlowableSingleSingle(this, null));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> skip(long j10) {
        return j10 <= 0 ? RxJavaPlugins.onAssembly(this) : RxJavaPlugins.onAssembly(new FlowableSkip(this, j10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> skip(long j10, TimeUnit timeUnit) {
        return skipUntil(timer(j10, timeUnit));
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> skip(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return skipUntil(timer(j10, timeUnit, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> skipLast(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? RxJavaPlugins.onAssembly(this) : RxJavaPlugins.onAssembly(new FlowableSkipLast(this, i10));
        }
        throw new IndexOutOfBoundsException(a.j("count >= 0 required but it was ", i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Flowable<T> skipLast(long j10, TimeUnit timeUnit) {
        return skipLast(j10, timeUnit, Schedulers.computation(), false, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Flowable<T> skipLast(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return skipLast(j10, timeUnit, scheduler, false, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Flowable<T> skipLast(long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        return skipLast(j10, timeUnit, scheduler, z10, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> skipLast(long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10, int i10) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableSkipLastTimed(this, j10, timeUnit, scheduler, i10 << 1, z10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Flowable<T> skipLast(long j10, TimeUnit timeUnit, boolean z10) {
        return skipLast(j10, timeUnit, Schedulers.computation(), z10, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <U> Flowable<T> skipUntil(b<U> bVar) {
        ObjectHelper.requireNonNull(bVar, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableSkipUntil(this, bVar));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> skipWhile(Predicate<? super T> predicate) {
        ObjectHelper.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableSkipWhile(this, predicate));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> sorted() {
        return toList().toFlowable().map(Functions.listSorter(Functions.naturalComparator())).flatMapIterable(Functions.identity());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> sorted(Comparator<? super T> comparator) {
        ObjectHelper.requireNonNull(comparator, "sortFunction");
        return toList().toFlowable().map(Functions.listSorter(comparator)).flatMapIterable(Functions.identity());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> startWith(b<? extends T> bVar) {
        ObjectHelper.requireNonNull(bVar, "other is null");
        return concatArray(bVar, this);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> startWith(Iterable<? extends T> iterable) {
        return concatArray(fromIterable(iterable), this);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> startWith(T t2) {
        ObjectHelper.requireNonNull(t2, "value is null");
        return concatArray(just(t2), this);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> startWithArray(T... tArr) {
        Flowable fromArray = fromArray(tArr);
        return fromArray == empty() ? RxJavaPlugins.onAssembly(this) : concatArray(fromArray, this);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    public final Disposable subscribe() {
        return subscribe(Functions.emptyConsumer(), Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION, FlowableInternalHelper.RequestMax.INSTANCE);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Disposable subscribe(Consumer<? super T> consumer) {
        return subscribe(consumer, Functions.ON_ERROR_MISSING, Functions.EMPTY_ACTION, FlowableInternalHelper.RequestMax.INSTANCE);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2) {
        return subscribe(consumer, consumer2, Functions.EMPTY_ACTION, FlowableInternalHelper.RequestMax.INSTANCE);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action) {
        return subscribe(consumer, consumer2, action, FlowableInternalHelper.RequestMax.INSTANCE);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    @NonNull
    public final Disposable subscribe(Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Consumer<? super d> consumer3) {
        ObjectHelper.requireNonNull(consumer, "onNext is null");
        ObjectHelper.requireNonNull(consumer2, "onError is null");
        ObjectHelper.requireNonNull(action, "onComplete is null");
        ObjectHelper.requireNonNull(consumer3, "onSubscribe is null");
        LambdaSubscriber lambdaSubscriber = new LambdaSubscriber(consumer, consumer2, action, consumer3);
        subscribe((FlowableSubscriber) lambdaSubscriber);
        return lambdaSubscriber;
    }

    @Override // df.b
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    public final void subscribe(c<? super T> cVar) {
        if (cVar instanceof FlowableSubscriber) {
            subscribe((FlowableSubscriber) ((FlowableSubscriber) cVar));
            return;
        }
        ObjectHelper.requireNonNull(cVar, "s is null");
        subscribe((FlowableSubscriber) new StrictSubscriber(cVar));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    public final void subscribe(FlowableSubscriber<? super T> flowableSubscriber) {
        ObjectHelper.requireNonNull(flowableSubscriber, "s is null");
        try {
            c<? super T> onSubscribe = RxJavaPlugins.onSubscribe(this, flowableSubscriber);
            ObjectHelper.requireNonNull(onSubscribe, "The RxJavaPlugins.onSubscribe hook returned a null FlowableSubscriber. Please check the handler provided to RxJavaPlugins.setOnFlowableSubscribe for invalid null returns. Further reading: https://github.com/ReactiveX/RxJava/wiki/Plugins");
            subscribeActual(onSubscribe);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            RxJavaPlugins.onError(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void subscribeActual(c<? super T> cVar);

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> subscribeOn(@NonNull Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return subscribeOn(scheduler, !(this instanceof FlowableCreate));
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> subscribeOn(@NonNull Scheduler scheduler, boolean z10) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableSubscribeOn(this, scheduler, z10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    public final <E extends c<? super T>> E subscribeWith(E e10) {
        subscribe(e10);
        return e10;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> switchIfEmpty(b<? extends T> bVar) {
        ObjectHelper.requireNonNull(bVar, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchIfEmpty(this, bVar));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> switchMap(Function<? super T, ? extends b<? extends R>> function) {
        return switchMap(function, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <R> Flowable<R> switchMap(Function<? super T, ? extends b<? extends R>> function, int i10) {
        return switchMap0(function, i10, false);
    }

    public <R> Flowable<R> switchMap0(Function<? super T, ? extends b<? extends R>> function, int i10, boolean z10) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        if (this instanceof ScalarCallable) {
            Object call = ((ScalarCallable) this).call();
            return call == null ? empty() : FlowableScalarXMap.scalarXMap(call, function);
        }
        return RxJavaPlugins.onAssembly(new FlowableSwitchMap(this, function, i10, z10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final Completable switchMapCompletable(@NonNull Function<? super T, ? extends CompletableSource> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapCompletable(this, function, false));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final Completable switchMapCompletableDelayError(@NonNull Function<? super T, ? extends CompletableSource> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapCompletable(this, function, true));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    public final <R> Flowable<R> switchMapDelayError(Function<? super T, ? extends b<? extends R>> function) {
        return switchMapDelayError(function, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    public final <R> Flowable<R> switchMapDelayError(Function<? super T, ? extends b<? extends R>> function, int i10) {
        return switchMap0(function, i10, true);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> switchMapMaybe(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapMaybe(this, function, false));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> switchMapMaybeDelayError(@NonNull Function<? super T, ? extends MaybeSource<? extends R>> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapMaybe(this, function, true));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> switchMapSingle(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapSingle(this, function, false));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> switchMapSingleDelayError(@NonNull Function<? super T, ? extends SingleSource<? extends R>> function) {
        ObjectHelper.requireNonNull(function, "mapper is null");
        return RxJavaPlugins.onAssembly(new FlowableSwitchMapSingle(this, function, true));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    public final Flowable<T> take(long j10) {
        if (j10 >= 0) {
            return RxJavaPlugins.onAssembly(new FlowableTake(this, j10));
        }
        throw new IllegalArgumentException(android.support.v4.media.b.h("count >= 0 required but it was ", j10));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> take(long j10, TimeUnit timeUnit) {
        return takeUntil(timer(j10, timeUnit));
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> take(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return takeUntil(timer(j10, timeUnit, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> takeLast(int i10) {
        if (i10 >= 0) {
            return i10 == 0 ? RxJavaPlugins.onAssembly(new FlowableIgnoreElements(this)) : i10 == 1 ? RxJavaPlugins.onAssembly(new FlowableTakeLastOne(this)) : RxJavaPlugins.onAssembly(new FlowableTakeLast(this, i10));
        }
        throw new IndexOutOfBoundsException(a.j("count >= 0 required but it was ", i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> takeLast(long j10, long j11, TimeUnit timeUnit) {
        return takeLast(j10, j11, timeUnit, Schedulers.computation(), false, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> takeLast(long j10, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return takeLast(j10, j11, timeUnit, scheduler, false, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> takeLast(long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, boolean z10, int i10) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        if (j10 >= 0) {
            return RxJavaPlugins.onAssembly(new FlowableTakeLastTimed(this, j10, j11, timeUnit, scheduler, i10, z10));
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.b.h("count >= 0 required but it was ", j10));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> takeLast(long j10, TimeUnit timeUnit) {
        return takeLast(j10, timeUnit, Schedulers.computation(), false, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> takeLast(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return takeLast(j10, timeUnit, scheduler, false, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> takeLast(long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        return takeLast(j10, timeUnit, scheduler, z10, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> takeLast(long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10, int i10) {
        return takeLast(Long.MAX_VALUE, j10, timeUnit, scheduler, z10, i10);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<T> takeLast(long j10, TimeUnit timeUnit, boolean z10) {
        return takeLast(j10, timeUnit, Schedulers.computation(), z10, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final <U> Flowable<T> takeUntil(b<U> bVar) {
        ObjectHelper.requireNonNull(bVar, "other is null");
        return RxJavaPlugins.onAssembly(new FlowableTakeUntil(this, bVar));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> takeUntil(Predicate<? super T> predicate) {
        ObjectHelper.requireNonNull(predicate, "stopPredicate is null");
        return RxJavaPlugins.onAssembly(new FlowableTakeUntilPredicate(this, predicate));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> takeWhile(Predicate<? super T> predicate) {
        ObjectHelper.requireNonNull(predicate, "predicate is null");
        return RxJavaPlugins.onAssembly(new FlowableTakeWhile(this, predicate));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final TestSubscriber<T> test() {
        TestSubscriber<T> testSubscriber = new TestSubscriber<>();
        subscribe((FlowableSubscriber) testSubscriber);
        return testSubscriber;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final TestSubscriber<T> test(long j10) {
        TestSubscriber<T> testSubscriber = new TestSubscriber<>(j10);
        subscribe((FlowableSubscriber) testSubscriber);
        return testSubscriber;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final TestSubscriber<T> test(long j10, boolean z10) {
        TestSubscriber<T> testSubscriber = new TestSubscriber<>(j10);
        if (z10) {
            testSubscriber.cancel();
        }
        subscribe((FlowableSubscriber) testSubscriber);
        return testSubscriber;
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<T> throttleFirst(long j10, TimeUnit timeUnit) {
        return throttleFirst(j10, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> throttleFirst(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableThrottleFirstTimed(this, j10, timeUnit, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<T> throttleLast(long j10, TimeUnit timeUnit) {
        return sample(j10, timeUnit);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<T> throttleLast(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return sample(j10, timeUnit, scheduler);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<T> throttleLatest(long j10, TimeUnit timeUnit) {
        return throttleLatest(j10, timeUnit, Schedulers.computation(), false);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<T> throttleLatest(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return throttleLatest(j10, timeUnit, scheduler, false);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> throttleLatest(long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableThrottleLatest(this, j10, timeUnit, scheduler, z10));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<T> throttleLatest(long j10, TimeUnit timeUnit, boolean z10) {
        return throttleLatest(j10, timeUnit, Schedulers.computation(), z10);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<T> throttleWithTimeout(long j10, TimeUnit timeUnit) {
        return debounce(j10, timeUnit);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<T> throttleWithTimeout(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return debounce(j10, timeUnit, scheduler);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<Timed<T>> timeInterval() {
        return timeInterval(TimeUnit.MILLISECONDS, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<Timed<T>> timeInterval(Scheduler scheduler) {
        return timeInterval(TimeUnit.MILLISECONDS, scheduler);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<Timed<T>> timeInterval(TimeUnit timeUnit) {
        return timeInterval(timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<Timed<T>> timeInterval(TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableTimeInterval(this, timeUnit, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> timeout(long j10, TimeUnit timeUnit) {
        return timeout0(j10, timeUnit, null, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> timeout(long j10, TimeUnit timeUnit, b<? extends T> bVar) {
        ObjectHelper.requireNonNull(bVar, "other is null");
        return timeout0(j10, timeUnit, bVar, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<T> timeout(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return timeout0(j10, timeUnit, null, scheduler);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> timeout(long j10, TimeUnit timeUnit, Scheduler scheduler, b<? extends T> bVar) {
        ObjectHelper.requireNonNull(bVar, "other is null");
        return timeout0(j10, timeUnit, bVar, scheduler);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final <U, V> Flowable<T> timeout(b<U> bVar, Function<? super T, ? extends b<V>> function) {
        ObjectHelper.requireNonNull(bVar, "firstTimeoutIndicator is null");
        return timeout0(bVar, function, null);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <U, V> Flowable<T> timeout(b<U> bVar, Function<? super T, ? extends b<V>> function, b<? extends T> bVar2) {
        ObjectHelper.requireNonNull(bVar, "firstTimeoutSelector is null");
        ObjectHelper.requireNonNull(bVar2, "other is null");
        return timeout0(bVar, function, bVar2);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final <V> Flowable<T> timeout(Function<? super T, ? extends b<V>> function) {
        return timeout0(null, function, null);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <V> Flowable<T> timeout(Function<? super T, ? extends b<V>> function, Flowable<? extends T> flowable) {
        ObjectHelper.requireNonNull(flowable, "other is null");
        return timeout0(null, function, flowable);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<Timed<T>> timestamp() {
        return timestamp(TimeUnit.MILLISECONDS, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<Timed<T>> timestamp(Scheduler scheduler) {
        return timestamp(TimeUnit.MILLISECONDS, scheduler);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    public final Flowable<Timed<T>> timestamp(TimeUnit timeUnit) {
        return timestamp(timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final Flowable<Timed<T>> timestamp(TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return (Flowable<Timed<T>>) map(Functions.timestampWith(timeUnit, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.SPECIAL)
    @CheckReturnValue
    public final <R> R to(Function<? super Flowable<T>, R> function) {
        try {
            return (R) ((Function) ObjectHelper.requireNonNull(function, "converter is null")).apply(this);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Future<T> toFuture() {
        return (Future) subscribeWith(new FutureSubscriber());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Single<List<T>> toList() {
        return RxJavaPlugins.onAssembly(new FlowableToListSingle(this));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Single<List<T>> toList(int i10) {
        ObjectHelper.verifyPositive(i10, "capacityHint");
        return RxJavaPlugins.onAssembly(new FlowableToListSingle(this, Functions.createArrayList(i10)));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final <U extends Collection<? super T>> Single<U> toList(Callable<U> callable) {
        ObjectHelper.requireNonNull(callable, "collectionSupplier is null");
        return RxJavaPlugins.onAssembly(new FlowableToListSingle(this, callable));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final <K> Single<Map<K, T>> toMap(Function<? super T, ? extends K> function) {
        ObjectHelper.requireNonNull(function, "keySelector is null");
        return (Single<Map<K, T>>) collect(HashMapSupplier.asCallable(), Functions.toMapKeySelector(function));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final <K, V> Single<Map<K, V>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        ObjectHelper.requireNonNull(function, "keySelector is null");
        ObjectHelper.requireNonNull(function2, "valueSelector is null");
        return (Single<Map<K, V>>) collect(HashMapSupplier.asCallable(), Functions.toMapKeyValueSelector(function, function2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final <K, V> Single<Map<K, V>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Callable<? extends Map<K, V>> callable) {
        ObjectHelper.requireNonNull(function, "keySelector is null");
        ObjectHelper.requireNonNull(function2, "valueSelector is null");
        return (Single<Map<K, V>>) collect(callable, Functions.toMapKeyValueSelector(function, function2));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final <K> Single<Map<K, Collection<T>>> toMultimap(Function<? super T, ? extends K> function) {
        return (Single<Map<K, Collection<T>>>) toMultimap(function, Functions.identity(), HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2) {
        return toMultimap(function, function2, HashMapSupplier.asCallable(), ArrayListSupplier.asFunction());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Callable<Map<K, Collection<V>>> callable) {
        return toMultimap(function, function2, callable, ArrayListSupplier.asFunction());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final <K, V> Single<Map<K, Collection<V>>> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Callable<? extends Map<K, Collection<V>>> callable, Function<? super K, ? extends Collection<? super V>> function3) {
        ObjectHelper.requireNonNull(function, "keySelector is null");
        ObjectHelper.requireNonNull(function2, "valueSelector is null");
        ObjectHelper.requireNonNull(callable, "mapSupplier is null");
        ObjectHelper.requireNonNull(function3, "collectionFactory is null");
        return (Single<Map<K, Collection<V>>>) collect(callable, Functions.toMultimapKeyValueSelector(function, function2, function3));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Observable<T> toObservable() {
        return RxJavaPlugins.onAssembly(new ObservableFromPublisher(this));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Single<List<T>> toSortedList() {
        return toSortedList(Functions.naturalComparator());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    public final Single<List<T>> toSortedList(int i10) {
        return toSortedList(Functions.naturalComparator(), i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final Single<List<T>> toSortedList(Comparator<? super T> comparator) {
        ObjectHelper.requireNonNull(comparator, "comparator is null");
        return (Single<List<T>>) toList().map(Functions.listSorter(comparator));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.UNBOUNDED_IN)
    @CheckReturnValue
    @NonNull
    public final Single<List<T>> toSortedList(Comparator<? super T> comparator, int i10) {
        ObjectHelper.requireNonNull(comparator, "comparator is null");
        return (Single<List<T>>) toList(i10).map(Functions.listSorter(comparator));
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final Flowable<T> unsubscribeOn(Scheduler scheduler) {
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new FlowableUnsubscribeOn(this, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<Flowable<T>> window(long j10) {
        return window(j10, j10, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<Flowable<T>> window(long j10, long j11) {
        return window(j10, j11, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final Flowable<Flowable<T>> window(long j10, long j11, int i10) {
        ObjectHelper.verifyPositive(j11, "skip");
        ObjectHelper.verifyPositive(j10, "count");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableWindow(this, j10, j11, i10));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<Flowable<T>> window(long j10, long j11, TimeUnit timeUnit) {
        return window(j10, j11, timeUnit, Schedulers.computation(), bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<Flowable<T>> window(long j10, long j11, TimeUnit timeUnit, Scheduler scheduler) {
        return window(j10, j11, timeUnit, scheduler, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public final Flowable<Flowable<T>> window(long j10, long j11, TimeUnit timeUnit, Scheduler scheduler, int i10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        ObjectHelper.verifyPositive(j10, "timespan");
        ObjectHelper.verifyPositive(j11, "timeskip");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        return RxJavaPlugins.onAssembly(new FlowableWindowTimed(this, j10, j11, timeUnit, scheduler, Long.MAX_VALUE, i10, false));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<Flowable<T>> window(long j10, TimeUnit timeUnit) {
        return window(j10, timeUnit, Schedulers.computation(), Long.MAX_VALUE, false);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<Flowable<T>> window(long j10, TimeUnit timeUnit, long j11) {
        return window(j10, timeUnit, Schedulers.computation(), j11, false);
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<Flowable<T>> window(long j10, TimeUnit timeUnit, long j11, boolean z10) {
        return window(j10, timeUnit, Schedulers.computation(), j11, z10);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<Flowable<T>> window(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return window(j10, timeUnit, scheduler, Long.MAX_VALUE, false);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<Flowable<T>> window(long j10, TimeUnit timeUnit, Scheduler scheduler, long j11) {
        return window(j10, timeUnit, scheduler, j11, false);
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final Flowable<Flowable<T>> window(long j10, TimeUnit timeUnit, Scheduler scheduler, long j11, boolean z10) {
        return window(j10, timeUnit, scheduler, j11, z10, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public final Flowable<Flowable<T>> window(long j10, TimeUnit timeUnit, Scheduler scheduler, long j11, boolean z10, int i10) {
        ObjectHelper.verifyPositive(i10, "bufferSize");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.verifyPositive(j11, "count");
        return RxJavaPlugins.onAssembly(new FlowableWindowTimed(this, j10, j10, timeUnit, scheduler, j11, i10, z10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final <B> Flowable<Flowable<T>> window(b<B> bVar) {
        return window(bVar, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public final <B> Flowable<Flowable<T>> window(b<B> bVar, int i10) {
        ObjectHelper.requireNonNull(bVar, "boundaryIndicator is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableWindowBoundary(this, bVar, i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final <U, V> Flowable<Flowable<T>> window(b<U> bVar, Function<? super U, ? extends b<V>> function) {
        return window(bVar, function, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public final <U, V> Flowable<Flowable<T>> window(b<U> bVar, Function<? super U, ? extends b<V>> function, int i10) {
        ObjectHelper.requireNonNull(bVar, "openingIndicator is null");
        ObjectHelper.requireNonNull(function, "closingIndicator is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableWindowBoundarySelector(this, bVar, function, i10));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    public final <B> Flowable<Flowable<T>> window(Callable<? extends b<B>> callable) {
        return window(callable, bufferSize());
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.ERROR)
    @CheckReturnValue
    @NonNull
    public final <B> Flowable<Flowable<T>> window(Callable<? extends b<B>> callable, int i10) {
        ObjectHelper.requireNonNull(callable, "boundaryIndicatorSupplier is null");
        ObjectHelper.verifyPositive(i10, "bufferSize");
        return RxJavaPlugins.onAssembly(new FlowableWindowBoundarySupplier(this, callable, i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final <T1, T2, T3, T4, R> Flowable<R> withLatestFrom(b<T1> bVar, b<T2> bVar2, b<T3> bVar3, b<T4> bVar4, Function5<? super T, ? super T1, ? super T2, ? super T3, ? super T4, R> function5) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        ObjectHelper.requireNonNull(bVar4, "source4 is null");
        return withLatestFrom(new b[]{bVar, bVar2, bVar3, bVar4}, Functions.toFunction(function5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final <T1, T2, T3, R> Flowable<R> withLatestFrom(b<T1> bVar, b<T2> bVar2, b<T3> bVar3, Function4<? super T, ? super T1, ? super T2, ? super T3, R> function4) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        ObjectHelper.requireNonNull(bVar3, "source3 is null");
        return withLatestFrom(new b[]{bVar, bVar2, bVar3}, Functions.toFunction(function4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final <T1, T2, R> Flowable<R> withLatestFrom(b<T1> bVar, b<T2> bVar2, Function3<? super T, ? super T1, ? super T2, R> function3) {
        ObjectHelper.requireNonNull(bVar, "source1 is null");
        ObjectHelper.requireNonNull(bVar2, "source2 is null");
        return withLatestFrom(new b[]{bVar, bVar2}, Functions.toFunction(function3));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final <U, R> Flowable<R> withLatestFrom(b<? extends U> bVar, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        ObjectHelper.requireNonNull(bVar, "other is null");
        ObjectHelper.requireNonNull(biFunction, "combiner is null");
        return RxJavaPlugins.onAssembly(new FlowableWithLatestFrom(this, biFunction, bVar));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> withLatestFrom(Iterable<? extends b<?>> iterable, Function<? super Object[], R> function) {
        ObjectHelper.requireNonNull(iterable, "others is null");
        ObjectHelper.requireNonNull(function, "combiner is null");
        return RxJavaPlugins.onAssembly(new FlowableWithLatestFromMany(this, iterable, function));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.PASS_THROUGH)
    @CheckReturnValue
    @NonNull
    public final <R> Flowable<R> withLatestFrom(b<?>[] bVarArr, Function<? super Object[], R> function) {
        ObjectHelper.requireNonNull(bVarArr, "others is null");
        ObjectHelper.requireNonNull(function, "combiner is null");
        return RxJavaPlugins.onAssembly(new FlowableWithLatestFromMany(this, bVarArr, function));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <U, R> Flowable<R> zipWith(b<? extends U> bVar, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        ObjectHelper.requireNonNull(bVar, "other is null");
        return zip(this, bVar, biFunction);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <U, R> Flowable<R> zipWith(b<? extends U> bVar, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z10) {
        return zip(this, bVar, biFunction, z10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    public final <U, R> Flowable<R> zipWith(b<? extends U> bVar, BiFunction<? super T, ? super U, ? extends R> biFunction, boolean z10, int i10) {
        return zip(this, bVar, biFunction, z10, i10);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @BackpressureSupport(BackpressureKind.FULL)
    @CheckReturnValue
    @NonNull
    public final <U, R> Flowable<R> zipWith(Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        ObjectHelper.requireNonNull(iterable, "other is null");
        ObjectHelper.requireNonNull(biFunction, "zipper is null");
        return RxJavaPlugins.onAssembly(new FlowableZipIterable(this, iterable, biFunction));
    }
}
