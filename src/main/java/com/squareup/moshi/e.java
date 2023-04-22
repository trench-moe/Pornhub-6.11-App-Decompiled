package com.squareup.moshi;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class e extends c<Set<Object>, Object> {
    public e(f fVar) {
        super(fVar, null);
    }

    @Override // com.squareup.moshi.c
    public Set<Object> b() {
        return new LinkedHashSet();
    }
}
