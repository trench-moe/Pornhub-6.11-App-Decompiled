package l7;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final int f12596a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12597b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f12598c;
    public byte[] d;

    /* renamed from: e  reason: collision with root package name */
    public int f12599e;

    public r(int i10, int i11) {
        this.f12596a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f12597b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i13 = this.f12599e;
            if (length < i13 + i12) {
                this.d = Arrays.copyOf(bArr2, (i13 + i12) * 2);
            }
            System.arraycopy(bArr, i10, this.d, this.f12599e, i12);
            this.f12599e += i12;
        }
    }

    public boolean b(int i10) {
        if (this.f12597b) {
            this.f12599e -= i10;
            this.f12597b = false;
            this.f12598c = true;
            return true;
        }
        return false;
    }

    public void c() {
        this.f12597b = false;
        this.f12598c = false;
    }

    public void d(int i10) {
        boolean z10 = true;
        k8.a.f(!this.f12597b);
        if (i10 != this.f12596a) {
            z10 = false;
        }
        this.f12597b = z10;
        if (z10) {
            this.f12599e = 3;
            this.f12598c = false;
        }
    }
}
