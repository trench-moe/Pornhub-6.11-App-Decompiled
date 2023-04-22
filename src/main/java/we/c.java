package we;

import com.appsflyer.oaid.BuildConfig;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public final class c {
    public static final String[] d;

    /* renamed from: e  reason: collision with root package name */
    public static final c f17492e = new c();
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public static final ByteString f17489a = ByteString.f13728m.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f17490b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f17491c = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            Intrinsics.checkNotNullExpressionValue(binaryString, "Integer.toBinaryString(it)");
            strArr[i10] = StringsKt.replace$default(qe.c.i("%8s", binaryString), ' ', '0', false, 4, (Object) null);
        }
        d = strArr;
        String[] strArr2 = f17491c;
        strArr2[0] = BuildConfig.FLAVOR;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i11 = 0; i11 < 1; i11++) {
            int i12 = iArr[i11];
            String[] strArr3 = f17491c;
            strArr3[i12 | 8] = Intrinsics.stringPlus(strArr3[i12], "|PADDED");
        }
        String[] strArr4 = f17491c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr2[i13];
            for (int i15 = 0; i15 < 1; i15++) {
                int i16 = iArr[i15];
                String[] strArr5 = f17491c;
                int i17 = i16 | i14;
                strArr5[i17] = strArr5[i16] + "|" + strArr5[i14];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strArr5[i16]);
                sb2.append("|");
                strArr5[i17 | 8] = android.support.v4.media.b.m(sb2, strArr5[i14], "|PADDED");
            }
        }
        int length = f17491c.length;
        for (int i18 = 0; i18 < length; i18++) {
            String[] strArr6 = f17491c;
            if (strArr6[i18] == null) {
                strArr6[i18] = d[i18];
            }
        }
    }

    public final String a(int i10) {
        String[] strArr = f17490b;
        return i10 < strArr.length ? strArr[i10] : qe.c.i("0x%02x", Integer.valueOf(i10));
    }

    public final String b(boolean z10, int i10, int i11, int i12, int i13) {
        String str;
        String str2;
        String a10 = a(i12);
        if (i13 == 0) {
            str = BuildConfig.FLAVOR;
        } else {
            if (i12 != 2 && i12 != 3) {
                if (i12 == 4 || i12 == 6) {
                    str = i13 == 1 ? "ACK" : d[i13];
                } else if (i12 != 7 && i12 != 8) {
                    String[] strArr = f17491c;
                    if (i13 < strArr.length) {
                        str2 = strArr[i13];
                        Intrinsics.checkNotNull(str2);
                    } else {
                        str2 = d[i13];
                    }
                    String str3 = str2;
                    str = (i12 != 5 || (i13 & 4) == 0) ? (i12 != 0 || (i13 & 32) == 0) ? str3 : StringsKt.replace$default(str3, "PRIORITY", "COMPRESSED", false, 4, (Object) null) : StringsKt.replace$default(str3, "HEADERS", "PUSH_PROMISE", false, 4, (Object) null);
                }
            }
            str = d[i13];
        }
        return qe.c.i("%s 0x%08x %5d %-13s %s", z10 ? "<<" : ">>", Integer.valueOf(i10), Integer.valueOf(i11), a10, str);
    }
}
