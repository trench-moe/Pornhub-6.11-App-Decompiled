package p;

import java.util.Map;

/* loaded from: classes2.dex */
public class b extends f<Object, Object> {
    public final /* synthetic */ c d;

    public b(c cVar) {
        this.d = cVar;
    }

    @Override // p.f
    public void a() {
        this.d.clear();
    }

    @Override // p.f
    public Object b(int i10, int i11) {
        return this.d.f13742f[i10];
    }

    @Override // p.f
    public Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // p.f
    public int d() {
        return this.d.f13743j;
    }

    @Override // p.f
    public int e(Object obj) {
        return this.d.indexOf(obj);
    }

    @Override // p.f
    public int f(Object obj) {
        return this.d.indexOf(obj);
    }

    @Override // p.f
    public void g(Object obj, Object obj2) {
        this.d.add(obj);
    }

    @Override // p.f
    public void h(int i10) {
        this.d.j(i10);
    }

    @Override // p.f
    public Object i(int i10, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}
