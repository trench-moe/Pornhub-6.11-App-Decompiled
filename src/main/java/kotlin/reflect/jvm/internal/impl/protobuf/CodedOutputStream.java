package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import kotlin.KotlinVersion;
import kotlin.io.ConstantsKt;

/* loaded from: classes3.dex */
public final class CodedOutputStream {
    private final byte[] buffer;
    private final int limit;
    private final OutputStream output;
    private int totalBytesWritten = 0;
    private int position = 0;

    /* loaded from: classes3.dex */
    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private CodedOutputStream(OutputStream outputStream, byte[] bArr) {
        this.output = outputStream;
        this.buffer = bArr;
        this.limit = bArr.length;
    }

    public static int computeBoolSize(int i10, boolean z10) {
        return computeBoolSizeNoTag(z10) + computeTagSize(i10);
    }

    public static int computeBoolSizeNoTag(boolean z10) {
        return 1;
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeRawVarint32Size(bArr.length) + bArr.length;
    }

    public static int computeBytesSize(int i10, ByteString byteString) {
        return computeBytesSizeNoTag(byteString) + computeTagSize(i10);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return byteString.size() + computeRawVarint32Size(byteString.size());
    }

    public static int computeDoubleSize(int i10, double d) {
        return computeDoubleSizeNoTag(d) + computeTagSize(i10);
    }

    public static int computeDoubleSizeNoTag(double d) {
        return 8;
    }

    public static int computeEnumSize(int i10, int i11) {
        return computeEnumSizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeEnumSizeNoTag(int i10) {
        return computeInt32SizeNoTag(i10);
    }

    public static int computeFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeFloatSize(int i10, float f10) {
        return computeFloatSizeNoTag(f10) + computeTagSize(i10);
    }

    public static int computeFloatSizeNoTag(float f10) {
        return 4;
    }

    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i10, int i11) {
        return computeInt32SizeNoTag(i11) + computeTagSize(i10);
    }

    public static int computeInt32SizeNoTag(int i10) {
        if (i10 >= 0) {
            return computeRawVarint32Size(i10);
        }
        return 10;
    }

    public static int computeInt64SizeNoTag(long j10) {
        return computeRawVarint64Size(j10);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        int serializedSize = lazyFieldLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computeMessageSize(int i10, MessageLite messageLite) {
        return computeMessageSizeNoTag(messageLite) + computeTagSize(i10);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        int serializedSize = messageLite.getSerializedSize();
        return computeRawVarint32Size(serializedSize) + serializedSize;
    }

    public static int computePreferredBufferSize(int i10) {
        return i10 > 4096 ? ConstantsKt.DEFAULT_BLOCK_SIZE : i10;
    }

    public static int computeRawVarint32Size(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeRawVarint64Size(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int computeSFixed32SizeNoTag(int i10) {
        return 4;
    }

    public static int computeSFixed64SizeNoTag(long j10) {
        return 8;
    }

    public static int computeSInt32SizeNoTag(int i10) {
        return computeRawVarint32Size(encodeZigZag32(i10));
    }

    public static int computeSInt64Size(int i10, long j10) {
        return computeSInt64SizeNoTag(j10) + computeTagSize(i10);
    }

    public static int computeSInt64SizeNoTag(long j10) {
        return computeRawVarint64Size(encodeZigZag64(j10));
    }

    public static int computeStringSizeNoTag(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return computeRawVarint32Size(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported.", e10);
        }
    }

    public static int computeTagSize(int i10) {
        return computeRawVarint32Size(WireFormat.makeTag(i10, 0));
    }

    public static int computeUInt32SizeNoTag(int i10) {
        return computeRawVarint32Size(i10);
    }

    public static int computeUInt64SizeNoTag(long j10) {
        return computeRawVarint64Size(j10);
    }

    public static int encodeZigZag32(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long encodeZigZag64(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i10) {
        return new CodedOutputStream(outputStream, new byte[i10]);
    }

    private void refreshBuffer() {
        OutputStream outputStream = this.output;
        if (outputStream == null) {
            throw new OutOfSpaceException();
        }
        outputStream.write(this.buffer, 0, this.position);
        this.position = 0;
    }

    public void flush() {
        if (this.output != null) {
            refreshBuffer();
        }
    }

    public void writeBool(int i10, boolean z10) {
        writeTag(i10, 0);
        writeBoolNoTag(z10);
    }

    public void writeBoolNoTag(boolean z10) {
        writeRawByte(z10 ? 1 : 0);
    }

    public void writeByteArrayNoTag(byte[] bArr) {
        writeRawVarint32(bArr.length);
        writeRawBytes(bArr);
    }

    public void writeBytes(int i10, ByteString byteString) {
        writeTag(i10, 2);
        writeBytesNoTag(byteString);
    }

    public void writeBytesNoTag(ByteString byteString) {
        writeRawVarint32(byteString.size());
        writeRawBytes(byteString);
    }

    public void writeDouble(int i10, double d) {
        writeTag(i10, 1);
        writeDoubleNoTag(d);
    }

    public void writeDoubleNoTag(double d) {
        writeRawLittleEndian64(Double.doubleToRawLongBits(d));
    }

    public void writeEnum(int i10, int i11) {
        writeTag(i10, 0);
        writeEnumNoTag(i11);
    }

    public void writeEnumNoTag(int i10) {
        writeInt32NoTag(i10);
    }

    public void writeFixed32NoTag(int i10) {
        writeRawLittleEndian32(i10);
    }

    public void writeFixed64NoTag(long j10) {
        writeRawLittleEndian64(j10);
    }

    public void writeFloat(int i10, float f10) {
        writeTag(i10, 5);
        writeFloatNoTag(f10);
    }

    public void writeFloatNoTag(float f10) {
        writeRawLittleEndian32(Float.floatToRawIntBits(f10));
    }

    public void writeGroup(int i10, MessageLite messageLite) {
        writeTag(i10, 3);
        writeGroupNoTag(messageLite);
        writeTag(i10, 4);
    }

    public void writeGroupNoTag(MessageLite messageLite) {
        messageLite.writeTo(this);
    }

    public void writeInt32(int i10, int i11) {
        writeTag(i10, 0);
        writeInt32NoTag(i11);
    }

    public void writeInt32NoTag(int i10) {
        if (i10 >= 0) {
            writeRawVarint32(i10);
        } else {
            writeRawVarint64(i10);
        }
    }

    public void writeInt64NoTag(long j10) {
        writeRawVarint64(j10);
    }

    public void writeMessage(int i10, MessageLite messageLite) {
        writeTag(i10, 2);
        writeMessageNoTag(messageLite);
    }

    public void writeMessageNoTag(MessageLite messageLite) {
        writeRawVarint32(messageLite.getSerializedSize());
        messageLite.writeTo(this);
    }

    public void writeMessageSetExtension(int i10, MessageLite messageLite) {
        writeTag(1, 3);
        writeUInt32(2, i10);
        writeMessage(3, messageLite);
        writeTag(1, 4);
    }

    public void writeRawByte(byte b10) {
        if (this.position == this.limit) {
            refreshBuffer();
        }
        byte[] bArr = this.buffer;
        int i10 = this.position;
        this.position = i10 + 1;
        bArr[i10] = b10;
        this.totalBytesWritten++;
    }

    public void writeRawByte(int i10) {
        writeRawByte((byte) i10);
    }

    public void writeRawBytes(ByteString byteString) {
        writeRawBytes(byteString, 0, byteString.size());
    }

    public void writeRawBytes(ByteString byteString, int i10, int i11) {
        int i12 = this.limit;
        int i13 = this.position;
        if (i12 - i13 >= i11) {
            byteString.copyTo(this.buffer, i10, i13, i11);
            this.position += i11;
            this.totalBytesWritten += i11;
            return;
        }
        int i14 = i12 - i13;
        byteString.copyTo(this.buffer, i10, i13, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.position = this.limit;
        this.totalBytesWritten += i14;
        refreshBuffer();
        if (i16 <= this.limit) {
            byteString.copyTo(this.buffer, i15, 0, i16);
            this.position = i16;
        } else {
            byteString.writeTo(this.output, i15, i16);
        }
        this.totalBytesWritten += i16;
    }

    public void writeRawBytes(byte[] bArr) {
        writeRawBytes(bArr, 0, bArr.length);
    }

    public void writeRawBytes(byte[] bArr, int i10, int i11) {
        int i12 = this.limit;
        int i13 = this.position;
        if (i12 - i13 >= i11) {
            System.arraycopy(bArr, i10, this.buffer, i13, i11);
            this.position += i11;
            this.totalBytesWritten += i11;
            return;
        }
        int i14 = i12 - i13;
        System.arraycopy(bArr, i10, this.buffer, i13, i14);
        int i15 = i10 + i14;
        int i16 = i11 - i14;
        this.position = this.limit;
        this.totalBytesWritten += i14;
        refreshBuffer();
        if (i16 <= this.limit) {
            System.arraycopy(bArr, i15, this.buffer, 0, i16);
            this.position = i16;
        } else {
            this.output.write(bArr, i15, i16);
        }
        this.totalBytesWritten += i16;
    }

    public void writeRawLittleEndian32(int i10) {
        writeRawByte(i10 & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte((i10 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte((i10 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte((i10 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public void writeRawLittleEndian64(long j10) {
        writeRawByte(((int) j10) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j10 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j10 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j10 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j10 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j10 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j10 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        writeRawByte(((int) (j10 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public void writeRawVarint32(int i10) {
        while ((i10 & (-128)) != 0) {
            writeRawByte((i10 & 127) | 128);
            i10 >>>= 7;
        }
        writeRawByte(i10);
    }

    public void writeRawVarint64(long j10) {
        while (((-128) & j10) != 0) {
            writeRawByte((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        writeRawByte((int) j10);
    }

    public void writeSFixed32NoTag(int i10) {
        writeRawLittleEndian32(i10);
    }

    public void writeSFixed64NoTag(long j10) {
        writeRawLittleEndian64(j10);
    }

    public void writeSInt32NoTag(int i10) {
        writeRawVarint32(encodeZigZag32(i10));
    }

    public void writeSInt64(int i10, long j10) {
        writeTag(i10, 0);
        writeSInt64NoTag(j10);
    }

    public void writeSInt64NoTag(long j10) {
        writeRawVarint64(encodeZigZag64(j10));
    }

    public void writeStringNoTag(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        writeRawVarint32(bytes.length);
        writeRawBytes(bytes);
    }

    public void writeTag(int i10, int i11) {
        writeRawVarint32(WireFormat.makeTag(i10, i11));
    }

    public void writeUInt32(int i10, int i11) {
        writeTag(i10, 0);
        writeUInt32NoTag(i11);
    }

    public void writeUInt32NoTag(int i10) {
        writeRawVarint32(i10);
    }

    public void writeUInt64NoTag(long j10) {
        writeRawVarint64(j10);
    }
}
