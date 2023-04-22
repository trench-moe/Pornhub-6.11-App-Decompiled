package w6;

import java.util.UUID;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final UUID f16588a = new UUID(0, 0);

    /* renamed from: b  reason: collision with root package name */
    public static final UUID f16589b = new UUID(1186680826959645954L, -5988876978535335093L);

    /* renamed from: c  reason: collision with root package name */
    public static final UUID f16590c = new UUID(-2129748144642739255L, 8654423357094679310L);
    public static final UUID d = new UUID(-1301668207276963122L, -6645017420763422227L);

    /* renamed from: e  reason: collision with root package name */
    public static final UUID f16591e = new UUID(-7348484286925749626L, -6083546864340672619L);

    public static int a(int i10) {
        if (i10 != 2 && i10 != 4) {
            if (i10 != 10) {
                if (i10 != 7) {
                    if (i10 != 8) {
                        switch (i10) {
                            case 15:
                                return 6003;
                            case 16:
                            case 18:
                                return 6005;
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                                break;
                            default:
                                switch (i10) {
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                        return 6002;
                                    default:
                                        return 6006;
                                }
                        }
                    } else {
                        return 6003;
                    }
                }
            }
            return 6004;
        }
        return 6005;
    }

    public static long b(long j10) {
        if (j10 != -9223372036854775807L) {
            if (j10 == Long.MIN_VALUE) {
                return j10;
            }
            j10 *= 1000;
        }
        return j10;
    }

    public static long c(long j10) {
        return (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? j10 : j10 / 1000;
    }
}
