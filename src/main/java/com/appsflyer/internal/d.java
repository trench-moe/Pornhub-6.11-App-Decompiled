package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Process;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.view.Gravity;
import android.webkit.URLUtil;
import com.appsflyer.AFLogger;
import com.appsflyer.oaid.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {
    private static char AFInAppEventParameterName = 37945;
    private static char AFInAppEventType = 53514;
    private static char AFKeystoreWrapper = 4568;
    private static int AFVersionDeclaration = 1;
    private static int getLevel = 0;
    private static char valueOf = 2566;
    private static long values = 123364835749994368L;

    /* loaded from: classes.dex */
    public static class e extends HashMap<String, Object> {
        private static int AFInAppEventParameterName = 0;
        private static char[] AFInAppEventType = {28, '9', '9', '9', 'O', 'e', 'h', 129, 260, 266, 271, 272, 253, 243, 264, 270, 261, 258, 243, 239, 263, 265, 'g', 208, 207, 205, 205, '2', 'J', '2', '4', '2', 'J', 'N', '5', 'K', 'L', '1', '0', '4', 'M', 'a', 'a', 'c', 'c', 's', 231, 233, 237, 234, 231, 232, 244, 255, 248, 238, 239, 247, 237, 228, 219, 241, 273, 271, 273, 270, 261, 234, 244, 276, 268, 271, 276, 270, 238, 236, 265, 271, 275, 270, 268, 266, ':', 'l', 'i', 'n', 'j', 'k', 'i', 'j', 't', 's', 'k', Typography.less, 'X', '7', 166, 'g', 166, 'g', Typography.section, 'f', Typography.section, 'f', 156, Typography.pound, 151, 170, 158, 153, 'h', 'h'};
        private static long AFKeystoreWrapper = 3100330032987487916L;
        private static int getLevel = 1;
        private final Map<String, Object> valueOf;
        private final Context values;

        /* renamed from: com.appsflyer.internal.d$e$d  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0069d {
            public final Boolean AFInAppEventParameterName;
            public Boolean valueOf;
            public final String values;

            public C0069d() {
            }

            public C0069d(String str, Boolean bool) {
                this.values = str;
                this.AFInAppEventParameterName = bool;
            }

            public static byte[] AFInAppEventParameterName(String str) {
                return str.getBytes();
            }

            public static String AFInAppEventType(byte[] bArr) {
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : bArr) {
                    String hexString = Integer.toHexString(b10);
                    if (hexString.length() == 1) {
                        hexString = "0".concat(hexString);
                    }
                    sb2.append(hexString);
                }
                return sb2.toString();
            }

            public static byte[] valueOf(byte[] bArr) {
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    bArr[i10] = (byte) (bArr[i10] ^ ((i10 % 2) + 42));
                }
                return bArr;
            }
        }

        public e(Map<String, Object> map, Context context) {
            this.valueOf = map;
            this.values = context;
            put(AFInAppEventType(), valueOf());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String] */
        private String AFInAppEventType() {
            int i10 = getLevel + 49;
            AFInAppEventParameterName = i10 % 128;
            int i11 = i10 % 2;
            int i12 = 4;
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                String obj = this.valueOf.get(valueOf("薝ṹ藼ꂳ鎙\uee9e덭輝缥ᦂ雳맚烨ᓞ鱋븉").intern()).toString();
                String obj2 = this.valueOf.get(valueOf("羹毌翛픒࠻甂ឞ⯴蔏").intern()).toString();
                if ((obj2 == null ? (char) 27 : '%') != '%') {
                    int i13 = getLevel + 81;
                    AFInAppEventParameterName = i13 % 128;
                    int i14 = i13 % 2;
                    obj2 = valueOf("墧꺥壩၆❫婬矶䮰ꈋ\ua95b∪絀").intern();
                }
                StringBuilder sb2 = new StringBuilder(obj);
                sb2.reverse();
                StringBuilder AFKeystoreWrapper2 = AFKeystoreWrapper(num, obj2, sb2.toString());
                int length = AFKeystoreWrapper2.length();
                if (length > 4) {
                    AFKeystoreWrapper2.delete(4, length);
                } else {
                    while (true) {
                        if (!(length < 4 ? true : true)) {
                            break;
                        }
                        length++;
                        AFKeystoreWrapper2.append('1');
                    }
                }
                AFKeystoreWrapper2.insert(0, valueOf("骭\ue135髆忼㴛䀥䧐").intern());
                i12 = AFKeystoreWrapper2.toString();
                return i12;
            } catch (Exception e10) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(valueOf("㘷栢㙑훯᥄摵쪏\uf6e7첄濗ᱝ쀴썔抍ᚨ쟱옠砧ॴ\ub74f6羣ఆ큆퍇狓ۖퟶ혈䠃㥺\ueaaa\uecf5俻㱽\ue056\ue3a9䊠㛈\ue713\ue615塚⦒諾ﲋ彃").intern());
                sb3.append(e10);
                AFLogger.valueOf(sb3.toString());
                int[] iArr = new int[i12];
                // fill-array-data instruction
                iArr[0] = 0;
                iArr[1] = 7;
                iArr[2] = 0;
                iArr[3] = 7;
                return values(iArr, "\u0001\u0000\u0000\u0000\u0001\u0001\u0000", Process.supportsProcesses()).intern();
            }
        }

        private static StringBuilder AFKeystoreWrapper(String... strArr) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                if (i10 >= 3) {
                    break;
                }
                int i11 = getLevel + 19;
                AFInAppEventParameterName = i11 % 128;
                if ((i11 % 2 != 0 ? Typography.less : ')') != '<') {
                    arrayList.add(Integer.valueOf(strArr[i10].length()));
                    i10++;
                } else {
                    arrayList.add(Integer.valueOf(strArr[i10].length()));
                    i10 += 0;
                }
            }
            Collections.sort(arrayList);
            int intValue = ((Integer) arrayList.get(0)).intValue();
            StringBuilder sb2 = new StringBuilder();
            int i12 = 0;
            while (i12 < intValue) {
                int i13 = getLevel + 75;
                AFInAppEventParameterName = i13 % 128;
                int i14 = i13 % 2;
                Integer num = null;
                for (int i15 = 0; i15 < 3; i15++) {
                    int i16 = getLevel + 31;
                    AFInAppEventParameterName = i16 % 128;
                    int i17 = i16 % 2;
                    int charAt = strArr[i15].charAt(i12);
                    if ((num == null ? 'U' : '8') != 'U') {
                        charAt ^= num.intValue();
                    }
                    num = Integer.valueOf(charAt);
                }
                sb2.append(Integer.toHexString(num.intValue()));
                i12++;
                int i18 = getLevel + 1;
                AFInAppEventParameterName = i18 % 128;
                int i19 = i18 % 2;
            }
            return sb2;
        }

        private String valueOf() {
            String obj;
            int i10;
            try {
                String obj2 = this.valueOf.get(valueOf("薝ṹ藼ꂳ鎙\uee9e덭輝缥ᦂ雳맚烨ᓞ鱋븉").intern()).toString();
                String obj3 = this.valueOf.get(values(new int[]{7, 15, 157, 0}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001", !URLUtil.isJavaScriptUrl("javascript:")).intern()).toString();
                String replaceAll = values(new int[]{22, 5, 157, 1}, "\u0000\u0001\u0000\u0001\u0001", !TextUtils.equals(BuildConfig.FLAVOR, BuildConfig.FLAVOR)).intern().replaceAll(valueOf("툮\ueaaf툃呱꺒펩\uf849쑣⢙").intern(), BuildConfig.FLAVOR);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj2);
                sb2.append(obj3);
                sb2.append(replaceAll);
                String AFKeystoreWrapper2 = af.AFKeystoreWrapper(sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(BuildConfig.FLAVOR);
                sb3.append(AFKeystoreWrapper2.substring(0, 16));
                obj = sb3.toString();
            } catch (Exception e10) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(valueOf("꾊偓꿬\uee9e层ⅳㆁ෩唹垦奛㬺嫩嫼厮㳿徝䁖䱲↓䕋䟒䤀⭈䫺䪢䏍⳼侠瀧籮ᇭ畋瞋礯᭕穌竗珓ᰎ羹怲沏ƴ散杼楱ଭ").intern());
                sb4.append(e10);
                AFLogger.valueOf(sb4.toString());
                StringBuilder sb5 = new StringBuilder();
                sb5.append(BuildConfig.FLAVOR);
                sb5.append(values(new int[]{27, 18, 0, 13}, "\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000", PhoneNumberUtils.isGlobalPhoneNumber(BuildConfig.FLAVOR)).intern());
                obj = sb5.toString();
            }
            try {
                Intent registerReceiver = this.values.registerReceiver(null, new IntentFilter(values(new int[]{45, 37, 163, 0}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", !TextUtils.isGraphic(BuildConfig.FLAVOR)).intern()));
                int i11 = -2700;
                if ((registerReceiver != null ? 'a' : 'D') == 'a') {
                    int i12 = AFInAppEventParameterName + 17;
                    getLevel = i12 % 128;
                    int i13 = i12 % 2;
                    i11 = registerReceiver.getIntExtra(values(new int[]{82, 11, 0, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", !URLUtil.isJavaScriptUrl("javascript:")).intern(), -2700);
                }
                String str = this.values.getApplicationInfo().nativeLibraryDir;
                if (str != null) {
                    int i14 = AFInAppEventParameterName + 107;
                    getLevel = i14 % 128;
                    int i15 = i14 % 2;
                    if (str.contains(values(new int[]{93, 3, 0, 3}, "\u0000\u0000\u0000", !URLUtil.isHttpUrl("http://")).intern())) {
                        int i16 = getLevel + 73;
                        AFInAppEventParameterName = i16 % 128;
                        if ((i16 % 2 != 0 ? (char) 16 : Typography.quote) != 16) {
                            i10 = 1;
                            int size = ((SensorManager) this.values.getSystemService(valueOf("妿ટ姌둖篔ۢ䒔磣ꌓ൸").intern())).getSensorList(-1).size();
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(valueOf("涞淼颍㲲ⓔ").intern());
                            sb6.append(i11);
                            sb6.append(valueOf("㓷印㓑\ueda4ʵ脧").intern());
                            sb6.append(i10);
                            sb6.append(valueOf("ᓹꮼᓟᕣ襺瑞").intern());
                            sb6.append(size);
                            sb6.append(valueOf("⳰赻Ⳗ㎧鱤盬").intern());
                            sb6.append(this.valueOf.size());
                            String obj4 = sb6.toString();
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(obj);
                            sb7.append(C0069d.AFInAppEventType(C0069d.valueOf(C0069d.AFInAppEventParameterName(obj4))));
                            return sb7.toString();
                        }
                    }
                }
                i10 = 0;
                int size2 = ((SensorManager) this.values.getSystemService(valueOf("妿ટ姌둖篔ۢ䒔磣ꌓ൸").intern())).getSensorList(-1).size();
                StringBuilder sb62 = new StringBuilder();
                sb62.append(valueOf("涞淼颍㲲ⓔ").intern());
                sb62.append(i11);
                sb62.append(valueOf("㓷印㓑\ueda4ʵ脧").intern());
                sb62.append(i10);
                sb62.append(valueOf("ᓹꮼᓟᕣ襺瑞").intern());
                sb62.append(size2);
                sb62.append(valueOf("⳰赻Ⳗ㎧鱤盬").intern());
                sb62.append(this.valueOf.size());
                String obj42 = sb62.toString();
                StringBuilder sb72 = new StringBuilder();
                sb72.append(obj);
                sb72.append(C0069d.AFInAppEventType(C0069d.valueOf(C0069d.AFInAppEventParameterName(obj42))));
                return sb72.toString();
            } catch (Exception e11) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(valueOf("꾊偓꿬\uee9e层ⅳㆁ෩唹垦奛㬺嫩嫼厮㳿徝䁖䱲↓䕋䟒䤀⭈䫺䪢䏍⳼侠瀧籮ᇭ畋瞋礯᭕穌竗珓ᰎ羹怲沏ƴ散杼楱ଭ").intern());
                sb8.append(e11);
                AFLogger.valueOf(sb8.toString());
                StringBuilder sb9 = new StringBuilder();
                sb9.append(obj);
                sb9.append(values(new int[]{96, 16, 54, 9}, null, !Gravity.isHorizontal(0)).intern());
                return sb9.toString();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r11v1 */
        /* JADX WARN: Type inference failed for: r11v12, types: [char[]] */
        private static String valueOf(String str) {
            ?? r11 = str;
            if (!(r11 == 0)) {
                int i10 = getLevel + 3;
                AFInAppEventParameterName = i10 % 128;
                int i11 = i10 % 2;
                r11 = r11.toCharArray();
            }
            char[] AFInAppEventType2 = bz.AFInAppEventType(AFKeystoreWrapper, (char[]) r11);
            int i12 = 4;
            while (true) {
                if (!(i12 < AFInAppEventType2.length)) {
                    break;
                }
                int i13 = getLevel + 39;
                AFInAppEventParameterName = i13 % 128;
                int i14 = i13 % 2;
                AFInAppEventType2[i12] = (char) ((AFInAppEventType2[i12] ^ AFInAppEventType2[i12 % 4]) ^ ((i12 - 4) * AFKeystoreWrapper));
                i12++;
            }
            String str2 = new String(AFInAppEventType2, 4, AFInAppEventType2.length - 4);
            int i15 = AFInAppEventParameterName + 19;
            getLevel = i15 % 128;
            if (i15 % 2 == 0 ? true : true) {
                return str2;
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r13v1 */
        /* JADX WARN: Type inference failed for: r13v22, types: [byte[]] */
        private static String values(int[] iArr, String str, boolean z10) {
            int i10 = 0;
            if (!(str == 0)) {
                str = str.getBytes("ISO-8859-1");
            }
            byte[] bArr = (byte[]) str;
            int i11 = iArr[0];
            int i12 = iArr[1];
            int i13 = iArr[2];
            int i14 = iArr[3];
            char[] cArr = new char[i12];
            System.arraycopy(AFInAppEventType, i11, cArr, 0, i12);
            if (bArr != null) {
                char[] cArr2 = new char[i12];
                char c10 = 0;
                for (int i15 = 0; i15 < i12; i15++) {
                    if ((bArr[i15] == 1 ? 'b' : (char) 20) != 20) {
                        cArr2[i15] = (char) (((cArr[i15] << 1) + 1) - c10);
                    } else {
                        cArr2[i15] = (char) ((cArr[i15] << 1) - c10);
                    }
                    c10 = cArr2[i15];
                }
                cArr = cArr2;
            }
            if (i14 > 0) {
                int i16 = AFInAppEventParameterName + 125;
                getLevel = i16 % 128;
                if (i16 % 2 == 0) {
                    char[] cArr3 = new char[i12];
                    System.arraycopy(cArr, 0, cArr3, 0, i12);
                    System.arraycopy(cArr3, 1, cArr, i12 >>> i14, i14);
                    System.arraycopy(cArr3, i14, cArr, 1, i12 << i14);
                } else {
                    char[] cArr4 = new char[i12];
                    System.arraycopy(cArr, 0, cArr4, 0, i12);
                    int i17 = i12 - i14;
                    System.arraycopy(cArr4, 0, cArr, i17, i14);
                    System.arraycopy(cArr4, i14, cArr, 0, i17);
                }
            }
            if (z10) {
                char[] cArr5 = new char[i12];
                for (int i18 = 0; i18 < i12; i18++) {
                    cArr5[i18] = cArr[(i12 - i18) - 1];
                }
                cArr = cArr5;
            }
            if (i13 > 0) {
                int i19 = AFInAppEventParameterName + 65;
                while (true) {
                    getLevel = i19 % 128;
                    int i20 = i19 % 2;
                    if (i10 >= i12) {
                        break;
                    }
                    cArr[i10] = (char) (cArr[i10] - iArr[2]);
                    i10++;
                    i19 = AFInAppEventParameterName + 7;
                }
            }
            return new String(cArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    private static String AFInAppEventParameterName(String str) {
        char[] cArr;
        String str2 = str;
        char c10 = 1;
        if (!(str2 != null)) {
            cArr = str2;
        } else {
            int i10 = AFVersionDeclaration + 1;
            getLevel = i10 % 128;
            if ((i10 % 2 != 0 ? (char) 11 : '\n') != '\n') {
                str2.toCharArray();
                Objects.requireNonNull(null);
                throw null;
            }
            cArr = str2.toCharArray();
        }
        char[] cArr2 = cArr;
        char c11 = cArr2[0];
        char[] cArr3 = new char[cArr2.length - 1];
        while (c10 < cArr2.length) {
            int i11 = AFVersionDeclaration + 119;
            getLevel = i11 % 128;
            if ((i11 % 2 != 0 ? '3' : '#') != '3') {
                cArr3[c10 - 1] = (char) ((cArr2[c10] ^ (c10 * c11)) ^ values);
                c10++;
            } else {
                cArr3[c10 % 0] = (char) ((cArr2[c10] | (c10 * c11)) & values);
                c10 += 27;
            }
        }
        return new String(cArr3);
    }

    private static String AFInAppEventParameterName(String str, Long l10) {
        if (str != null && l10 != null) {
            int i10 = AFVersionDeclaration + 49;
            getLevel = i10 % 128;
            int i11 = i10 % 2;
            if (str.length() == 32) {
                StringBuilder sb2 = new StringBuilder(str);
                String obj = l10.toString();
                long j10 = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    boolean z10 = true;
                    if (i12 >= obj.length()) {
                        break;
                    }
                    int i14 = AFVersionDeclaration + 85;
                    getLevel = i14 % 128;
                    if (i14 % 2 != 0) {
                        z10 = true;
                    }
                    if (!z10) {
                        i13 += Character.getNumericValue(obj.charAt(i12));
                        i12++;
                    } else {
                        i13 >>= Character.getNumericValue(obj.charAt(i12));
                        i12 += 49;
                    }
                }
                String hexString = Integer.toHexString(i13);
                sb2.replace(7, hexString.length() + 7, hexString);
                int i15 = 0;
                while (true) {
                    if (i15 >= sb2.length()) {
                        break;
                    }
                    j10 += Character.getNumericValue(sb2.charAt(i15));
                    i15++;
                }
                while (true) {
                    if (j10 > 100 ? true : true) {
                        break;
                    }
                    int i16 = AFVersionDeclaration + 13;
                    int i17 = i16 % 128;
                    getLevel = i17;
                    j10 = i16 % 2 != 0 ? j10 & 100 : j10 % 100;
                    int i18 = i17 + 3;
                    AFVersionDeclaration = i18 % 128;
                    int i19 = i18 % 2;
                }
                sb2.insert(23, (int) j10);
                if (j10 < 10) {
                    sb2.insert(23, values("큮\ud8fc").intern());
                }
                return sb2.toString();
            }
        }
        return AFInAppEventParameterName("嗧䨅됯ṗ䡹뉢\u1c8f䛡낍᪦䓢꽘ᥧ䍚굀ᜰ䇃ꯣᗘ羑ꧩᑇ縿꡵መ籫ꛏწ窢꒙ຢ祈ꍑ").intern();
    }

    private static String AFKeystoreWrapper(Context context) {
        PackageManager packageManager;
        String packageName;
        int i10 = AFVersionDeclaration + 41;
        getLevel = i10 % 128;
        try {
            if (!(i10 % 2 != 0 ? true : true)) {
                packageManager = context.getPackageManager();
                packageName = context.getPackageName();
            } else {
                packageManager = context.getPackageManager();
                packageName = context.getPackageName();
            }
            String str = packageManager.getPackageInfo(packageName, 0).packageName;
            int i11 = getLevel + 47;
            AFVersionDeclaration = i11 % 128;
            int i12 = i11 % 2;
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String AFKeystoreWrapper(Context context, long j10) {
        String values2;
        String intern;
        String values3;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        sb3.append((valueOf(values("閺ﱤ⭾\ud861툗룹㮄\udec8镣뛫煄깅\ue9f4猽嵵䑱柖㼜\uf675鉀煄깅\ue9f4猽嵵䑱柖㼜\uf262∩핁\u17ed䝟燎卭瑕").intern()) ? AFInAppEventParameterName("師䆚") : values("큮\ud8fc")).intern());
        StringBuilder sb5 = new StringBuilder();
        String packageName = context.getPackageName();
        String AFKeystoreWrapper2 = AFKeystoreWrapper(packageName);
        sb3.append(AFInAppEventParameterName("師䆚").intern());
        sb5.append(AFKeystoreWrapper2);
        if (valueOf(context) == null) {
            sb3.append(values("큮\ud8fc").intern());
            sb5.append(packageName);
        } else {
            sb3.append(AFInAppEventParameterName("師䆚").intern());
            sb5.append(packageName);
            int i10 = getLevel + 111;
            AFVersionDeclaration = i10 % 128;
            int i11 = i10 % 2;
        }
        String AFKeystoreWrapper3 = AFKeystoreWrapper(context);
        if (AFKeystoreWrapper3 == null) {
            sb3.append(values("큮\ud8fc").intern());
            sb5.append(packageName);
        } else {
            sb3.append(AFInAppEventParameterName("師䆚").intern());
            sb5.append(AFKeystoreWrapper3);
        }
        sb5.append(values(context, packageName));
        sb2.append(sb5.toString());
        try {
            sb2.append(new SimpleDateFormat(AFInAppEventParameterName("ދᡲჯक़Ǖ㨚㊏⬀⏵將咊䴦䕌緇癷滈权鿈頜").intern(), Locale.US).format(new Date(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime)));
            sb2.append(j10);
            if (!(!valueOf(values("洰⊭⭾\ud861툗룹㮄\udec8\uf4b9թ\uef45㧀\uf21d䕻錰䇷\udb0d\ue1aa\ue2d6噗ᬤ㸬㏡⅀\udb0d\ue1aa").intern()))) {
                int i12 = AFVersionDeclaration + 33;
                getLevel = i12 % 128;
                int i13 = i12 % 2;
                values2 = AFInAppEventParameterName("師䆚");
            } else {
                values2 = values("큮\ud8fc");
            }
            sb4.append(values2.intern());
            if (valueOf(AFInAppEventParameterName("룷꜖渀㔁ﰮ茼䨣ᄥ\ud816齇♇\ued6f둰筼ɣ즋邕埉ẍꖰ沢㎰𥉉臃").intern())) {
                int i14 = getLevel + 57;
                AFVersionDeclaration = i14 % 128;
                if (i14 % 2 == 0 ? true : false) {
                    AFInAppEventParameterName("師䆚").intern();
                    Objects.requireNonNull(null);
                    throw null;
                }
                intern = AFInAppEventParameterName("師䆚").intern();
                int i15 = AFVersionDeclaration + 21;
                getLevel = i15 % 128;
                int i16 = i15 % 2;
            } else {
                intern = values("큮\ud8fc").intern();
            }
            sb4.append(intern);
            if (valueOf(values("\ude82\ue6a8⭾\ud861툗룹㮄\udec8\uf4b9թ\uef45㧀⋽䜪嗚\uee4fᵧ߂왴֙\ude9b죷").intern())) {
                int i17 = AFVersionDeclaration + 77;
                getLevel = i17 % 128;
                int i18 = i17 % 2;
                values3 = AFInAppEventParameterName("師䆚");
            } else {
                values3 = values("큮\ud8fc");
            }
            sb4.append(values3.intern());
            sb4.append((valueOf(AFInAppEventParameterName("㧥☄氤뉋\uf866㺖䒷誧킆ᛣ崗挣ꤒ\uef74㕴箂").intern()) ? AFInAppEventParameterName("師䆚") : values("큮\ud8fc")).intern());
            String AFInAppEventType2 = af.AFInAppEventType(af.AFKeystoreWrapper(sb2.toString()));
            String obj = sb3.toString();
            StringBuilder sb6 = new StringBuilder(AFInAppEventType2);
            sb6.setCharAt(17, Integer.toString(Integer.parseInt(obj, 2), 16).charAt(0));
            String obj2 = sb6.toString();
            String obj3 = sb4.toString();
            StringBuilder sb7 = new StringBuilder(obj2);
            sb7.setCharAt(27, Integer.toString(Integer.parseInt(obj3, 2), 16).charAt(0));
            return AFInAppEventParameterName(sb7.toString(), Long.valueOf(j10));
        } catch (PackageManager.NameNotFoundException unused) {
            return AFInAppEventParameterName("嗧䨅됯ṗ䡹뉢\u1c8f䛡낍᪦䓢꽘ᥧ䍚굀ᜰ䇃ꯣᗘ羑ꧩᑇ縿꡵መ籫ꛏწ窢꒙ຢ祈ꍑ").intern();
        }
    }

    private static String AFKeystoreWrapper(String str) {
        int i10 = 1;
        if (!str.contains(AFInAppEventParameterName("\udb3b쒕").intern())) {
            int i11 = getLevel + 97;
            AFVersionDeclaration = i11 % 128;
            if (!(i11 % 2 == 0)) {
                return str;
            }
            Objects.requireNonNull(null);
            throw null;
        }
        String[] split = str.split(values("귫౮ቮ᪺").intern());
        int length = split.length;
        StringBuilder sb2 = new StringBuilder();
        int i12 = length - 1;
        sb2.append(split[i12]);
        sb2.append(AFInAppEventParameterName("\udb3b쒕").intern());
        int i13 = getLevel + 79;
        AFVersionDeclaration = i13 % 128;
        int i14 = i13 % 2;
        while (true) {
            if ((i10 < i12 ? (char) 31 : '\f') == '\f') {
                sb2.append(split[0]);
                return sb2.toString();
            }
            int i15 = AFVersionDeclaration + 107;
            getLevel = i15 % 128;
            int i16 = i15 % 2;
            sb2.append(split[i10]);
            sb2.append(AFInAppEventParameterName("\udb3b쒕").intern());
            i10++;
        }
    }

    private static String valueOf(Context context) {
        String str = null;
        if ((System.getProperties().containsKey(AFInAppEventParameterName("\ue219ﷳ\udbd3립鞅痓卿ㅀས\ued15쬗꣣蛈撬䊬").intern()) ? 'A' : '[') == 'A') {
            try {
                Matcher matcher = Pattern.compile(values("쨩ℏ즼㊈視鹫缡ꭖ㚛泧䕰뫰").intern()).matcher(context.getCacheDir().getPath().replace(values("ᨎ쭜䶴陊\uf408帬祖軖").intern(), BuildConfig.FLAVOR));
                if ((matcher.find() ? '/' : (char) 19) != 19) {
                    int i10 = getLevel + 109;
                    AFVersionDeclaration = i10 % 128;
                    int i11 = i10 % 2;
                    String group = matcher.group(1);
                    int i12 = AFVersionDeclaration + 117;
                    getLevel = i12 % 128;
                    int i13 = i12 % 2;
                    str = group;
                }
            } catch (Exception e10) {
                aj valueOf2 = aj.valueOf();
                String intern = values("湀\ud841倴連断\u2fec팷惂뤚뫗\uf31d戴\ue9f4猽㪬⎮髼ᐁ").intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(values("壐樅\ueda7弙삤烉ӯ븢꜡㙤㕌櫩钴후嫶䌌볃놙倴連ᷤ蓉섎奱걏︠\uf837푤ꍟԅଣ窀\uf31d戴\ue9f4猽㪬⎮髼ᐁ륞㠻").intern());
                sb2.append(e10);
                valueOf2.valueOf(null, intern, sb2.toString());
                return null;
            }
        }
        return str;
    }

    private static boolean valueOf(String str) {
        int i10 = getLevel + 51;
        AFVersionDeclaration = i10 % 128;
        int i11 = i10 % 2;
        try {
            Class.forName(str);
            int i12 = getLevel + 79;
            AFVersionDeclaration = i12 % 128;
            int i13 = i12 % 2;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private static String values(Context context, String str) {
        boolean z10;
        try {
            int i10 = AFVersionDeclaration + 123;
            getLevel = i10 % 128;
            int i11 = i10 % 2;
            for (ApplicationInfo applicationInfo : (List) PackageManager.class.getDeclaredMethod(values("\uf6b8鿮钴후돘≷蕃昴钸䙡삤烉迏꣪璿\ue58b荤ᑪ䶴陊㪬⎮髼ᐁ쓎\ud849").intern(), Integer.TYPE).invoke(context.getPackageManager(), 0)) {
                int i12 = AFVersionDeclaration + 39;
                getLevel = i12 % 128;
                int i13 = i12 % 2;
                if (((PackageItemInfo) applicationInfo).packageName.equals(str)) {
                    z10 = false;
                    continue;
                } else {
                    z10 = true;
                    continue;
                }
                if (!z10) {
                    int i14 = AFVersionDeclaration + 13;
                    getLevel = i14 % 128;
                    if (!(i14 % 2 != 0)) {
                        return Boolean.TRUE.toString();
                    }
                    Boolean.TRUE.toString();
                    throw null;
                }
            }
        } catch (IllegalAccessException e10) {
            aj valueOf2 = aj.valueOf();
            String intern = values("꾭孶倴連断\u2fec팷惂偸빁㛓ே삤烉⸳\uf401篛䠭쑅뒕䥦\uf855铺ꢻ㜃ꨍ").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(values("求좌\ueda7弙삤烉ӯ븢寬쇈䃺裒ꠃ\u0a57榐햘㛓ே삤烉⸳\uf401鞾嗉\udbf1㛐钴후嵵䑱ӯ븢\uf837푤ꍟԅଣ窀\uf31d戴\ue9f4猽㪬⎮髼ᐁ륞㠻").intern());
            sb2.append(e10);
            valueOf2.valueOf(null, intern, sb2.toString());
        } catch (NoSuchMethodException e11) {
            aj valueOf3 = aj.valueOf();
            String intern2 = values("꾭孶倴連断\u2fec팷惂偸빁㛓ே삤烉⸳\uf401篛䠭쑅뒕䥦\uf855铺ꢻ㜃ꨍ").intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(values("求좌\ueda7弙삤烉ӯ븢寬쇈䃺裒ꠃ\u0a57榐햘㛓ே삤烉⸳\uf401鞾嗉\udbf1㛐钴후嵵䑱ӯ븢\uf837푤ꍟԅଣ窀\uf31d戴\ue9f4猽㪬⎮髼ᐁ륞㠻").intern());
            sb3.append(e11);
            valueOf3.valueOf(null, intern2, sb3.toString());
        } catch (InvocationTargetException e12) {
            aj valueOf4 = aj.valueOf();
            String intern3 = values("꾭孶倴連断\u2fec팷惂偸빁㛓ே삤烉⸳\uf401篛䠭쑅뒕䥦\uf855铺ꢻ㜃ꨍ").intern();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(values("求좌\ueda7弙삤烉ӯ븢寬쇈䃺裒ꠃ\u0a57榐햘㛓ே삤烉⸳\uf401鞾嗉\udbf1㛐钴후嵵䑱ӯ븢\uf837푤ꍟԅଣ窀\uf31d戴\ue9f4猽㪬⎮髼ᐁ륞㠻").intern());
            sb4.append(e12);
            valueOf4.valueOf(null, intern3, sb4.toString());
        }
        return Boolean.FALSE.toString();
    }

    private static String values(String str) {
        boolean z10 = str != null;
        char[] cArr = str;
        if (z10) {
            int i10 = AFVersionDeclaration + 121;
            getLevel = i10 % 128;
            int i11 = i10 % 2;
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        char[] cArr3 = new char[cArr2.length];
        char[] cArr4 = new char[2];
        int i12 = 0;
        while (true) {
            if ((i12 < cArr2.length ? ']' : 'S') != ']') {
                return new String(cArr3, 1, (int) cArr3[0]);
            }
            int i13 = getLevel + 99;
            AFVersionDeclaration = i13 % 128;
            int i14 = i13 % 2;
            cArr4[0] = cArr2[i12];
            int i15 = i12 + 1;
            cArr4[1] = cArr2[i15];
            by.values(cArr4, AFInAppEventType, AFInAppEventParameterName, AFKeystoreWrapper, valueOf);
            cArr3[i12] = cArr4[0];
            cArr3[i15] = cArr4[1];
            i12 += 2;
        }
    }
}
