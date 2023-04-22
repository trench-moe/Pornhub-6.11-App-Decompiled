package c4;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.q0;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.ui.PlayerView;
import java.util.ArrayList;
import java.util.List;
import t3.p;
import w6.c0;
import w6.d0;
import w6.m0;
import w6.n0;
import w6.v0;
import w6.x0;
import w7.o;

/* loaded from: classes.dex */
public abstract class j extends c4.a<VideoMetaData> {

    /* renamed from: e  reason: collision with root package name */
    public b f3748e;

    /* renamed from: f  reason: collision with root package name */
    public v0 f3749f;

    /* renamed from: g  reason: collision with root package name */
    public c f3750g;

    /* loaded from: classes.dex */
    public class a implements n0.c {
        public a() {
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
        public /* synthetic */ void l0(boolean z10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void m(boolean z10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void n() {
        }

        @Override // w6.n0.c
        public void p(PlaybackException playbackException) {
            c cVar = j.this.f3750g;
            if (cVar != null) {
                cVar.a(true, true);
            }
        }

        @Override // w6.n0.c
        public /* synthetic */ void s(c0 c0Var, int i10) {
        }

        @Override // w6.n0.c
        public void v(int i10) {
            c cVar = j.this.f3750g;
            if (cVar != null) {
                if (i10 != 1) {
                    if (i10 == 3) {
                        cVar.f3755m.animate().alpha(0.0f).setDuration(200L);
                        return;
                    } else if (i10 != 4) {
                        return;
                    }
                }
                cVar.a(true, false);
            }
        }

        @Override // w6.n0.c
        public /* synthetic */ void w(n0.f fVar, n0.f fVar2, int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void z(boolean z10) {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(VideoMetaData videoMetaData);
    }

    /* loaded from: classes.dex */
    public class c implements View.OnTouchListener {

        /* renamed from: c  reason: collision with root package name */
        public int f3752c;

        /* renamed from: f  reason: collision with root package name */
        public FrameLayout f3753f;

        /* renamed from: j  reason: collision with root package name */
        public PlayerView f3754j;

        /* renamed from: m  reason: collision with root package name */
        public ImageView f3755m;
        public long n;

        /* renamed from: t  reason: collision with root package name */
        public float f3756t;

        /* renamed from: u  reason: collision with root package name */
        public float f3757u;

        public c(int i10, FrameLayout frameLayout, ImageView imageView) {
            this.f3752c = i10;
            this.f3753f = frameLayout;
            this.f3755m = imageView;
        }

        public final void a(boolean z10, boolean z11) {
            if (z11) {
                if (j.this.f3749f.isPlaying()) {
                    j.this.f3749f.q0(true);
                }
                j.this.f3749f.d.n0(null);
            } else {
                j.this.f3749f.q0(true);
                j.this.f3749f.n(0L);
            }
            this.f3753f.removeAllViews();
            this.f3753f.setVisibility(8);
            if (z10) {
                this.f3755m.animate().alpha(1.0f).setDuration(100L);
            } else {
                this.f3755m.setAlpha(1.0f);
            }
            j jVar = j.this;
            if (this == jVar.f3750g) {
                jVar.f3750g = null;
            }
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    return false;
                }
                if (System.currentTimeMillis() - this.n < 600) {
                    float f10 = this.f3756t;
                    float f11 = this.f3757u;
                    float x10 = f10 - motionEvent.getX();
                    float y = f11 - motionEvent.getY();
                    if (((float) Math.sqrt((y * y) + (x10 * x10))) / this.f3753f.getContext().getResources().getDisplayMetrics().density < 15.0f) {
                        new Handler().postDelayed(new q0(this, 4), 500L);
                        if (this.f3752c < j.this.d.size()) {
                            j jVar = j.this;
                            jVar.f3748e.a((VideoMetaData) jVar.d.get(this.f3752c));
                        }
                        return view.performClick();
                    }
                }
                return true;
            }
            this.n = System.currentTimeMillis();
            this.f3756t = motionEvent.getX();
            this.f3757u = motionEvent.getY();
            if (this.f3752c < j.this.d.size()) {
                c cVar = j.this.f3750g;
                if (cVar != null && this != cVar) {
                    cVar.a(true, false);
                }
                if (this.f3753f.getVisibility() != 0 && p.a((VideoMetaData) j.this.d.get(this.f3752c))) {
                    j.this.f3750g = this;
                    this.f3753f.setVisibility(0);
                    PlayerView playerView = new PlayerView(this.f3753f.getContext(), null);
                    this.f3754j = playerView;
                    playerView.setUseController(false);
                    this.f3753f.removeAllViews();
                    this.f3753f.addView(this.f3754j, new FrameLayout.LayoutParams(-2, -1));
                    this.f3753f.addOnAttachStateChangeListener(new k(this));
                    this.f3754j.setPlayer(j.this.f3749f);
                    j.this.f3749f.y(c0.b(((VideoMetaData) j.this.d.get(this.f3752c)).getPreviewUrl()));
                    j.this.f3749f.f();
                    j.this.f3749f.n(0L);
                }
            }
            return true;
        }
    }

    public j(b bVar) {
        super(new ArrayList());
        this.f3750g = null;
        this.f3748e = bVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void g(RecyclerView recyclerView) {
        j8.i iVar = new j8.i(true, 65536);
        k8.a.f(!false);
        k8.a.f(!false);
        w6.k.j(1000, 0, "bufferForPlaybackMs", "0");
        w6.k.j(1500, 0, "bufferForPlaybackAfterRebufferMs", "0");
        w6.k.j(1500, 1000, "minBufferMs", "bufferForPlaybackMs");
        w6.k.j(1500, 1500, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        w6.k.j(3000, 1500, "maxBufferMs", "minBufferMs");
        k8.a.f(!false);
        w6.k kVar = new w6.k(iVar, 1500, 3000, 1000, 1500, -1, false, 0, false);
        v0.b bVar = new v0.b(recyclerView.getContext());
        k8.a.f(!bVar.f16788s);
        bVar.f16776f = kVar;
        v0 a10 = bVar.a();
        this.f3749f = a10;
        a10.p0(0.0f);
        this.f3749f.C(true);
        this.f3749f.o(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void j(RecyclerView recyclerView) {
        this.f3749f.k0();
    }

    public void q(List<VideoMetaData> list) {
        int size = this.d.size();
        this.d.addAll(list);
        this.f2802a.e(size, list.size());
    }
}
