package u5;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public class i implements h5.e<InputStream, c> {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f15604a;

    /* renamed from: b  reason: collision with root package name */
    public final h5.e<ByteBuffer, c> f15605b;

    /* renamed from: c  reason: collision with root package name */
    public final k5.b f15606c;

    public i(List<ImageHeaderParser> list, h5.e<ByteBuffer, c> eVar, k5.b bVar) {
        this.f15604a = list;
        this.f15605b = eVar;
        this.f15606c = bVar;
    }

    @Override // h5.e
    public j5.i<c> a(InputStream inputStream, int i10, int i11, h5.d dVar) {
        byte[] bArr;
        InputStream inputStream2 = inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream2.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f15605b.a(ByteBuffer.wrap(bArr), i10, i11, dVar);
    }

    @Override // h5.e
    public boolean b(InputStream inputStream, h5.d dVar) {
        return !((Boolean) dVar.c(h.f15603b)).booleanValue() && com.bumptech.glide.load.a.b(this.f15604a, inputStream, this.f15606c) == ImageHeaderParser.ImageType.GIF;
    }
}
