package io.reactivex.rxkotlin;

import com.appsflyer.oaid.BuildConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0018\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\u0010\f\n\u0002\u0010\u0019\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\u0010\n\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001a^\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u00062)\b\u0004\u0010\u0007\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00050\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00020\bH\u0087\b\u001a(\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u0001H\u0007\u001a(\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000e0\u0006H\u0007\u001a*\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00060\u0001H\u0007\u001a*\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00060\u0001H\u0007\u001aI\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u00012\u001a\b\u0004\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u0002H\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00130\bH\u0087\b\u001a*\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u00010\u0006H\u0007\u001a(\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u0001H\u0007\u001a*\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u00050\u00010\u0006H\u0007\u001a#\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0001H\u0087\b\u001a(\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u0001H\u0007\u001a(\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u0001H\u0007\u001a\"\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0006\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u001bH\u0002\u001aD\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H 0\u001e0\u001d\"\b\b\u0000\u0010\u001f*\u00020\u0003\"\b\b\u0001\u0010 *\u00020\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H 0!0\u0001H\u0007\u001aJ\u0010\"\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u0002H\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H 0#0\u001e0\u001d\"\b\b\u0000\u0010\u001f*\u00020\u0003\"\b\b\u0001\u0010 *\u00020\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u001f\u0012\u0004\u0012\u0002H 0!0\u0001H\u0007\u001a'\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050%H\u0007¢\u0006\u0002\u0010&\u001a\u0012\u0010$\u001a\b\u0012\u0004\u0012\u00020'0\u0001*\u00020(H\u0007\u001a\u0012\u0010$\u001a\b\u0012\u0004\u0012\u00020)0\u0001*\u00020*H\u0007\u001a\u0012\u0010$\u001a\b\u0012\u0004\u0012\u00020+0\u0001*\u00020,H\u0007\u001a\u0012\u0010$\u001a\b\u0012\u0004\u0012\u00020-0\u0001*\u00020.H\u0007\u001a\u0012\u0010$\u001a\b\u0012\u0004\u0012\u00020/0\u0001*\u000200H\u0007\u001a\u0012\u0010$\u001a\b\u0012\u0004\u0012\u0002010\u0001*\u000202H\u0007\u001a\u0012\u0010$\u001a\b\u0012\u0004\u0012\u0002030\u0001*\u000204H\u0007\u001a\u0012\u0010$\u001a\b\u0012\u0004\u0012\u0002050\u0001*\u000206H\u0007\u001a\"\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u0006H\u0007\u001a\"\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u001bH\u0007\u001a\u0012\u0010$\u001a\b\u0012\u0004\u0012\u0002010\u0001*\u000207H\u0007\u001a\"\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00050\u0013H\u0007\u001a^\u00108\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0005*\u00020\u0003\"\b\b\u0001\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00010\u00062)\b\u0004\u00109\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u0002H\u00050\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u0002H\u00020\bH\u0087\b¨\u0006:"}, d2 = {"cast", "Lio/reactivex/Observable;", "R", BuildConfig.FLAVOR, "combineLatest", "T", BuildConfig.FLAVOR, "combineFunction", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "args", "concatAll", "Lio/reactivex/ObservableSource;", "concatMapIterable", "flatMapIterable", "flatMapSequence", "body", "Lkotlin/sequences/Sequence;", "merge", "mergeAll", "mergeDelayError", "ofType", "switchLatest", "switchOnNext", "toIterable", BuildConfig.FLAVOR, "toMap", "Lio/reactivex/Single;", BuildConfig.FLAVOR, "A", "B", "Lkotlin/Pair;", "toMultimap", BuildConfig.FLAVOR, "toObservable", BuildConfig.FLAVOR, "([Ljava/lang/Object;)Lio/reactivex/Observable;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lkotlin/ranges/IntProgression;", "zip", "zipFunction", "rxkotlin"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class ObservableKt {
    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final /* synthetic */ <R> Observable<R> cast(Observable<?> observable) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Observable<R> observable2 = (Observable<R>) observable.cast(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(observable2, "cast(R::class.java)");
        return observable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T, R> Observable<R> combineLatest(Iterable<? extends Observable<T>> iterable, final Function1<? super List<? extends T>, ? extends R> function1) {
        Observable<R> combineLatest = Observable.combineLatest(iterable, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.ObservableKt$combineLatest$1
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
        Intrinsics.checkExpressionValueIsNotNull(combineLatest, "Observable.combineLatest…List().map { it as T }) }");
        return combineLatest;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T> Observable<T> concatAll(Observable<Observable<T>> observable) {
        Observable<T> observable2 = (Observable<T>) observable.concatMap(new Function<T, ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt$concatAll$1
            public final Observable<T> apply(Observable<T> observable3) {
                return observable3;
            }

            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((Observable) ((Observable) obj));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable2, "concatMap { it }");
        return observable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T> Observable<T> concatAll(Iterable<? extends ObservableSource<T>> iterable) {
        Observable<T> concat = Observable.concat(iterable);
        Intrinsics.checkExpressionValueIsNotNull(concat, "Observable.concat(this)");
        return concat;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T> Observable<T> concatMapIterable(Observable<? extends Iterable<? extends T>> observable) {
        Observable<T> observable2 = (Observable<T>) observable.concatMapIterable(new Function() { // from class: io.reactivex.rxkotlin.ObservableKt$concatMapIterable$1
            @Override // io.reactivex.functions.Function
            public final Iterable<Object> apply(Iterable<Object> iterable) {
                return iterable;
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable2, "concatMapIterable { it }");
        return observable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T> Observable<T> flatMapIterable(Observable<? extends Iterable<? extends T>> observable) {
        Observable<T> observable2 = (Observable<T>) observable.flatMapIterable(new Function() { // from class: io.reactivex.rxkotlin.ObservableKt$flatMapIterable$1
            @Override // io.reactivex.functions.Function
            public final Iterable<Object> apply(Iterable<Object> iterable) {
                return iterable;
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable2, "flatMapIterable { it }");
        return observable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T, R> Observable<R> flatMapSequence(Observable<T> observable, final Function1<? super T, ? extends Sequence<? extends R>> function1) {
        Observable<R> flatMap = observable.flatMap(new Function<T, ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt$flatMapSequence$1
            @Override // io.reactivex.functions.Function
            public final Observable<R> apply(T t2) {
                return ObservableKt.toObservable((Sequence) Function1.this.invoke(t2));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((ObservableKt$flatMapSequence$1<T, R>) obj);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(flatMap, "flatMap { body(it).toObservable() }");
        return flatMap;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T> Observable<T> merge(Iterable<? extends Observable<? extends T>> iterable) {
        Observable<T> merge = Observable.merge(toObservable(iterable));
        Intrinsics.checkExpressionValueIsNotNull(merge, "Observable.merge(this.toObservable())");
        return merge;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T> Observable<T> mergeAll(Observable<Observable<T>> observable) {
        Observable<T> observable2 = (Observable<T>) observable.flatMap(new Function<T, ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt$mergeAll$1
            public final Observable<T> apply(Observable<T> observable3) {
                return observable3;
            }

            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((Observable) ((Observable) obj));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable2, "flatMap { it }");
        return observable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T> Observable<T> mergeDelayError(Iterable<? extends Observable<? extends T>> iterable) {
        Observable<T> mergeDelayError = Observable.mergeDelayError(toObservable(iterable));
        Intrinsics.checkExpressionValueIsNotNull(mergeDelayError, "Observable.mergeDelayError(this.toObservable())");
        return mergeDelayError;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final /* synthetic */ <R> Observable<R> ofType(Observable<?> observable) {
        Intrinsics.reifiedOperationMarker(4, "R");
        Observable<R> observable2 = (Observable<R>) observable.ofType(Object.class);
        Intrinsics.checkExpressionValueIsNotNull(observable2, "ofType(R::class.java)");
        return observable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T> Observable<T> switchLatest(Observable<Observable<T>> observable) {
        Observable<T> observable2 = (Observable<T>) observable.switchMap(new Function<T, ObservableSource<? extends R>>() { // from class: io.reactivex.rxkotlin.ObservableKt$switchLatest$1
            public final Observable<T> apply(Observable<T> observable3) {
                return observable3;
            }

            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((Observable) ((Observable) obj));
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observable2, "switchMap { it }");
        return observable2;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T> Observable<T> switchOnNext(Observable<Observable<T>> observable) {
        Observable<T> switchOnNext = Observable.switchOnNext(observable);
        Intrinsics.checkExpressionValueIsNotNull(switchOnNext, "Observable.switchOnNext(this)");
        return switchOnNext;
    }

    private static final <T> Iterable<T> toIterable(Iterator<? extends T> it) {
        return new ObservableKt$toIterable$1(it);
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <A, B> Single<Map<A, B>> toMap(Observable<Pair<A, B>> observable) {
        Single<Map<A, B>> single = (Single<Map<A, B>>) observable.toMap(new Function() { // from class: io.reactivex.rxkotlin.ObservableKt$toMap$1
            @Override // io.reactivex.functions.Function
            public final Object apply(Pair<Object, Object> pair) {
                return pair.getFirst();
            }
        }, new Function() { // from class: io.reactivex.rxkotlin.ObservableKt$toMap$2
            @Override // io.reactivex.functions.Function
            public final Object apply(Pair<Object, Object> pair) {
                return pair.getSecond();
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(single, "toMap({ it.first }, { it.second })");
        return single;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <A, B> Single<Map<A, Collection<B>>> toMultimap(Observable<Pair<A, B>> observable) {
        Single<Map<A, Collection<B>>> single = (Single<Map<A, Collection<B>>>) observable.toMultimap(new Function() { // from class: io.reactivex.rxkotlin.ObservableKt$toMultimap$1
            @Override // io.reactivex.functions.Function
            public final Object apply(Pair<Object, Object> pair) {
                return pair.getFirst();
            }
        }, new Function() { // from class: io.reactivex.rxkotlin.ObservableKt$toMultimap$2
            @Override // io.reactivex.functions.Function
            public final Object apply(Pair<Object, Object> pair) {
                return pair.getSecond();
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(single, "toMultimap({ it.first }, { it.second })");
        return single;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T> Observable<T> toObservable(Iterable<? extends T> iterable) {
        Observable<T> fromIterable = Observable.fromIterable(iterable);
        Intrinsics.checkExpressionValueIsNotNull(fromIterable, "Observable.fromIterable(this)");
        return fromIterable;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T> Observable<T> toObservable(Iterator<? extends T> it) {
        return toObservable(toIterable(it));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final Observable<Integer> toObservable(IntProgression intProgression) {
        if (intProgression.getStep() != 1 || intProgression.getLast() - intProgression.getFirst() >= ((long) IntCompanionObject.MAX_VALUE)) {
            Observable<Integer> fromIterable = Observable.fromIterable(intProgression);
            Intrinsics.checkExpressionValueIsNotNull(fromIterable, "Observable.fromIterable(this)");
            return fromIterable;
        }
        Observable<Integer> range = Observable.range(intProgression.getFirst(), Math.max(0, (intProgression.getLast() - intProgression.getFirst()) + 1));
        Intrinsics.checkExpressionValueIsNotNull(range, "Observable.range(first, …max(0, last - first + 1))");
        return range;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T> Observable<T> toObservable(Sequence<? extends T> sequence) {
        return toObservable(SequencesKt.asIterable(sequence));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final Observable<Byte> toObservable(byte[] bArr) {
        return toObservable(ArraysKt.asIterable(bArr));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final Observable<Character> toObservable(char[] cArr) {
        return toObservable(ArraysKt.asIterable(cArr));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final Observable<Double> toObservable(double[] dArr) {
        return toObservable(ArraysKt.asIterable(dArr));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final Observable<Float> toObservable(float[] fArr) {
        return toObservable(ArraysKt.asIterable(fArr));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final Observable<Integer> toObservable(int[] iArr) {
        return toObservable(ArraysKt.asIterable(iArr));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final Observable<Long> toObservable(long[] jArr) {
        return toObservable(ArraysKt.asIterable(jArr));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T> Observable<T> toObservable(T[] tArr) {
        Observable<T> fromArray = Observable.fromArray(Arrays.copyOf(tArr, tArr.length));
        Intrinsics.checkExpressionValueIsNotNull(fromArray, "Observable.fromArray(*this)");
        return fromArray;
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final Observable<Short> toObservable(short[] sArr) {
        return toObservable(ArraysKt.asIterable(sArr));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final Observable<Boolean> toObservable(boolean[] zArr) {
        return toObservable(ArraysKt.asIterable(zArr));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public static final <T, R> Observable<R> zip(Iterable<? extends Observable<T>> iterable, final Function1<? super List<? extends T>, ? extends R> function1) {
        Observable<R> zip = Observable.zip(iterable, new Function<Object[], R>() { // from class: io.reactivex.rxkotlin.ObservableKt$zip$1
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
        Intrinsics.checkExpressionValueIsNotNull(zip, "Observable.zip(this) { z…List().map { it as T }) }");
        return zip;
    }
}
