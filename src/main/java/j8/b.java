package j8;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public interface b {

    /* loaded from: classes2.dex */
    public interface a {

        /* renamed from: j8.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0168a {

            /* renamed from: a  reason: collision with root package name */
            public final CopyOnWriteArrayList<C0169a> f11559a = new CopyOnWriteArrayList<>();

            /* renamed from: j8.b$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0169a {

                /* renamed from: a  reason: collision with root package name */
                public final Handler f11560a;

                /* renamed from: b  reason: collision with root package name */
                public final a f11561b;

                /* renamed from: c  reason: collision with root package name */
                public boolean f11562c;

                public C0169a(Handler handler, a aVar) {
                    this.f11560a = handler;
                    this.f11561b = aVar;
                }
            }

            public void a(a aVar) {
                Iterator<C0169a> it = this.f11559a.iterator();
                while (it.hasNext()) {
                    C0169a next = it.next();
                    if (next.f11561b == aVar) {
                        next.f11562c = true;
                        this.f11559a.remove(next);
                    }
                }
            }
        }
    }

    t c();

    void d(Handler handler, a aVar);

    void f(a aVar);
}
