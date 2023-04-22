package k8;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f11982a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    public static final float[] f11983b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c  reason: collision with root package name */
    public static final Object f11984c = new Object();
    public static int[] d = new int[10];

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f11985a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11986b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f11987c;

        public a(int i10, int i11, boolean z10) {
            this.f11985a = i10;
            this.f11986b = i11;
            this.f11987c = z10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f11988a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11989b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11990c;
        public final int d;

        /* renamed from: e  reason: collision with root package name */
        public final int f11991e;

        /* renamed from: f  reason: collision with root package name */
        public final int f11992f;

        /* renamed from: g  reason: collision with root package name */
        public final float f11993g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f11994h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f11995i;

        /* renamed from: j  reason: collision with root package name */
        public final int f11996j;

        /* renamed from: k  reason: collision with root package name */
        public final int f11997k;

        /* renamed from: l  reason: collision with root package name */
        public final int f11998l;

        /* renamed from: m  reason: collision with root package name */
        public final boolean f11999m;

        public b(int i10, int i11, int i12, int i13, int i14, int i15, float f10, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f11988a = i10;
            this.f11989b = i11;
            this.f11990c = i12;
            this.d = i13;
            this.f11991e = i14;
            this.f11992f = i15;
            this.f11993g = f10;
            this.f11994h = z10;
            this.f11995i = z11;
            this.f11996j = i16;
            this.f11997k = i17;
            this.f11998l = i18;
            this.f11999m = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a7, code lost:
        if (r9[r3] == 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c0, code lost:
        if (r9[r3] == 1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ed, code lost:
        if (r9[r3] == 0) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int b(byte[] r9, int r10, int r11, boolean[] r12) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.q.b(byte[], int, int, boolean[]):int");
    }

    public static a c(byte[] bArr, int i10, int i11) {
        u uVar = new u(bArr, i10, i11);
        uVar.k(8);
        int f10 = uVar.f();
        int f11 = uVar.f();
        uVar.j();
        return new a(f10, f11, uVar.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static k8.q.b d(byte[] r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.q.d(byte[], int, int):k8.q$b");
    }

    public static int e(byte[] bArr, int i10) {
        int i11;
        synchronized (f11984c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                while (true) {
                    if (i12 >= i10 - 2) {
                        i12 = i10;
                        break;
                    } else if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                        break;
                    } else {
                        i12++;
                    }
                }
                if (i12 < i10) {
                    int[] iArr = d;
                    if (iArr.length <= i13) {
                        d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    d[i13] = i12;
                    i12 += 3;
                    i13++;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
