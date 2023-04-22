package androidx.slidingpanelayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import c0.a;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import n0.a0;
import n0.x;
import t0.c;

/* loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup {
    public boolean A;
    public int B;
    public float C;
    public float D;
    public d E;
    public final t0.c F;
    public boolean G;
    public boolean H;
    public final Rect I;
    public final ArrayList<b> J;

    /* renamed from: c  reason: collision with root package name */
    public int f3135c;

    /* renamed from: f  reason: collision with root package name */
    public int f3136f;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f3137j;

    /* renamed from: m  reason: collision with root package name */
    public Drawable f3138m;
    public final int n;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3139t;

    /* renamed from: u  reason: collision with root package name */
    public View f3140u;

    /* renamed from: w  reason: collision with root package name */
    public float f3141w;
    public float y;

    /* renamed from: z  reason: collision with root package name */
    public int f3142z;

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: e  reason: collision with root package name */
        public static final int[] f3143e = {16843137};

        /* renamed from: a  reason: collision with root package name */
        public float f3144a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3145b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3146c;
        public Paint d;

        public LayoutParams() {
            super(-1, -1);
            this.f3144a = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3144a = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3143e);
            this.f3144a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3144a = 0.0f;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3144a = 0.0f;
        }
    }

    /* loaded from: classes.dex */
    public class a extends n0.a {
        public final Rect d = new Rect();

        public a() {
        }

        @Override // n0.a
        public void c(View view, AccessibilityEvent accessibilityEvent) {
            this.f13090a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // n0.a
        public void d(View view, o0.b bVar) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(bVar.f13479a);
            this.f13090a.onInitializeAccessibilityNodeInfo(view, obtain);
            Rect rect = this.d;
            obtain.getBoundsInParent(rect);
            bVar.f13479a.setBoundsInParent(rect);
            obtain.getBoundsInScreen(rect);
            bVar.f13479a.setBoundsInScreen(rect);
            bVar.f13479a.setVisibleToUser(obtain.isVisibleToUser());
            bVar.f13479a.setPackageName(obtain.getPackageName());
            bVar.f13479a.setClassName(obtain.getClassName());
            bVar.f13479a.setContentDescription(obtain.getContentDescription());
            bVar.f13479a.setEnabled(obtain.isEnabled());
            bVar.f13479a.setClickable(obtain.isClickable());
            bVar.f13479a.setFocusable(obtain.isFocusable());
            bVar.f13479a.setFocused(obtain.isFocused());
            bVar.f13479a.setAccessibilityFocused(obtain.isAccessibilityFocused());
            bVar.f13479a.setSelected(obtain.isSelected());
            bVar.f13479a.setLongClickable(obtain.isLongClickable());
            bVar.f13479a.addAction(obtain.getActions());
            bVar.f13479a.setMovementGranularities(obtain.getMovementGranularities());
            obtain.recycle();
            bVar.f13479a.setClassName(SlidingPaneLayout.class.getName());
            bVar.f13481c = -1;
            bVar.f13479a.setSource(view);
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            ViewParent f10 = x.d.f(view);
            if (f10 instanceof View) {
                bVar.t((View) f10);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i10);
                if (!SlidingPaneLayout.this.c(childAt) && childAt.getVisibility() == 0) {
                    x.d.s(childAt, 1);
                    bVar.f13479a.addChild(childAt);
                }
            }
        }

        @Override // n0.a
        public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (SlidingPaneLayout.this.c(view)) {
                return false;
            }
            return this.f13090a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        public final View f3148c;

        public b(View view) {
            this.f3148c = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f3148c.getParent() == SlidingPaneLayout.this) {
                this.f3148c.setLayerType(0, null);
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                View view = this.f3148c;
                Objects.requireNonNull(slidingPaneLayout);
                Paint paint = ((LayoutParams) view.getLayoutParams()).d;
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                x.e.i(view, paint);
            }
            SlidingPaneLayout.this.J.remove(this);
        }
    }

    /* loaded from: classes.dex */
    public class c extends c.AbstractC0267c {
        public c() {
        }

        @Override // t0.c.AbstractC0267c
        public int a(View view, int i10, int i11) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.f3140u.getLayoutParams();
            if (!SlidingPaneLayout.this.d()) {
                int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                return Math.min(Math.max(i10, paddingLeft), SlidingPaneLayout.this.f3142z + paddingLeft);
            }
            int width = SlidingPaneLayout.this.getWidth() - (SlidingPaneLayout.this.f3140u.getWidth() + (SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
            return Math.max(Math.min(i10, width), width - SlidingPaneLayout.this.f3142z);
        }

        @Override // t0.c.AbstractC0267c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // t0.c.AbstractC0267c
        public int c(View view) {
            return SlidingPaneLayout.this.f3142z;
        }

        @Override // t0.c.AbstractC0267c
        public void e(int i10, int i11) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            slidingPaneLayout.F.c(slidingPaneLayout.f3140u, i11);
        }

        @Override // t0.c.AbstractC0267c
        public void g(View view, int i10) {
            SlidingPaneLayout.this.f();
        }

        @Override // t0.c.AbstractC0267c
        public void h(int i10) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.F.f15077a == 0) {
                if (slidingPaneLayout.f3141w == 0.0f) {
                    slidingPaneLayout.h(slidingPaneLayout.f3140u);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    View view = slidingPaneLayout2.f3140u;
                    d dVar = slidingPaneLayout2.E;
                    if (dVar != null) {
                        dVar.c(view);
                    }
                    slidingPaneLayout2.sendAccessibilityEvent(32);
                    SlidingPaneLayout.this.G = false;
                    return;
                }
                View view2 = slidingPaneLayout.f3140u;
                d dVar2 = slidingPaneLayout.E;
                if (dVar2 != null) {
                    dVar2.b(view2);
                }
                slidingPaneLayout.sendAccessibilityEvent(32);
                SlidingPaneLayout.this.G = true;
            }
        }

        @Override // t0.c.AbstractC0267c
        public void i(View view, int i10, int i11, int i12, int i13) {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f3140u == null) {
                slidingPaneLayout.f3141w = 0.0f;
            } else {
                boolean d = slidingPaneLayout.d();
                LayoutParams layoutParams = (LayoutParams) slidingPaneLayout.f3140u.getLayoutParams();
                int width = slidingPaneLayout.f3140u.getWidth();
                if (d) {
                    i10 = (slidingPaneLayout.getWidth() - i10) - width;
                }
                float paddingRight = (i10 - ((d ? slidingPaneLayout.getPaddingRight() : slidingPaneLayout.getPaddingLeft()) + (d ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / slidingPaneLayout.f3142z;
                slidingPaneLayout.f3141w = paddingRight;
                if (slidingPaneLayout.B != 0) {
                    slidingPaneLayout.e(paddingRight);
                }
                if (layoutParams.f3146c) {
                    slidingPaneLayout.b(slidingPaneLayout.f3140u, slidingPaneLayout.f3141w, slidingPaneLayout.f3135c);
                }
                View view2 = slidingPaneLayout.f3140u;
                d dVar = slidingPaneLayout.E;
                if (dVar != null) {
                    dVar.a(view2, slidingPaneLayout.f3141w);
                }
            }
            SlidingPaneLayout.this.invalidate();
        }

        @Override // t0.c.AbstractC0267c
        public void j(View view, float f10, float f11) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.d()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f10 >= 0.0f) {
                    if (f10 == 0.0f && SlidingPaneLayout.this.f3141w > 0.5f) {
                    }
                    paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f3140u.getWidth();
                }
                paddingRight += SlidingPaneLayout.this.f3142z;
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f3140u.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
                if (i10 <= 0) {
                    if (i10 == 0 && SlidingPaneLayout.this.f3141w > 0.5f) {
                    }
                }
                paddingLeft += SlidingPaneLayout.this.f3142z;
            }
            SlidingPaneLayout.this.F.x(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // t0.c.AbstractC0267c
        public boolean k(View view, int i10) {
            if (SlidingPaneLayout.this.A) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).f3145b;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(View view, float f10);

        void b(View view);

        void c(View view);
    }

    /* loaded from: classes.dex */
    public static class e extends s0.a {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        public boolean f3151j;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<e> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, null);
            this.f3151j = parcel.readInt() != 0;
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // s0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f14775c, i10);
            parcel.writeInt(this.f3151j ? 1 : 0);
        }
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3135c = -858993460;
        this.H = true;
        this.I = new Rect();
        this.J = new ArrayList<>();
        float f10 = context.getResources().getDisplayMetrics().density;
        this.n = (int) ((32.0f * f10) + 0.5f);
        setWillNotDraw(false);
        x.v(this, new a());
        x.d.s(this, 1);
        t0.c k10 = t0.c.k(this, 0.5f, new c());
        this.F = k10;
        k10.n = f10 * 400.0f;
    }

    public final boolean a(int i10) {
        if (!this.H && !g(0.0f)) {
            return false;
        }
        this.G = false;
        return true;
    }

    public final void b(View view, float f10, int i10) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f10 <= 0.0f || i10 == 0) {
            if (view.getLayerType() != 0) {
                Paint paint = layoutParams.d;
                if (paint != null) {
                    paint.setColorFilter(null);
                }
                b bVar = new b(view);
                this.J.add(bVar);
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                x.d.m(this, bVar);
            }
            return;
        }
        int i11 = (((int) ((((-16777216) & i10) >>> 24) * f10)) << 24) | (i10 & 16777215);
        if (layoutParams.d == null) {
            layoutParams.d = new Paint();
        }
        layoutParams.d.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_OVER));
        if (view.getLayerType() != 2) {
            view.setLayerType(2, layoutParams.d);
        }
        Paint paint2 = ((LayoutParams) view.getLayoutParams()).d;
        WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
        x.e.i(view, paint2);
    }

    public boolean c(View view) {
        if (view == null) {
            return false;
        }
        return this.f3139t && ((LayoutParams) view.getLayoutParams()).f3146c && this.f3141w > 0.0f;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.F.j(true)) {
            if (!this.f3139t) {
                this.F.a();
            } else {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                x.d.k(this);
            }
        }
    }

    public boolean d() {
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        return x.e.d(this) == 1;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int i11;
        super.draw(canvas);
        Drawable drawable = d() ? this.f3138m : this.f3137j;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (d()) {
            i11 = childAt.getRight();
            i10 = intrinsicWidth + i11;
        } else {
            int left = childAt.getLeft();
            i10 = left;
            i11 = left - intrinsicWidth;
        }
        drawable.setBounds(i11, top, i10, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int save = canvas.save();
        if (this.f3139t && !layoutParams.f3145b && this.f3140u != null) {
            canvas.getClipBounds(this.I);
            if (d()) {
                Rect rect = this.I;
                rect.left = Math.max(rect.left, this.f3140u.getRight());
            } else {
                Rect rect2 = this.I;
                rect2.right = Math.min(rect2.right, this.f3140u.getLeft());
            }
            canvas.clipRect(this.I);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(save);
        return drawChild;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(float r12) {
        /*
            r11 = this;
            boolean r9 = r11.d()
            r0 = r9
            android.view.View r1 = r11.f3140u
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            r1 = r9
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.f3146c
            r3 = 0
            if (r2 == 0) goto L23
            r10 = 4
            if (r0 == 0) goto L1a
            int r1 = r1.rightMargin
            r10 = 2
            goto L1d
        L1a:
            r10 = 3
            int r1 = r1.leftMargin
        L1d:
            if (r1 > 0) goto L23
            r10 = 7
            r9 = 1
            r1 = r9
            goto L25
        L23:
            r9 = 0
            r1 = r9
        L25:
            int r9 = r11.getChildCount()
            r2 = r9
        L2a:
            if (r3 >= r2) goto L74
            r10 = 5
            android.view.View r9 = r11.getChildAt(r3)
            r4 = r9
            android.view.View r5 = r11.f3140u
            r10 = 7
            if (r4 != r5) goto L38
            goto L70
        L38:
            float r5 = r11.y
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 - r5
            r10 = 4
            int r7 = r11.B
            r10 = 4
            float r8 = (float) r7
            float r5 = r5 * r8
            int r5 = (int) r5
            r11.y = r12
            r10 = 1
            float r8 = r6 - r12
            r10 = 7
            float r7 = (float) r7
            r10 = 2
            float r8 = r8 * r7
            r10 = 2
            int r7 = (int) r8
            int r5 = r5 - r7
            r10 = 3
            if (r0 == 0) goto L59
            r10 = 7
            int r5 = -r5
            r10 = 4
        L59:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L6f
            float r5 = r11.y
            r10 = 7
            if (r0 == 0) goto L66
            r10 = 6
            float r5 = r5 - r6
            goto L69
        L66:
            r10 = 3
            float r5 = r6 - r5
        L69:
            int r6 = r11.f3136f
            r10 = 5
            r11.b(r4, r5, r6)
        L6f:
            r10 = 5
        L70:
            int r3 = r3 + 1
            r10 = 6
            goto L2a
        L74:
            r10 = 5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.e(float):void");
    }

    public void f() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    public boolean g(float f10) {
        int paddingLeft;
        if (this.f3139t) {
            boolean d10 = d();
            LayoutParams layoutParams = (LayoutParams) this.f3140u.getLayoutParams();
            if (d10) {
                int paddingRight = getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int width = this.f3140u.getWidth();
                paddingLeft = (int) (getWidth() - (((f10 * this.f3142z) + paddingRight) + width));
            } else {
                paddingLeft = (int) ((f10 * this.f3142z) + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
            }
            t0.c cVar = this.F;
            View view = this.f3140u;
            if (cVar.z(view, paddingLeft, view.getTop())) {
                f();
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                x.d.k(this);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public int getCoveredFadeColor() {
        return this.f3136f;
    }

    public int getParallaxDistance() {
        return this.B;
    }

    public int getSliderFadeColor() {
        return this.f3135c;
    }

    public void h(View view) {
        int i10;
        int i11;
        int i12;
        int i13;
        View childAt;
        boolean z10;
        View view2 = view;
        boolean d10 = d();
        int width = d10 ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = d10 ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !view.isOpaque()) {
            i10 = 0;
            i11 = 0;
            i12 = 0;
            i13 = 0;
        } else {
            i10 = view.getLeft();
            i11 = view.getRight();
            i12 = view.getTop();
            i13 = view.getBottom();
        }
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount && (childAt = getChildAt(i14)) != view2) {
            if (childAt.getVisibility() == 8) {
                z10 = d10;
            } else {
                z10 = d10;
                childAt.setVisibility((Math.max(d10 ? paddingLeft : width, childAt.getLeft()) < i10 || Math.max(paddingTop, childAt.getTop()) < i12 || Math.min(d10 ? width : paddingLeft, childAt.getRight()) > i11 || Math.min(height, childAt.getBottom()) > i13) ? 0 : 4);
            }
            i14++;
            view2 = view;
            d10 = z10;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.H = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H = true;
        int size = this.J.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.J.get(i10).run();
        }
        this.J.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bb  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean d10 = d();
        if (d10) {
            this.F.f15091q = 2;
        } else {
            this.F.f15091q = 1;
        }
        int i19 = i12 - i10;
        int paddingRight = d10 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = d10 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.H) {
            this.f3141w = (this.f3139t && this.G) ? 1.0f : 0.0f;
        }
        int i20 = paddingRight;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (layoutParams.f3145b) {
                    int i22 = i19 - paddingLeft;
                    int min = (Math.min(paddingRight, i22 - this.n) - i20) - (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    this.f3142z = min;
                    int i23 = d10 ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    layoutParams.f3146c = (measuredWidth / 2) + ((i20 + i23) + min) > i22;
                    int i24 = (int) (min * this.f3141w);
                    i14 = i23 + i24 + i20;
                    this.f3141w = i24 / min;
                    i15 = 0;
                } else if (!this.f3139t || (i16 = this.B) == 0) {
                    i14 = paddingRight;
                    i15 = 0;
                } else {
                    i15 = (int) ((1.0f - this.f3141w) * i16);
                    i14 = paddingRight;
                }
                if (d10) {
                    i18 = (i19 - i14) + i15;
                    i17 = i18 - measuredWidth;
                } else {
                    i17 = i14 - i15;
                    i18 = i17 + measuredWidth;
                }
                childAt.layout(i17, paddingTop, i18, childAt.getMeasuredHeight() + paddingTop);
                i20 = i14;
                paddingRight = childAt.getWidth() + paddingRight;
            }
        }
        if (this.H) {
            if (this.f3139t) {
                if (this.B != 0) {
                    e(this.f3141w);
                }
                if (((LayoutParams) this.f3140u.getLayoutParams()).f3146c) {
                    b(this.f3140u, this.f3141w, this.f3135c);
                }
            } else {
                for (int i25 = 0; i25 < childCount; i25++) {
                    b(getChildAt(i25), 0.0f, this.f3135c);
                }
            }
            h(this.f3140u);
        }
        this.H = false;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int paddingTop;
        int i12;
        int i13;
        int makeMeasureSpec;
        int i14;
        int i15;
        int makeMeasureSpec2;
        float f10;
        int i16;
        int makeMeasureSpec3;
        int makeMeasureSpec4;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
        } else if (mode2 == 0) {
            if (!isInEditMode()) {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
            if (mode2 == 0) {
                mode2 = IntCompanionObject.MIN_VALUE;
                size2 = 300;
            }
        }
        boolean z10 = false;
        if (mode2 == Integer.MIN_VALUE) {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            i12 = 0;
        } else if (mode2 != 1073741824) {
            i12 = 0;
            paddingTop = 0;
        } else {
            i12 = (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = i12;
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f3140u = null;
        int i17 = paddingLeft;
        int i18 = 0;
        boolean z11 = false;
        float f11 = 0.0f;
        while (true) {
            i13 = 8;
            if (i18 >= childCount) {
                break;
            }
            View childAt = getChildAt(i18);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() == 8) {
                layoutParams.f3146c = z10;
            } else {
                float f12 = layoutParams.f3144a;
                if (f12 > 0.0f) {
                    f11 += f12;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width == 0) {
                    }
                }
                int i19 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                int i20 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                if (i20 == -2) {
                    makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(paddingLeft - i19, IntCompanionObject.MIN_VALUE);
                    f10 = f11;
                    i16 = IntCompanionObject.MIN_VALUE;
                } else {
                    f10 = f11;
                    i16 = IntCompanionObject.MIN_VALUE;
                    makeMeasureSpec3 = i20 == -1 ? View.MeasureSpec.makeMeasureSpec(paddingLeft - i19, 1073741824) : View.MeasureSpec.makeMeasureSpec(i20, 1073741824);
                }
                int i21 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                if (i21 == -2) {
                    makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(paddingTop, i16);
                } else {
                    makeMeasureSpec4 = i21 == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824) : View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
                }
                childAt.measure(makeMeasureSpec3, makeMeasureSpec4);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (mode2 == i16 && measuredHeight > i12) {
                    i12 = Math.min(measuredHeight, paddingTop);
                }
                i17 -= measuredWidth;
                boolean z12 = i17 < 0;
                layoutParams.f3145b = z12;
                z11 |= z12;
                if (z12) {
                    this.f3140u = childAt;
                }
                f11 = f10;
            }
            i18++;
            z10 = false;
        }
        if (z11 || f11 > 0.0f) {
            int i22 = paddingLeft - this.n;
            int i23 = 0;
            while (i23 < childCount) {
                View childAt2 = getChildAt(i23);
                if (childAt2.getVisibility() != i13) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != i13) {
                        boolean z13 = ((ViewGroup.MarginLayoutParams) layoutParams2).width == 0 && layoutParams2.f3144a > 0.0f;
                        int measuredWidth2 = z13 ? 0 : childAt2.getMeasuredWidth();
                        if (!z11 || childAt2 == this.f3140u) {
                            if (layoutParams2.f3144a > 0.0f) {
                                if (((ViewGroup.MarginLayoutParams) layoutParams2).width == 0) {
                                    int i24 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                    makeMeasureSpec = i24 == -2 ? View.MeasureSpec.makeMeasureSpec(paddingTop, IntCompanionObject.MIN_VALUE) : i24 == -1 ? View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824) : View.MeasureSpec.makeMeasureSpec(i24, 1073741824);
                                } else {
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                                }
                                if (z11) {
                                    int i25 = paddingLeft - (((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
                                    i14 = i22;
                                    int makeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i25, 1073741824);
                                    if (measuredWidth2 != i25) {
                                        childAt2.measure(makeMeasureSpec5, makeMeasureSpec);
                                    }
                                    i23++;
                                    i22 = i14;
                                    i13 = 8;
                                } else {
                                    i14 = i22;
                                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2 + ((int) ((layoutParams2.f3144a * Math.max(0, i17)) / f11)), 1073741824), makeMeasureSpec);
                                    i23++;
                                    i22 = i14;
                                    i13 = 8;
                                }
                            }
                        } else if (((ViewGroup.MarginLayoutParams) layoutParams2).width < 0 && (measuredWidth2 > i22 || layoutParams2.f3144a > 0.0f)) {
                            if (z13) {
                                int i26 = ((ViewGroup.MarginLayoutParams) layoutParams2).height;
                                if (i26 == -2) {
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, IntCompanionObject.MIN_VALUE);
                                    i15 = 1073741824;
                                } else if (i26 == -1) {
                                    i15 = 1073741824;
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
                                } else {
                                    i15 = 1073741824;
                                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i26, 1073741824);
                                }
                            } else {
                                i15 = 1073741824;
                                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824);
                            }
                            childAt2.measure(View.MeasureSpec.makeMeasureSpec(i22, i15), makeMeasureSpec2);
                        }
                    }
                }
                i14 = i22;
                i23++;
                i22 = i14;
                i13 = 8;
            }
        }
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + i12);
        this.f3139t = z11;
        t0.c cVar = this.F;
        if (cVar.f15077a == 0 || z11) {
            return;
        }
        cVar.a();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.f14775c);
        if (eVar.f3151j) {
            if (!this.H) {
                if (g(1.0f)) {
                }
            }
            this.G = true;
        } else {
            a(0);
        }
        this.G = eVar.f3151j;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        boolean z10 = this.f3139t;
        eVar.f3151j = z10 ? !z10 || this.f3141w == 1.0f : this.G;
        return eVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            this.H = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f3139t) {
            this.F.r(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                float x10 = motionEvent.getX();
                float y = motionEvent.getY();
                this.C = x10;
                this.D = y;
            } else if (actionMasked == 1 && c(this.f3140u)) {
                float x11 = motionEvent.getX();
                float y10 = motionEvent.getY();
                float f10 = x11 - this.C;
                float f11 = y10 - this.D;
                t0.c cVar = this.F;
                int i10 = cVar.f15078b;
                if ((f11 * f11) + (f10 * f10) < i10 * i10 && cVar.q(this.f3140u, (int) x11, (int) y10)) {
                    a(0);
                }
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (!isInTouchMode() && !this.f3139t) {
            this.G = view == this.f3140u;
        }
    }

    public void setCoveredFadeColor(int i10) {
        this.f3136f = i10;
    }

    public void setPanelSlideListener(d dVar) {
        this.E = dVar;
    }

    public void setParallaxDistance(int i10) {
        this.B = i10;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f3137j = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f3138m = drawable;
    }

    @Deprecated
    public void setShadowResource(int i10) {
        setShadowDrawable(getResources().getDrawable(i10));
    }

    public void setShadowResourceLeft(int i10) {
        Context context = getContext();
        Object obj = c0.a.f3717a;
        setShadowDrawableLeft(a.c.b(context, i10));
    }

    public void setShadowResourceRight(int i10) {
        Context context = getContext();
        Object obj = c0.a.f3717a;
        setShadowDrawableRight(a.c.b(context, i10));
    }

    public void setSliderFadeColor(int i10) {
        this.f3135c = i10;
    }
}
