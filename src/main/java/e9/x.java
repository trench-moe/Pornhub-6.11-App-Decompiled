package e9;

import d9.a;

/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ y f9256c;

    public x(y yVar) {
        this.f9256c = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar = this.f9256c.f9258a.f9260b;
        fVar.disconnect(fVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
