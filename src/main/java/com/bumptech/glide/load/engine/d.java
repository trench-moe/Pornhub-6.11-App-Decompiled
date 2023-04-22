package com.bumptech.glide.load.engine;

import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.engine.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import n5.m;
import n5.o;
import t9.j0;
import v5.c;
import y5.d;

/* loaded from: classes.dex */
public final class d<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final List<m.a<?>> f5752a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<h5.b> f5753b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public com.bumptech.glide.d f5754c;
    public Object d;

    /* renamed from: e  reason: collision with root package name */
    public int f5755e;

    /* renamed from: f  reason: collision with root package name */
    public int f5756f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f5757g;

    /* renamed from: h  reason: collision with root package name */
    public DecodeJob.d f5758h;

    /* renamed from: i  reason: collision with root package name */
    public h5.d f5759i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, h5.g<?>> f5760j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f5761k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5762l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f5763m;
    public h5.b n;

    /* renamed from: o  reason: collision with root package name */
    public Priority f5764o;

    /* renamed from: p  reason: collision with root package name */
    public j5.d f5765p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5766q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5767r;

    public List<h5.b> a() {
        if (!this.f5763m) {
            this.f5763m = true;
            this.f5753b.clear();
            List<m.a<?>> c10 = c();
            int size = c10.size();
            for (int i10 = 0; i10 < size; i10++) {
                m.a<?> aVar = c10.get(i10);
                if (!this.f5753b.contains(aVar.f13338a)) {
                    this.f5753b.add(aVar.f13338a);
                }
                for (int i11 = 0; i11 < aVar.f13339b.size(); i11++) {
                    if (!this.f5753b.contains(aVar.f13339b.get(i11))) {
                        this.f5753b.add(aVar.f13339b.get(i11));
                    }
                }
            }
        }
        return this.f5753b;
    }

    public l5.a b() {
        return ((f.c) this.f5758h).a();
    }

    public List<m.a<?>> c() {
        if (!this.f5762l) {
            this.f5762l = true;
            this.f5752a.clear();
            List f10 = this.f5754c.f5642b.f(this.d);
            int size = f10.size();
            for (int i10 = 0; i10 < size; i10++) {
                m.a<?> b10 = ((m) f10.get(i10)).b(this.d, this.f5755e, this.f5756f, this.f5759i);
                if (b10 != null) {
                    this.f5752a.add(b10);
                }
            }
        }
        return this.f5752a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <Data> i<Data, ?, Transcode> d(Class<Data> cls) {
        i<Data, ?, Transcode> iVar;
        ArrayList arrayList;
        v5.b bVar;
        Registry registry = this.f5754c.f5642b;
        Class<?> cls2 = this.f5757g;
        Class cls3 = (Class<Transcode>) this.f5761k;
        y5.b bVar2 = registry.f5616i;
        d6.k andSet = bVar2.f18413b.getAndSet(null);
        if (andSet == null) {
            andSet = new d6.k();
        }
        andSet.f8800a = cls;
        andSet.f8801b = cls2;
        andSet.f8802c = cls3;
        synchronized (bVar2.f18412a) {
            iVar = (i<Data, ?, Transcode>) bVar2.f18412a.getOrDefault(andSet, null);
        }
        bVar2.f18413b.set(andSet);
        Objects.requireNonNull(registry.f5616i);
        if (y5.b.f18411c.equals(iVar)) {
            return null;
        }
        if (iVar == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((ArrayList) registry.f5611c.b(cls, cls2)).iterator();
            while (it.hasNext()) {
                Class<?> cls4 = (Class) it.next();
                Iterator it2 = ((ArrayList) registry.f5613f.a(cls4, cls3)).iterator();
                while (it2.hasNext()) {
                    Class<?> cls5 = (Class) it2.next();
                    y5.d dVar = registry.f5611c;
                    synchronized (dVar) {
                        arrayList = new ArrayList();
                        for (String str : dVar.f18416a) {
                            List<d.a<?, ?>> list = dVar.f18417b.get(str);
                            if (list != null) {
                                for (d.a<?, ?> aVar : list) {
                                    if (aVar.a(cls, cls4)) {
                                        arrayList.add(aVar.f18420c);
                                    }
                                }
                            }
                        }
                    }
                    v5.c cVar = registry.f5613f;
                    synchronized (cVar) {
                        if (!cls5.isAssignableFrom(cls4)) {
                            for (c.a<?, ?> aVar2 : cVar.f16020a) {
                                if (aVar2.a(cls4, cls5)) {
                                    bVar = aVar2.f16023c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                        }
                        bVar = j0.f15267t;
                    }
                    arrayList2.add(new e(cls, cls4, cls5, arrayList, bVar, registry.f5617j));
                }
            }
            i<Data, ?, Transcode> iVar2 = arrayList2.isEmpty() ? null : new i<>(cls, cls2, cls3, arrayList2, registry.f5617j);
            y5.b bVar3 = registry.f5616i;
            synchronized (bVar3.f18412a) {
                bVar3.f18412a.put(new d6.k(cls, cls2, cls3), iVar2 != null ? iVar2 : y5.b.f18411c);
            }
            return iVar2;
        }
        return iVar;
    }

    public List<Class<?>> e() {
        List<Class<?>> list;
        ArrayList arrayList;
        List<Class<?>> d;
        Registry registry = this.f5754c.f5642b;
        Class<?> cls = this.d.getClass();
        Class<?> cls2 = this.f5757g;
        Class cls3 = (Class<Transcode>) this.f5761k;
        y5.c cVar = registry.f5615h;
        d6.k kVar = (d6.k) ((AtomicReference) cVar.f18414c).getAndSet(null);
        if (kVar == null) {
            kVar = new d6.k(cls, cls2, cls3);
        } else {
            kVar.f8800a = cls;
            kVar.f8801b = cls2;
            kVar.f8802c = cls3;
        }
        synchronized (((p.a) cVar.f18415f)) {
            list = (List) ((p.a) cVar.f18415f).getOrDefault(kVar, null);
        }
        ((AtomicReference) cVar.f18414c).set(kVar);
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            o oVar = registry.f5609a;
            synchronized (oVar) {
                d = oVar.f13341a.d(cls);
            }
            Iterator it = ((ArrayList) d).iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) registry.f5611c.b((Class) it.next(), cls2)).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!((ArrayList) registry.f5613f.a(cls4, cls3)).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            y5.c cVar2 = registry.f5615h;
            List unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (((p.a) cVar2.f18415f)) {
                ((p.a) cVar2.f18415f).put(new d6.k(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        } else {
            arrayList = list;
        }
        return arrayList;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public <X> h5.a<X> f(X r9) {
        /*
            r8 = this;
            com.bumptech.glide.d r0 = r8.f5754c
            com.bumptech.glide.Registry r0 = r0.f5642b
            r7 = 4
            y5.a r0 = r0.f5610b
            r6 = 6
            java.lang.Class r1 = r9.getClass()
            monitor-enter(r0)
            java.util.List<y5.a$a<?>> r2 = r0.f18408a     // Catch: java.lang.Throwable -> L42
            r7 = 5
            java.util.Iterator r5 = r2.iterator()     // Catch: java.lang.Throwable -> L42
            r2 = r5
        L15:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L30
            r7 = 6
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L42
            y5.a$a r3 = (y5.a.C0307a) r3     // Catch: java.lang.Throwable -> L42
            java.lang.Class<T> r4 = r3.f18409a     // Catch: java.lang.Throwable -> L42
            r6 = 2
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L15
            h5.a<T> r1 = r3.f18410b     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            r6 = 2
            goto L34
        L30:
            r7 = 5
            r5 = 0
            r1 = r5
            monitor-exit(r0)
        L34:
            if (r1 == 0) goto L37
            return r1
        L37:
            com.bumptech.glide.Registry$NoSourceEncoderAvailableException r0 = new com.bumptech.glide.Registry$NoSourceEncoderAvailableException
            java.lang.Class r9 = r9.getClass()
            r0.<init>(r9)
            throw r0
            r6 = 2
        L42:
            r9 = move-exception
            monitor-exit(r0)
            throw r9
            r7 = 5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.d.f(java.lang.Object):h5.a");
    }

    public <Z> h5.g<Z> g(Class<Z> cls) {
        h5.g<Z> gVar = (h5.g<Z>) this.f5760j.get(cls);
        if (gVar == null) {
            Iterator<Map.Entry<Class<?>, h5.g<?>>> it = this.f5760j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, h5.g<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    gVar = (h5.g<Z>) next.getValue();
                    break;
                }
            }
        }
        if (gVar == null) {
            if (this.f5760j.isEmpty() && this.f5766q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return (p5.b) p5.b.f13803b;
        }
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean h(Class<?> cls) {
        return d(cls) != null;
    }
}
