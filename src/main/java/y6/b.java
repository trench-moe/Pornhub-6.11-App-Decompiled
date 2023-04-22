package y6;

import kotlin.io.ConstantsKt;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f18429a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f18430b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f18431c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f18432e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, ConstantsKt.MINIMUM_BLOCK_SIZE, 576, 640};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f18433f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 >= 0) {
            int[] iArr = f18430b;
            if (i10 >= iArr.length || i11 < 0) {
                return -1;
            }
            int[] iArr2 = f18433f;
            if (i12 >= iArr2.length) {
                return -1;
            }
            int i13 = iArr[i10];
            if (i13 == 44100) {
                return ((i11 % 2) + iArr2[i12]) * 2;
            }
            int i14 = f18432e[i12];
            return i13 == 32000 ? i14 * 6 : i14 * 4;
        }
        return -1;
    }
}
