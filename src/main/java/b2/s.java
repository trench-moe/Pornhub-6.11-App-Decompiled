package b2;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class s implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ t f3542c;

    public s(t tVar) {
        this.f3542c = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        if (this.f3542c.d == null) {
            return;
        }
        r<T> rVar = this.f3542c.d;
        V v2 = rVar.f3540a;
        if (v2 != 0) {
            t tVar = this.f3542c;
            synchronized (tVar) {
                try {
                    Iterator it = new ArrayList(tVar.f3544a).iterator();
                    while (it.hasNext()) {
                        ((n) it.next()).a(v2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        t tVar2 = this.f3542c;
        Throwable th2 = rVar.f3541b;
        synchronized (tVar2) {
            ArrayList arrayList = new ArrayList(tVar2.f3545b);
            if (arrayList.isEmpty()) {
                m2.c.b("Lottie encountered an error but no failure listener was added:", th2);
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((n) it2.next()).a(th2);
            }
        }
    }
}
