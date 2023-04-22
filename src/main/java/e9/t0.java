package e9;

import android.os.DeadObjectException;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.a;
import d9.a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t0<A extends com.google.android.gms.common.api.internal.a<? extends d9.f, a.b>> extends x0 {

    /* renamed from: b  reason: collision with root package name */
    public final A f9247b;

    public t0(int i10, A a10) {
        super(i10);
        h9.o.i(a10, "Null methods are not runnable.");
        this.f9247b = a10;
    }

    @Override // e9.x0
    public final void a(Status status) {
        try {
            this.f9247b.b(status);
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // e9.x0
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        try {
            this.f9247b.b(new Status(10, android.support.v4.media.b.n(new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length()), simpleName, ": ", localizedMessage)));
        } catch (IllegalStateException e10) {
            Log.w("ApiCallRunner", "Exception reporting failure", e10);
        }
    }

    @Override // e9.x0
    public final void c(z<?> zVar) {
        try {
            A a10 = this.f9247b;
            a.f fVar = zVar.f9260b;
            Objects.requireNonNull(a10);
            try {
                a10.a(fVar);
            } catch (DeadObjectException e10) {
                a10.b(new Status(8, e10.getLocalizedMessage(), null));
                throw e10;
            } catch (RemoteException e11) {
                a10.b(new Status(8, e11.getLocalizedMessage(), null));
            }
        } catch (RuntimeException e12) {
            b(e12);
        }
    }

    @Override // e9.x0
    public final void d(p pVar, boolean z10) {
        A a10 = this.f9247b;
        pVar.f9234a.put(a10, Boolean.valueOf(z10));
        a10.addStatusListener(new o(pVar, a10));
    }
}
