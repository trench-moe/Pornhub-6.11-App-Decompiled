package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.q0;
import com.app.pornhub.R;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.ui.o;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import k8.c0;
import l8.s;
import w6.d0;
import w6.m0;
import w6.n0;
import w6.x;
import w6.x0;

/* loaded from: classes.dex */
public class PlayerControlView extends FrameLayout {

    /* renamed from: u0  reason: collision with root package name */
    public static final /* synthetic */ int f6466u0 = 0;
    public final View A;
    public final TextView B;
    public final TextView C;
    public final o D;
    public final StringBuilder E;
    public final Formatter F;
    public final x0.b G;
    public final x0.c H;
    public final Runnable I;
    public final Runnable J;
    public final Drawable K;
    public final Drawable L;
    public final Drawable M;
    public final String N;
    public final String O;
    public final String P;
    public final Drawable Q;
    public final Drawable R;
    public final float S;
    public final float T;
    public final String U;
    public final String V;
    public n0 W;

    /* renamed from: a0  reason: collision with root package name */
    public w6.h f6467a0;

    /* renamed from: b0  reason: collision with root package name */
    public c f6468b0;

    /* renamed from: c  reason: collision with root package name */
    public final b f6469c;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f6470c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f6471d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f6472e0;

    /* renamed from: f  reason: collision with root package name */
    public final CopyOnWriteArrayList<d> f6473f;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f6474f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f6475g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f6476h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f6477i0;

    /* renamed from: j  reason: collision with root package name */
    public final View f6478j;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f6479j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f6480k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f6481l0;

    /* renamed from: m  reason: collision with root package name */
    public final View f6482m;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f6483m0;
    public final View n;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f6484n0;

    /* renamed from: o0  reason: collision with root package name */
    public long f6485o0;

    /* renamed from: p0  reason: collision with root package name */
    public long[] f6486p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean[] f6487q0;

    /* renamed from: r0  reason: collision with root package name */
    public long[] f6488r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean[] f6489s0;

    /* renamed from: t  reason: collision with root package name */
    public final View f6490t;

    /* renamed from: t0  reason: collision with root package name */
    public long f6491t0;

    /* renamed from: u  reason: collision with root package name */
    public final View f6492u;

    /* renamed from: w  reason: collision with root package name */
    public final View f6493w;
    public final ImageView y;

    /* renamed from: z  reason: collision with root package name */
    public final ImageView f6494z;

    /* loaded from: classes.dex */
    public final class b implements n0.e, o.a, View.OnClickListener {
        public b(a aVar) {
        }

        @Override // w6.n0.c
        public void C(n0 n0Var, n0.d dVar) {
            if (dVar.b(5, 6)) {
                PlayerControlView playerControlView = PlayerControlView.this;
                int i10 = PlayerControlView.f6466u0;
                playerControlView.k();
            }
            if (dVar.b(5, 6, 8)) {
                PlayerControlView playerControlView2 = PlayerControlView.this;
                int i11 = PlayerControlView.f6466u0;
                playerControlView2.l();
            }
            if (dVar.a(9)) {
                PlayerControlView playerControlView3 = PlayerControlView.this;
                int i12 = PlayerControlView.f6466u0;
                playerControlView3.m();
            }
            if (dVar.a(10)) {
                PlayerControlView playerControlView4 = PlayerControlView.this;
                int i13 = PlayerControlView.f6466u0;
                playerControlView4.n();
            }
            if (dVar.b(9, 10, 12, 0)) {
                PlayerControlView playerControlView5 = PlayerControlView.this;
                int i14 = PlayerControlView.f6466u0;
                playerControlView5.j();
            }
            if (dVar.b(12, 0)) {
                PlayerControlView playerControlView6 = PlayerControlView.this;
                int i15 = PlayerControlView.f6466u0;
                playerControlView6.o();
            }
        }

        @Override // a7.b
        public /* synthetic */ void F(int i10, boolean z10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void G(boolean z10, int i10) {
        }

        @Override // l8.l
        public /* synthetic */ void J(int i10, int i11, int i12, float f10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void L(int i10) {
        }

        @Override // a7.b
        public /* synthetic */ void M(a7.a aVar) {
        }

        @Override // l8.l
        public /* synthetic */ void N() {
        }

        @Override // w6.n0.c
        public /* synthetic */ void P(n0.b bVar) {
        }

        @Override // y7.i
        public /* synthetic */ void R(List list) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void W(w7.o oVar, i8.j jVar) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void Y(boolean z10, int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void Z(m0 m0Var) {
        }

        @Override // y6.f
        public /* synthetic */ void a(boolean z10) {
        }

        @Override // l8.l
        public /* synthetic */ void b(s sVar) {
        }

        @Override // l8.l
        public /* synthetic */ void b0(int i10, int i11) {
        }

        @Override // com.google.android.exoplayer2.ui.o.a
        public void c(o oVar, long j10) {
            PlayerControlView playerControlView = PlayerControlView.this;
            TextView textView = playerControlView.C;
            if (textView != null) {
                textView.setText(c0.t(playerControlView.E, playerControlView.F, j10));
            }
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

        @Override // o7.e
        public /* synthetic */ void j(o7.a aVar) {
        }

        @Override // com.google.android.exoplayer2.ui.o.a
        public void k(o oVar, long j10, boolean z10) {
            n0 n0Var;
            PlayerControlView playerControlView = PlayerControlView.this;
            int i10 = 0;
            playerControlView.f6474f0 = false;
            if (!z10 && (n0Var = playerControlView.W) != null) {
                x0 M = n0Var.M();
                if (playerControlView.f6472e0 && !M.q()) {
                    int p10 = M.p();
                    while (true) {
                        long b10 = M.n(i10, playerControlView.H).b();
                        if (j10 < b10) {
                            break;
                        } else if (i10 == p10 - 1) {
                            j10 = b10;
                            break;
                        } else {
                            j10 -= b10;
                            i10++;
                        }
                    }
                } else {
                    i10 = n0Var.z();
                }
                Objects.requireNonNull((w6.i) playerControlView.f6467a0);
                n0Var.d(i10, j10);
                playerControlView.l();
            }
        }

        @Override // com.google.android.exoplayer2.ui.o.a
        public void l(o oVar, long j10) {
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.f6474f0 = true;
            TextView textView = playerControlView.C;
            if (textView != null) {
                textView.setText(c0.t(playerControlView.E, playerControlView.F, j10));
            }
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

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerControlView playerControlView = PlayerControlView.this;
            n0 n0Var = playerControlView.W;
            if (n0Var == null) {
                return;
            }
            if (playerControlView.f6482m == view) {
                Objects.requireNonNull((w6.i) playerControlView.f6467a0);
                n0Var.Q();
            } else if (playerControlView.f6478j == view) {
                Objects.requireNonNull((w6.i) playerControlView.f6467a0);
                n0Var.A();
            } else {
                if (playerControlView.f6492u == view) {
                    if (n0Var.g() != 4) {
                        Objects.requireNonNull((w6.i) PlayerControlView.this.f6467a0);
                        n0Var.R();
                    }
                } else if (playerControlView.f6493w == view) {
                    Objects.requireNonNull((w6.i) playerControlView.f6467a0);
                    n0Var.U();
                } else if (playerControlView.n == view) {
                    playerControlView.b(n0Var);
                } else if (playerControlView.f6490t == view) {
                    Objects.requireNonNull((w6.i) playerControlView.f6467a0);
                    n0Var.C(false);
                } else if (playerControlView.y == view) {
                    w6.h hVar = playerControlView.f6467a0;
                    int C = a0.b.C(n0Var.s(), PlayerControlView.this.f6477i0);
                    Objects.requireNonNull((w6.i) hVar);
                    n0Var.q(C);
                } else if (playerControlView.f6494z == view) {
                    Objects.requireNonNull((w6.i) playerControlView.f6467a0);
                    n0Var.l(!n0Var.O());
                }
            }
        }

        @Override // w6.n0.c
        public /* synthetic */ void p(PlaybackException playbackException) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void s(w6.c0 c0Var, int i10) {
        }

        @Override // y6.f
        public /* synthetic */ void u(float f10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void v(int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void w(n0.f fVar, n0.f fVar2, int i10) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void z(boolean z10) {
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(long j10, long j11);
    }

    /* loaded from: classes.dex */
    public interface d {
        void c(int i10);
    }

    static {
        x.a("goog.exo.ui");
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        this.f6475g0 = 5000;
        this.f6477i0 = 0;
        this.f6476h0 = 200;
        this.f6485o0 = -9223372036854775807L;
        this.f6479j0 = true;
        this.f6480k0 = true;
        this.f6481l0 = true;
        this.f6483m0 = true;
        this.f6484n0 = false;
        int i11 = R.layout.exo_player_control_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, o9.b.n, 0, 0);
            try {
                this.f6475g0 = obtainStyledAttributes.getInt(19, this.f6475g0);
                i11 = obtainStyledAttributes.getResourceId(5, R.layout.exo_player_control_view);
                this.f6477i0 = obtainStyledAttributes.getInt(8, this.f6477i0);
                this.f6479j0 = obtainStyledAttributes.getBoolean(17, this.f6479j0);
                this.f6480k0 = obtainStyledAttributes.getBoolean(14, this.f6480k0);
                this.f6481l0 = obtainStyledAttributes.getBoolean(16, this.f6481l0);
                this.f6483m0 = obtainStyledAttributes.getBoolean(15, this.f6483m0);
                this.f6484n0 = obtainStyledAttributes.getBoolean(18, this.f6484n0);
                setTimeBarMinUpdateInterval(obtainStyledAttributes.getInt(20, this.f6476h0));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f6473f = new CopyOnWriteArrayList<>();
        this.G = new x0.b();
        this.H = new x0.c();
        StringBuilder sb2 = new StringBuilder();
        this.E = sb2;
        this.F = new Formatter(sb2, Locale.getDefault());
        this.f6486p0 = new long[0];
        this.f6487q0 = new boolean[0];
        this.f6488r0 = new long[0];
        this.f6489s0 = new boolean[0];
        b bVar = new b(null);
        this.f6469c = bVar;
        this.f6467a0 = new w6.i();
        this.I = new q0(this, 11);
        this.J = new androidx.emoji2.text.l(this, 4);
        LayoutInflater.from(context).inflate(i11, this);
        setDescendantFocusability(262144);
        o oVar = (o) findViewById(R.id.exo_progress);
        View findViewById = findViewById(R.id.exo_progress_placeholder);
        if (oVar != null) {
            this.D = oVar;
        } else if (findViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, 0);
            defaultTimeBar.setId(R.id.exo_progress);
            defaultTimeBar.setLayoutParams(findViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById);
            viewGroup.removeView(findViewById);
            viewGroup.addView(defaultTimeBar, indexOfChild);
            this.D = defaultTimeBar;
        } else {
            this.D = null;
        }
        this.B = (TextView) findViewById(R.id.exo_duration);
        this.C = (TextView) findViewById(R.id.exo_position);
        o oVar2 = this.D;
        if (oVar2 != null) {
            oVar2.b(bVar);
        }
        View findViewById2 = findViewById(R.id.exo_play);
        this.n = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(bVar);
        }
        View findViewById3 = findViewById(R.id.exo_pause);
        this.f6490t = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(bVar);
        }
        View findViewById4 = findViewById(R.id.exo_prev);
        this.f6478j = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(bVar);
        }
        View findViewById5 = findViewById(R.id.exo_next);
        this.f6482m = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(bVar);
        }
        View findViewById6 = findViewById(R.id.exo_rew);
        this.f6493w = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(bVar);
        }
        View findViewById7 = findViewById(R.id.exo_ffwd);
        this.f6492u = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(bVar);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.y = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(bVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.f6494z = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(bVar);
        }
        View findViewById8 = findViewById(R.id.exo_vr);
        this.A = findViewById8;
        setShowVrButton(false);
        i(false, false, findViewById8);
        Resources resources = context.getResources();
        this.S = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.T = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.K = resources.getDrawable(R.drawable.exo_controls_repeat_off);
        this.L = resources.getDrawable(R.drawable.exo_controls_repeat_one);
        this.M = resources.getDrawable(R.drawable.exo_controls_repeat_all);
        this.Q = resources.getDrawable(R.drawable.exo_controls_shuffle_on);
        this.R = resources.getDrawable(R.drawable.exo_controls_shuffle_off);
        this.N = resources.getString(R.string.exo_controls_repeat_off_description);
        this.O = resources.getString(R.string.exo_controls_repeat_one_description);
        this.P = resources.getString(R.string.exo_controls_repeat_all_description);
        this.U = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.V = resources.getString(R.string.exo_controls_shuffle_off_description);
    }

    public boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        n0 n0Var = this.W;
        if (n0Var != null) {
            if (keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (n0Var.g() != 4) {
                            Objects.requireNonNull((w6.i) this.f6467a0);
                            n0Var.R();
                        }
                    } else if (keyCode == 89) {
                        Objects.requireNonNull((w6.i) this.f6467a0);
                        n0Var.U();
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode == 79 || keyCode == 85) {
                            int g10 = n0Var.g();
                            if (g10 == 1 || g10 == 4 || !n0Var.k()) {
                                b(n0Var);
                            } else {
                                Objects.requireNonNull((w6.i) this.f6467a0);
                                n0Var.C(false);
                            }
                        } else if (keyCode == 87) {
                            Objects.requireNonNull((w6.i) this.f6467a0);
                            n0Var.Q();
                        } else if (keyCode == 88) {
                            Objects.requireNonNull((w6.i) this.f6467a0);
                            n0Var.A();
                        } else if (keyCode == 126) {
                            b(n0Var);
                        } else if (keyCode == 127) {
                            Objects.requireNonNull((w6.i) this.f6467a0);
                            n0Var.C(false);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void b(n0 n0Var) {
        int g10 = n0Var.g();
        if (g10 == 1) {
            Objects.requireNonNull((w6.i) this.f6467a0);
            n0Var.f();
        } else if (g10 == 4) {
            int z10 = n0Var.z();
            Objects.requireNonNull((w6.i) this.f6467a0);
            n0Var.d(z10, -9223372036854775807L);
        }
        Objects.requireNonNull((w6.i) this.f6467a0);
        n0Var.C(true);
    }

    public void c() {
        if (e()) {
            setVisibility(8);
            Iterator<d> it = this.f6473f.iterator();
            while (it.hasNext()) {
                it.next().c(getVisibility());
            }
            removeCallbacks(this.I);
            removeCallbacks(this.J);
            this.f6485o0 = -9223372036854775807L;
        }
    }

    public final void d() {
        removeCallbacks(this.J);
        if (this.f6475g0 <= 0) {
            this.f6485o0 = -9223372036854775807L;
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        int i10 = this.f6475g0;
        this.f6485o0 = uptimeMillis + i10;
        if (this.f6470c0) {
            postDelayed(this.J, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!a(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.J);
        } else if (motionEvent.getAction() == 1) {
            d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean e() {
        return getVisibility() == 0;
    }

    public final void f() {
        View view;
        View view2;
        boolean g10 = g();
        if (!g10 && (view2 = this.n) != null) {
            view2.requestFocus();
            return;
        }
        if (g10 && (view = this.f6490t) != null) {
            view.requestFocus();
        }
    }

    public final boolean g() {
        n0 n0Var = this.W;
        return (n0Var == null || n0Var.g() == 4 || this.W.g() == 1 || !this.W.k()) ? false : true;
    }

    public n0 getPlayer() {
        return this.W;
    }

    public int getRepeatToggleModes() {
        return this.f6477i0;
    }

    public boolean getShowShuffleButton() {
        return this.f6484n0;
    }

    public int getShowTimeoutMs() {
        return this.f6475g0;
    }

    public boolean getShowVrButton() {
        View view = this.A;
        return view != null && view.getVisibility() == 0;
    }

    public final void h() {
        k();
        j();
        m();
        n();
        o();
    }

    public final void i(boolean z10, boolean z11, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        view.setAlpha(z11 ? this.S : this.T);
        view.setVisibility(z10 ? 0 : 8);
    }

    public final void j() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (e()) {
            if (!this.f6470c0) {
                return;
            }
            n0 n0Var = this.W;
            boolean z14 = false;
            if (n0Var != null) {
                boolean H = n0Var.H(4);
                boolean H2 = n0Var.H(6);
                if (n0Var.H(10)) {
                    Objects.requireNonNull(this.f6467a0);
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (n0Var.H(11)) {
                    Objects.requireNonNull(this.f6467a0);
                    z14 = true;
                }
                z11 = n0Var.H(8);
                z10 = z14;
                z14 = H2;
                z12 = H;
            } else {
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            i(this.f6481l0, z14, this.f6478j);
            i(this.f6479j0, z13, this.f6493w);
            i(this.f6480k0, z10, this.f6492u);
            i(this.f6483m0, z11, this.f6482m);
            o oVar = this.D;
            if (oVar != null) {
                oVar.setEnabled(z12);
            }
        }
    }

    public final void k() {
        boolean z10;
        if (e()) {
            if (!this.f6470c0) {
                return;
            }
            boolean g10 = g();
            View view = this.n;
            boolean z11 = true;
            if (view != null) {
                z10 = (g10 && view.isFocused()) | false;
                this.n.setVisibility(g10 ? 8 : 0);
            } else {
                z10 = false;
            }
            View view2 = this.f6490t;
            if (view2 != null) {
                if (g10 || !view2.isFocused()) {
                    z11 = false;
                }
                z10 |= z11;
                this.f6490t.setVisibility(g10 ? 0 : 8);
            }
            if (z10) {
                f();
            }
        }
    }

    public final void l() {
        long j10;
        float f10;
        if (e()) {
            if (!this.f6470c0) {
                return;
            }
            n0 n0Var = this.W;
            long j11 = 0;
            if (n0Var != null) {
                j11 = this.f6491t0 + n0Var.E();
                j10 = this.f6491t0 + n0Var.P();
            } else {
                j10 = 0;
            }
            TextView textView = this.C;
            if (textView != null && !this.f6474f0) {
                textView.setText(c0.t(this.E, this.F, j11));
            }
            o oVar = this.D;
            if (oVar != null) {
                oVar.setPosition(j11);
                this.D.setBufferedPosition(j10);
            }
            c cVar = this.f6468b0;
            if (cVar != null) {
                cVar.a(j11, j10);
            }
            removeCallbacks(this.I);
            int g10 = n0Var == null ? 1 : n0Var.g();
            if (n0Var != null && n0Var.isPlaying()) {
                o oVar2 = this.D;
                long min = Math.min(oVar2 != null ? oVar2.getPreferredUpdateDelay() : 1000L, 1000 - (j11 % 1000));
                postDelayed(this.I, c0.i(n0Var.e().f16678a > 0.0f ? ((float) min) / f10 : 1000L, this.f6476h0, 1000L));
            } else if (g10 != 4 && g10 != 1) {
                postDelayed(this.I, 1000L);
            }
        }
    }

    public final void m() {
        ImageView imageView;
        if (e() && this.f6470c0 && (imageView = this.y) != null) {
            if (this.f6477i0 == 0) {
                i(false, false, imageView);
                return;
            }
            n0 n0Var = this.W;
            if (n0Var == null) {
                i(true, false, imageView);
                this.y.setImageDrawable(this.K);
                this.y.setContentDescription(this.N);
                return;
            }
            i(true, true, imageView);
            int s10 = n0Var.s();
            if (s10 == 0) {
                this.y.setImageDrawable(this.K);
                this.y.setContentDescription(this.N);
            } else if (s10 == 1) {
                this.y.setImageDrawable(this.L);
                this.y.setContentDescription(this.O);
            } else if (s10 == 2) {
                this.y.setImageDrawable(this.M);
                this.y.setContentDescription(this.P);
            }
            this.y.setVisibility(0);
        }
    }

    public final void n() {
        ImageView imageView;
        if (e() && this.f6470c0 && (imageView = this.f6494z) != null) {
            n0 n0Var = this.W;
            if (!this.f6484n0) {
                i(false, false, imageView);
            } else if (n0Var == null) {
                i(true, false, imageView);
                this.f6494z.setImageDrawable(this.R);
                this.f6494z.setContentDescription(this.V);
            } else {
                i(true, true, imageView);
                this.f6494z.setImageDrawable(n0Var.O() ? this.Q : this.R);
                this.f6494z.setContentDescription(n0Var.O() ? this.U : this.V);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerControlView.o():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6470c0 = true;
        long j10 = this.f6485o0;
        if (j10 != -9223372036854775807L) {
            long uptimeMillis = j10 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                c();
            } else {
                postDelayed(this.J, uptimeMillis);
            }
        } else if (e()) {
            d();
        }
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f6470c0 = false;
        removeCallbacks(this.I);
        removeCallbacks(this.J);
    }

    @Deprecated
    public void setControlDispatcher(w6.h hVar) {
        if (this.f6467a0 != hVar) {
            this.f6467a0 = hVar;
            j();
        }
    }

    public void setPlayer(n0 n0Var) {
        boolean z10 = true;
        k8.a.f(Looper.myLooper() == Looper.getMainLooper());
        if (n0Var != null && n0Var.N() != Looper.getMainLooper()) {
            z10 = false;
        }
        k8.a.c(z10);
        n0 n0Var2 = this.W;
        if (n0Var2 == n0Var) {
            return;
        }
        if (n0Var2 != null) {
            n0Var2.J(this.f6469c);
        }
        this.W = n0Var;
        if (n0Var != null) {
            n0Var.j(this.f6469c);
        }
        h();
    }

    public void setProgressUpdateListener(c cVar) {
        this.f6468b0 = cVar;
    }

    public void setRepeatToggleModes(int i10) {
        this.f6477i0 = i10;
        n0 n0Var = this.W;
        if (n0Var != null) {
            int s10 = n0Var.s();
            if (i10 == 0 && s10 != 0) {
                w6.h hVar = this.f6467a0;
                n0 n0Var2 = this.W;
                Objects.requireNonNull((w6.i) hVar);
                n0Var2.q(0);
            } else if (i10 == 1 && s10 == 2) {
                w6.h hVar2 = this.f6467a0;
                n0 n0Var3 = this.W;
                Objects.requireNonNull((w6.i) hVar2);
                n0Var3.q(1);
            } else if (i10 == 2 && s10 == 1) {
                w6.h hVar3 = this.f6467a0;
                n0 n0Var4 = this.W;
                Objects.requireNonNull((w6.i) hVar3);
                n0Var4.q(2);
            }
        }
        m();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f6480k0 = z10;
        j();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f6471d0 = z10;
        o();
    }

    public void setShowNextButton(boolean z10) {
        this.f6483m0 = z10;
        j();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f6481l0 = z10;
        j();
    }

    public void setShowRewindButton(boolean z10) {
        this.f6479j0 = z10;
        j();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f6484n0 = z10;
        n();
    }

    public void setShowTimeoutMs(int i10) {
        this.f6475g0 = i10;
        if (e()) {
            d();
        }
    }

    public void setShowVrButton(boolean z10) {
        View view = this.A;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f6476h0 = c0.h(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.A;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            i(getShowVrButton(), onClickListener != null, this.A);
        }
    }
}
