package r2;

import b3.e;
import b3.l;
import b3.o;
import com.squareup.moshi.k;
import d3.g;
import f3.c;
import f3.j;
import java.util.Objects;
import okhttp3.TlsVersion;
import pe.h;

/* loaded from: classes2.dex */
public final class b implements ie.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14622a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14623b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f14622a = i10;
        this.f14623b = obj;
    }

    @Override // ie.a
    public Object get() {
        switch (this.f14622a) {
            case 0:
                return new a((k) ((ie.a) this.f14623b).get());
            case 1:
                return new g((b3.b) ((ie.a) this.f14623b).get());
            case 2:
                return new c((e) ((ie.a) this.f14623b).get());
            case 3:
                return new j((e) ((ie.a) this.f14623b).get());
            case 4:
                return new g3.b((b3.g) ((ie.a) this.f14623b).get());
            case 5:
                return new i3.e((b3.j) ((ie.a) this.f14623b).get());
            case 6:
                return new j3.a((b3.k) ((ie.a) this.f14623b).get());
            case 7:
                return new j3.e((b3.k) ((ie.a) this.f14623b).get());
            case 8:
                return new j3.g((b3.k) ((ie.a) this.f14623b).get());
            case 9:
                return new l3.a((l) ((ie.a) this.f14623b).get());
            case 10:
                return new o3.b((o) ((ie.a) this.f14623b).get());
            case 11:
                return new o3.g((o) ((ie.a) this.f14623b).get());
            default:
                Objects.requireNonNull((a0.b) this.f14623b);
                h.a aVar = new h.a(h.f13950e);
                aVar.f(TlsVersion.TLS_1_2);
                return aVar.a();
        }
    }
}
