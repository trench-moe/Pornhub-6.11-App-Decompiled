package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
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
import android.view.animation.Transformation;
import android.widget.ListView;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import n0.a0;
import n0.j;
import n0.k;
import n0.l;
import n0.m;
import n0.x;
import s1.d;

/* loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements l, k, n0.i {

    /* renamed from: e0  reason: collision with root package name */
    public static final int[] f3152e0 = {16842766};
    public final int[] A;
    public boolean B;
    public int C;
    public int D;
    public float E;
    public float F;
    public boolean G;
    public int H;
    public final DecelerateInterpolator I;
    public s1.a J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public s1.d P;
    public Animation Q;
    public Animation R;
    public Animation S;
    public Animation T;
    public boolean U;
    public int V;
    public g W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f3153a0;

    /* renamed from: b0  reason: collision with root package name */
    public Animation.AnimationListener f3154b0;

    /* renamed from: c  reason: collision with root package name */
    public View f3155c;

    /* renamed from: c0  reason: collision with root package name */
    public final Animation f3156c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Animation f3157d0;

    /* renamed from: f  reason: collision with root package name */
    public h f3158f;

    /* renamed from: j  reason: collision with root package name */
    public boolean f3159j;

    /* renamed from: m  reason: collision with root package name */
    public int f3160m;
    public float n;

    /* renamed from: t  reason: collision with root package name */
    public float f3161t;

    /* renamed from: u  reason: collision with root package name */
    public final m f3162u;

    /* renamed from: w  reason: collision with root package name */
    public final j f3163w;
    public final int[] y;

    /* renamed from: z  reason: collision with root package name */
    public final int[] f3164z;

    /* loaded from: classes.dex */
    public class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            h hVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f3159j) {
                swipeRefreshLayout.h();
                return;
            }
            swipeRefreshLayout.P.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
            SwipeRefreshLayout.this.P.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.U && (hVar = swipeRefreshLayout2.f3158f) != null) {
                hVar.a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.D = swipeRefreshLayout3.J.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public class b extends Animation {
        public b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
        }
    }

    /* loaded from: classes.dex */
    public class c extends Animation {

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ int f3167c;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ int f3168f;

        public c(int i10, int i11) {
            this.f3167c = i10;
            this.f3168f = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            s1.d dVar = SwipeRefreshLayout.this.P;
            int i10 = this.f3167c;
            dVar.setAlpha((int) (((this.f3168f - i10) * f10) + i10));
        }
    }

    /* loaded from: classes.dex */
    public class d implements Animation.AnimationListener {
        public d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            Objects.requireNonNull(SwipeRefreshLayout.this);
            SwipeRefreshLayout.this.r(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* loaded from: classes.dex */
    public class e extends Animation {
        public e() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            Objects.requireNonNull(SwipeRefreshLayout.this);
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i10 = swipeRefreshLayout2.L;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i10 + ((int) (((swipeRefreshLayout.N - Math.abs(swipeRefreshLayout.M)) - i10) * f10))) - swipeRefreshLayout2.J.getTop());
            s1.d dVar = SwipeRefreshLayout.this.P;
            float f11 = 1.0f - f10;
            d.a aVar = dVar.f14784c;
            if (f11 != aVar.f14802p) {
                aVar.f14802p = f11;
            }
            dVar.invalidateSelf();
        }
    }

    /* loaded from: classes.dex */
    public class f extends Animation {
        public f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.f(f10);
        }
    }

    /* loaded from: classes.dex */
    public interface g {
        boolean a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* loaded from: classes.dex */
    public interface h {
        void a();
    }

    /* loaded from: classes.dex */
    public static class i extends View.BaseSavedState {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final boolean f3173c;

        /* loaded from: classes.dex */
        public class a implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public i[] newArray(int i10) {
                return new i[i10];
            }
        }

        public i(Parcel parcel) {
            super(parcel);
            this.f3173c = parcel.readByte() != 0;
        }

        public i(Parcelable parcelable, boolean z10) {
            super(parcelable);
            this.f3173c = z10;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.f3173c ? (byte) 1 : (byte) 0);
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3159j = false;
        this.n = -1.0f;
        this.y = new int[2];
        this.f3164z = new int[2];
        this.A = new int[2];
        this.H = -1;
        this.K = -1;
        this.f3154b0 = new a();
        this.f3156c0 = new e();
        this.f3157d0 = new f();
        this.f3160m = ViewConfiguration.get(context).getScaledTouchSlop();
        this.C = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.I = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.V = (int) (displayMetrics.density * 40.0f);
        this.J = new s1.a(getContext());
        s1.d dVar = new s1.d(getContext());
        this.P = dVar;
        dVar.c(1);
        this.J.setImageDrawable(this.P);
        this.J.setVisibility(8);
        addView(this.J);
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.N = i10;
        this.n = i10;
        this.f3162u = new m();
        this.f3163w = new j(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.V;
        this.D = i11;
        this.M = i11;
        f(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3152e0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i10) {
        this.J.getBackground().setAlpha(i10);
        s1.d dVar = this.P;
        dVar.f14784c.f14806t = i10;
        dVar.invalidateSelf();
    }

    public boolean a() {
        g gVar = this.W;
        if (gVar != null) {
            return gVar.a(this, this.f3155c);
        }
        View view = this.f3155c;
        return view instanceof ListView ? ((ListView) view).canScrollList(-1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f3155c == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.J)) {
                    this.f3155c = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f10) {
        if (f10 > this.n) {
            i(true, true);
            return;
        }
        this.f3159j = false;
        s1.d dVar = this.P;
        d.a aVar = dVar.f14784c;
        aVar.f14792e = 0.0f;
        aVar.f14793f = 0.0f;
        dVar.invalidateSelf();
        d dVar2 = new d();
        this.L = this.D;
        this.f3157d0.reset();
        this.f3157d0.setDuration(200L);
        this.f3157d0.setInterpolator(this.I);
        s1.a aVar2 = this.J;
        aVar2.f14776c = dVar2;
        aVar2.clearAnimation();
        this.J.startAnimation(this.f3157d0);
        s1.d dVar3 = this.P;
        d.a aVar3 = dVar3.f14784c;
        if (aVar3.n) {
            aVar3.n = false;
        }
        dVar3.invalidateSelf();
    }

    public final boolean d(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f3163w.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f3163w.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f3163w.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f3163w.f(i10, i11, i12, i13, iArr);
    }

    public final void e(float f10) {
        s1.d dVar = this.P;
        d.a aVar = dVar.f14784c;
        if (!aVar.n) {
            aVar.n = true;
        }
        dVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f10 / this.n));
        float max = (((float) Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f10) - this.n;
        int i10 = this.O;
        if (i10 <= 0) {
            i10 = this.N;
        }
        float f11 = i10;
        double max2 = Math.max(0.0f, Math.min(abs, f11 * 2.0f) / f11) / 4.0f;
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i11 = this.M + ((int) ((f11 * min) + (f11 * pow * 2.0f)));
        if (this.J.getVisibility() != 0) {
            this.J.setVisibility(0);
        }
        this.J.setScaleX(1.0f);
        this.J.setScaleY(1.0f);
        if (f10 < this.n) {
            if (this.P.f14784c.f14806t > 76 && !d(this.S)) {
                this.S = p(this.P.f14784c.f14806t, 76);
            }
        } else if (this.P.f14784c.f14806t < 255 && !d(this.T)) {
            this.T = p(this.P.f14784c.f14806t, KotlinVersion.MAX_COMPONENT_VALUE);
        }
        s1.d dVar2 = this.P;
        float min2 = Math.min(0.8f, max * 0.8f);
        d.a aVar2 = dVar2.f14784c;
        aVar2.f14792e = 0.0f;
        aVar2.f14793f = min2;
        dVar2.invalidateSelf();
        s1.d dVar3 = this.P;
        float min3 = Math.min(1.0f, max);
        d.a aVar3 = dVar3.f14784c;
        if (min3 != aVar3.f14802p) {
            aVar3.f14802p = min3;
        }
        dVar3.invalidateSelf();
        s1.d dVar4 = this.P;
        dVar4.f14784c.f14794g = ((pow * 2.0f) + ((max * 0.4f) - 0.25f)) * 0.5f;
        dVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i11 - this.D);
    }

    public void f(float f10) {
        int i10 = this.L;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.M - i10) * f10))) - this.J.getTop());
    }

    public final void g(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.H) {
            this.H = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.K;
        if (i12 < 0) {
            return i11;
        }
        if (i11 == i10 - 1) {
            return i12;
        }
        if (i11 >= i12) {
            i11++;
        }
        return i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3162u.a();
    }

    public int getProgressCircleDiameter() {
        return this.V;
    }

    public int getProgressViewEndOffset() {
        return this.N;
    }

    public int getProgressViewStartOffset() {
        return this.M;
    }

    public void h() {
        this.J.clearAnimation();
        this.P.stop();
        this.J.setVisibility(8);
        setColorViewAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        setTargetOffsetTopAndBottom(this.M - this.D);
        this.D = this.J.getTop();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f3163w.i();
    }

    public final void i(boolean z10, boolean z11) {
        if (this.f3159j != z10) {
            this.U = z11;
            b();
            this.f3159j = z10;
            if (z10) {
                int i10 = this.D;
                Animation.AnimationListener animationListener = this.f3154b0;
                this.L = i10;
                this.f3156c0.reset();
                this.f3156c0.setDuration(200L);
                this.f3156c0.setInterpolator(this.I);
                if (animationListener != null) {
                    this.J.f14776c = animationListener;
                }
                this.J.clearAnimation();
                this.J.startAnimation(this.f3156c0);
                return;
            }
            r(this.f3154b0);
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f3163w.d;
    }

    @Override // n0.l
    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (i14 != 0) {
            return;
        }
        int i15 = iArr[1];
        int[] iArr2 = this.f3164z;
        if (i14 == 0) {
            this.f3163w.e(i10, i11, i12, i13, iArr2, i14, iArr);
        }
        int i16 = i13 - (iArr[1] - i15);
        int i17 = i16 == 0 ? i13 + this.f3164z[1] : i16;
        if (i17 >= 0 || a()) {
            return;
        }
        float abs = this.f3161t + Math.abs(i17);
        this.f3161t = abs;
        e(abs);
        iArr[1] = iArr[1] + i16;
    }

    @Override // n0.k
    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
        j(view, i10, i11, i12, i13, i14, this.A);
    }

    @Override // n0.k
    public boolean l(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            return onStartNestedScroll(view, view2, i10);
        }
        return false;
    }

    @Override // n0.k
    public void m(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // n0.k
    public void n(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // n0.k
    public void o(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.f3159j) {
            if (!this.B) {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            int i10 = this.H;
                            if (i10 == -1) {
                                Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but don't have an active pointer id.");
                                return false;
                            }
                            int findPointerIndex = motionEvent.findPointerIndex(i10);
                            if (findPointerIndex < 0) {
                                return false;
                            }
                            q(motionEvent.getY(findPointerIndex));
                        } else if (actionMasked != 3) {
                            if (actionMasked == 6) {
                                g(motionEvent);
                            }
                        }
                    }
                    this.G = false;
                    this.H = -1;
                } else {
                    setTargetOffsetTopAndBottom(this.M - this.J.getTop());
                    int pointerId = motionEvent.getPointerId(0);
                    this.H = pointerId;
                    this.G = false;
                    int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
                    if (findPointerIndex2 < 0) {
                        return false;
                    }
                    this.F = motionEvent.getY(findPointerIndex2);
                }
                return this.G;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f3155c == null) {
            b();
        }
        View view = this.f3155c;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.J.getMeasuredWidth();
        int measuredHeight2 = this.J.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.D;
        this.J.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f3155c == null) {
            b();
        }
        View view = this.f3155c;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.J.measure(View.MeasureSpec.makeMeasureSpec(this.V, 1073741824), View.MeasureSpec.makeMeasureSpec(this.V, 1073741824));
        this.K = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.J) {
                this.K = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f3161t;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = (int) f10;
                    this.f3161t = 0.0f;
                } else {
                    this.f3161t = f10 - f11;
                    iArr[1] = i11;
                }
                e(this.f3161t);
            }
        }
        int[] iArr2 = this.y;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        j(view, i10, i11, i12, i13, 0, this.A);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f3162u.f13149a = i10;
        startNestedScroll(i10 & 2);
        this.f3161t = 0.0f;
        this.B = true;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        setRefreshing(iVar.f3173c);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new i(super.onSaveInstanceState(), this.f3159j);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f3159j || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f3162u.b(0);
        this.B = false;
        float f10 = this.f3161t;
        if (f10 > 0.0f) {
            c(f10);
            this.f3161t = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (isEnabled() && !a() && !this.f3159j) {
            if (!this.B) {
                if (actionMasked != 0) {
                    if (actionMasked == 1) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.H);
                        if (findPointerIndex < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_UP event but don't have an active pointer id.");
                            return false;
                        }
                        if (this.G) {
                            this.G = false;
                            c((motionEvent.getY(findPointerIndex) - this.E) * 0.5f);
                        }
                        this.H = -1;
                        return false;
                    }
                    if (actionMasked == 2) {
                        int findPointerIndex2 = motionEvent.findPointerIndex(this.H);
                        if (findPointerIndex2 < 0) {
                            Log.e("SwipeRefreshLayout", "Got ACTION_MOVE event but have an invalid active pointer id.");
                            return false;
                        }
                        float y = motionEvent.getY(findPointerIndex2);
                        q(y);
                        if (this.G) {
                            float f10 = (y - this.E) * 0.5f;
                            if (f10 <= 0.0f) {
                                return false;
                            }
                            getParent().requestDisallowInterceptTouchEvent(true);
                            e(f10);
                        }
                    } else if (actionMasked == 3) {
                        return false;
                    } else {
                        if (actionMasked == 5) {
                            int actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                Log.e("SwipeRefreshLayout", "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            this.H = motionEvent.getPointerId(actionIndex);
                        } else if (actionMasked == 6) {
                            g(motionEvent);
                        }
                    }
                    return true;
                }
                this.H = motionEvent.getPointerId(0);
                this.G = false;
                return true;
            }
        }
        return false;
    }

    public final Animation p(int i10, int i11) {
        c cVar = new c(i10, i11);
        cVar.setDuration(300L);
        s1.a aVar = this.J;
        aVar.f14776c = null;
        aVar.clearAnimation();
        this.J.startAnimation(cVar);
        return cVar;
    }

    public final void q(float f10) {
        float f11 = this.F;
        int i10 = this.f3160m;
        if (f10 - f11 > i10 && !this.G) {
            this.E = f11 + i10;
            this.G = true;
            this.P.setAlpha(76);
        }
    }

    public void r(Animation.AnimationListener animationListener) {
        b bVar = new b();
        this.R = bVar;
        bVar.setDuration(150L);
        s1.a aVar = this.J;
        aVar.f14776c = animationListener;
        aVar.clearAnimation();
        this.J.startAnimation(this.R);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        ViewParent parent;
        View view = this.f3155c;
        if (view != null) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if (!x.i.p(view)) {
                if (this.f3153a0 || (parent = getParent()) == null) {
                    return;
                }
                parent.requestDisallowInterceptTouchEvent(z10);
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAnimationProgress(float f10) {
        this.J.setScaleX(f10);
        this.J.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        s1.d dVar = this.P;
        d.a aVar = dVar.f14784c;
        aVar.f14796i = iArr;
        aVar.a(0);
        dVar.f14784c.a(0);
        dVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = c0.a.b(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.n = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            h();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z10) {
        this.f3153a0 = z10;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        j jVar = this.f3163w;
        if (jVar.d) {
            View view = jVar.f13147c;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.i.z(view);
        }
        jVar.d = z10;
    }

    public void setOnChildScrollUpCallback(g gVar) {
        this.W = gVar;
    }

    public void setOnRefreshListener(h hVar) {
        this.f3158f = hVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.J.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(c0.a.b(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.f3159j == z10) {
            i(z10, false);
            return;
        }
        this.f3159j = z10;
        setTargetOffsetTopAndBottom((this.N + this.M) - this.D);
        this.U = false;
        Animation.AnimationListener animationListener = this.f3154b0;
        this.J.setVisibility(0);
        this.P.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        s1.e eVar = new s1.e(this);
        this.Q = eVar;
        eVar.setDuration(this.C);
        if (animationListener != null) {
            this.J.f14776c = animationListener;
        }
        this.J.clearAnimation();
        this.J.startAnimation(this.Q);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.V = (int) (displayMetrics.density * 56.0f);
            } else {
                this.V = (int) (displayMetrics.density * 40.0f);
            }
            this.J.setImageDrawable(null);
            this.P.c(i10);
            this.J.setImageDrawable(this.P);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.O = i10;
    }

    public void setTargetOffsetTopAndBottom(int i10) {
        this.J.bringToFront();
        x.o(this.J, i10);
        this.D = this.J.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f3163w.k(i10, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f3163w.l(0);
    }
}
