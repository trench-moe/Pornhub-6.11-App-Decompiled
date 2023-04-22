package kotlin.reflect.jvm.internal.impl.protobuf;

import com.appsflyer.oaid.BuildConfig;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.UByte;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes3.dex */
public final class CodedInputStream {
    private final byte[] buffer;
    private final boolean bufferIsImmutable;
    private int bufferPos;
    private int bufferSize;
    private int bufferSizeAfterLimit;
    private int currentLimit;
    private boolean enableAliasing;
    private final InputStream input;
    private int lastTag;
    private int recursionDepth;
    private int recursionLimit;
    private RefillCallback refillCallback;
    private int sizeLimit;
    private int totalBytesRetired;

    /* loaded from: classes3.dex */
    public interface RefillCallback {
        void onRefill();
    }

    private CodedInputStream(InputStream inputStream) {
        this.enableAliasing = false;
        this.currentLimit = IntCompanionObject.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
        this.bufferSize = 0;
        this.bufferPos = 0;
        this.totalBytesRetired = 0;
        this.input = inputStream;
        this.bufferIsImmutable = false;
    }

    private CodedInputStream(LiteralByteString literalByteString) {
        this.enableAliasing = false;
        this.currentLimit = IntCompanionObject.MAX_VALUE;
        this.recursionLimit = 64;
        this.sizeLimit = 67108864;
        this.refillCallback = null;
        this.buffer = literalByteString.bytes;
        int offsetIntoBytes = literalByteString.getOffsetIntoBytes();
        this.bufferPos = offsetIntoBytes;
        this.bufferSize = offsetIntoBytes + literalByteString.size();
        this.totalBytesRetired = -this.bufferPos;
        this.input = null;
        this.bufferIsImmutable = true;
    }

    public static int decodeZigZag32(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long decodeZigZag64(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    private void ensureAvailable(int i10) {
        if (this.bufferSize - this.bufferPos < i10) {
            refillBuffer(i10);
        }
    }

    public static CodedInputStream newInstance(InputStream inputStream) {
        return new CodedInputStream(inputStream);
    }

    public static CodedInputStream newInstance(LiteralByteString literalByteString) {
        CodedInputStream codedInputStream = new CodedInputStream(literalByteString);
        try {
            codedInputStream.pushLimit(literalByteString.size());
            return codedInputStream;
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    private byte[] readRawBytesSlowPath(int i10) {
        if (i10 <= 0) {
            if (i10 == 0) {
                return Internal.EMPTY_BYTE_ARRAY;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i11 = this.totalBytesRetired;
        int i12 = this.bufferPos;
        int i13 = i11 + i12 + i10;
        int i14 = this.currentLimit;
        if (i13 > i14) {
            skipRawBytes((i14 - i11) - i12);
            throw InvalidProtocolBufferException.truncatedMessage();
        } else if (i10 < 4096) {
            byte[] bArr = new byte[i10];
            int i15 = this.bufferSize - i12;
            System.arraycopy(this.buffer, i12, bArr, 0, i15);
            this.bufferPos = this.bufferSize;
            int i16 = i10 - i15;
            ensureAvailable(i16);
            System.arraycopy(this.buffer, 0, bArr, i15, i16);
            this.bufferPos = i16;
            return bArr;
        } else {
            int i17 = this.bufferSize;
            this.totalBytesRetired = i11 + i17;
            this.bufferPos = 0;
            this.bufferSize = 0;
            int i18 = i17 - i12;
            int i19 = i10 - i18;
            ArrayList arrayList = new ArrayList();
            while (i19 > 0) {
                int min = Math.min(i19, (int) ConstantsKt.DEFAULT_BLOCK_SIZE);
                byte[] bArr2 = new byte[min];
                int i20 = 0;
                while (i20 < min) {
                    InputStream inputStream = this.input;
                    int read = inputStream == null ? -1 : inputStream.read(bArr2, i20, min - i20);
                    if (read == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.totalBytesRetired += read;
                    i20 += read;
                }
                i19 -= min;
                arrayList.add(bArr2);
            }
            byte[] bArr3 = new byte[i10];
            System.arraycopy(this.buffer, i12, bArr3, 0, i18);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr4 = (byte[]) it.next();
                System.arraycopy(bArr4, 0, bArr3, i18, bArr4.length);
                i18 += bArr4.length;
            }
            return bArr3;
        }
    }

    public static int readRawVarint32(int i10, InputStream inputStream) {
        if ((i10 & 128) == 0) {
            return i10;
        }
        int i11 = i10 & 127;
        int i12 = 7;
        while (i12 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i11 |= (read & 127) << i12;
            if ((read & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        while (i12 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((read2 & 128) == 0) {
                return i11;
            }
            i12 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    private void recomputeBufferSizeAfterLimit() {
        int i10 = this.bufferSize + this.bufferSizeAfterLimit;
        this.bufferSize = i10;
        int i11 = this.totalBytesRetired + i10;
        int i12 = this.currentLimit;
        if (i11 <= i12) {
            this.bufferSizeAfterLimit = 0;
            return;
        }
        int i13 = i11 - i12;
        this.bufferSizeAfterLimit = i13;
        this.bufferSize = i10 - i13;
    }

    private void refillBuffer(int i10) {
        if (!tryRefillBuffer(i10)) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private void skipRawBytesSlowPath(int i10) {
        if (i10 < 0) {
            throw InvalidProtocolBufferException.negativeSize();
        }
        int i11 = this.totalBytesRetired;
        int i12 = this.bufferPos;
        int i13 = i11 + i12 + i10;
        int i14 = this.currentLimit;
        if (i13 > i14) {
            skipRawBytes((i14 - i11) - i12);
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        int i15 = this.bufferSize;
        int i16 = i15 - i12;
        this.bufferPos = i15;
        refillBuffer(1);
        while (true) {
            int i17 = i10 - i16;
            int i18 = this.bufferSize;
            if (i17 <= i18) {
                this.bufferPos = i17;
                return;
            }
            i16 += i18;
            this.bufferPos = i18;
            refillBuffer(1);
        }
    }

    private boolean tryRefillBuffer(int i10) {
        int i11 = this.bufferPos;
        if (i11 + i10 <= this.bufferSize) {
            StringBuilder sb2 = new StringBuilder(77);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        } else if (this.totalBytesRetired + i11 + i10 > this.currentLimit) {
            return false;
        } else {
            RefillCallback refillCallback = this.refillCallback;
            if (refillCallback != null) {
                refillCallback.onRefill();
            }
            if (this.input != null) {
                int i12 = this.bufferPos;
                if (i12 > 0) {
                    int i13 = this.bufferSize;
                    if (i13 > i12) {
                        byte[] bArr = this.buffer;
                        System.arraycopy(bArr, i12, bArr, 0, i13 - i12);
                    }
                    this.totalBytesRetired += i12;
                    this.bufferSize -= i12;
                    this.bufferPos = 0;
                }
                InputStream inputStream = this.input;
                byte[] bArr2 = this.buffer;
                int i14 = this.bufferSize;
                int read = inputStream.read(bArr2, i14, bArr2.length - i14);
                if (read == 0 || read < -1 || read > this.buffer.length) {
                    StringBuilder sb3 = new StringBuilder(102);
                    sb3.append("InputStream#read(byte[]) returned invalid result: ");
                    sb3.append(read);
                    sb3.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb3.toString());
                } else if (read > 0) {
                    this.bufferSize += read;
                    if ((this.totalBytesRetired + i10) - this.sizeLimit <= 0) {
                        recomputeBufferSizeAfterLimit();
                        if (this.bufferSize >= i10) {
                            return true;
                        }
                        return tryRefillBuffer(i10);
                    }
                    throw InvalidProtocolBufferException.sizeLimitExceeded();
                }
            }
            return false;
        }
    }

    public void checkLastTagWas(int i10) {
        if (this.lastTag != i10) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    public int getBytesUntilLimit() {
        int i10 = this.currentLimit;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.totalBytesRetired + this.bufferPos);
    }

    public boolean isAtEnd() {
        return this.bufferPos == this.bufferSize && !tryRefillBuffer(1);
    }

    public void popLimit(int i10) {
        this.currentLimit = i10;
        recomputeBufferSizeAfterLimit();
    }

    public int pushLimit(int i10) {
        if (i10 >= 0) {
            int i11 = this.totalBytesRetired + this.bufferPos + i10;
            int i12 = this.currentLimit;
            if (i11 <= i12) {
                this.currentLimit = i11;
                recomputeBufferSizeAfterLimit();
                return i12;
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }
        throw InvalidProtocolBufferException.negativeSize();
    }

    public boolean readBool() {
        return readRawVarint64() != 0;
    }

    public ByteString readBytes() {
        int readRawVarint32 = readRawVarint32();
        int i10 = this.bufferSize;
        int i11 = this.bufferPos;
        if (readRawVarint32 > i10 - i11 || readRawVarint32 <= 0) {
            return readRawVarint32 == 0 ? ByteString.EMPTY : new LiteralByteString(readRawBytesSlowPath(readRawVarint32));
        }
        ByteString boundedByteString = (this.bufferIsImmutable && this.enableAliasing) ? new BoundedByteString(this.buffer, this.bufferPos, readRawVarint32) : ByteString.copyFrom(this.buffer, i11, readRawVarint32);
        this.bufferPos += readRawVarint32;
        return boundedByteString;
    }

    public double readDouble() {
        return Double.longBitsToDouble(readRawLittleEndian64());
    }

    public int readEnum() {
        return readRawVarint32();
    }

    public int readFixed32() {
        return readRawLittleEndian32();
    }

    public long readFixed64() {
        return readRawLittleEndian64();
    }

    public float readFloat() {
        return Float.intBitsToFloat(readRawLittleEndian32());
    }

    public void readGroup(int i10, MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
        int i11 = this.recursionDepth;
        if (i11 >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        this.recursionDepth = i11 + 1;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(WireFormat.makeTag(i10, 4));
        this.recursionDepth--;
    }

    public int readInt32() {
        return readRawVarint32();
    }

    public long readInt64() {
        return readRawVarint64();
    }

    public <T extends MessageLite> T readMessage(Parser<T> parser, ExtensionRegistryLite extensionRegistryLite) {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth < this.recursionLimit) {
            int pushLimit = pushLimit(readRawVarint32);
            this.recursionDepth++;
            T parsePartialFrom = parser.parsePartialFrom(this, extensionRegistryLite);
            checkLastTagWas(0);
            this.recursionDepth--;
            popLimit(pushLimit);
            return parsePartialFrom;
        }
        throw InvalidProtocolBufferException.recursionLimitExceeded();
    }

    public void readMessage(MessageLite.Builder builder, ExtensionRegistryLite extensionRegistryLite) {
        int readRawVarint32 = readRawVarint32();
        if (this.recursionDepth >= this.recursionLimit) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int pushLimit = pushLimit(readRawVarint32);
        this.recursionDepth++;
        builder.mergeFrom(this, extensionRegistryLite);
        checkLastTagWas(0);
        this.recursionDepth--;
        popLimit(pushLimit);
    }

    public byte readRawByte() {
        if (this.bufferPos == this.bufferSize) {
            refillBuffer(1);
        }
        byte[] bArr = this.buffer;
        int i10 = this.bufferPos;
        this.bufferPos = i10 + 1;
        return bArr[i10];
    }

    public int readRawLittleEndian32() {
        int i10 = this.bufferPos;
        if (this.bufferSize - i10 < 4) {
            refillBuffer(4);
            i10 = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i10 + 4;
        return ((bArr[i10 + 3] & UByte.MAX_VALUE) << 24) | (bArr[i10] & UByte.MAX_VALUE) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 16);
    }

    public long readRawLittleEndian64() {
        int i10 = this.bufferPos;
        if (this.bufferSize - i10 < 8) {
            refillBuffer(8);
            i10 = this.bufferPos;
        }
        byte[] bArr = this.buffer;
        this.bufferPos = i10 + 8;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        if (r2[r3] < 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int readRawVarint32() {
        /*
            r9 = this;
            int r0 = r9.bufferPos
            int r1 = r9.bufferSize
            if (r1 != r0) goto L8
            goto L7c
        L8:
            byte[] r2 = r9.buffer
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L13
            r9.bufferPos = r3
            return r0
        L13:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L19
            goto L7c
        L19:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            long r3 = (long) r0
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2d
            r5 = -128(0xffffffffffffff80, double:NaN)
        L29:
            long r2 = r3 ^ r5
            int r0 = (int) r2
            goto L82
        L2d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            long r7 = (long) r0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 < 0) goto L3f
            r0 = 16256(0x3f80, double:8.0315E-320)
            long r0 = r0 ^ r7
            int r0 = (int) r0
        L3d:
            r1 = r3
            goto L82
        L3f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            long r3 = (long) r0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L4f
            r5 = -2080896(0xffffffffffe03f80, double:NaN)
            goto L29
        L4f:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            long r4 = (long) r0
            r6 = 266354560(0xfe03f80, double:1.315966377E-315)
            long r4 = r4 ^ r6
            int r0 = (int) r4
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L82
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L82
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L3d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L82
        L7c:
            long r0 = r9.readRawVarint64SlowPath()
            int r1 = (int) r0
            return r1
        L82:
            r9.bufferPos = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawVarint32():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (r2[r0] < 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long readRawVarint64() {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream.readRawVarint64():long");
    }

    public long readRawVarint64SlowPath() {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte readRawByte = readRawByte();
            j10 |= (readRawByte & ByteCompanionObject.MAX_VALUE) << i10;
            if ((readRawByte & ByteCompanionObject.MIN_VALUE) == 0) {
                return j10;
            }
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public int readSFixed32() {
        return readRawLittleEndian32();
    }

    public long readSFixed64() {
        return readRawLittleEndian64();
    }

    public int readSInt32() {
        return decodeZigZag32(readRawVarint32());
    }

    public long readSInt64() {
        return decodeZigZag64(readRawVarint64());
    }

    public String readString() {
        int readRawVarint32 = readRawVarint32();
        int i10 = this.bufferSize;
        int i11 = this.bufferPos;
        if (readRawVarint32 > i10 - i11 || readRawVarint32 <= 0) {
            return readRawVarint32 == 0 ? BuildConfig.FLAVOR : new String(readRawBytesSlowPath(readRawVarint32), "UTF-8");
        }
        String str = new String(this.buffer, i11, readRawVarint32, "UTF-8");
        this.bufferPos += readRawVarint32;
        return str;
    }

    public String readStringRequireUtf8() {
        byte[] readRawBytesSlowPath;
        int readRawVarint32 = readRawVarint32();
        int i10 = this.bufferPos;
        if (readRawVarint32 <= this.bufferSize - i10 && readRawVarint32 > 0) {
            readRawBytesSlowPath = this.buffer;
            this.bufferPos = i10 + readRawVarint32;
        } else if (readRawVarint32 == 0) {
            return BuildConfig.FLAVOR;
        } else {
            readRawBytesSlowPath = readRawBytesSlowPath(readRawVarint32);
            i10 = 0;
        }
        if (Utf8.isValidUtf8(readRawBytesSlowPath, i10, i10 + readRawVarint32)) {
            return new String(readRawBytesSlowPath, i10, readRawVarint32, "UTF-8");
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public int readTag() {
        if (isAtEnd()) {
            this.lastTag = 0;
            return 0;
        }
        int readRawVarint32 = readRawVarint32();
        this.lastTag = readRawVarint32;
        if (WireFormat.getTagFieldNumber(readRawVarint32) != 0) {
            return this.lastTag;
        }
        throw InvalidProtocolBufferException.invalidTag();
    }

    public int readUInt32() {
        return readRawVarint32();
    }

    public long readUInt64() {
        return readRawVarint64();
    }

    public boolean skipField(int i10, CodedOutputStream codedOutputStream) {
        int tagWireType = WireFormat.getTagWireType(i10);
        if (tagWireType == 0) {
            long readInt64 = readInt64();
            codedOutputStream.writeRawVarint32(i10);
            codedOutputStream.writeUInt64NoTag(readInt64);
            return true;
        } else if (tagWireType == 1) {
            long readRawLittleEndian64 = readRawLittleEndian64();
            codedOutputStream.writeRawVarint32(i10);
            codedOutputStream.writeFixed64NoTag(readRawLittleEndian64);
            return true;
        } else if (tagWireType == 2) {
            ByteString readBytes = readBytes();
            codedOutputStream.writeRawVarint32(i10);
            codedOutputStream.writeBytesNoTag(readBytes);
            return true;
        } else if (tagWireType == 3) {
            codedOutputStream.writeRawVarint32(i10);
            skipMessage(codedOutputStream);
            int makeTag = WireFormat.makeTag(WireFormat.getTagFieldNumber(i10), 4);
            checkLastTagWas(makeTag);
            codedOutputStream.writeRawVarint32(makeTag);
            return true;
        } else if (tagWireType != 4) {
            if (tagWireType == 5) {
                int readRawLittleEndian32 = readRawLittleEndian32();
                codedOutputStream.writeRawVarint32(i10);
                codedOutputStream.writeFixed32NoTag(readRawLittleEndian32);
                return true;
            }
            throw InvalidProtocolBufferException.invalidWireType();
        } else {
            return false;
        }
    }

    public void skipMessage(CodedOutputStream codedOutputStream) {
        int readTag;
        do {
            readTag = readTag();
            if (readTag == 0) {
                return;
            }
        } while (skipField(readTag, codedOutputStream));
    }

    public void skipRawBytes(int i10) {
        int i11 = this.bufferSize;
        int i12 = this.bufferPos;
        if (i10 > i11 - i12 || i10 < 0) {
            skipRawBytesSlowPath(i10);
        } else {
            this.bufferPos = i12 + i10;
        }
    }
}
