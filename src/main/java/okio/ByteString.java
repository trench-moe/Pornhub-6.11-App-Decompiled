package okio;

import bf.b;
import bf.f;
import com.appsflyer.oaid.BuildConfig;
import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u001a\u0010\u000b\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lokio/ByteString;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, "Ljava/io/ObjectInputStream;", "in", BuildConfig.FLAVOR, "readObject", "Ljava/io/ObjectOutputStream;", "out", "writeObject", BuildConfig.FLAVOR, "data", "[B", "e", "()[B", "a", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public class ByteString implements Serializable, Comparable<ByteString> {
    private static final long serialVersionUID = 1;

    /* renamed from: c  reason: collision with root package name */
    public transient int f13729c;
    private final byte[] data;

    /* renamed from: f  reason: collision with root package name */
    public transient String f13730f;

    /* renamed from: m  reason: collision with root package name */
    public static final a f13728m = new a(null);
    @JvmField

    /* renamed from: j  reason: collision with root package name */
    public static final ByteString f13727j = new ByteString(new byte[0]);

    /* loaded from: classes3.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static ByteString d(a aVar, byte[] toByteString, int i10, int i11, int i12) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = toByteString.length;
            }
            Intrinsics.checkNotNullParameter(toByteString, "$this$toByteString");
            b.b(toByteString.length, i10, i11);
            return new ByteString(ArraysKt.copyOfRange(toByteString, i10, i11 + i10));
        }

        @JvmStatic
        public final ByteString a(String decodeBase64ToArray) {
            int i10;
            int i11;
            char charAt;
            Intrinsics.checkNotNullParameter(decodeBase64ToArray, "$this$decodeBase64");
            byte[] bArr = bf.a.f3656a;
            Intrinsics.checkNotNullParameter(decodeBase64ToArray, "$this$decodeBase64ToArray");
            int length = decodeBase64ToArray.length();
            while (length > 0 && ((charAt = decodeBase64ToArray.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
                length = i11;
            }
            int i12 = (int) ((length * 6) / 8);
            byte[] bArr2 = new byte[i12];
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                if (i13 < length) {
                    char charAt2 = decodeBase64ToArray.charAt(i13);
                    if ('A' <= charAt2 && 'Z' >= charAt2) {
                        i10 = charAt2 - 'A';
                    } else if ('a' <= charAt2 && 'z' >= charAt2) {
                        i10 = charAt2 - 'G';
                    } else if ('0' <= charAt2 && '9' >= charAt2) {
                        i10 = charAt2 + 4;
                    } else if (charAt2 == '+' || charAt2 == '-') {
                        i10 = 62;
                    } else if (charAt2 == '/' || charAt2 == '_') {
                        i10 = 63;
                    } else {
                        if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                            break;
                        }
                        i13++;
                    }
                    i15 = (i15 << 6) | i10;
                    i14++;
                    if (i14 % 4 == 0) {
                        int i17 = i16 + 1;
                        bArr2[i16] = (byte) (i15 >> 16);
                        int i18 = i17 + 1;
                        bArr2[i17] = (byte) (i15 >> 8);
                        bArr2[i18] = (byte) i15;
                        i16 = i18 + 1;
                    }
                    i13++;
                } else {
                    int i19 = i14 % 4;
                    if (i19 != 1) {
                        if (i19 == 2) {
                            bArr2[i16] = (byte) ((i15 << 12) >> 16);
                            i16++;
                        } else if (i19 == 3) {
                            int i20 = i15 << 6;
                            int i21 = i16 + 1;
                            bArr2[i16] = (byte) (i20 >> 16);
                            i16 = i21 + 1;
                            bArr2[i21] = (byte) (i20 >> 8);
                        }
                        if (i16 != i12) {
                            bArr2 = Arrays.copyOf(bArr2, i16);
                            Intrinsics.checkNotNullExpressionValue(bArr2, "java.util.Arrays.copyOf(this, newSize)");
                        }
                    }
                }
            }
            bArr2 = null;
            if (bArr2 != null) {
                return new ByteString(bArr2);
            }
            return null;
        }

        @JvmStatic
        public final ByteString b(String decodeHex) {
            Intrinsics.checkNotNullParameter(decodeHex, "$this$decodeHex");
            if (decodeHex.length() % 2 == 0) {
                int length = decodeHex.length() / 2;
                byte[] bArr = new byte[length];
                for (int i10 = 0; i10 < length; i10++) {
                    int i11 = i10 * 2;
                    bArr[i10] = (byte) (a0.b.b(decodeHex.charAt(i11 + 1)) + (a0.b.b(decodeHex.charAt(i11)) << 4));
                }
                return new ByteString(bArr);
            }
            throw new IllegalArgumentException(a1.a.l("Unexpected hex string: ", decodeHex).toString());
        }

        @JvmStatic
        public final ByteString c(String asUtf8ToByteArray) {
            Intrinsics.checkNotNullParameter(asUtf8ToByteArray, "$this$encodeUtf8");
            Intrinsics.checkNotNullParameter(asUtf8ToByteArray, "$this$asUtf8ToByteArray");
            byte[] bytes = asUtf8ToByteArray.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            ByteString byteString = new ByteString(bytes);
            byteString.f13730f = asUtf8ToByteArray;
            return byteString;
        }
    }

    public ByteString(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @JvmStatic
    public static final ByteString d(String str) {
        return f13728m.c(str);
    }

    private final void readObject(ObjectInputStream readByteString) {
        int readInt = readByteString.readInt();
        Intrinsics.checkNotNullParameter(readByteString, "$this$readByteString");
        int i10 = 0;
        if (!(readInt >= 0)) {
            throw new IllegalArgumentException(a1.a.j("byteCount < 0: ", readInt).toString());
        }
        byte[] bArr = new byte[readInt];
        while (i10 < readInt) {
            int read = readByteString.read(bArr, i10, readInt - i10);
            if (read == -1) {
                throw new EOFException();
            }
            i10 += read;
        }
        ByteString byteString = new ByteString(bArr);
        Field field = ByteString.class.getDeclaredField("data");
        Intrinsics.checkNotNullExpressionValue(field, "field");
        field.setAccessible(true);
        field.set(this, byteString.data);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public String b() {
        byte[] encodeBase64 = this.data;
        byte[] bArr = bf.a.f3656a;
        byte[] map = bf.a.f3656a;
        Intrinsics.checkNotNullParameter(encodeBase64, "$this$encodeBase64");
        Intrinsics.checkNotNullParameter(map, "map");
        byte[] toUtf8String = new byte[((encodeBase64.length + 2) / 3) * 4];
        int length = encodeBase64.length - (encodeBase64.length % 3);
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            byte b10 = encodeBase64[i10];
            int i13 = i12 + 1;
            byte b11 = encodeBase64[i12];
            int i14 = i13 + 1;
            byte b12 = encodeBase64[i13];
            int i15 = i11 + 1;
            toUtf8String[i11] = map[(b10 & UByte.MAX_VALUE) >> 2];
            int i16 = i15 + 1;
            toUtf8String[i15] = map[((b10 & 3) << 4) | ((b11 & UByte.MAX_VALUE) >> 4)];
            int i17 = i16 + 1;
            toUtf8String[i16] = map[((b11 & 15) << 2) | ((b12 & UByte.MAX_VALUE) >> 6)];
            i11 = i17 + 1;
            toUtf8String[i17] = map[b12 & 63];
            i10 = i14;
        }
        int length2 = encodeBase64.length - length;
        if (length2 == 1) {
            byte b13 = encodeBase64[i10];
            int i18 = i11 + 1;
            toUtf8String[i11] = map[(b13 & UByte.MAX_VALUE) >> 2];
            int i19 = i18 + 1;
            toUtf8String[i18] = map[(b13 & 3) << 4];
            byte b14 = (byte) 61;
            toUtf8String[i19] = b14;
            toUtf8String[i19 + 1] = b14;
        } else if (length2 == 2) {
            int i20 = i10 + 1;
            byte b15 = encodeBase64[i10];
            byte b16 = encodeBase64[i20];
            int i21 = i11 + 1;
            toUtf8String[i11] = map[(b15 & UByte.MAX_VALUE) >> 2];
            int i22 = i21 + 1;
            toUtf8String[i21] = map[((b15 & 3) << 4) | ((b16 & UByte.MAX_VALUE) >> 4)];
            toUtf8String[i22] = map[(b16 & 15) << 2];
            toUtf8String[i22 + 1] = (byte) 61;
        }
        Intrinsics.checkNotNullParameter(toUtf8String, "$this$toUtf8String");
        return new String(toUtf8String, Charsets.UTF_8);
    }

    public ByteString c(String algorithm) {
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, f());
        byte[] digestBytes = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(digestBytes, "digestBytes");
        return new ByteString(digestBytes);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int compareTo(okio.ByteString r8) {
        /*
            r7 = this;
            okio.ByteString r8 = (okio.ByteString) r8
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            int r0 = r7.f()
            int r1 = r8.f()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L15:
            if (r4 >= r2) goto L2b
            byte r5 = r7.i(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.i(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L28
            int r4 = r4 + 1
            goto L15
        L28:
            if (r5 >= r6) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.compareTo(java.lang.Object):int");
    }

    public final byte[] e() {
        return this.data;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int f10 = byteString.f();
            byte[] bArr = this.data;
            if (f10 == bArr.length && byteString.k(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.data.length;
    }

    public String g() {
        byte[] bArr = this.data;
        char[] cArr = new char[bArr.length * 2];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            char[] cArr2 = a0.b.f121m;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] h() {
        return this.data;
    }

    public int hashCode() {
        int i10 = this.f13729c;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.f13729c = hashCode;
        return hashCode;
    }

    public byte i(int i10) {
        return this.data[i10];
    }

    public boolean j(int i10, ByteString other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        return other.k(i11, this.data, i10, i12);
    }

    public boolean k(int i10, byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 >= 0) {
            byte[] bArr = this.data;
            if (i10 <= bArr.length - i12 && i11 >= 0 && i11 <= other.length - i12 && b.a(bArr, i10, other, i11, i12)) {
                return true;
            }
        }
        return false;
    }

    public ByteString l() {
        byte b10;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i10 >= bArr.length) {
                return this;
            }
            byte b11 = bArr[i10];
            byte b12 = (byte) 65;
            if (b11 >= b12 && b11 <= (b10 = (byte) 90)) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                Intrinsics.checkNotNullExpressionValue(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i10] = (byte) (b11 + 32);
                for (int i11 = i10 + 1; i11 < copyOf.length; i11++) {
                    byte b13 = copyOf[i11];
                    if (b13 >= b12 && b13 <= b10) {
                        copyOf[i11] = (byte) (b13 + 32);
                    }
                }
                return new ByteString(copyOf);
            }
            i10++;
        }
    }

    public String m() {
        String str = this.f13730f;
        if (str == null) {
            byte[] toUtf8String = h();
            Intrinsics.checkNotNullParameter(toUtf8String, "$this$toUtf8String");
            String str2 = new String(toUtf8String, Charsets.UTF_8);
            this.f13730f = str2;
            return str2;
        }
        return str;
    }

    public void n(f buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(this, "$this$commonWrite");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        buffer.c0(this.data, i10, i11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x00f8, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0107, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0119, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0122, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0162, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0175, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0186, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0195, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x01ab, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x01b3, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x01ba, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x01f1, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x01f4, code lost:
        r5 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0089, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x009a, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a5, code lost:
        if (r4 == 64) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00e5, code lost:
        if (r4 == 64) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.ByteString.toString():java.lang.String");
    }
}
