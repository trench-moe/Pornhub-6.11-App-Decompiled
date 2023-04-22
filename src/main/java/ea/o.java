package ea;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f9295c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ n f9296f;

    public o(n nVar, g gVar) {
        this.f9296f = nVar;
        this.f9295c = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f9296f.f9293j) {
            Object obj = this.f9296f.f9294m;
            if (((e) obj) != null) {
                ((e) obj).onSuccess(this.f9295c.j());
            }
        }
    }
}
