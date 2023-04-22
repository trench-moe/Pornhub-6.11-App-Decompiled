package io.reactivex.internal.util;

import df.c;
import df.d;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.fuseable.SimpleQueue;
import io.reactivex.internal.queue.SpscArrayQueue;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class QueueDrainHelper {
    public static final long COMPLETED_MASK = Long.MIN_VALUE;
    public static final long REQUESTED_MASK = Long.MAX_VALUE;

    private QueueDrainHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> boolean checkTerminated(boolean z10, boolean z11, c<?> cVar, boolean z12, SimpleQueue<?> simpleQueue, QueueDrain<T, U> queueDrain) {
        if (queueDrain.cancelled()) {
            simpleQueue.clear();
            return true;
        }
        if (z10) {
            if (!z12) {
                Throwable error = queueDrain.error();
                if (error != null) {
                    simpleQueue.clear();
                    cVar.onError(error);
                    return true;
                } else if (z11) {
                    cVar.onComplete();
                    return true;
                }
            } else if (z11) {
                Throwable error2 = queueDrain.error();
                if (error2 != null) {
                    cVar.onError(error2);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }

    public static <T, U> boolean checkTerminated(boolean z10, boolean z11, Observer<?> observer, boolean z12, SimpleQueue<?> simpleQueue, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.cancelled()) {
            simpleQueue.clear();
            disposable.dispose();
            return true;
        } else if (z10) {
            if (z12) {
                if (z11) {
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    Throwable error = observableQueueDrain.error();
                    if (error != null) {
                        observer.onError(error);
                    } else {
                        observer.onComplete();
                    }
                    return true;
                }
                return false;
            }
            Throwable error2 = observableQueueDrain.error();
            if (error2 != null) {
                simpleQueue.clear();
                if (disposable != null) {
                    disposable.dispose();
                }
                observer.onError(error2);
                return true;
            } else if (z11) {
                if (disposable != null) {
                    disposable.dispose();
                }
                observer.onComplete();
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static <T> SimpleQueue<T> createQueue(int i10) {
        return i10 < 0 ? new SpscLinkedArrayQueue(-i10) : new SpscArrayQueue(i10);
    }

    public static <T, U> void drainLoop(SimplePlainQueue<T> simplePlainQueue, Observer<? super U> observer, boolean z10, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        int i10 = 1;
        while (!checkTerminated(observableQueueDrain.done(), simplePlainQueue.isEmpty(), observer, z10, simplePlainQueue, disposable, observableQueueDrain)) {
            while (true) {
                boolean done = observableQueueDrain.done();
                T poll = simplePlainQueue.poll();
                boolean z11 = poll == null;
                if (checkTerminated(done, z11, observer, z10, simplePlainQueue, disposable, observableQueueDrain)) {
                    return;
                }
                if (z11) {
                    i10 = observableQueueDrain.leave(-i10);
                    if (i10 == 0) {
                        return;
                    }
                } else {
                    observableQueueDrain.accept(observer, poll);
                }
            }
        }
    }

    public static <T, U> void drainMaxLoop(SimplePlainQueue<T> simplePlainQueue, c<? super U> cVar, boolean z10, Disposable disposable, QueueDrain<T, U> queueDrain) {
        int i10 = 1;
        while (true) {
            boolean done = queueDrain.done();
            T poll = simplePlainQueue.poll();
            boolean z11 = poll == null;
            if (checkTerminated(done, z11, cVar, z10, simplePlainQueue, queueDrain)) {
                if (disposable != null) {
                    disposable.dispose();
                    return;
                }
                return;
            } else if (z11) {
                i10 = queueDrain.leave(-i10);
                if (i10 == 0) {
                    return;
                }
            } else {
                long requested = queueDrain.requested();
                if (requested == 0) {
                    simplePlainQueue.clear();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    cVar.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                } else if (queueDrain.accept(cVar, poll) && requested != Long.MAX_VALUE) {
                    queueDrain.produced(1L);
                }
            }
        }
    }

    public static boolean isCancelled(BooleanSupplier booleanSupplier) {
        try {
            return booleanSupplier.getAsBoolean();
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            return true;
        }
    }

    public static <T> void postComplete(c<? super T> cVar, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j10;
        long j11;
        if (queue.isEmpty()) {
            cVar.onComplete();
        } else if (postCompleteDrain(atomicLong.get(), cVar, queue, atomicLong, booleanSupplier)) {
        } else {
            do {
                j10 = atomicLong.get();
                if ((j10 & Long.MIN_VALUE) != 0) {
                    return;
                }
                j11 = j10 | Long.MIN_VALUE;
            } while (!atomicLong.compareAndSet(j10, j11));
            if (j10 != 0) {
                postCompleteDrain(j11, cVar, queue, atomicLong, booleanSupplier);
            }
        }
    }

    public static <T> boolean postCompleteDrain(long j10, c<? super T> cVar, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j11 = j10 & Long.MIN_VALUE;
        while (true) {
            if (j11 != j10) {
                if (isCancelled(booleanSupplier)) {
                    return true;
                }
                Object obj = (T) queue.poll();
                if (obj == null) {
                    cVar.onComplete();
                    return true;
                }
                cVar.onNext(obj);
                j11++;
            } else if (isCancelled(booleanSupplier)) {
                return true;
            } else {
                if (queue.isEmpty()) {
                    cVar.onComplete();
                    return true;
                }
                j10 = atomicLong.get();
                if (j10 == j11) {
                    long addAndGet = atomicLong.addAndGet(-(j11 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & addAndGet) == 0) {
                        return false;
                    }
                    j10 = addAndGet;
                    j11 = addAndGet & Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> boolean postCompleteRequest(long j10, c<? super T> cVar, Queue<T> queue, AtomicLong atomicLong, BooleanSupplier booleanSupplier) {
        long j11;
        do {
            j11 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j11, BackpressureHelper.addCap(Long.MAX_VALUE & j11, j10) | (j11 & Long.MIN_VALUE)));
        if (j11 == Long.MIN_VALUE) {
            postCompleteDrain(j10 | Long.MIN_VALUE, cVar, queue, atomicLong, booleanSupplier);
            return true;
        }
        return false;
    }

    public static void request(d dVar, int i10) {
        dVar.request(i10 < 0 ? Long.MAX_VALUE : i10);
    }
}
