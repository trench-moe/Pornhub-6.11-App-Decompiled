package bf;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import okio.ByteString;

/* loaded from: classes2.dex */
public interface h extends y, ReadableByteChannel {
    byte[] A();

    long B(ByteString byteString);

    boolean C();

    long I(w wVar);

    long K(ByteString byteString);

    String L(long j10);

    int M(p pVar);

    boolean Q(long j10, ByteString byteString);

    String a0();

    f b();

    byte[] b0(long j10);

    void k0(long j10);

    void l(long j10);

    long n0();

    InputStream o0();

    @Deprecated(level = DeprecationLevel.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @ReplaceWith(expression = "buffer", imports = {}))
    f q();

    ByteString r(long j10);

    byte readByte();

    int readInt();

    short readShort();

    boolean request(long j10);
}
