package qb;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class m implements kc.d, kc.c {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, ConcurrentHashMap<kc.b<Object>, Executor>> f14474a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public Queue<kc.a<?>> f14475b = new ArrayDeque();

    public m(Executor executor) {
    }

    @Override // kc.d
    public synchronized <T> void a(Class<T> cls, Executor executor, kc.b<? super T> bVar) {
        if (!this.f14474a.containsKey(cls)) {
            this.f14474a.put(cls, new ConcurrentHashMap<>());
        }
        this.f14474a.get(cls).put(bVar, executor);
    }
}
