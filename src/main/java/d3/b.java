package d3;

import b3.o;
import f3.i;
import f3.r;
import f3.t;
import o3.j;

/* loaded from: classes.dex */
public final class b implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8748a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a f8749b;

    public /* synthetic */ b(ie.a aVar, int i10) {
        this.f8748a = i10;
        this.f8749b = aVar;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f8748a) {
            case 0:
                return new a((b3.b) this.f8749b.get());
            case 1:
                return new f3.b((b3.e) this.f8749b.get());
            case 2:
                return new i((b3.e) this.f8749b.get());
            case 3:
                return new r((b3.e) this.f8749b.get());
            case 4:
                return new t((b3.e) this.f8749b.get());
            case 5:
                return new o3.a((o) this.f8749b.get());
            default:
                return new j((o) this.f8749b.get());
        }
    }
}
