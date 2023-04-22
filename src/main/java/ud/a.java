package ud;

import cz.msebera.android.httpclient.message.BasicHeader;
import cz.msebera.android.httpclient.message.HeaderGroup;

/* loaded from: classes2.dex */
public abstract class a implements md.h {

    /* renamed from: a  reason: collision with root package name */
    public HeaderGroup f15849a = new HeaderGroup();

    @Override // md.h
    public md.f e(String str) {
        return this.f15849a.g(str);
    }

    @Override // md.h
    public md.d[] f(String str) {
        return this.f15849a.d(str);
    }

    @Override // md.h
    public void i(String str, String str2) {
        this.f15849a.a(new BasicHeader(str, str2));
    }

    @Override // md.h
    public void k(md.d[] dVarArr) {
        this.f15849a.i(dVarArr);
    }

    @Override // md.h
    public void l(md.d dVar) {
        this.f15849a.a(dVar);
    }

    @Override // md.h
    public boolean m(String str) {
        return this.f15849a.b(str);
    }

    @Override // md.h
    public md.d n(String str) {
        return this.f15849a.c(str);
    }

    public md.f o() {
        return this.f15849a.f();
    }
}
