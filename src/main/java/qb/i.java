package qb;

import android.util.Log;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import g4.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class i extends jd.e implements fc.a {

    /* renamed from: m  reason: collision with root package name */
    public final List<mc.b<f>> f14463m;
    public final m n;

    /* renamed from: c  reason: collision with root package name */
    public final Map<b<?>, mc.b<?>> f14460c = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, mc.b<?>> f14461f = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public final Map<Class<?>, o<?>> f14462j = new HashMap();

    /* renamed from: t  reason: collision with root package name */
    public final AtomicReference<Boolean> f14464t = new AtomicReference<>();

    public i(Executor executor, Iterable iterable, Collection collection, a aVar) {
        m mVar = new m(executor);
        this.n = mVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(b.c(mVar, m.class, kc.d.class, kc.c.class));
        arrayList.add(b.c(this, fc.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar != null) {
                arrayList.add(bVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : iterable) {
            arrayList2.add(obj);
        }
        this.f14463m = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                try {
                    f fVar = (f) ((mc.b) it2.next()).get();
                    if (fVar != null) {
                        arrayList.addAll(fVar.getComponents());
                        it2.remove();
                    }
                } catch (InvalidRegistrarException e10) {
                    it2.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            if (this.f14460c.isEmpty()) {
                k.a(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f14460c.keySet());
                arrayList4.addAll(arrayList);
                k.a(arrayList4);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                final b<?> bVar2 = (b) it3.next();
                this.f14460c.put(bVar2, new n(new mc.b() { // from class: qb.g
                    @Override // mc.b
                    public final Object get() {
                        i iVar = i.this;
                        b bVar3 = bVar2;
                        Objects.requireNonNull(iVar);
                        return bVar3.f14449e.a(new r(bVar3, iVar));
                    }
                }));
            }
            arrayList3.addAll(k(arrayList));
            arrayList3.addAll(l());
            j();
        }
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        Boolean bool = this.f14464t.get();
        if (bool != null) {
            i(this.f14460c, bool.booleanValue());
        }
    }

    @Override // qb.c
    public synchronized <T> mc.b<T> b(Class<T> cls) {
        Objects.requireNonNull(cls, "Null interface requested.");
        return (mc.b<T>) this.f14461f.get(cls);
    }

    @Override // qb.c
    public synchronized <T> mc.b<Set<T>> d(Class<T> cls) {
        o<?> oVar = this.f14462j.get(cls);
        if (oVar != null) {
            return oVar;
        }
        return new mc.b() { // from class: qb.h
            @Override // mc.b
            public final Object get() {
                return Collections.emptySet();
            }
        };
    }

    @Override // qb.c
    public <T> mc.a<T> f(Class<T> cls) {
        mc.b<T> b10 = b(cls);
        return b10 == null ? new q(k0.c.F, p.f14481a) : b10 instanceof q ? (q) b10 : new q(null, b10);
    }

    public final void i(Map<b<?>, mc.b<?>> map, boolean z10) {
        Queue<kc.a<?>> queue;
        Set<Map.Entry<kc.b<Object>, Executor>> emptySet;
        loop0: while (true) {
            for (Map.Entry<b<?>, mc.b<?>> entry : map.entrySet()) {
                mc.b<?> value = entry.getValue();
                int i10 = entry.getKey().f14448c;
                boolean z11 = false;
                if (!(i10 == 1)) {
                    if (i10 == 2) {
                        z11 = true;
                    }
                    if (!z11 || !z10) {
                    }
                }
                value.get();
            }
            break loop0;
        }
        m mVar = this.n;
        synchronized (mVar) {
            queue = mVar.f14475b;
            if (queue != null) {
                mVar.f14475b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (kc.a<?> aVar : queue) {
                Objects.requireNonNull(aVar);
                synchronized (mVar) {
                    try {
                        Queue<kc.a<?>> queue2 = mVar.f14475b;
                        if (queue2 != null) {
                            queue2.add(aVar);
                        } else {
                            synchronized (mVar) {
                                try {
                                    ConcurrentHashMap<kc.b<Object>, Executor> concurrentHashMap = mVar.f14474a.get(null);
                                    emptySet = concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            for (Map.Entry<kc.b<Object>, Executor> entry2 : emptySet) {
                                entry2.getValue().execute(new k0.b(entry2, aVar, 7));
                            }
                        }
                    } finally {
                    }
                }
            }
        }
    }

    public final void j() {
        for (b<?> bVar : this.f14460c.keySet()) {
            while (true) {
                for (l lVar : bVar.f14447b) {
                    if (lVar.a() && !this.f14462j.containsKey(lVar.f14471a)) {
                        this.f14462j.put(lVar.f14471a, new o<>(Collections.emptySet()));
                    } else if (this.f14461f.containsKey(lVar.f14471a)) {
                        break;
                    } else {
                        if (lVar.f14472b == 1) {
                            throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", bVar, lVar.f14471a));
                        }
                        if (!lVar.a()) {
                            this.f14461f.put(lVar.f14471a, new q(k0.c.F, p.f14481a));
                        }
                    }
                }
            }
        }
    }

    public final List<Runnable> k(List<b<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (b<?> bVar : list) {
            if (bVar.b()) {
                mc.b<?> bVar2 = this.f14460c.get(bVar);
                for (Class<? super Object> cls : bVar.f14446a) {
                    if (this.f14461f.containsKey(cls)) {
                        arrayList.add(new l8.m((q) this.f14461f.get(cls), bVar2, 1));
                    } else {
                        this.f14461f.put(cls, bVar2);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<Runnable> l() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        loop0: while (true) {
            for (Map.Entry<b<?>, mc.b<?>> entry : this.f14460c.entrySet()) {
                b<?> key = entry.getKey();
                if (!key.b()) {
                    mc.b<?> value = entry.getValue();
                    for (Class<? super Object> cls : key.f14446a) {
                        if (!hashMap.containsKey(cls)) {
                            hashMap.put(cls, new HashSet());
                        }
                        ((Set) hashMap.get(cls)).add(value);
                    }
                }
            }
            break loop0;
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.f14462j.containsKey(entry2.getKey())) {
                o<?> oVar = this.f14462j.get(entry2.getKey());
                for (mc.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new s(oVar, bVar, 5));
                }
            } else {
                this.f14462j.put((Class) entry2.getKey(), new o<>((Set) ((Collection) entry2.getValue())));
            }
        }
        return arrayList;
    }
}
