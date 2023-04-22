package a3;

import b3.e;
import b3.i;
import b3.j;
import f3.h;
import f3.l;
import f3.o;
import i3.f;
import java.util.Map;
import k3.d;

/* loaded from: classes.dex */
public final class b implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f170a;

    /* renamed from: b  reason: collision with root package name */
    public final ie.a f171b;

    public /* synthetic */ b(ie.a aVar, int i10) {
        this.f170a = i10;
        this.f171b = aVar;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f170a) {
            case 0:
                return new a((Map) this.f171b.get());
            case 1:
                return new f3.a((e) this.f171b.get());
            case 2:
                return new h((e) this.f171b.get());
            case 3:
                return new l((e) this.f171b.get());
            case 4:
                return new o((e) this.f171b.get());
            case 5:
                return new f((j) this.f171b.get());
            case 6:
                return new d((i) this.f171b.get());
            default:
                return new o3.i((b3.o) this.f171b.get());
        }
    }
}
