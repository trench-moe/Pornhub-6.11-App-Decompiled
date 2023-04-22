package pd;

import cz.msebera.android.httpclient.entity.ContentType;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* loaded from: classes2.dex */
public class f extends a implements Cloneable {

    /* renamed from: m  reason: collision with root package name */
    public final byte[] f13905m;

    public f(String str, ContentType contentType) {
        l9.e.l(str, "Source string");
        Charset c10 = contentType != null ? contentType.c() : null;
        this.f13905m = str.getBytes(c10 == null ? vd.b.f16196a : c10);
        if (contentType != null) {
            d(contentType.toString());
        }
    }

    public f(String str, String str2) {
        this(str, ContentType.b(ContentType.f8583c.d(), !l9.e.h(str2) ? Charset.forName(str2) : null));
    }

    @Override // pd.a
    public InputStream a() {
        return new ByteArrayInputStream(this.f13905m);
    }

    @Override // pd.a
    public long b() {
        return this.f13905m.length;
    }

    @Override // pd.a
    public boolean c() {
        return false;
    }

    public Object clone() {
        return super.clone();
    }

    @Override // pd.a
    public void f(OutputStream outputStream) {
        outputStream.write(this.f13905m);
        outputStream.flush();
    }
}
