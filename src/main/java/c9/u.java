package c9;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class u extends s {
    public static final WeakReference<byte[]> d = new WeakReference<>(null);

    /* renamed from: c  reason: collision with root package name */
    public WeakReference<byte[]> f3892c;

    public u(byte[] bArr) {
        super(bArr);
        this.f3892c = d;
    }

    @Override // c9.s
    public final byte[] c1() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f3892c.get();
            if (bArr == null) {
                bArr = d1();
                this.f3892c = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] d1();
}
