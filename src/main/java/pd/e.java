package pd;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public class e extends a {

    /* renamed from: m  reason: collision with root package name */
    public final InputStream f13904m;
    public final long n;

    public e(InputStream inputStream, long j10) {
        this.f13904m = inputStream;
        this.n = j10;
    }

    @Override // pd.a
    public InputStream a() {
        return this.f13904m;
    }

    @Override // pd.a
    public long b() {
        return this.n;
    }

    @Override // pd.a
    public boolean c() {
        return true;
    }

    @Override // pd.a
    public void f(OutputStream outputStream) {
        InputStream inputStream = this.f13904m;
        try {
            byte[] bArr = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
            long j10 = this.n;
            if (j10 < 0) {
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read);
                }
            } else {
                while (j10 > 0) {
                    int read2 = inputStream.read(bArr, 0, (int) Math.min(4096L, j10));
                    if (read2 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read2);
                    j10 -= read2;
                }
            }
            inputStream.close();
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }
}
