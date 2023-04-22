package io.reactivex.internal.operators.flowable;

import df.b;
import df.c;
import df.d;
import io.reactivex.Emitter;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.flowables.ConnectableFlowable;
import io.reactivex.functions.Action;
import io.reactivex.functions.BiConsumer;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class FlowableInternalHelper {

    /* loaded from: classes2.dex */
    public static final class BufferedReplayCallable<T> implements Callable<ConnectableFlowable<T>> {
        private final int bufferSize;
        private final Flowable<T> parent;

        public BufferedReplayCallable(Flowable<T> flowable, int i10) {
            this.parent = flowable;
            this.bufferSize = i10;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay(this.bufferSize);
        }
    }

    /* loaded from: classes2.dex */
    public static final class BufferedTimedReplay<T> implements Callable<ConnectableFlowable<T>> {
        private final int bufferSize;
        private final Flowable<T> parent;
        private final Scheduler scheduler;
        private final long time;
        private final TimeUnit unit;

        public BufferedTimedReplay(Flowable<T> flowable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.parent = flowable;
            this.bufferSize = i10;
            this.time = j10;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay(this.bufferSize, this.time, this.unit, this.scheduler);
        }
    }

    /* loaded from: classes2.dex */
    public static final class FlatMapIntoIterable<T, U> implements Function<T, b<U>> {
        private final Function<? super T, ? extends Iterable<? extends U>> mapper;

        public FlatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
            this.mapper = function;
        }

        @Override // io.reactivex.functions.Function
        public b<U> apply(T t2) {
            return new FlowableFromIterable((Iterable) ObjectHelper.requireNonNull(this.mapper.apply(t2), "The mapper returned a null Iterable"));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return apply((FlatMapIntoIterable<T, U>) obj);
        }
    }

    /* loaded from: classes2.dex */
    public static final class FlatMapWithCombinerInner<U, R, T> implements Function<U, R> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;

        /* renamed from: t  reason: collision with root package name */
        private final T f10739t;

        public FlatMapWithCombinerInner(BiFunction<? super T, ? super U, ? extends R> biFunction, T t2) {
            this.combiner = biFunction;
            this.f10739t = t2;
        }

        @Override // io.reactivex.functions.Function
        public R apply(U u2) {
            return this.combiner.apply((T) this.f10739t, u2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, b<R>> {
        private final BiFunction<? super T, ? super U, ? extends R> combiner;
        private final Function<? super T, ? extends b<? extends U>> mapper;

        public FlatMapWithCombinerOuter(BiFunction<? super T, ? super U, ? extends R> biFunction, Function<? super T, ? extends b<? extends U>> function) {
            this.combiner = biFunction;
            this.mapper = function;
        }

        @Override // io.reactivex.functions.Function
        public b<R> apply(T t2) {
            return new FlowableMapPublisher((b) ObjectHelper.requireNonNull(this.mapper.apply(t2), "The mapper returned a null Publisher"), new FlatMapWithCombinerInner(this.combiner, t2));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return apply((FlatMapWithCombinerOuter<T, R, U>) obj);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ItemDelayFunction<T, U> implements Function<T, b<T>> {
        public final Function<? super T, ? extends b<U>> itemDelay;

        public ItemDelayFunction(Function<? super T, ? extends b<U>> function) {
            this.itemDelay = function;
        }

        @Override // io.reactivex.functions.Function
        public b<T> apply(T t2) {
            return new FlowableTakePublisher((b) ObjectHelper.requireNonNull(this.itemDelay.apply(t2), "The itemDelay returned a null Publisher"), 1L).map(Functions.justFunction(t2)).defaultIfEmpty(t2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return apply((ItemDelayFunction<T, U>) obj);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ReplayCallable<T> implements Callable<ConnectableFlowable<T>> {
        private final Flowable<T> parent;

        public ReplayCallable(Flowable<T> flowable) {
            this.parent = flowable;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ReplayFunction<T, R> implements Function<Flowable<T>, b<R>> {
        private final Scheduler scheduler;
        private final Function<? super Flowable<T>, ? extends b<R>> selector;

        public ReplayFunction(Function<? super Flowable<T>, ? extends b<R>> function, Scheduler scheduler) {
            this.selector = function;
            this.scheduler = scheduler;
        }

        public b<R> apply(Flowable<T> flowable) {
            return Flowable.fromPublisher((b) ObjectHelper.requireNonNull(this.selector.apply(flowable), "The selector returned a null Publisher")).observeOn(this.scheduler);
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return apply((Flowable) ((Flowable) obj));
        }
    }

    /* loaded from: classes2.dex */
    public enum RequestMax implements Consumer<d> {
        INSTANCE;

        @Override // io.reactivex.functions.Consumer
        public void accept(d dVar) {
            dVar.request(Long.MAX_VALUE);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SimpleBiGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        public final BiConsumer<S, Emitter<T>> consumer;

        public SimpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
            this.consumer = biConsumer;
        }

        public S apply(S s10, Emitter<T> emitter) {
            this.consumer.accept(s10, emitter);
            return s10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.BiFunction
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
            return apply((SimpleBiGenerator<T, S>) obj, (Emitter) ((Emitter) obj2));
        }
    }

    /* loaded from: classes2.dex */
    public static final class SimpleGenerator<T, S> implements BiFunction<S, Emitter<T>, S> {
        public final Consumer<Emitter<T>> consumer;

        public SimpleGenerator(Consumer<Emitter<T>> consumer) {
            this.consumer = consumer;
        }

        public S apply(S s10, Emitter<T> emitter) {
            this.consumer.accept(emitter);
            return s10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.functions.BiFunction
        public /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
            return apply((SimpleGenerator<T, S>) obj, (Emitter) ((Emitter) obj2));
        }
    }

    /* loaded from: classes2.dex */
    public static final class SubscriberOnComplete<T> implements Action {
        public final c<T> subscriber;

        public SubscriberOnComplete(c<T> cVar) {
            this.subscriber = cVar;
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            this.subscriber.onComplete();
        }
    }

    /* loaded from: classes2.dex */
    public static final class SubscriberOnError<T> implements Consumer<Throwable> {
        public final c<T> subscriber;

        public SubscriberOnError(c<T> cVar) {
            this.subscriber = cVar;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Throwable th) {
            this.subscriber.onError(th);
        }
    }

    /* loaded from: classes2.dex */
    public static final class SubscriberOnNext<T> implements Consumer<T> {
        public final c<T> subscriber;

        public SubscriberOnNext(c<T> cVar) {
            this.subscriber = cVar;
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(T t2) {
            this.subscriber.onNext(t2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class TimedReplay<T> implements Callable<ConnectableFlowable<T>> {
        private final Flowable<T> parent;
        private final Scheduler scheduler;
        private final long time;
        private final TimeUnit unit;

        public TimedReplay(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.parent = flowable;
            this.time = j10;
            this.unit = timeUnit;
            this.scheduler = scheduler;
        }

        @Override // java.util.concurrent.Callable
        public ConnectableFlowable<T> call() {
            return this.parent.replay(this.time, this.unit, this.scheduler);
        }
    }

    /* loaded from: classes2.dex */
    public static final class ZipIterableFunction<T, R> implements Function<List<b<? extends T>>, b<? extends R>> {
        private final Function<? super Object[], ? extends R> zipper;

        public ZipIterableFunction(Function<? super Object[], ? extends R> function) {
            this.zipper = function;
        }

        public b<? extends R> apply(List<b<? extends T>> list) {
            return Flowable.zipIterable(list, this.zipper, false, Flowable.bufferSize());
        }

        @Override // io.reactivex.functions.Function
        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return apply((List) ((List) obj));
        }
    }

    private FlowableInternalHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Function<T, b<U>> flatMapIntoIterable(Function<? super T, ? extends Iterable<? extends U>> function) {
        return new FlatMapIntoIterable(function);
    }

    public static <T, U, R> Function<T, b<R>> flatMapWithCombiner(Function<? super T, ? extends b<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new FlatMapWithCombinerOuter(biFunction, function);
    }

    public static <T, U> Function<T, b<T>> itemDelay(Function<? super T, ? extends b<U>> function) {
        return new ItemDelayFunction(function);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable) {
        return new ReplayCallable(flowable);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i10) {
        return new BufferedReplayCallable(flowable, i10);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return new BufferedTimedReplay(flowable, i10, j10, timeUnit, scheduler);
    }

    public static <T> Callable<ConnectableFlowable<T>> replayCallable(Flowable<T> flowable, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return new TimedReplay(flowable, j10, timeUnit, scheduler);
    }

    public static <T, R> Function<Flowable<T>, b<R>> replayFunction(Function<? super Flowable<T>, ? extends b<R>> function, Scheduler scheduler) {
        return new ReplayFunction(function, scheduler);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleBiGenerator(BiConsumer<S, Emitter<T>> biConsumer) {
        return new SimpleBiGenerator(biConsumer);
    }

    public static <T, S> BiFunction<S, Emitter<T>, S> simpleGenerator(Consumer<Emitter<T>> consumer) {
        return new SimpleGenerator(consumer);
    }

    public static <T> Action subscriberOnComplete(c<T> cVar) {
        return new SubscriberOnComplete(cVar);
    }

    public static <T> Consumer<Throwable> subscriberOnError(c<T> cVar) {
        return new SubscriberOnError(cVar);
    }

    public static <T> Consumer<T> subscriberOnNext(c<T> cVar) {
        return new SubscriberOnNext(cVar);
    }

    public static <T, R> Function<List<b<? extends T>>, b<? extends R>> zipIterable(Function<? super Object[], ? extends R> function) {
        return new ZipIterableFunction(function);
    }
}
