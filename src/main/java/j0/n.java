package j0;

import android.os.Handler;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public class n<T> implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public Callable<T> f11128c;

    /* renamed from: f  reason: collision with root package name */
    public m0.a<T> f11129f;

    /* renamed from: j  reason: collision with root package name */
    public Handler f11130j;

    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ m0.a f11131c;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f11132f;

        public a(n nVar, m0.a aVar, Object obj) {
            this.f11131c = aVar;
            this.f11132f = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            this.f11131c.accept(this.f11132f);
        }
    }

    public n(Handler handler, Callable<T> callable, m0.a<T> aVar) {
        this.f11128c = callable;
        this.f11129f = aVar;
        this.f11130j = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        T t2;
        try {
            t2 = this.f11128c.call();
        } catch (Exception unused) {
            t2 = null;
        }
        this.f11130j.post(new a(this, this.f11129f, t2));
    }
}
