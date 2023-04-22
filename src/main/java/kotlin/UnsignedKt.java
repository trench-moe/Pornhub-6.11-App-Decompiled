package kotlin;

import com.appsflyer.oaid.BuildConfig;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import l.InterfaceC0186;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0004\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0001ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0001\u001a\"\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\"\u0010\u000f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\tH\u0001\u001a\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0013H\u0001\u001a\"\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\"\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0013H\u0001\u001a\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0013H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\tH\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"doubleToUInt", "Lkotlin/UInt;", "v", BuildConfig.FLAVOR, "(D)I", "doubleToULong", "Lkotlin/ULong;", "(D)J", "uintCompare", BuildConfig.FLAVOR, "v1", "v2", "uintDivide", "uintDivide-J1ME1BU", "(II)I", "uintRemainder", "uintRemainder-J1ME1BU", "uintToDouble", "ulongCompare", BuildConfig.FLAVOR, "ulongDivide", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "ulongToDouble", "ulongToString", BuildConfig.FLAVOR, "base", "kotlin-stdlib"}, k = 2, mv = {1, 6, 0}, xi = 48)
@JvmName(name = "UnsignedKt")
/* loaded from: classes2.dex */
public final class UnsignedKt {
    @PublishedApi
    public static final int doubleToUInt(double d) {
        if (!Double.isNaN(d) && d > uintToDouble(0)) {
            if (d >= uintToDouble(-1)) {
                return -1;
            }
            if (d <= 2.147483647E9d) {
                return UInt.m110constructorimpl((int) d);
            }
            return UInt.m110constructorimpl(UInt.m110constructorimpl(IntCompanionObject.MAX_VALUE) + UInt.m110constructorimpl((int) (d - ((double) IntCompanionObject.MAX_VALUE))));
        }
        return 0;
    }

    @PublishedApi
    public static final long doubleToULong(double d) {
        if (!Double.isNaN(d) && d > ulongToDouble(0L)) {
            if (d >= ulongToDouble(-1L)) {
                return -1L;
            }
            return d < 9.223372036854776E18d ? ULong.m188constructorimpl((long) d) : ULong.m188constructorimpl(ULong.m188constructorimpl((long) (d - 9.223372036854776E18d)) - Long.MIN_VALUE);
        }
        return 0L;
    }

    @PublishedApi
    public static final int uintCompare(int i10, int i11) {
        return Intrinsics.compare(i10 ^ IntCompanionObject.MIN_VALUE, i11 ^ IntCompanionObject.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: uintDivide-J1ME1BU  reason: not valid java name */
    public static final int m363uintDivideJ1ME1BU(int i10, int i11) {
        return UInt.m110constructorimpl((int) ((i10 & 4294967295L) / (i11 & 4294967295L)));
    }

    @PublishedApi
    /* renamed from: uintRemainder-J1ME1BU  reason: not valid java name */
    public static final int m364uintRemainderJ1ME1BU(int i10, int i11) {
        return UInt.m110constructorimpl((int) ((i10 & 4294967295L) % (i11 & 4294967295L)));
    }

    @PublishedApi
    public static final double uintToDouble(int i10) {
        return (((i10 >>> 31) << 30) * 2) + (Integer.MAX_VALUE & i10);
    }

    @PublishedApi
    public static final int ulongCompare(long j10, long j11) {
        return Intrinsics.compare(j10 ^ Long.MIN_VALUE, j11 ^ Long.MIN_VALUE);
    }

    @PublishedApi
    /* renamed from: ulongDivide-eb3DHEI  reason: not valid java name */
    public static final long m365ulongDivideeb3DHEI(long j10, long j11) {
        if (j11 < 0) {
            return ulongCompare(j10, j11) < 0 ? ULong.m188constructorimpl(0L) : ULong.m188constructorimpl(1L);
        } else if (j10 >= 0) {
            return ULong.m188constructorimpl(j10 / j11);
        } else {
            long j12 = ((j10 >>> 1) / j11) << 1;
            return ULong.m188constructorimpl(j12 + (ulongCompare(ULong.m188constructorimpl(j10 - (j12 * j11)), ULong.m188constructorimpl(j11)) < 0 ? 0 : 1));
        }
    }

    @PublishedApi
    /* renamed from: ulongRemainder-eb3DHEI  reason: not valid java name */
    public static final long m366ulongRemaindereb3DHEI(long j10, long j11) {
        if (j11 < 0) {
            return ulongCompare(j10, j11) < 0 ? j10 : ULong.m188constructorimpl(j10 - j11);
        } else if (j10 >= 0) {
            return ULong.m188constructorimpl(j10 % j11);
        } else {
            long j12 = j10 - ((((j10 >>> 1) / j11) << 1) * j11);
            if (ulongCompare(ULong.m188constructorimpl(j12), ULong.m188constructorimpl(j11)) < 0) {
                j11 = 0;
            }
            return ULong.m188constructorimpl(j12 - j11);
        }
    }

    @PublishedApi
    public static final double ulongToDouble(long j10) {
        return ((j10 >>> 11) * ((double) InterfaceC0186.f43)) + (j10 & 2047);
    }

    public static final String ulongToString(long j10) {
        return ulongToString(j10, 10);
    }

    public static final String ulongToString(long j10, int i10) {
        if (j10 >= 0) {
            String l10 = Long.toString(j10, CharsKt.checkRadix(i10));
            Intrinsics.checkNotNullExpressionValue(l10, "toString(this, checkRadix(radix))");
            return l10;
        }
        long j11 = i10;
        long j12 = ((j10 >>> 1) / j11) << 1;
        long j13 = j10 - (j12 * j11);
        if (j13 >= j11) {
            j13 -= j11;
            j12++;
        }
        String l11 = Long.toString(j12, CharsKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(l11, "toString(this, checkRadix(radix))");
        String l12 = Long.toString(j13, CharsKt.checkRadix(i10));
        Intrinsics.checkNotNullExpressionValue(l12, "toString(this, checkRadix(radix))");
        return Intrinsics.stringPlus(l11, l12);
    }
}
