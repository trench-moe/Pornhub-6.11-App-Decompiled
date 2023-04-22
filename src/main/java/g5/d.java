package g5;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.util.Objects;
import kotlin.UByte;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f9799b;

    /* renamed from: c  reason: collision with root package name */
    public c f9800c;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f9798a = new byte[256];
    public int d = 0;

    public final boolean a() {
        return this.f9800c.f9789b != 0;
    }

    public c b() {
        if (this.f9799b != null) {
            if (a()) {
                return this.f9800c;
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < 6; i10++) {
                sb2.append((char) c());
            }
            if (sb2.toString().startsWith("GIF")) {
                this.f9800c.f9792f = f();
                this.f9800c.f9793g = f();
                int c10 = c();
                c cVar = this.f9800c;
                cVar.f9794h = (c10 & 128) != 0;
                cVar.f9795i = (int) Math.pow(2.0d, (c10 & 7) + 1);
                this.f9800c.f9796j = c();
                c cVar2 = this.f9800c;
                c();
                Objects.requireNonNull(cVar2);
                if (this.f9800c.f9794h && !a()) {
                    c cVar3 = this.f9800c;
                    cVar3.f9788a = e(cVar3.f9795i);
                    c cVar4 = this.f9800c;
                    cVar4.f9797k = cVar4.f9788a[cVar4.f9796j];
                }
            } else {
                this.f9800c.f9789b = 1;
            }
            if (!a()) {
                boolean z10 = false;
                while (!z10 && !a() && this.f9800c.f9790c <= Integer.MAX_VALUE) {
                    int c11 = c();
                    if (c11 == 33) {
                        int c12 = c();
                        if (c12 == 1) {
                            g();
                        } else if (c12 == 249) {
                            this.f9800c.d = new b();
                            c();
                            int c13 = c();
                            b bVar = this.f9800c.d;
                            int i11 = (c13 & 28) >> 2;
                            bVar.f9783g = i11;
                            if (i11 == 0) {
                                bVar.f9783g = 1;
                            }
                            bVar.f9782f = (c13 & 1) != 0;
                            int f10 = f();
                            if (f10 < 2) {
                                f10 = 10;
                            }
                            b bVar2 = this.f9800c.d;
                            bVar2.f9785i = f10 * 10;
                            bVar2.f9784h = c();
                            c();
                        } else if (c12 == 254) {
                            g();
                        } else if (c12 != 255) {
                            g();
                        } else {
                            d();
                            StringBuilder sb3 = new StringBuilder();
                            for (int i12 = 0; i12 < 11; i12++) {
                                sb3.append((char) this.f9798a[i12]);
                            }
                            if (sb3.toString().equals("NETSCAPE2.0")) {
                                do {
                                    d();
                                    byte[] bArr = this.f9798a;
                                    if (bArr[0] == 1) {
                                        byte b10 = bArr[1];
                                        byte b11 = bArr[2];
                                        Objects.requireNonNull(this.f9800c);
                                    }
                                    if (this.d > 0) {
                                    }
                                } while (!a());
                            } else {
                                g();
                            }
                        }
                    } else if (c11 == 44) {
                        c cVar5 = this.f9800c;
                        if (cVar5.d == null) {
                            cVar5.d = new b();
                        }
                        cVar5.d.f9778a = f();
                        this.f9800c.d.f9779b = f();
                        this.f9800c.d.f9780c = f();
                        this.f9800c.d.d = f();
                        int c14 = c();
                        boolean z11 = (c14 & 128) != 0;
                        int pow = (int) Math.pow(2.0d, (c14 & 7) + 1);
                        b bVar3 = this.f9800c.d;
                        bVar3.f9781e = (c14 & 64) != 0;
                        if (z11) {
                            bVar3.f9787k = e(pow);
                        } else {
                            bVar3.f9787k = null;
                        }
                        this.f9800c.d.f9786j = this.f9799b.position();
                        c();
                        g();
                        if (!a()) {
                            c cVar6 = this.f9800c;
                            cVar6.f9790c++;
                            cVar6.f9791e.add(cVar6.d);
                        }
                    } else if (c11 != 59) {
                        this.f9800c.f9789b = 1;
                    } else {
                        z10 = true;
                    }
                }
                c cVar7 = this.f9800c;
                if (cVar7.f9790c < 0) {
                    cVar7.f9789b = 1;
                }
            }
            return this.f9800c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int c() {
        try {
            return this.f9799b.get() & UByte.MAX_VALUE;
        } catch (Exception unused) {
            this.f9800c.f9789b = 1;
            return 0;
        }
    }

    public final void d() {
        int c10 = c();
        this.d = c10;
        if (c10 <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                i11 = this.d;
                if (i10 >= i11) {
                    return;
                }
                i11 -= i10;
                this.f9799b.get(this.f9798a, i10, i11);
                i10 += i11;
            } catch (Exception e10) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    StringBuilder o10 = a1.a.o("Error Reading Block n: ", i10, " count: ", i11, " blockSize: ");
                    o10.append(this.d);
                    Log.d("GifHeaderParser", o10.toString(), e10);
                }
                this.f9800c.f9789b = 1;
                return;
            }
        }
    }

    public final int[] e(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f9799b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & UByte.MAX_VALUE) << 16) | (-16777216) | ((bArr[i13] & UByte.MAX_VALUE) << 8) | (bArr[i14] & UByte.MAX_VALUE);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f9800c.f9789b = 1;
        }
        return iArr;
    }

    public final int f() {
        return this.f9799b.getShort();
    }

    public final void g() {
        int c10;
        do {
            c10 = c();
            this.f9799b.position(Math.min(this.f9799b.position() + c10, this.f9799b.limit()));
        } while (c10 > 0);
    }
}
