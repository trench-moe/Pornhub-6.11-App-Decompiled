package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import jb.k;

/* loaded from: classes.dex */
public abstract class MultimapBuilder<K0, V0> {

    /* loaded from: classes.dex */
    public static final class ArrayListSupplier<V> implements k<List<V>>, Serializable {
        private final int expectedValuesPerKey;

        public ArrayListSupplier(int i10) {
            kb.d.b(i10, "expectedValuesPerKey");
            this.expectedValuesPerKey = i10;
        }

        @Override // jb.k
        public Object get() {
            return new ArrayList(this.expectedValuesPerKey);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a<K0, V0> extends MultimapBuilder<K0, V0> {
        public a() {
            super(null);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b<K0> {
        public abstract <K extends K0, V> Map<K, Collection<V>> a();
    }

    public MultimapBuilder(e eVar) {
    }

    public static b<Comparable> a() {
        NaturalOrdering naturalOrdering = NaturalOrdering.f7963c;
        Objects.requireNonNull(naturalOrdering);
        return new f(naturalOrdering);
    }
}
