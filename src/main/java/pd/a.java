package pd;

import cz.msebera.android.httpclient.message.BasicHeader;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: c  reason: collision with root package name */
    public md.d f13899c;

    /* renamed from: f  reason: collision with root package name */
    public md.d f13900f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f13901j;

    public abstract InputStream a();

    public abstract long b();

    public abstract boolean c();

    public void d(String str) {
        this.f13899c = new BasicHeader("Content-Type", str);
    }

    public abstract void f(OutputStream outputStream);

    public String toString() {
        StringBuilder m10 = a0.a.m('[');
        if (this.f13899c != null) {
            m10.append("Content-Type: ");
            m10.append(this.f13899c.getValue());
            m10.append(',');
        }
        if (this.f13900f != null) {
            m10.append("Content-Encoding: ");
            m10.append(this.f13900f.getValue());
            m10.append(',');
        }
        long b10 = b();
        if (b10 >= 0) {
            m10.append("Content-Length: ");
            m10.append(b10);
            m10.append(',');
        }
        m10.append("Chunked: ");
        return a0.a.l(m10, this.f13901j, ']');
    }
}
