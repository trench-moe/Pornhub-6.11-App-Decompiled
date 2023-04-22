package oe;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.JvmField;
import kotlin.ranges.RangesKt;
import ne.n;

/* loaded from: classes3.dex */
public final class i {
    @JvmField

    /* renamed from: a  reason: collision with root package name */
    public static final long f13653a = a0.b.c0("kotlinx.coroutines.scheduler.resolution.ns", 100000, 0, 0, 12, null);
    @JvmField

    /* renamed from: b  reason: collision with root package name */
    public static final int f13654b;
    @JvmField

    /* renamed from: c  reason: collision with root package name */
    public static final int f13655c;
    @JvmField
    public static final long d;
    @JvmField

    /* renamed from: e  reason: collision with root package name */
    public static af.c f13656e;

    static {
        a0.b.b0("kotlinx.coroutines.scheduler.blocking.parallelism", 16, 0, 0, 12, null);
        int i10 = n.f13460a;
        int b02 = a0.b.b0("kotlinx.coroutines.scheduler.core.pool.size", RangesKt.coerceAtLeast(i10, 2), 1, 0, 8, null);
        f13654b = b02;
        f13655c = a0.b.b0("kotlinx.coroutines.scheduler.max.pool.size", RangesKt.coerceIn(i10 * 128, b02, 2097150), 0, 2097150, 4, null);
        d = TimeUnit.SECONDS.toNanos(a0.b.c0("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null));
        f13656e = e.f13649a;
    }
}
