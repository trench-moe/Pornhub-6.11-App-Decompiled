package k1;

import java.io.RandomAccessFile;
import java.util.zip.ZipException;
import l.InterfaceC0186;

/* loaded from: classes2.dex */
public final class c {

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f11771a;

        /* renamed from: b  reason: collision with root package name */
        public long f11772b;
    }

    public static a a(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            StringBuilder m10 = a1.a.m("File too short to be a zip file: ");
            m10.append(randomAccessFile.length());
            throw new ZipException(m10.toString());
        }
        long j10 = length - 65536;
        long j11 = j10 >= 0 ? j10 : 0L;
        int reverseBytes = Integer.reverseBytes(InterfaceC0186.f41);
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.f11772b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                aVar.f11771a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return aVar;
            }
            length--;
        } while (length >= j11);
        throw new ZipException("End Of Central Directory signature not found");
    }
}
