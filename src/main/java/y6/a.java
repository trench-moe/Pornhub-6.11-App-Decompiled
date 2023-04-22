package y6;

import com.google.android.exoplayer2.ParserException;
import k8.s;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f18424a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f18425b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f18426a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18427b;

        /* renamed from: c  reason: collision with root package name */
        public final String f18428c;

        public b(int i10, int i11, String str, C0308a c0308a) {
            this.f18426a = i10;
            this.f18427b = i11;
            this.f18428c = str;
        }
    }

    public static int a(int i10) {
        if (i10 != 2) {
            if (i10 != 5) {
                if (i10 != 29) {
                    if (i10 != 42) {
                        if (i10 != 22) {
                            return i10 != 23 ? 0 : 15;
                        }
                        return 1073741824;
                    }
                    return 16;
                }
                return 12;
            }
            return 11;
        }
        return 10;
    }

    public static int b(s sVar) {
        int g10 = sVar.g(4);
        if (g10 == 15) {
            return sVar.g(24);
        }
        if (g10 < 13) {
            return f18424a[g10];
        }
        throw ParserException.a(null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static y6.a.b c(k8.s r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.a.c(k8.s, boolean):y6.a$b");
    }

    public static b d(byte[] bArr) {
        return c(new s(bArr), false);
    }
}
