package org.bson.types;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.UByte;
import t9.k0;

/* loaded from: classes3.dex */
public final class ObjectId implements Comparable<ObjectId>, Serializable {

    /* renamed from: c  reason: collision with root package name */
    public static final int f13732c;

    /* renamed from: f  reason: collision with root package name */
    public static final short f13733f;

    /* renamed from: j  reason: collision with root package name */
    public static final AtomicInteger f13734j = new AtomicInteger(new SecureRandom().nextInt());

    /* renamed from: m  reason: collision with root package name */
    public static final char[] f13735m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final long serialVersionUID = 3670079982654483072L;
    private final int counter;
    private final int randomValue1;
    private final short randomValue2;
    private final int timestamp;

    static {
        try {
            SecureRandom secureRandom = new SecureRandom();
            f13732c = secureRandom.nextInt(16777216);
            f13733f = (short) secureRandom.nextInt(32768);
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public ObjectId() {
        this(new Date());
    }

    public ObjectId(int i10, int i11) {
        this(i10, i11, true);
    }

    public ObjectId(int i10, int i11, int i12) {
        this(new byte[]{(byte) (i10 >> 24), (byte) (i10 >> 16), (byte) (i10 >> 8), (byte) i10, (byte) (i11 >> 24), (byte) (i11 >> 16), (byte) (i11 >> 8), (byte) i11, (byte) (i12 >> 24), (byte) (i12 >> 16), (byte) (i12 >> 8), (byte) i12});
    }

    @Deprecated
    public ObjectId(int i10, int i11, short s10, int i12) {
        this(i10, i11, s10, i12, true);
    }

    private ObjectId(int i10, int i11, short s10, int i12, boolean z10) {
        if ((i11 & (-16777216)) != 0) {
            throw new IllegalArgumentException("The machine identifier must be between 0 and 16777215 (it must fit in three bytes).");
        }
        if (z10 && (i12 & (-16777216)) != 0) {
            throw new IllegalArgumentException("The counter must be between 0 and 16777215 (it must fit in three bytes).");
        }
        this.timestamp = i10;
        this.counter = 16777215 & i12;
        this.randomValue1 = i11;
        this.randomValue2 = s10;
    }

    private ObjectId(int i10, int i11, boolean z10) {
        this(i10, f13732c, f13733f, i11, z10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ObjectId(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L61
            int r0 = r6.length()
            r1 = 24
            r2 = 0
            if (r0 == r1) goto Lc
            goto L30
        Lc:
            r1 = 0
        Ld:
            if (r1 >= r0) goto L32
            char r3 = r6.charAt(r1)
            r4 = 48
            if (r3 < r4) goto L1c
            r4 = 57
            if (r3 > r4) goto L1c
            goto L2d
        L1c:
            r4 = 97
            if (r3 < r4) goto L25
            r4 = 102(0x66, float:1.43E-43)
            if (r3 > r4) goto L25
            goto L2d
        L25:
            r4 = 65
            if (r3 < r4) goto L30
            r4 = 70
            if (r3 > r4) goto L30
        L2d:
            int r1 = r1 + 1
            goto Ld
        L30:
            r0 = 0
            goto L33
        L32:
            r0 = 1
        L33:
            if (r0 == 0) goto L53
            r0 = 12
            byte[] r1 = new byte[r0]
        L39:
            if (r2 >= r0) goto L4f
            int r3 = r2 * 2
            int r4 = r3 + 2
            java.lang.String r3 = r6.substring(r3, r4)
            r4 = 16
            int r3 = java.lang.Integer.parseInt(r3, r4)
            byte r3 = (byte) r3
            r1[r2] = r3
            int r2 = r2 + 1
            goto L39
        L4f:
            r5.<init>(r1)
            return
        L53:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "invalid hexadecimal representation of an ObjectId: ["
            java.lang.String r2 = "]"
            java.lang.String r6 = android.support.v4.media.b.j(r1, r6, r2)
            r0.<init>(r6)
            throw r0
        L61:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bson.types.ObjectId.<init>(java.lang.String):void");
    }

    public ObjectId(ByteBuffer byteBuffer) {
        k0.h("buffer", byteBuffer);
        k0.f("buffer.remaining() >=12", byteBuffer.remaining() >= 12);
        this.timestamp = b(byteBuffer.get(), byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
        this.randomValue1 = b((byte) 0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
        this.randomValue2 = (short) (((byteBuffer.get() & UByte.MAX_VALUE) << 8) | (byteBuffer.get() & UByte.MAX_VALUE));
        this.counter = b((byte) 0, byteBuffer.get(), byteBuffer.get(), byteBuffer.get());
    }

    public ObjectId(Date date) {
        this((int) (date.getTime() / 1000), f13734j.getAndIncrement() & 16777215, false);
    }

    public ObjectId(Date date, int i10) {
        this((int) (date.getTime() / 1000), i10, true);
    }

    @Deprecated
    public ObjectId(Date date, int i10, short s10, int i11) {
        this((int) (date.getTime() / 1000), i10, s10, i11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ObjectId(byte[] bArr) {
        this(ByteBuffer.wrap(bArr));
        k0.h("bytes", bArr);
        if (!(bArr.length == 12)) {
            throw new IllegalArgumentException("state should be: bytes has length of 12");
        }
    }

    public static int b(byte b10, byte b11, byte b12, byte b13) {
        return (b10 << 24) | ((b11 & UByte.MAX_VALUE) << 16) | ((b12 & UByte.MAX_VALUE) << 8) | (b13 & UByte.MAX_VALUE);
    }

    public byte[] c() {
        ByteBuffer allocate = ByteBuffer.allocate(12);
        k0.h("buffer", allocate);
        k0.f("buffer.remaining() >=12", allocate.remaining() >= 12);
        allocate.put((byte) (this.timestamp >> 24));
        allocate.put((byte) (this.timestamp >> 16));
        allocate.put((byte) (this.timestamp >> 8));
        allocate.put((byte) this.timestamp);
        allocate.put((byte) (this.randomValue1 >> 16));
        allocate.put((byte) (this.randomValue1 >> 8));
        allocate.put((byte) this.randomValue1);
        allocate.put((byte) (this.randomValue2 >> 8));
        allocate.put((byte) this.randomValue2);
        allocate.put((byte) (this.counter >> 16));
        allocate.put((byte) (this.counter >> 8));
        allocate.put((byte) this.counter);
        return allocate.array();
    }

    @Override // java.lang.Comparable
    public int compareTo(ObjectId objectId) {
        ObjectId objectId2 = objectId;
        Objects.requireNonNull(objectId2);
        byte[] c10 = c();
        byte[] c11 = objectId2.c();
        for (int i10 = 0; i10 < 12; i10++) {
            if (c10[i10] != c11[i10]) {
                return (c10[i10] & UByte.MAX_VALUE) < (c11[i10] & UByte.MAX_VALUE) ? -1 : 1;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ObjectId.class != obj.getClass()) {
            return false;
        }
        ObjectId objectId = (ObjectId) obj;
        return this.counter == objectId.counter && this.timestamp == objectId.timestamp && this.randomValue1 == objectId.randomValue1 && this.randomValue2 == objectId.randomValue2;
    }

    public int hashCode() {
        return (((((this.timestamp * 31) + this.counter) * 31) + this.randomValue1) * 31) + this.randomValue2;
    }

    public String toString() {
        byte[] c10;
        char[] cArr = new char[24];
        int i10 = 0;
        for (byte b10 : c()) {
            int i11 = i10 + 1;
            char[] cArr2 = f13735m;
            cArr[i10] = cArr2[(b10 >> 4) & 15];
            i10 = i11 + 1;
            cArr[i11] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }
}
