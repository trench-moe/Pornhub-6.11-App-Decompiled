package oe;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13657b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "lastScheduledTask");

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13658c = AtomicIntegerFieldUpdater.newUpdater(j.class, "producerIndex");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(j.class, "consumerIndex");

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13659e = AtomicIntegerFieldUpdater.newUpdater(j.class, "blockingTasksInBuffer");

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceArray<f> f13660a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final f a(f fVar, boolean z10) {
        if (z10) {
            return b(fVar);
        }
        f fVar2 = (f) f13657b.getAndSet(this, fVar);
        if (fVar2 == null) {
            return null;
        }
        return b(fVar2);
    }

    public final f b(f fVar) {
        if (fVar.f13651f.f() == 1) {
            f13659e.incrementAndGet(this);
        }
        if (c() == 127) {
            return fVar;
        }
        int i10 = this.producerIndex & 127;
        while (this.f13660a.get(i10) != null) {
            Thread.yield();
        }
        this.f13660a.lazySet(i10, fVar);
        f13658c.incrementAndGet(this);
        return null;
    }

    public final int c() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int d() {
        return this.lastScheduledTask != null ? c() + 1 : c();
    }

    public final f e() {
        f fVar = (f) f13657b.getAndSet(this, null);
        return fVar == null ? f() : fVar;
    }

    public final f f() {
        f andSet;
        while (true) {
            int i10 = this.consumerIndex;
            if (i10 - this.producerIndex == 0) {
                return null;
            }
            int i11 = i10 & 127;
            if (d.compareAndSet(this, i10, i10 + 1) && (andSet = this.f13660a.getAndSet(i11, null)) != null) {
                if (andSet.f13651f.f() == 1) {
                    f13659e.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    public final long g(j jVar) {
        int i10 = jVar.consumerIndex;
        int i11 = jVar.producerIndex;
        AtomicReferenceArray<f> atomicReferenceArray = jVar.f13660a;
        while (true) {
            if (i10 == i11) {
                break;
            }
            int i12 = i10 & 127;
            if (jVar.blockingTasksInBuffer == 0) {
                break;
            }
            f fVar = atomicReferenceArray.get(i12);
            if (fVar != null) {
                if ((fVar.f13651f.f() == 1) && atomicReferenceArray.compareAndSet(i12, fVar, null)) {
                    f13659e.decrementAndGet(jVar);
                    a(fVar, false);
                    return -1L;
                }
            }
            i10++;
        }
        return h(jVar, true);
    }

    public final long h(j jVar, boolean z10) {
        f fVar;
        boolean z11;
        do {
            fVar = (f) jVar.lastScheduledTask;
            if (fVar == null) {
                return -2L;
            }
            z11 = true;
            if (z10) {
                if (!(fVar.f13651f.f() == 1)) {
                    return -2L;
                }
            }
            Objects.requireNonNull((e) i.f13656e);
            long nanoTime = System.nanoTime() - fVar.f13650c;
            long j10 = i.f13653a;
            if (nanoTime < j10) {
                return j10 - nanoTime;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13657b;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(jVar, fVar, null)) {
                    if (atomicReferenceFieldUpdater.get(jVar) != fVar) {
                        z11 = false;
                        continue;
                        break;
                    }
                }
            }
        } while (!z11);
        a(fVar, false);
        return -1L;
    }
}
