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
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
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
public class StyledPlayerView extends FrameLayout {
    public static final /* synthetic */ int R = 0;
    public final FrameLayout A;
    public final FrameLayout B;
    public n0 C;
    public boolean D;
    public StyledPlayerControlView.m E;
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
    public final a f6562c;

    /* renamed from: f  reason: collision with root package name */
    public final AspectRatioFrameLayout f6563f;

    /* renamed from: j  reason: collision with root package name */
    public final View f6564j;

    /* renamed from: m  reason: collision with root package name */
    public final View f6565m;
    public final boolean n;

    /* renamed from: t  reason: collision with root package name */
    public final ImageView f6566t;

    /* renamed from: u  reason: collision with root package name */
    public final SubtitleView f6567u;

    /* renamed from: w  reason: collision with root package name */
    public final View f6568w;
    public final TextView y;

    /* renamed from: z  reason: collision with root package name */
    public final StyledPlayerControlView f6569z;

    /* loaded from: classes.dex */
    public final class a implements n0.e, View.OnLayoutChangeListener, View.OnClickListener, StyledPlayerControlView.m {

        /* renamed from: c  reason: collision with root package name */
        public final x0.b f6570c = new x0.b();

        /* renamed from: f  reason: collision with root package name */
        public Object f6571f;

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
            View view = StyledPlayerView.this.f6564j;
            if (view != null) {
                view.setVisibility(4);
            }
        }

        @Override // w6.n0.c
        public /* synthetic */ void P(n0.b bVar) {
        }

        @Override // y7.i
        public void R(List<y7.a> list) {
            SubtitleView subtitleView = StyledPlayerView.this.f6567u;
            if (subtitleView != null) {
                subtitleView.setCues(list);
            }
        }

        @Override // w6.n0.c
        public void W(w7.o oVar, i8.j jVar) {
            n0 n0Var = StyledPlayerView.this.C;
            Objects.requireNonNull(n0Var);
            x0 M = n0Var.M();
            if (M.q()) {
                this.f6571f = null;
            } else if (n0Var.L().b()) {
                Object obj = this.f6571f;
                if (obj != null) {
                    int b10 = M.b(obj);
                    if (b10 != -1) {
                        if (n0Var.z() == M.f(b10, this.f6570c).f16841c) {
                            return;
                        }
                    }
                    this.f6571f = null;
                }
            } else {
                this.f6571f = M.g(n0Var.r(), this.f6570c, true).f16840b;
            }
            StyledPlayerView.this.o(false);
        }

        @Override // w6.n0.c
        public void Y(boolean z10, int i10) {
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            int i11 = StyledPlayerView.R;
            styledPlayerView.l();
            StyledPlayerView styledPlayerView2 = StyledPlayerView.this;
            if (styledPlayerView2.e() && styledPlayerView2.N) {
                styledPlayerView2.d();
            } else {
                styledPlayerView2.f(false);
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
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            int i10 = StyledPlayerView.R;
            styledPlayerView.k();
        }

        @Override // l8.l
        public /* synthetic */ void b0(int i10, int i11) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.m
        public void c(int i10) {
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            int i11 = StyledPlayerView.R;
            styledPlayerView.m();
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
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            int i10 = StyledPlayerView.R;
            styledPlayerView.j();
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            StyledPlayerView.a((TextureView) view, StyledPlayerView.this.P);
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
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            int i11 = StyledPlayerView.R;
            styledPlayerView.l();
            StyledPlayerView.this.n();
            StyledPlayerView styledPlayerView2 = StyledPlayerView.this;
            if (styledPlayerView2.e() && styledPlayerView2.N) {
                styledPlayerView2.d();
            } else {
                styledPlayerView2.f(false);
            }
        }

        @Override // w6.n0.c
        public void w(n0.f fVar, n0.f fVar2, int i10) {
            StyledPlayerView styledPlayerView = StyledPlayerView.this;
            int i11 = StyledPlayerView.R;
            if (styledPlayerView.e()) {
                StyledPlayerView styledPlayerView2 = StyledPlayerView.this;
                if (styledPlayerView2.N) {
                    styledPlayerView2.d();
                }
            }
        }

        @Override // w6.n0.c
        public /* synthetic */ void z(boolean z10) {
        }
    }

    public StyledPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public StyledPlayerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        boolean z14;
        int i15;
        int i16;
        boolean z15;
        boolean z16;
        a aVar = new a();
        this.f6562c = aVar;
        if (isInEditMode()) {
            this.f6563f = null;
            this.f6564j = null;
            this.f6565m = null;
            this.n = false;
            this.f6566t = null;
            this.f6567u = null;
            this.f6568w = null;
            this.y = null;
            this.f6569z = null;
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
        int i17 = R.layout.exo_styled_player_view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, o9.b.f13626w, 0, 0);
            try {
                z13 = obtainStyledAttributes.hasValue(27);
                i14 = obtainStyledAttributes.getColor(27, 0);
                int resourceId = obtainStyledAttributes.getResourceId(14, R.layout.exo_styled_player_view);
                z14 = obtainStyledAttributes.getBoolean(32, true);
                i15 = obtainStyledAttributes.getResourceId(8, 0);
                boolean z17 = obtainStyledAttributes.getBoolean(33, true);
                i11 = obtainStyledAttributes.getInt(28, 1);
                i12 = obtainStyledAttributes.getInt(16, 0);
                int i18 = obtainStyledAttributes.getInt(25, 5000);
                z10 = obtainStyledAttributes.getBoolean(10, true);
                boolean z18 = obtainStyledAttributes.getBoolean(3, true);
                int integer = obtainStyledAttributes.getInteger(22, 0);
                this.I = obtainStyledAttributes.getBoolean(11, this.I);
                boolean z19 = obtainStyledAttributes.getBoolean(9, true);
                obtainStyledAttributes.recycle();
                z12 = z19;
                i17 = resourceId;
                i13 = integer;
                i16 = i18;
                z11 = z18;
                z15 = z17;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i11 = 1;
            z10 = true;
            z11 = true;
            i12 = 0;
            i13 = 0;
            z12 = true;
            i14 = 0;
            z13 = false;
            z14 = true;
            i15 = 0;
            i16 = 5000;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i17, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.f6563f = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i12);
        }
        View findViewById = findViewById(R.id.exo_shutter);
        this.f6564j = findViewById;
        if (findViewById != null && z13) {
            findViewById.setBackgroundColor(i14);
        }
        if (aspectRatioFrameLayout == null || i11 == 0) {
            this.f6565m = null;
            z16 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i11 == 2) {
                this.f6565m = new TextureView(context);
            } else if (i11 == 3) {
                try {
                    this.f6565m = (View) Class.forName("com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView").getConstructor(Context.class).newInstance(context);
                    z16 = true;
                    this.f6565m.setLayoutParams(layoutParams);
                    this.f6565m.setOnClickListener(aVar);
                    this.f6565m.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f6565m, 0);
                } catch (Exception e10) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            } else if (i11 != 4) {
                this.f6565m = new SurfaceView(context);
            } else {
                try {
                    this.f6565m = (View) Class.forName("com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView").getConstructor(Context.class).newInstance(context);
                } catch (Exception e11) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                }
            }
            z16 = false;
            this.f6565m.setLayoutParams(layoutParams);
            this.f6565m.setOnClickListener(aVar);
            this.f6565m.setClickable(false);
            aspectRatioFrameLayout.addView(this.f6565m, 0);
        }
        this.n = z16;
        this.A = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.B = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.f6566t = imageView2;
        this.F = z14 && imageView2 != null;
        if (i15 != 0) {
            Context context2 = getContext();
            Object obj = c0.a.f3717a;
            this.G = a.c.b(context2, i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.f6567u = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View findViewById2 = findViewById(R.id.exo_buffering);
        this.f6568w = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.H = i13;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.y = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        StyledPlayerControlView styledPlayerControlView = (StyledPlayerControlView) findViewById(R.id.exo_controller);
        View findViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (styledPlayerControlView != null) {
            this.f6569z = styledPlayerControlView;
        } else if (findViewById3 != null) {
            StyledPlayerControlView styledPlayerControlView2 = new StyledPlayerControlView(context, null, 0, attributeSet);
            this.f6569z = styledPlayerControlView2;
            styledPlayerControlView2.setId(R.id.exo_controller);
            styledPlayerControlView2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(styledPlayerControlView2, indexOfChild);
        } else {
            this.f6569z = null;
        }
        StyledPlayerControlView styledPlayerControlView3 = this.f6569z;
        this.L = styledPlayerControlView3 != null ? i16 : 0;
        this.O = z10;
        this.M = z11;
        this.N = z12;
        this.D = z15 && styledPlayerControlView3 != null;
        if (styledPlayerControlView3 != null) {
            l lVar = styledPlayerControlView3.f6537y0;
            int i19 = lVar.f6646z;
            if (i19 != 3 && i19 != 2) {
                lVar.h();
                lVar.k(2);
            }
            StyledPlayerControlView styledPlayerControlView4 = this.f6569z;
            Objects.requireNonNull(styledPlayerControlView4);
            styledPlayerControlView4.f6513f.add(aVar);
        }
        m();
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
        View view = this.f6564j;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public final void c() {
        ImageView imageView = this.f6566t;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.f6566t.setVisibility(4);
        }
    }

    public void d() {
        StyledPlayerControlView styledPlayerControlView = this.f6569z;
        if (styledPlayerControlView != null) {
            styledPlayerControlView.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        n0 n0Var = this.C;
        if (n0Var == null || !n0Var.a()) {
            int keyCode = keyEvent.getKeyCode();
            boolean z10 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
            if (z10 && p() && !this.f6569z.i()) {
                f(true);
            } else {
                if (!(p() && this.f6569z.c(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
                    if (z10 && p()) {
                        f(true);
                        return false;
                    }
                    return false;
                }
                f(true);
            }
            return true;
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
            boolean z11 = this.f6569z.i() && this.f6569z.getShowTimeoutMs() <= 0;
            boolean h10 = h();
            if (!z10) {
                if (!z11) {
                    if (h10) {
                    }
                }
            }
            i(h10);
        }
    }

    @RequiresNonNull({"artworkView"})
    public final boolean g(Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f10 = intrinsicWidth / intrinsicHeight;
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f6563f;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(f10);
                }
                this.f6566t.setImageDrawable(drawable);
                this.f6566t.setVisibility(0);
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
        StyledPlayerControlView styledPlayerControlView = this.f6569z;
        if (styledPlayerControlView != null) {
            arrayList.add(new cb.e(styledPlayerControlView, 0));
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
        k8.a.g(this.f6563f);
        return this.f6563f.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f6567u;
    }

    public boolean getUseArtwork() {
        return this.F;
    }

    public boolean getUseController() {
        return this.D;
    }

    public View getVideoSurfaceView() {
        return this.f6565m;
    }

    public final boolean h() {
        n0 n0Var = this.C;
        if (n0Var == null) {
            return true;
        }
        int g10 = n0Var.g();
        if (this.M && !this.C.M().q()) {
            if (g10 == 1 || g10 == 4) {
                return true;
            }
            n0 n0Var2 = this.C;
            Objects.requireNonNull(n0Var2);
            if (!n0Var2.k()) {
                return true;
            }
        }
        return false;
    }

    public final void i(boolean z10) {
        if (p()) {
            this.f6569z.setShowTimeoutMs(z10 ? 0 : this.L);
            l lVar = this.f6569z.f6537y0;
            if (!lVar.f6624a.j()) {
                lVar.f6624a.setVisibility(0);
                lVar.f6624a.k();
                View view = lVar.f6624a.n;
                if (view != null) {
                    view.requestFocus();
                }
            }
            lVar.m();
        }
    }

    public final boolean j() {
        if (p()) {
            if (this.C != null) {
                if (!this.f6569z.i()) {
                    f(true);
                    return true;
                } else if (this.O) {
                    this.f6569z.h();
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k() {
        /*
            r8 = this;
            w6.n0 r0 = r8.C
            r6 = 2
            if (r0 == 0) goto Lb
            r6 = 6
            l8.s r0 = r0.u()
            goto Ld
        Lb:
            l8.s r0 = l8.s.f12742e
        Ld:
            int r1 = r0.f12743a
            int r2 = r0.f12744b
            r7 = 1
            int r3 = r0.f12745c
            r4 = 0
            if (r2 == 0) goto L27
            r6 = 7
            if (r1 != 0) goto L1c
            r7 = 2
            goto L27
        L1c:
            r6 = 6
            float r1 = (float) r1
            float r0 = r0.d
            r6 = 5
            float r1 = r1 * r0
            float r0 = (float) r2
            float r1 = r1 / r0
            r7 = 2
            goto L29
        L27:
            r1 = 0
            r7 = 5
        L29:
            android.view.View r0 = r8.f6565m
            boolean r2 = r0 instanceof android.view.TextureView
            r7 = 3
            if (r2 == 0) goto L69
            r7 = 4
            int r2 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r2 <= 0) goto L46
            r2 = 90
            r7 = 3
            if (r3 == r2) goto L40
            r5 = 270(0x10e, float:3.78E-43)
            r2 = r5
            if (r3 != r2) goto L46
            r7 = 4
        L40:
            r2 = 1065353216(0x3f800000, float:1.0)
            r7 = 4
            float r2 = r2 / r1
            r7 = 6
            r1 = r2
        L46:
            int r2 = r8.P
            r6 = 3
            if (r2 == 0) goto L51
            com.google.android.exoplayer2.ui.StyledPlayerView$a r2 = r8.f6562c
            r7 = 1
            r0.removeOnLayoutChangeListener(r2)
        L51:
            r8.P = r3
            if (r3 == 0) goto L5e
            android.view.View r0 = r8.f6565m
            r7 = 5
            com.google.android.exoplayer2.ui.StyledPlayerView$a r2 = r8.f6562c
            r7 = 2
            r0.addOnLayoutChangeListener(r2)
        L5e:
            r6 = 4
            android.view.View r0 = r8.f6565m
            r7 = 1
            android.view.TextureView r0 = (android.view.TextureView) r0
            int r2 = r8.P
            a(r0, r2)
        L69:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r0 = r8.f6563f
            boolean r2 = r8.n
            if (r2 == 0) goto L71
            r7 = 1
            goto L72
        L71:
            r4 = r1
        L72:
            if (r0 == 0) goto L79
            r7 = 1
            r0.setAspectRatio(r4)
            r6 = 6
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.StyledPlayerView.k():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r7.C.k() != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            r7 = this;
            r4 = r7
            android.view.View r0 = r4.f6568w
            if (r0 == 0) goto L39
            w6.n0 r0 = r4.C
            java.lang.String r6 = "Ⓢⓜⓞⓑ⓸⓺"
            r1 = 1
            r6 = 0
            r2 = r6
            if (r0 == 0) goto L2a
            r6 = 1
            int r6 = r0.g()
            r0 = r6
            r3 = 2
            if (r0 != r3) goto L2a
            r6 = 1
            int r0 = r4.H
            r6 = 7
            if (r0 == r3) goto L2c
            r6 = 6
            if (r0 != r1) goto L2a
            r6 = 7
            w6.n0 r0 = r4.C
            boolean r0 = r0.k()
            if (r0 == 0) goto L2a
            goto L2d
        L2a:
            r1 = 0
            r6 = 5
        L2c:
            r6 = 5
        L2d:
            android.view.View r0 = r4.f6568w
            if (r1 == 0) goto L33
            r6 = 1
            goto L36
        L33:
            r6 = 3
            r2 = 8
        L36:
            r0.setVisibility(r2)
        L39:
            r6 = 3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.StyledPlayerView.l():void");
    }

    public final void m() {
        StyledPlayerControlView styledPlayerControlView = this.f6569z;
        if (styledPlayerControlView == null || !this.D) {
            setContentDescription(null);
        } else if (styledPlayerControlView.i()) {
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
            if (!this.I) {
                c();
                b();
            }
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
            k8.a.g(this.f6566t);
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
                return performClick();
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
            k8.a.g(this.f6569z);
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
        k8.a.g(this.f6563f);
        this.f6563f.setAspectRatioListener(bVar);
    }

    @Deprecated
    public void setControlDispatcher(w6.h hVar) {
        k8.a.g(this.f6569z);
        this.f6569z.setControlDispatcher(hVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.M = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.N = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        k8.a.g(this.f6569z);
        this.O = z10;
        m();
    }

    public void setControllerOnFullScreenModeChangedListener(StyledPlayerControlView.d dVar) {
        k8.a.g(this.f6569z);
        this.f6569z.setOnFullScreenModeChangedListener(dVar);
    }

    public void setControllerShowTimeoutMs(int i10) {
        k8.a.g(this.f6569z);
        this.L = i10;
        if (this.f6569z.i()) {
            i(h());
        }
    }

    public void setControllerVisibilityListener(StyledPlayerControlView.m mVar) {
        k8.a.g(this.f6569z);
        StyledPlayerControlView.m mVar2 = this.E;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.f6569z.f6513f.remove(mVar2);
        }
        this.E = mVar;
        if (mVar != null) {
            StyledPlayerControlView styledPlayerControlView = this.f6569z;
            Objects.requireNonNull(styledPlayerControlView);
            styledPlayerControlView.f6513f.add(mVar);
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPlayer(w6.n0 r9) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.StyledPlayerView.setPlayer(w6.n0):void");
    }

    public void setRepeatToggleModes(int i10) {
        k8.a.g(this.f6569z);
        this.f6569z.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        k8.a.g(this.f6563f);
        this.f6563f.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.H != i10) {
            this.H = i10;
            l();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        k8.a.g(this.f6569z);
        this.f6569z.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        k8.a.g(this.f6569z);
        this.f6569z.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        k8.a.g(this.f6569z);
        this.f6569z.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        k8.a.g(this.f6569z);
        this.f6569z.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        k8.a.g(this.f6569z);
        this.f6569z.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        k8.a.g(this.f6569z);
        this.f6569z.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        k8.a.g(this.f6569z);
        this.f6569z.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        k8.a.g(this.f6569z);
        this.f6569z.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f6564j;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setUseArtwork(boolean r7) {
        /*
            r6 = this;
            r2 = 0
            r0 = r2
            if (r7 == 0) goto Ld
            android.widget.ImageView r1 = r6.f6566t
            r4 = 2
            if (r1 == 0) goto La
            goto Le
        La:
            r2 = 0
            r1 = r2
            goto L10
        Ld:
            r5 = 3
        Le:
            r1 = 1
            r4 = 5
        L10:
            k8.a.f(r1)
            boolean r1 = r6.F
            if (r1 == r7) goto L1d
            r6.F = r7
            r6.o(r0)
            r4 = 3
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.StyledPlayerView.setUseArtwork(boolean):void");
    }

    public void setUseController(boolean z10) {
        k8.a.f((z10 && this.f6569z == null) ? false : true);
        if (this.D == z10) {
            return;
        }
        this.D = z10;
        if (p()) {
            this.f6569z.setPlayer(this.C);
        } else {
            StyledPlayerControlView styledPlayerControlView = this.f6569z;
            if (styledPlayerControlView != null) {
                styledPlayerControlView.h();
                this.f6569z.setPlayer(null);
            }
        }
        m();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f6565m;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }
}
