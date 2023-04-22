package j0;

import java.util.Comparator;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Comparator<byte[]> f11099a = new a();

    /* loaded from: classes2.dex */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        public int compare(byte[] bArr, byte[] bArr2) {
            int i10;
            int i11;
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length == bArr4.length) {
                for (int i12 = 0; i12 < bArr3.length; i12++) {
                    if (bArr3[i12] != bArr4[i12]) {
                        i10 = bArr3[i12];
                        i11 = bArr4[i12];
                    }
                }
                return 0;
            }
            i10 = bArr3.length;
            i11 = bArr4.length;
            return i10 - i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0095 A[LOOP:1: B:15:0x004e->B:30:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0099 A[EDGE_INSN: B:79:0x0099->B:32:0x0099 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static j0.k a(android.content.Context r20, j0.e r21, android.os.CancellationSignal r22) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.d.a(android.content.Context, j0.e, android.os.CancellationSignal):j0.k");
    }
}
