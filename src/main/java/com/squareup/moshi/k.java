package com.squareup.moshi;

import com.squareup.moshi.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class k {
    public static final List<f.e> d;

    /* renamed from: a  reason: collision with root package name */
    public final List<f.e> f8552a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadLocal<c> f8553b = new ThreadLocal<>();

    /* renamed from: c  reason: collision with root package name */
    public final Map<Object, f<?>> f8554c = new LinkedHashMap();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<f.e> f8555a = new ArrayList();
    }

    /* loaded from: classes.dex */
    public static final class b<T> extends f<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f8556a;

        /* renamed from: b  reason: collision with root package name */
        public final String f8557b;

        /* renamed from: c  reason: collision with root package name */
        public final Object f8558c;
        public f<T> d;

        public b(Type type, String str, Object obj) {
            this.f8556a = type;
            this.f8557b = str;
            this.f8558c = obj;
        }

        @Override // com.squareup.moshi.f
        public T fromJson(JsonReader jsonReader) {
            f<T> fVar = this.d;
            if (fVar != null) {
                return fVar.fromJson(jsonReader);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        @Override // com.squareup.moshi.f
        public void toJson(jd.j jVar, T t2) {
            f<T> fVar = this.d;
            if (fVar == null) {
                throw new IllegalStateException("JsonAdapter isn't ready");
            }
            fVar.toJson(jVar, (jd.j) t2);
        }

        public String toString() {
            f<T> fVar = this.d;
            return fVar != null ? fVar.toString() : super.toString();
        }
    }

    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final List<b<?>> f8559a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Deque<b<?>> f8560b = new ArrayDeque();

        /* renamed from: c  reason: collision with root package name */
        public boolean f8561c;

        public c() {
        }

        public IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
            if (this.f8561c) {
                return illegalArgumentException;
            }
            this.f8561c = true;
            if (this.f8560b.size() == 1 && this.f8560b.getFirst().f8557b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<b<?>> descendingIterator = this.f8560b.descendingIterator();
            while (true) {
                while (descendingIterator.hasNext()) {
                    b<?> next = descendingIterator.next();
                    sb2.append("\nfor ");
                    sb2.append(next.f8556a);
                    if (next.f8557b != null) {
                        sb2.append(' ');
                        sb2.append(next.f8557b);
                    }
                }
                return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void b(boolean z10) {
            this.f8560b.removeLast();
            if (this.f8560b.isEmpty()) {
                k.this.f8553b.remove();
                if (z10) {
                    synchronized (k.this.f8554c) {
                        int size = this.f8559a.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            b<?> bVar = this.f8559a.get(i10);
                            f put = k.this.f8554c.put(bVar.f8558c, bVar.d);
                            if (put != null) {
                                bVar.d = put;
                                k.this.f8554c.put(bVar.f8558c, put);
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        d = arrayList;
        arrayList.add(m.f8563a);
        arrayList.add(com.squareup.moshi.c.f8533b);
        arrayList.add(j.f8549c);
        arrayList.add(com.squareup.moshi.a.f8524c);
        arrayList.add(l.f8562a);
        arrayList.add(com.squareup.moshi.b.d);
    }

    public k(a aVar) {
        int size = aVar.f8555a.size();
        List<f.e> list = d;
        ArrayList arrayList = new ArrayList(((ArrayList) list).size() + size);
        arrayList.addAll(aVar.f8555a);
        arrayList.addAll(list);
        this.f8552a = Collections.unmodifiableList(arrayList);
    }

    public <T> f<T> a(Class<T> cls) {
        return d(cls, kd.c.f12067a, null);
    }

    public <T> f<T> b(Type type) {
        return c(type, kd.c.f12067a);
    }

    public <T> f<T> c(Type type, Set<? extends Annotation> set) {
        return d(type, set, null);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public <T> com.squareup.moshi.f<T> d(java.lang.reflect.Type r13, java.util.Set<? extends java.lang.annotation.Annotation> r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.k.d(java.lang.reflect.Type, java.util.Set, java.lang.String):com.squareup.moshi.f");
    }
}
