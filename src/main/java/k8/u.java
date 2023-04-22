package k8;

import kotlin.UByte;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f12012a;

    /* renamed from: b  reason: collision with root package name */
    public int f12013b;

    /* renamed from: c  reason: collision with root package name */
    public int f12014c;
    public int d = 0;

    public u(byte[] bArr, int i10, int i11) {
        this.f12012a = bArr;
        this.f12014c = i10;
        this.f12013b = i11;
        a();
    }

    public final void a() {
        int i10;
        int i11 = this.f12014c;
        a.f(i11 >= 0 && (i11 < (i10 = this.f12013b) || (i11 == i10 && this.d == 0)));
    }

    public boolean b(int i10) {
        int i11 = this.f12014c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f12013b) {
                break;
            } else if (i(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i15 = this.f12013b;
        if (i13 >= i15) {
            return i13 == i15 && i14 == 0;
        }
        return true;
    }

    public boolean c() {
        int i10 = this.f12014c;
        int i11 = this.d;
        boolean z10 = false;
        int i12 = 0;
        while (this.f12014c < this.f12013b && !d()) {
            i12++;
        }
        boolean z11 = this.f12014c == this.f12013b;
        this.f12014c = i10;
        this.d = i11;
        if (!z11 && b((i12 * 2) + 1)) {
            z10 = true;
        }
        return z10;
    }

    public boolean d() {
        boolean z10 = (this.f12012a[this.f12014c] & (128 >> this.d)) != 0;
        j();
        return z10;
    }

    public int e(int i10) {
        int i11;
        this.d += i10;
        int i12 = 0;
        while (true) {
            i11 = this.d;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.d = i13;
            byte[] bArr = this.f12012a;
            int i14 = this.f12014c;
            i12 |= (bArr[i14] & UByte.MAX_VALUE) << i13;
            if (!i(i14 + 1)) {
                r3 = 1;
            }
            this.f12014c = i14 + r3;
        }
        byte[] bArr2 = this.f12012a;
        int i15 = this.f12014c;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & UByte.MAX_VALUE) >> (8 - i11)));
        if (i11 == 8) {
            this.d = 0;
            this.f12014c = i15 + (i(i15 + 1) ? 2 : 1);
        }
        a();
        return i16;
    }

    public final int f() {
        int i10 = 0;
        while (!d()) {
            i10++;
        }
        return ((1 << i10) - 1) + (i10 > 0 ? e(i10) : 0);
    }

    public int g() {
        int f10 = f();
        return ((f10 + 1) / 2) * (f10 % 2 == 0 ? -1 : 1);
    }

    public void h(byte[] bArr, int i10, int i11) {
        this.f12012a = bArr;
        this.f12014c = i10;
        this.f12013b = i11;
        this.d = 0;
        a();
    }

    public final boolean i(int i10) {
        if (2 <= i10 && i10 < this.f12013b) {
            byte[] bArr = this.f12012a;
            if (bArr[i10] == 3 && bArr[i10 - 2] == 0 && bArr[i10 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public void j() {
        int i10 = 1;
        int i11 = this.d + 1;
        this.d = i11;
        if (i11 == 8) {
            this.d = 0;
            int i12 = this.f12014c;
            if (i(i12 + 1)) {
                i10 = 2;
            }
            this.f12014c = i12 + i10;
        }
        a();
    }

    public void k(int i10) {
        int i11 = this.f12014c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f12014c = i13;
        int i14 = (i10 - (i12 * 8)) + this.d;
        this.d = i14;
        if (i14 > 7) {
            this.f12014c = i13 + 1;
            this.d = i14 - 8;
        }
        while (true) {
            while (true) {
                i11++;
                if (i11 > this.f12014c) {
                    a();
                    return;
                } else if (i(i11)) {
                    this.f12014c++;
                    i11 += 2;
                }
            }
        }
    }
}
