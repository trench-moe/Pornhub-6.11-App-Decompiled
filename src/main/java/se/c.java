package se;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import se.d;
import t9.k0;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15012a;

    /* renamed from: b  reason: collision with root package name */
    public a f15013b;

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f15014c;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public final d f15015e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15016f;

    public c(d taskRunner, String name) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f15015e = taskRunner;
        this.f15016f = name;
        this.f15014c = new ArrayList();
    }

    public final void a() {
        byte[] bArr = qe.c.f14512a;
        synchronized (this.f15015e) {
            if (b()) {
                this.f15015e.e(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean b() {
        a aVar = this.f15013b;
        if (aVar != null) {
            Intrinsics.checkNotNull(aVar);
            if (aVar.d) {
                this.d = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f15014c.size() - 1; size >= 0; size--) {
            if (this.f15014c.get(size).d) {
                a aVar2 = this.f15014c.get(size);
                d.b bVar = d.f15019j;
                if (d.f15018i.isLoggable(Level.FINE)) {
                    k0.a(aVar2, this, "canceled");
                }
                this.f15014c.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final void c(a task, long j10) {
        Intrinsics.checkNotNullParameter(task, "task");
        synchronized (this.f15015e) {
            if (!this.f15012a) {
                if (d(task, j10, false)) {
                    this.f15015e.e(this);
                }
                Unit unit = Unit.INSTANCE;
            } else if (task.d) {
                d.b bVar = d.f15019j;
                if (d.f15018i.isLoggable(Level.FINE)) {
                    k0.a(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                d.b bVar2 = d.f15019j;
                if (d.f15018i.isLoggable(Level.FINE)) {
                    k0.a(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a task, long j10, boolean z10) {
        String sb2;
        Intrinsics.checkNotNullParameter(task, "task");
        Objects.requireNonNull(task);
        Intrinsics.checkNotNullParameter(this, "queue");
        c cVar = task.f15008a;
        if (cVar != this) {
            if (!(cVar == null)) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            task.f15008a = this;
        }
        long nanoTime = this.f15015e.f15025g.nanoTime();
        long j11 = nanoTime + j10;
        int indexOf = this.f15014c.indexOf(task);
        if (indexOf != -1) {
            if (task.f15009b <= j11) {
                d.b bVar = d.f15019j;
                if (d.f15018i.isLoggable(Level.FINE)) {
                    k0.a(task, this, "already scheduled");
                }
                return false;
            }
            this.f15014c.remove(indexOf);
        }
        task.f15009b = j11;
        d.b bVar2 = d.f15019j;
        if (d.f15018i.isLoggable(Level.FINE)) {
            if (z10) {
                StringBuilder m10 = a1.a.m("run again after ");
                m10.append(k0.e(j11 - nanoTime));
                sb2 = m10.toString();
            } else {
                StringBuilder m11 = a1.a.m("scheduled after ");
                m11.append(k0.e(j11 - nanoTime));
                sb2 = m11.toString();
            }
            k0.a(task, this, sb2);
        }
        Iterator<a> it = this.f15014c.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            }
            if (it.next().f15009b - nanoTime > j10) {
                break;
            }
            i10++;
        }
        if (i10 == -1) {
            i10 = this.f15014c.size();
        }
        this.f15014c.add(i10, task);
        return i10 == 0;
    }

    public final void e() {
        byte[] bArr = qe.c.f14512a;
        synchronized (this.f15015e) {
            this.f15012a = true;
            if (b()) {
                this.f15015e.e(this);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public String toString() {
        return this.f15016f;
    }
}
