package kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize;

import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class CapitalizeDecapitalizeKt {
    public static final String capitalizeAsciiOnly(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        boolean z10 = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            z10 = true;
        }
        if (z10) {
            char upperCase = Character.toUpperCase(charAt);
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return upperCase + substring;
        }
        return str;
    }

    public static final String decapitalizeAsciiOnly(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        boolean z10 = false;
        if (str.length() == 0) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('A' <= charAt && charAt < '[') {
            z10 = true;
        }
        if (z10) {
            char lowerCase = Character.toLowerCase(charAt);
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return lowerCase + substring;
        }
        return str;
    }

    public static final String decapitalizeSmartForCompiler(String str, boolean z10) {
        Integer num;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if ((str.length() == 0) || !isUpperCaseCharAt(str, 0, z10)) {
            return str;
        }
        if (str.length() == 1 || !isUpperCaseCharAt(str, 1, z10)) {
            if (z10) {
                return decapitalizeAsciiOnly(str);
            }
            if (str.length() > 0) {
                char lowerCase = Character.toLowerCase(str.charAt(0));
                String substring = str.substring(1);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return lowerCase + substring;
            }
            return str;
        }
        Iterator<Integer> it = StringsKt.getIndices(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                num = null;
                break;
            }
            num = it.next();
            if (!isUpperCaseCharAt(str, num.intValue(), z10)) {
                break;
            }
        }
        Integer num2 = num;
        if (num2 == null) {
            return toLowerCase(str, z10);
        }
        int intValue = num2.intValue() - 1;
        String substring2 = str.substring(0, intValue);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        String lowerCase2 = toLowerCase(substring2, z10);
        String substring3 = str.substring(intValue);
        Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String).substring(startIndex)");
        return Intrinsics.stringPlus(lowerCase2, substring3);
    }

    private static final boolean isUpperCaseCharAt(String str, int i10, boolean z10) {
        char charAt = str.charAt(i10);
        return z10 ? 'A' <= charAt && charAt < '[' : Character.isUpperCase(charAt);
    }

    private static final String toLowerCase(String str, boolean z10) {
        if (z10) {
            return toLowerCaseAsciiOnly(str);
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public static final String toLowerCaseAsciiOnly(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb2 = new StringBuilder(str.length());
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            i10++;
            if ('A' <= charAt && charAt < '[') {
                charAt = Character.toLowerCase(charAt);
            }
            sb2.append(charAt);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "builder.toString()");
        return sb3;
    }
}
