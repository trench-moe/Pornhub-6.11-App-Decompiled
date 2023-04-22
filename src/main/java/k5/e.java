package k5;

/* loaded from: classes2.dex */
public final class e implements a<byte[]> {
    @Override // k5.a
    public int a() {
        return 1;
    }

    @Override // k5.a
    public int b(byte[] bArr) {
        return bArr.length;
    }

    @Override // k5.a
    public byte[] newArray(int i10) {
        return new byte[i10];
    }

    @Override // k5.a
    public String o() {
        return "ByteArrayPool";
    }
}
