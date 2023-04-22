package y6;

import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final int f18491a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18492b;

    /* renamed from: c  reason: collision with root package name */
    public final float f18493c;
    public final float d;

    /* renamed from: e  reason: collision with root package name */
    public final float f18494e;

    /* renamed from: f  reason: collision with root package name */
    public final int f18495f;

    /* renamed from: g  reason: collision with root package name */
    public final int f18496g;

    /* renamed from: h  reason: collision with root package name */
    public final int f18497h;

    /* renamed from: i  reason: collision with root package name */
    public final short[] f18498i;

    /* renamed from: j  reason: collision with root package name */
    public short[] f18499j;

    /* renamed from: k  reason: collision with root package name */
    public int f18500k;

    /* renamed from: l  reason: collision with root package name */
    public short[] f18501l;

    /* renamed from: m  reason: collision with root package name */
    public int f18502m;
    public short[] n;

    /* renamed from: o  reason: collision with root package name */
    public int f18503o;

    /* renamed from: p  reason: collision with root package name */
    public int f18504p;

    /* renamed from: q  reason: collision with root package name */
    public int f18505q;

    /* renamed from: r  reason: collision with root package name */
    public int f18506r;

    /* renamed from: s  reason: collision with root package name */
    public int f18507s;

    /* renamed from: t  reason: collision with root package name */
    public int f18508t;

    /* renamed from: u  reason: collision with root package name */
    public int f18509u;

    /* renamed from: v  reason: collision with root package name */
    public int f18510v;

    public q(int i10, int i11, float f10, float f11, int i12) {
        this.f18491a = i10;
        this.f18492b = i11;
        this.f18493c = f10;
        this.d = f11;
        this.f18494e = i10 / i12;
        this.f18495f = i10 / 400;
        int i13 = i10 / 65;
        this.f18496g = i13;
        int i14 = i13 * 2;
        this.f18497h = i14;
        this.f18498i = new short[i14];
        this.f18499j = new short[i14 * i11];
        this.f18501l = new short[i14 * i11];
        this.n = new short[i14 * i11];
    }

    public static void e(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        short[] c10 = c(this.f18501l, this.f18502m, i11);
        this.f18501l = c10;
        int i12 = this.f18492b;
        System.arraycopy(sArr, i10 * i12, c10, this.f18502m * i12, i12 * i11);
        this.f18502m += i11;
    }

    public final void b(short[] sArr, int i10, int i11) {
        int i12 = this.f18497h / i11;
        int i13 = this.f18492b;
        int i14 = i11 * i13;
        int i15 = i10 * i13;
        for (int i16 = 0; i16 < i12; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                i17 += sArr[(i16 * i14) + i15 + i18];
            }
            this.f18498i[i16] = (short) (i17 / i14);
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f18492b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        int i13 = i10 * this.f18492b;
        int i14 = 1;
        int i15 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i16 = 0;
        int i17 = 0;
        while (i11 <= i12) {
            int i18 = 0;
            for (int i19 = 0; i19 < i11; i19++) {
                i18 += Math.abs(sArr[i13 + i19] - sArr[(i13 + i11) + i19]);
            }
            if (i18 * i16 < i14 * i11) {
                i16 = i11;
                i14 = i18;
            }
            if (i18 * i15 > i17 * i11) {
                i15 = i11;
                i17 = i18;
            }
            i11++;
        }
        this.f18509u = i14 / i16;
        this.f18510v = i17 / i15;
        return i16;
    }

    public final void f() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = this.f18502m;
        float f10 = this.f18493c;
        float f11 = this.d;
        float f12 = f10 / f11;
        float f13 = this.f18494e * f11;
        double d = f12;
        float f14 = 1.0f;
        int i18 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i19 = this.f18500k;
            if (i19 >= this.f18497h) {
                int i20 = 0;
                while (true) {
                    int i21 = this.f18506r;
                    if (i21 > 0) {
                        int min = Math.min(this.f18497h, i21);
                        a(this.f18499j, i20, min);
                        this.f18506r -= min;
                        i20 += min;
                    } else {
                        short[] sArr = this.f18499j;
                        int i22 = this.f18491a;
                        int i23 = i22 > 4000 ? i22 / 4000 : 1;
                        if (this.f18492b == i18 && i23 == i18) {
                            i10 = d(sArr, i20, this.f18495f, this.f18496g);
                        } else {
                            b(sArr, i20, i23);
                            int d10 = d(this.f18498i, 0, this.f18495f / i23, this.f18496g / i23);
                            if (i23 != i18) {
                                int i24 = d10 * i23;
                                int i25 = i23 * 4;
                                int i26 = i24 - i25;
                                int i27 = i24 + i25;
                                int i28 = this.f18495f;
                                if (i26 < i28) {
                                    i26 = i28;
                                }
                                int i29 = this.f18496g;
                                if (i27 > i29) {
                                    i27 = i29;
                                }
                                if (this.f18492b == i18) {
                                    i10 = d(sArr, i20, i26, i27);
                                } else {
                                    b(sArr, i20, i18);
                                    i10 = d(this.f18498i, 0, i26, i27);
                                }
                            } else {
                                i10 = d10;
                            }
                        }
                        int i30 = this.f18509u;
                        int i31 = i30 != 0 && this.f18507s != 0 && this.f18510v <= i30 * 3 && i30 * 2 > this.f18508t * 3 ? this.f18507s : i10;
                        this.f18508t = i30;
                        this.f18507s = i10;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f18499j;
                            if (f12 >= 2.0f) {
                                i12 = (int) (i31 / (f12 - f14));
                            } else {
                                this.f18506r = (int) (((2.0f - f12) * i31) / (f12 - f14));
                                i12 = i31;
                            }
                            short[] c10 = c(this.f18501l, this.f18502m, i12);
                            this.f18501l = c10;
                            int i32 = i12;
                            e(i12, this.f18492b, c10, this.f18502m, sArr2, i20, sArr2, i20 + i31);
                            this.f18502m += i32;
                            i20 = i31 + i32 + i20;
                        } else {
                            int i33 = i31;
                            short[] sArr3 = this.f18499j;
                            if (f12 < 0.5f) {
                                i11 = (int) ((i33 * f12) / (f14 - f12));
                            } else {
                                this.f18506r = (int) ((((2.0f * f12) - f14) * i33) / (f14 - f12));
                                i11 = i33;
                            }
                            int i34 = i33 + i11;
                            short[] c11 = c(this.f18501l, this.f18502m, i34);
                            this.f18501l = c11;
                            int i35 = this.f18492b;
                            System.arraycopy(sArr3, i20 * i35, c11, this.f18502m * i35, i35 * i33);
                            e(i11, this.f18492b, this.f18501l, this.f18502m + i33, sArr3, i20 + i33, sArr3, i20);
                            this.f18502m += i34;
                            i20 += i11;
                        }
                    }
                    if (this.f18497h + i20 > i19) {
                        break;
                    }
                    f14 = 1.0f;
                    i18 = 1;
                }
                int i36 = this.f18500k - i20;
                short[] sArr4 = this.f18499j;
                int i37 = this.f18492b;
                System.arraycopy(sArr4, i20 * i37, sArr4, 0, i37 * i36);
                this.f18500k = i36;
            }
            f14 = 1.0f;
        } else {
            a(this.f18499j, 0, this.f18500k);
            this.f18500k = 0;
        }
        if (f13 == f14 || this.f18502m == i17) {
            return;
        }
        int i38 = this.f18491a;
        int i39 = (int) (i38 / f13);
        while (true) {
            if (i39 <= 16384 && i38 <= 16384) {
                break;
            }
            i39 /= 2;
            i38 /= 2;
        }
        int i40 = this.f18502m - i17;
        short[] c12 = c(this.n, this.f18503o, i40);
        this.n = c12;
        short[] sArr5 = this.f18501l;
        int i41 = this.f18492b;
        System.arraycopy(sArr5, i17 * i41, c12, this.f18503o * i41, i41 * i40);
        this.f18502m = i17;
        this.f18503o += i40;
        int i42 = 0;
        while (true) {
            i13 = this.f18503o;
            i14 = i13 - 1;
            if (i42 >= i14) {
                break;
            }
            while (true) {
                i15 = this.f18504p + 1;
                int i43 = i15 * i39;
                i16 = this.f18505q;
                if (i43 <= i16 * i38) {
                    break;
                }
                this.f18501l = c(this.f18501l, this.f18502m, 1);
                int i44 = 0;
                while (true) {
                    int i45 = this.f18492b;
                    if (i44 < i45) {
                        short[] sArr6 = this.n;
                        int i46 = (i42 * i45) + i44;
                        short s10 = sArr6[i46];
                        short s11 = sArr6[i46 + i45];
                        int i47 = this.f18504p;
                        int i48 = i47 * i39;
                        int i49 = (i47 + 1) * i39;
                        int i50 = i49 - (this.f18505q * i38);
                        int i51 = i49 - i48;
                        this.f18501l[(this.f18502m * i45) + i44] = (short) ((((i51 - i50) * s11) + (s10 * i50)) / i51);
                        i44++;
                    }
                }
                this.f18505q++;
                this.f18502m++;
            }
            this.f18504p = i15;
            if (i15 == i38) {
                this.f18504p = 0;
                k8.a.f(i16 == i39);
                this.f18505q = 0;
            }
            i42++;
        }
        if (i14 == 0) {
            return;
        }
        short[] sArr7 = this.n;
        int i52 = this.f18492b;
        System.arraycopy(sArr7, i14 * i52, sArr7, 0, (i13 - i14) * i52);
        this.f18503o -= i14;
    }
}
