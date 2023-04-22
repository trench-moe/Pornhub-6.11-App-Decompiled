package io.reactivex.observables;

import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.SchedulerSupport;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.operators.observable.ObservableAutoConnect;
import io.reactivex.internal.operators.observable.ObservablePublishAlt;
import io.reactivex.internal.operators.observable.ObservablePublishClassic;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import io.reactivex.internal.util.ConnectConsumer;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.Schedulers;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class ConnectableObservable<T> extends Observable<T> {
    private ConnectableObservable<T> onRefCount() {
        return this instanceof ObservablePublishClassic ? RxJavaPlugins.onAssembly((ConnectableObservable) new ObservablePublishAlt(((ObservablePublishClassic) this).publishSource())) : this;
    }

    @NonNull
    public Observable<T> autoConnect() {
        return autoConnect(1);
    }

    @NonNull
    public Observable<T> autoConnect(int i10) {
        return autoConnect(i10, Functions.emptyConsumer());
    }

    @NonNull
    public Observable<T> autoConnect(int i10, @NonNull Consumer<? super Disposable> consumer) {
        if (i10 <= 0) {
            connect(consumer);
            return RxJavaPlugins.onAssembly((ConnectableObservable) this);
        }
        return RxJavaPlugins.onAssembly(new ObservableAutoConnect(this, i10, consumer));
    }

    public final Disposable connect() {
        ConnectConsumer connectConsumer = new ConnectConsumer();
        connect(connectConsumer);
        return connectConsumer.disposable;
    }

    public abstract void connect(@NonNull Consumer<? super Disposable> consumer);

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    @NonNull
    public Observable<T> refCount() {
        return RxJavaPlugins.onAssembly(new ObservableRefCount(onRefCount()));
    }

    @SchedulerSupport(SchedulerSupport.NONE)
    @CheckReturnValue
    public final Observable<T> refCount(int i10) {
        return refCount(i10, 0L, TimeUnit.NANOSECONDS, Schedulers.trampoline());
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> refCount(int i10, long j10, TimeUnit timeUnit) {
        return refCount(i10, j10, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    public final Observable<T> refCount(int i10, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        ObjectHelper.verifyPositive(i10, "subscriberCount");
        ObjectHelper.requireNonNull(timeUnit, "unit is null");
        ObjectHelper.requireNonNull(scheduler, "scheduler is null");
        return RxJavaPlugins.onAssembly(new ObservableRefCount(onRefCount(), i10, j10, timeUnit, scheduler));
    }

    @SchedulerSupport(SchedulerSupport.COMPUTATION)
    @CheckReturnValue
    public final Observable<T> refCount(long j10, TimeUnit timeUnit) {
        return refCount(1, j10, timeUnit, Schedulers.computation());
    }

    @SchedulerSupport(SchedulerSupport.CUSTOM)
    @CheckReturnValue
    public final Observable<T> refCount(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        return refCount(1, j10, timeUnit, scheduler);
    }
}
