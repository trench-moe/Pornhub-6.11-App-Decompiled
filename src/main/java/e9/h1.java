package e9;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h1 implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ LifecycleCallback f9199c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f9200f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ i1 f9201j;

    public h1(i1 i1Var, LifecycleCallback lifecycleCallback, String str) {
        this.f9201j = i1Var;
        this.f9199c = lifecycleCallback;
        this.f9200f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i1 i1Var = this.f9201j;
        if (i1Var.f9207o0 > 0) {
            LifecycleCallback lifecycleCallback = this.f9199c;
            Bundle bundle = i1Var.f9208p0;
            lifecycleCallback.d(bundle != null ? bundle.getBundle(this.f9200f) : null);
        }
        if (this.f9201j.f9207o0 >= 2) {
            this.f9199c.g();
        }
        if (this.f9201j.f9207o0 >= 3) {
            this.f9199c.e();
        }
        if (this.f9201j.f9207o0 >= 4) {
            this.f9199c.h();
        }
        if (this.f9201j.f9207o0 >= 5) {
            Objects.requireNonNull(this.f9199c);
        }
    }
}
