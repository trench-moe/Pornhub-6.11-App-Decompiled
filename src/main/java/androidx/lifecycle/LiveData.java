package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f2333k = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final Object f2334a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public m.b<q<? super T>, LiveData<T>.c> f2335b = new m.b<>();

    /* renamed from: c  reason: collision with root package name */
    public int f2336c = 0;
    public boolean d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f2337e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Object f2338f;

    /* renamed from: g  reason: collision with root package name */
    public int f2339g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2340h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2341i;

    /* renamed from: j  reason: collision with root package name */
    public final Runnable f2342j;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements i {

        /* renamed from: e  reason: collision with root package name */
        public final k f2343e;

        public LifecycleBoundObserver(k kVar, q<? super T> qVar) {
            super(qVar);
            this.f2343e = kVar;
        }

        @Override // androidx.lifecycle.i
        public void c(k kVar, Lifecycle.Event event) {
            Lifecycle.State state = ((l) this.f2343e.b()).f2375b;
            if (state == Lifecycle.State.DESTROYED) {
                LiveData.this.k(this.f2346a);
                return;
            }
            Lifecycle.State state2 = null;
            while (state2 != state) {
                h(k());
                state2 = state;
                state = ((l) this.f2343e.b()).f2375b;
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public void i() {
            l lVar = (l) this.f2343e.b();
            lVar.d("removeObserver");
            lVar.f2374a.j(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean j(k kVar) {
            return this.f2343e == kVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return ((l) this.f2343e.b()).f2375b.compareTo(Lifecycle.State.STARTED) >= 0;
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f2334a) {
                try {
                    obj = LiveData.this.f2338f;
                    LiveData.this.f2338f = LiveData.f2333k;
                } catch (Throwable th) {
                    throw th;
                }
            }
            LiveData.this.l(obj);
        }
    }

    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        public b(LiveData liveData, q<? super T> qVar) {
            super(qVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final q<? super T> f2346a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2347b;

        /* renamed from: c  reason: collision with root package name */
        public int f2348c = -1;

        public c(q<? super T> qVar) {
            this.f2346a = qVar;
        }

        public void h(boolean z10) {
            if (z10 == this.f2347b) {
                return;
            }
            this.f2347b = z10;
            LiveData liveData = LiveData.this;
            int i10 = z10 ? 1 : -1;
            int i11 = liveData.f2336c;
            liveData.f2336c = i10 + i11;
            if (!liveData.d) {
                liveData.d = true;
                while (true) {
                    try {
                        int i12 = liveData.f2336c;
                        if (i11 == i12) {
                            break;
                        }
                        boolean z11 = i11 == 0 && i12 > 0;
                        boolean z12 = i11 > 0 && i12 == 0;
                        if (z11) {
                            liveData.h();
                        } else if (z12) {
                            liveData.i();
                        }
                        i11 = i12;
                    } finally {
                        liveData.d = false;
                    }
                }
            }
            if (this.f2347b) {
                LiveData.this.c(this);
            }
        }

        public void i() {
        }

        public boolean j(k kVar) {
            return false;
        }

        public abstract boolean k();
    }

    public LiveData() {
        Object obj = f2333k;
        this.f2338f = obj;
        this.f2342j = new a();
        this.f2337e = obj;
        this.f2339g = -1;
    }

    public static void a(String str) {
        if (!l.a.s().k()) {
            throw new IllegalStateException(android.support.v4.media.b.j("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(LiveData<T>.c cVar) {
        if (cVar.f2347b) {
            if (!cVar.k()) {
                cVar.h(false);
                return;
            }
            int i10 = cVar.f2348c;
            int i11 = this.f2339g;
            if (i10 >= i11) {
                return;
            }
            cVar.f2348c = i11;
            cVar.f2346a.a((Object) this.f2337e);
        }
    }

    public void c(LiveData<T>.c cVar) {
        if (this.f2340h) {
            this.f2341i = true;
            return;
        }
        this.f2340h = true;
        do {
            this.f2341i = false;
            if (cVar == null) {
                m.b<q<? super T>, LiveData<T>.c>.d e10 = this.f2335b.e();
                while (e10.hasNext()) {
                    b((c) ((Map.Entry) e10.next()).getValue());
                    if (this.f2341i) {
                        break;
                    }
                }
            } else {
                b(cVar);
                cVar = null;
            }
        } while (this.f2341i);
        this.f2340h = false;
    }

    public T d() {
        T t2 = (T) this.f2337e;
        if (t2 != f2333k) {
            return t2;
        }
        return null;
    }

    public boolean e() {
        return this.f2336c > 0;
    }

    public void f(k kVar, q<? super T> qVar) {
        a("observe");
        if (((l) kVar.b()).f2375b == Lifecycle.State.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(kVar, qVar);
        LiveData<T>.c h10 = this.f2335b.h(qVar, lifecycleBoundObserver);
        if (h10 != null && !h10.j(kVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (h10 != null) {
            return;
        }
        kVar.b().a(lifecycleBoundObserver);
    }

    public void g(q<? super T> qVar) {
        a("observeForever");
        b bVar = new b(this, qVar);
        LiveData<T>.c h10 = this.f2335b.h(qVar, bVar);
        if (h10 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (h10 != null) {
            return;
        }
        bVar.h(true);
    }

    public void h() {
    }

    public void i() {
    }

    public void j(T t2) {
        boolean z10;
        synchronized (this.f2334a) {
            try {
                z10 = this.f2338f == f2333k;
                this.f2338f = t2;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z10) {
            l.a.s().f12146a.q(this.f2342j);
        }
    }

    public void k(q<? super T> qVar) {
        a("removeObserver");
        LiveData<T>.c j10 = this.f2335b.j(qVar);
        if (j10 == null) {
            return;
        }
        j10.i();
        j10.h(false);
    }

    public void l(T t2) {
        a("setValue");
        this.f2339g++;
        this.f2337e = t2;
        c(null);
    }
}
