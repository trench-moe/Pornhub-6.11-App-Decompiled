package e9;

/* loaded from: classes.dex */
public final class w implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9253c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ z f9254f;

    public w(z zVar, int i10) {
        this.f9254f = zVar;
        this.f9253c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9254f.g(this.f9253c);
    }
}
