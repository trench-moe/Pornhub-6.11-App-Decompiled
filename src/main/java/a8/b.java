package a8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import k8.c0;
import k8.s;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f204h = {0, 7, 8, 15};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f205i = {0, 119, -120, -1};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f206j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f207a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f208b;

    /* renamed from: c  reason: collision with root package name */
    public final Canvas f209c;
    public final C0007b d;

    /* renamed from: e  reason: collision with root package name */
    public final a f210e;

    /* renamed from: f  reason: collision with root package name */
    public final h f211f;

    /* renamed from: g  reason: collision with root package name */
    public Bitmap f212g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f213a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f214b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f215c;
        public final int[] d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f213a = i10;
            this.f214b = iArr;
            this.f215c = iArr2;
            this.d = iArr3;
        }
    }

    /* renamed from: a8.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0007b {

        /* renamed from: a  reason: collision with root package name */
        public final int f216a;

        /* renamed from: b  reason: collision with root package name */
        public final int f217b;

        /* renamed from: c  reason: collision with root package name */
        public final int f218c;
        public final int d;

        /* renamed from: e  reason: collision with root package name */
        public final int f219e;

        /* renamed from: f  reason: collision with root package name */
        public final int f220f;

        public C0007b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f216a = i10;
            this.f217b = i11;
            this.f218c = i12;
            this.d = i13;
            this.f219e = i14;
            this.f220f = i15;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f221a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f222b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f223c;
        public final byte[] d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f221a = i10;
            this.f222b = z10;
            this.f223c = bArr;
            this.d = bArr2;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f224a;

        /* renamed from: b  reason: collision with root package name */
        public final int f225b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray<e> f226c;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f224a = i11;
            this.f225b = i12;
            this.f226c = sparseArray;
        }
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f227a;

        /* renamed from: b  reason: collision with root package name */
        public final int f228b;

        public e(int i10, int i11) {
            this.f227a = i10;
            this.f228b = i11;
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f229a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f230b;

        /* renamed from: c  reason: collision with root package name */
        public final int f231c;
        public final int d;

        /* renamed from: e  reason: collision with root package name */
        public final int f232e;

        /* renamed from: f  reason: collision with root package name */
        public final int f233f;

        /* renamed from: g  reason: collision with root package name */
        public final int f234g;

        /* renamed from: h  reason: collision with root package name */
        public final int f235h;

        /* renamed from: i  reason: collision with root package name */
        public final int f236i;

        /* renamed from: j  reason: collision with root package name */
        public final SparseArray<g> f237j;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f229a = i10;
            this.f230b = z10;
            this.f231c = i11;
            this.d = i12;
            this.f232e = i14;
            this.f233f = i15;
            this.f234g = i16;
            this.f235h = i17;
            this.f236i = i18;
            this.f237j = sparseArray;
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f238a;

        /* renamed from: b  reason: collision with root package name */
        public final int f239b;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f238a = i12;
            this.f239b = i13;
        }
    }

    /* loaded from: classes.dex */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final int f240a;

        /* renamed from: b  reason: collision with root package name */
        public final int f241b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray<f> f242c = new SparseArray<>();
        public final SparseArray<a> d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray<c> f243e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        public final SparseArray<a> f244f = new SparseArray<>();

        /* renamed from: g  reason: collision with root package name */
        public final SparseArray<c> f245g = new SparseArray<>();

        /* renamed from: h  reason: collision with root package name */
        public C0007b f246h;

        /* renamed from: i  reason: collision with root package name */
        public d f247i;

        public h(int i10, int i11) {
            this.f240a = i10;
            this.f241b = i11;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f207a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f208b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f209c = new Canvas();
        this.d = new C0007b(719, 575, 0, 719, 0, 575);
        this.f210e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());
        this.f211f = new h(i10, i11);
    }

    public static byte[] a(int i10, int i11, s sVar) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) sVar.g(i11);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(KotlinVersion.MAX_COMPONENT_VALUE, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0);
            } else {
                int i11 = 127;
                int i12 = (i10 & 1) != 0 ? 127 : 0;
                int i13 = (i10 & 2) != 0 ? 127 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = d(KotlinVersion.MAX_COMPONENT_VALUE, i12, i13, i11);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i10 < 8) {
                int i12 = (i10 & 1) != 0 ? 255 : 0;
                int i13 = (i10 & 2) != 0 ? 255 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = d(63, i12, i13, i11);
            } else {
                int i14 = i10 & 136;
                if (i14 == 0) {
                    int i15 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i16 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    if ((i10 & 4) == 0) {
                        r8 = 0;
                    }
                    iArr[i10] = d(KotlinVersion.MAX_COMPONENT_VALUE, i15, i16, r8 + ((i10 & 64) == 0 ? 0 : 170));
                } else if (i14 != 8) {
                    if (i14 == 128) {
                        int i17 = ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0);
                        int i18 = ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0);
                        if ((i10 & 4) == 0) {
                            r7 = 0;
                        }
                        iArr[i10] = d(KotlinVersion.MAX_COMPONENT_VALUE, i17, i18, r7 + 127 + ((i10 & 64) == 0 ? 0 : 85));
                    } else if (i14 == 136) {
                        iArr[i10] = d(KotlinVersion.MAX_COMPONENT_VALUE, ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0), ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0), ((i10 & 4) == 0 ? 0 : 43) + ((i10 & 64) == 0 ? 0 : 85));
                    }
                } else {
                    int i19 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i20 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    r8 = (i10 & 4) == 0 ? 0 : 85;
                    if ((i10 & 64) == 0) {
                        r7 = 0;
                    }
                    iArr[i10] = d(127, i19, i20, r8 + r7);
                }
            }
        }
        return iArr;
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0236 A[LOOP:3: B:87:0x0181->B:118:0x0236, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0152 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0129 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0158 A[LOOP:2: B:41:0x00bd->B:74:0x0158, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0188  */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a8.b.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a f(s sVar, int i10) {
        int g10;
        int g11;
        int g12;
        int g13;
        int i11 = 8;
        int g14 = sVar.g(8);
        sVar.m(8);
        int i12 = i10 - 2;
        int i13 = 4;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] b10 = b();
        int[] c10 = c();
        while (i12 > 0) {
            int g15 = sVar.g(i11);
            int g16 = sVar.g(i11);
            int i14 = i12 - 2;
            int[] iArr2 = (g16 & 128) != 0 ? iArr : (g16 & 64) != 0 ? b10 : c10;
            if ((g16 & 1) != 0) {
                g12 = sVar.g(i11);
                g10 = sVar.g(i11);
                g13 = sVar.g(i11);
                g11 = sVar.g(i11);
                i12 = i14 - 4;
            } else {
                i12 = i14 - 2;
                g10 = sVar.g(i13) << i13;
                g11 = sVar.g(2) << 6;
                g12 = sVar.g(6) << 2;
                g13 = sVar.g(i13) << i13;
            }
            if (g12 == 0) {
                g10 = 0;
                g13 = 0;
                g11 = KotlinVersion.MAX_COMPONENT_VALUE;
            }
            double d10 = g12;
            double d11 = g10 - 128;
            double d12 = g13 - 128;
            iArr2[g15] = d((byte) (255 - (g11 & KotlinVersion.MAX_COMPONENT_VALUE)), c0.h((int) ((1.402d * d11) + d10), 0, KotlinVersion.MAX_COMPONENT_VALUE), c0.h((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, KotlinVersion.MAX_COMPONENT_VALUE), c0.h((int) ((d12 * 1.772d) + d10), 0, KotlinVersion.MAX_COMPONENT_VALUE));
            iArr = iArr;
            g14 = g14;
            i11 = 8;
            i13 = 4;
        }
        return new a(g14, iArr, b10, c10);
    }

    public static c g(s sVar) {
        byte[] bArr;
        int g10 = sVar.g(16);
        sVar.m(4);
        int g11 = sVar.g(2);
        boolean f10 = sVar.f();
        sVar.m(1);
        byte[] bArr2 = c0.f11943f;
        if (g11 == 1) {
            sVar.m(sVar.g(8) * 16);
        } else if (g11 == 0) {
            int g12 = sVar.g(16);
            int g13 = sVar.g(16);
            if (g12 > 0) {
                bArr2 = new byte[g12];
                sVar.i(bArr2, 0, g12);
            }
            if (g13 > 0) {
                bArr = new byte[g13];
                sVar.i(bArr, 0, g13);
                return new c(g10, f10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(g10, f10, bArr2, bArr);
    }
}
