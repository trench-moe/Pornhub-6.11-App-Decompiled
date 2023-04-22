package d2;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;

/* loaded from: classes.dex */
public class b implements h2.j {

    /* renamed from: a  reason: collision with root package name */
    public List f8645a;

    @Override // h2.j
    public e2.a a() {
        return ((n2.a) this.f8645a.get(0)).d() ? new e2.i(this.f8645a) : new e2.h(this.f8645a);
    }

    @Override // h2.j
    public List b() {
        return this.f8645a;
    }

    public void c(Path path) {
        for (int size = this.f8645a.size() - 1; size >= 0; size--) {
            s sVar = (s) this.f8645a.get(size);
            ThreadLocal<PathMeasure> threadLocal = m2.g.f12877a;
            if (sVar != null) {
                if (!sVar.f8742a) {
                    m2.g.a(path, ((e2.c) sVar.d).k() / 100.0f, ((e2.c) sVar.f8745e).k() / 100.0f, ((e2.c) sVar.f8746f).k() / 360.0f);
                }
            }
        }
    }

    @Override // h2.j
    public boolean isStatic() {
        boolean z10 = false;
        if (this.f8645a.size() == 1 && ((n2.a) this.f8645a.get(0)).d()) {
            z10 = true;
        }
        return z10;
    }
}
