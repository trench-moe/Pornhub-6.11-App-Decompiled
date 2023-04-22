package we;

import bf.y;
import com.appsflyer.oaid.BuildConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.collections.ArraysKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import we.o;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final we.a[] f17471a;

    /* renamed from: b  reason: collision with root package name */
    public static final Map<ByteString, Integer> f17472b;

    /* renamed from: c  reason: collision with root package name */
    public static final b f17473c = new b();

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<we.a> f17474a;

        /* renamed from: b  reason: collision with root package name */
        public final bf.h f17475b;
        @JvmField

        /* renamed from: c  reason: collision with root package name */
        public we.a[] f17476c;
        public int d;
        @JvmField

        /* renamed from: e  reason: collision with root package name */
        public int f17477e;
        @JvmField

        /* renamed from: f  reason: collision with root package name */
        public int f17478f;

        /* renamed from: g  reason: collision with root package name */
        public final int f17479g;

        /* renamed from: h  reason: collision with root package name */
        public int f17480h;

        public a(y source, int i10, int i11, int i12) {
            i11 = (i12 & 4) != 0 ? i10 : i11;
            Intrinsics.checkNotNullParameter(source, "source");
            this.f17479g = i10;
            this.f17480h = i11;
            this.f17474a = new ArrayList();
            this.f17475b = cb.e.o(source);
            this.f17476c = new we.a[8];
            this.d = 7;
        }

        public final void a() {
            ArraysKt.fill$default(this.f17476c, (Object) null, 0, 0, 6, (Object) null);
            this.d = this.f17476c.length - 1;
            this.f17477e = 0;
            this.f17478f = 0;
        }

        public final int b(int i10) {
            return this.d + 1 + i10;
        }

        public final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f17476c.length;
                while (true) {
                    length--;
                    i11 = this.d;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    we.a aVar = this.f17476c[length];
                    Intrinsics.checkNotNull(aVar);
                    int i13 = aVar.f17468a;
                    i10 -= i13;
                    this.f17478f -= i13;
                    this.f17477e--;
                    i12++;
                }
                we.a[] aVarArr = this.f17476c;
                System.arraycopy(aVarArr, i11 + 1, aVarArr, i11 + 1 + i12, this.f17477e);
                this.d += i12;
            }
            return i12;
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okio.ByteString d(int r4) {
            /*
                r3 = this;
                if (r4 < 0) goto Ld
                we.b r0 = we.b.f17473c
                we.a[] r0 = we.b.f17471a
                int r0 = r0.length
                int r0 = r0 + (-1)
                if (r4 > r0) goto Ld
                r0 = 1
                goto Le
            Ld:
                r0 = 0
            Le:
                if (r0 == 0) goto L19
                we.b r0 = we.b.f17473c
                we.a[] r0 = we.b.f17471a
                r4 = r0[r4]
                okio.ByteString r4 = r4.f17469b
                goto L32
            L19:
                we.b r0 = we.b.f17473c
                we.a[] r0 = we.b.f17471a
                int r0 = r0.length
                int r0 = r4 - r0
                int r0 = r3.b(r0)
                if (r0 < 0) goto L33
                we.a[] r1 = r3.f17476c
                int r2 = r1.length
                if (r0 >= r2) goto L33
                r4 = r1[r0]
                kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
                okio.ByteString r4 = r4.f17469b
            L32:
                return r4
            L33:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "Header index too large "
                java.lang.StringBuilder r1 = a1.a.m(r1)
                int r4 = r4 + 1
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: we.b.a.d(int):okio.ByteString");
        }

        public final void e(int i10, we.a aVar) {
            this.f17474a.add(aVar);
            int i11 = aVar.f17468a;
            if (i10 != -1) {
                we.a aVar2 = this.f17476c[this.d + 1 + i10];
                Intrinsics.checkNotNull(aVar2);
                i11 -= aVar2.f17468a;
            }
            int i12 = this.f17480h;
            if (i11 > i12) {
                a();
                return;
            }
            int c10 = c((this.f17478f + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f17477e + 1;
                we.a[] aVarArr = this.f17476c;
                if (i13 > aVarArr.length) {
                    we.a[] aVarArr2 = new we.a[aVarArr.length * 2];
                    System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                    this.d = this.f17476c.length - 1;
                    this.f17476c = aVarArr2;
                }
                int i14 = this.d;
                this.d = i14 - 1;
                this.f17476c[i14] = aVar;
                this.f17477e++;
            } else {
                this.f17476c[this.d + 1 + i10 + c10 + i10] = aVar;
            }
            this.f17478f += i11;
        }

        public final ByteString f() {
            byte readByte = this.f17475b.readByte();
            byte[] bArr = qe.c.f14512a;
            int i10 = readByte & UByte.MAX_VALUE;
            int i11 = 0;
            boolean z10 = (i10 & 128) == 128;
            long g10 = g(i10, 127);
            if (z10) {
                bf.f sink = new bf.f();
                o oVar = o.d;
                bf.h source = this.f17475b;
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(sink, "sink");
                o.a aVar = o.f17594c;
                int i12 = 0;
                for (long j10 = 0; j10 < g10; j10++) {
                    byte readByte2 = source.readByte();
                    byte[] bArr2 = qe.c.f14512a;
                    i11 = (i11 << 8) | (readByte2 & UByte.MAX_VALUE);
                    i12 += 8;
                    while (i12 >= 8) {
                        int i13 = i12 - 8;
                        int i14 = (i11 >>> i13) & KotlinVersion.MAX_COMPONENT_VALUE;
                        o.a[] aVarArr = aVar.f17595a;
                        Intrinsics.checkNotNull(aVarArr);
                        aVar = aVarArr[i14];
                        Intrinsics.checkNotNull(aVar);
                        if (aVar.f17595a == null) {
                            sink.i0(aVar.f17596b);
                            i12 -= aVar.f17597c;
                            aVar = o.f17594c;
                        } else {
                            i12 = i13;
                        }
                    }
                }
                while (i12 > 0) {
                    int i15 = (i11 << (8 - i12)) & KotlinVersion.MAX_COMPONENT_VALUE;
                    o.a[] aVarArr2 = aVar.f17595a;
                    Intrinsics.checkNotNull(aVarArr2);
                    o.a aVar2 = aVarArr2[i15];
                    Intrinsics.checkNotNull(aVar2);
                    if (aVar2.f17595a != null || aVar2.f17597c > i12) {
                        break;
                    }
                    sink.i0(aVar2.f17596b);
                    i12 -= aVar2.f17597c;
                    aVar = o.f17594c;
                }
                return sink.t();
            }
            return this.f17475b.r(g10);
        }

        public final int g(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                byte readByte = this.f17475b.readByte();
                byte[] bArr = qe.c.f14512a;
                int i14 = readByte & UByte.MAX_VALUE;
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }
    }

    /* renamed from: we.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0287b {

        /* renamed from: a  reason: collision with root package name */
        public int f17481a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f17482b;
        @JvmField

        /* renamed from: c  reason: collision with root package name */
        public int f17483c;
        @JvmField
        public we.a[] d;

        /* renamed from: e  reason: collision with root package name */
        public int f17484e;
        @JvmField

        /* renamed from: f  reason: collision with root package name */
        public int f17485f;
        @JvmField

        /* renamed from: g  reason: collision with root package name */
        public int f17486g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f17487h;

        /* renamed from: i  reason: collision with root package name */
        public final bf.f f17488i;

        public C0287b(int i10, boolean z10, bf.f out, int i11) {
            i10 = (i11 & 1) != 0 ? ConstantsKt.DEFAULT_BLOCK_SIZE : i10;
            z10 = (i11 & 2) != 0 ? true : z10;
            Intrinsics.checkNotNullParameter(out, "out");
            this.f17487h = z10;
            this.f17488i = out;
            this.f17481a = IntCompanionObject.MAX_VALUE;
            this.f17483c = i10;
            this.d = new we.a[8];
            this.f17484e = 7;
        }

        public final void a() {
            ArraysKt.fill$default(this.d, (Object) null, 0, 0, 6, (Object) null);
            this.f17484e = this.d.length - 1;
            this.f17485f = 0;
            this.f17486g = 0;
        }

        public final int b(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.d.length;
                while (true) {
                    length--;
                    i11 = this.f17484e;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    we.a aVar = this.d[length];
                    Intrinsics.checkNotNull(aVar);
                    i10 -= aVar.f17468a;
                    int i13 = this.f17486g;
                    we.a aVar2 = this.d[length];
                    Intrinsics.checkNotNull(aVar2);
                    this.f17486g = i13 - aVar2.f17468a;
                    this.f17485f--;
                    i12++;
                }
                we.a[] aVarArr = this.d;
                System.arraycopy(aVarArr, i11 + 1, aVarArr, i11 + 1 + i12, this.f17485f);
                we.a[] aVarArr2 = this.d;
                int i14 = this.f17484e;
                Arrays.fill(aVarArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f17484e += i12;
            }
            return i12;
        }

        public final void c(we.a aVar) {
            int i10 = aVar.f17468a;
            int i11 = this.f17483c;
            if (i10 > i11) {
                a();
                return;
            }
            b((this.f17486g + i10) - i11);
            int i12 = this.f17485f + 1;
            we.a[] aVarArr = this.d;
            if (i12 > aVarArr.length) {
                we.a[] aVarArr2 = new we.a[aVarArr.length * 2];
                System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                this.f17484e = this.d.length - 1;
                this.d = aVarArr2;
            }
            int i13 = this.f17484e;
            this.f17484e = i13 - 1;
            this.d[i13] = aVar;
            this.f17485f++;
            this.f17486g += i10;
        }

        public final void d(ByteString source) {
            Intrinsics.checkNotNullParameter(source, "data");
            int i10 = 0;
            if (this.f17487h) {
                o oVar = o.d;
                Intrinsics.checkNotNullParameter(source, "bytes");
                int f10 = source.f();
                long j10 = 0;
                for (int i11 = 0; i11 < f10; i11++) {
                    byte i12 = source.i(i11);
                    byte[] bArr = qe.c.f14512a;
                    j10 += o.f17593b[i12 & UByte.MAX_VALUE];
                }
                if (((int) ((j10 + 7) >> 3)) < source.f()) {
                    bf.f sink = new bf.f();
                    o oVar2 = o.d;
                    Intrinsics.checkNotNullParameter(source, "source");
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    int f11 = source.f();
                    long j11 = 0;
                    byte b10 = 0;
                    while (i10 < f11) {
                        byte i13 = source.i(i10);
                        byte[] bArr2 = qe.c.f14512a;
                        int i14 = i13 & UByte.MAX_VALUE;
                        int i15 = o.f17592a[i14];
                        byte b11 = o.f17593b[i14];
                        j11 = (j11 << b11) | i15;
                        int i16 = b10 + b11;
                        while (i16 >= 8) {
                            i16 = (i16 == 1 ? 1 : 0) - 8;
                            sink.D((int) (j11 >> i16));
                        }
                        i10++;
                        b10 = i16;
                    }
                    if (b10 > 0) {
                        sink.D((int) ((255 >>> b10) | (j11 << (8 - b10))));
                    }
                    ByteString t2 = sink.t();
                    f(t2.f(), 127, 128);
                    this.f17488i.Y(t2);
                    return;
                }
            }
            f(source.f(), 127, 0);
            this.f17488i.Y(source);
        }

        public final void e(List<we.a> headerBlock) {
            int i10;
            int i11;
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f17482b) {
                int i12 = this.f17481a;
                if (i12 < this.f17483c) {
                    f(i12, 31, 32);
                }
                this.f17482b = false;
                this.f17481a = IntCompanionObject.MAX_VALUE;
                f(this.f17483c, 31, 32);
            }
            int size = headerBlock.size();
            for (int i13 = 0; i13 < size; i13++) {
                we.a aVar = headerBlock.get(i13);
                ByteString l10 = aVar.f17469b.l();
                ByteString byteString = aVar.f17470c;
                b bVar = b.f17473c;
                Integer num = b.f17472b.get(l10);
                if (num != null) {
                    i10 = num.intValue() + 1;
                    if (2 <= i10 && 7 >= i10) {
                        we.a[] aVarArr = b.f17471a;
                        if (Intrinsics.areEqual(aVarArr[i10 - 1].f17470c, byteString)) {
                            i11 = i10;
                        } else if (Intrinsics.areEqual(aVarArr[i10].f17470c, byteString)) {
                            i11 = i10;
                            i10++;
                        }
                    }
                    i11 = i10;
                    i10 = -1;
                } else {
                    i10 = -1;
                    i11 = -1;
                }
                if (i10 == -1) {
                    int i14 = this.f17484e + 1;
                    int length = this.d.length;
                    while (true) {
                        if (i14 >= length) {
                            break;
                        }
                        we.a aVar2 = this.d[i14];
                        Intrinsics.checkNotNull(aVar2);
                        if (Intrinsics.areEqual(aVar2.f17469b, l10)) {
                            we.a aVar3 = this.d[i14];
                            Intrinsics.checkNotNull(aVar3);
                            if (Intrinsics.areEqual(aVar3.f17470c, byteString)) {
                                int i15 = i14 - this.f17484e;
                                b bVar2 = b.f17473c;
                                i10 = b.f17471a.length + i15;
                                break;
                            } else if (i11 == -1) {
                                b bVar3 = b.f17473c;
                                i11 = (i14 - this.f17484e) + b.f17471a.length;
                            }
                        }
                        i14++;
                    }
                }
                if (i10 != -1) {
                    f(i10, 127, 128);
                } else if (i11 == -1) {
                    this.f17488i.i0(64);
                    d(l10);
                    d(byteString);
                    c(aVar);
                } else {
                    ByteString prefix = we.a.d;
                    Objects.requireNonNull(l10);
                    Intrinsics.checkNotNullParameter(prefix, "prefix");
                    if (l10.j(0, prefix, 0, prefix.f()) && (!Intrinsics.areEqual(we.a.f17467i, l10))) {
                        f(i11, 15, 0);
                        d(byteString);
                    } else {
                        f(i11, 63, 64);
                        d(byteString);
                        c(aVar);
                    }
                }
            }
        }

        public final void f(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f17488i.i0(i10 | i12);
                return;
            }
            this.f17488i.i0(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f17488i.i0(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f17488i.i0(i13);
        }
    }

    static {
        we.a aVar = new we.a(we.a.f17467i, BuildConfig.FLAVOR);
        ByteString byteString = we.a.f17464f;
        ByteString byteString2 = we.a.f17465g;
        ByteString byteString3 = we.a.f17466h;
        ByteString byteString4 = we.a.f17463e;
        we.a[] aVarArr = {aVar, new we.a(byteString, "GET"), new we.a(byteString, "POST"), new we.a(byteString2, "/"), new we.a(byteString2, "/index.html"), new we.a(byteString3, "http"), new we.a(byteString3, "https"), new we.a(byteString4, "200"), new we.a(byteString4, "204"), new we.a(byteString4, "206"), new we.a(byteString4, "304"), new we.a(byteString4, "400"), new we.a(byteString4, "404"), new we.a(byteString4, "500"), new we.a("accept-charset", BuildConfig.FLAVOR), new we.a("accept-encoding", "gzip, deflate"), new we.a("accept-language", BuildConfig.FLAVOR), new we.a("accept-ranges", BuildConfig.FLAVOR), new we.a("accept", BuildConfig.FLAVOR), new we.a("access-control-allow-origin", BuildConfig.FLAVOR), new we.a("age", BuildConfig.FLAVOR), new we.a("allow", BuildConfig.FLAVOR), new we.a("authorization", BuildConfig.FLAVOR), new we.a("cache-control", BuildConfig.FLAVOR), new we.a("content-disposition", BuildConfig.FLAVOR), new we.a("content-encoding", BuildConfig.FLAVOR), new we.a("content-language", BuildConfig.FLAVOR), new we.a("content-length", BuildConfig.FLAVOR), new we.a("content-location", BuildConfig.FLAVOR), new we.a("content-range", BuildConfig.FLAVOR), new we.a("content-type", BuildConfig.FLAVOR), new we.a("cookie", BuildConfig.FLAVOR), new we.a("date", BuildConfig.FLAVOR), new we.a("etag", BuildConfig.FLAVOR), new we.a("expect", BuildConfig.FLAVOR), new we.a("expires", BuildConfig.FLAVOR), new we.a("from", BuildConfig.FLAVOR), new we.a("host", BuildConfig.FLAVOR), new we.a("if-match", BuildConfig.FLAVOR), new we.a("if-modified-since", BuildConfig.FLAVOR), new we.a("if-none-match", BuildConfig.FLAVOR), new we.a("if-range", BuildConfig.FLAVOR), new we.a("if-unmodified-since", BuildConfig.FLAVOR), new we.a("last-modified", BuildConfig.FLAVOR), new we.a("link", BuildConfig.FLAVOR), new we.a("location", BuildConfig.FLAVOR), new we.a("max-forwards", BuildConfig.FLAVOR), new we.a("proxy-authenticate", BuildConfig.FLAVOR), new we.a("proxy-authorization", BuildConfig.FLAVOR), new we.a("range", BuildConfig.FLAVOR), new we.a("referer", BuildConfig.FLAVOR), new we.a("refresh", BuildConfig.FLAVOR), new we.a("retry-after", BuildConfig.FLAVOR), new we.a("server", BuildConfig.FLAVOR), new we.a("set-cookie", BuildConfig.FLAVOR), new we.a("strict-transport-security", BuildConfig.FLAVOR), new we.a("transfer-encoding", BuildConfig.FLAVOR), new we.a("user-agent", BuildConfig.FLAVOR), new we.a("vary", BuildConfig.FLAVOR), new we.a("via", BuildConfig.FLAVOR), new we.a("www-authenticate", BuildConfig.FLAVOR)};
        f17471a = aVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(aVarArr.length);
        int length = aVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            we.a[] aVarArr2 = f17471a;
            if (!linkedHashMap.containsKey(aVarArr2[i10].f17469b)) {
                linkedHashMap.put(aVarArr2[i10].f17469b, Integer.valueOf(i10));
            }
        }
        Map<ByteString, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "Collections.unmodifiableMap(result)");
        f17472b = unmodifiableMap;
    }

    public final ByteString a(ByteString name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int f10 = name.f();
        for (int i10 = 0; i10 < f10; i10++) {
            byte b10 = (byte) 65;
            byte b11 = (byte) 90;
            byte i11 = name.i(i10);
            if (b10 <= i11 && b11 >= i11) {
                StringBuilder m10 = a1.a.m("PROTOCOL_ERROR response malformed: mixed case name: ");
                m10.append(name.m());
                throw new IOException(m10.toString());
            }
        }
        return name;
    }
}
