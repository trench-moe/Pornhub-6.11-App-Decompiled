package kotlin.text;

import a1.a;
import com.app.pornhub.data.model.explore.ExploreModel;
import com.appsflyer.oaid.BuildConfig;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0001\u001a\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a\r\u0010\u000e\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0011\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0016\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0018\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u001a\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u001b\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\n\u0010\u001c\u001a\u00020\u000f*\u00020\u0002\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010!\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0014\u0010\"\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010#\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010$\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010%\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010&\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010'\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0014\u0010'\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010(\u001a\u00020\u0002*\u00020\u0002H\u0087\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006)"}, d2 = {ExploreModel.CATEGORY, "Lkotlin/text/CharCategory;", BuildConfig.FLAVOR, "getCategory", "(C)Lkotlin/text/CharCategory;", "directionality", "Lkotlin/text/CharDirectionality;", "getDirectionality", "(C)Lkotlin/text/CharDirectionality;", "checkRadix", BuildConfig.FLAVOR, "radix", "digitOf", "char", "isDefined", BuildConfig.FLAVOR, "isDigit", "isHighSurrogate", "isISOControl", "isIdentifierIgnorable", "isJavaIdentifierPart", "isJavaIdentifierStart", "isLetter", "isLetterOrDigit", "isLowSurrogate", "isLowerCase", "isTitleCase", "isUpperCase", "isWhitespace", "lowercase", BuildConfig.FLAVOR, "locale", "Ljava/util/Locale;", "lowercaseChar", "titlecase", "titlecaseChar", "toLowerCase", "toTitleCase", "toUpperCase", "uppercase", "uppercaseChar", "kotlin-stdlib"}, k = 5, mv = {1, 6, 0}, xi = 49, xs = "kotlin/text/CharsKt")
/* loaded from: classes3.dex */
public class CharsKt__CharJVMKt {
    @PublishedApi
    public static int checkRadix(int i10) {
        boolean z10 = false;
        if (2 <= i10 && i10 < 37) {
            z10 = true;
        }
        if (z10) {
            return i10;
        }
        StringBuilder n = a.n("radix ", i10, " was not in valid range ");
        n.append(new IntRange(2, 36));
        throw new IllegalArgumentException(n.toString());
    }

    public static final int digitOf(char c10, int i10) {
        return Character.digit((int) c10, i10);
    }

    public static final CharCategory getCategory(char c10) {
        return CharCategory.Companion.valueOf(Character.getType(c10));
    }

    public static final CharDirectionality getDirectionality(char c10) {
        return CharDirectionality.Companion.valueOf(Character.getDirectionality(c10));
    }

    @InlineOnly
    private static final boolean isDefined(char c10) {
        return Character.isDefined(c10);
    }

    @InlineOnly
    private static final boolean isDigit(char c10) {
        return Character.isDigit(c10);
    }

    @InlineOnly
    private static final boolean isHighSurrogate(char c10) {
        return Character.isHighSurrogate(c10);
    }

    @InlineOnly
    private static final boolean isISOControl(char c10) {
        return Character.isISOControl(c10);
    }

    @InlineOnly
    private static final boolean isIdentifierIgnorable(char c10) {
        return Character.isIdentifierIgnorable(c10);
    }

    @InlineOnly
    private static final boolean isJavaIdentifierPart(char c10) {
        return Character.isJavaIdentifierPart(c10);
    }

    @InlineOnly
    private static final boolean isJavaIdentifierStart(char c10) {
        return Character.isJavaIdentifierStart(c10);
    }

    @InlineOnly
    private static final boolean isLetter(char c10) {
        return Character.isLetter(c10);
    }

    @InlineOnly
    private static final boolean isLetterOrDigit(char c10) {
        return Character.isLetterOrDigit(c10);
    }

    @InlineOnly
    private static final boolean isLowSurrogate(char c10) {
        return Character.isLowSurrogate(c10);
    }

    @InlineOnly
    private static final boolean isLowerCase(char c10) {
        return Character.isLowerCase(c10);
    }

    @InlineOnly
    private static final boolean isTitleCase(char c10) {
        return Character.isTitleCase(c10);
    }

    @InlineOnly
    private static final boolean isUpperCase(char c10) {
        return Character.isUpperCase(c10);
    }

    public static boolean isWhitespace(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final String lowercase(char c10) {
        String lowerCase = String.valueOf(c10).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String lowercase(char c10, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String lowerCase = String.valueOf(c10).toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final char lowercaseChar(char c10) {
        return Character.toLowerCase(c10);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String titlecase(char c10, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String uppercase = uppercase(c10, locale);
        if (uppercase.length() <= 1) {
            String upperCase = String.valueOf(c10).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return !Intrinsics.areEqual(uppercase, upperCase) ? uppercase : String.valueOf(Character.toTitleCase(c10));
        } else if (c10 == 329) {
            return uppercase;
        } else {
            char charAt = uppercase.charAt(0);
            String substring = uppercase.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final char titlecaseChar(char c10) {
        return Character.toTitleCase(c10);
    }

    @Deprecated(message = "Use lowercaseChar() instead.", replaceWith = @ReplaceWith(expression = "lowercaseChar()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @InlineOnly
    private static final char toLowerCase(char c10) {
        return Character.toLowerCase(c10);
    }

    @Deprecated(message = "Use titlecaseChar() instead.", replaceWith = @ReplaceWith(expression = "titlecaseChar()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @InlineOnly
    private static final char toTitleCase(char c10) {
        return Character.toTitleCase(c10);
    }

    @Deprecated(message = "Use uppercaseChar() instead.", replaceWith = @ReplaceWith(expression = "uppercaseChar()", imports = {}))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @InlineOnly
    private static final char toUpperCase(char c10) {
        return Character.toUpperCase(c10);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final String uppercase(char c10) {
        String upperCase = String.valueOf(c10).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final String uppercase(char c10, Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String upperCase = String.valueOf(c10).toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    @InlineOnly
    private static final char uppercaseChar(char c10) {
        return Character.toUpperCase(c10);
    }
}
