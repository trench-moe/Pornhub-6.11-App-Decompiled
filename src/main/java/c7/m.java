package c7;

/* loaded from: classes.dex */
public final class m {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f3805a;
    }

    public static boolean a(k8.t tVar, p pVar, boolean z10, a aVar) {
        try {
            long y = tVar.y();
            if (!z10) {
                y *= pVar.f3809b;
            }
            aVar.f3805a = y;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0095, code lost:
        if (r7 == r18.f3812f) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a2, code lost:
        if ((r17.s() * 1000) == r3) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b3, code lost:
        if (r4 == r3) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean b(k8.t r17, c7.p r18, int r19, c7.m.a r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c7.m.b(k8.t, c7.p, int, c7.m$a):boolean");
    }

    public static int c(k8.t tVar, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return tVar.s() + 1;
            case 7:
                return tVar.x() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
