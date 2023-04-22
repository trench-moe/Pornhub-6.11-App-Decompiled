package okhttp3.internal.publicsuffix;

import bf.h;
import bf.l;
import cb.e;
import com.appsflyer.oaid.BuildConfig;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import qe.c;

@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", BuildConfig.FLAVOR, "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class PublicSuffixDatabase {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f13716a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f13717b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f13718c;
    public byte[] d;

    /* renamed from: h  reason: collision with root package name */
    public static final a f13715h = new a(null);

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f13712e = {(byte) 42};

    /* renamed from: f  reason: collision with root package name */
    public static final List<String> f13713f = CollectionsKt.listOf("*");

    /* renamed from: g  reason: collision with root package name */
    public static final PublicSuffixDatabase f13714g = new PublicSuffixDatabase();

    /* loaded from: classes3.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final String a(a aVar, byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            boolean z10;
            int i12;
            int i13;
            int length = bArr.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = (i14 + length) / 2;
                while (i15 > -1 && bArr[i15] != ((byte) 10)) {
                    i15--;
                }
                int i16 = i15 + 1;
                int i17 = 1;
                while (true) {
                    i11 = i16 + i17;
                    if (bArr[i11] == ((byte) 10)) {
                        break;
                    }
                    i17++;
                }
                int i18 = i11 - i16;
                int i19 = i10;
                boolean z11 = false;
                int i20 = 0;
                int i21 = 0;
                while (true) {
                    if (z11) {
                        i12 = 46;
                        z10 = false;
                    } else {
                        byte b10 = bArr2[i19][i20];
                        byte[] bArr3 = c.f14512a;
                        int i22 = b10 & UByte.MAX_VALUE;
                        z10 = z11;
                        i12 = i22;
                    }
                    byte b11 = bArr[i16 + i21];
                    byte[] bArr4 = c.f14512a;
                    i13 = i12 - (b11 & UByte.MAX_VALUE);
                    if (i13 != 0) {
                        break;
                    }
                    i21++;
                    i20++;
                    if (i21 == i18) {
                        break;
                    } else if (bArr2[i19].length != i20) {
                        z11 = z10;
                    } else if (i19 == bArr2.length - 1) {
                        break;
                    } else {
                        i19++;
                        z11 = true;
                        i20 = -1;
                    }
                }
                if (i13 >= 0) {
                    if (i13 <= 0) {
                        int i23 = i18 - i21;
                        int length2 = bArr2[i19].length - i20;
                        int length3 = bArr2.length;
                        for (int i24 = i19 + 1; i24 < length3; i24++) {
                            length2 += bArr2[i24].length;
                        }
                        if (length2 >= i23) {
                            if (length2 <= i23) {
                                Charset UTF_8 = StandardCharsets.UTF_8;
                                Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                                return new String(bArr, i16, i18, UTF_8);
                            }
                        }
                    }
                    i14 = i11 + 1;
                }
                length = i16 - 1;
            }
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r6 == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r6 != false) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.a(java.lang.String):java.lang.String");
    }

    public final void b() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream == null) {
            return;
        }
        h o10 = e.o(new l(e.d0(resourceAsStream)));
        try {
            byte[] b02 = o10.b0(o10.readInt());
            byte[] b03 = o10.b0(o10.readInt());
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(o10, null);
            synchronized (this) {
                Intrinsics.checkNotNull(b02);
                this.f13718c = b02;
                Intrinsics.checkNotNull(b03);
                this.d = b03;
            }
            this.f13717b.countDown();
        } finally {
        }
    }

    public final List<String> c(String str) {
        List<String> split$default = StringsKt.split$default((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null);
        return Intrinsics.areEqual((String) CollectionsKt.last((List<? extends Object>) split$default), BuildConfig.FLAVOR) ? CollectionsKt.dropLast(split$default, 1) : split$default;
    }
}
