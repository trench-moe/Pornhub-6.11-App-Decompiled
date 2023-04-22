package n1;

import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes2.dex */
public abstract class i<T> extends AbstractList<T> {
    public static final /* synthetic */ int B = 0;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f13224c;

    /* renamed from: f  reason: collision with root package name */
    public final Executor f13225f;

    /* renamed from: j  reason: collision with root package name */
    public final b f13226j;

    /* renamed from: m  reason: collision with root package name */
    public final k<T> f13227m;

    /* renamed from: u  reason: collision with root package name */
    public final int f13229u;
    public int n = 0;

    /* renamed from: t  reason: collision with root package name */
    public T f13228t = null;

    /* renamed from: w  reason: collision with root package name */
    public int f13230w = IntCompanionObject.MAX_VALUE;
    public int y = IntCompanionObject.MIN_VALUE;

    /* renamed from: z  reason: collision with root package name */
    public final AtomicBoolean f13231z = new AtomicBoolean(false);
    public final ArrayList<WeakReference<a>> A = new ArrayList<>();

    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract void a(int i10, int i11);

        public abstract void b(int i10, int i11);
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f13232a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13233b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f13234c;
        public final int d;

        public b(int i10, int i11, boolean z10, int i12, int i13) {
            this.f13232a = i10;
            this.f13233b = i11;
            this.f13234c = z10;
            this.d = i12;
        }
    }

    public i(k kVar, Executor executor, Executor executor2, b bVar) {
        this.f13227m = kVar;
        this.f13224c = executor;
        this.f13225f = executor2;
        this.f13226j = bVar;
        this.f13229u = (bVar.f13233b * 2) + bVar.f13232a;
    }

    public void e(List<T> list, a aVar) {
        if (list != null && list != this) {
            if (!list.isEmpty()) {
                h((i) list, aVar);
            } else if (!this.f13227m.isEmpty()) {
                aVar.b(0, this.f13227m.size());
            }
        }
        int size = this.A.size();
        while (true) {
            size--;
            if (size < 0) {
                this.A.add(new WeakReference<>(aVar));
                return;
            } else if (this.A.get(size).get() == null) {
                this.A.remove(size);
            }
        }
    }

    public void g() {
        this.f13231z.set(true);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        T t2 = this.f13227m.get(i10);
        if (t2 != null) {
            this.f13228t = t2;
        }
        return t2;
    }

    public abstract void h(i<T> iVar, a aVar);

    public abstract e<?, T> j();

    public abstract Object l();

    public abstract boolean m();

    public boolean o() {
        return this.f13231z.get();
    }

    public boolean p() {
        return o();
    }

    public void q(int i10) {
        if (i10 < 0 || i10 >= size()) {
            StringBuilder n = a1.a.n("Index: ", i10, ", Size: ");
            n.append(size());
            throw new IndexOutOfBoundsException(n.toString());
        }
        this.n = this.f13227m.f13241m + i10;
        r(i10);
        this.f13230w = Math.min(this.f13230w, i10);
        this.y = Math.max(this.y, i10);
    }

    public abstract void r(int i10);

    public void s(int i10, int i11) {
        if (i11 != 0) {
            int size = this.A.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                a aVar = this.A.get(size).get();
                if (aVar != null) {
                    aVar.a(i10, i11);
                }
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f13227m.size();
    }

    public void u(int i10, int i11) {
        if (i11 == 0) {
            return;
        }
        int size = this.A.size();
        while (true) {
            while (true) {
                size--;
                if (size < 0) {
                    return;
                }
                a aVar = this.A.get(size).get();
                if (aVar != null) {
                    aVar.b(i10, i11);
                }
            }
        }
    }

    public void w(a aVar) {
        for (int size = this.A.size() - 1; size >= 0; size--) {
            a aVar2 = this.A.get(size).get();
            if (aVar2 != null && aVar2 != aVar) {
            }
            this.A.remove(size);
        }
    }
}
