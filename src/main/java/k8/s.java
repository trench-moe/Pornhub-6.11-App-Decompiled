package k8;

import kotlin.KotlinVersion;
import kotlin.UByte;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f12006a;

    /* renamed from: b  reason: collision with root package name */
    public int f12007b;

    /* renamed from: c  reason: collision with root package name */
    public int f12008c;
    public int d;

    public s() {
        this.f12006a = c0.f11943f;
    }

    public s(byte[] bArr) {
        int length = bArr.length;
        this.f12006a = bArr;
        this.d = length;
    }

    public s(byte[] bArr, int i10) {
        this.f12006a = bArr;
        this.d = i10;
    }

    public final void a() {
        int i10;
        int i11 = this.f12007b;
        a.f(i11 >= 0 && (i11 < (i10 = this.d) || (i11 == i10 && this.f12008c == 0)));
    }

    public int b() {
        return ((this.d - this.f12007b) * 8) - this.f12008c;
    }

    public void c() {
        if (this.f12008c == 0) {
            return;
        }
        this.f12008c = 0;
        this.f12007b++;
        a();
    }

    public int d() {
        a.f(this.f12008c == 0);
        return this.f12007b;
    }

    public int e() {
        return (this.f12007b * 8) + this.f12008c;
    }

    public boolean f() {
        boolean z10 = (this.f12006a[this.f12007b] & (128 >> this.f12008c)) != 0;
        l();
        return z10;
    }

    public int g(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f12008c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f12008c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f12008c = i13;
            byte[] bArr = this.f12006a;
            int i14 = this.f12007b;
            this.f12007b = i14 + 1;
            i12 |= (bArr[i14] & UByte.MAX_VALUE) << i13;
        }
        byte[] bArr2 = this.f12006a;
        int i15 = this.f12007b;
        int i16 = ((-1) >>> (32 - i10)) & (i12 | ((bArr2[i15] & UByte.MAX_VALUE) >> (8 - i11)));
        if (i11 == 8) {
            this.f12008c = 0;
            this.f12007b = i15 + 1;
        }
        a();
        return i16;
    }

    public void h(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f12006a;
            int i13 = this.f12007b;
            int i14 = i13 + 1;
            this.f12007b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f12008c;
            bArr[i10] = (byte) (b10 << i15);
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | bArr[i10]);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 == 0) {
            return;
        }
        bArr[i12] = (byte) (bArr[i12] & (KotlinVersion.MAX_COMPONENT_VALUE >> i16));
        int i17 = this.f12008c;
        if (i17 + i16 > 8) {
            int i18 = bArr[i12];
            byte[] bArr3 = this.f12006a;
            int i19 = this.f12007b;
            this.f12007b = i19 + 1;
            bArr[i12] = (byte) (i18 | ((bArr3[i19] & UByte.MAX_VALUE) << i17));
            this.f12008c = i17 - 8;
        }
        int i20 = this.f12008c + i16;
        this.f12008c = i20;
        byte[] bArr4 = this.f12006a;
        int i21 = this.f12007b;
        bArr[i12] = (byte) (((byte) (((255 & bArr4[i21]) >> (8 - i20)) << (8 - i16))) | bArr[i12]);
        if (i20 == 8) {
            this.f12008c = 0;
            this.f12007b = i21 + 1;
        }
        a();
    }

    public void i(byte[] bArr, int i10, int i11) {
        a.f(this.f12008c == 0);
        System.arraycopy(this.f12006a, this.f12007b, bArr, i10, i11);
        this.f12007b += i11;
        a();
    }

    public void j(byte[] bArr, int i10) {
        this.f12006a = bArr;
        this.f12007b = 0;
        this.f12008c = 0;
        this.d = i10;
    }

    public void k(int i10) {
        int i11 = i10 / 8;
        this.f12007b = i11;
        this.f12008c = i10 - (i11 * 8);
        a();
    }

    public void l() {
        int i10 = this.f12008c + 1;
        this.f12008c = i10;
        if (i10 == 8) {
            this.f12008c = 0;
            this.f12007b++;
        }
        a();
    }

    public void m(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f12007b + i11;
        this.f12007b = i12;
        int i13 = (i10 - (i11 * 8)) + this.f12008c;
        this.f12008c = i13;
        if (i13 > 7) {
            this.f12007b = i12 + 1;
            this.f12008c = i13 - 8;
        }
        a();
    }

    public void n(int i10) {
        a.f(this.f12008c == 0);
        this.f12007b += i10;
        a();
    }
}
