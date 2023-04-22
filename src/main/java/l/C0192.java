package l;

import java.io.OutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* renamed from: l.ۦۜۖ  reason: contains not printable characters */
/* loaded from: mthook/hook.dex */
public class C0192 extends DeflaterOutputStream {
    public C0192(OutputStream outputStream, int i10) {
        super(outputStream, new Deflater(i10, true));
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        this.def.end();
    }
}
