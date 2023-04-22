package pe;

import com.google.vrtoolkit.cardboard.FullscreenMode;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import ue.c;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f13958j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f13959k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f13960l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f13961m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public static final i n = null;

    /* renamed from: a  reason: collision with root package name */
    public final String f13962a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13963b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13964c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13965e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f13966f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f13967g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13968h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f13969i;

    public i(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, DefaultConstructorMarker defaultConstructorMarker) {
        this.f13962a = str;
        this.f13963b = str2;
        this.f13964c = j10;
        this.d = str3;
        this.f13965e = str4;
        this.f13966f = z10;
        this.f13967g = z11;
        this.f13968h = z12;
        this.f13969i = z13;
    }

    public static final int a(String str, int i10, int i11, boolean z10) {
        while (i10 < i11) {
            char charAt = str.charAt(i10);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z10)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final long b(String str, int i10, int i11) {
        int a10 = a(str, i10, i11, false);
        Matcher matcher = f13961m.matcher(str);
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        while (a10 < i11) {
            int a11 = a(str, a10 + 1, i11, true);
            matcher.region(a10, a11);
            if (i13 == -1 && matcher.usePattern(f13961m).matches()) {
                String group = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(group, "matcher.group(1)");
                int parseInt = Integer.parseInt(group);
                String group2 = matcher.group(2);
                Intrinsics.checkNotNullExpressionValue(group2, "matcher.group(2)");
                int parseInt2 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                Intrinsics.checkNotNullExpressionValue(group3, "matcher.group(3)");
                i17 = Integer.parseInt(group3);
                i16 = parseInt2;
                i13 = parseInt;
            } else if (i14 == -1 && matcher.usePattern(f13960l).matches()) {
                String group4 = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(group4, "matcher.group(1)");
                i14 = Integer.parseInt(group4);
            } else {
                if (i15 == -1) {
                    Pattern pattern = f13959k;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        Intrinsics.checkNotNullExpressionValue(group5, "matcher.group(1)");
                        Locale locale = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
                        Objects.requireNonNull(group5, "null cannot be cast to non-null type java.lang.String");
                        String lowerCase = group5.toLowerCase(locale);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                        String pattern2 = pattern.pattern();
                        Intrinsics.checkNotNullExpressionValue(pattern2, "MONTH_PATTERN.pattern()");
                        i15 = StringsKt.indexOf$default((CharSequence) pattern2, lowerCase, 0, false, 6, (Object) null) / 4;
                    }
                }
                if (i12 == -1 && matcher.usePattern(f13958j).matches()) {
                    String group6 = matcher.group(1);
                    Intrinsics.checkNotNullExpressionValue(group6, "matcher.group(1)");
                    i12 = Integer.parseInt(group6);
                }
            }
            a10 = a(str, a11 + 1, i11, false);
        }
        if (70 <= i12 && 99 >= i12) {
            i12 += 1900;
        }
        if (i12 >= 0 && 69 >= i12) {
            i12 += FullscreenMode.NAVIGATION_BAR_TIMEOUT_MS;
        }
        if (i12 >= 1601) {
            if (i15 != -1) {
                if (1 <= i14 && 31 >= i14) {
                    if (i13 >= 0 && 23 >= i13) {
                        if (i16 >= 0 && 59 >= i16) {
                            if (i17 >= 0 && 59 >= i17) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(qe.c.d);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i12);
                                gregorianCalendar.set(2, i15 - 1);
                                gregorianCalendar.set(5, i14);
                                gregorianCalendar.set(11, i13);
                                gregorianCalendar.set(12, i16);
                                gregorianCalendar.set(13, i17);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (Intrinsics.areEqual(iVar.f13962a, this.f13962a) && Intrinsics.areEqual(iVar.f13963b, this.f13963b) && iVar.f13964c == this.f13964c && Intrinsics.areEqual(iVar.d, this.d) && Intrinsics.areEqual(iVar.f13965e, this.f13965e) && iVar.f13966f == this.f13966f && iVar.f13967g == this.f13967g && iVar.f13968h == this.f13968h && iVar.f13969i == this.f13969i) {
                return true;
            }
        }
        return false;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        int b10 = a1.a.b(this.f13963b, a1.a.b(this.f13962a, 527, 31), 31);
        long j10 = this.f13964c;
        return ((((((a1.a.b(this.f13965e, a1.a.b(this.d, (b10 + ((int) (j10 ^ (j10 >>> 32)))) * 31, 31), 31) + (this.f13966f ? 1231 : 1237)) * 31) + (this.f13967g ? 1231 : 1237)) * 31) + (this.f13968h ? 1231 : 1237)) * 31) + (this.f13969i ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f13962a);
        sb2.append('=');
        sb2.append(this.f13963b);
        if (this.f13968h) {
            if (this.f13964c == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                Date toHttpDateString = new Date(this.f13964c);
                c.a aVar = ue.c.f15879a;
                Intrinsics.checkNotNullParameter(toHttpDateString, "$this$toHttpDateString");
                String format = ue.c.f15879a.get().format(toHttpDateString);
                Intrinsics.checkNotNullExpressionValue(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb2.append(format);
            }
        }
        if (!this.f13969i) {
            sb2.append("; domain=");
            sb2.append(this.d);
        }
        sb2.append("; path=");
        sb2.append(this.f13965e);
        if (this.f13966f) {
            sb2.append("; secure");
        }
        if (this.f13967g) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString()");
        return sb3;
    }
}
