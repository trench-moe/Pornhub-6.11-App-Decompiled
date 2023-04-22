package kotlin.reflect.jvm.internal.impl.protobuf;

import a1.a;
import android.support.v4.media.b;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public abstract class ByteString implements Iterable<Byte> {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final ByteString EMPTY = new LiteralByteString(new byte[0]);

    /* loaded from: classes3.dex */
    public interface ByteIterator extends Iterator<Byte> {
        byte nextByte();
    }

    /* loaded from: classes3.dex */
    public static final class Output extends OutputStream {
        private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
        private byte[] buffer;
        private int bufferPos;
        private final ArrayList<ByteString> flushedBuffers;
        private int flushedBuffersTotalBytes;
        private final int initialCapacity;

        public Output(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Buffer size < 0");
            }
            this.initialCapacity = i10;
            this.flushedBuffers = new ArrayList<>();
            this.buffer = new byte[i10];
        }

        private byte[] copyArray(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i10));
            return bArr2;
        }

        private void flushFullBuffer(int i10) {
            this.flushedBuffers.add(new LiteralByteString(this.buffer));
            int length = this.flushedBuffersTotalBytes + this.buffer.length;
            this.flushedBuffersTotalBytes = length;
            this.buffer = new byte[Math.max(this.initialCapacity, Math.max(i10, length >>> 1))];
            this.bufferPos = 0;
        }

        private void flushLastBuffer() {
            int i10 = this.bufferPos;
            byte[] bArr = this.buffer;
            if (i10 >= bArr.length) {
                this.flushedBuffers.add(new LiteralByteString(this.buffer));
                this.buffer = EMPTY_BYTE_ARRAY;
            } else if (i10 > 0) {
                this.flushedBuffers.add(new LiteralByteString(copyArray(bArr, i10)));
            }
            this.flushedBuffersTotalBytes += this.bufferPos;
            this.bufferPos = 0;
        }

        public synchronized int size() {
            return this.flushedBuffersTotalBytes + this.bufferPos;
        }

        public synchronized ByteString toByteString() {
            flushLastBuffer();
            return ByteString.copyFrom(this.flushedBuffers);
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i10) {
            if (this.bufferPos == this.buffer.length) {
                flushFullBuffer(1);
            }
            byte[] bArr = this.buffer;
            int i11 = this.bufferPos;
            this.bufferPos = i11 + 1;
            bArr[i11] = (byte) i10;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = this.buffer;
            int length = bArr2.length;
            int i12 = this.bufferPos;
            if (i11 <= length - i12) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.bufferPos += i11;
            } else {
                int length2 = bArr2.length - i12;
                System.arraycopy(bArr, i10, bArr2, i12, length2);
                int i13 = i11 - length2;
                flushFullBuffer(i13);
                System.arraycopy(bArr, i10 + length2, this.buffer, 0, i13);
                this.bufferPos = i13;
            }
        }
    }

    private static ByteString balancedConcat(Iterator<ByteString> it, int i10) {
        if (i10 == 1) {
            return it.next();
        }
        int i11 = i10 >>> 1;
        return balancedConcat(it, i11).concat(balancedConcat(it, i10 - i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    public static ByteString copyFrom(Iterable<ByteString> iterable) {
        ?? r02;
        if (iterable instanceof Collection) {
            r02 = (Collection) iterable;
        } else {
            r02 = new ArrayList();
            for (ByteString byteString : iterable) {
                r02.add(byteString);
            }
        }
        return r02.isEmpty() ? EMPTY : balancedConcat(r02.iterator(), r02.size());
    }

    public static ByteString copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteString copyFrom(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new LiteralByteString(bArr2);
    }

    public static ByteString copyFromUtf8(String str) {
        try {
            return new LiteralByteString(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public static Output newOutput() {
        return new Output(128);
    }

    public ByteString concat(ByteString byteString) {
        int size = size();
        int size2 = byteString.size();
        if (size + size2 < 2147483647L) {
            return RopeByteString.concatenate(this, byteString);
        }
        throw new IllegalArgumentException(a.h(53, "ByteString would be too long: ", size, "+", size2));
    }

    public void copyTo(byte[] bArr, int i10, int i11, int i12) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(b.e(30, "Source offset < 0: ", i10));
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(b.e(30, "Target offset < 0: ", i11));
        }
        if (i12 < 0) {
            throw new IndexOutOfBoundsException(b.e(23, "Length < 0: ", i12));
        }
        int i13 = i10 + i12;
        if (i13 > size()) {
            throw new IndexOutOfBoundsException(b.e(34, "Source end offset < 0: ", i13));
        }
        int i14 = i11 + i12;
        if (i14 > bArr.length) {
            throw new IndexOutOfBoundsException(b.e(34, "Target end offset < 0: ", i14));
        }
        if (i12 > 0) {
            copyToInternal(bArr, i10, i11, i12);
        }
    }

    public abstract void copyToInternal(byte[] bArr, int i10, int i11, int i12);

    public abstract int getTreeDepth();

    public abstract boolean isBalanced();

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract boolean isValidUtf8();

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Iterable
    public abstract Iterator<Byte> iterator();

    public abstract CodedInputStream newCodedInput();

    public abstract int partialHash(int i10, int i11, int i12);

    public abstract int partialIsValidUtf8(int i10, int i11, int i12);

    public abstract int peekCachedHashCode();

    public abstract int size();

    public byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return Internal.EMPTY_BYTE_ARRAY;
        }
        byte[] bArr = new byte[size];
        copyToInternal(bArr, 0, 0, size);
        return bArr;
    }

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract String toString(String str);

    public String toStringUtf8() {
        try {
            return toString("UTF-8");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("UTF-8 not supported?", e10);
        }
    }

    public void writeTo(OutputStream outputStream, int i10, int i11) {
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(b.e(30, "Source offset < 0: ", i10));
        }
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(b.e(23, "Length < 0: ", i11));
        }
        int i12 = i10 + i11;
        if (i12 > size()) {
            throw new IndexOutOfBoundsException(b.e(39, "Source end offset exceeded: ", i12));
        }
        if (i11 > 0) {
            writeToInternal(outputStream, i10, i11);
        }
    }

    public abstract void writeToInternal(OutputStream outputStream, int i10, int i11);
}
