package ic;

import java.io.Writer;

/* loaded from: classes2.dex */
public class d implements gc.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f10694a;

    public d(e eVar) {
        this.f10694a = eVar;
    }

    public void a(Object obj, Writer writer) {
        e eVar = this.f10694a;
        f fVar = new f(writer, eVar.f10696a, eVar.f10697b, eVar.f10698c, eVar.d);
        fVar.g(obj, false);
        fVar.i();
        fVar.f10701b.flush();
    }
}
