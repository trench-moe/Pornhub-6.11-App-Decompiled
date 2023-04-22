package com.google.common.collect;

import com.google.common.collect.MultimapBuilder;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class f extends MultimapBuilder.b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Comparator f7986a;

    public f(Comparator comparator) {
        this.f7986a = comparator;
    }

    @Override // com.google.common.collect.MultimapBuilder.b
    public <K, V> Map<K, Collection<V>> a() {
        return new TreeMap(this.f7986a);
    }
}
