package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamObservableSource;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.observables.ConnectableObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ObservablePublish<T> extends ConnectableObservable<T> implements HasUpstreamObservableSource<T>, ObservablePublishClassic<T> {
    public final AtomicReference<PublishObserver<T>> current;
    public final ObservableSource<T> onSubscribe;
    public final ObservableSource<T> source;

    /* loaded from: classes2.dex */
    public static final class InnerDisposable<T> extends AtomicReference<Object> implements Disposable {
        private static final long serialVersionUID = -1100270633763673112L;
        public final Observer<? super T> child;

        public InnerDisposable(Observer<? super T> observer) {
            this.child = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            Object andSet = getAndSet(this);
            if (andSet == null || andSet == this) {
                return;
            }
            ((PublishObserver) andSet).remove(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == this;
        }

        public void setParent(PublishObserver<T> publishObserver) {
            if (!compareAndSet(null, publishObserver)) {
                publishObserver.remove(this);
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class PublishObserver<T> implements Observer<T>, Disposable {
        public static final InnerDisposable[] EMPTY = new InnerDisposable[0];
        public static final InnerDisposable[] TERMINATED = new InnerDisposable[0];
        public final AtomicReference<PublishObserver<T>> current;
        public final AtomicReference<Disposable> upstream = new AtomicReference<>();
        public final AtomicReference<InnerDisposable<T>[]> observers = new AtomicReference<>(EMPTY);
        public final AtomicBoolean shouldConnect = new AtomicBoolean();

        public PublishObserver(AtomicReference<PublishObserver<T>> atomicReference) {
            this.current = atomicReference;
        }

        public boolean add(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable<T>[] innerDisposableArr2;
            do {
                innerDisposableArr = this.observers.get();
                if (innerDisposableArr == TERMINATED) {
                    return false;
                }
                int length = innerDisposableArr.length;
                innerDisposableArr2 = new InnerDisposable[length + 1];
                System.arraycopy(innerDisposableArr, 0, innerDisposableArr2, 0, length);
                innerDisposableArr2[length] = innerDisposable;
            } while (!this.observers.compareAndSet(innerDisposableArr, innerDisposableArr2));
            return true;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            AtomicReference<InnerDisposable<T>[]> atomicReference = this.observers;
            InnerDisposable<T>[] innerDisposableArr = TERMINATED;
            if (atomicReference.getAndSet(innerDisposableArr) != innerDisposableArr) {
                this.current.compareAndSet(this, null);
                DisposableHelper.dispose(this.upstream);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.observers.get() == TERMINATED;
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.current.compareAndSet(this, null);
            for (InnerDisposable<T> innerDisposable : this.observers.getAndSet(TERMINATED)) {
                innerDisposable.child.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.current.compareAndSet(this, null);
            InnerDisposable<T>[] andSet = this.observers.getAndSet(TERMINATED);
            if (andSet.length != 0) {
                for (InnerDisposable<T> innerDisposable : andSet) {
                    innerDisposable.child.onError(th);
                }
            } else {
                RxJavaPlugins.onError(th);
            }
        }

        @Override // io.reactivex.Observer
        public void onNext(T t2) {
            for (InnerDisposable<T> innerDisposable : this.observers.get()) {
                innerDisposable.child.onNext(t2);
            }
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.upstream, disposable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void remove(InnerDisposable<T> innerDisposable) {
            InnerDisposable<T>[] innerDisposableArr;
            InnerDisposable[] innerDisposableArr2;
            do {
                innerDisposableArr = this.observers.get();
                int length = innerDisposableArr.length;
                if (length == 0) {
                    return;
                }
                int i10 = -1;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        break;
                    } else if (innerDisposableArr[i11].equals(innerDisposable)) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (i10 < 0) {
                    return;
                }
                if (length == 1) {
                    innerDisposableArr2 = EMPTY;
                } else {
                    InnerDisposable[] innerDisposableArr3 = new InnerDisposable[length - 1];
                    System.arraycopy(innerDisposableArr, 0, innerDisposableArr3, 0, i10);
                    System.arraycopy(innerDisposableArr, i10 + 1, innerDisposableArr3, i10, (length - i10) - 1);
                    innerDisposableArr2 = innerDisposableArr3;
                }
            } while (!this.observers.compareAndSet(innerDisposableArr, innerDisposableArr2));
        }
    }

    /* loaded from: classes2.dex */
    public static final class PublishSource<T> implements ObservableSource<T> {
        private final AtomicReference<PublishObserver<T>> curr;

        public PublishSource(AtomicReference<PublishObserver<T>> atomicReference) {
            this.curr = atomicReference;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003a A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x000a A[SYNTHETIC] */
        @Override // io.reactivex.ObservableSource
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void subscribe(io.reactivex.Observer<? super T> r8) {
            /*
                r7 = this;
                io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable r0 = new io.reactivex.internal.operators.observable.ObservablePublish$InnerDisposable
                java.lang.String r6 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                r0.<init>(r8)
                r8.onSubscribe(r0)
            La:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver<T>> r8 = r7.curr
                r6 = 3
                java.lang.Object r8 = r8.get()
                io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver r8 = (io.reactivex.internal.operators.observable.ObservablePublish.PublishObserver) r8
                r6 = 6
                if (r8 == 0) goto L1f
                r6 = 4
                boolean r3 = r8.isDisposed()
                r1 = r3
                if (r1 == 0) goto L33
                r5 = 1
            L1f:
                io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver r1 = new io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver<T>> r2 = r7.curr
                r6 = 6
                r1.<init>(r2)
                r4 = 6
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.observable.ObservablePublish$PublishObserver<T>> r2 = r7.curr
                boolean r8 = r2.compareAndSet(r8, r1)
                if (r8 != 0) goto L32
                r5 = 4
                goto La
            L32:
                r8 = r1
            L33:
                boolean r3 = r8.add(r0)
                r1 = r3
                if (r1 == 0) goto La
                r4 = 5
                r0.setParent(r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservablePublish.PublishSource.subscribe(io.reactivex.Observer):void");
        }
    }

    private ObservablePublish(ObservableSource<T> observableSource, ObservableSource<T> observableSource2, AtomicReference<PublishObserver<T>> atomicReference) {
        this.onSubscribe = observableSource;
        this.source = observableSource2;
        this.current = atomicReference;
    }

    public static <T> ConnectableObservable<T> create(ObservableSource<T> observableSource) {
        AtomicReference atomicReference = new AtomicReference();
        return RxJavaPlugins.onAssembly((ConnectableObservable) new ObservablePublish(new PublishSource(atomicReference), observableSource, atomicReference));
    }

    @Override // io.reactivex.observables.ConnectableObservable
    public void connect(Consumer<? super Disposable> consumer) {
        PublishObserver<T> publishObserver;
        while (true) {
            publishObserver = this.current.get();
            if (publishObserver != null && !publishObserver.isDisposed()) {
                break;
            }
            PublishObserver<T> publishObserver2 = new PublishObserver<>(this.current);
            if (this.current.compareAndSet(publishObserver, publishObserver2)) {
                publishObserver = publishObserver2;
                break;
            }
        }
        boolean z10 = true;
        if (publishObserver.shouldConnect.get() || !publishObserver.shouldConnect.compareAndSet(false, true)) {
            z10 = false;
        }
        try {
            consumer.accept(publishObserver);
            if (z10) {
                this.source.subscribe(publishObserver);
            }
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            throw ExceptionHelper.wrapOrThrow(th);
        }
    }

    @Override // io.reactivex.internal.operators.observable.ObservablePublishClassic
    public ObservableSource<T> publishSource() {
        return this.source;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamObservableSource
    public ObservableSource<T> source() {
        return this.source;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.onSubscribe.subscribe(observer);
    }
}
