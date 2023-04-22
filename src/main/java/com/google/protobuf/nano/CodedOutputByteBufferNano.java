package com.google.protobuf.nano;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class CodedOutputByteBufferNano {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f8104a;

    /* loaded from: classes.dex */
    public static class OutOfSpaceException extends IOException {
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException(int i10, int i11) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space (pos " + i10 + " limit " + i11 + ").");
        }
    }

    public CodedOutputByteBufferNano(byte[] bArr, int i10, int i11) {
        this.f8104a = ByteBuffer.wrap(bArr, i10, i11);
    }

    public static int a(int i10, float f10) {
        return c(i10) + 4;
    }

    public static int b(int i10) {
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

    public static int c(int i10) {
        return b((i10 << 3) | 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int d(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.nano.CodedOutputByteBufferNano.d(java.lang.CharSequence, byte[], int, int):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static void e(java.lang.CharSequence r9, java.nio.ByteBuffer r10) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.nano.CodedOutputByteBufferNano.e(java.lang.CharSequence, java.nio.ByteBuffer):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static int f(java.lang.CharSequence r11) {
        /*
            r8 = r11
            int r0 = r8.length()
            r10 = 0
            r1 = r10
            r10 = 0
            r2 = r10
        L9:
            if (r2 >= r0) goto L19
            char r10 = r8.charAt(r2)
            r3 = r10
            r4 = 128(0x80, float:1.8E-43)
            if (r3 >= r4) goto L19
            r10 = 3
            int r2 = r2 + 1
            r10 = 2
            goto L9
        L19:
            r3 = r0
        L1a:
            if (r2 >= r0) goto L7a
            r10 = 3
            char r4 = r8.charAt(r2)
            r10 = 2048(0x800, float:2.87E-42)
            r5 = r10
            if (r4 >= r5) goto L30
            int r4 = 127 - r4
            int r4 = r4 >>> 31
            r10 = 6
            int r3 = r3 + r4
            int r2 = r2 + 1
            r10 = 2
            goto L1a
        L30:
            r10 = 2
            int r10 = r8.length()
            r4 = r10
        L36:
            if (r2 >= r4) goto L78
            char r10 = r8.charAt(r2)
            r6 = r10
            if (r6 >= r5) goto L47
            r10 = 5
            int r6 = 127 - r6
            int r6 = r6 >>> 31
            r10 = 5
            int r1 = r1 + r6
            goto L74
        L47:
            int r1 = r1 + 2
            r7 = 55296(0xd800, float:7.7486E-41)
            r10 = 1
            if (r7 > r6) goto L74
            r10 = 4
            r7 = 57343(0xdfff, float:8.0355E-41)
            r10 = 4
            if (r6 > r7) goto L74
            r10 = 5
            int r10 = java.lang.Character.codePointAt(r8, r2)
            r6 = r10
            r10 = 65536(0x10000, float:9.1835E-41)
            r7 = r10
            if (r6 < r7) goto L64
            int r2 = r2 + 1
            goto L74
        L64:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unpaired surrogate at index "
            r0 = r10
            java.lang.String r10 = a1.a.j(r0, r2)
            r0 = r10
            r8.<init>(r0)
            r10 = 4
            throw r8
            r10 = 2
        L74:
            int r2 = r2 + 1
            r10 = 2
            goto L36
        L78:
            r10 = 5
            int r3 = r3 + r1
        L7a:
            if (r3 < r0) goto L7e
            r10 = 1
            return r3
        L7e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "UTF-8 length does not fit in int: "
            r10 = 1
            java.lang.StringBuilder r0 = a1.a.m(r0)
            long r1 = (long) r3
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            r10 = 6
            long r1 = r1 + r3
            r10 = 2
            r0.append(r1)
            java.lang.String r10 = r0.toString()
            r0 = r10
            r8.<init>(r0)
            throw r8
            r10 = 2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.nano.CodedOutputByteBufferNano.f(java.lang.CharSequence):int");
    }

    public void g(int i10, float f10) {
        k((i10 << 3) | 5);
        h(f10);
    }

    public void h(float f10) {
        int floatToIntBits = Float.floatToIntBits(f10);
        j(floatToIntBits & KotlinVersion.MAX_COMPONENT_VALUE);
        j((floatToIntBits >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        j((floatToIntBits >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        j((floatToIntBits >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public void i(int i10, int i11) {
        k((i10 << 3) | 0);
        if (i11 >= 0) {
            k(i11);
            return;
        }
        long j10 = i11;
        while (((-128) & j10) != 0) {
            j((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        j((int) j10);
    }

    public void j(int i10) {
        byte b10 = (byte) i10;
        if (!this.f8104a.hasRemaining()) {
            throw new OutOfSpaceException(this.f8104a.position(), this.f8104a.limit());
        }
        this.f8104a.put(b10);
    }

    public void k(int i10) {
        while ((i10 & (-128)) != 0) {
            j((i10 & 127) | 128);
            i10 >>>= 7;
        }
        j(i10);
    }

    public void l(int i10, String str) {
        k((i10 << 3) | 2);
        try {
            int b10 = b(str.length());
            if (b10 != b(str.length() * 3)) {
                k(f(str));
                e(str, this.f8104a);
                return;
            }
            int position = this.f8104a.position();
            this.f8104a.position(position + b10);
            e(str, this.f8104a);
            int position2 = this.f8104a.position();
            this.f8104a.position(position);
            k((position2 - position) - b10);
            this.f8104a.position(position2);
        } catch (BufferOverflowException unused) {
            throw new OutOfSpaceException(this.f8104a.position(), this.f8104a.limit());
        }
    }
}
