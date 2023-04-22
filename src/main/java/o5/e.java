package o5;

import java.io.InputStream;
import java.net.URL;
import n5.f;
import n5.m;
import n5.n;
import n5.q;

/* loaded from: classes2.dex */
public class e implements m<URL, InputStream> {

    /* renamed from: a  reason: collision with root package name */
    public final m<f, InputStream> f13600a;

    /* loaded from: classes2.dex */
    public static class a implements n<URL, InputStream> {
        @Override // n5.n
        public m<URL, InputStream> a(q qVar) {
            return new e(qVar.b(f.class, InputStream.class));
        }
    }

    public e(m<f, InputStream> mVar) {
        this.f13600a = mVar;
    }

    @Override // n5.m
    public /* bridge */ /* synthetic */ boolean a(URL url) {
        return true;
    }

    @Override // n5.m
    public m.a<InputStream> b(URL url, int i10, int i11, h5.d dVar) {
        return this.f13600a.b(new f(url), i10, i11, dVar);
    }
}
