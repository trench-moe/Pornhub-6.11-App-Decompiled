package k8;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public boolean f11950a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f11951b = b.f11933a;

    public synchronized boolean a() {
        boolean z10;
        try {
            z10 = this.f11950a;
            this.f11950a = false;
        } catch (Throwable th) {
            throw th;
        }
        return z10;
    }

    public synchronized boolean b() {
        try {
            if (this.f11950a) {
                return false;
            }
            this.f11950a = true;
            notifyAll();
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }
}
