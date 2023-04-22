package kotlin.reflect.jvm.internal.impl.protobuf;

import a1.a;
import android.support.v4.media.b;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class BoundedByteString extends LiteralByteString {
    private final int bytesLength;
    private final int bytesOffset;

    /* loaded from: classes3.dex */
    public class BoundedByteIterator implements ByteString.ByteIterator {
        private final int limit;
        private int position;

        private BoundedByteIterator() {
            int offsetIntoBytes = BoundedByteString.this.getOffsetIntoBytes();
            this.position = offsetIntoBytes;
            this.limit = offsetIntoBytes + BoundedByteString.this.size();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.position < this.limit;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Byte next() {
            return Byte.valueOf(nextByte());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.ByteString.ByteIterator
        public byte nextByte() {
            int i10 = this.position;
            if (i10 < this.limit) {
                byte[] bArr = BoundedByteString.this.bytes;
                this.position = i10 + 1;
                return bArr[i10];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public BoundedByteString(byte[] bArr, int i10, int i11) {
        super(bArr);
        if (i10 < 0) {
            throw new IllegalArgumentException(b.e(29, "Offset too small: ", i10));
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(b.e(29, "Length too small: ", i10));
        }
        if (i10 + i11 > bArr.length) {
            throw new IllegalArgumentException(a.h(48, "Offset+Length too large: ", i10, "+", i11));
        }
        this.bytesOffset = i10;
        this.bytesLength = i11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    public byte byteAt(int i10) {
        if (i10 >= 0) {
            if (i10 < size()) {
                return this.bytes[this.bytesOffset + i10];
            }
            throw new ArrayIndexOutOfBoundsException(a.h(41, "Index too large: ", i10, ", ", size()));
        }
        throw new ArrayIndexOutOfBoundsException(b.e(28, "Index too small: ", i10));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.bytes, getOffsetIntoBytes() + i10, bArr, i11, i12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString
    public int getOffsetIntoBytes() {
        return this.bytesOffset;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString, java.lang.Iterable
    public Iterator<Byte> iterator() {
        return new BoundedByteIterator();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LiteralByteString, kotlin.reflect.jvm.internal.impl.protobuf.ByteString
    public int size() {
        return this.bytesLength;
    }
}
