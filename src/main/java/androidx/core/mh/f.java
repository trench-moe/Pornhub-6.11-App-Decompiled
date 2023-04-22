package androidx.core.mh;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1857a;

    /* renamed from: b  reason: collision with root package name */
    public CopyOnWriteArrayList<a> f1858b = new CopyOnWriteArrayList<>();

    public f(boolean z10) {
        this.f1857a = z10;
    }

    public abstract void a();

    public final void b() {
        Iterator<a> it = this.f1858b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }
}
