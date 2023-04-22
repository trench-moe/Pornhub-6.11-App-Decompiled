package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import b7.k;
import com.app.pornhub.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import n0.a0;
import n0.r;
import n0.x;
import o0.b;
import ua.n;

@ViewPager.d
/* loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: k0  reason: collision with root package name */
    public static final m0.c<g> f7690k0 = new m0.e(16);
    public ColorStateList A;
    public Drawable B;
    public int C;
    public PorterDuff.Mode D;
    public float E;
    public float F;
    public final int G;
    public int H;
    public final int I;
    public final int J;
    public final int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public boolean U;
    public com.google.android.material.tabs.a V;
    public c W;

    /* renamed from: a0  reason: collision with root package name */
    public final ArrayList<c> f7691a0;

    /* renamed from: b0  reason: collision with root package name */
    public c f7692b0;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<g> f7693c;

    /* renamed from: c0  reason: collision with root package name */
    public ValueAnimator f7694c0;

    /* renamed from: d0  reason: collision with root package name */
    public ViewPager f7695d0;

    /* renamed from: e0  reason: collision with root package name */
    public y1.a f7696e0;

    /* renamed from: f  reason: collision with root package name */
    public g f7697f;

    /* renamed from: f0  reason: collision with root package name */
    public DataSetObserver f7698f0;

    /* renamed from: g0  reason: collision with root package name */
    public h f7699g0;

    /* renamed from: h0  reason: collision with root package name */
    public b f7700h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f7701i0;

    /* renamed from: j  reason: collision with root package name */
    public final f f7702j;

    /* renamed from: j0  reason: collision with root package name */
    public final m0.c<i> f7703j0;

    /* renamed from: m  reason: collision with root package name */
    public int f7704m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public int f7705t;

    /* renamed from: u  reason: collision with root package name */
    public int f7706u;

    /* renamed from: w  reason: collision with root package name */
    public int f7707w;
    public ColorStateList y;

    /* renamed from: z  reason: collision with root package name */
    public ColorStateList f7708z;

    /* loaded from: classes.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* loaded from: classes.dex */
    public class b implements ViewPager.g {

        /* renamed from: c  reason: collision with root package name */
        public boolean f7710c;

        public b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.g
        public void d(ViewPager viewPager, y1.a aVar, y1.a aVar2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f7695d0 == viewPager) {
                tabLayout.k(aVar2, this.f7710c);
            }
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface c<T extends g> {
        void a(T t2);

        void b(T t2);

        void c(T t2);
    }

    /* loaded from: classes.dex */
    public interface d extends c<g> {
    }

    /* loaded from: classes.dex */
    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.i();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.i();
        }
    }

    /* loaded from: classes.dex */
    public class f extends LinearLayout {

        /* renamed from: t  reason: collision with root package name */
        public static final /* synthetic */ int f7713t = 0;

        /* renamed from: c  reason: collision with root package name */
        public ValueAnimator f7714c;

        /* renamed from: f  reason: collision with root package name */
        public int f7715f;

        /* renamed from: j  reason: collision with root package name */
        public float f7716j;

        /* renamed from: m  reason: collision with root package name */
        public int f7717m;

        /* loaded from: classes.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ View f7718a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ View f7719b;

            public a(View view, View view2) {
                this.f7718a = view;
                this.f7719b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.c(this.f7718a, this.f7719b, valueAnimator.getAnimatedFraction());
            }
        }

        /* loaded from: classes.dex */
        public class b extends AnimatorListenerAdapter {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f7721a;

            public b(int i10) {
                this.f7721a = i10;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                f.this.f7715f = this.f7721a;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                f.this.f7715f = this.f7721a;
            }
        }

        public f(Context context) {
            super(context);
            this.f7715f = -1;
            this.f7717m = -1;
            setWillNotDraw(false);
        }

        public final void a() {
            View childAt = getChildAt(this.f7715f);
            TabLayout tabLayout = TabLayout.this;
            com.google.android.material.tabs.a aVar = tabLayout.V;
            Drawable drawable = tabLayout.B;
            Objects.requireNonNull(aVar);
            RectF a10 = com.google.android.material.tabs.a.a(tabLayout, childAt);
            drawable.setBounds((int) a10.left, drawable.getBounds().top, (int) a10.right, drawable.getBounds().bottom);
        }

        public void b(int i10) {
            Rect bounds = TabLayout.this.B.getBounds();
            TabLayout.this.B.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        public final void c(View view, View view2, float f10) {
            if (view != null && view.getWidth() > 0) {
                TabLayout tabLayout = TabLayout.this;
                tabLayout.V.b(tabLayout, view, view2, f10, tabLayout.B);
            } else {
                Drawable drawable = TabLayout.this.B;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.B.getBounds().bottom);
            }
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.d.k(this);
        }

        public final void d(boolean z10, int i10, int i11) {
            View childAt = getChildAt(this.f7715f);
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                a();
                return;
            }
            a aVar = new a(childAt, childAt2);
            if (!z10) {
                this.f7714c.removeAllUpdateListeners();
                this.f7714c.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f7714c = valueAnimator;
            valueAnimator.setInterpolator(ga.a.f9887b);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.addListener(new b(i10));
            valueAnimator.start();
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void draw(android.graphics.Canvas r7) {
            /*
                Method dump skipped, instructions count: 195
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.f.draw(android.graphics.Canvas):void");
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f7714c;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                a();
            } else {
                d(false, this.f7715f, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.M != 1) {
                if (tabLayout.P == 2) {
                }
            }
            int childCount = getChildCount();
            int i12 = 0;
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() == 0) {
                    i12 = Math.max(i12, childAt.getMeasuredWidth());
                }
            }
            if (i12 <= 0) {
                return;
            }
            if (i12 * childCount <= getMeasuredWidth() - (((int) n.b(getContext(), 16)) * 2)) {
                boolean z11 = false;
                for (int i14 = 0; i14 < childCount; i14++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i14).getLayoutParams();
                    if (layoutParams.width != i12 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i12;
                        layoutParams.weight = 0.0f;
                        z11 = true;
                    }
                }
                z10 = z11;
            } else {
                TabLayout tabLayout2 = TabLayout.this;
                tabLayout2.M = 0;
                tabLayout2.q(false);
            }
            if (z10) {
                super.onMeasure(i10, i11);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
            if (Build.VERSION.SDK_INT < 23 && this.f7717m != i10) {
                requestLayout();
                this.f7717m = i10;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: a  reason: collision with root package name */
        public Drawable f7723a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f7724b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f7725c;

        /* renamed from: e  reason: collision with root package name */
        public View f7726e;

        /* renamed from: f  reason: collision with root package name */
        public TabLayout f7727f;

        /* renamed from: g  reason: collision with root package name */
        public i f7728g;
        public int d = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f7729h = -1;

        public g a(Drawable drawable) {
            this.f7723a = drawable;
            TabLayout tabLayout = this.f7727f;
            if (tabLayout.M == 1 || tabLayout.P == 2) {
                tabLayout.q(true);
            }
            c();
            return this;
        }

        public g b(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f7725c) && !TextUtils.isEmpty(charSequence)) {
                this.f7728g.setContentDescription(charSequence);
            }
            this.f7724b = charSequence;
            c();
            return this;
        }

        public void c() {
            i iVar = this.f7728g;
            if (iVar != null) {
                iVar.f();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class h implements ViewPager.h {

        /* renamed from: c  reason: collision with root package name */
        public final WeakReference<TabLayout> f7730c;

        /* renamed from: f  reason: collision with root package name */
        public int f7731f;

        /* renamed from: j  reason: collision with root package name */
        public int f7732j;

        public h(TabLayout tabLayout) {
            this.f7730c = new WeakReference<>(tabLayout);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0027  */
        @Override // androidx.viewpager.widget.ViewPager.h
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void a(int r10, float r11, int r12) {
            /*
                r9 = this;
                r5 = r9
                java.lang.ref.WeakReference<com.google.android.material.tabs.TabLayout> r12 = r5.f7730c
                java.lang.String r7 = "Smob - Mod obfuscation tool v4.6 by Kirlif'"
                java.lang.Object r8 = r12.get()
                r12 = r8
                com.google.android.material.tabs.TabLayout r12 = (com.google.android.material.tabs.TabLayout) r12
                if (r12 == 0) goto L32
                r8 = 3
                int r0 = r5.f7732j
                r7 = 5
                r7 = 0
                r1 = r7
                r7 = 2
                r2 = r7
                r3 = 1
                if (r0 != r2) goto L22
                int r4 = r5.f7731f
                if (r4 != r3) goto L1e
                goto L23
            L1e:
                r8 = 2
                r7 = 0
                r4 = r7
                goto L25
            L22:
                r7 = 2
            L23:
                r7 = 1
                r4 = r7
            L25:
                if (r0 != r2) goto L2d
                int r0 = r5.f7731f
                r7 = 2
                if (r0 == 0) goto L2f
                r8 = 3
            L2d:
                r7 = 1
                r1 = r7
            L2f:
                r12.l(r10, r11, r4, r1)
            L32:
                r7 = 6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.h.a(int, float, int):void");
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void b(int i10) {
            this.f7731f = this.f7732j;
            this.f7732j = i10;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void c(int i10) {
            boolean z10;
            TabLayout tabLayout = this.f7730c.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f7732j;
            if (i11 != 0 && (i11 != 2 || this.f7731f != 0)) {
                z10 = false;
                tabLayout.j(tabLayout.g(i10), z10);
            }
            z10 = true;
            tabLayout.j(tabLayout.g(i10), z10);
        }
    }

    /* loaded from: classes.dex */
    public final class i extends LinearLayout {
        public static final /* synthetic */ int B = 0;

        /* renamed from: c  reason: collision with root package name */
        public g f7733c;

        /* renamed from: f  reason: collision with root package name */
        public TextView f7734f;

        /* renamed from: j  reason: collision with root package name */
        public ImageView f7735j;

        /* renamed from: m  reason: collision with root package name */
        public View f7736m;
        public ha.a n;

        /* renamed from: t  reason: collision with root package name */
        public View f7737t;

        /* renamed from: u  reason: collision with root package name */
        public TextView f7738u;

        /* renamed from: w  reason: collision with root package name */
        public ImageView f7739w;
        public Drawable y;

        /* renamed from: z  reason: collision with root package name */
        public int f7740z;

        public i(Context context) {
            super(context);
            this.f7740z = 2;
            g(context);
            int i10 = TabLayout.this.f7704m;
            int i11 = TabLayout.this.n;
            int i12 = TabLayout.this.f7705t;
            int i13 = TabLayout.this.f7706u;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.e.k(this, i10, i11, i12, i13);
            setGravity(17);
            setOrientation(!TabLayout.this.Q ? 1 : 0);
            setClickable(true);
            x.x(this, r.a(getContext(), 1002));
        }

        private ha.a getBadge() {
            return this.n;
        }

        private ha.a getOrCreateBadge() {
            if (this.n == null) {
                Context context = getContext();
                ha.a aVar = new ha.a(context);
                int[] iArr = m9.a.y;
                ua.j.a(context, null, R.attr.badgeStyle, 2132018186);
                ua.j.b(context, null, iArr, R.attr.badgeStyle, 2132018186, new int[0]);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.badgeStyle, 2132018186);
                aVar.j(obtainStyledAttributes.getInt(8, 4));
                if (obtainStyledAttributes.hasValue(9)) {
                    aVar.k(obtainStyledAttributes.getInt(9, 0));
                }
                aVar.g(za.c.a(context, obtainStyledAttributes, 0).getDefaultColor());
                if (obtainStyledAttributes.hasValue(3)) {
                    aVar.i(za.c.a(context, obtainStyledAttributes, 3).getDefaultColor());
                }
                aVar.h(obtainStyledAttributes.getInt(1, 8388661));
                aVar.f10403w.A = obtainStyledAttributes.getDimensionPixelOffset(6, 0);
                aVar.m();
                aVar.f10403w.B = obtainStyledAttributes.getDimensionPixelOffset(10, 0);
                aVar.m();
                aVar.f10403w.C = obtainStyledAttributes.getDimensionPixelOffset(7, aVar.f10403w.A);
                aVar.m();
                aVar.f10403w.D = obtainStyledAttributes.getDimensionPixelOffset(11, aVar.f10403w.B);
                aVar.m();
                if (obtainStyledAttributes.hasValue(2)) {
                    aVar.n = obtainStyledAttributes.getDimensionPixelSize(2, (int) aVar.n);
                }
                if (obtainStyledAttributes.hasValue(4)) {
                    aVar.f10402u = obtainStyledAttributes.getDimensionPixelSize(4, (int) aVar.f10402u);
                }
                if (obtainStyledAttributes.hasValue(5)) {
                    aVar.f10401t = obtainStyledAttributes.getDimensionPixelSize(5, (int) aVar.f10401t);
                }
                obtainStyledAttributes.recycle();
                this.n = aVar;
            }
            d();
            ha.a aVar2 = this.n;
            if (aVar2 != null) {
                return aVar2;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final boolean a() {
            return this.n != null;
        }

        public final void b(View view) {
            if (a()) {
                if (view != null) {
                    setClipChildren(false);
                    setClipToPadding(false);
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                    ha.b.a(this.n, view, null);
                    this.f7736m = view;
                }
            }
        }

        public final void c() {
            if (a()) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.f7736m;
                if (view != null) {
                    ha.b.b(this.n, view);
                    this.f7736m = null;
                }
            }
        }

        public final void d() {
            g gVar;
            g gVar2;
            if (a()) {
                if (this.f7737t != null) {
                    c();
                    return;
                }
                ImageView imageView = this.f7735j;
                if (imageView != null && (gVar2 = this.f7733c) != null && gVar2.f7723a != null) {
                    if (this.f7736m == imageView) {
                        e(imageView);
                        return;
                    }
                    c();
                    b(this.f7735j);
                } else if (this.f7734f == null || (gVar = this.f7733c) == null) {
                    c();
                } else {
                    Objects.requireNonNull(gVar);
                    View view = this.f7736m;
                    TextView textView = this.f7734f;
                    if (view == textView) {
                        e(textView);
                        return;
                    }
                    c();
                    b(this.f7734f);
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.y;
            boolean z10 = false;
            if (drawable != null && drawable.isStateful()) {
                z10 = false | this.y.setState(drawableState);
            }
            if (z10) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e(View view) {
            if (a() && view == this.f7736m) {
                ha.b.c(this.n, view, null);
            }
        }

        public final void f() {
            g gVar = this.f7733c;
            View view = gVar != null ? gVar.f7726e : null;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f7737t = view;
                TextView textView = this.f7734f;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f7735j;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f7735j.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.f7738u = textView2;
                if (textView2 != null) {
                    this.f7740z = textView2.getMaxLines();
                }
                this.f7739w = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.f7737t;
                if (view2 != null) {
                    removeView(view2);
                    this.f7737t = null;
                }
                this.f7738u = null;
                this.f7739w = null;
            }
            boolean z10 = false;
            if (this.f7737t == null) {
                if (this.f7735j == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                    this.f7735j = imageView2;
                    addView(imageView2, 0);
                }
                if (this.f7734f == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.design_layout_tab_text, (ViewGroup) this, false);
                    this.f7734f = textView3;
                    addView(textView3);
                    this.f7740z = this.f7734f.getMaxLines();
                }
                q0.h.f(this.f7734f, TabLayout.this.f7707w);
                ColorStateList colorStateList = TabLayout.this.y;
                if (colorStateList != null) {
                    this.f7734f.setTextColor(colorStateList);
                }
                h(this.f7734f, this.f7735j);
                d();
                ImageView imageView3 = this.f7735j;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.b(this, imageView3));
                }
                TextView textView4 = this.f7734f;
                if (textView4 != null) {
                    textView4.addOnLayoutChangeListener(new com.google.android.material.tabs.b(this, textView4));
                }
            } else {
                TextView textView5 = this.f7738u;
                if (textView5 != null || this.f7739w != null) {
                    h(textView5, this.f7739w);
                }
            }
            if (gVar != null && !TextUtils.isEmpty(gVar.f7725c)) {
                setContentDescription(gVar.f7725c);
            }
            if (gVar != null) {
                TabLayout tabLayout = gVar.f7727f;
                if (tabLayout == null) {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                int selectedTabPosition = tabLayout.getSelectedTabPosition();
                if (selectedTabPosition != -1 && selectedTabPosition == gVar.d) {
                    z10 = true;
                    setSelected(z10);
                }
            }
            setSelected(z10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
        /* JADX WARN: Type inference failed for: r3v0, types: [android.graphics.drawable.RippleDrawable] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void g(android.content.Context r9) {
            /*
                r8 = this;
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                int r0 = r0.G
                r7 = 2
                r1 = 0
                if (r0 == 0) goto L22
                r6 = 2
                android.graphics.drawable.Drawable r5 = f.a.a(r9, r0)
                r9 = r5
                r8.y = r9
                if (r9 == 0) goto L26
                boolean r9 = r9.isStateful()
                if (r9 == 0) goto L26
                android.graphics.drawable.Drawable r9 = r8.y
                int[] r0 = r8.getDrawableState()
                r9.setState(r0)
                goto L27
            L22:
                r7 = 7
                r8.y = r1
                r7 = 4
            L26:
                r7 = 6
            L27:
                android.graphics.drawable.GradientDrawable r9 = new android.graphics.drawable.GradientDrawable
                r7 = 3
                r9.<init>()
                r0 = 0
                r9.setColor(r0)
                com.google.android.material.tabs.TabLayout r0 = com.google.android.material.tabs.TabLayout.this
                r7 = 5
                android.content.res.ColorStateList r0 = r0.A
                r6 = 5
                if (r0 == 0) goto L6d
                r6 = 4
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r2 = 925353388(0x3727c5ac, float:1.0E-5)
                r6 = 7
                r0.setCornerRadius(r2)
                r5 = -1
                r2 = r5
                r0.setColor(r2)
                r6 = 2
                com.google.android.material.tabs.TabLayout r2 = com.google.android.material.tabs.TabLayout.this
                r6 = 6
                android.content.res.ColorStateList r2 = r2.A
                android.content.res.ColorStateList r5 = ab.b.a(r2)
                r2 = r5
                android.graphics.drawable.RippleDrawable r3 = new android.graphics.drawable.RippleDrawable
                r7 = 3
                com.google.android.material.tabs.TabLayout r4 = com.google.android.material.tabs.TabLayout.this
                r6 = 4
                boolean r4 = r4.U
                r7 = 1
                if (r4 == 0) goto L63
                r7 = 3
                r9 = r1
            L63:
                if (r4 == 0) goto L67
                r6 = 7
                goto L69
            L67:
                r6 = 3
                r1 = r0
            L69:
                r3.<init>(r2, r9, r1)
                r9 = r3
            L6d:
                r7 = 4
                java.util.WeakHashMap<android.view.View, n0.a0> r0 = n0.x.f13156a
                n0.x.d.q(r8, r9)
                r6 = 1
                com.google.android.material.tabs.TabLayout r9 = com.google.android.material.tabs.TabLayout.this
                r9.invalidate()
                r7 = 2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.g(android.content.Context):void");
        }

        public int getContentHeight() {
            View[] viewArr = {this.f7734f, this.f7735j, this.f7737t};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getTop()) : view.getTop();
                    i10 = z10 ? Math.max(i10, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public int getContentWidth() {
            View[] viewArr = {this.f7734f, this.f7735j, this.f7737t};
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            for (int i12 = 0; i12 < 3; i12++) {
                View view = viewArr[i12];
                if (view != null && view.getVisibility() == 0) {
                    i11 = z10 ? Math.min(i11, view.getLeft()) : view.getLeft();
                    i10 = z10 ? Math.max(i10, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return i10 - i11;
        }

        public g getTab() {
            return this.f7733c;
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00d5  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void h(android.widget.TextView r9, android.widget.ImageView r10) {
            /*
                Method dump skipped, instructions count: 225
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.h(android.widget.TextView, android.widget.ImageView):void");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            ha.a aVar = this.n;
            if (aVar != null && aVar.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                accessibilityNodeInfo.setContentDescription(((Object) contentDescription) + ", " + ((Object) this.n.c()));
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b.c.a(0, 1, this.f7733c.d, 1, false, isSelected()).f13496a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) b.a.f13484g.f13492a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(R.string.item_view_role_description));
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) goto L25;
         */
        @Override // android.widget.LinearLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onMeasure(int r12, int r13) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.i.onMeasure(int, int):void");
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f7733c != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                g gVar = this.f7733c;
                TabLayout tabLayout = gVar.f7727f;
                if (tabLayout != null) {
                    tabLayout.j(gVar, true);
                    return true;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return performClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            if (isSelected() != z10) {
            }
            super.setSelected(z10);
            TextView textView = this.f7734f;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f7735j;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f7737t;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        public void setTab(g gVar) {
            if (gVar != this.f7733c) {
                this.f7733c = gVar;
                f();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class j implements d {

        /* renamed from: a  reason: collision with root package name */
        public final ViewPager f7741a;

        public j(ViewPager viewPager) {
            this.f7741a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(g gVar) {
            this.f7741a.setCurrentItem(gVar.d);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(g gVar) {
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i10) {
        super(hb.a.a(context, attributeSet, i10, 2132018036), attributeSet, i10);
        this.f7693c = new ArrayList<>();
        this.B = new GradientDrawable();
        this.C = 0;
        this.H = IntCompanionObject.MAX_VALUE;
        this.S = -1;
        this.f7691a0 = new ArrayList<>();
        this.f7703j0 = new m0.d(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f7702j = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray d10 = ua.j.d(context2, attributeSet, m9.a.f13025u0, i10, 2132018036, 23);
        if (getBackground() instanceof ColorDrawable) {
            cb.g gVar = new cb.g();
            gVar.r(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            gVar.f3929c.f3939b = new ra.a(context2);
            gVar.C();
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            gVar.q(x.i.i(this));
            x.d.q(this, gVar);
        }
        setSelectedTabIndicator(za.c.d(context2, d10, 5));
        setSelectedTabIndicatorColor(d10.getColor(8, 0));
        fVar.b(d10.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(d10.getInt(10, 0));
        setTabIndicatorAnimationMode(d10.getInt(7, 0));
        setTabIndicatorFullWidth(d10.getBoolean(9, true));
        int dimensionPixelSize = d10.getDimensionPixelSize(16, 0);
        this.f7706u = dimensionPixelSize;
        this.f7705t = dimensionPixelSize;
        this.n = dimensionPixelSize;
        this.f7704m = dimensionPixelSize;
        this.f7704m = d10.getDimensionPixelSize(19, dimensionPixelSize);
        this.n = d10.getDimensionPixelSize(20, this.n);
        this.f7705t = d10.getDimensionPixelSize(18, this.f7705t);
        this.f7706u = d10.getDimensionPixelSize(17, this.f7706u);
        int resourceId = d10.getResourceId(23, 2132017687);
        this.f7707w = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, k.T);
        try {
            this.E = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.y = za.c.a(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (d10.hasValue(24)) {
                this.y = za.c.a(context2, d10, 24);
            }
            if (d10.hasValue(22)) {
                this.y = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{d10.getColor(22, 0), this.y.getDefaultColor()});
            }
            this.f7708z = za.c.a(context2, d10, 3);
            this.D = n.g(d10.getInt(4, -1), null);
            this.A = za.c.a(context2, d10, 21);
            this.N = d10.getInt(6, 300);
            this.I = d10.getDimensionPixelSize(14, -1);
            this.J = d10.getDimensionPixelSize(13, -1);
            this.G = d10.getResourceId(0, 0);
            this.L = d10.getDimensionPixelSize(1, 0);
            this.P = d10.getInt(15, 1);
            this.M = d10.getInt(2, 0);
            this.Q = d10.getBoolean(12, false);
            this.U = d10.getBoolean(25, false);
            d10.recycle();
            Resources resources = getResources();
            this.F = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.K = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            d();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getDefaultHeight() {
        int size = this.f7693c.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                g gVar = this.f7693c.get(i10);
                if (gVar != null && gVar.f7723a != null && !TextUtils.isEmpty(gVar.f7724b)) {
                    z10 = true;
                    break;
                }
                i10++;
            } else {
                break;
            }
        }
        return (!z10 || this.Q) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i10 = this.I;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.P;
        if (i11 != 0 && i11 != 2) {
            return 0;
        }
        return this.K;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f7702j.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f7702j.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f7702j.getChildAt(i11);
                boolean z10 = true;
                childAt.setSelected(i11 == i10);
                if (i11 != i10) {
                    z10 = false;
                }
                childAt.setActivated(z10);
                i11++;
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public void a(com.google.android.material.tabs.TabLayout.g r11, int r12, boolean r13) {
        /*
            r10 = this;
            com.google.android.material.tabs.TabLayout r0 = r11.f7727f
            r7 = 4
            if (r0 != r10) goto L5e
            r8 = 4
            r11.d = r12
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$g> r0 = r10.f7693c
            r0.add(r12, r11)
            r8 = 3
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$g> r0 = r10.f7693c
            r7 = 1
            int r6 = r0.size()
            r0 = r6
        L16:
            r1 = 1
            int r12 = r12 + r1
            if (r12 >= r0) goto L26
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$g> r1 = r10.f7693c
            java.lang.Object r1 = r1.get(r12)
            com.google.android.material.tabs.TabLayout$g r1 = (com.google.android.material.tabs.TabLayout.g) r1
            r9 = 4
            r1.d = r12
            goto L16
        L26:
            com.google.android.material.tabs.TabLayout$i r12 = r11.f7728g
            r0 = 0
            r9 = 2
            r12.setSelected(r0)
            r12.setActivated(r0)
            r7 = 7
            com.google.android.material.tabs.TabLayout$f r0 = r10.f7702j
            r8 = 4
            int r2 = r11.d
            r7 = 3
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            r8 = 2
            r4 = -2
            r6 = -1
            r5 = r6
            r3.<init>(r4, r5)
            r10.p(r3)
            r0.addView(r12, r2, r3)
            if (r13 == 0) goto L5c
            com.google.android.material.tabs.TabLayout r12 = r11.f7727f
            if (r12 == 0) goto L51
            r12.j(r11, r1)
            r8 = 1
            goto L5d
        L51:
            r8 = 3
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Tab not attached to a TabLayout"
            r12 = r6
            r11.<init>(r12)
            throw r11
            r8 = 3
        L5c:
            r9 = 6
        L5d:
            return
        L5e:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            r8 = 1
            java.lang.String r12 = "Tab belongs to a different TabLayout."
            r9 = 6
            r11.<init>(r12)
            throw r11
            r9 = 5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.a(com.google.android.material.tabs.TabLayout$g, int, boolean):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        b(view);
    }

    public final void b(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        g h10 = h();
        CharSequence charSequence = tabItem.f7687c;
        if (charSequence != null) {
            h10.b(charSequence);
        }
        Drawable drawable = tabItem.f7688f;
        if (drawable != null) {
            h10.a(drawable);
        }
        int i10 = tabItem.f7689j;
        if (i10 != 0) {
            h10.f7726e = LayoutInflater.from(h10.f7728g.getContext()).inflate(i10, (ViewGroup) h10.f7728g, false);
            h10.c();
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            h10.f7725c = tabItem.getContentDescription();
            h10.c();
        }
        a(h10, this.f7693c.size(), this.f7693c.isEmpty());
    }

    public final void c(int i10) {
        boolean z10;
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if (x.g.c(this)) {
                f fVar = this.f7702j;
                int childCount = fVar.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        z10 = false;
                        break;
                    } else if (fVar.getChildAt(i11).getWidth() <= 0) {
                        z10 = true;
                        break;
                    } else {
                        i11++;
                    }
                }
                if (!z10) {
                    int scrollX = getScrollX();
                    int e10 = e(i10, 0.0f);
                    if (scrollX != e10) {
                        f();
                        this.f7694c0.setIntValues(scrollX, e10);
                        this.f7694c0.start();
                    }
                    f fVar2 = this.f7702j;
                    int i12 = this.N;
                    ValueAnimator valueAnimator = fVar2.f7714c;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        fVar2.f7714c.cancel();
                    }
                    fVar2.d(true, i10, i12);
                    return;
                }
            }
        }
        l(i10, 0.0f, true, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r0 != 2) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            r7 = this;
            int r0 = r7.P
            r5 = 2
            r1 = r5
            r2 = 0
            if (r0 == 0) goto Le
            if (r0 != r1) goto Lb
            r6 = 7
            goto Le
        Lb:
            r5 = 0
            r0 = r5
            goto L19
        Le:
            int r0 = r7.L
            r6 = 7
            int r3 = r7.f7704m
            int r0 = r0 - r3
            int r5 = java.lang.Math.max(r2, r0)
            r0 = r5
        L19:
            com.google.android.material.tabs.TabLayout$f r3 = r7.f7702j
            java.util.WeakHashMap<android.view.View, n0.a0> r4 = n0.x.f13156a
            n0.x.e.k(r3, r0, r2, r2, r2)
            int r0 = r7.P
            java.lang.String r2 = "TabLayout"
            r6 = 4
            r3 = 1
            if (r0 == 0) goto L43
            if (r0 == r3) goto L2e
            if (r0 == r1) goto L2e
            r6 = 3
            goto L64
        L2e:
            int r0 = r7.M
            r6 = 4
            if (r0 != r1) goto L3a
            r6 = 4
            java.lang.String r5 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            r0 = r5
            android.util.Log.w(r2, r0)
        L3a:
            r6 = 3
            com.google.android.material.tabs.TabLayout$f r0 = r7.f7702j
            r6 = 4
            r0.setGravity(r3)
            r6 = 2
            goto L64
        L43:
            int r0 = r7.M
            r6 = 5
            if (r0 == 0) goto L54
            if (r0 == r3) goto L4e
            r6 = 1
            if (r0 == r1) goto L5a
            goto L64
        L4e:
            com.google.android.material.tabs.TabLayout$f r0 = r7.f7702j
            r0.setGravity(r3)
            goto L64
        L54:
            java.lang.String r5 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            r0 = r5
            android.util.Log.w(r2, r0)
        L5a:
            com.google.android.material.tabs.TabLayout$f r0 = r7.f7702j
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r6 = 1
            r0.setGravity(r1)
            r6 = 2
        L64:
            r7.q(r3)
            r6 = 7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.d():void");
    }

    public final int e(int i10, float f10) {
        View childAt;
        int i11 = this.P;
        int i12 = 0;
        if ((i11 == 0 || i11 == 2) && (childAt = this.f7702j.getChildAt(i10)) != null) {
            int i13 = i10 + 1;
            View childAt2 = i13 < this.f7702j.getChildCount() ? this.f7702j.getChildAt(i13) : null;
            int width = childAt.getWidth();
            if (childAt2 != null) {
                i12 = childAt2.getWidth();
            }
            int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
            int i14 = (int) ((width + i12) * 0.5f * f10);
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            return x.e.d(this) == 0 ? left + i14 : left - i14;
        }
        return 0;
    }

    public final void f() {
        if (this.f7694c0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f7694c0 = valueAnimator;
            valueAnimator.setInterpolator(ga.a.f9887b);
            this.f7694c0.setDuration(this.N);
            this.f7694c0.addUpdateListener(new a());
        }
    }

    public g g(int i10) {
        if (i10 >= 0 && i10 < getTabCount()) {
            return this.f7693c.get(i10);
        }
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        g gVar = this.f7697f;
        if (gVar != null) {
            return gVar.d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f7693c.size();
    }

    public int getTabGravity() {
        return this.M;
    }

    public ColorStateList getTabIconTint() {
        return this.f7708z;
    }

    public int getTabIndicatorAnimationMode() {
        return this.T;
    }

    public int getTabIndicatorGravity() {
        return this.O;
    }

    public int getTabMaxWidth() {
        return this.H;
    }

    public int getTabMode() {
        return this.P;
    }

    public ColorStateList getTabRippleColor() {
        return this.A;
    }

    public Drawable getTabSelectedIndicator() {
        return this.B;
    }

    public ColorStateList getTabTextColors() {
        return this.y;
    }

    public g h() {
        g gVar = (g) ((m0.e) f7690k0).b();
        if (gVar == null) {
            gVar = new g();
        }
        gVar.f7727f = this;
        m0.c<i> cVar = this.f7703j0;
        i b10 = cVar != null ? cVar.b() : null;
        if (b10 == null) {
            b10 = new i(getContext());
        }
        b10.setTab(gVar);
        b10.setFocusable(true);
        b10.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f7725c)) {
            b10.setContentDescription(gVar.f7724b);
        } else {
            b10.setContentDescription(gVar.f7725c);
        }
        gVar.f7728g = b10;
        int i10 = gVar.f7729h;
        if (i10 != -1) {
            b10.setId(i10);
        }
        return gVar;
    }

    public void i() {
        int currentItem;
        for (int childCount = this.f7702j.getChildCount() - 1; childCount >= 0; childCount--) {
            i iVar = (i) this.f7702j.getChildAt(childCount);
            this.f7702j.removeViewAt(childCount);
            if (iVar != null) {
                iVar.setTab(null);
                iVar.setSelected(false);
                this.f7703j0.a(iVar);
            }
            requestLayout();
        }
        Iterator<g> it = this.f7693c.iterator();
        while (it.hasNext()) {
            g next = it.next();
            it.remove();
            next.f7727f = null;
            next.f7728g = null;
            next.f7723a = null;
            next.f7729h = -1;
            next.f7724b = null;
            next.f7725c = null;
            next.d = -1;
            next.f7726e = null;
            ((m0.e) f7690k0).a(next);
        }
        this.f7697f = null;
        y1.a aVar = this.f7696e0;
        if (aVar != null) {
            int e10 = aVar.e();
            for (int i10 = 0; i10 < e10; i10++) {
                g h10 = h();
                h10.b(this.f7696e0.f(i10));
                a(h10, this.f7693c.size(), false);
            }
            ViewPager viewPager = this.f7695d0;
            if (viewPager != null && e10 > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                j(g(currentItem), true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(com.google.android.material.tabs.TabLayout.g r9, boolean r10) {
        /*
            r8 = this;
            r4 = r8
            com.google.android.material.tabs.TabLayout$g r0 = r4.f7697f
            r6 = -1
            r1 = r6
            if (r0 != r9) goto L2b
            if (r0 == 0) goto L92
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r10 = r4.f7691a0
            int r10 = r10.size()
            int r10 = r10 + r1
        L10:
            if (r10 < 0) goto L23
            r6 = 2
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r0 = r4.f7691a0
            java.lang.Object r0 = r0.get(r10)
            com.google.android.material.tabs.TabLayout$c r0 = (com.google.android.material.tabs.TabLayout.c) r0
            r6 = 5
            r0.a(r9)
            int r10 = r10 + (-1)
            r6 = 1
            goto L10
        L23:
            r6 = 7
            int r9 = r9.d
            r7 = 1
            r4.c(r9)
            goto L92
        L2b:
            if (r9 == 0) goto L32
            r6 = 1
            int r2 = r9.d
            r7 = 7
            goto L34
        L32:
            r7 = -1
            r2 = r7
        L34:
            if (r10 == 0) goto L54
            if (r0 == 0) goto L3e
            r6 = 4
            int r10 = r0.d
            if (r10 != r1) goto L49
            r7 = 6
        L3e:
            r7 = 2
            if (r2 == r1) goto L49
            r6 = 0
            r10 = r6
            r3 = 1
            r4.l(r2, r10, r3, r3)
            r7 = 2
            goto L4d
        L49:
            r4.c(r2)
            r7 = 7
        L4d:
            if (r2 == r1) goto L54
            r6 = 6
            r4.setSelectedTabView(r2)
            r7 = 3
        L54:
            r4.f7697f = r9
            r6 = 7
            if (r0 == 0) goto L73
            r7 = 7
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r10 = r4.f7691a0
            int r10 = r10.size()
            int r10 = r10 + r1
        L61:
            if (r10 < 0) goto L73
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r2 = r4.f7691a0
            r6 = 1
            java.lang.Object r2 = r2.get(r10)
            com.google.android.material.tabs.TabLayout$c r2 = (com.google.android.material.tabs.TabLayout.c) r2
            r7 = 5
            r2.c(r0)
            int r10 = r10 + (-1)
            goto L61
        L73:
            r7 = 5
            if (r9 == 0) goto L92
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r10 = r4.f7691a0
            r7 = 5
            int r7 = r10.size()
            r10 = r7
            int r10 = r10 + r1
        L7f:
            if (r10 < 0) goto L92
            r6 = 7
            java.util.ArrayList<com.google.android.material.tabs.TabLayout$c> r0 = r4.f7691a0
            java.lang.Object r0 = r0.get(r10)
            com.google.android.material.tabs.TabLayout$c r0 = (com.google.android.material.tabs.TabLayout.c) r0
            r0.b(r9)
            r7 = 3
            int r10 = r10 + (-1)
            r6 = 3
            goto L7f
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.j(com.google.android.material.tabs.TabLayout$g, boolean):void");
    }

    public void k(y1.a aVar, boolean z10) {
        DataSetObserver dataSetObserver;
        y1.a aVar2 = this.f7696e0;
        if (aVar2 != null && (dataSetObserver = this.f7698f0) != null) {
            aVar2.f18384a.unregisterObserver(dataSetObserver);
        }
        this.f7696e0 = aVar;
        if (z10 && aVar != null) {
            if (this.f7698f0 == null) {
                this.f7698f0 = new e();
            }
            aVar.f18384a.registerObserver(this.f7698f0);
        }
        i();
    }

    public void l(int i10, float f10, boolean z10, boolean z11) {
        int round = Math.round(i10 + f10);
        if (round < 0 || round >= this.f7702j.getChildCount()) {
            return;
        }
        if (z11) {
            f fVar = this.f7702j;
            ValueAnimator valueAnimator = fVar.f7714c;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                fVar.f7714c.cancel();
            }
            fVar.f7715f = i10;
            fVar.f7716j = f10;
            fVar.c(fVar.getChildAt(i10), fVar.getChildAt(fVar.f7715f + 1), fVar.f7716j);
        }
        ValueAnimator valueAnimator2 = this.f7694c0;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.f7694c0.cancel();
        }
        scrollTo(i10 < 0 ? 0 : e(i10, f10), 0);
        if (z10) {
            setSelectedTabView(round);
        }
    }

    public void m(ViewPager viewPager, boolean z10) {
        n(viewPager, z10, false);
    }

    public final void n(ViewPager viewPager, boolean z10, boolean z11) {
        List<ViewPager.g> list;
        List<ViewPager.h> list2;
        ViewPager viewPager2 = this.f7695d0;
        if (viewPager2 != null) {
            h hVar = this.f7699g0;
            if (hVar != null && (list2 = viewPager2.f3312m0) != null) {
                list2.remove(hVar);
            }
            b bVar = this.f7700h0;
            if (bVar != null && (list = this.f7695d0.f3315p0) != null) {
                list.remove(bVar);
            }
        }
        c cVar = this.f7692b0;
        if (cVar != null) {
            this.f7691a0.remove(cVar);
            this.f7692b0 = null;
        }
        if (viewPager != null) {
            this.f7695d0 = viewPager;
            if (this.f7699g0 == null) {
                this.f7699g0 = new h(this);
            }
            h hVar2 = this.f7699g0;
            hVar2.f7732j = 0;
            hVar2.f7731f = 0;
            viewPager.c(hVar2);
            j jVar = new j(viewPager);
            this.f7692b0 = jVar;
            if (!this.f7691a0.contains(jVar)) {
                this.f7691a0.add(jVar);
            }
            y1.a adapter = viewPager.getAdapter();
            if (adapter != null) {
                k(adapter, z10);
            }
            if (this.f7700h0 == null) {
                this.f7700h0 = new b();
            }
            b bVar2 = this.f7700h0;
            bVar2.f7710c = z10;
            viewPager.b(bVar2);
            l(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.f7695d0 = null;
            k(null, false);
        }
        this.f7701i0 = z11;
    }

    public final void o() {
        int size = this.f7693c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f7693c.get(i10).c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof cb.g) {
            m9.a.D(this, (cb.g) background);
        }
        if (this.f7695d0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                n((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f7701i0) {
            setupWithViewPager(null);
            this.f7701i0 = false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        i iVar;
        Drawable drawable;
        for (int i10 = 0; i10 < this.f7702j.getChildCount(); i10++) {
            View childAt = this.f7702j.getChildAt(i10);
            if ((childAt instanceof i) && (drawable = (iVar = (i) childAt).y) != null) {
                drawable.setBounds(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
                iVar.y.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0228b.a(1, getTabCount(), false, 1).f13495a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
        if (r0 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
        if (r10.getMeasuredWidth() < getMeasuredWidth()) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    public final void p(LinearLayout.LayoutParams layoutParams) {
        if (this.P == 1 && this.M == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    public void q(boolean z10) {
        for (int i10 = 0; i10 < this.f7702j.getChildCount(); i10++) {
            View childAt = this.f7702j.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            p((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        m9.a.C(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.Q != z10) {
            this.Q = z10;
            for (int i10 = 0; i10 < this.f7702j.getChildCount(); i10++) {
                View childAt = this.f7702j.getChildAt(i10);
                if (childAt instanceof i) {
                    i iVar = (i) childAt;
                    iVar.setOrientation(!TabLayout.this.Q ? 1 : 0);
                    TextView textView = iVar.f7738u;
                    if (textView == null && iVar.f7739w == null) {
                        iVar.h(iVar.f7734f, iVar.f7735j);
                    }
                    iVar.h(textView, iVar.f7739w);
                }
            }
            d();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.W;
        if (cVar2 != null) {
            this.f7691a0.remove(cVar2);
        }
        this.W = cVar;
        if (cVar != null && !this.f7691a0.contains(cVar)) {
            this.f7691a0.add(cVar);
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        f();
        this.f7694c0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(f.a.a(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.B != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.B = drawable;
            int i10 = this.S;
            if (i10 == -1) {
                i10 = drawable.getIntrinsicHeight();
            }
            this.f7702j.b(i10);
        }
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.C = i10;
        q(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.O != i10) {
            this.O = i10;
            f fVar = this.f7702j;
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.d.k(fVar);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.S = i10;
        this.f7702j.b(i10);
    }

    public void setTabGravity(int i10) {
        if (this.M != i10) {
            this.M = i10;
            d();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f7708z != colorStateList) {
            this.f7708z = colorStateList;
            o();
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(c0.a.c(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.T = i10;
        if (i10 == 0) {
            this.V = new com.google.android.material.tabs.a();
        } else if (i10 == 1) {
            this.V = new fb.a();
        } else {
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.R = z10;
        f fVar = this.f7702j;
        int i10 = f.f7713t;
        fVar.a();
        f fVar2 = this.f7702j;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        x.d.k(fVar2);
    }

    public void setTabMode(int i10) {
        if (i10 != this.P) {
            this.P = i10;
            d();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            for (int i10 = 0; i10 < this.f7702j.getChildCount(); i10++) {
                View childAt = this.f7702j.getChildAt(i10);
                if (childAt instanceof i) {
                    i iVar = (i) childAt;
                    Context context = getContext();
                    int i11 = i.B;
                    iVar.g(context);
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(c0.a.c(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            o();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(y1.a aVar) {
        k(aVar, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            for (int i10 = 0; i10 < this.f7702j.getChildCount(); i10++) {
                View childAt = this.f7702j.getChildAt(i10);
                if (childAt instanceof i) {
                    Context context = getContext();
                    int i11 = i.B;
                    ((i) childAt).g(context);
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}
