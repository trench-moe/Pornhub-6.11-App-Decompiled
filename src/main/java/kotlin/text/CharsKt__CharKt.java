package kotlin.text;

import a0.a;
import com.appsflyer.oaid.BuildConfig;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0007\u001a\u001c\u0010\b\u001a\u00020\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\n\u0010\f\u001a\u00020\t*\u00020\u0001\u001a\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000eH\u0087\n\u001a\f\u0010\u000f\u001a\u00020\u000e*\u00020\u0001H\u0007¨\u0006\u0010"}, d2 = {"digitToChar", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "radix", "digitToInt", "digitToIntOrNull", "(C)Ljava/lang/Integer;", "(CI)Ljava/lang/Integer;", "equals", BuildConfig.FLAVOR, "other", "ignoreCase", "isSurrogate", "plus", BuildConfig.FLAVOR, "titlecase", "kotlin-stdlib"}, k = 5, mv = {1, 6, 0}, xi = 49, xs = "kotlin/text/CharsKt")
/* loaded from: classes3.dex */
public class CharsKt__CharKt extends CharsKt__CharJVMKt {
    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final char digitToChar(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 10) {
            z10 = true;
        }
        if (z10) {
            return (char) (i10 + 48);
        }
        throw new IllegalArgumentException(a.k("Int ", i10, " is not a decimal digit"));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final char digitToChar(int i10, int i11) {
        boolean z10 = false;
        if (2 <= i11 && i11 < 37) {
            z10 = true;
        }
        if (z10) {
            if (i10 >= 0 && i10 < i11) {
                return (char) (i10 < 10 ? i10 + 48 : ((char) (i10 + 65)) - '\n');
            }
            throw new IllegalArgumentException("Digit " + i10 + " does not represent a valid digit in radix " + i11);
        }
        throw new IllegalArgumentException(a.k("Invalid radix: ", i11, ". Valid radix values are in range 2..36"));
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final int digitToInt(char c10) {
        int digitOf = CharsKt__CharJVMKt.digitOf(c10, 10);
        if (digitOf >= 0) {
            return digitOf;
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a decimal digit");
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final int digitToInt(char c10, int i10) {
        Integer digitToIntOrNull = digitToIntOrNull(c10, i10);
        if (digitToIntOrNull != null) {
            return digitToIntOrNull.intValue();
        }
        throw new IllegalArgumentException("Char " + c10 + " is not a digit in the given radix=" + i10);
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Integer digitToIntOrNull(char c10) {
        Integer valueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c10, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @SinceKotlin(version = "1.5")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    public static final Integer digitToIntOrNull(char c10, int i10) {
        CharsKt__CharJVMKt.checkRadix(i10);
        Integer valueOf = Integer.valueOf(CharsKt__CharJVMKt.digitOf(c10, i10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final boolean equals(char c10, char c11, boolean z10) {
        if (c10 == c11) {
            return true;
        }
        if (z10) {
            char upperCase = Character.toUpperCase(c10);
            char upperCase2 = Character.toUpperCase(c11);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }

    public static /* synthetic */ boolean equals$default(char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return equals(c10, c11, z10);
    }

    public static final boolean isSurrogate(char c10) {
        return 55296 <= c10 && c10 < 57344;
    }

    @InlineOnly
    private static final String plus(char c10, String other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return c10 + other;
    }

    @SinceKotlin(version = "1.5")
    public static final String titlecase(char c10) {
        return _OneToManyTitlecaseMappingsKt.titlecaseImpl(c10);
    }
}
