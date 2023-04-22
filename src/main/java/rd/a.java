package rd;

import cz.msebera.android.httpclient.ProtocolException;
import md.h;
import pd.d;

/* loaded from: classes2.dex */
public class a implements d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f14755f = new a(new b(0));

    /* renamed from: c  reason: collision with root package name */
    public final d f14756c;

    public a(d dVar) {
        this.f14756c = dVar;
    }

    @Override // pd.d
    public long k(h hVar) {
        long k10 = this.f14756c.k(hVar);
        if (k10 != -1) {
            return k10;
        }
        throw new ProtocolException("Identity transfer encoding cannot be used");
    }
}
