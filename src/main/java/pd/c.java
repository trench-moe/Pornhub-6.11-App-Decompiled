package pd;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class c extends a implements Cloneable {

    /* renamed from: m  reason: collision with root package name */
    public final byte[] f13903m;
    public final int n;

    public c(byte[] bArr) {
        l9.e.l(bArr, "Source byte array");
        this.f13903m = bArr;
        this.n = bArr.length;
    }

    @Override // pd.a
    public InputStream a() {
        return new ByteArrayInputStream(this.f13903m, 0, this.n);
    }

    @Override // pd.a
    public long b() {
        return this.n;
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
        outputStream.write(this.f13903m, 0, this.n);
        outputStream.flush();
    }
}
