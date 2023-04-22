package com.bumptech.glide;

import com.bumptech.glide.load.data.e;
import e6.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import n5.m;
import n5.n;
import n5.o;
import n5.q;
import v5.c;
import y5.a;
import y5.d;
import y5.e;

/* loaded from: classes.dex */
public class Registry {

    /* renamed from: a  reason: collision with root package name */
    public final o f5609a;

    /* renamed from: b  reason: collision with root package name */
    public final y5.a f5610b;

    /* renamed from: c  reason: collision with root package name */
    public final y5.d f5611c;
    public final y5.e d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bumptech.glide.load.data.f f5612e;

    /* renamed from: f  reason: collision with root package name */
    public final v5.c f5613f;

    /* renamed from: g  reason: collision with root package name */
    public final o3.d f5614g;

    /* renamed from: h  reason: collision with root package name */
    public final y5.c f5615h = new y5.c(0);

    /* renamed from: i  reason: collision with root package name */
    public final y5.b f5616i = new y5.b();

    /* renamed from: j  reason: collision with root package name */
    public final m0.c<List<Throwable>> f5617j;

    /* loaded from: classes.dex */
    public static class MissingComponentException extends RuntimeException {
        public MissingComponentException(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static final class NoImageHeaderParserException extends MissingComponentException {
        public NoImageHeaderParserException() {
            super("Failed to find image header parser.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoModelLoaderAvailableException extends MissingComponentException {
        public NoModelLoaderAvailableException(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public NoModelLoaderAvailableException(java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = a1.a.m(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.NoModelLoaderAvailableException.<init>(java.lang.Object):void");
        }

        public <M> NoModelLoaderAvailableException(M m10, List<m<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }
    }

    /* loaded from: classes.dex */
    public static class NoResultEncoderAvailableException extends MissingComponentException {
        public NoResultEncoderAvailableException(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* loaded from: classes.dex */
    public static class NoSourceEncoderAvailableException extends MissingComponentException {
        public NoSourceEncoderAvailableException(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public Registry() {
        a.c cVar = new a.c(new m0.e(20), new e6.b(), new e6.c());
        this.f5617j = cVar;
        this.f5609a = new o(cVar);
        this.f5610b = new y5.a();
        this.f5611c = new y5.d();
        this.d = new y5.e();
        this.f5612e = new com.bumptech.glide.load.data.f();
        this.f5613f = new v5.c();
        this.f5614g = new o3.d(2);
        List<String> asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String str : asList) {
            arrayList.add(str);
        }
        arrayList.add("legacy_append");
        y5.d dVar = this.f5611c;
        synchronized (dVar) {
            ArrayList arrayList2 = new ArrayList(dVar.f18416a);
            dVar.f18416a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dVar.f18416a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                if (!arrayList.contains(str2)) {
                    dVar.f18416a.add(str2);
                }
            }
        }
    }

    public <Data> Registry a(Class<Data> cls, h5.a<Data> aVar) {
        y5.a aVar2 = this.f5610b;
        synchronized (aVar2) {
            try {
                aVar2.f18408a.add(new a.C0307a<>(cls, aVar));
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public <TResource> Registry b(Class<TResource> cls, h5.f<TResource> fVar) {
        y5.e eVar = this.d;
        synchronized (eVar) {
            try {
                eVar.f18421a.add(new e.a<>(cls, fVar));
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public <Model, Data> Registry c(Class<Model> cls, Class<Data> cls2, n<Model, Data> nVar) {
        o oVar = this.f5609a;
        synchronized (oVar) {
            try {
                q qVar = oVar.f13341a;
                synchronized (qVar) {
                    q.b<?, ?> bVar = new q.b<>(cls, cls2, nVar);
                    List<q.b<?, ?>> list = qVar.f13355a;
                    list.add(list.size(), bVar);
                }
                oVar.f13342b.f13343a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public <Data, TResource> Registry d(String str, Class<Data> cls, Class<TResource> cls2, h5.e<Data, TResource> eVar) {
        y5.d dVar = this.f5611c;
        synchronized (dVar) {
            dVar.a(str).add(new d.a<>(cls, cls2, eVar));
        }
        return this;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public java.util.List<com.bumptech.glide.load.ImageHeaderParser> e() {
        /*
            r6 = this;
            r2 = r6
            o3.d r0 = r2.f5614g
            monitor-enter(r0)
            r4 = 5
            java.lang.Object r1 = r0.f13543c     // Catch: java.lang.Throwable -> L1d
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            boolean r4 = r1.isEmpty()
            r0 = r4
            if (r0 != 0) goto L13
            r4 = 5
            return r1
        L13:
            r5 = 7
            com.bumptech.glide.Registry$NoImageHeaderParserException r0 = new com.bumptech.glide.Registry$NoImageHeaderParserException
            r5 = 2
            r0.<init>()
            r5 = 3
            throw r0
            r4 = 4
        L1d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
            r5 = 5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.e():java.util.List");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public <Model> java.util.List<n5.m<Model, ?>> f(Model r13) {
        /*
            r12 = this;
            n5.o r0 = r12.f5609a
            java.util.Objects.requireNonNull(r0)
            java.lang.Class r1 = r13.getClass()
            monitor-enter(r0)
            r10 = 5
            n5.o$a r2 = r0.f13342b     // Catch: java.lang.Throwable -> Lb1
            r11 = 7
            java.util.Map<java.lang.Class<?>, n5.o$a$a<?>> r2 = r2.f13343a     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> Lb1
            n5.o$a$a r2 = (n5.o.a.C0224a) r2     // Catch: java.lang.Throwable -> Lb1
            r11 = 2
            if (r2 != 0) goto L1c
            r8 = 0
            r2 = r8
            goto L1e
        L1c:
            java.util.List<n5.m<Model, ?>> r2 = r2.f13344a     // Catch: java.lang.Throwable -> Lb1
        L1e:
            if (r2 != 0) goto L5e
            r9 = 5
            n5.q r2 = r0.f13341a     // Catch: java.lang.Throwable -> Lb1
            r11 = 2
            java.util.List r8 = r2.a(r1)     // Catch: java.lang.Throwable -> Lb1
            r2 = r8
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch: java.lang.Throwable -> Lb1
            n5.o$a r3 = r0.f13342b     // Catch: java.lang.Throwable -> Lb1
            java.util.Map<java.lang.Class<?>, n5.o$a$a<?>> r3 = r3.f13343a     // Catch: java.lang.Throwable -> Lb1
            n5.o$a$a r4 = new n5.o$a$a     // Catch: java.lang.Throwable -> Lb1
            r9 = 1
            r4.<init>(r2)     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r8 = r3.put(r1, r4)     // Catch: java.lang.Throwable -> Lb1
            r3 = r8
            n5.o$a$a r3 = (n5.o.a.C0224a) r3     // Catch: java.lang.Throwable -> Lb1
            r11 = 3
            if (r3 != 0) goto L43
            r9 = 1
            goto L5e
        L43:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb1
            r9 = 5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb1
            r10 = 7
            r2.<init>()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r8 = "Already cached loaders for model: "
            r3 = r8
            r2.append(r3)     // Catch: java.lang.Throwable -> Lb1
            r2.append(r1)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> Lb1
            r13.<init>(r1)     // Catch: java.lang.Throwable -> Lb1
            r9 = 7
            throw r13     // Catch: java.lang.Throwable -> Lb1
        L5e:
            monitor-exit(r0)
            boolean r8 = r2.isEmpty()
            r0 = r8
            if (r0 != 0) goto La9
            int r0 = r2.size()
            java.util.List r8 = java.util.Collections.emptyList()
            r1 = r8
            r3 = 0
            r4 = 1
            r5 = 0
            r9 = 4
        L73:
            if (r5 >= r0) goto L99
            r9 = 1
            java.lang.Object r6 = r2.get(r5)
            n5.m r6 = (n5.m) r6
            r10 = 5
            boolean r8 = r6.a(r13)
            r7 = r8
            if (r7 == 0) goto L95
            if (r4 == 0) goto L92
            r9 = 3
            java.util.ArrayList r1 = new java.util.ArrayList
            r11 = 3
            int r4 = r0 - r5
            r1.<init>(r4)
            r10 = 4
            r8 = 0
            r4 = r8
        L92:
            r1.add(r6)
        L95:
            int r5 = r5 + 1
            r9 = 7
            goto L73
        L99:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto La0
            return r1
        La0:
            r9 = 6
            com.bumptech.glide.Registry$NoModelLoaderAvailableException r0 = new com.bumptech.glide.Registry$NoModelLoaderAvailableException
            r10 = 6
            r0.<init>(r13, r2)
            r11 = 5
            throw r0
        La9:
            com.bumptech.glide.Registry$NoModelLoaderAvailableException r0 = new com.bumptech.glide.Registry$NoModelLoaderAvailableException
            r11 = 4
            r0.<init>(r13)
            throw r0
            r10 = 2
        Lb1:
            r13 = move-exception
            monitor-exit(r0)
            r9 = 5
            throw r13
            r11 = 3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.Registry.f(java.lang.Object):java.util.List");
    }

    public <X> com.bumptech.glide.load.data.e<X> g(X x10) {
        com.bumptech.glide.load.data.e<X> eVar;
        com.bumptech.glide.load.data.f fVar = this.f5612e;
        synchronized (fVar) {
            try {
                Objects.requireNonNull(x10, "Argument must not be null");
                e.a<?> aVar = fVar.f5692a.get(x10.getClass());
                if (aVar == null) {
                    Iterator<e.a<?>> it = fVar.f5692a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        e.a<?> next = it.next();
                        if (next.a().isAssignableFrom(x10.getClass())) {
                            aVar = next;
                            break;
                        }
                    }
                }
                if (aVar == null) {
                    aVar = com.bumptech.glide.load.data.f.f5691b;
                }
                eVar = (com.bumptech.glide.load.data.e<X>) aVar.b(x10);
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public Registry h(e.a<?> aVar) {
        com.bumptech.glide.load.data.f fVar = this.f5612e;
        synchronized (fVar) {
            try {
                fVar.f5692a.put(aVar.a(), aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public <TResource, Transcode> Registry i(Class<TResource> cls, Class<Transcode> cls2, v5.b<TResource, Transcode> bVar) {
        v5.c cVar = this.f5613f;
        synchronized (cVar) {
            try {
                cVar.f16020a.add(new c.a<>(cls, cls2, bVar));
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }
}
