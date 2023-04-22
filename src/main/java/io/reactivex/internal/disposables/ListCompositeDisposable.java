package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ListCompositeDisposable implements Disposable, DisposableContainer {
    public volatile boolean disposed;
    public List<Disposable> resources;

    public ListCompositeDisposable() {
    }

    public ListCompositeDisposable(Iterable<? extends Disposable> iterable) {
        ObjectHelper.requireNonNull(iterable, "resources is null");
        this.resources = new LinkedList();
        for (Disposable disposable : iterable) {
            ObjectHelper.requireNonNull(disposable, "Disposable item is null");
            this.resources.add(disposable);
        }
    }

    public ListCompositeDisposable(Disposable... disposableArr) {
        ObjectHelper.requireNonNull(disposableArr, "resources is null");
        this.resources = new LinkedList();
        for (Disposable disposable : disposableArr) {
            ObjectHelper.requireNonNull(disposable, "Disposable item is null");
            this.resources.add(disposable);
        }
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean add(Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "d is null");
        if (!this.disposed) {
            synchronized (this) {
                if (!this.disposed) {
                    List list = this.resources;
                    if (list == null) {
                        list = new LinkedList();
                        this.resources = list;
                    }
                    list.add(disposable);
                    return true;
                }
            }
        }
        disposable.dispose();
        return false;
    }

    public boolean addAll(Disposable... disposableArr) {
        ObjectHelper.requireNonNull(disposableArr, "ds is null");
        if (!this.disposed) {
            synchronized (this) {
                if (!this.disposed) {
                    List list = this.resources;
                    if (list == null) {
                        list = new LinkedList();
                        this.resources = list;
                    }
                    for (Disposable disposable : disposableArr) {
                        ObjectHelper.requireNonNull(disposable, "d is null");
                        list.add(disposable);
                    }
                    return true;
                }
            }
        }
        for (Disposable disposable2 : disposableArr) {
            disposable2.dispose();
        }
        return false;
    }

    public void clear() {
        if (this.disposed) {
            return;
        }
        synchronized (this) {
            try {
                if (this.disposed) {
                    return;
                }
                List<Disposable> list = this.resources;
                this.resources = null;
                dispose(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean delete(Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "Disposable item is null");
        if (this.disposed) {
            return false;
        }
        synchronized (this) {
            if (this.disposed) {
                return false;
            }
            List<Disposable> list = this.resources;
            if (list != null && list.remove(disposable)) {
                return true;
            }
            return false;
        }
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        if (this.disposed) {
            return;
        }
        synchronized (this) {
            try {
                if (this.disposed) {
                    return;
                }
                this.disposed = true;
                List<Disposable> list = this.resources;
                this.resources = null;
                dispose(list);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void dispose(java.util.List<io.reactivex.disposables.Disposable> r7) {
        /*
            r6 = this;
            r2 = r6
            if (r7 != 0) goto L5
            r4 = 7
            return
        L5:
            r0 = 0
            r4 = 3
            java.util.Iterator r4 = r7.iterator()
            r7 = r4
        Lc:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r7.next()
            io.reactivex.disposables.Disposable r1 = (io.reactivex.disposables.Disposable) r1
            r5 = 3
            r1.dispose()     // Catch: java.lang.Throwable -> L1d
            goto Lc
        L1d:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            if (r0 != 0) goto L2b
            r5 = 2
            java.util.ArrayList r0 = new java.util.ArrayList
            r4 = 2
            r0.<init>()
            r4 = 1
        L2b:
            r5 = 5
            r0.add(r1)
            goto Lc
        L30:
            if (r0 == 0) goto L52
            r4 = 4
            int r7 = r0.size()
            r5 = 1
            r1 = r5
            if (r7 != r1) goto L4a
            r5 = 7
            r7 = 0
            java.lang.Object r7 = r0.get(r7)
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            r5 = 1
            java.lang.RuntimeException r7 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r7)
            throw r7
            r5 = 6
        L4a:
            r5 = 2
            io.reactivex.exceptions.CompositeException r7 = new io.reactivex.exceptions.CompositeException
            r7.<init>(r0)
            throw r7
            r5 = 2
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.disposables.ListCompositeDisposable.dispose(java.util.List):void");
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.disposed;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean remove(Disposable disposable) {
        if (delete(disposable)) {
            disposable.dispose();
            return true;
        }
        return false;
    }
}
