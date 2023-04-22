package vd;

import cz.msebera.android.httpclient.HttpVersion;
import cz.msebera.android.httpclient.ProtocolException;
import cz.msebera.android.httpclient.ProtocolVersion;
import md.l;
import md.n;

/* loaded from: classes2.dex */
public class h implements n {
    @Override // md.n
    public void b(l lVar, a aVar) {
        l9.e.l(lVar, "HTTP response");
        if (lVar.m("Transfer-Encoding")) {
            throw new ProtocolException("Transfer-encoding header already present");
        }
        if (lVar.m("Content-Length")) {
            throw new ProtocolException("Content-Length header already present");
        }
        ProtocolVersion a10 = lVar.g().a();
        pd.a b10 = lVar.b();
        if (b10 != null) {
            long b11 = b10.b();
            if (b10.f13901j && !a10.b(HttpVersion.f8581f)) {
                lVar.i("Transfer-Encoding", "chunked");
            } else if (b11 >= 0) {
                lVar.i("Content-Length", Long.toString(b10.b()));
            }
            if (b10.f13899c != null && !lVar.m("Content-Type")) {
                lVar.l(b10.f13899c);
            }
            if (b10.f13900f != null && !lVar.m("Content-Encoding")) {
                lVar.l(b10.f13900f);
            }
        } else {
            int b12 = lVar.g().b();
            if (b12 != 204 && b12 != 304 && b12 != 205) {
                lVar.i("Content-Length", "0");
            }
        }
    }
}
