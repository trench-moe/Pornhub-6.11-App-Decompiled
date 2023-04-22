package pe;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class r {
    public static final Pattern d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern f14003e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: f  reason: collision with root package name */
    public static final a f14004f = null;

    /* renamed from: a  reason: collision with root package name */
    public final String f14005a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14006b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f14007c;

    /* loaded from: classes3.dex */
    public static final class a {
        @JvmStatic
        @JvmName(name = "get")
        public static final r a(String toMediaType) {
            Intrinsics.checkNotNullParameter(toMediaType, "$this$toMediaType");
            Matcher matcher = r.d.matcher(toMediaType);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + toMediaType + Typography.quote).toString());
            }
            String group = matcher.group(1);
            Intrinsics.checkNotNullExpressionValue(group, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            Objects.requireNonNull(group, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = group.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            Intrinsics.checkNotNullExpressionValue(group2, "typeSubtype.group(2)");
            Intrinsics.checkNotNullExpressionValue(locale, "Locale.US");
            Objects.requireNonNull(group2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase2 = group2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = r.f14003e.matcher(toMediaType);
            int end = matcher.end();
            while (end < toMediaType.length()) {
                matcher2.region(end, toMediaType.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder m10 = a1.a.m("Parameter is not formatted correctly: \"");
                    String substring = toMediaType.substring(end);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                    m10.append(substring);
                    m10.append("\" for: \"");
                    m10.append(toMediaType);
                    m10.append(Typography.quote);
                    throw new IllegalArgumentException(m10.toString().toString());
                }
                String group3 = matcher2.group(1);
                if (group3 == null) {
                    end = matcher2.end();
                } else {
                    String group4 = matcher2.group(2);
                    if (group4 == null) {
                        group4 = matcher2.group(3);
                    } else if (StringsKt.startsWith$default(group4, "'", false, 2, (Object) null) && StringsKt.endsWith$default(group4, "'", false, 2, (Object) null) && group4.length() > 2) {
                        group4 = group4.substring(1, group4.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    arrayList.add(group3);
                    arrayList.add(group4);
                    end = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new r(toMediaType, lowerCase, lowerCase2, (String[]) array, null);
        }
    }

    public r(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f14005a = str;
        this.f14006b = str2;
        this.f14007c = strArr;
    }

    @JvmStatic
    @JvmName(name = "get")
    public static final r b(String str) {
        return a.a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.nio.charset.Charset a(java.nio.charset.Charset r7) {
        /*
            r6 = this;
            java.lang.String r0 = "charset"
            java.lang.String r1 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String[] r1 = r6.f14007c
            kotlin.ranges.IntRange r1 = kotlin.collections.ArraysKt.getIndices(r1)
            r2 = 2
            kotlin.ranges.IntProgression r1 = kotlin.ranges.RangesKt.step(r1, r2)
            int r2 = r1.getFirst()
            int r3 = r1.getLast()
            int r1 = r1.getStep()
            if (r1 < 0) goto L23
            if (r2 > r3) goto L3a
            goto L25
        L23:
            if (r2 < r3) goto L3a
        L25:
            java.lang.String[] r4 = r6.f14007c
            r4 = r4[r2]
            r5 = 1
            boolean r4 = kotlin.text.StringsKt.equals(r4, r0, r5)
            if (r4 == 0) goto L36
            java.lang.String[] r0 = r6.f14007c
            int r2 = r2 + r5
            r0 = r0[r2]
            goto L3b
        L36:
            if (r2 == r3) goto L3a
            int r2 = r2 + r1
            goto L25
        L3a:
            r0 = 0
        L3b:
            if (r0 == 0) goto L41
            java.nio.charset.Charset r7 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.IllegalArgumentException -> L41
        L41:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: pe.r.a(java.nio.charset.Charset):java.nio.charset.Charset");
    }

    public boolean equals(Object obj) {
        return (obj instanceof r) && Intrinsics.areEqual(((r) obj).f14005a, this.f14005a);
    }

    public int hashCode() {
        return this.f14005a.hashCode();
    }

    public String toString() {
        return this.f14005a;
    }
}
