package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f5650a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final Map<Class<?>, Object> f5651a = new HashMap();
    }

    public e(a aVar) {
        this.f5650a = Collections.unmodifiableMap(new HashMap(aVar.f5651a));
    }
}
