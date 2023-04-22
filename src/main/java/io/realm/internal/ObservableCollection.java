package io.realm.internal;

import io.realm.internal.i;
import io.realm.r;

@Keep
/* loaded from: classes2.dex */
interface ObservableCollection {

    /* loaded from: classes2.dex */
    public static class a<T> extends i.b<T, Object> {
        public a(T t2, Object obj) {
            super(t2, obj);
        }
    }

    /* loaded from: classes2.dex */
    public static class b<T> implements io.realm.l<T> {

        /* renamed from: a  reason: collision with root package name */
        public final r<T> f10869a;

        public b(r<T> rVar) {
            this.f10869a = rVar;
        }

        @Override // io.realm.l
        public void a(T t2, io.realm.k kVar) {
            this.f10869a.a(t2);
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && this.f10869a == ((b) obj).f10869a;
        }

        public int hashCode() {
            return this.f10869a.hashCode();
        }
    }

    void notifyChangeListeners(long j10);
}
