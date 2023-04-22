package bf;

import java.nio.channels.WritableByteChannel;
import okio.ByteString;

/* loaded from: classes2.dex */
public interface g extends w, WritableByteChannel {
    g D(int i10);

    g N(String str);

    g T(String str, int i10, int i11);

    g U(long j10);

    f b();

    g d0(byte[] bArr);

    g e0(ByteString byteString);

    @Override // bf.w, java.io.Flushable
    void flush();

    g j(byte[] bArr, int i10, int i11);

    g m0(long j10);

    g u(int i10);

    g x(int i10);
}
