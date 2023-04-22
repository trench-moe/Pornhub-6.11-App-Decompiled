package l;

import java.io.EOFException;
import java.io.InputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* renamed from: l.ۘۢۥ  reason: contains not printable characters */
/* loaded from: mthook/hook.dex */
public class C0179 extends InflaterInputStream {

    /* renamed from: ۬ۧۡ  reason: collision with root package name */
    private boolean f12152;

    public C0179(InputStream inputStream) {
        super(inputStream, new Inflater(true));
        this.f12152 = false;
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        if (this.f12152) {
            return;
        }
        this.inf.end();
        this.f12152 = true;
    }

    @Override // java.util.zip.InflaterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) {
        try {
            return super.read(bArr, i10, i11);
        } catch (EOFException unused) {
            return -1;
        }
    }
}
