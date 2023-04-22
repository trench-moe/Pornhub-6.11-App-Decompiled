package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.UByte;

/* loaded from: classes3.dex */
public class BitEncoding {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean FORCE_8TO7_ENCODING;

    private static /* synthetic */ void $$$reportNull$$$0(int i10) {
        String str = (i10 == 1 || i10 == 3 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 12 || i10 == 14) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 3 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 12 || i10 == 14) ? 2 : 3];
        if (i10 == 1 || i10 == 3 || i10 == 6 || i10 == 8 || i10 == 10 || i10 == 12 || i10 == 14) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[0] = "data";
        }
        if (i10 == 1) {
            objArr[1] = "encodeBytes";
        } else if (i10 == 3) {
            objArr[1] = "encode8to7";
        } else if (i10 == 6) {
            objArr[1] = "splitBytesToStringArray";
        } else if (i10 == 8) {
            objArr[1] = "decodeBytes";
        } else if (i10 == 10) {
            objArr[1] = "dropMarker";
        } else if (i10 == 12) {
            objArr[1] = "combineStringArrayIntoBytes";
        } else if (i10 != 14) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
        } else {
            objArr[1] = "decode7to8";
        }
        switch (i10) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 10:
            case 12:
            case 14:
                break;
            case 2:
                objArr[2] = "encode8to7";
                break;
            case 4:
                objArr[2] = "addModuloByte";
                break;
            case 5:
                objArr[2] = "splitBytesToStringArray";
                break;
            case 7:
                objArr[2] = "decodeBytes";
                break;
            case 9:
                objArr[2] = "dropMarker";
                break;
            case 11:
                objArr[2] = "combineStringArrayIntoBytes";
                break;
            case 13:
                objArr[2] = "decode7to8";
                break;
            default:
                objArr[2] = "encodeBytes";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 1 && i10 != 3 && i10 != 6 && i10 != 8 && i10 != 10 && i10 != 12 && i10 != 14) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        FORCE_8TO7_ENCODING = "true".equals(str);
    }

    private BitEncoding() {
    }

    private static void addModuloByte(byte[] bArr, int i10) {
        if (bArr == null) {
            $$$reportNull$$$0(4);
        }
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            bArr[i11] = (byte) ((bArr[i11] + i10) & 127);
        }
    }

    private static byte[] combineStringArrayIntoBytes(String[] strArr) {
        if (strArr == null) {
            $$$reportNull$$$0(11);
        }
        int i10 = 0;
        for (String str : strArr) {
            i10 += str.length();
        }
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (String str2 : strArr) {
            int length = str2.length();
            int i12 = 0;
            while (i12 < length) {
                bArr[i11] = (byte) str2.charAt(i12);
                i12++;
                i11++;
            }
        }
        return bArr;
    }

    private static byte[] decode7to8(byte[] bArr) {
        if (bArr == null) {
            $$$reportNull$$$0(13);
        }
        int length = (bArr.length * 7) / 8;
        byte[] bArr2 = new byte[length];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10++;
            int i13 = i11 + 1;
            bArr2[i12] = (byte) (((bArr[i10] & UByte.MAX_VALUE) >>> i11) + ((bArr[i10] & ((1 << i13) - 1)) << (7 - i11)));
            if (i11 == 6) {
                i10++;
                i11 = 0;
            } else {
                i11 = i13;
            }
        }
        return bArr2;
    }

    public static byte[] decodeBytes(String[] strArr) {
        if (strArr == null) {
            $$$reportNull$$$0(7);
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                byte[] stringsToBytes = UtfEncodingKt.stringsToBytes(dropMarker(strArr));
                if (stringsToBytes == null) {
                    $$$reportNull$$$0(8);
                }
                return stringsToBytes;
            } else if (charAt == 65535) {
                strArr = dropMarker(strArr);
            }
        }
        byte[] combineStringArrayIntoBytes = combineStringArrayIntoBytes(strArr);
        addModuloByte(combineStringArrayIntoBytes, 127);
        return decode7to8(combineStringArrayIntoBytes);
    }

    private static String[] dropMarker(String[] strArr) {
        if (strArr == null) {
            $$$reportNull$$$0(9);
        }
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[0] = strArr2[0].substring(1);
        return strArr2;
    }
}
