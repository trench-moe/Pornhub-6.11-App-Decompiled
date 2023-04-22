package kotlin.internal;

import com.app.pornhub.domain.config.DvdsConfig;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UnsignedKt;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a*\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0006\u001a*\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", DvdsConfig.TYPE_CATEGORY, "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", BuildConfig.FLAVOR, "getProgressionLastElement-Nkh28Cs", BuildConfig.FLAVOR, "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA  reason: not valid java name */
    private static final int m1204differenceModuloWZ9TVnA(int i10, int i11, int i12) {
        int m364uintRemainderJ1ME1BU = UnsignedKt.m364uintRemainderJ1ME1BU(i10, i12);
        int m364uintRemainderJ1ME1BU2 = UnsignedKt.m364uintRemainderJ1ME1BU(i11, i12);
        int uintCompare = UnsignedKt.uintCompare(m364uintRemainderJ1ME1BU, m364uintRemainderJ1ME1BU2);
        int m110constructorimpl = UInt.m110constructorimpl(m364uintRemainderJ1ME1BU - m364uintRemainderJ1ME1BU2);
        return uintCompare >= 0 ? m110constructorimpl : UInt.m110constructorimpl(m110constructorimpl + i12);
    }

    /* renamed from: differenceModulo-sambcqE  reason: not valid java name */
    private static final long m1205differenceModulosambcqE(long j10, long j11, long j12) {
        long m366ulongRemaindereb3DHEI = UnsignedKt.m366ulongRemaindereb3DHEI(j10, j12);
        long m366ulongRemaindereb3DHEI2 = UnsignedKt.m366ulongRemaindereb3DHEI(j11, j12);
        int ulongCompare = UnsignedKt.ulongCompare(m366ulongRemaindereb3DHEI, m366ulongRemaindereb3DHEI2);
        long m188constructorimpl = ULong.m188constructorimpl(m366ulongRemaindereb3DHEI - m366ulongRemaindereb3DHEI2);
        return ulongCompare >= 0 ? m188constructorimpl : ULong.m188constructorimpl(m188constructorimpl + j12);
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-7ftBX0g  reason: not valid java name */
    public static final long m1206getProgressionLastElement7ftBX0g(long j10, long j11, long j12) {
        int i10 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        if (i10 > 0) {
            return UnsignedKt.ulongCompare(j10, j11) >= 0 ? j11 : ULong.m188constructorimpl(j11 - m1205differenceModulosambcqE(j11, j10, ULong.m188constructorimpl(j12)));
        } else if (i10 < 0) {
            return UnsignedKt.ulongCompare(j10, j11) <= 0 ? j11 : ULong.m188constructorimpl(j11 + m1205differenceModulosambcqE(j10, j11, ULong.m188constructorimpl(-j12)));
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    /* renamed from: getProgressionLastElement-Nkh28Cs  reason: not valid java name */
    public static final int m1207getProgressionLastElementNkh28Cs(int i10, int i11, int i12) {
        if (i12 > 0) {
            return UnsignedKt.uintCompare(i10, i11) >= 0 ? i11 : UInt.m110constructorimpl(i11 - m1204differenceModuloWZ9TVnA(i11, i10, UInt.m110constructorimpl(i12)));
        } else if (i12 < 0) {
            return UnsignedKt.uintCompare(i10, i11) <= 0 ? i11 : UInt.m110constructorimpl(i11 + m1204differenceModuloWZ9TVnA(i10, i11, UInt.m110constructorimpl(-i12)));
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }
}
