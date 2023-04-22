package qe;

import bf.f;
import bf.h;
import bf.p;
import bf.y;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okio.ByteString;
import pe.a0;
import pe.o;
import pe.t;
import pe.z;

@JvmName(name = "Util")
/* loaded from: classes3.dex */
public final class c {
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f14512a;
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public static final o f14513b = o.f13982f.c(new String[0]);
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public static final a0 f14514c;
    @JvmField
    public static final TimeZone d;

    /* renamed from: e  reason: collision with root package name */
    public static final Regex f14515e;
    @JvmField

    /* renamed from: f  reason: collision with root package name */
    public static final String f14516f;

    static {
        byte[] toRequestBody = new byte[0];
        f14512a = toRequestBody;
        Intrinsics.checkNotNullParameter(toRequestBody, "$this$toResponseBody");
        f asResponseBody = new f();
        asResponseBody.Z(toRequestBody);
        long j10 = 0;
        Intrinsics.checkNotNullParameter(asResponseBody, "$this$asResponseBody");
        f14514c = new z(asResponseBody, null, j10);
        Intrinsics.checkNotNullParameter(toRequestBody, "$this$toRequestBody");
        c(j10, j10, j10);
        p.a aVar = p.f3685j;
        ByteString.a aVar2 = ByteString.f13728m;
        aVar.c(aVar2.b("efbbbf"), aVar2.b("feff"), aVar2.b("fffe"), aVar2.b("0000ffff"), aVar2.b("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        d = timeZone;
        f14515e = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = t.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        f14516f = StringsKt.removeSuffix(StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    public static final boolean a(pe.p canReuseConnectionFor, pe.p other) {
        Intrinsics.checkNotNullParameter(canReuseConnectionFor, "$this$canReuseConnectionFor");
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.areEqual(canReuseConnectionFor.f13990e, other.f13990e) && canReuseConnectionFor.f13991f == other.f13991f && Intrinsics.areEqual(canReuseConnectionFor.f13988b, other.f13988b);
    }

    public static final int b(String name, long j10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(name, "name");
        boolean z10 = false;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j10);
                if (millis <= ((long) IntCompanionObject.MAX_VALUE)) {
                    if ((millis != 0 || i10 <= 0) ? true : true) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException(a1.a.l(name, " too small.").toString());
                }
                throw new IllegalArgumentException(a1.a.l(name, " too large.").toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException(a1.a.l(name, " < 0").toString());
    }

    public static final void c(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void d(Closeable closeQuietly) {
        Intrinsics.checkNotNullParameter(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final void e(Socket closeQuietly) {
        Intrinsics.checkNotNullParameter(closeQuietly, "$this$closeQuietly");
        try {
            closeQuietly.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!Intrinsics.areEqual(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final int f(String delimiterOffset, char c10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(delimiterOffset, "$this$delimiterOffset");
        while (i10 < i11) {
            if (delimiterOffset.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int g(String delimiterOffset, String delimiters, int i10, int i11) {
        Intrinsics.checkNotNullParameter(delimiterOffset, "$this$delimiterOffset");
        Intrinsics.checkNotNullParameter(delimiters, "delimiters");
        while (i10 < i11) {
            if (StringsKt.contains$default((CharSequence) delimiters, delimiterOffset.charAt(i10), false, 2, (Object) null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final boolean h(y discard, int i10, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(discard, "$this$discard");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return s(discard, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String i(String format, Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(args, args.length);
        String format2 = String.format(locale, format, Arrays.copyOf(copyOf, copyOf.length));
        Intrinsics.checkNotNullExpressionValue(format2, "java.lang.String.format(locale, format, *args)");
        return format2;
    }

    public static final boolean j(String[] hasIntersection, String[] strArr, Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(hasIntersection, "$this$hasIntersection");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(hasIntersection.length == 0) && strArr != null) {
            if (!(strArr.length == 0)) {
                for (String str : hasIntersection) {
                    for (String str2 : strArr) {
                        if (comparator.compare(str, str2) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long k(pe.y headersContentLength) {
        Intrinsics.checkNotNullParameter(headersContentLength, "$this$headersContentLength");
        String b10 = headersContentLength.f14066t.b("Content-Length");
        if (b10 != null) {
            return w(b10, -1L);
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> l(T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiable…istOf(*elements.clone()))");
        return unmodifiableList;
    }

    public static final int m(String indexOfControlOrNonAscii) {
        Intrinsics.checkNotNullParameter(indexOfControlOrNonAscii, "$this$indexOfControlOrNonAscii");
        int length = indexOfControlOrNonAscii.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = indexOfControlOrNonAscii.charAt(i10);
            if (Intrinsics.compare((int) charAt, 31) <= 0 || Intrinsics.compare((int) charAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int n(String indexOfFirstNonAsciiWhitespace, int i10, int i11) {
        Intrinsics.checkNotNullParameter(indexOfFirstNonAsciiWhitespace, "$this$indexOfFirstNonAsciiWhitespace");
        while (i10 < i11) {
            char charAt = indexOfFirstNonAsciiWhitespace.charAt(i10);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static final int o(String indexOfLastNonAsciiWhitespace, int i10, int i11) {
        Intrinsics.checkNotNullParameter(indexOfLastNonAsciiWhitespace, "$this$indexOfLastNonAsciiWhitespace");
        int i12 = i11 - 1;
        if (i12 >= i10) {
            while (true) {
                char charAt = indexOfLastNonAsciiWhitespace.charAt(i12);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static final String[] p(String[] intersect, String[] other, Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(intersect, "$this$intersect");
        Intrinsics.checkNotNullParameter(other, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : intersect) {
            int length = other.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (comparator.compare(str, other[i10]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i10++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (String[]) array;
    }

    public static final int q(char c10) {
        if ('0' <= c10 && '9' >= c10) {
            return c10 - '0';
        }
        char c11 = 'a';
        if ('a' > c10 || 'f' < c10) {
            c11 = 'A';
            if ('A' > c10 || 'F' < c10) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    public static final int r(h readMedium) {
        Intrinsics.checkNotNullParameter(readMedium, "$this$readMedium");
        return (readMedium.readByte() & UByte.MAX_VALUE) | ((readMedium.readByte() & UByte.MAX_VALUE) << 16) | ((readMedium.readByte() & UByte.MAX_VALUE) << 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
        if (r5 == Long.MAX_VALUE) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
        r11.g().a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
        r11.g().d(r0 + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
        if (r5 != Long.MAX_VALUE) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
        return r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean s(bf.y r11, int r12, java.util.concurrent.TimeUnit r13) {
        /*
            java.lang.String r0 = "$this$skipAll"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "timeUnit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            long r0 = java.lang.System.nanoTime()
            bf.z r2 = r11.g()
            boolean r2 = r2.e()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L27
            bf.z r2 = r11.g()
            long r5 = r2.c()
            long r5 = r5 - r0
            goto L28
        L27:
            r5 = r3
        L28:
            bf.z r2 = r11.g()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.d(r12)
            bf.f r12 = new bf.f     // Catch: java.lang.Throwable -> L66 java.io.InterruptedIOException -> L7c
            r12.<init>()     // Catch: java.lang.Throwable -> L66 java.io.InterruptedIOException -> L7c
        L3e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.O(r12, r7)     // Catch: java.lang.Throwable -> L66 java.io.InterruptedIOException -> L7c
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L50
            long r7 = r12.f3669f     // Catch: java.lang.Throwable -> L66 java.io.InterruptedIOException -> L7c
            r12.l(r7)     // Catch: java.lang.Throwable -> L66 java.io.InterruptedIOException -> L7c
            goto L3e
        L50:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5d
        L55:
            bf.z r11 = r11.g()
            r11.a()
            goto L83
        L5d:
            bf.z r11 = r11.g()
            long r0 = r0 + r5
            r11.d(r0)
            goto L83
        L66:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L73
            bf.z r11 = r11.g()
            r11.a()
            goto L7b
        L73:
            bf.z r11 = r11.g()
            long r0 = r0 + r5
            r11.d(r0)
        L7b:
            throw r12
        L7c:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L5d
            goto L55
        L83:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.c.s(bf.y, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static final o t(List<we.a> toHeaders) {
        Intrinsics.checkNotNullParameter(toHeaders, "$this$toHeaders");
        ArrayList arrayList = new ArrayList(20);
        for (we.a aVar : toHeaders) {
            ByteString byteString = aVar.f17469b;
            ByteString byteString2 = aVar.f17470c;
            String name = byteString.m();
            String value = byteString2.m();
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            arrayList.add(name);
            arrayList.add(StringsKt.trim((CharSequence) value).toString());
        }
        Object[] array = arrayList.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return new o((String[]) array, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String u(pe.p r5, boolean r6) {
        /*
            java.lang.String r0 = "$this$toHostHeader"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = r5.f13990e
            r1 = 0
            r2 = 2
            r3 = 0
            java.lang.String r4 = ":"
            boolean r0 = kotlin.text.StringsKt.contains$default(r0, r4, r1, r2, r3)
            if (r0 == 0) goto L21
            r0 = 91
            java.lang.StringBuilder r0 = a0.a.m(r0)
            java.lang.String r1 = r5.f13990e
            r2 = 93
            java.lang.String r0 = android.support.v4.media.b.l(r0, r1, r2)
            goto L23
        L21:
            java.lang.String r0 = r5.f13990e
        L23:
            if (r6 != 0) goto L56
            int r6 = r5.f13991f
            java.lang.String r1 = r5.f13988b
            java.lang.String r2 = "scheme"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            int r2 = r1.hashCode()
            r3 = 3213448(0x310888, float:4.503E-39)
            if (r2 == r3) goto L48
            r3 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r2 == r3) goto L3d
            goto L53
        L3d:
            java.lang.String r2 = "https"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L53
            r1 = 443(0x1bb, float:6.21E-43)
            goto L54
        L48:
            java.lang.String r2 = "http"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L53
            r1 = 80
            goto L54
        L53:
            r1 = -1
        L54:
            if (r6 == r1) goto L6c
        L56:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r0)
            r0 = 58
            r6.append(r0)
            int r5 = r5.f13991f
            r6.append(r5)
            java.lang.String r0 = r6.toString()
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.c.u(pe.p, boolean):java.lang.String");
    }

    public static final <T> List<T> v(List<? extends T> toImmutableList) {
        Intrinsics.checkNotNullParameter(toImmutableList, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(CollectionsKt.toMutableList((Collection) toImmutableList));
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    public static final long w(String toLongOrDefault, long j10) {
        Intrinsics.checkNotNullParameter(toLongOrDefault, "$this$toLongOrDefault");
        try {
            return Long.parseLong(toLongOrDefault);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int x(String str, int i10) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > ((long) IntCompanionObject.MAX_VALUE)) {
                    return IntCompanionObject.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String y(String trimSubstring, int i10, int i11) {
        Intrinsics.checkNotNullParameter(trimSubstring, "$this$trimSubstring");
        int n = n(trimSubstring, i10, i11);
        String substring = trimSubstring.substring(n, o(trimSubstring, n, i11));
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    public static final Throwable z(Exception withSuppressed, List<? extends Exception> suppressed) {
        Intrinsics.checkNotNullParameter(withSuppressed, "$this$withSuppressed");
        Intrinsics.checkNotNullParameter(suppressed, "suppressed");
        if (suppressed.size() > 1) {
            System.out.println(suppressed);
        }
        for (Exception exc : suppressed) {
            ExceptionsKt.addSuppressed(withSuppressed, exc);
        }
        return withSuppressed;
    }
}
