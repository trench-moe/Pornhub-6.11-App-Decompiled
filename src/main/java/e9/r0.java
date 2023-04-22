package e9;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class r0<T> extends f0 {

    /* renamed from: b  reason: collision with root package name */
    public final ea.h<T> f9245b;

    public r0(int i10, ea.h<T> hVar) {
        super(i10);
        this.f9245b = hVar;
    }

    @Override // e9.x0
    public final void a(Status status) {
        this.f9245b.a(new ApiException(status));
    }

    @Override // e9.x0
    public final void b(Exception exc) {
        this.f9245b.a(exc);
    }

    @Override // e9.x0
    public final void c(z<?> zVar) {
        try {
            h(zVar);
        } catch (DeadObjectException e10) {
            this.f9245b.a(new ApiException(x0.e(e10)));
            throw e10;
        } catch (RemoteException e11) {
            this.f9245b.a(new ApiException(x0.e(e11)));
        } catch (RuntimeException e12) {
            this.f9245b.a(e12);
        }
    }

    public abstract void h(z<?> zVar);
}
