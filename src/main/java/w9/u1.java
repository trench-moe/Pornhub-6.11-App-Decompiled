package w9;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class u1 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final long f17312c;

    /* renamed from: f  reason: collision with root package name */
    public final long f17313f;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f17314j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ a2 f17315m;

    public u1(a2 a2Var, boolean z10) {
        this.f17315m = a2Var;
        Objects.requireNonNull(a2Var);
        this.f17312c = System.currentTimeMillis();
        this.f17313f = SystemClock.elapsedRealtime();
        this.f17314j = z10;
    }

    public abstract void a();

    public void b() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f17315m.f17062e) {
            b();
            return;
        }
        try {
            a();
        } catch (Exception e10) {
            this.f17315m.e(e10, false, this.f17314j);
            b();
        }
    }
}
