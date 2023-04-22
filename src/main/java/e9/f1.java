package e9;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f1 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f9181c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f9182f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ g1 f9183j;

    public f1(g1 g1Var, LifecycleCallback lifecycleCallback, String str) {
        this.f9183j = g1Var;
        this.f9181c = lifecycleCallback;
        this.f9182f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g1 g1Var = this.f9183j;
        if (g1Var.f9194f > 0) {
            LifecycleCallback lifecycleCallback = this.f9181c;
            Bundle bundle = g1Var.f9195j;
            lifecycleCallback.d(bundle != null ? bundle.getBundle(this.f9182f) : null);
        }
        if (this.f9183j.f9194f >= 2) {
            this.f9181c.g();
        }
        if (this.f9183j.f9194f >= 3) {
            this.f9181c.e();
        }
        if (this.f9183j.f9194f >= 4) {
            this.f9181c.h();
        }
        if (this.f9183j.f9194f >= 5) {
            Objects.requireNonNull(this.f9181c);
        }
    }
}
