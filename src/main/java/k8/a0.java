package k8;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public long f11930a;

    /* renamed from: b  reason: collision with root package name */
    public long f11931b;

    /* renamed from: c  reason: collision with root package name */
    public long f11932c;
    public final ThreadLocal<Long> d = new ThreadLocal<>();

    public a0(long j10) {
        e(j10);
    }

    public synchronized long a(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (this.f11931b == -9223372036854775807L) {
                long j11 = this.f11930a;
                if (j11 == 9223372036854775806L) {
                    Long l10 = this.d.get();
                    Objects.requireNonNull(l10);
                    j11 = l10.longValue();
                }
                this.f11931b = j11 - j10;
                notifyAll();
            }
            this.f11932c = j10;
            return j10 + this.f11931b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long b(long j10) {
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j11 = this.f11932c;
            if (j11 != -9223372036854775807L) {
                long j12 = (j11 * 90000) / 1000000;
                long j13 = (4294967296L + j12) / 8589934592L;
                long j14 = ((j13 - 1) * 8589934592L) + j10;
                long j15 = (j13 * 8589934592L) + j10;
                j10 = Math.abs(j14 - j12) < Math.abs(j15 - j12) ? j14 : j15;
            }
            return a((j10 * 1000000) / 90000);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized long c() {
        long j10;
        try {
            j10 = this.f11930a;
        } catch (Throwable th) {
            throw th;
        }
        return (j10 == Long.MAX_VALUE || j10 == 9223372036854775806L) ? -9223372036854775807L : -9223372036854775807L;
    }

    public synchronized long d() {
        return this.f11931b;
    }

    public synchronized void e(long j10) {
        try {
            this.f11930a = j10;
            this.f11931b = j10 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
            this.f11932c = -9223372036854775807L;
        } catch (Throwable th) {
            throw th;
        }
    }
}
