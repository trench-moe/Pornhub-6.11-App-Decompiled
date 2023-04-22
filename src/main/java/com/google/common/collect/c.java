package com.google.common.collect;

import com.google.common.collect.CompactHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class c extends CompactHashMap<Object, Object>.b<Map.Entry<Object, Object>> {
    public final /* synthetic */ CompactHashMap n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CompactHashMap compactHashMap) {
        super(null);
        this.n = compactHashMap;
    }

    @Override // com.google.common.collect.CompactHashMap.b
    public Map.Entry<Object, Object> a(int i10) {
        return new CompactHashMap.d(i10);
    }
}
