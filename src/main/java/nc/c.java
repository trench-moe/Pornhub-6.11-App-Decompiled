package nc;

import com.google.firebase.installations.local.PersistedInstallation;
import ea.h;

/* loaded from: classes2.dex */
public class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public final h<String> f13421a;

    public c(h<String> hVar) {
        this.f13421a = hVar;
    }

    @Override // nc.e
    public boolean a(Exception exc) {
        return false;
    }

    @Override // nc.e
    public boolean b(com.google.firebase.installations.local.b bVar) {
        if (!(bVar.f() == PersistedInstallation.RegistrationStatus.UNREGISTERED)) {
            if (!(bVar.f() == PersistedInstallation.RegistrationStatus.REGISTERED) && !bVar.h()) {
                return false;
            }
        }
        this.f13421a.b(bVar.c());
        return true;
    }
}
