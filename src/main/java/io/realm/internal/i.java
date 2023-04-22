package io.realm.internal;

import io.realm.internal.i.b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class i<T extends b> {

    /* renamed from: a  reason: collision with root package name */
    public List<T> f10958a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    public boolean f10959b = false;

    /* loaded from: classes2.dex */
    public interface a<T extends b> {
        void a(T t2, Object obj);
    }

    /* loaded from: classes2.dex */
    public static abstract class b<T, S> {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<T> f10960a;

        /* renamed from: b  reason: collision with root package name */
        public final S f10961b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f10962c = false;

        public b(T t2, S s10) {
            this.f10961b = s10;
            this.f10960a = new WeakReference<>(t2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f10961b.equals(bVar.f10961b) && this.f10960a.get() == bVar.f10960a.get();
            }
            return false;
        }

        public int hashCode() {
            T t2 = this.f10960a.get();
            int hashCode = (527 + (t2 != null ? t2.hashCode() : 0)) * 31;
            S s10 = this.f10961b;
            return hashCode + (s10 != null ? s10.hashCode() : 0);
        }
    }

    public void a(T t2) {
        if (!this.f10958a.contains(t2)) {
            this.f10958a.add(t2);
            t2.f10962c = false;
        }
        if (this.f10959b) {
            this.f10959b = false;
        }
    }

    public void b(a<T> aVar) {
        for (T t2 : this.f10958a) {
            if (this.f10959b) {
                return;
            }
            Object obj = t2.f10960a.get();
            if (obj == null) {
                this.f10958a.remove(t2);
            } else if (!t2.f10962c) {
                aVar.a(t2, obj);
            }
        }
    }

    public boolean c() {
        return this.f10958a.isEmpty();
    }

    public <S, U> void d(S s10, U u2) {
        for (T t2 : this.f10958a) {
            if (s10 == t2.f10960a.get() && u2.equals(t2.f10961b)) {
                t2.f10962c = true;
                this.f10958a.remove(t2);
                return;
            }
        }
    }

    public void e(Object obj) {
        for (T t2 : this.f10958a) {
            Object obj2 = t2.f10960a.get();
            if (obj2 == null || obj2 == obj) {
                t2.f10962c = true;
                this.f10958a.remove(t2);
            }
        }
    }
}
