package n1;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import n1.h;

/* loaded from: classes.dex */
public abstract class e<Key, Value> {

    /* renamed from: a  reason: collision with root package name */
    public AtomicBoolean f13197a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public CopyOnWriteArrayList<b> f13198b = new CopyOnWriteArrayList<>();

    /* loaded from: classes.dex */
    public static abstract class a<Key, Value> {
        public abstract e<Key, Value> a();
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes2.dex */
    public static class c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f13199a;

        /* renamed from: b  reason: collision with root package name */
        public final e f13200b;

        /* renamed from: c  reason: collision with root package name */
        public final h.a<T> f13201c;

        /* renamed from: e  reason: collision with root package name */
        public Executor f13202e;
        public final Object d = new Object();

        /* renamed from: f  reason: collision with root package name */
        public boolean f13203f = false;

        /* loaded from: classes2.dex */
        public class a implements Runnable {

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ h f13204c;

            public a(h hVar) {
                this.f13204c = hVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.f13201c.a(cVar.f13199a, this.f13204c);
            }
        }

        public c(e eVar, int i10, Executor executor, h.a<T> aVar) {
            this.f13202e = null;
            this.f13200b = eVar;
            this.f13199a = i10;
            this.f13202e = executor;
            this.f13201c = aVar;
        }

        public boolean a() {
            if (this.f13200b.d()) {
                b(h.d);
                return true;
            }
            return false;
        }

        public void b(h<T> hVar) {
            Executor executor;
            synchronized (this.d) {
                if (this.f13203f) {
                    throw new IllegalStateException("callback.onResult already called, cannot call again.");
                }
                this.f13203f = true;
                executor = this.f13202e;
            }
            if (executor != null) {
                executor.execute(new a(hVar));
            } else {
                this.f13201c.a(this.f13199a, hVar);
            }
        }
    }

    public void a(b bVar) {
        this.f13198b.add(bVar);
    }

    public void b() {
        if (this.f13197a.compareAndSet(false, true)) {
            Iterator<b> it = this.f13198b.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public abstract boolean c();

    public boolean d() {
        return this.f13197a.get();
    }

    public void e(b bVar) {
        this.f13198b.remove(bVar);
    }
}
