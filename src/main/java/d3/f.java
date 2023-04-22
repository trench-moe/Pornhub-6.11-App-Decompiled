package d3;

import b3.i;
import b3.j;
import b3.k;
import b3.m;
import b3.o;
import f3.n;
import o3.h;

/* loaded from: classes.dex */
public final class f implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8754a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a f8755b;

    public /* synthetic */ f(ie.a aVar, int i10) {
        this.f8754a = i10;
        this.f8755b = aVar;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f8754a) {
            case 0:
                return new e((b3.b) this.f8755b.get());
            case 1:
                return new f3.g((b3.e) this.f8755b.get());
            case 2:
                return new n((b3.e) this.f8755b.get());
            case 3:
                return new g3.a((b3.g) this.f8755b.get());
            case 4:
                return new i3.b((j) this.f8755b.get());
            case 5:
                return new j3.d((k) this.f8755b.get());
            case 6:
                return new j3.f((k) this.f8755b.get());
            case 7:
                return new k3.g((i) this.f8755b.get());
            case 8:
                return new m3.a((m) this.f8755b.get());
            case 9:
                return new o3.f((o) this.f8755b.get());
            default:
                return new h((o) this.f8755b.get());
        }
    }
}
