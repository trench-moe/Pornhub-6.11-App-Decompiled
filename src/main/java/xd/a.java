package xd;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class a<K, V, V2> implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final Map<K, ie.a<V>> f18348a;

    public a(Map<K, ie.a<V>> map) {
        this.f18348a = Collections.unmodifiableMap(map);
    }
}
