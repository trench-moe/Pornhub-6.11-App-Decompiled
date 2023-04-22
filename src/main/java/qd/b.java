package qd;

import cz.msebera.android.httpclient.ProtocolVersion;
import cz.msebera.android.httpclient.message.BasicStatusLine;
import java.util.Locale;
import l9.e;
import md.l;
import md.m;
import md.p;
import ud.f;

/* loaded from: classes2.dex */
public class b implements m {

    /* renamed from: b  reason: collision with root package name */
    public static final b f14503b = new b();

    /* renamed from: a  reason: collision with root package name */
    public final p f14504a = c.f14505a;

    public l a(ProtocolVersion protocolVersion, int i10, vd.a aVar) {
        e.l(protocolVersion, "HTTP version");
        Locale locale = Locale.getDefault();
        return new f(new BasicStatusLine(protocolVersion, i10, this.f14504a.a(i10, locale)), this.f14504a, locale);
    }
}
