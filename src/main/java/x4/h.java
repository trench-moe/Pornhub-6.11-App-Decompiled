package x4;

import com.app.pornhub.R;
import com.app.pornhub.view.offline.OfflineVideoPlayerActivity;
import com.google.android.exoplayer2.PlaybackException;
import java.util.List;
import java.util.Timer;
import w6.c0;
import w6.d0;
import w6.m0;
import w6.n0;
import w6.x0;
import w7.o;

/* loaded from: classes2.dex */
public class h implements n0.c {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ OfflineVideoPlayerActivity f17934c;

    public h(OfflineVideoPlayerActivity offlineVideoPlayerActivity) {
        this.f17934c = offlineVideoPlayerActivity;
    }

    @Override // w6.n0.c
    public /* synthetic */ void C(n0 n0Var, n0.d dVar) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void G(boolean z10, int i10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void L(int i10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void P(n0.b bVar) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void W(o oVar, i8.j jVar) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void Y(boolean z10, int i10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void Z(m0 m0Var) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void d(int i10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void e(x0 x0Var, int i10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void f(boolean z10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void g(d0 d0Var) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void g0(PlaybackException playbackException) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void h(int i10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void i(List list) {
    }

    @Override // w6.n0.c
    public void l0(boolean z10) {
        if (!z10) {
            OfflineVideoPlayerActivity offlineVideoPlayerActivity = this.f17934c;
            int i10 = OfflineVideoPlayerActivity.T;
            offlineVideoPlayerActivity.H();
            this.f17934c.G();
            OfflineVideoPlayerActivity.D(this.f17934c, true);
            OfflineVideoPlayerActivity offlineVideoPlayerActivity2 = this.f17934c;
            offlineVideoPlayerActivity2.L.f4437e.setImageDrawable(offlineVideoPlayerActivity2.getResources().getDrawable(R.drawable.ic_play));
            return;
        }
        OfflineVideoPlayerActivity.C(this.f17934c);
        OfflineVideoPlayerActivity offlineVideoPlayerActivity3 = this.f17934c;
        offlineVideoPlayerActivity3.G();
        Timer timer = new Timer();
        offlineVideoPlayerActivity3.O = timer;
        timer.schedule(new OfflineVideoPlayerActivity.a(null), 3000L);
        OfflineVideoPlayerActivity offlineVideoPlayerActivity4 = this.f17934c;
        offlineVideoPlayerActivity4.L.f4437e.setImageDrawable(offlineVideoPlayerActivity4.getResources().getDrawable(R.drawable.ic_pause));
    }

    @Override // w6.n0.c
    public /* synthetic */ void m(boolean z10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void n() {
    }

    @Override // w6.n0.c
    public void p(PlaybackException playbackException) {
        kf.a.f12078a.d(playbackException, "OnErrorListener.onError(): VideoView encountered an error", new Object[0]);
        t3.o.n(this.f17934c, "Error trying to play this video");
        this.f17934c.F(false);
        this.f17934c.L.f4434a.setOnTouchListener(null);
    }

    @Override // w6.n0.c
    public /* synthetic */ void s(c0 c0Var, int i10) {
    }

    @Override // w6.n0.c
    public void v(int i10) {
        if (i10 == 1) {
            this.f17934c.F(false);
        } else if (i10 == 2) {
            this.f17934c.F(true);
        } else if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            this.f17934c.R.pause();
            this.f17934c.R.n(0L);
            this.f17934c.R.C(false);
            OfflineVideoPlayerActivity offlineVideoPlayerActivity = this.f17934c;
            offlineVideoPlayerActivity.I(0, offlineVideoPlayerActivity.S);
        } else {
            this.f17934c.F(false);
            if (this.f17934c.R.getCurrentPosition() == 0) {
                OfflineVideoPlayerActivity.D(this.f17934c, true);
            }
        }
    }

    @Override // w6.n0.c
    public /* synthetic */ void w(n0.f fVar, n0.f fVar2, int i10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void z(boolean z10) {
    }
}
