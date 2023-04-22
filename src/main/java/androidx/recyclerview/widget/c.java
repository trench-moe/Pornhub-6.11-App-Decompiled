package androidx.recyclerview.widget;

import androidx.recyclerview.widget.n;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f2950a;

    /* renamed from: b  reason: collision with root package name */
    public final n.e<T> f2951b;

    /* loaded from: classes.dex */
    public static final class a<T> {

        /* renamed from: c  reason: collision with root package name */
        public static final Object f2952c = new Object();
        public static Executor d;

        /* renamed from: a  reason: collision with root package name */
        public Executor f2953a;

        /* renamed from: b  reason: collision with root package name */
        public final n.e<T> f2954b;

        public a(n.e<T> eVar) {
            this.f2954b = eVar;
        }

        public c<T> a() {
            if (this.f2953a == null) {
                synchronized (f2952c) {
                    try {
                        if (d == null) {
                            d = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f2953a = d;
            }
            return new c<>(null, this.f2953a, this.f2954b);
        }
    }

    public c(Executor executor, Executor executor2, n.e<T> eVar) {
        this.f2950a = executor2;
        this.f2951b = eVar;
    }
}
