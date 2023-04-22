package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultimap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kb.k;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements k<K, V> {
    private static final long serialVersionUID = 0;

    /* loaded from: classes.dex */
    public static final class a<K, V> extends ImmutableMultimap.a<K, V> {
        public ImmutableListMultimap<K, V> a() {
            Set<Map.Entry<K, Collection<V>>> entrySet = this.f7955a.entrySet();
            if (entrySet.isEmpty()) {
                return EmptyImmutableListMultimap.f7939t;
            }
            ImmutableMap.a aVar = new ImmutableMap.a(entrySet.size());
            int i10 = 0;
            for (Map.Entry<K, Collection<V>> entry : entrySet) {
                K key = entry.getKey();
                ImmutableList r10 = ImmutableList.r(entry.getValue());
                if (!r10.isEmpty()) {
                    aVar.c(key, r10);
                    i10 += r10.size();
                }
            }
            return new ImmutableListMultimap<>(aVar.a(), i10);
        }

        @CanIgnoreReturnValue
        public a<K, V> b(K k10, V... vArr) {
            List<V> asList = Arrays.asList(vArr);
            Collection<V> collection = this.f7955a.get(k10);
            if (collection != null) {
                for (V v2 : asList) {
                    kb.d.a(k10, v2);
                    collection.add(v2);
                }
            } else {
                Iterator it = asList.iterator();
                if (it.hasNext()) {
                    ArrayList arrayList = new ArrayList();
                    while (it.hasNext()) {
                        Object next = it.next();
                        kb.d.a(k10, next);
                        arrayList.add(next);
                    }
                    this.f7955a.put(k10, arrayList);
                }
            }
            return this;
        }
    }

    public ImmutableListMultimap(ImmutableMap<K, ImmutableList<V>> immutableMap, int i10) {
        super(immutableMap, i10);
    }

    public static <K, V> a<K, V> g() {
        return new a<>();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private void readObject(java.io.ObjectInputStream r15) {
        /*
            Method dump skipped, instructions count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableListMultimap.readObject(java.io.ObjectInputStream):void");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(a().size());
        for (Map.Entry<K, V> entry : a().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object obj : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(obj);
            }
        }
    }

    public ImmutableList<V> h(@NullableDecl K k10) {
        ImmutableList<V> immutableList = (ImmutableList) this.f7953m.get(k10);
        if (immutableList == null) {
            kb.a aVar = ImmutableList.f7944f;
            immutableList = (ImmutableList<V>) RegularImmutableList.n;
        }
        return immutableList;
    }
}
