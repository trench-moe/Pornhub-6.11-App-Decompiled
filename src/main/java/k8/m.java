package k8;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import k8.h;
import k8.m;

/* loaded from: classes2.dex */
public final class m<T> {

    /* renamed from: a  reason: collision with root package name */
    public final k8.b f11967a;

    /* renamed from: b  reason: collision with root package name */
    public final i f11968b;

    /* renamed from: c  reason: collision with root package name */
    public final b<T> f11969c;
    public final CopyOnWriteArraySet<c<T>> d;

    /* renamed from: e  reason: collision with root package name */
    public final ArrayDeque<Runnable> f11970e = new ArrayDeque<>();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque<Runnable> f11971f = new ArrayDeque<>();

    /* renamed from: g  reason: collision with root package name */
    public boolean f11972g;

    /* loaded from: classes.dex */
    public interface a<T> {
        void invoke(T t2);
    }

    /* loaded from: classes.dex */
    public interface b<T> {
        void e(T t2, h hVar);
    }

    /* loaded from: classes2.dex */
    public static final class c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f11973a;

        /* renamed from: b  reason: collision with root package name */
        public h.b f11974b = new h.b();

        /* renamed from: c  reason: collision with root package name */
        public boolean f11975c;
        public boolean d;

        public c(T t2) {
            this.f11973a = t2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f11973a.equals(((c) obj).f11973a);
        }

        public int hashCode() {
            return this.f11973a.hashCode();
        }
    }

    public m(CopyOnWriteArraySet<c<T>> copyOnWriteArraySet, Looper looper, k8.b bVar, b<T> bVar2) {
        this.f11967a = bVar;
        this.d = copyOnWriteArraySet;
        this.f11969c = bVar2;
        this.f11968b = bVar.b(looper, new Handler.Callback() { // from class: k8.k
            {
                m.this = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                m mVar = m.this;
                Iterator it = mVar.d.iterator();
                while (it.hasNext()) {
                    m.c cVar = (m.c) it.next();
                    m.b<T> bVar3 = mVar.f11969c;
                    if (!cVar.d && cVar.f11975c) {
                        h b10 = cVar.f11974b.b();
                        cVar.f11974b = new h.b();
                        cVar.f11975c = false;
                        bVar3.e(cVar.f11973a, b10);
                    }
                    if (mVar.f11968b.d(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
    }

    public void a() {
        if (this.f11971f.isEmpty()) {
            return;
        }
        if (!this.f11968b.d(0)) {
            i iVar = this.f11968b;
            iVar.g(iVar.c(0));
        }
        boolean z10 = !this.f11970e.isEmpty();
        this.f11970e.addAll(this.f11971f);
        this.f11971f.clear();
        if (z10) {
            return;
        }
        while (!this.f11970e.isEmpty()) {
            this.f11970e.peekFirst().run();
            this.f11970e.removeFirst();
        }
    }

    public void b(final int i10, final a<T> aVar) {
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f11971f.add(new Runnable() { // from class: k8.l
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i11 = i10;
                m.a aVar2 = aVar;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    m.c cVar = (m.c) it.next();
                    if (!cVar.d) {
                        if (i11 != -1) {
                            h.b bVar = cVar.f11974b;
                            a.f(!bVar.f11958b);
                            bVar.f11957a.append(i11, true);
                        }
                        cVar.f11975c = true;
                        aVar2.invoke(cVar.f11973a);
                    }
                }
            }
        });
    }

    public void c() {
        Iterator<c<T>> it = this.d.iterator();
        while (it.hasNext()) {
            c<T> next = it.next();
            b<T> bVar = this.f11969c;
            next.d = true;
            if (next.f11975c) {
                bVar.e(next.f11973a, next.f11974b.b());
            }
        }
        this.d.clear();
        this.f11972g = true;
    }
}
