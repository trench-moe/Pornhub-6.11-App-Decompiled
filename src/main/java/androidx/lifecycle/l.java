package androidx.lifecycle;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import m.b;

/* loaded from: classes.dex */
public class l extends Lifecycle {

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference<k> f2376c;

    /* renamed from: a  reason: collision with root package name */
    public m.a<j, a> f2374a = new m.a<>();
    public int d = 0;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2377e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f2378f = false;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<Lifecycle.State> f2379g = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public Lifecycle.State f2375b = Lifecycle.State.INITIALIZED;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2380h = true;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Lifecycle.State f2381a;

        /* renamed from: b  reason: collision with root package name */
        public i f2382b;

        public a(j jVar, Lifecycle.State state) {
            i reflectiveGenericLifecycleObserver;
            Map<Class<?>, Integer> map = n.f2383a;
            boolean z10 = jVar instanceof i;
            boolean z11 = jVar instanceof e;
            if (z10 && z11) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((e) jVar, (i) jVar);
            } else if (z11) {
                reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((e) jVar, null);
            } else if (z10) {
                reflectiveGenericLifecycleObserver = (i) jVar;
            } else {
                Class<?> cls = jVar.getClass();
                if (n.c(cls) == 2) {
                    List list = (List) ((HashMap) n.f2384b).get(cls);
                    if (list.size() == 1) {
                        reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(n.a((Constructor) list.get(0), jVar));
                    } else {
                        f[] fVarArr = new f[list.size()];
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            fVarArr[i10] = n.a((Constructor) list.get(i10), jVar);
                        }
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(fVarArr);
                    }
                } else {
                    reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(jVar);
                }
            }
            this.f2382b = reflectiveGenericLifecycleObserver;
            this.f2381a = state;
        }

        public void a(k kVar, Lifecycle.Event event) {
            Lifecycle.State b10 = event.b();
            this.f2381a = l.f(this.f2381a, b10);
            this.f2382b.c(kVar, event);
            this.f2381a = b10;
        }
    }

    public l(k kVar) {
        this.f2376c = new WeakReference<>(kVar);
    }

    public static Lifecycle.State f(Lifecycle.State state, Lifecycle.State state2) {
        if (state2 != null && state2.compareTo(state) < 0) {
            state = state2;
        }
        return state;
    }

    @Override // androidx.lifecycle.Lifecycle
    public void a(j jVar) {
        k kVar;
        d("addObserver");
        Lifecycle.State state = this.f2375b;
        Lifecycle.State state2 = Lifecycle.State.DESTROYED;
        if (state != state2) {
            state2 = Lifecycle.State.INITIALIZED;
        }
        a aVar = new a(jVar, state2);
        if (this.f2374a.h(jVar, aVar) == null && (kVar = this.f2376c.get()) != null) {
            boolean z10 = this.d != 0 || this.f2377e;
            Lifecycle.State c10 = c(jVar);
            this.d++;
            while (aVar.f2381a.compareTo(c10) < 0 && this.f2374a.n.containsKey(jVar)) {
                this.f2379g.add(aVar.f2381a);
                Lifecycle.Event c11 = Lifecycle.Event.c(aVar.f2381a);
                if (c11 == null) {
                    StringBuilder m10 = a1.a.m("no event up from ");
                    m10.append(aVar.f2381a);
                    throw new IllegalStateException(m10.toString());
                }
                aVar.a(kVar, c11);
                h();
                c10 = c(jVar);
            }
            if (!z10) {
                j();
            }
            this.d--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    public void b(j jVar) {
        d("removeObserver");
        this.f2374a.j(jVar);
    }

    public final Lifecycle.State c(j jVar) {
        ArrayList<Lifecycle.State> arrayList;
        m.a<j, a> aVar = this.f2374a;
        Lifecycle.State state = null;
        b.c<j, a> cVar = aVar.n.containsKey(jVar) ? aVar.n.get(jVar).f12850m : null;
        Lifecycle.State state2 = cVar != null ? cVar.f12848f.f2381a : null;
        if (!this.f2379g.isEmpty()) {
            state = this.f2379g.get(arrayList.size() - 1);
        }
        return f(f(this.f2375b, state2), state);
    }

    @SuppressLint({"RestrictedApi"})
    public final void d(String str) {
        if (this.f2380h && !l.a.s().k()) {
            throw new IllegalStateException(android.support.v4.media.b.j("Method ", str, " must be called on the main thread"));
        }
    }

    public void e(Lifecycle.Event event) {
        d("handleLifecycleEvent");
        g(event.b());
    }

    public final void g(Lifecycle.State state) {
        if (this.f2375b == state) {
            return;
        }
        this.f2375b = state;
        if (!this.f2377e && this.d == 0) {
            this.f2377e = true;
            j();
            this.f2377e = false;
            return;
        }
        this.f2378f = true;
    }

    public final void h() {
        ArrayList<Lifecycle.State> arrayList = this.f2379g;
        arrayList.remove(arrayList.size() - 1);
    }

    public void i(Lifecycle.State state) {
        d("setCurrentState");
        g(state);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public final void j() {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.l.j():void");
    }
}
