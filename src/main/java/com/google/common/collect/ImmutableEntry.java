package com.google.common.collect;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
class ImmutableEntry<K, V> extends kb.b<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    @NullableDecl
    public final K key;
    @NullableDecl
    public final V value;

    public ImmutableEntry(@NullableDecl K k10, @NullableDecl V v2) {
        this.key = k10;
        this.value = v2;
    }

    @Override // kb.b, java.util.Map.Entry
    @NullableDecl
    public final K getKey() {
        return this.key;
    }

    @Override // kb.b, java.util.Map.Entry
    @NullableDecl
    public final V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v2) {
        throw new UnsupportedOperationException();
    }
}
