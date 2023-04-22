package cf;

import bf.f;
import bf.u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f4100a;

    static {
        Intrinsics.checkNotNullParameter("0123456789abcdef", "$this$asUtf8ToByteArray");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        f4100a = bytes;
    }

    public static final boolean a(u segment, int i10, byte[] bytes, int i11, int i12) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i13 = segment.f3704c;
        byte[] bArr = segment.f3702a;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.f3706f;
                Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.f3702a;
                bArr = bArr2;
                i10 = segment.f3703b;
                i13 = segment.f3704c;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String b(f readUtf8Line, long j10) {
        Intrinsics.checkNotNullParameter(readUtf8Line, "$this$readUtf8Line");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (readUtf8Line.f(j11) == ((byte) 13)) {
                String F = readUtf8Line.F(j11);
                readUtf8Line.l(2L);
                return F;
            }
        }
        String F2 = readUtf8Line.F(j10);
        readUtf8Line.l(1L);
        return F2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r19 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(bf.f r17, bf.p r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cf.a.c(bf.f, bf.p, boolean):int");
    }
}
