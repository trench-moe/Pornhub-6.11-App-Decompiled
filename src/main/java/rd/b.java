package rd;

import cz.msebera.android.httpclient.ParseException;
import cz.msebera.android.httpclient.ProtocolException;
import l9.e;
import md.h;
import pd.d;

/* loaded from: classes2.dex */
public class b implements d {

    /* renamed from: f  reason: collision with root package name */
    public static final b f14757f = new b();

    /* renamed from: c  reason: collision with root package name */
    public final int f14758c;

    public b() {
        this.f14758c = -1;
    }

    public b(int i10) {
        this.f14758c = i10;
    }

    @Override // pd.d
    public long k(h hVar) {
        long j10;
        e.l(hVar, "HTTP message");
        md.d n = hVar.n("Transfer-Encoding");
        if (n != null) {
            try {
                md.e[] elements = n.getElements();
                int length = elements.length;
                return (!"identity".equalsIgnoreCase(n.getValue()) && length > 0 && "chunked".equalsIgnoreCase(elements[length + (-1)].getName())) ? -2L : -1L;
            } catch (ParseException e10) {
                throw new ProtocolException("Invalid Transfer-Encoding header value: " + n, e10);
            }
        } else if (hVar.n("Content-Length") != null) {
            md.d[] f10 = hVar.f("Content-Length");
            int length2 = f10.length;
            while (true) {
                length2--;
                if (length2 < 0) {
                    j10 = -1;
                    break;
                }
                try {
                    j10 = Long.parseLong(f10[length2].getValue());
                    break;
                } catch (NumberFormatException unused) {
                }
            }
            return j10 >= 0 ? j10 : -1L;
        } else {
            return this.f14758c;
        }
    }
}
