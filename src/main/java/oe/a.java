package oe;

import kotlin.ranges.RangesKt;
import ne.n;

/* loaded from: classes3.dex */
public final class a extends b {

    /* renamed from: u  reason: collision with root package name */
    public static final a f13638u;

    /* renamed from: w  reason: collision with root package name */
    public static final kotlinx.coroutines.b f13639w;

    static {
        a aVar = new a();
        f13638u = aVar;
        f13639w = new d(aVar, a0.b.b0("kotlinx.coroutines.io.parallelism", RangesKt.coerceAtLeast(64, n.f13460a), 0, 0, 12, null), "Dispatchers.IO", 1);
    }

    public a() {
        super(0, 0, null, 7);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.b
    public String toString() {
        return "Dispatchers.Default";
    }
}
