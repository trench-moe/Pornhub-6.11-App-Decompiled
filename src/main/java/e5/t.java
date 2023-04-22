package e5;

import com.app.pornhub.R;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import com.google.android.exoplayer2.PlaybackException;
import java.util.List;
import java.util.Timer;
import w6.m0;
import w6.n0;
import w6.x0;

/* loaded from: classes.dex */
public class t implements n0.c {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ VideoDetailsActivity f9109c;

    public t(VideoDetailsActivity videoDetailsActivity) {
        this.f9109c = videoDetailsActivity;
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
    public /* synthetic */ void W(w7.o oVar, i8.j jVar) {
    }

    @Override // w6.n0.c
    public void Y(boolean z10, int i10) {
        if (z10) {
            VideoDetailsActivity videoDetailsActivity = this.f9109c;
            int i11 = VideoDetailsActivity.f5539t0;
            videoDetailsActivity.Y(false);
        }
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
    public /* synthetic */ void g(w6.d0 d0Var) {
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
            VideoDetailsActivity videoDetailsActivity = this.f9109c;
            int i10 = VideoDetailsActivity.f5539t0;
            videoDetailsActivity.e0();
            this.f9109c.d0();
            this.f9109c.P(true);
            this.f9109c.O();
            VideoDetailsActivity videoDetailsActivity2 = this.f9109c;
            videoDetailsActivity2.R.f4484e.f4858k.setImageDrawable(videoDetailsActivity2.getResources().getDrawable(R.drawable.ic_play));
            return;
        }
        VideoDetailsActivity.C(this.f9109c);
        VideoDetailsActivity videoDetailsActivity3 = this.f9109c;
        videoDetailsActivity3.d0();
        Timer timer = new Timer();
        videoDetailsActivity3.f5541b0 = timer;
        timer.schedule(new VideoDetailsActivity.d(null), 3000L);
        this.f9109c.L.f5577p.d(System.currentTimeMillis());
        this.f9109c.f5557r0 = System.currentTimeMillis();
        VideoDetailsActivity videoDetailsActivity4 = this.f9109c;
        videoDetailsActivity4.R.f4484e.f4858k.setImageDrawable(videoDetailsActivity4.getResources().getDrawable(R.drawable.ic_pause));
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
        t3.o.n(this.f9109c, "Error trying to play this video");
        this.f9109c.X(false);
        this.f9109c.Y(true);
        this.f9109c.R.f4484e.d.setOnTouchListener(null);
    }

    @Override // w6.n0.c
    public /* synthetic */ void s(w6.c0 c0Var, int i10) {
    }

    @Override // w6.n0.c
    public void v(int i10) {
        if (i10 == 1) {
            this.f9109c.X(false);
            this.f9109c.Y(true);
        } else if (i10 == 2) {
            this.f9109c.X(true);
        } else if (i10 == 3) {
            this.f9109c.X(false);
        } else if (i10 != 4) {
        } else {
            this.f9109c.f5558s0.C(false);
            this.f9109c.f5558s0.n(0L);
            this.f9109c.f5558s0.C(false);
            VideoDetailsActivity videoDetailsActivity = this.f9109c;
            videoDetailsActivity.g0(0, videoDetailsActivity.Z);
            this.f9109c.Y(true);
        }
    }

    @Override // w6.n0.c
    public /* synthetic */ void w(n0.f fVar, n0.f fVar2, int i10) {
    }

    @Override // w6.n0.c
    public /* synthetic */ void z(boolean z10) {
    }
}
