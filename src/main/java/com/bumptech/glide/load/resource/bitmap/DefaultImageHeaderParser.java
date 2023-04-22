package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f5833a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f5834b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* loaded from: classes.dex */
    public interface Reader {

        /* loaded from: classes.dex */
        public static final class EndOfFileException extends IOException {
            private static final long serialVersionUID = 1;

            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a();

        int b(byte[] bArr, int i10);

        short c();

        long l(long j10);
    }

    /* loaded from: classes.dex */
    public static final class a implements Reader {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f5835a;

        public a(ByteBuffer byteBuffer) {
            this.f5835a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i10) {
            int min = Math.min(i10, this.f5835a.remaining());
            if (min == 0) {
                return -1;
            }
            this.f5835a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() {
            if (this.f5835a.remaining() >= 1) {
                return (short) (this.f5835a.get() & UByte.MAX_VALUE);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long l(long j10) {
            int min = (int) Math.min(this.f5835a.remaining(), j10);
            ByteBuffer byteBuffer = this.f5835a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f5836a;

        public b(byte[] bArr, int i10) {
            this.f5836a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public short a(int i10) {
            if (this.f5836a.remaining() - i10 >= 2) {
                return this.f5836a.getShort(i10);
            }
            return (short) -1;
        }

        public int b(int i10) {
            if (this.f5836a.remaining() - i10 >= 4) {
                return this.f5836a.getInt(i10);
            }
            return -1;
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements Reader {

        /* renamed from: a  reason: collision with root package name */
        public final InputStream f5837a;

        public c(InputStream inputStream) {
            this.f5837a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int a() {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public int b(byte[] bArr, int i10) {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f5837a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i11;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public short c() {
            int read = this.f5837a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public long l(long j10) {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long skip = this.f5837a.skip(j11);
                if (skip <= 0) {
                    if (this.f5837a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j11 -= skip;
            }
            return j10 - j11;
        }
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) {
        Objects.requireNonNull(byteBuffer, "Argument must not be null");
        return f(new a(byteBuffer));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(ByteBuffer byteBuffer, k5.b bVar) {
        Objects.requireNonNull(byteBuffer, "Argument must not be null");
        a aVar = new a(byteBuffer);
        Objects.requireNonNull(bVar, "Argument must not be null");
        return e(aVar, bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public ImageHeaderParser.ImageType c(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "Argument must not be null");
        return f(new c(inputStream));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(InputStream inputStream, k5.b bVar) {
        Objects.requireNonNull(inputStream, "Argument must not be null");
        c cVar = new c(inputStream);
        Objects.requireNonNull(bVar, "Argument must not be null");
        return e(cVar, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028 A[Catch: EndOfFileException -> 0x0075, TRY_ENTER, TryCatch #2 {EndOfFileException -> 0x0075, blocks: (B:3:0x0003, B:16:0x0028, B:18:0x002f, B:21:0x0049, B:23:0x0050, B:25:0x0056, B:27:0x005d, B:29:0x006b, B:28:0x0066), top: B:35:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0049 A[Catch: EndOfFileException -> 0x0075, TryCatch #2 {EndOfFileException -> 0x0075, blocks: (B:3:0x0003, B:16:0x0028, B:18:0x002f, B:21:0x0049, B:23:0x0050, B:25:0x0056, B:27:0x005d, B:29:0x006b, B:28:0x0066), top: B:35:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r10, k5.b r11) {
        /*
            r9 = this;
            r5 = r9
            r0 = -1
            r8 = 5
            int r7 = r10.a()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L75
            r1 = r7
            r2 = 65496(0xffd8, float:9.178E-41)
            r3 = r1 & r2
            if (r3 == r2) goto L1e
            r2 = 19789(0x4d4d, float:2.773E-41)
            r7 = 3
            if (r1 == r2) goto L1e
            r2 = 18761(0x4949, float:2.629E-41)
            r7 = 7
            if (r1 != r2) goto L1a
            goto L1f
        L1a:
            r8 = 6
            r2 = 0
            r7 = 5
            goto L21
        L1e:
            r7 = 6
        L1f:
            r2 = 1
            r7 = 7
        L21:
            r3 = 3
            r7 = 5
            java.lang.String r8 = "DfltImageHeaderParser"
            r4 = r8
            if (r2 != 0) goto L49
            r8 = 6
            boolean r10 = android.util.Log.isLoggable(r4, r3)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L75
            if (r10 == 0) goto L47
            r8 = 1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L75
            r10.<init>()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L75
            r8 = 4
            java.lang.String r8 = "Parser doesn't handle magic number: "
            r11 = r8
            r10.append(r11)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L75
            r10.append(r1)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L75
            java.lang.String r7 = r10.toString()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L75
            r10 = r7
            android.util.Log.d(r4, r10)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L75
        L47:
            r7 = 5
            return r0
        L49:
            r7 = 5
            int r1 = r5.g(r10)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L75
            if (r1 != r0) goto L5d
            boolean r10 = android.util.Log.isLoggable(r4, r3)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L75
            if (r10 == 0) goto L5c
            java.lang.String r7 = "Failed to parse exif segment length, or exif segment not found"
            r10 = r7
            android.util.Log.d(r4, r10)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L75
        L5c:
            return r0
        L5d:
            java.lang.Class<byte[]> r2 = byte[].class
            java.lang.Object r7 = r11.e(r1, r2)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L75
            r2 = r7
            byte[] r2 = (byte[]) r2     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L75
            int r7 = r5.h(r10, r2, r1)     // Catch: java.lang.Throwable -> L6f
            r10 = r7
            r11.d(r2)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L75
            return r10
        L6f:
            r10 = move-exception
            r11.d(r2)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L75
            r8 = 1
            throw r10     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> L75
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.e(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader, k5.b):int");
    }

    public final ImageHeaderParser.ImageType f(Reader reader) {
        try {
            int a10 = reader.a();
            if (a10 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int c10 = (a10 << 8) | reader.c();
            if (c10 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int c11 = (c10 << 8) | reader.c();
            if (c11 == -1991225785) {
                reader.l(21L);
                try {
                    return reader.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (c11 == 1380533830) {
                reader.l(4L);
                if (((reader.a() << 16) | reader.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int a11 = (reader.a() << 16) | reader.a();
                if ((a11 & (-256)) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i10 = a11 & KotlinVersion.MAX_COMPONENT_VALUE;
                if (i10 == 88) {
                    reader.l(4L);
                    short c12 = reader.c();
                    return (c12 & 2) != 0 ? ImageHeaderParser.ImageType.ANIMATED_WEBP : (c12 & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else if (i10 == 76) {
                    reader.l(4L);
                    return (reader.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                } else {
                    return ImageHeaderParser.ImageType.WEBP;
                }
            } else {
                boolean z10 = false;
                if (((reader.a() << 16) | reader.a()) == 1718909296) {
                    int a12 = (reader.a() << 16) | reader.a();
                    if (a12 != 1635150182) {
                        if (a12 != 1635150195) {
                            reader.l(4L);
                            int i11 = c11 - 16;
                            if (i11 % 4 == 0) {
                                int i12 = 0;
                                while (i12 < 5 && i11 > 0) {
                                    int a13 = (reader.a() << 16) | reader.a();
                                    if (a13 != 1635150182) {
                                        if (a13 != 1635150195) {
                                            i12++;
                                            i11 -= 4;
                                        }
                                    }
                                }
                            }
                        }
                        z10 = true;
                        break;
                    }
                    z10 = true;
                    break;
                }
                return z10 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
            }
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public final int g(Reader reader) {
        short c10;
        int a10;
        long j10;
        long l10;
        do {
            short c11 = reader.c();
            if (c11 != 255) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    a1.a.u("Unknown segmentId=", c11, "DfltImageHeaderParser");
                }
                return -1;
            }
            c10 = reader.c();
            if (c10 == 218) {
                return -1;
            }
            if (c10 == 217) {
                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    Log.d("DfltImageHeaderParser", "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            a10 = reader.a() - 2;
            if (c10 == 225) {
                return a10;
            }
            j10 = a10;
            l10 = reader.l(j10);
        } while (l10 == j10);
        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
            StringBuilder o10 = a1.a.o("Unable to skip enough data, type: ", c10, ", wanted to skip: ", a10, ", but actually skipped: ");
            o10.append(l10);
            Log.d("DfltImageHeaderParser", o10.toString());
        }
        return -1;
    }

    public final int h(Reader reader, byte[] bArr, int i10) {
        ByteOrder byteOrder;
        int b10 = reader.b(bArr, i10);
        if (b10 != i10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + b10);
            }
            return -1;
        }
        boolean z10 = bArr != null && i10 > f5833a.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f5833a;
                if (i11 >= bArr2.length) {
                    break;
                } else if (bArr[i11] != bArr2[i11]) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
        }
        if (!z10) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                Log.d("DfltImageHeaderParser", "Missing jpeg exif preamble");
            }
            return -1;
        }
        b bVar = new b(bArr, i10);
        short a10 = bVar.a(6);
        if (a10 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a10 != 19789) {
            if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                a1.a.u("Unknown endianness = ", a10, "DfltImageHeaderParser");
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.f5836a.order(byteOrder);
        int b11 = bVar.b(10) + 6;
        short a11 = bVar.a(b11);
        for (int i12 = 0; i12 < a11; i12++) {
            int i13 = (i12 * 12) + b11 + 2;
            short a12 = bVar.a(i13);
            if (a12 == 274) {
                short a13 = bVar.a(i13 + 2);
                if (a13 >= 1 && a13 <= 12) {
                    int b12 = bVar.b(i13 + 4);
                    if (b12 >= 0) {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder o10 = a1.a.o("Got tagIndex=", i12, " tagType=", a12, " formatCode=");
                            o10.append((int) a13);
                            o10.append(" componentCount=");
                            o10.append(b12);
                            Log.d("DfltImageHeaderParser", o10.toString());
                        }
                        int i14 = b12 + f5834b[a13];
                        if (i14 <= 4) {
                            int i15 = i13 + 8;
                            if (i15 < 0 || i15 > bVar.f5836a.remaining()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    Log.d("DfltImageHeaderParser", "Illegal tagValueOffset=" + i15 + " tagType=" + ((int) a12));
                                }
                            } else if (i14 >= 0 && i14 + i15 <= bVar.f5836a.remaining()) {
                                return bVar.a(i15);
                            } else {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    a1.a.u("Illegal number of bytes for TI tag data tagType=", a12, "DfltImageHeaderParser");
                                }
                            }
                        } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            a1.a.u("Got byte count > 4, not orientation, continuing, formatCode=", a13, "DfltImageHeaderParser");
                        }
                    } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                        Log.d("DfltImageHeaderParser", "Negative tiff component count");
                    }
                } else if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                    a1.a.u("Got invalid format code = ", a13, "DfltImageHeaderParser");
                }
            }
        }
        return -1;
    }
}
