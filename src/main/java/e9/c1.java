package e9;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class c1 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f9166f;

    /* renamed from: j  reason: collision with root package name */
    public final AtomicReference<z0> f9167j;

    /* renamed from: m  reason: collision with root package name */
    public final Handler f9168m;
    public final c9.e n;

    public c1(f fVar, c9.e eVar) {
        super(fVar);
        this.f9167j = new AtomicReference<>(null);
        this.f9168m = new s9.f(Looper.getMainLooper());
        this.n = eVar;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void c(int i10, int i11, Intent intent) {
        z0 z0Var = this.f9167j.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int c10 = this.n.c(a(), c9.f.f3876a);
                if (c10 == 0) {
                    j();
                    return;
                } else if (z0Var == null) {
                    return;
                } else {
                    if (z0Var.f9272b.f3858f == 18 && c10 == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            j();
            return;
        } else if (i11 == 0) {
            if (z0Var == null) {
                return;
            }
            i(new c9.b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, z0Var.f9272b.toString()), z0Var.f9271a);
            return;
        }
        if (z0Var != null) {
            i(z0Var.f9272b, z0Var.f9271a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d(Bundle bundle) {
        if (bundle != null) {
            this.f9167j.set(bundle.getBoolean("resolving_error", false) ? new z0(new c9.b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        z0 z0Var = this.f9167j.get();
        if (z0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", z0Var.f9271a);
        bundle.putInt("failed_status", z0Var.f9272b.f3858f);
        bundle.putParcelable("failed_resolution", z0Var.f9272b.f3859j);
    }

    public final void i(c9.b bVar, int i10) {
        this.f9167j.set(null);
        ((q) this).f9244u.i(bVar, i10);
    }

    public final void j() {
        this.f9167j.set(null);
        Handler handler = ((q) this).f9244u.D;
        handler.sendMessage(handler.obtainMessage(3));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        c9.b bVar = new c9.b(13, null);
        z0 z0Var = this.f9167j.get();
        i(bVar, z0Var == null ? -1 : z0Var.f9271a);
    }
}
