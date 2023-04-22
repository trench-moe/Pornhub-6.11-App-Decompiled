package r6;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.Objects;
import l6.q;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f14686c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q f14687f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ int f14688j;

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ Runnable f14689m;

    public /* synthetic */ d(i iVar, q qVar, int i10, Runnable runnable) {
        this.f14686c = iVar;
        this.f14687f = qVar;
        this.f14688j = i10;
        this.f14689m = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i iVar = this.f14686c;
        q qVar = this.f14687f;
        int i10 = this.f14688j;
        Runnable runnable = this.f14689m;
        Objects.requireNonNull(iVar);
        try {
            try {
                t6.a aVar = iVar.f14706f;
                s6.d dVar = iVar.f14704c;
                Objects.requireNonNull(dVar);
                boolean z10 = false;
                aVar.c(new h(dVar, 0));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) iVar.f14702a.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    z10 = true;
                }
                if (z10) {
                    iVar.a(qVar, i10);
                } else {
                    iVar.f14706f.c(new g(iVar, qVar, i10));
                }
            } catch (SynchronizationException unused) {
                iVar.d.b(qVar, i10 + 1);
            }
        } finally {
            runnable.run();
        }
    }
}
