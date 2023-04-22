package ea;

import java.util.Objects;

/* loaded from: classes.dex */
public class h<TResult> {

    /* renamed from: a  reason: collision with root package name */
    public final u<TResult> f9273a = new u<>();

    public boolean a(Exception exc) {
        u<TResult> uVar = this.f9273a;
        Objects.requireNonNull(uVar);
        h9.o.i(exc, "Exception must not be null");
        synchronized (uVar.f9302a) {
            if (uVar.f9304c) {
                return false;
            }
            uVar.f9304c = true;
            uVar.f9306f = exc;
            uVar.f9303b.b(uVar);
            return true;
        }
    }

    public boolean b(TResult tresult) {
        u<TResult> uVar = this.f9273a;
        synchronized (uVar.f9302a) {
            if (uVar.f9304c) {
                return false;
            }
            uVar.f9304c = true;
            uVar.f9305e = tresult;
            uVar.f9303b.b(uVar);
            return true;
        }
    }
}
