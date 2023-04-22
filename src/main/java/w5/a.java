package w5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class a implements h {

    /* renamed from: c  reason: collision with root package name */
    public final Set<i> f16396c = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: f  reason: collision with root package name */
    public boolean f16397f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f16398j;

    public void a() {
        this.f16398j = true;
        Iterator it = ((ArrayList) d6.l.e(this.f16396c)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).e();
        }
    }

    public void b() {
        this.f16397f = true;
        Iterator it = ((ArrayList) d6.l.e(this.f16396c)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).m();
        }
    }

    @Override // w5.h
    public void c(i iVar) {
        this.f16396c.remove(iVar);
    }

    public void d() {
        this.f16397f = false;
        Iterator it = ((ArrayList) d6.l.e(this.f16396c)).iterator();
        while (it.hasNext()) {
            ((i) it.next()).g();
        }
    }

    @Override // w5.h
    public void g(i iVar) {
        this.f16396c.add(iVar);
        if (this.f16398j) {
            iVar.e();
        } else if (this.f16397f) {
            iVar.m();
        } else {
            iVar.g();
        }
    }
}
