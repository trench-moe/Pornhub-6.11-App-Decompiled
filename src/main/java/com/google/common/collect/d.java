package com.google.common.collect;

/* loaded from: classes.dex */
public class d extends CompactHashMap<Object, Object>.b<Object> {
    public final /* synthetic */ CompactHashMap n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CompactHashMap compactHashMap) {
        super(null);
        this.n = compactHashMap;
    }

    @Override // com.google.common.collect.CompactHashMap.b
    public Object a(int i10) {
        return this.n.f7924m[i10];
    }
}
