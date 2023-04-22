package d6;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final double f8792a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f8793b = 0;

    public static double a(long j10) {
        return (SystemClock.elapsedRealtimeNanos() - j10) * f8792a;
    }
}
