package w5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class r implements i {

    /* renamed from: c  reason: collision with root package name */
    public final Set<a6.g<?>> f16441c = Collections.newSetFromMap(new WeakHashMap());

    @Override // w5.i
    public void e() {
        Iterator it = ((ArrayList) d6.l.e(this.f16441c)).iterator();
        while (it.hasNext()) {
            ((a6.g) it.next()).e();
        }
    }

    @Override // w5.i
    public void g() {
        Iterator it = ((ArrayList) d6.l.e(this.f16441c)).iterator();
        while (it.hasNext()) {
            ((a6.g) it.next()).g();
        }
    }

    @Override // w5.i
    public void m() {
        Iterator it = ((ArrayList) d6.l.e(this.f16441c)).iterator();
        while (it.hasNext()) {
            ((a6.g) it.next()).m();
        }
    }
}
