package ed;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static char[] f9308a = new char[64];

    /* renamed from: b  reason: collision with root package name */
    public static byte[] f9309b;

    static {
        char c10 = 'A';
        int i10 = 0;
        while (c10 <= 'Z') {
            f9308a[i10] = c10;
            c10 = (char) (c10 + 1);
            i10++;
        }
        char c11 = 'a';
        while (c11 <= 'z') {
            f9308a[i10] = c11;
            c11 = (char) (c11 + 1);
            i10++;
        }
        char c12 = '0';
        while (c12 <= '9') {
            f9308a[i10] = c12;
            c12 = (char) (c12 + 1);
            i10++;
        }
        char[] cArr = f9308a;
        cArr[i10] = '+';
        cArr[i10 + 1] = '/';
        f9309b = new byte[128];
        int i11 = 0;
        while (true) {
            byte[] bArr = f9309b;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = -1;
            i11++;
        }
        for (int i12 = 0; i12 < 64; i12++) {
            f9309b[f9308a[i12]] = (byte) i12;
        }
    }
}
