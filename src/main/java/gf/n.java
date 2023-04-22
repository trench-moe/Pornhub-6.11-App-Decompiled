package gf;

/* loaded from: classes2.dex */
public class n extends p<Iterable<Object>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f9988a;

    public n(p pVar) {
        this.f9988a = pVar;
    }

    @Override // gf.p
    public void a(r rVar, Iterable<Object> iterable) {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        for (Object obj : iterable2) {
            this.f9988a.a(rVar, obj);
        }
    }
}
