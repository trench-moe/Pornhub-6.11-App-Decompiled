package qb;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class r extends jd.e {

    /* renamed from: c  reason: collision with root package name */
    public final Set<Class<?>> f14485c;

    /* renamed from: f  reason: collision with root package name */
    public final Set<Class<?>> f14486f;

    /* renamed from: j  reason: collision with root package name */
    public final Set<Class<?>> f14487j;

    /* renamed from: m  reason: collision with root package name */
    public final Set<Class<?>> f14488m;
    public final Set<Class<?>> n;

    /* renamed from: t  reason: collision with root package name */
    public final Set<Class<?>> f14489t;

    /* renamed from: u  reason: collision with root package name */
    public final c f14490u;

    /* loaded from: classes2.dex */
    public static class a implements kc.c {

        /* renamed from: a  reason: collision with root package name */
        public final kc.c f14491a;

        public a(Set<Class<?>> set, kc.c cVar) {
            this.f14491a = cVar;
        }
    }

    public r(b<?> bVar, c cVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (l lVar : bVar.f14447b) {
            int i10 = lVar.f14473c;
            if (!(i10 == 0)) {
                if (i10 == 2) {
                    hashSet3.add(lVar.f14471a);
                } else if (lVar.a()) {
                    hashSet5.add(lVar.f14471a);
                } else {
                    hashSet2.add(lVar.f14471a);
                }
            } else if (lVar.a()) {
                hashSet4.add(lVar.f14471a);
            } else {
                hashSet.add(lVar.f14471a);
            }
        }
        if (!bVar.f14450f.isEmpty()) {
            hashSet.add(kc.c.class);
        }
        this.f14485c = Collections.unmodifiableSet(hashSet);
        this.f14486f = Collections.unmodifiableSet(hashSet2);
        this.f14487j = Collections.unmodifiableSet(hashSet3);
        this.f14488m = Collections.unmodifiableSet(hashSet4);
        this.n = Collections.unmodifiableSet(hashSet5);
        this.f14489t = bVar.f14450f;
        this.f14490u = cVar;
    }

    @Override // jd.e, qb.c
    public <T> T a(Class<T> cls) {
        if (this.f14485c.contains(cls)) {
            T t2 = (T) this.f14490u.a(cls);
            return !cls.equals(kc.c.class) ? t2 : (T) new a(this.f14489t, (kc.c) t2);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
    }

    @Override // qb.c
    public <T> mc.b<T> b(Class<T> cls) {
        if (this.f14486f.contains(cls)) {
            return this.f14490u.b(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // qb.c
    public <T> mc.b<Set<T>> d(Class<T> cls) {
        if (this.n.contains(cls)) {
            return this.f14490u.d(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // jd.e, qb.c
    public <T> Set<T> e(Class<T> cls) {
        if (this.f14488m.contains(cls)) {
            return this.f14490u.e(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // qb.c
    public <T> mc.a<T> f(Class<T> cls) {
        if (this.f14487j.contains(cls)) {
            return this.f14490u.f(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", cls));
    }
}
