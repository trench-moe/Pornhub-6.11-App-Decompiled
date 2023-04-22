package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.u;

/* loaded from: classes.dex */
public class s implements k {
    public static final s y = new s();
    public Handler n;

    /* renamed from: c  reason: collision with root package name */
    public int f2389c = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f2390f = 0;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2391j = true;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2392m = true;

    /* renamed from: t  reason: collision with root package name */
    public final l f2393t = new l(this);

    /* renamed from: u  reason: collision with root package name */
    public Runnable f2394u = new a();

    /* renamed from: w  reason: collision with root package name */
    public u.a f2395w = new b();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s sVar = s.this;
            if (sVar.f2390f == 0) {
                sVar.f2391j = true;
                sVar.f2393t.e(Lifecycle.Event.ON_PAUSE);
            }
            s sVar2 = s.this;
            if (sVar2.f2389c == 0 && sVar2.f2391j) {
                sVar2.f2393t.e(Lifecycle.Event.ON_STOP);
                sVar2.f2392m = true;
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements u.a {
        public b() {
        }
    }

    public void a() {
        int i10 = this.f2390f + 1;
        this.f2390f = i10;
        if (i10 == 1) {
            if (!this.f2391j) {
                this.n.removeCallbacks(this.f2394u);
                return;
            }
            this.f2393t.e(Lifecycle.Event.ON_RESUME);
            this.f2391j = false;
        }
    }

    @Override // androidx.lifecycle.k
    public Lifecycle b() {
        return this.f2393t;
    }

    public void d() {
        int i10 = this.f2389c + 1;
        this.f2389c = i10;
        if (i10 == 1 && this.f2392m) {
            this.f2393t.e(Lifecycle.Event.ON_START);
            this.f2392m = false;
        }
    }
}
