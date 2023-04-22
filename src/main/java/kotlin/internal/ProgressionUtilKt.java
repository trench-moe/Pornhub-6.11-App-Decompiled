package kotlin.internal;

import com.app.pornhub.domain.config.DvdsConfig;
import com.appsflyer.oaid.BuildConfig;
import kotlin.Metadata;
import kotlin.PublishedApi;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a \u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0001H\u0001\u001a \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0001\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0002¨\u0006\u000b"}, d2 = {"differenceModulo", BuildConfig.FLAVOR, "a", "b", DvdsConfig.TYPE_CATEGORY, BuildConfig.FLAVOR, "getProgressionLastElement", "start", "end", "step", "mod", "kotlin-stdlib"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProgressionUtilKt {
    private static final int differenceModulo(int i10, int i11, int i12) {
        return mod(mod(i10, i12) - mod(i11, i12), i12);
    }

    private static final long differenceModulo(long j10, long j11, long j12) {
        return mod(mod(j10, j12) - mod(j11, j12), j12);
    }

    @PublishedApi
    public static final int getProgressionLastElement(int i10, int i11, int i12) {
        if (i12 > 0) {
            return i10 >= i11 ? i11 : i11 - differenceModulo(i11, i10, i12);
        } else if (i12 < 0) {
            return i10 <= i11 ? i11 : i11 + differenceModulo(i10, i11, -i12);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    @PublishedApi
    public static final long getProgressionLastElement(long j10, long j11, long j12) {
        int i10 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
        if (i10 > 0) {
            return j10 >= j11 ? j11 : j11 - differenceModulo(j11, j10, j12);
        } else if (i10 < 0) {
            return j10 <= j11 ? j11 : j11 + differenceModulo(j10, j11, -j12);
        } else {
            throw new IllegalArgumentException("Step is zero.");
        }
    }

    private static final int mod(int i10, int i11) {
        int i12 = i10 % i11;
        return i12 >= 0 ? i12 : i12 + i11;
    }

    private static final long mod(long j10, long j11) {
        long j12 = j10 % j11;
        return j12 >= 0 ? j12 : j12 + j11;
    }
}
