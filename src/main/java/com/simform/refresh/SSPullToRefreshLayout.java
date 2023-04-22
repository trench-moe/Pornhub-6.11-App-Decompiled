package com.simform.refresh;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import com.app.pornhub.domain.config.DvdsConfig;
import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import n0.a0;
import n0.i;
import n0.j;
import n0.m;
import n0.x;

@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005CDEFGB\u001d\u0012\b\u0010>\u001a\u0004\u0018\u00010=\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010?¢\u0006\u0004\bA\u0010BJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bJ\u0010\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eJ\u0010\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u001eJ\u000e\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0004J\u000e\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'J\u000e\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020'J\b\u0010,\u001a\u00020\u0004H\u0016J\u0010\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-H\u0016J\u000e\u00101\u001a\u00020\u00062\u0006\u00100\u001a\u00020-J\u000e\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u000202J\u0010\u00107\u001a\u00020\u00062\b\u00106\u001a\u0004\u0018\u000105R\u0014\u0010:\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010<\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b;\u00109¨\u0006H"}, d2 = {"Lcom/simform/refresh/SSPullToRefreshLayout;", "Landroid/view/ViewGroup;", BuildConfig.FLAVOR, "Ln0/i;", BuildConfig.FLAVOR, "offsetY", BuildConfig.FLAVOR, "setTargetOrRefreshViewOffsetY", "Landroid/view/View;", "refreshView", "setRefreshView", "Landroid/view/ViewGroup$LayoutParams;", "params", "setRefreshViewParams", BuildConfig.FLAVOR, "assetFileName", "setLottieAnimation", "rawResource", "setGifAnimation", "imageResource", "setImageAsRefresh", "Lid/d;", "dragDistanceConverter", "setDragDistanceConverter", "Lcom/simform/refresh/SSPullToRefreshLayout$RepeatCount;", "count", "setRepeatCount", "Lcom/simform/refresh/SSPullToRefreshLayout$RepeatMode;", "mode", "setRepeatMode", "Landroid/view/animation/Interpolator;", "animateToStartInterpolator", "setAnimateToStartInterpolator", "animateToRefreshInterpolator", "setAnimateToRefreshInterpolator", "animateToStartDuration", "setAnimateToStartDuration", "animateToRefreshDuration", "setAnimateToRefreshDuration", BuildConfig.FLAVOR, "refreshTargetOffset", "setRefreshTargetOffset", "refreshInitialOffset", "setRefreshInitialOffset", "getNestedScrollAxes", BuildConfig.FLAVOR, "enabled", "setNestedScrollingEnabled", "refreshing", "setRefreshing", "Lcom/simform/refresh/SSPullToRefreshLayout$RefreshStyle;", "refreshStyle", "setRefreshStyle", "Lcom/simform/refresh/SSPullToRefreshLayout$a;", "listener", "setOnRefreshListener", "getTargetOrRefreshViewTop", "()I", "targetOrRefreshViewTop", "getTargetOrRefreshViewOffset", "targetOrRefreshViewOffset", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "LayoutParams", "a", "RefreshStyle", "RepeatCount", "RepeatMode", "sspulltorefresh_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class SSPullToRefreshLayout extends ViewGroup implements i {

    /* renamed from: l0  reason: collision with root package name */
    public static final /* synthetic */ int f8453l0 = 0;
    public float A;
    public float B;
    public float C;
    public float D;
    public float E;
    public float F;
    public int G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public RefreshStyle V;
    public View W;

    /* renamed from: a0  reason: collision with root package name */
    public View f8454a0;

    /* renamed from: b0  reason: collision with root package name */
    public id.d f8455b0;

    /* renamed from: c  reason: collision with root package name */
    public final String f8456c;

    /* renamed from: c0  reason: collision with root package name */
    public String f8457c0;

    /* renamed from: d0  reason: collision with root package name */
    public ViewGroup.LayoutParams f8458d0;

    /* renamed from: e0  reason: collision with root package name */
    public a f8459e0;

    /* renamed from: f  reason: collision with root package name */
    public final String f8460f;

    /* renamed from: f0  reason: collision with root package name */
    public Interpolator f8461f0;

    /* renamed from: g0  reason: collision with root package name */
    public Interpolator f8462g0;

    /* renamed from: h0  reason: collision with root package name */
    public final Animation f8463h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Animation f8464i0;

    /* renamed from: j  reason: collision with root package name */
    public final String f8465j;

    /* renamed from: j0  reason: collision with root package name */
    public final Animation.AnimationListener f8466j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Animation.AnimationListener f8467k0;

    /* renamed from: m  reason: collision with root package name */
    public float f8468m;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f8469t;

    /* renamed from: u  reason: collision with root package name */
    public final int[] f8470u;

    /* renamed from: w  reason: collision with root package name */
    public final j f8471w;
    public final m y;

    /* renamed from: z  reason: collision with root package name */
    public float f8472z;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/simform/refresh/SSPullToRefreshLayout$LayoutParams;", "Landroid/view/ViewGroup$MarginLayoutParams;", "Landroid/content/Context;", DvdsConfig.TYPE_CATEGORY, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sspulltorefresh_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/simform/refresh/SSPullToRefreshLayout$RefreshStyle;", BuildConfig.FLAVOR, "NORMAL", "PINNED", "FLOAT", "sspulltorefresh_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public enum RefreshStyle {
        NORMAL,
        PINNED,
        FLOAT
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/simform/refresh/SSPullToRefreshLayout$RepeatCount;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "count", "I", "b", "()I", "INFINITE", "ONCE", "TWICE", "THRICE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "ELEVEN", "TWELVE", "sspulltorefresh_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public enum RepeatCount {
        INFINITE(-1),
        ONCE(1),
        TWICE(2),
        THRICE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        ELEVEN(11),
        TWELVE(12);
        
        private final int count;

        RepeatCount(int i10) {
            this.count = i10;
        }

        public final int b() {
            return this.count;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/simform/refresh/SSPullToRefreshLayout$RepeatMode;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "mode", "I", "b", "()I", "REPEAT", "REVERSE", "sspulltorefresh_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public enum RepeatMode {
        REPEAT(1),
        REVERSE(2);
        
        private final int mode;

        RepeatMode(int i10) {
            this.mode = i10;
        }

        public final int b() {
            return this.mode;
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        void a();
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RefreshStyle.values().length];
            iArr[2] = 1;
            iArr[1] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends Animation {

        /* loaded from: classes.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RefreshStyle.values().length];
                iArr[2] = 1;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation t2) {
            Intrinsics.checkNotNullParameter(t2, "t");
            if (a.$EnumSwitchMapping$0[SSPullToRefreshLayout.this.V.ordinal()] == 1) {
                SSPullToRefreshLayout sSPullToRefreshLayout = SSPullToRefreshLayout.this;
                SSPullToRefreshLayout.a(sSPullToRefreshLayout, sSPullToRefreshLayout.A + sSPullToRefreshLayout.f8472z, sSPullToRefreshLayout.f8454a0.getTop(), f10);
                return;
            }
            SSPullToRefreshLayout sSPullToRefreshLayout2 = SSPullToRefreshLayout.this;
            View view = sSPullToRefreshLayout2.W;
            if (view == null) {
                return;
            }
            SSPullToRefreshLayout.a(sSPullToRefreshLayout2, sSPullToRefreshLayout2.A, view.getTop(), f10);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends Animation {

        /* loaded from: classes.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RefreshStyle.values().length];
                iArr[2] = 1;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public d() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation t2) {
            Intrinsics.checkNotNullParameter(t2, "t");
            if (a.$EnumSwitchMapping$0[SSPullToRefreshLayout.this.V.ordinal()] == 1) {
                SSPullToRefreshLayout sSPullToRefreshLayout = SSPullToRefreshLayout.this;
                SSPullToRefreshLayout.a(sSPullToRefreshLayout, sSPullToRefreshLayout.f8472z, sSPullToRefreshLayout.f8454a0.getTop(), f10);
                return;
            }
            SSPullToRefreshLayout sSPullToRefreshLayout2 = SSPullToRefreshLayout.this;
            View view = sSPullToRefreshLayout2.W;
            if (view == null) {
                return;
            }
            SSPullToRefreshLayout.a(sSPullToRefreshLayout2, 0.0f, view.getTop(), f10);
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            SSPullToRefreshLayout sSPullToRefreshLayout = SSPullToRefreshLayout.this;
            if (sSPullToRefreshLayout.L) {
                a aVar = sSPullToRefreshLayout.f8459e0;
                if (aVar == null) {
                    SSPullToRefreshLayout.this.H = false;
                }
                aVar.a();
            }
            SSPullToRefreshLayout.this.H = false;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            SSPullToRefreshLayout sSPullToRefreshLayout = SSPullToRefreshLayout.this;
            sSPullToRefreshLayout.H = true;
            ((id.b) sSPullToRefreshLayout.f8454a0).g();
        }
    }

    /* loaded from: classes.dex */
    public static final class f implements Animation.AnimationListener {
        public f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            SSPullToRefreshLayout sSPullToRefreshLayout = SSPullToRefreshLayout.this;
            int i10 = SSPullToRefreshLayout.f8453l0;
            sSPullToRefreshLayout.m();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            SSPullToRefreshLayout sSPullToRefreshLayout = SSPullToRefreshLayout.this;
            sSPullToRefreshLayout.H = true;
            ((id.b) sSPullToRefreshLayout.f8454a0).h();
        }
    }

    public SSPullToRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8456c = SSPullToRefreshLayout.class.getName();
        this.f8460f = "For this method to use you need to Provide SSAnimationView as RefreshView";
        this.f8465j = "For this method to use you need to Provide SSLottieAnimationView as RefreshView";
        this.f8469t = new int[2];
        this.f8470u = new int[2];
        this.N = -1;
        this.O = -1;
        this.P = 300;
        this.Q = 300;
        this.R = ViewConfiguration.get(context).getScaledTouchSlop();
        this.V = RefreshStyle.NORMAL;
        this.f8457c0 = "lottie_rolling_dots.json";
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i10 = (int) (70 * displayMetrics.density);
        this.f8458d0 = new ViewGroup.MarginLayoutParams(-1, i10);
        this.A = 50 * displayMetrics.density;
        this.y = new m();
        this.f8471w = new j(this);
        setNestedScrollingEnabled(true);
        setChildrenDrawingOrderEnabled(true);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext()");
        id.a aVar = new id.a(context2);
        this.f8454a0 = aVar;
        aVar.setAnimation(this.f8457c0);
        this.f8454a0.setVisibility(8);
        addView(this.f8454a0, new LayoutParams(i10, i10));
        this.f8455b0 = new id.d();
        this.f8461f0 = new DecelerateInterpolator(2.0f);
        this.f8462g0 = new DecelerateInterpolator(2.0f);
        this.f8463h0 = new c();
        this.f8464i0 = new d();
        this.f8466j0 = new e();
        this.f8467k0 = new f();
    }

    public static final void a(SSPullToRefreshLayout sSPullToRefreshLayout, float f10, float f11, float f12) {
        float f13 = sSPullToRefreshLayout.G;
        sSPullToRefreshLayout.setTargetOrRefreshViewOffsetY((int) (((int) a0.a.b(f10, f13, f12, f13)) - f11));
    }

    private final int getTargetOrRefreshViewOffset() {
        if (b.$EnumSwitchMapping$0[this.V.ordinal()] == 1) {
            return (int) (this.f8454a0.getTop() - this.f8472z);
        }
        View view = this.W;
        Intrinsics.checkNotNull(view);
        return view.getTop();
    }

    private final int getTargetOrRefreshViewTop() {
        if (b.$EnumSwitchMapping$0[this.V.ordinal()] == 1) {
            return this.f8454a0.getTop();
        }
        View view = this.W;
        Intrinsics.checkNotNull(view);
        return view.getTop();
    }

    private final void setTargetOrRefreshViewOffsetY(int i10) {
        int top;
        if (this.W == null) {
            return;
        }
        int ordinal = this.V.ordinal();
        if (ordinal == 1) {
            View view = this.W;
            Intrinsics.checkNotNull(view);
            view.offsetTopAndBottom(i10);
            View view2 = this.W;
            Intrinsics.checkNotNull(view2);
            top = view2.getTop();
        } else if (ordinal != 2) {
            View view3 = this.W;
            Intrinsics.checkNotNull(view3);
            view3.offsetTopAndBottom(i10);
            this.f8454a0.offsetTopAndBottom(i10);
            View view4 = this.W;
            Intrinsics.checkNotNull(view4);
            top = view4.getTop();
        } else {
            this.f8454a0.offsetTopAndBottom(i10);
            top = this.f8454a0.getTop();
        }
        float f10 = top;
        this.F = f10;
        Log.i(this.f8456c, Intrinsics.stringPlus("current offset", Float.valueOf(f10)));
        if (b.$EnumSwitchMapping$0[this.V.ordinal()] == 1) {
            float f11 = this.F;
            ((id.b) this.f8454a0).f(f11, (f11 - this.f8472z) / this.A);
        } else {
            float f12 = this.F;
            ((id.b) this.f8454a0).f(f12, f12 / this.A);
        }
        if (!(this.E == 0.0f) && this.f8454a0.getVisibility() != 0) {
            this.f8454a0.setVisibility(0);
        }
        invalidate();
    }

    public final void b(int i10, Animation.AnimationListener animationListener) {
        float f10;
        clearAnimation();
        if (f(i10) <= 0) {
            this.f8464i0.cancel();
            m();
            return;
        }
        this.G = i10;
        this.f8464i0.reset();
        this.f8464i0.setDuration(f(f10));
        this.f8464i0.setInterpolator(this.f8461f0);
        if (animationListener != null) {
            this.f8464i0.setAnimationListener(animationListener);
        }
        startAnimation(this.f8464i0);
    }

    public final void c(int i10, Animation.AnimationListener animationListener) {
        float f10;
        clearAnimation();
        if (e(i10) <= 0) {
            this.f8463h0.cancel();
            return;
        }
        this.G = i10;
        this.f8463h0.reset();
        this.f8463h0.setDuration(e(f10));
        this.f8463h0.setInterpolator(this.f8462g0);
        if (animationListener != null) {
            this.f8463h0.setAnimationListener(animationListener);
        }
        startAnimation(this.f8463h0);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p10) {
        Intrinsics.checkNotNullParameter(p10, "p");
        return p10 instanceof LayoutParams;
    }

    public final boolean d(View view) {
        int i10 = 0;
        if (view == null) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (i10 < childCount) {
                int i11 = i10 + 1;
                if (d(viewGroup.getChildAt(i10))) {
                    return true;
                }
                i10 = i11;
            }
        }
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        return view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f8471w.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f8471w.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f8471w.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f8471w.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            onStopNestedScroll(this);
        }
        return super.dispatchTouchEvent(ev);
    }

    public final int e(float f10) {
        float coerceAtLeast;
        int i10;
        Log.i(this.f8456c, Intrinsics.stringPlus("from -- refreshing ", Float.valueOf(f10)));
        if (f10 < this.f8472z) {
            return 0;
        }
        if (b.$EnumSwitchMapping$0[this.V.ordinal()] == 1) {
            coerceAtLeast = RangesKt.coerceAtLeast(0.0f, RangesKt.coerceAtMost(1.0f, Math.abs((f10 - this.f8472z) - this.A) / this.A));
            i10 = this.Q;
        } else {
            coerceAtLeast = RangesKt.coerceAtLeast(0.0f, RangesKt.coerceAtMost(1.0f, Math.abs(f10 - this.A) / this.A));
            i10 = this.Q;
        }
        return (int) (coerceAtLeast * i10);
    }

    public final int f(float f10) {
        float coerceAtLeast;
        int i10;
        Log.i(this.f8456c, Intrinsics.stringPlus("from -- start ", Float.valueOf(f10)));
        if (f10 < this.f8472z) {
            return 0;
        }
        if (b.$EnumSwitchMapping$0[this.V.ordinal()] == 1) {
            coerceAtLeast = RangesKt.coerceAtLeast(0.0f, RangesKt.coerceAtMost(1.0f, Math.abs(f10 - this.f8472z) / this.A));
            i10 = this.P;
        } else {
            coerceAtLeast = RangesKt.coerceAtLeast(0.0f, RangesKt.coerceAtMost(1.0f, Math.abs(f10) / this.A));
            i10 = this.P;
        }
        return (int) (coerceAtLeast * i10);
    }

    public final void g() {
        boolean z10;
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= childCount) {
                z10 = false;
                break;
            }
            int i12 = i11 + 1;
            if (this.W == getChildAt(i11)) {
                z10 = true;
                break;
            }
            i11 = i12;
        }
        if (!z10) {
            int childCount2 = getChildCount();
            while (i10 < childCount2) {
                int i13 = i10 + 1;
                View childAt = getChildAt(i10);
                if (!Intrinsics.areEqual(childAt, this.f8454a0)) {
                    this.W = childAt;
                    return;
                }
                i10 = i13;
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        return new LayoutParams(getContext(), attrs);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p10) {
        Intrinsics.checkNotNullParameter(p10, "p");
        return new LayoutParams(p10);
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        if (b.$EnumSwitchMapping$0[this.V.ordinal()] == 1) {
            int i12 = this.N;
            return i12 < 0 ? i11 : i11 == i10 - 1 ? i12 : i11 >= i12 ? i11 + 1 : i11;
        }
        int i13 = this.N;
        if (i13 < 0) {
            return i11;
        }
        if (i11 == 0) {
            return i13;
        }
        if (i11 <= i13) {
            i11--;
        }
        return i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.y.a();
    }

    public final void h() {
        if (!this.I && !this.H) {
            if (getTargetOrRefreshViewOffset() > this.A) {
                o(true, true);
                return;
            }
            this.I = false;
            b((int) this.F, this.f8467k0);
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f8471w.i();
    }

    public final float i(MotionEvent motionEvent, int i10) {
        int findPointerIndex = motionEvent.findPointerIndex(i10);
        if (findPointerIndex < 0) {
            return -1.0f;
        }
        return motionEvent.getY(findPointerIndex);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f8471w.d;
    }

    public final void j(float f10) {
        float f11 = this.B;
        float f12 = f10 - f11;
        if (this.I) {
            int i10 = this.R;
            if (f12 > i10 || this.F > 0.0f) {
                this.K = true;
                this.D = f11 + i10;
                return;
            }
        }
        if (this.K) {
            return;
        }
        int i11 = this.R;
        if (f12 > i11) {
            this.D = f11 + i11;
            this.K = true;
        }
    }

    public final void k(float f10) {
        float f11;
        float f12;
        this.E = f10;
        if (this.I) {
            f11 = this.A;
            f12 = f10 > f11 ? f11 : f10;
            if (f12 < 0.0f) {
                f12 = 0.0f;
            }
        } else {
            if (b.$EnumSwitchMapping$0[this.V.ordinal()] == 1) {
                f12 = this.f8455b0.a(f10, this.A) + this.f8472z;
                f11 = this.A;
            } else {
                f12 = this.f8455b0.a(f10, this.A);
                f11 = this.A;
            }
        }
        if (!this.I) {
            if (f12 > f11 && !this.J) {
                this.J = true;
                ((id.b) this.f8454a0).e();
                String str = this.f8456c;
                Log.i(str, f10 + " -- " + f11 + " -- " + f12 + " -- " + this.F + " -- " + this.A);
                setTargetOrRefreshViewOffsetY((int) (f12 - this.F));
            } else if (f12 <= f11 && this.J) {
                this.J = false;
                ((id.b) this.f8454a0).d();
            }
        }
        String str2 = this.f8456c;
        Log.i(str2, f10 + " -- " + f11 + " -- " + f12 + " -- " + this.F + " -- " + this.A);
        setTargetOrRefreshViewOffsetY((int) (f12 - this.F));
    }

    public final void l(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.O) {
            this.O = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
        float i10 = i(motionEvent, this.O) - this.E;
        this.D = i10;
        Log.i(this.f8456c, Intrinsics.stringPlus(" onUp ", Float.valueOf(i10)));
    }

    public final void m() {
        if (b.$EnumSwitchMapping$0[this.V.ordinal()] == 1) {
            setTargetOrRefreshViewOffsetY((int) (this.f8472z - this.F));
        } else {
            setTargetOrRefreshViewOffsetY((int) (0 - this.F));
        }
        this.E = 0.0f;
        ((id.b) this.f8454a0).a();
        this.f8454a0.setVisibility(8);
        this.I = false;
        this.H = false;
    }

    public final void n() {
        this.C = 0.0f;
        this.K = false;
        this.M = false;
        this.O = -1;
    }

    public final void o(boolean z10, boolean z11) {
        if (this.I != z10) {
            this.L = z11;
            this.I = z10;
            if (z10) {
                c((int) this.F, this.f8466j0);
                return;
            }
            b((int) this.F, this.f8467k0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m();
        clearAnimation();
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        g();
        if (this.W == null) {
            return false;
        }
        boolean z10 = true;
        if (b.$EnumSwitchMapping$0[this.V.ordinal()] != 1) {
            if (isEnabled()) {
                if (d(this.W) && !this.M) {
                }
            }
            return false;
        } else if (!isEnabled() || d(this.W) || this.I || this.n) {
            return false;
        }
        int actionMasked = ev.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i10 = this.O;
                    if (i10 == -1) {
                        return false;
                    }
                    float i11 = i(ev, i10);
                    if (i11 != -1.0f) {
                        z10 = false;
                    }
                    if (z10) {
                        return false;
                    }
                    j(i11);
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        l(ev);
                    }
                }
            }
            this.K = false;
            this.O = -1;
        } else {
            int pointerId = ev.getPointerId(0);
            this.O = pointerId;
            this.K = false;
            float i12 = i(ev, pointerId);
            if (i12 != -1.0f) {
                z10 = false;
            }
            if (z10) {
                return false;
            }
            if (this.f8463h0.hasEnded() && this.f8464i0.hasEnded()) {
                this.H = false;
            }
            this.B = i12;
            this.C = this.F;
            this.M = false;
        }
        return this.K;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        float f10;
        if (getChildCount() == 0) {
            return;
        }
        g();
        if (this.W == null) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingTop = getPaddingTop();
        int i14 = b.$EnumSwitchMapping$0[this.V.ordinal()];
        if (i14 != 1) {
            paddingTop += (int) (i14 != 2 ? this.F : this.F);
        }
        int paddingLeft = getPaddingLeft();
        int paddingLeft2 = ((paddingLeft + measuredWidth) - getPaddingLeft()) - getPaddingRight();
        int paddingTop2 = ((measuredHeight + paddingTop) - getPaddingTop()) - getPaddingBottom();
        try {
            View view = this.W;
            Intrinsics.checkNotNull(view);
            view.layout(paddingLeft, paddingTop, paddingLeft2, paddingTop2);
        } catch (Exception e10) {
            String str = this.f8456c;
            Log.e(str, "error: ignored=" + e10 + ' ' + e10.getStackTrace());
        }
        int measuredWidth2 = (measuredWidth - this.f8454a0.getMeasuredWidth()) / 2;
        int i15 = (int) this.f8472z;
        int i16 = b.$EnumSwitchMapping$0[this.V.ordinal()];
        if (i16 != 1) {
            if (i16 != 2) {
                f10 = this.F;
            }
            this.f8454a0.layout(measuredWidth2, i15, (this.f8454a0.getMeasuredWidth() + measuredWidth) / 2, this.f8454a0.getMeasuredHeight() + i15);
            String str2 = this.f8456c;
            StringBuilder o10 = a1.a.o("onLayout: ", i10, " : ", i11, " : ");
            o10.append(i12);
            o10.append(" : ");
            o10.append(i13);
            Log.i(str2, o10.toString());
        }
        f10 = this.F;
        i15 += (int) f10;
        this.f8454a0.layout(measuredWidth2, i15, (this.f8454a0.getMeasuredWidth() + measuredWidth) / 2, this.f8454a0.getMeasuredHeight() + i15);
        String str22 = this.f8456c;
        StringBuilder o102 = a1.a.o("onLayout: ", i10, " : ", i11, " : ");
        o102.append(i12);
        o102.append(" : ");
        o102.append(i13);
        Log.i(str22, o102.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x014d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r11, int r12) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.simform.refresh.SSPullToRefreshLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View target, float f10, float f11, boolean z10) {
        Intrinsics.checkNotNullParameter(target, "target");
        return this.f8471w.a(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View target, float f10, float f11) {
        Intrinsics.checkNotNullParameter(target, "target");
        return this.f8471w.b(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View target, int i10, int i11, int[] consumed) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
        if (i11 > 0) {
            float f10 = this.f8468m;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    consumed[1] = i11 - ((int) f10);
                    this.f8468m = 0.0f;
                } else {
                    this.f8468m = f10 - f11;
                    consumed[1] = i11;
                }
                k(this.f8468m);
            }
        }
        int[] iArr = this.f8469t;
        if (dispatchNestedPreScroll(i10 - consumed[0], i11 - consumed[1], iArr, null)) {
            consumed[0] = consumed[0] + iArr[0];
            consumed[1] = consumed[1] + iArr[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View target, int i10, int i11, int i12, int i13) {
        Intrinsics.checkNotNullParameter(target, "target");
        dispatchNestedScroll(i10, i11, i12, i13, this.f8470u);
        int i14 = i13 + this.f8470u[1];
        if (i14 < 0) {
            float abs = this.f8468m + Math.abs(i14);
            this.f8468m = abs;
            k(abs);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View child, View target, int i10) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        this.y.f13149a = i10;
        startNestedScroll(i10 & 2);
        this.f8468m = 0.0f;
        this.n = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
        if ((r7 & 2) != 0) goto L12;
     */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onStartNestedScroll(android.view.View r5, android.view.View r6, int r7) {
        /*
            r4 = this;
            r1 = r4
            java.lang.String r3 = "child"
            r0 = r3
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r3 = "target"
            r5 = r3
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            com.simform.refresh.SSPullToRefreshLayout$RefreshStyle r5 = r1.V
            r3 = 4
            int[] r6 = com.simform.refresh.SSPullToRefreshLayout.b.$EnumSwitchMapping$0
            int r3 = r5.ordinal()
            r5 = r3
            r5 = r6[r5]
            r6 = 0
            r0 = 1
            r3 = 1
            if (r5 != r0) goto L3b
            boolean r3 = r1.isEnabled()
            r5 = r3
            if (r5 == 0) goto L53
            r3 = 3
            android.view.View r5 = r1.W
            boolean r5 = r1.d(r5)
            if (r5 == 0) goto L53
            r3 = 5
            boolean r5 = r1.I
            r3 = 1
            if (r5 != 0) goto L53
            r5 = r7 & 2
            r3 = 1
            if (r5 == 0) goto L53
            r3 = 6
            goto L51
        L3b:
            r3 = 7
            boolean r5 = r1.isEnabled()
            if (r5 == 0) goto L53
            android.view.View r5 = r1.W
            r3 = 7
            boolean r5 = r1.d(r5)
            if (r5 == 0) goto L53
            r3 = 5
            r5 = r7 & 2
            r3 = 2
            if (r5 == 0) goto L53
        L51:
            r3 = 1
            r6 = r3
        L53:
            r3 = 7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.simform.refresh.SSPullToRefreshLayout.onStartNestedScroll(android.view.View, android.view.View, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.y.b(0);
        this.n = false;
        if (this.f8468m > 0.0f) {
            h();
            this.f8468m = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        float f10;
        Intrinsics.checkNotNullParameter(ev, "ev");
        g();
        if (this.W == null) {
            return false;
        }
        boolean z10 = true;
        if (b.$EnumSwitchMapping$0[this.V.ordinal()] == 1) {
            if (isEnabled()) {
                if (!d(this.W)) {
                    if (this.n) {
                    }
                }
            }
            return false;
        }
        if (isEnabled()) {
            if (d(this.W) && !this.M) {
            }
        }
        return false;
        if (this.V == RefreshStyle.FLOAT && (d(this.W) || this.n)) {
            return false;
        }
        int action = ev.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    int i10 = this.O;
                    if (i10 == -1) {
                        return false;
                    }
                    float i11 = i(ev, i10);
                    if (i11 == -1.0f) {
                        return false;
                    }
                    if (this.H) {
                        f10 = getTargetOrRefreshViewTop();
                        this.D = i11;
                        this.C = f10;
                        Log.i(this.f8456c, "animateToStart overscrollY " + f10 + " -- " + this.D);
                    } else {
                        f10 = (i11 - this.D) + this.C;
                        Log.i(this.f8456c, "overscrollY " + f10 + " --" + this.D + " -- " + this.C);
                    }
                    if (this.I) {
                        if (f10 <= 0.0f) {
                            if (this.M) {
                                View view = this.W;
                                Intrinsics.checkNotNull(view);
                                view.dispatchTouchEvent(ev);
                            } else {
                                MotionEvent obtain = MotionEvent.obtain(ev);
                                obtain.setAction(0);
                                this.M = true;
                                View view2 = this.W;
                                Intrinsics.checkNotNull(view2);
                                view2.dispatchTouchEvent(obtain);
                            }
                        } else if (f10 > 0.0f && f10 < this.A && this.M) {
                            MotionEvent obtain2 = MotionEvent.obtain(ev);
                            obtain2.setAction(3);
                            this.M = false;
                            View view3 = this.W;
                            Intrinsics.checkNotNull(view3);
                            view3.dispatchTouchEvent(obtain2);
                        }
                        String str = this.f8456c;
                        StringBuilder m10 = a1.a.m("moveSpinner refreshing -- ");
                        m10.append(this.C);
                        m10.append(" -- ");
                        m10.append(i11 - this.D);
                        Log.i(str, m10.toString());
                        k(f10);
                    } else if (!this.K) {
                        j(i11);
                    } else if (f10 <= 0.0f) {
                        return false;
                    } else {
                        k(f10);
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int pointerId = ev.getPointerId(ev.getActionIndex());
                        this.O = pointerId;
                        float i12 = i(ev, pointerId) - this.E;
                        this.D = i12;
                        Log.i(this.f8456c, Intrinsics.stringPlus(" onDown ", Float.valueOf(i12)));
                    } else if (action == 6) {
                        l(ev);
                    }
                }
            }
            int i13 = this.O;
            if (i13 != -1) {
                if (i(ev, i13) != -1.0f) {
                    z10 = false;
                }
                if (!z10) {
                    if (!this.I && !this.H) {
                        n();
                        h();
                        return false;
                    }
                    if (this.M) {
                        View view4 = this.W;
                        Intrinsics.checkNotNull(view4);
                        view4.dispatchTouchEvent(ev);
                    }
                    n();
                    return false;
                }
            }
            n();
            return false;
        }
        this.O = ev.getPointerId(0);
        this.K = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        View view = this.W;
        if (view != null) {
            Intrinsics.checkNotNull(view);
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if (!x.i.p(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setAnimateToRefreshDuration(int i10) {
        this.Q = i10;
    }

    public final void setAnimateToRefreshInterpolator(Interpolator interpolator) {
        Objects.requireNonNull(interpolator, "The animateToRefreshInterpolator can't be null");
        this.f8462g0 = interpolator;
    }

    public final void setAnimateToStartDuration(int i10) {
        this.P = i10;
    }

    public final void setAnimateToStartInterpolator(Interpolator interpolator) {
        Objects.requireNonNull(interpolator, "The animateToStartInterpolator can't be null");
        this.f8461f0 = interpolator;
    }

    public final void setDragDistanceConverter(id.d dragDistanceConverter) {
        Intrinsics.checkNotNullParameter(dragDistanceConverter, "dragDistanceConverter");
        this.f8455b0 = dragDistanceConverter;
    }

    public final void setGifAnimation(int i10) {
        View view = this.f8454a0;
        if (!(view instanceof id.c)) {
            throw new Exception(this.f8465j);
        }
        view.setBackgroundResource(i10);
    }

    public final void setImageAsRefresh(int i10) {
        View view = this.f8454a0;
        if (!(view instanceof id.c)) {
            throw new Exception(this.f8465j);
        }
        ((id.c) view).setImageResource(i10);
    }

    public final void setLottieAnimation(String assetFileName) {
        Intrinsics.checkNotNullParameter(assetFileName, "assetFileName");
        this.f8457c0 = assetFileName;
        View view = this.f8454a0;
        if (!(view instanceof id.e)) {
            throw new Exception(this.f8460f);
        }
        ((id.e) view).setAnimation(assetFileName);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        j jVar = this.f8471w;
        if (jVar.d) {
            View view = jVar.f13147c;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.i.z(view);
        }
        jVar.d = z10;
    }

    public final void setOnRefreshListener(a aVar) {
        this.f8459e0 = aVar;
    }

    public final void setRefreshInitialOffset(float f10) {
        this.f8472z = f10;
        this.T = true;
        requestLayout();
    }

    public final void setRefreshStyle(RefreshStyle refreshStyle) {
        Intrinsics.checkNotNullParameter(refreshStyle, "refreshStyle");
        this.V = refreshStyle;
    }

    public final void setRefreshTargetOffset(float f10) {
        this.A = f10;
        this.S = true;
        requestLayout();
    }

    @SuppressLint({"ResourceType"})
    public final void setRefreshView(View refreshView) {
        Intrinsics.checkNotNullParameter(refreshView, "refreshView");
        View view = this.f8454a0;
        if (view == refreshView) {
            return;
        }
        if (view.getParent() != null) {
            ViewParent parent = this.f8454a0.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this.f8454a0);
        }
        refreshView.setVisibility(8);
        addView(refreshView, this.f8458d0);
        if (!(refreshView instanceof id.c)) {
            if (!(refreshView instanceof id.e)) {
                throw new ClassCastException("Need SSLottieAnimationView or SSGifAnimationView as RefreshView");
            }
            ((id.e) refreshView).setAnimation(this.f8457c0);
        }
        this.f8454a0 = refreshView;
    }

    public final void setRefreshViewParams(ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.f8458d0 = params;
        this.f8454a0.setLayoutParams(new ViewGroup.MarginLayoutParams(params.width, params.height));
    }

    public final void setRefreshing(boolean z10) {
        if (!z10 || this.I == z10) {
            o(z10, false);
            return;
        }
        this.I = z10;
        this.L = false;
        c((int) this.F, this.f8466j0);
    }

    public final void setRepeatCount(RepeatCount count) {
        Intrinsics.checkNotNullParameter(count, "count");
        View view = this.f8454a0;
        if (!(view instanceof id.e)) {
            throw new Exception(this.f8460f);
        }
        ((id.e) view).setRepeatCount(count.b());
    }

    public final void setRepeatMode(RepeatMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        View view = this.f8454a0;
        if (!(view instanceof id.e)) {
            throw new Exception(this.f8460f);
        }
        ((id.e) view).setRepeatMode(mode.b());
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f8471w.k(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f8471w.l(0);
    }
}
