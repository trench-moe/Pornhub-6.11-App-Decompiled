package f4;

import com.app.pornhub.R;
import com.google.android.material.snackbar.Snackbar;
import io.reactivex.functions.Consumer;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements Consumer {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9409c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ n f9410f;

    public /* synthetic */ l(n nVar, int i10) {
        this.f9409c = i10;
        this.f9410f = nVar;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f9409c) {
            case 0:
                n nVar = this.f9410f;
                int i10 = n.E0;
                Objects.requireNonNull(nVar);
                kf.a.f12078a.b((Throwable) obj, "Error flag gif", new Object[0]);
                if (nVar.L()) {
                    Snackbar.k(nVar.f9422z0.f4591j, R.string.error_flag_gif, -1).n();
                }
                return;
            default:
                n nVar2 = this.f9410f;
                int i11 = n.E0;
                Objects.requireNonNull(nVar2);
                kf.a.f12078a.d((Throwable) obj, "Rate gif failed", new Object[0]);
                nVar2.f9421y0 = false;
                return;
        }
    }
}
