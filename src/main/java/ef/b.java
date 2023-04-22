package ef;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f9323a;

    public synchronized void a() {
        this.f9323a = false;
    }

    public synchronized void b() {
        boolean z10 = this.f9323a;
        this.f9323a = true;
        if (!z10) {
            notify();
        }
    }
}
