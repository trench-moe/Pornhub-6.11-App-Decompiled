package io.reactivex.disposables;

import io.reactivex.annotations.NonNull;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.OpenHashSet;

/* loaded from: classes2.dex */
public final class CompositeDisposable implements Disposable, DisposableContainer {
    public volatile boolean disposed;
    public OpenHashSet<Disposable> resources;

    public CompositeDisposable() {
    }

    public CompositeDisposable(@NonNull Iterable<? extends Disposable> iterable) {
        ObjectHelper.requireNonNull(iterable, "disposables is null");
        this.resources = new OpenHashSet<>();
        for (Disposable disposable : iterable) {
            ObjectHelper.requireNonNull(disposable, "A Disposable item in the disposables sequence is null");
            this.resources.add(disposable);
        }
    }

    public CompositeDisposable(@NonNull Disposable... disposableArr) {
        ObjectHelper.requireNonNull(disposableArr, "disposables is null");
        this.resources = new OpenHashSet<>(disposableArr.length + 1);
        for (Disposable disposable : disposableArr) {
            ObjectHelper.requireNonNull(disposable, "A Disposable in the disposables array is null");
            this.resources.add(disposable);
        }
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean add(@NonNull Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "disposable is null");
        if (!this.disposed) {
            synchronized (this) {
                if (!this.disposed) {
                    OpenHashSet<Disposable> openHashSet = this.resources;
                    if (openHashSet == null) {
                        openHashSet = new OpenHashSet<>();
                        this.resources = openHashSet;
                    }
                    openHashSet.add(disposable);
                    return true;
                }
            }
        }
        disposable.dispose();
        return false;
    }

    public boolean addAll(@NonNull Disposable... disposableArr) {
        ObjectHelper.requireNonNull(disposableArr, "disposables is null");
        if (!this.disposed) {
            synchronized (this) {
                if (!this.disposed) {
                    OpenHashSet<Disposable> openHashSet = this.resources;
                    if (openHashSet == null) {
                        openHashSet = new OpenHashSet<>(disposableArr.length + 1);
                        this.resources = openHashSet;
                    }
                    for (Disposable disposable : disposableArr) {
                        ObjectHelper.requireNonNull(disposable, "A Disposable in the disposables array is null");
                        openHashSet.add(disposable);
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
            if (this.disposed) {
                return;
            }
            OpenHashSet<Disposable> openHashSet = this.resources;
            this.resources = null;
            dispose(openHashSet);
        }
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean delete(@NonNull Disposable disposable) {
        ObjectHelper.requireNonNull(disposable, "disposables is null");
        if (this.disposed) {
            return false;
        }
        synchronized (this) {
            if (this.disposed) {
                return false;
            }
            OpenHashSet<Disposable> openHashSet = this.resources;
            if (openHashSet != null && openHashSet.remove(disposable)) {
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
            if (this.disposed) {
                return;
            }
            this.disposed = true;
            OpenHashSet<Disposable> openHashSet = this.resources;
            this.resources = null;
            dispose(openHashSet);
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
    public void dispose(io.reactivex.internal.util.OpenHashSet<io.reactivex.disposables.Disposable> r11) {
        /*
            r10 = this;
            r6 = r10
            if (r11 != 0) goto L4
            return
        L4:
            r8 = 2
            r9 = 0
            r0 = r9
            java.lang.Object[] r8 = r11.keys()
            r11 = r8
            int r1 = r11.length
            r2 = 0
            r3 = 0
            r9 = 4
        L10:
            if (r3 >= r1) goto L38
            r9 = 7
            r4 = r11[r3]
            r9 = 1
            boolean r5 = r4 instanceof io.reactivex.disposables.Disposable
            r8 = 4
            if (r5 == 0) goto L33
            io.reactivex.disposables.Disposable r4 = (io.reactivex.disposables.Disposable) r4     // Catch: java.lang.Throwable -> L22
            r8 = 2
            r4.dispose()     // Catch: java.lang.Throwable -> L22
            goto L34
        L22:
            r4 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
            if (r0 != 0) goto L2f
            r8 = 3
            java.util.ArrayList r0 = new java.util.ArrayList
            r8 = 5
            r0.<init>()
        L2f:
            r8 = 7
            r0.add(r4)
        L33:
            r8 = 4
        L34:
            int r3 = r3 + 1
            r9 = 5
            goto L10
        L38:
            if (r0 == 0) goto L58
            int r11 = r0.size()
            r1 = 1
            r8 = 7
            if (r11 != r1) goto L50
            java.lang.Object r11 = r0.get(r2)
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            r9 = 5
            java.lang.RuntimeException r9 = io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(r11)
            r11 = r9
            throw r11
            r9 = 1
        L50:
            io.reactivex.exceptions.CompositeException r11 = new io.reactivex.exceptions.CompositeException
            r9 = 7
            r11.<init>(r0)
            throw r11
            r8 = 5
        L58:
            r9 = 4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.disposables.CompositeDisposable.dispose(io.reactivex.internal.util.OpenHashSet):void");
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.disposed;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public boolean remove(@NonNull Disposable disposable) {
        if (delete(disposable)) {
            disposable.dispose();
            return true;
        }
        return false;
    }

    public int size() {
        int i10 = 0;
        if (this.disposed) {
            return 0;
        }
        synchronized (this) {
            if (this.disposed) {
                return 0;
            }
            OpenHashSet<Disposable> openHashSet = this.resources;
            if (openHashSet != null) {
                i10 = openHashSet.size();
            }
            return i10;
        }
    }
}
