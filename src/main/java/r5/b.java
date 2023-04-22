package r5;

import j5.i;
import java.util.Objects;

/* loaded from: classes2.dex */
public class b implements i<byte[]> {

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f14678c;

    public b(byte[] bArr) {
        Objects.requireNonNull(bArr, "Argument must not be null");
        this.f14678c = bArr;
    }

    @Override // j5.i
    public void b() {
    }

    @Override // j5.i
    public int c() {
        return this.f14678c.length;
    }

    @Override // j5.i
    public Class<byte[]> d() {
        return byte[].class;
    }

    @Override // j5.i
    public byte[] get() {
        return this.f14678c;
    }
}
