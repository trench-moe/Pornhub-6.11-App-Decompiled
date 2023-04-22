package l6;

import com.google.android.datatransport.Priority;
import java.util.Objects;
import l6.h;
import l6.i;
import l6.m;
import l6.q;

/* loaded from: classes2.dex */
public final class t<T> implements i6.e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final q f12320a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12321b;

    /* renamed from: c  reason: collision with root package name */
    public final i6.b f12322c;
    public final i6.d<T, byte[]> d;

    /* renamed from: e  reason: collision with root package name */
    public final u f12323e;

    public t(q qVar, String str, i6.b bVar, i6.d<T, byte[]> dVar, u uVar) {
        this.f12320a = qVar;
        this.f12321b = str;
        this.f12322c = bVar;
        this.d = dVar;
        this.f12323e = uVar;
    }

    public void a(i6.c<T> cVar, i6.f fVar) {
        u uVar = this.f12323e;
        q qVar = this.f12320a;
        Objects.requireNonNull(qVar, "Null transportContext");
        Objects.requireNonNull(cVar, "Null event");
        String str = this.f12321b;
        Objects.requireNonNull(str, "Null transportName");
        i6.d<T, byte[]> dVar = this.d;
        Objects.requireNonNull(dVar, "Null transformer");
        i6.b bVar = this.f12322c;
        Objects.requireNonNull(bVar, "Null encoding");
        v vVar = (v) uVar;
        q6.e eVar = vVar.f12327c;
        Priority c10 = cVar.c();
        q.a a10 = q.a();
        a10.b(qVar.b());
        a10.c(c10);
        i.b bVar2 = (i.b) a10;
        bVar2.f12293b = qVar.c();
        q a11 = bVar2.a();
        m.a a12 = m.a();
        a12.e(vVar.f12325a.a());
        a12.g(vVar.f12326b.a());
        a12.f(str);
        a12.d(new l(bVar, dVar.apply(cVar.b())));
        h.b bVar3 = (h.b) a12;
        bVar3.f12285b = cVar.a();
        eVar.a(a11, bVar3.b(), fVar);
    }
}
