package com.google.common.collect;

import com.google.common.collect.MultimapBuilder;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class e extends MultimapBuilder.b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f7985a;

    public e(int i10) {
        this.f7985a = i10;
    }

    @Override // com.google.common.collect.MultimapBuilder.b
    public <K, V> Map<K, Collection<V>> a() {
        return new CompactHashMap(this.f7985a);
    }
}
