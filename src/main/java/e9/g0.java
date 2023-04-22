package e9;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import d9.a;

/* loaded from: classes.dex */
public final class g0<T> implements ea.c<T> {

    /* renamed from: c  reason: collision with root package name */
    public final d f9188c;

    /* renamed from: f  reason: collision with root package name */
    public final int f9189f;

    /* renamed from: j  reason: collision with root package name */
    public final a<?> f9190j;

    /* renamed from: m  reason: collision with root package name */
    public final long f9191m;
    public final long n;

    public g0(d dVar, int i10, a aVar, long j10, long j11) {
        this.f9188c = dVar;
        this.f9189f = i10;
        this.f9190j = aVar;
        this.f9191m = j10;
        this.n = j11;
    }

    public static h9.d a(z<?> zVar, h9.b<?> bVar, int i10) {
        h9.d telemetryConfiguration = bVar.getTelemetryConfiguration();
        if (telemetryConfiguration != null && telemetryConfiguration.f10299f) {
            int[] iArr = telemetryConfiguration.f10301m;
            if (iArr == null) {
                int[] iArr2 = telemetryConfiguration.f10302t;
                if (iArr2 != null && l9.e.c(iArr2, i10)) {
                    return null;
                }
            } else if (!l9.e.c(iArr, i10)) {
                return null;
            }
            if (zVar.f9269l < telemetryConfiguration.n) {
                return telemetryConfiguration;
            }
        }
        return null;
    }

    @Override // ea.c
    public final void g(ea.g<T> gVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        long j11;
        int i16;
        if (this.f9188c.b()) {
            h9.q qVar = h9.p.a().f10368a;
            if (qVar == null || qVar.f10370f) {
                z<?> zVar = this.f9188c.f9176z.get(this.f9190j);
                if (zVar != null) {
                    a.f fVar = zVar.f9260b;
                    if (fVar instanceof h9.b) {
                        h9.b bVar = (h9.b) fVar;
                        boolean z10 = true;
                        boolean z11 = this.f9191m > 0;
                        int gCoreServiceId = bVar.getGCoreServiceId();
                        if (qVar != null) {
                            z11 &= qVar.f10371j;
                            int i17 = qVar.f10372m;
                            int i18 = qVar.n;
                            i10 = qVar.f10369c;
                            if (bVar.hasConnectionInfo() && !bVar.isConnecting()) {
                                h9.d a10 = a(zVar, bVar, this.f9189f);
                                if (a10 == null) {
                                    return;
                                }
                                z10 = (!a10.f10300j || this.f9191m <= 0) ? false : false;
                                i18 = a10.n;
                                z11 = z10;
                            }
                            i11 = i17;
                            i12 = i18;
                        } else {
                            i10 = 0;
                            i11 = 5000;
                            i12 = 100;
                        }
                        d dVar = this.f9188c;
                        if (gVar.m()) {
                            i15 = 0;
                            i14 = 0;
                        } else {
                            if (gVar.k()) {
                                i13 = 100;
                            } else {
                                Exception i19 = gVar.i();
                                if (i19 instanceof ApiException) {
                                    Status status = ((ApiException) i19).mStatus;
                                    int i20 = status.f6859f;
                                    c9.b bVar2 = status.n;
                                    i14 = bVar2 == null ? -1 : bVar2.f3858f;
                                    i15 = i20;
                                } else {
                                    i13 = 101;
                                }
                            }
                            i15 = i13;
                            i14 = -1;
                        }
                        if (z11) {
                            long j12 = this.f9191m;
                            j11 = System.currentTimeMillis();
                            j10 = j12;
                            i16 = (int) (SystemClock.elapsedRealtime() - this.n);
                        } else {
                            j10 = 0;
                            j11 = 0;
                            i16 = -1;
                        }
                        h9.l lVar = new h9.l(this.f9189f, i15, i14, j10, j11, null, null, gCoreServiceId, i16);
                        long j13 = i11;
                        Handler handler = dVar.D;
                        handler.sendMessage(handler.obtainMessage(18, new h0(lVar, i10, j13, i12)));
                    }
                }
            }
        }
    }
}
