package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class BlockingObservableIterable<T> implements Iterable<T> {
    public final int bufferSize;
    public final ObservableSource<? extends T> source;

    /* loaded from: classes2.dex */
    public static final class BlockingObservableIterator<T> extends AtomicReference<Disposable> implements Observer<T>, Iterator<T>, Disposable {
        private static final long serialVersionUID = 6695226475494099826L;
        public final Condition condition;
        public volatile boolean done;
        public volatile Throwable error;
        public final Lock lock;
        public final SpscLinkedArrayQueue<T> queue;

        public BlockingObservableIterator(int i10) {
            this.queue = new SpscLinkedArrayQueue<>(i10);
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.condition = reentrantLock.newCondition();
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            DisposableHelper.dispose(this);
            signalConsumer();
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
            	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
            	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        @Override // java.util.Iterator
        public boolean hasNext() {
            /*
                r6 = this;
            L0:
                boolean r3 = r6.isDisposed()
                r0 = r3
                r3 = 0
                r1 = r3
                if (r0 == 0) goto L15
                r5 = 2
                java.lang.Throwable r0 = r6.error
                if (r0 != 0) goto Lf
                return r1
            Lf:
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
                r4 = 6
            L15:
                r5 = 5
                boolean r0 = r6.done
                r5 = 6
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r2 = r6.queue
                boolean r2 = r2.isEmpty()
                if (r0 == 0) goto L2f
                r5 = 6
                java.lang.Throwable r0 = r6.error
                if (r0 != 0) goto L2a
                r4 = 1
                if (r2 == 0) goto L2f
                return r1
            L2a:
                java.lang.RuntimeException r0 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                throw r0
            L2f:
                if (r2 == 0) goto L76
                r4 = 6
                r5 = 6
                io.reactivex.internal.util.BlockingHelper.verifyNonBlocking()     // Catch: java.lang.InterruptedException -> L67
                r5 = 1
                java.util.concurrent.locks.Lock r0 = r6.lock     // Catch: java.lang.InterruptedException -> L67
                r4 = 1
                r0.lock()     // Catch: java.lang.InterruptedException -> L67
            L3d:
                r5 = 3
                boolean r0 = r6.done     // Catch: java.lang.Throwable -> L60
                r4 = 2
                if (r0 != 0) goto L59
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r6.queue     // Catch: java.lang.Throwable -> L60
                boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L60
                r0 = r3
                if (r0 == 0) goto L59
                boolean r3 = r6.isDisposed()     // Catch: java.lang.Throwable -> L60
                r0 = r3
                if (r0 != 0) goto L59
                java.util.concurrent.locks.Condition r0 = r6.condition     // Catch: java.lang.Throwable -> L60
                r0.await()     // Catch: java.lang.Throwable -> L60
                goto L3d
            L59:
                r5 = 4
                java.util.concurrent.locks.Lock r0 = r6.lock     // Catch: java.lang.InterruptedException -> L67
                r0.unlock()     // Catch: java.lang.InterruptedException -> L67
                goto L0
            L60:
                r0 = move-exception
                java.util.concurrent.locks.Lock r1 = r6.lock     // Catch: java.lang.InterruptedException -> L67
                r1.unlock()     // Catch: java.lang.InterruptedException -> L67
                throw r0     // Catch: java.lang.InterruptedException -> L67
            L67:
                r0 = move-exception
                io.reactivex.internal.disposables.DisposableHelper.dispose(r6)
                r6.signalConsumer()
                r4 = 1
                java.lang.RuntimeException r3 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r0)
                r0 = r3
                throw r0
                r4 = 3
            L76:
                r3 = 1
                r0 = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.BlockingObservableIterable.BlockingObservableIterator.hasNext():boolean");
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                return this.queue.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
            this.done = true;
            signalConsumer();
        }

        @Override // io.reactivex.Observer
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            signalConsumer();
        }

        @Override // io.reactivex.Observer
        public void onNext(T t2) {
            this.queue.offer(t2);
            signalConsumer();
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }

        public void signalConsumer() {
            this.lock.lock();
            try {
                this.condition.signalAll();
                this.lock.unlock();
            } catch (Throwable th) {
                this.lock.unlock();
                throw th;
            }
        }
    }

    public BlockingObservableIterable(ObservableSource<? extends T> observableSource, int i10) {
        this.source = observableSource;
        this.bufferSize = i10;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        BlockingObservableIterator blockingObservableIterator = new BlockingObservableIterator(this.bufferSize);
        this.source.subscribe(blockingObservableIterator);
        return blockingObservableIterator;
    }
}
