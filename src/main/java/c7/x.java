package c7;

import kotlin.KotlinVersion;
import kotlin.UByte;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f3839a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3840b;

    /* renamed from: c  reason: collision with root package name */
    public int f3841c;
    public int d;

    public x(byte[] bArr) {
        this.f3839a = bArr;
        this.f3840b = bArr.length;
    }

    public boolean a() {
        boolean z10 = (((this.f3839a[this.f3841c] & UByte.MAX_VALUE) >> this.d) & 1) == 1;
        c(1);
        return z10;
    }

    public int b(int i10) {
        int i11 = this.f3841c;
        int min = Math.min(i10, 8 - this.d);
        int i12 = i11 + 1;
        int i13 = ((this.f3839a[i11] & UByte.MAX_VALUE) >> this.d) & (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - min));
        while (min < i10) {
            i13 |= (this.f3839a[i12] & UByte.MAX_VALUE) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        c(i10);
        return i14;
    }

    public void c(int i10) {
        int i11;
        int i12 = i10 / 8;
        int i13 = this.f3841c + i12;
        this.f3841c = i13;
        int i14 = (i10 - (i12 * 8)) + this.d;
        this.d = i14;
        boolean z10 = true;
        if (i14 > 7) {
            this.f3841c = i13 + 1;
            this.d = i14 - 8;
        }
        int i15 = this.f3841c;
        if (i15 < 0 || (i15 >= (i11 = this.f3840b) && (i15 != i11 || this.d != 0))) {
            z10 = false;
        }
        k8.a.f(z10);
    }
}
