package z7;

import g4.n;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import k8.c0;
import y7.g;
import y7.h;
import z6.f;

/* loaded from: classes2.dex */
public abstract class d implements y7.e {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque<b> f21908a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<h> f21909b;

    /* renamed from: c  reason: collision with root package name */
    public final PriorityQueue<b> f21910c;
    public b d;

    /* renamed from: e  reason: collision with root package name */
    public long f21911e;

    /* renamed from: f  reason: collision with root package name */
    public long f21912f;

    /* loaded from: classes2.dex */
    public static final class b extends g implements Comparable<b> {

        /* renamed from: z  reason: collision with root package name */
        public long f21913z;

        public b() {
        }

        public b(a aVar) {
        }

        @Override // java.lang.Comparable
        public int compareTo(b bVar) {
            b bVar2 = bVar;
            if (j() == bVar2.j()) {
                long j10 = this.n - bVar2.n;
                if (j10 == 0) {
                    j10 = this.f21913z - bVar2.f21913z;
                    if (j10 == 0) {
                        return 0;
                    }
                }
                if (j10 > 0) {
                    return 1;
                }
            } else if (j()) {
                return 1;
            }
            return -1;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c extends h {
        public f.a<c> n;

        public c(f.a<c> aVar) {
            this.n = aVar;
        }

        @Override // z6.f
        public final void l() {
            this.n.b(this);
        }
    }

    public d() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.f21908a.add(new b(null));
        }
        this.f21909b = new ArrayDeque<>();
        for (int i11 = 0; i11 < 2; i11++) {
            this.f21909b.add(new c(new n(this)));
        }
        this.f21910c = new PriorityQueue<>();
    }

    @Override // z6.c
    public void a() {
    }

    @Override // y7.e
    public void b(long j10) {
        this.f21911e = j10;
    }

    @Override // z6.c
    public g d() {
        k8.a.f(this.d == null);
        if (this.f21908a.isEmpty()) {
            return null;
        }
        b pollFirst = this.f21908a.pollFirst();
        this.d = pollFirst;
        return pollFirst;
    }

    @Override // z6.c
    public void e(g gVar) {
        g gVar2 = gVar;
        k8.a.c(gVar2 == this.d);
        b bVar = (b) gVar2;
        if (bVar.i()) {
            j(bVar);
        } else {
            long j10 = this.f21912f;
            this.f21912f = 1 + j10;
            bVar.f21913z = j10;
            this.f21910c.add(bVar);
        }
        this.d = null;
    }

    public abstract y7.d f();

    @Override // z6.c
    public void flush() {
        this.f21912f = 0L;
        this.f21911e = 0L;
        while (!this.f21910c.isEmpty()) {
            int i10 = c0.f11939a;
            j(this.f21910c.poll());
        }
        b bVar = this.d;
        if (bVar != null) {
            j(bVar);
            this.d = null;
        }
    }

    public abstract void g(g gVar);

    @Override // z6.c
    /* renamed from: h */
    public h c() {
        if (this.f21909b.isEmpty()) {
            return null;
        }
        while (!this.f21910c.isEmpty()) {
            int i10 = c0.f11939a;
            if (this.f21910c.peek().n > this.f21911e) {
                break;
            }
            b poll = this.f21910c.poll();
            if (poll.j()) {
                h pollFirst = this.f21909b.pollFirst();
                pollFirst.f(4);
                j(poll);
                return pollFirst;
            }
            g(poll);
            if (i()) {
                y7.d f10 = f();
                h pollFirst2 = this.f21909b.pollFirst();
                pollFirst2.n(poll.n, f10, Long.MAX_VALUE);
                j(poll);
                return pollFirst2;
            }
            j(poll);
        }
        return null;
    }

    public abstract boolean i();

    public final void j(b bVar) {
        bVar.l();
        this.f21908a.add(bVar);
    }
}
