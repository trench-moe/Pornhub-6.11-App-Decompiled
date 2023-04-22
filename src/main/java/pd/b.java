package pd;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.io.ConstantsKt;
import sd.j;

/* loaded from: classes2.dex */
public class b extends a {

    /* renamed from: m  reason: collision with root package name */
    public InputStream f13902m;
    public long n = -1;

    @Override // pd.a
    public InputStream a() {
        InputStream inputStream = this.f13902m;
        if (inputStream != null) {
            return inputStream;
        }
        throw new IllegalStateException("Content has not been provided");
    }

    @Override // pd.a
    public long b() {
        return this.n;
    }

    @Override // pd.a
    public boolean c() {
        InputStream inputStream = this.f13902m;
        return (inputStream == null || inputStream == j.f14987c) ? false : true;
    }

    @Override // pd.a
    public void f(OutputStream outputStream) {
        InputStream a10 = a();
        try {
            byte[] bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
            while (true) {
                int read = a10.read(bArr);
                if (read == -1) {
                    a10.close();
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        } catch (Throwable th) {
            a10.close();
            throw th;
        }
    }
}
