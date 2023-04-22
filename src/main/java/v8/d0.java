package v8;

import java.util.HashSet;
import java.util.Iterator;
import u8.e;

/* loaded from: classes2.dex */
public final class d0 extends e.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f16089a;

    public /* synthetic */ d0(d dVar) {
        this.f16089a = dVar;
    }

    @Override // u8.e.c
    public final void a(int i10) {
        Iterator it = new HashSet(this.f16089a.d).iterator();
        while (it.hasNext()) {
            ((e.c) it.next()).a(i10);
        }
    }

    @Override // u8.e.c
    public final void b(int i10) {
        d.o(this.f16089a, i10);
        this.f16089a.d(i10);
        Iterator it = new HashSet(this.f16089a.d).iterator();
        while (it.hasNext()) {
            ((e.c) it.next()).b(i10);
        }
    }

    @Override // u8.e.c
    public final void c(u8.d dVar) {
        Iterator it = new HashSet(this.f16089a.d).iterator();
        while (it.hasNext()) {
            ((e.c) it.next()).c(dVar);
        }
    }

    @Override // u8.e.c
    public final void d() {
        Iterator it = new HashSet(this.f16089a.d).iterator();
        while (it.hasNext()) {
            ((e.c) it.next()).d();
        }
    }

    @Override // u8.e.c
    public final void e(int i10) {
        Iterator it = new HashSet(this.f16089a.d).iterator();
        while (it.hasNext()) {
            ((e.c) it.next()).e(i10);
        }
    }

    @Override // u8.e.c
    public final void f() {
        Iterator it = new HashSet(this.f16089a.d).iterator();
        while (it.hasNext()) {
            ((e.c) it.next()).f();
        }
    }
}
