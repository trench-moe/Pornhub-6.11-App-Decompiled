package pe;

import com.appsflyer.oaid.BuildConfig;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13987a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13988b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13989c;
    public final String d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13990e;

    /* renamed from: f  reason: collision with root package name */
    public final int f13991f;

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f13992g;

    /* renamed from: h  reason: collision with root package name */
    public final List<String> f13993h;

    /* renamed from: i  reason: collision with root package name */
    public final String f13994i;

    /* renamed from: j  reason: collision with root package name */
    public final String f13995j;

    /* renamed from: l  reason: collision with root package name */
    public static final b f13986l = new b(null);

    /* renamed from: k  reason: collision with root package name */
    public static final char[] f13985k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public String f13996a;
        public String d;

        /* renamed from: f  reason: collision with root package name */
        public final List<String> f14000f;

        /* renamed from: g  reason: collision with root package name */
        public List<String> f14001g;

        /* renamed from: h  reason: collision with root package name */
        public String f14002h;

        /* renamed from: b  reason: collision with root package name */
        public String f13997b = BuildConfig.FLAVOR;

        /* renamed from: c  reason: collision with root package name */
        public String f13998c = BuildConfig.FLAVOR;

        /* renamed from: e  reason: collision with root package name */
        public int f13999e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f14000f = arrayList;
            arrayList.add(BuildConfig.FLAVOR);
        }

        public final p a() {
            ArrayList arrayList;
            String str = this.f13996a;
            if (str != null) {
                b bVar = p.f13986l;
                String d = b.d(bVar, this.f13997b, 0, 0, false, 7);
                String d10 = b.d(bVar, this.f13998c, 0, 0, false, 7);
                String str2 = this.d;
                if (str2 != null) {
                    int b10 = b();
                    List<String> list = this.f14000f;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    for (String str3 : list) {
                        arrayList2.add(b.d(p.f13986l, str3, 0, 0, false, 7));
                    }
                    List<String> list2 = this.f14001g;
                    if (list2 != null) {
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        for (String str4 : list2) {
                            arrayList.add(str4 != null ? b.d(p.f13986l, str4, 0, 0, true, 3) : null);
                        }
                    } else {
                        arrayList = null;
                    }
                    String str5 = this.f14002h;
                    return new p(str, d, d10, str2, b10, arrayList2, arrayList, str5 != null ? b.d(p.f13986l, str5, 0, 0, false, 7) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        public final int b() {
            int i10 = this.f13999e;
            if (i10 != -1) {
                return i10;
            }
            String scheme = this.f13996a;
            Intrinsics.checkNotNull(scheme);
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            int hashCode = scheme.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && scheme.equals("https")) {
                    return 443;
                }
            } else if (scheme.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final a c(String str) {
            List<String> list;
            if (str != null) {
                b bVar = p.f13986l;
                String a10 = b.a(bVar, str, 0, 0, " \"'<>#", true, false, true, false, null, 211);
                if (a10 != null) {
                    list = bVar.e(a10);
                    this.f14001g = list;
                    return this;
                }
            }
            list = null;
            this.f14001g = list;
            return this;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
            jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:126:0x0271
            	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
            	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
            */
        public final pe.p.a d(pe.p r30, java.lang.String r31) {
            /*
                Method dump skipped, instructions count: 1209
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pe.p.a.d(pe.p, java.lang.String):pe.p$a");
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
            if ((r9.f13998c.length() > 0) != false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00b4, code lost:
            if (r1 != r5) goto L62;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 339
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: pe.p.a.toString():java.lang.String");
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static String a(b bVar, String string, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12) {
            String str;
            boolean z14;
            String str2;
            int i13 = (i12 & 1) != 0 ? 0 : i10;
            int length = (i12 & 2) != 0 ? string.length() : i11;
            boolean z15 = (i12 & 8) != 0 ? false : z10;
            boolean z16 = (i12 & 16) != 0 ? false : z11;
            boolean z17 = (i12 & 32) != 0 ? false : z12;
            boolean z18 = (i12 & 64) != 0 ? false : z13;
            Charset charset2 = (i12 & 128) != 0 ? null : charset;
            Intrinsics.checkNotNullParameter(string, "$this$canonicalize");
            Intrinsics.checkNotNullParameter(encodeSet, "encodeSet");
            int i14 = i13;
            while (i14 < length) {
                int codePointAt = string.codePointAt(i14);
                int i15 = 2;
                if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && !z18)) {
                    str = "(this as java.lang.Strin…ing(startIndex, endIndex)";
                } else {
                    str = "(this as java.lang.Strin…ing(startIndex, endIndex)";
                    if (!StringsKt.contains$default((CharSequence) encodeSet, (char) codePointAt, false, 2, (Object) null) && ((codePointAt != 37 || (z15 && (!z16 || bVar.c(string, i14, length)))) && (codePointAt != 43 || !z17))) {
                        i14 += Character.charCount(codePointAt);
                    }
                }
                bf.f fVar = new bf.f();
                fVar.t0(string, i13, i14);
                bf.f fVar2 = null;
                while (i14 < length) {
                    int codePointAt2 = string.codePointAt(i14);
                    if (!z15 || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z17) {
                            fVar.s0(z15 ? "+" : "%2B");
                        } else {
                            if (codePointAt2 < 32 || codePointAt2 == 127 || (codePointAt2 >= 128 && !z18)) {
                                z14 = z17;
                            } else {
                                z14 = z17;
                                if (!StringsKt.contains$default((CharSequence) encodeSet, (char) codePointAt2, false, i15, (Object) null) && (codePointAt2 != 37 || (z15 && (!z16 || bVar.c(string, i14, length))))) {
                                    fVar.u0(codePointAt2);
                                    str2 = str;
                                    i14 += Character.charCount(codePointAt2);
                                    i15 = 2;
                                    z17 = z14;
                                    str = str2;
                                }
                            }
                            if (fVar2 == null) {
                                fVar2 = new bf.f();
                            }
                            if (charset2 == null || Intrinsics.areEqual(charset2, StandardCharsets.UTF_8)) {
                                str2 = str;
                                fVar2.u0(codePointAt2);
                            } else {
                                int charCount = Character.charCount(codePointAt2) + i14;
                                Intrinsics.checkNotNullParameter(string, "string");
                                Intrinsics.checkNotNullParameter(charset2, "charset");
                                if (!(i14 >= 0)) {
                                    throw new IllegalArgumentException(a1.a.j("beginIndex < 0: ", i14).toString());
                                }
                                if (!(charCount >= i14)) {
                                    throw new IllegalArgumentException(("endIndex < beginIndex: " + charCount + " < " + i14).toString());
                                }
                                if (!(charCount <= string.length())) {
                                    StringBuilder n = a1.a.n("endIndex > string.length: ", charCount, " > ");
                                    n.append(string.length());
                                    throw new IllegalArgumentException(n.toString().toString());
                                } else if (Intrinsics.areEqual(charset2, Charsets.UTF_8)) {
                                    fVar2.t0(string, i14, charCount);
                                    str2 = str;
                                } else {
                                    String substring = string.substring(i14, charCount);
                                    str2 = str;
                                    Intrinsics.checkNotNullExpressionValue(substring, str2);
                                    Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                                    byte[] bytes = substring.getBytes(charset2);
                                    Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                                    fVar2.c0(bytes, 0, bytes.length);
                                }
                            }
                            while (!fVar2.C()) {
                                int readByte = fVar2.readByte() & UByte.MAX_VALUE;
                                fVar.i0(37);
                                char[] cArr = p.f13985k;
                                fVar.i0(cArr[(readByte >> 4) & 15]);
                                fVar.i0(cArr[readByte & 15]);
                            }
                            i14 += Character.charCount(codePointAt2);
                            i15 = 2;
                            z17 = z14;
                            str = str2;
                        }
                    }
                    z14 = z17;
                    str2 = str;
                    i14 += Character.charCount(codePointAt2);
                    i15 = 2;
                    z17 = z14;
                    str = str2;
                }
                return fVar.E();
            }
            String substring2 = string.substring(i13, length);
            Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring2;
        }

        public static String d(b bVar, String percentDecode, int i10, int i11, boolean z10, int i12) {
            int i13;
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = percentDecode.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            Intrinsics.checkNotNullParameter(percentDecode, "$this$percentDecode");
            int i14 = i10;
            while (i14 < i11) {
                char charAt = percentDecode.charAt(i14);
                if (charAt == '%' || (charAt == '+' && z10)) {
                    bf.f fVar = new bf.f();
                    fVar.t0(percentDecode, i10, i14);
                    while (i14 < i11) {
                        int codePointAt = percentDecode.codePointAt(i14);
                        if (codePointAt != 37 || (i13 = i14 + 2) >= i11) {
                            if (codePointAt == 43 && z10) {
                                fVar.i0(32);
                                i14++;
                            }
                            fVar.u0(codePointAt);
                            i14 += Character.charCount(codePointAt);
                        } else {
                            int q10 = qe.c.q(percentDecode.charAt(i14 + 1));
                            int q11 = qe.c.q(percentDecode.charAt(i13));
                            if (q10 != -1 && q11 != -1) {
                                fVar.i0((q10 << 4) + q11);
                                i14 = Character.charCount(codePointAt) + i13;
                            }
                            fVar.u0(codePointAt);
                            i14 += Character.charCount(codePointAt);
                        }
                    }
                    return fVar.E();
                }
                i14++;
            }
            String substring = percentDecode.substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        @JvmStatic
        public final int b(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            int hashCode = scheme.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && scheme.equals("https")) {
                    return 443;
                }
            } else if (scheme.equals("http")) {
                return 80;
            }
            return -1;
        }

        public final boolean c(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && qe.c.q(str.charAt(i10 + 1)) != -1 && qe.c.q(str.charAt(i12)) != -1;
        }

        public final List<String> e(String toQueryNamesAndValues) {
            Intrinsics.checkNotNullParameter(toQueryNamesAndValues, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= toQueryNamesAndValues.length()) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) toQueryNamesAndValues, (char) Typography.amp, i10, false, 4, (Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = toQueryNamesAndValues.length();
                }
                int i11 = indexOf$default;
                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) toQueryNamesAndValues, '=', i10, false, 4, (Object) null);
                if (indexOf$default2 == -1 || indexOf$default2 > i11) {
                    String substring = toQueryNamesAndValues.substring(i10, i11);
                    Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = toQueryNamesAndValues.substring(i10, indexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    String substring3 = toQueryNamesAndValues.substring(indexOf$default2 + 1, i11);
                    Intrinsics.checkNotNullExpressionValue(substring3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(substring3);
                }
                i10 = i11 + 1;
            }
            return arrayList;
        }
    }

    public p(String scheme, String username, String password, String host, int i10, List<String> pathSegments, List<String> list, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f13988b = scheme;
        this.f13989c = username;
        this.d = password;
        this.f13990e = host;
        this.f13991f = i10;
        this.f13992g = pathSegments;
        this.f13993h = list;
        this.f13994i = str;
        this.f13995j = url;
        this.f13987a = Intrinsics.areEqual(scheme, "https");
    }

    @JvmName(name = "encodedPassword")
    public final String a() {
        if (this.d.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.f13995j, '@', 0, false, 6, (Object) null);
        String str = this.f13995j;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String substring = str.substring(StringsKt.indexOf$default((CharSequence) this.f13995j, ':', this.f13988b.length() + 3, false, 4, (Object) null) + 1, indexOf$default);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @JvmName(name = "encodedPath")
    public final String b() {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.f13995j, '/', this.f13988b.length() + 3, false, 4, (Object) null);
        String str = this.f13995j;
        int g10 = qe.c.g(str, "?#", indexOf$default, str.length());
        String str2 = this.f13995j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(indexOf$default, g10);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @JvmName(name = "encodedPathSegments")
    public final List<String> c() {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.f13995j, '/', this.f13988b.length() + 3, false, 4, (Object) null);
        String str = this.f13995j;
        int g10 = qe.c.g(str, "?#", indexOf$default, str.length());
        ArrayList arrayList = new ArrayList();
        while (indexOf$default < g10) {
            int i10 = indexOf$default + 1;
            int f10 = qe.c.f(this.f13995j, '/', i10, g10);
            String str2 = this.f13995j;
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String substring = str2.substring(i10, f10);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            arrayList.add(substring);
            indexOf$default = f10;
        }
        return arrayList;
    }

    @JvmName(name = "encodedQuery")
    public final String d() {
        if (this.f13993h == null) {
            return null;
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.f13995j, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f13995j;
        int f10 = qe.c.f(str, '#', indexOf$default, str.length());
        String str2 = this.f13995j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(indexOf$default, f10);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @JvmName(name = "encodedUsername")
    public final String e() {
        if (this.f13989c.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int length = this.f13988b.length() + 3;
        String str = this.f13995j;
        int g10 = qe.c.g(str, ":@", length, str.length());
        String str2 = this.f13995j;
        Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
        String substring = str2.substring(length, g10);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public boolean equals(Object obj) {
        return (obj instanceof p) && Intrinsics.areEqual(((p) obj).f13995j, this.f13995j);
    }

    public final a f(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        try {
            a aVar = new a();
            aVar.d(this, link);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String g() {
        a f10 = f("/...");
        Intrinsics.checkNotNull(f10);
        Objects.requireNonNull(f10);
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "username");
        b bVar = f13986l;
        f10.f13997b = b.a(bVar, BuildConfig.FLAVOR, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        Intrinsics.checkNotNullParameter(BuildConfig.FLAVOR, "password");
        f10.f13998c = b.a(bVar, BuildConfig.FLAVOR, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
        return f10.a().f13995j;
    }

    @JvmName(name = "uri")
    public final URI h() {
        String substring;
        a aVar = new a();
        aVar.f13996a = this.f13988b;
        String e10 = e();
        Intrinsics.checkNotNullParameter(e10, "<set-?>");
        aVar.f13997b = e10;
        String a10 = a();
        Intrinsics.checkNotNullParameter(a10, "<set-?>");
        aVar.f13998c = a10;
        aVar.d = this.f13990e;
        aVar.f13999e = this.f13991f != f13986l.b(this.f13988b) ? this.f13991f : -1;
        aVar.f14000f.clear();
        aVar.f14000f.addAll(c());
        aVar.c(d());
        if (this.f13994i == null) {
            substring = null;
        } else {
            String str = this.f13995j;
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            substring = str.substring(StringsKt.indexOf$default((CharSequence) this.f13995j, '#', 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
        }
        aVar.f14002h = substring;
        String str2 = aVar.d;
        aVar.d = str2 != null ? new Regex("[\"<>^`{|}]").replace(str2, BuildConfig.FLAVOR) : null;
        int size = aVar.f14000f.size();
        for (int i10 = 0; i10 < size; i10++) {
            List<String> list = aVar.f14000f;
            list.set(i10, b.a(f13986l, list.get(i10), 0, 0, "[]", true, true, false, false, null, 227));
        }
        List<String> list2 = aVar.f14001g;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String str3 = list2.get(i11);
                list2.set(i11, str3 != null ? b.a(f13986l, str3, 0, 0, "\\^`{|}", true, true, true, false, null, 195) : null);
            }
        }
        String str4 = aVar.f14002h;
        aVar.f14002h = str4 != null ? b.a(f13986l, str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163) : null;
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e11) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(aVar2, BuildConfig.FLAVOR));
                Intrinsics.checkNotNullExpressionValue(create, "try {\n        val stripp…e) // Unexpected!\n      }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e11);
            }
        }
    }

    public int hashCode() {
        return this.f13995j.hashCode();
    }

    public String toString() {
        return this.f13995j;
    }
}
