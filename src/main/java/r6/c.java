package r6;

import android.app.job.JobParameters;
import c7.u;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.source.n;
import java.util.Objects;
import k8.c0;
import l8.r;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f14683c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f14684f;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Object f14685j;

    public /* synthetic */ c(Object obj, Object obj2, int i10) {
        this.f14683c = i10;
        this.f14684f = obj;
        this.f14685j = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10 = false;
        switch (this.f14683c) {
            case 0:
                int i10 = JobInfoSchedulerService.f5971c;
                ((JobInfoSchedulerService) this.f14684f).jobFinished((JobParameters) this.f14685j, false);
                return;
            case 1:
                c.a aVar = (c.a) this.f14684f;
                ((com.google.android.exoplayer2.drm.c) this.f14685j).T(aVar.f6181a, aVar.f6182b);
                return;
            case 2:
                n7.f fVar = (n7.f) this.f14684f;
                Runnable runnable = (Runnable) this.f14685j;
                synchronized (fVar.f13396a) {
                    if (!fVar.f13406l) {
                        long j10 = fVar.f13405k - 1;
                        fVar.f13405k = j10;
                        int i11 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                        if (i11 <= 0) {
                            if (i11 < 0) {
                                fVar.c(new IllegalStateException());
                            } else {
                                fVar.a();
                                try {
                                    runnable.run();
                                } catch (IllegalStateException e10) {
                                    fVar.c(e10);
                                } catch (Exception e11) {
                                    fVar.c(new IllegalStateException(e11));
                                }
                            }
                        }
                    }
                }
                return;
            case 3:
                com.google.android.exoplayer2.source.m mVar = (com.google.android.exoplayer2.source.m) this.f14684f;
                u uVar = (u) this.f14685j;
                mVar.O = mVar.H == null ? uVar : new u.b(-9223372036854775807L, 0L);
                mVar.P = uVar.j();
                if (mVar.V == -1 && uVar.j() == -9223372036854775807L) {
                    z10 = true;
                }
                mVar.Q = z10;
                mVar.R = z10 ? 7 : 1;
                ((n) mVar.f6360u).v(mVar.P, uVar.d(), mVar.Q);
                if (mVar.L) {
                    return;
                }
                mVar.x();
                return;
            case 4:
                android.support.v4.media.a.n(this.f14684f);
                throw null;
            default:
                r.a aVar2 = (r.a) this.f14684f;
                z6.d dVar = (z6.d) this.f14685j;
                Objects.requireNonNull(aVar2);
                synchronized (dVar) {
                }
                r rVar = aVar2.f12741b;
                int i12 = c0.f11939a;
                rVar.U(dVar);
                return;
        }
    }
}
