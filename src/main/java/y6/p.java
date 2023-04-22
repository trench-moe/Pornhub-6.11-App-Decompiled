package y6;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f18479a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f18480b = {44100, 48000, 32000};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f18481c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f18482e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f18483f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f18484g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f18485a;

        /* renamed from: b  reason: collision with root package name */
        public String f18486b;

        /* renamed from: c  reason: collision with root package name */
        public int f18487c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f18488e;

        /* renamed from: f  reason: collision with root package name */
        public int f18489f;

        /* renamed from: g  reason: collision with root package name */
        public int f18490g;

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (p.c(i10) && (i11 = (i10 >>> 19) & 3) != 1 && (i12 = (i10 >>> 17) & 3) != 0 && (i13 = (i10 >>> 12) & 15) != 0 && i13 != 15 && (i14 = (i10 >>> 10) & 3) != 3) {
                this.f18485a = i11;
                this.f18486b = p.f18479a[3 - i12];
                int i15 = p.f18480b[i14];
                this.d = i15;
                int i16 = 2;
                if (i11 == 2) {
                    this.d = i15 / 2;
                } else if (i11 == 0) {
                    this.d = i15 / 4;
                }
                int i17 = (i10 >>> 9) & 1;
                this.f18490g = p.b(i11, i12);
                if (i12 == 3) {
                    int i18 = i11 == 3 ? p.f18481c[i13 - 1] : p.d[i13 - 1];
                    this.f18489f = i18;
                    this.f18487c = (((i18 * 12) / this.d) + i17) * 4;
                } else {
                    if (i11 == 3) {
                        int i19 = i12 == 2 ? p.f18482e[i13 - 1] : p.f18483f[i13 - 1];
                        this.f18489f = i19;
                        this.f18487c = ((i19 * 144) / this.d) + i17;
                    } else {
                        int i20 = p.f18484g[i13 - 1];
                        this.f18489f = i20;
                        this.f18487c = (((i12 == 1 ? 72 : 144) * i20) / this.d) + i17;
                    }
                }
                if (((i10 >> 6) & 3) == 3) {
                    i16 = 1;
                }
                this.f18488e = i16;
                return true;
            }
            return false;
        }
    }

    public static int a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (c(i10) && (i11 = (i10 >>> 19) & 3) != 1 && (i12 = (i10 >>> 17) & 3) != 0 && (i13 = (i10 >>> 12) & 15) != 0 && i13 != 15 && (i14 = (i10 >>> 10) & 3) != 3) {
            int i15 = f18480b[i14];
            if (i11 == 2) {
                i15 /= 2;
            } else if (i11 == 0) {
                i15 /= 4;
            }
            int i16 = (i10 >>> 9) & 1;
            if (i12 == 3) {
                return ((((i11 == 3 ? f18481c[i13 - 1] : d[i13 - 1]) * 12) / i15) + i16) * 4;
            }
            int i17 = i11 == 3 ? i12 == 2 ? f18482e[i13 - 1] : f18483f[i13 - 1] : f18484g[i13 - 1];
            if (i11 == 3) {
                return a0.a.c(i17, 144, i15, i16);
            }
            return a0.a.c(i12 == 1 ? 72 : 144, i17, i15, i16);
        }
        return -1;
    }

    public static int b(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        } else if (i11 != 2) {
            if (i11 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        } else {
            return 1152;
        }
    }

    public static boolean c(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    public static int d(int i10) {
        int i11;
        int i12;
        if (c(i10) && (i11 = (i10 >>> 19) & 3) != 1 && (i12 = (i10 >>> 17) & 3) != 0) {
            int i13 = (i10 >>> 12) & 15;
            int i14 = (i10 >>> 10) & 3;
            if (i13 != 0 && i13 != 15) {
                if (i14 != 3) {
                    return b(i11, i12);
                }
            }
            return -1;
        }
        return -1;
    }
}
