package c9;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class t extends s {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f3891c;

    public t(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f3891c = bArr;
    }

    @Override // c9.s
    public final byte[] c1() {
        return this.f3891c;
    }
}
