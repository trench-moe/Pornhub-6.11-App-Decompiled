package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import c0.a;
import com.app.pornhub.R;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l8.s;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import w6.c0;
import w6.d0;
import w6.m0;
import w6.n0;
import w6.x0;

/* loaded from: classes.dex */
public class PlayerView extends FrameLayout {
    public static final /* synthetic */ int R = 0;
    public final FrameLayout A;
    public final FrameLayout B;
    public n0 C;
    public boolean D;
    public PlayerControlView.d E;
    public boolean F;
    public Drawable G;
    public int H;
    public boolean I;
    public k8.g<? super PlaybackException> J;
    public CharSequence K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;

    /* renamed from: c  reason: collision with root package name */
    public final a f6496c;

    /* renamed from: f  reason: collision with root package name */
    public final AspectRatioFrameLayout f6497f;

    /* renamed from: j  reason: collision with root package name */
    public final View f6498j;

    /* renamed from: m  reason: collision with root package name */
    public final View f6499m;
    public final boolean n;

    /* renamed from: t  reason: collision with root package name */
    public final ImageView f6500t;

    /* renamed from: u  reason: collision with root package name */
    public final SubtitleView f6501u;

    /* renamed from: w  reason: collision with root package name */
    public final View f6502w;
    public final TextView y;

    /* renamed from: z  reason: collision with root package name */
    public final PlayerControlView f6503z;

    /* loaded from: classes.dex */
    public final class a implements n0.e, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.d {

        /* renamed from: c  reason: collision with root package name */
        public final x0.b f6504c = new x0.b();

        /* renamed from: f  reason: collision with root package name */
        public Object f6505f;

        public a() {
        }

        @Override // w6.n0.c
        public /* synthetic */ void C(n0 n0Var, n0.d dVar) {
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
        public void N() {
            View view = PlayerView.this.f6498j;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        @Override // w6.n0.c
        public /* synthetic */ void P(n0.b bVar) {
        }

        @Override // y7.i
        public void R(List<y7.a> list) {
            SubtitleView subtitleView = PlayerView.this.f6501u;
            if (subtitleView != null) {
                subtitleView.setCues(list);
            }
        }

        @Override // w6.n0.c
        public void W(w7.o oVar, i8.j jVar) {
            n0 n0Var = PlayerView.this.C;
            Objects.requireNonNull(n0Var);
            x0 M = n0Var.M();
            if (M.q()) {
                this.f6505f = null;
            } else if (n0Var.L().b()) {
                Object obj = this.f6505f;
                if (obj != null) {
                    int b10 = M.b(obj);
                    if (b10 != -1) {
                        if (n0Var.z() == M.f(b10, this.f6504c).f16841c) {
                            return;
                        }
                    }
                    this.f6505f = null;
                }
            } else {
                this.f6505f = M.g(n0Var.r(), this.f6504c, true).f16840b;
            }
            PlayerView.this.o(false);
        }

        @Override // w6.n0.c
        public void Y(boolean z10, int i10) {
            PlayerView playerView = PlayerView.this;
            int i11 = PlayerView.R;
            playerView.l();
            PlayerView playerView2 = PlayerView.this;
            if (playerView2.e() && playerView2.N) {
                playerView2.d();
            } else {
                playerView2.f(false);
            }
        }

        @Override // w6.n0.c
        public /* synthetic */ void Z(m0 m0Var) {
        }

        @Override // y6.f
        public /* synthetic */ void a(boolean z10) {
        }

        @Override // l8.l
        public void b(s sVar) {
            PlayerView playerView = PlayerView.this;
            int i10 = PlayerView.R;
            playerView.k();
        }

        @Override // l8.l
        public /* synthetic */ void b0(int i10, int i11) {
        }

        @Override // com.google.android.exoplayer2.ui.PlayerControlView.d
        public void c(int i10) {
            PlayerView playerView = PlayerView.this;
            int i11 = PlayerView.R;
            playerView.m();
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
            PlayerView playerView = PlayerView.this;
            int i10 = PlayerView.R;
            playerView.j();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            PlayerView.a((TextureView) view, PlayerView.this.P);
        }

        @Override // w6.n0.c
        public /* synthetic */ void p(PlaybackException playbackException) {
        }

        @Override // w6.n0.c
        public /* synthetic */ void s(c0 c0Var, int i10) {
        }

        @Override // y6.f
        public /* synthetic */ void u(float f10) {
        }

        @Override // w6.n0.c
        public void v(int i10) {
            PlayerView playerView = PlayerView.this;
            int i11 = PlayerView.R;
            playerView.l();
            PlayerView.this.n();
            PlayerView playerView2 = PlayerView.this;
            if (playerView2.e() && playerView2.N) {
                playerView2.d();
            } else {
                playerView2.f(false);
            }
        }

        @Override // w6.n0.c
        public void w(n0.f fVar, n0.f fVar2, int i10) {
            PlayerView playerView = PlayerView.this;
            int i11 = PlayerView.R;
            if (playerView.e()) {
                PlayerView playerView2 = PlayerView.this;
                if (playerView2.N) {
                    playerView2.d();
                }
            }
        }

        @Override // w6.n0.c
        public /* synthetic */ void z(boolean z10) {
        }
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        boolean z10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        int i14;
        boolean z12;
        boolean z13;
        boolean z14;
        int i15;
        int i16;
        boolean z15;
        boolean z16;
        a aVar = new a();
        this.f6496c = aVar;
        if (isInEditMode()) {
            this.f6497f = null;
            this.f6498j = null;
            this.f6499m = null;
            this.n = false;
            this.f6500t = null;
            this.f6501u = null;
            this.f6502w = null;
            this.y = null;
            this.f6503z = null;
            this.A = null;
            this.B = null;
            ImageView imageView = new ImageView(context);
            if (k8.c0.f11939a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, null));
                imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(R.drawable.exo_edit_mode_logo));
                imageView.setBackgroundColor(resources2.getColor(R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        int i17 = R.layout.exo_player_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o9.b.f13624t, 0, 0);
            try {
                z13 = obtainStyledAttributes.hasValue(23);
                i11 = obtainStyledAttributes.getColor(23, 0);
                int resourceId = obtainStyledAttributes.getResourceId(12, R.layout.exo_player_view);
                z14 = obtainStyledAttributes.getBoolean(28, true);
                i15 = obtainStyledAttributes.getResourceId(6, 0);
                boolean z17 = obtainStyledAttributes.getBoolean(29, true);
                i13 = obtainStyledAttributes.getInt(24, 1);
                i12 = obtainStyledAttributes.getInt(14, 0);
                int i18 = obtainStyledAttributes.getInt(22, 5000);
                boolean z18 = obtainStyledAttributes.getBoolean(8, true);
                boolean z19 = obtainStyledAttributes.getBoolean(2, true);
                int integer = obtainStyledAttributes.getInteger(20, 0);
                this.I = obtainStyledAttributes.getBoolean(9, this.I);
                boolean z20 = obtainStyledAttributes.getBoolean(7, true);
                obtainStyledAttributes.recycle();
                i14 = integer;
                z12 = z18;
                z10 = z20;
                i16 = i18;
                z11 = z19;
                i17 = resourceId;
                z15 = z17;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            z10 = true;
            i11 = 0;
            i12 = 0;
            i13 = 1;
            z11 = true;
            i14 = 0;
            z12 = true;
            z13 = false;
            z14 = true;
            i15 = 0;
            i16 = 5000;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i17, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f6497f = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i12);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.f6498j = findViewById;
        if (findViewById != null && z13) {
            findViewById.setBackgroundColor(i11);
        }
        if (aspectRatioFrameLayout == null || i13 == 0) {
            this.f6499m = null;
            z16 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i13 == 2) {
                this.f6499m = new TextureView(context);
            } else if (i13 == 3) {
                try {
                    this.f6499m = (View) Class.forName("com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView").getConstructor(Context.class).newInstance(context);
                    z16 = true;
                    this.f6499m.setLayoutParams(layoutParams);
                    this.f6499m.setOnClickListener(aVar);
                    this.f6499m.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f6499m, 0);
                } catch (Exception e10) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            } else if (i13 != 4) {
                this.f6499m = new SurfaceView(context);
            } else {
                try {
                    this.f6499m = (View) Class.forName("com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView").getConstructor(Context.class).newInstance(context);
                } catch (Exception e11) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                }
            }
            z16 = false;
            this.f6499m.setLayoutParams(layoutParams);
            this.f6499m.setOnClickListener(aVar);
            this.f6499m.setClickable(false);
            aspectRatioFrameLayout.addView(this.f6499m, 0);
        }
        this.n = z16;
        this.A = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.B = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f6500t = imageView2;
        this.F = z14 && imageView2 != null;
        if (i15 != 0) {
            Context context2 = getContext();
            Object obj = c0.a.f3717a;
            this.G = a.c.b(context2, i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f6501u = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.f6502w = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.H = i14;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.y = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (playerControlView != null) {
            this.f6503z = playerControlView;
        } else if (findViewById3 != null) {
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.f6503z = playerControlView2;
            playerControlView2.setId(R.id.exo_controller);
            playerControlView2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(playerControlView2, indexOfChild);
        } else {
            this.f6503z = null;
        }
        PlayerControlView playerControlView3 = this.f6503z;
        this.L = playerControlView3 != null ? i16 : 0;
        this.O = z12;
        this.M = z11;
        this.N = z10;
        this.D = z15 && playerControlView3 != null;
        d();
        m();
        PlayerControlView playerControlView4 = this.f6503z;
        if (playerControlView4 != null) {
            playerControlView4.f6473f.add(aVar);
        }
    }

    public static void a(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i10 != 0) {
            float f10 = width / 2.0f;
            float f11 = height / 2.0f;
            matrix.postRotate(i10, f10, f11);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        }
        textureView.setTransform(matrix);
    }

    public final void b() {
        View view = this.f6498j;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void c() {
        ImageView imageView = this.f6500t;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f6500t.setVisibility(4);
        }
    }

    public void d() {
        PlayerControlView playerControlView = this.f6503z;
        if (playerControlView != null) {
            playerControlView.c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        n0 n0Var = this.C;
        if (n0Var == null || !n0Var.a()) {
            int keyCode = keyEvent.getKeyCode();
            boolean z10 = false;
            boolean z11 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
            if (z11 && p() && !this.f6503z.e()) {
                f(true);
            } else {
                if (!(p() && this.f6503z.a(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                    if (z11 && p()) {
                        f(true);
                        return z10;
                    }
                    return z10;
                }
                f(true);
            }
            z10 = true;
            return z10;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean e() {
        n0 n0Var = this.C;
        return n0Var != null && n0Var.a() && this.C.k();
    }

    public final void f(boolean z10) {
        if (e() && this.N) {
            return;
        }
        if (p()) {
            boolean z11 = this.f6503z.e() && this.f6503z.getShowTimeoutMs() <= 0;
            boolean h10 = h();
            if (z10 || z11 || h10) {
                i(h10);
            }
        }
    }

    @RequiresNonNull({"artworkView"})
    public final boolean g(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f10 = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f6497f;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f10);
                }
                this.f6500t.setImageDrawable(drawable);
                this.f6500t.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public List<cb.e> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.B;
        if (frameLayout != null) {
            arrayList.add(new cb.e(frameLayout, 3, "Transparent overlay does not impact viewability"));
        }
        PlayerControlView playerControlView = this.f6503z;
        if (playerControlView != null) {
            arrayList.add(new cb.e(playerControlView, 0));
        }
        return ImmutableList.r(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.A;
        k8.a.h(frameLayout, "exo_ad_overlay must be present for ad playback");
        return frameLayout;
    }

    public boolean getControllerAutoShow() {
        return this.M;
    }

    public boolean getControllerHideOnTouch() {
        return this.O;
    }

    public int getControllerShowTimeoutMs() {
        return this.L;
    }

    public Drawable getDefaultArtwork() {
        return this.G;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.B;
    }

    public n0 getPlayer() {
        return this.C;
    }

    public int getResizeMode() {
        k8.a.g(this.f6497f);
        return this.f6497f.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f6501u;
    }

    public boolean getUseArtwork() {
        return this.F;
    }

    public boolean getUseController() {
        return this.D;
    }

    public View getVideoSurfaceView() {
        return this.f6499m;
    }

    public final boolean h() {
        n0 n0Var = this.C;
        if (n0Var == null) {
            return true;
        }
        int g10 = n0Var.g();
        if (!this.M || (g10 != 1 && g10 != 4 && this.C.k())) {
            return false;
        }
        return true;
    }

    public final void i(boolean z10) {
        if (p()) {
            this.f6503z.setShowTimeoutMs(z10 ? 0 : this.L);
            PlayerControlView playerControlView = this.f6503z;
            if (!playerControlView.e()) {
                playerControlView.setVisibility(0);
                Iterator<PlayerControlView.d> it = playerControlView.f6473f.iterator();
                while (it.hasNext()) {
                    it.next().c(playerControlView.getVisibility());
                }
                playerControlView.h();
                playerControlView.f();
            }
            playerControlView.d();
        }
    }

    public final boolean j() {
        if (p() && this.C != null) {
            if (!this.f6503z.e()) {
                f(true);
            } else if (this.O) {
                this.f6503z.c();
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            r9 = this;
            r5 = r9
            w6.n0 r0 = r5.C
            r8 = 3
            if (r0 == 0) goto Ld
            r7 = 1
            l8.s r8 = r0.u()
            r0 = r8
            goto Lf
        Ld:
            l8.s r0 = l8.s.f12742e
        Lf:
            int r1 = r0.f12743a
            r8 = 1
            int r2 = r0.f12744b
            r7 = 6
            int r3 = r0.f12745c
            r4 = 0
            r8 = 6
            if (r2 == 0) goto L28
            if (r1 != 0) goto L1e
            goto L29
        L1e:
            float r1 = (float) r1
            float r0 = r0.d
            float r1 = r1 * r0
            r7 = 6
            float r0 = (float) r2
            float r1 = r1 / r0
            r8 = 1
            goto L2a
        L28:
            r8 = 5
        L29:
            r1 = 0
        L2a:
            android.view.View r0 = r5.f6499m
            boolean r2 = r0 instanceof android.view.TextureView
            r8 = 6
            if (r2 == 0) goto L6b
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r7 = 7
            if (r2 <= 0) goto L48
            r8 = 5
            r2 = 90
            r7 = 4
            if (r3 == r2) goto L43
            r7 = 2
            r2 = 270(0x10e, float:3.78E-43)
            r8 = 6
            if (r3 != r2) goto L48
            r8 = 6
        L43:
            r7 = 1065353216(0x3f800000, float:1.0)
            r2 = r7
            float r2 = r2 / r1
            r1 = r2
        L48:
            int r2 = r5.P
            if (r2 == 0) goto L52
            com.google.android.exoplayer2.ui.PlayerView$a r2 = r5.f6496c
            r8 = 7
            r0.removeOnLayoutChangeListener(r2)
        L52:
            r7 = 4
            r5.P = r3
            r8 = 1
            if (r3 == 0) goto L60
            android.view.View r0 = r5.f6499m
            r7 = 1
            com.google.android.exoplayer2.ui.PlayerView$a r2 = r5.f6496c
            r0.addOnLayoutChangeListener(r2)
        L60:
            r7 = 1
            android.view.View r0 = r5.f6499m
            android.view.TextureView r0 = (android.view.TextureView) r0
            int r2 = r5.P
            a(r0, r2)
            r8 = 7
        L6b:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = r5.f6497f
            r8 = 2
            boolean r2 = r5.n
            if (r2 == 0) goto L73
            goto L75
        L73:
            r7 = 6
            r4 = r1
        L75:
            if (r0 == 0) goto L7c
            r7 = 4
            r0.setAspectRatio(r4)
            r7 = 2
        L7c:
            r7 = 3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerView.k():void");
    }

    public final void l() {
        int i10;
        if (this.f6502w != null) {
            n0 n0Var = this.C;
            boolean z10 = true;
            int i11 = 0;
            if (n0Var == null || n0Var.g() != 2 || ((i10 = this.H) != 2 && (i10 != 1 || !this.C.k()))) {
                z10 = false;
            }
            View view = this.f6502w;
            if (!z10) {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    public final void m() {
        PlayerControlView playerControlView = this.f6503z;
        if (playerControlView == null || !this.D) {
            setContentDescription(null);
        } else if (playerControlView.getVisibility() == 0) {
            setContentDescription(this.O ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    public final void n() {
        k8.g<? super PlaybackException> gVar;
        TextView textView = this.y;
        if (textView != null) {
            CharSequence charSequence = this.K;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.y.setVisibility(0);
                return;
            }
            n0 n0Var = this.C;
            PlaybackException B = n0Var != null ? n0Var.B() : null;
            if (B != null && (gVar = this.J) != null) {
                this.y.setText((CharSequence) gVar.a(B).second);
                this.y.setVisibility(0);
                return;
            }
            this.y.setVisibility(8);
        }
    }

    public final void o(boolean z10) {
        boolean z11;
        n0 n0Var = this.C;
        if (n0Var == null || n0Var.L().b()) {
            if (this.I) {
                return;
            }
            c();
            b();
            return;
        }
        if (z10 && !this.I) {
            b();
        }
        i8.j T = n0Var.T();
        boolean z12 = false;
        for (int i10 = 0; i10 < T.f10636a; i10++) {
            i8.i iVar = T.f10637b[i10];
            if (iVar != null) {
                for (int i11 = 0; i11 < iVar.length(); i11++) {
                    if (k8.p.g(iVar.b(i11).B) == 2) {
                        c();
                        return;
                    }
                }
                continue;
            }
        }
        b();
        if (this.F) {
            k8.a.g(this.f6500t);
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            byte[] bArr = n0Var.V().f16519i;
            if (bArr != null) {
                z12 = g(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
            }
            if (z12 || g(this.G)) {
                return;
            }
        }
        c();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (p() && this.C != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.Q = true;
                return true;
            } else if (action == 1 && this.Q) {
                this.Q = false;
                performClick();
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!p() || this.C == null) {
            return false;
        }
        f(true);
        return true;
    }

    @EnsuresNonNullIf(expression = {"controller"}, result = ViewDataBinding.f1896i)
    public final boolean p() {
        if (this.D) {
            k8.a.g(this.f6503z);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        return j();
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        k8.a.g(this.f6497f);
        this.f6497f.setAspectRatioListener(bVar);
    }

    @Deprecated
    public void setControlDispatcher(w6.h hVar) {
        k8.a.g(this.f6503z);
        this.f6503z.setControlDispatcher(hVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.M = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.N = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        k8.a.g(this.f6503z);
        this.O = z10;
        m();
    }

    public void setControllerShowTimeoutMs(int i10) {
        k8.a.g(this.f6503z);
        this.L = i10;
        if (this.f6503z.e()) {
            i(h());
        }
    }

    public void setControllerVisibilityListener(PlayerControlView.d dVar) {
        k8.a.g(this.f6503z);
        PlayerControlView.d dVar2 = this.E;
        if (dVar2 == dVar) {
            return;
        }
        if (dVar2 != null) {
            this.f6503z.f6473f.remove(dVar2);
        }
        this.E = dVar;
        if (dVar != null) {
            PlayerControlView playerControlView = this.f6503z;
            Objects.requireNonNull(playerControlView);
            playerControlView.f6473f.add(dVar);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        k8.a.f(this.y != null);
        this.K = charSequence;
        n();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.G != drawable) {
            this.G = drawable;
            o(false);
        }
    }

    public void setErrorMessageProvider(k8.g<? super PlaybackException> gVar) {
        if (this.J != gVar) {
            this.J = gVar;
            n();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            o(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPlayer(w6.n0 r10) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerView.setPlayer(w6.n0):void");
    }

    public void setRepeatToggleModes(int i10) {
        k8.a.g(this.f6503z);
        this.f6503z.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        k8.a.g(this.f6497f);
        this.f6497f.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.H != i10) {
            this.H = i10;
            l();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        k8.a.g(this.f6503z);
        this.f6503z.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        k8.a.g(this.f6503z);
        this.f6503z.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        k8.a.g(this.f6503z);
        this.f6503z.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        k8.a.g(this.f6503z);
        this.f6503z.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        k8.a.g(this.f6503z);
        this.f6503z.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        k8.a.g(this.f6503z);
        this.f6503z.setShowShuffleButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f6498j;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setUseArtwork(boolean r7) {
        /*
            r6 = this;
            r2 = r6
            r4 = 0
            r0 = r4
            if (r7 == 0) goto Lf
            android.widget.ImageView r1 = r2.f6500t
            r4 = 1
            if (r1 == 0) goto Lc
            r4 = 2
            goto Lf
        Lc:
            r4 = 5
            r1 = 0
            goto L10
        Lf:
            r1 = 1
        L10:
            k8.a.f(r1)
            boolean r1 = r2.F
            r5 = 5
            if (r1 == r7) goto L1d
            r2.F = r7
            r2.o(r0)
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerView.setUseArtwork(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setUseController(boolean r6) {
        /*
            r5 = this;
            if (r6 == 0) goto Ld
            r3 = 7
            com.google.android.exoplayer2.ui.PlayerControlView r0 = r5.f6503z
            r3 = 2
            if (r0 == 0) goto L9
            goto Le
        L9:
            r3 = 3
            r0 = 0
            r3 = 2
            goto L10
        Ld:
            r4 = 1
        Le:
            r0 = 1
            r3 = 3
        L10:
            k8.a.f(r0)
            r2 = 6
            boolean r0 = r5.D
            if (r0 != r6) goto L19
            return
        L19:
            r3 = 7
            r5.D = r6
            r2 = 2
            boolean r1 = r5.p()
            r6 = r1
            if (r6 == 0) goto L2d
            com.google.android.exoplayer2.ui.PlayerControlView r6 = r5.f6503z
            w6.n0 r0 = r5.C
            r6.setPlayer(r0)
            r4 = 7
            goto L3e
        L2d:
            r2 = 2
            com.google.android.exoplayer2.ui.PlayerControlView r6 = r5.f6503z
            r2 = 6
            if (r6 == 0) goto L3e
            r4 = 5
            r6.c()
            com.google.android.exoplayer2.ui.PlayerControlView r6 = r5.f6503z
            r0 = 0
            r6.setPlayer(r0)
            r3 = 5
        L3e:
            r5.m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerView.setUseController(boolean):void");
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f6499m;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }
}
