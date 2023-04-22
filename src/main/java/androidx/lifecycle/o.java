package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import m.b;

/* loaded from: classes.dex */
public class o<T> extends p<T> {

    /* renamed from: l  reason: collision with root package name */
    public m.b<LiveData<?>, a<?>> f2385l = new m.b<>();

    /* loaded from: classes.dex */
    public static class a<V> implements q<V> {

        /* renamed from: a  reason: collision with root package name */
        public final LiveData<V> f2386a;

        /* renamed from: b  reason: collision with root package name */
        public final q<? super V> f2387b;

        /* renamed from: c  reason: collision with root package name */
        public int f2388c = -1;

        public a(LiveData<V> liveData, q<? super V> qVar) {
            this.f2386a = liveData;
            this.f2387b = qVar;
        }

        @Override // androidx.lifecycle.q
        public void a(V v2) {
            int i10 = this.f2388c;
            int i11 = this.f2386a.f2339g;
            if (i10 != i11) {
                this.f2388c = i11;
                this.f2387b.a(v2);
            }
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void h() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f2385l.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.f2386a.g(aVar);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void i() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f2385l.iterator();
        while (true) {
            b.e eVar = (b.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.f2386a.k(aVar);
        }
    }

    public <S> void m(LiveData<S> liveData, q<? super S> qVar) {
        a<?> aVar = new a<>(liveData, qVar);
        a<?> h10 = this.f2385l.h(liveData, aVar);
        if (h10 != null && h10.f2387b != qVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (h10 == null && e()) {
            liveData.g(aVar);
        }
    }

    public <S> void n(LiveData<S> liveData) {
        a<?> j10 = this.f2385l.j(liveData);
        if (j10 != null) {
            j10.f2386a.k(j10);
        }
    }
}
