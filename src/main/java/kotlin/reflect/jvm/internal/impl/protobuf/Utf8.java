package kotlin.reflect.jvm.internal.impl.protobuf;

/* loaded from: classes3.dex */
final class Utf8 {
    private static int incompleteStateFor(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    private static int incompleteStateFor(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    private static int incompleteStateFor(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    private static int incompleteStateFor(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    return incompleteStateFor(b10, bArr[i10], bArr[i10 + 1]);
                }
                throw new AssertionError();
            }
            return incompleteStateFor(b10, bArr[i10]);
        }
        return incompleteStateFor(b10);
    }

    public static boolean isValidUtf8(byte[] bArr) {
        return isValidUtf8(bArr, 0, bArr.length);
    }

    public static boolean isValidUtf8(byte[] bArr, int i10, int i11) {
        return partialIsValidUtf8(bArr, i10, i11) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        if (r7[r8] > (-65)) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        if (r7[r8] > (-65)) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007f, code lost:
        if (r7[r8] > (-65)) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int partialIsValidUtf8(int r6, byte[] r7, int r8, int r9) {
        /*
            if (r6 == 0) goto L82
            if (r8 < r9) goto L5
            return r6
        L5:
            byte r0 = (byte) r6
            r1 = -32
            r2 = -1
            r3 = -65
            if (r0 >= r1) goto L1c
            r6 = -62
            if (r0 < r6) goto L1b
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L18
            goto L1b
        L18:
            r8 = r6
            goto L82
        L1b:
            return r2
        L1c:
            r4 = -16
            if (r0 >= r4) goto L49
            int r6 = r6 >> 8
            int r6 = ~r6
            byte r6 = (byte) r6
            if (r6 != 0) goto L34
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r6 < r9) goto L31
            int r6 = incompleteStateFor(r0, r8)
            return r6
        L31:
            r5 = r8
            r8 = r6
            r6 = r5
        L34:
            if (r6 > r3) goto L48
            r4 = -96
            if (r0 != r1) goto L3c
            if (r6 < r4) goto L48
        L3c:
            r1 = -19
            if (r0 != r1) goto L42
            if (r6 >= r4) goto L48
        L42:
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L18
        L48:
            return r2
        L49:
            int r1 = r6 >> 8
            int r1 = ~r1
            byte r1 = (byte) r1
            r4 = 0
            if (r1 != 0) goto L5d
            int r6 = r8 + 1
            r1 = r7[r8]
            if (r6 < r9) goto L5b
            int r6 = incompleteStateFor(r0, r1)
            return r6
        L5b:
            r8 = r6
            goto L60
        L5d:
            int r6 = r6 >> 16
            byte r4 = (byte) r6
        L60:
            if (r4 != 0) goto L6e
            int r6 = r8 + 1
            r4 = r7[r8]
            if (r6 < r9) goto L6d
            int r6 = incompleteStateFor(r0, r1, r4)
            return r6
        L6d:
            r8 = r6
        L6e:
            if (r1 > r3) goto L81
            int r6 = r0 << 28
            int r1 = r1 + 112
            int r1 = r1 + r6
            int r6 = r1 >> 30
            if (r6 != 0) goto L81
            if (r4 > r3) goto L81
            int r6 = r8 + 1
            r8 = r7[r8]
            if (r8 <= r3) goto L18
        L81:
            return r2
        L82:
            int r6 = partialIsValidUtf8(r7, r8, r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.Utf8.partialIsValidUtf8(int, byte[], int, int):int");
    }

    public static int partialIsValidUtf8(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return 0;
        }
        return partialIsValidUtf8NonAscii(bArr, i10, i11);
    }

    private static int partialIsValidUtf8NonAscii(byte[] bArr, int i10, int i11) {
        while (i10 < i11) {
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 < 0) {
                if (b10 < -32) {
                    if (i12 >= i11) {
                        return b10;
                    }
                    if (b10 >= -62) {
                        i10 = i12 + 1;
                        if (bArr[i12] > -65) {
                        }
                    }
                    return -1;
                } else if (b10 < -16) {
                    if (i12 >= i11 - 1) {
                        return incompleteStateFor(bArr, i12, i11);
                    }
                    int i13 = i12 + 1;
                    byte b11 = bArr[i12];
                    if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                        i10 = i13 + 1;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                } else if (i12 >= i11 - 2) {
                    return incompleteStateFor(bArr, i12, i11);
                } else {
                    int i14 = i12 + 1;
                    byte b12 = bArr[i12];
                    if (b12 <= -65) {
                        if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                            int i15 = i14 + 1;
                            if (bArr[i14] <= -65) {
                                i12 = i15 + 1;
                                if (bArr[i15] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
            }
            i10 = i12;
        }
        return 0;
    }
}
