package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class UtfEncodingKt {
    public static final byte[] stringsToBytes(String[] strings) {
        int i10;
        Intrinsics.checkNotNullParameter(strings, "strings");
        int length = strings.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            String str = strings[i11];
            i11++;
            i12 += str.length();
        }
        byte[] bArr = new byte[i12];
        int length2 = strings.length;
        int i13 = 0;
        int i14 = 0;
        while (i13 < length2) {
            String str2 = strings[i13];
            i13++;
            int length3 = str2.length() - 1;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    int i16 = i15 + 1;
                    i10 = i14 + 1;
                    bArr[i14] = (byte) str2.charAt(i15);
                    if (i15 == length3) {
                        break;
                    }
                    i15 = i16;
                    i14 = i10;
                }
                i14 = i10;
            }
        }
        return bArr;
    }
}
