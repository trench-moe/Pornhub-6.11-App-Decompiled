package ea;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public final class q<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9297a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public Queue<p<TResult>> f9298b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f9299c;

    public final void a(p<TResult> pVar) {
        synchronized (this.f9297a) {
            if (this.f9298b == null) {
                this.f9298b = new ArrayDeque();
            }
            this.f9298b.add(pVar);
        }
    }

    public final void b(g<TResult> gVar) {
        p<TResult> poll;
        synchronized (this.f9297a) {
            if (this.f9298b != null && !this.f9299c) {
                this.f9299c = true;
                while (true) {
                    synchronized (this.f9297a) {
                        poll = this.f9298b.poll();
                        if (poll == null) {
                            this.f9299c = false;
                            return;
                        }
                    }
                    poll.b(gVar);
                }
            }
        }
    }
}
