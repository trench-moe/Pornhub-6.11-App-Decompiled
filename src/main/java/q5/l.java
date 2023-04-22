package q5;

import a1.b;
import com.bumptech.glide.load.ImageHeaderParser;
import d6.a;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class l implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(ByteBuffer byteBuffer, k5.b bVar) {
        AtomicReference<byte[]> atomicReference = d6.a.f8777a;
        return d(new a.C0120a(byteBuffer), bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(InputStream inputStream, k5.b bVar) {
        a1.b bVar2 = new a1.b(inputStream);
        b.c e10 = bVar2.e("Orientation");
        int i10 = 1;
        if (e10 != null) {
            try {
                i10 = e10.f(bVar2.f142g);
            } catch (NumberFormatException unused) {
            }
        }
        if (i10 == 0) {
            return -1;
        }
        return i10;
    }
}
