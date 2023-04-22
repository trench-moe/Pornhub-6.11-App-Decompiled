package com.google.android.gms.internal.cast;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class z0 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater<e1, Thread> f6914a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater<e1, e1> f6915b;

    /* renamed from: c  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater<f1, e1> f6916c;
    public final AtomicReferenceFieldUpdater<f1, y0> d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReferenceFieldUpdater<f1, Object> f6917e;

    public z0(AtomicReferenceFieldUpdater<e1, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<e1, e1> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<f1, e1> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<f1, y0> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<f1, Object> atomicReferenceFieldUpdater5) {
        this.f6914a = atomicReferenceFieldUpdater;
        this.f6915b = atomicReferenceFieldUpdater2;
        this.f6916c = atomicReferenceFieldUpdater3;
        this.d = atomicReferenceFieldUpdater4;
        this.f6917e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.cast.w0
    public final void a(e1 e1Var, e1 e1Var2) {
        this.f6915b.lazySet(e1Var, e1Var2);
    }

    @Override // com.google.android.gms.internal.cast.w0
    public final void b(e1 e1Var, Thread thread) {
        this.f6914a.lazySet(e1Var, thread);
    }

    @Override // com.google.android.gms.internal.cast.w0
    public final boolean c(f1<?> f1Var, y0 y0Var, y0 y0Var2) {
        AtomicReferenceFieldUpdater<f1, y0> atomicReferenceFieldUpdater = this.d;
        while (!atomicReferenceFieldUpdater.compareAndSet(f1Var, y0Var, y0Var2)) {
            if (atomicReferenceFieldUpdater.get(f1Var) != y0Var) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.cast.w0
    public final boolean d(f1<?> f1Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater<f1, Object> atomicReferenceFieldUpdater = this.f6917e;
        while (!atomicReferenceFieldUpdater.compareAndSet(f1Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(f1Var) != obj) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.cast.w0
    public final boolean e(f1<?> f1Var, e1 e1Var, e1 e1Var2) {
        AtomicReferenceFieldUpdater<f1, e1> atomicReferenceFieldUpdater = this.f6916c;
        while (!atomicReferenceFieldUpdater.compareAndSet(f1Var, e1Var, e1Var2)) {
            if (atomicReferenceFieldUpdater.get(f1Var) != e1Var) {
                return false;
            }
        }
        return true;
    }
}
