package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.app.pornhub.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.d0;
import n0.i;
import n0.n;
import n0.x;
import o0.b;
import ua.j;

/* loaded from: classes.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.b {
    public boolean A;
    public boolean B;
    public int C;
    public WeakReference<View> D;
    public ValueAnimator E;
    public final List<e> F;
    public int[] G;
    public Drawable H;

    /* renamed from: c  reason: collision with root package name */
    public int f7097c;

    /* renamed from: f  reason: collision with root package name */
    public int f7098f;

    /* renamed from: j  reason: collision with root package name */
    public int f7099j;

    /* renamed from: m  reason: collision with root package name */
    public int f7100m;
    public boolean n;

    /* renamed from: t  reason: collision with root package name */
    public int f7101t;

    /* renamed from: u  reason: collision with root package name */
    public d0 f7102u;

    /* renamed from: w  reason: collision with root package name */
    public List<b> f7103w;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f7104z;

    /* loaded from: classes.dex */
    public static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {

        /* renamed from: j  reason: collision with root package name */
        public int f7105j;

        /* renamed from: k  reason: collision with root package name */
        public int f7106k;

        /* renamed from: l  reason: collision with root package name */
        public ValueAnimator f7107l;

        /* renamed from: m  reason: collision with root package name */
        public a f7108m;
        public WeakReference<View> n;

        /* loaded from: classes.dex */
        public static class a extends s0.a {
            public static final Parcelable.Creator<a> CREATOR = new C0088a();

            /* renamed from: j  reason: collision with root package name */
            public boolean f7109j;

            /* renamed from: m  reason: collision with root package name */
            public int f7110m;
            public float n;

            /* renamed from: t  reason: collision with root package name */
            public boolean f7111t;

            /* renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0088a implements Parcelable.ClassLoaderCreator<a> {
                @Override // android.os.Parcelable.Creator
                public Object createFromParcel(Parcel parcel) {
                    return new a(parcel, null);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return new a(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public Object[] newArray(int i10) {
                    return new a[i10];
                }
            }

            public a(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f7109j = parcel.readByte() != 0;
                this.f7110m = parcel.readInt();
                this.n = parcel.readFloat();
                this.f7111t = parcel.readByte() != 0;
            }

            public a(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // s0.a, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeParcelable(this.f14775c, i10);
                parcel.writeByte(this.f7109j ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f7110m);
                parcel.writeFloat(this.n);
                parcel.writeByte(this.f7111t ? (byte) 1 : (byte) 0);
            }
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public static boolean E(int i10, int i11) {
            return (i10 & i11) == i11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public int C(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
            int i13;
            int i14;
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int y = y();
            int i15 = 0;
            if (i11 == 0 || y < i11 || y > i12) {
                this.f7105j = 0;
            } else {
                int g10 = t3.a.g(i10, i11, i12);
                if (y != g10) {
                    if (appBarLayout.n) {
                        int abs = Math.abs(g10);
                        int childCount = appBarLayout.getChildCount();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= childCount) {
                                break;
                            }
                            View childAt = appBarLayout.getChildAt(i16);
                            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                            Interpolator interpolator = layoutParams.f7114c;
                            if (abs < childAt.getTop() || abs > childAt.getBottom()) {
                                i16++;
                            } else if (interpolator != null) {
                                int i17 = layoutParams.f7112a;
                                if ((i17 & 1) != 0) {
                                    i14 = childAt.getHeight() + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + 0;
                                    if ((i17 & 2) != 0) {
                                        WeakHashMap<View, a0> weakHashMap = x.f13156a;
                                        i14 -= x.d.d(childAt);
                                    }
                                } else {
                                    i14 = 0;
                                }
                                WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
                                if (x.d.b(childAt)) {
                                    i14 -= appBarLayout.getTopInset();
                                }
                                if (i14 > 0) {
                                    float f10 = i14;
                                    i13 = (childAt.getTop() + Math.round(interpolator.getInterpolation((abs - childAt.getTop()) / f10) * f10)) * Integer.signum(g10);
                                }
                            }
                        }
                    }
                    i13 = g10;
                    boolean u2 = u(i13);
                    int i18 = y - g10;
                    this.f7105j = g10 - i13;
                    if (u2) {
                        for (int i19 = 0; i19 < appBarLayout.getChildCount(); i19++) {
                            LayoutParams layoutParams2 = (LayoutParams) appBarLayout.getChildAt(i19).getLayoutParams();
                            c cVar = layoutParams2.f7113b;
                            if (cVar != null && (layoutParams2.f7112a & 1) != 0) {
                                View childAt2 = appBarLayout.getChildAt(i19);
                                d dVar = (d) cVar;
                                Rect rect = dVar.f7116a;
                                childAt2.getDrawingRect(rect);
                                appBarLayout.offsetDescendantRectToMyCoords(childAt2, rect);
                                rect.offset(0, -appBarLayout.getTopInset());
                                float abs2 = dVar.f7116a.top - Math.abs(s());
                                if (abs2 <= 0.0f) {
                                    float e10 = 1.0f - t3.a.e(Math.abs(abs2 / dVar.f7116a.height()), 0.0f, 1.0f);
                                    float height = (-abs2) - ((dVar.f7116a.height() * 0.3f) * (1.0f - (e10 * e10)));
                                    childAt2.setTranslationY(height);
                                    childAt2.getDrawingRect(dVar.f7117b);
                                    dVar.f7117b.offset(0, (int) (-height));
                                    Rect rect2 = dVar.f7117b;
                                    WeakHashMap<View, a0> weakHashMap3 = x.f13156a;
                                    x.f.c(childAt2, rect2);
                                } else {
                                    WeakHashMap<View, a0> weakHashMap4 = x.f13156a;
                                    x.f.c(childAt2, null);
                                    childAt2.setTranslationY(0.0f);
                                }
                            }
                        }
                    }
                    if (!u2 && appBarLayout.n) {
                        coordinatorLayout.g(appBarLayout);
                    }
                    appBarLayout.b(s());
                    J(coordinatorLayout, appBarLayout, g10, g10 < y ? -1 : 1, false);
                    i15 = i18;
                }
            }
            I(coordinatorLayout, appBarLayout);
            return i15;
        }

        public final void D(CoordinatorLayout coordinatorLayout, T t2, int i10, float f10) {
            int abs = Math.abs(y() - i10);
            float abs2 = Math.abs(f10);
            int round = abs2 > 0.0f ? Math.round((abs / abs2) * 1000.0f) * 3 : (int) (((abs / t2.getHeight()) + 1.0f) * 150.0f);
            int y = y();
            if (y == i10) {
                ValueAnimator valueAnimator = this.f7107l;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f7107l.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f7107l;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f7107l = valueAnimator3;
                valueAnimator3.setInterpolator(ga.a.f9889e);
                this.f7107l.addUpdateListener(new com.google.android.material.appbar.b(this, coordinatorLayout, t2));
            } else {
                valueAnimator2.cancel();
            }
            this.f7107l.setDuration(Math.min(round, 600));
            this.f7107l.setIntValues(y, i10);
            this.f7107l.start();
        }

        public final View F(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if ((childAt instanceof i) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public void G(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10, int[] iArr) {
            int i11;
            int i12;
            if (i10 != 0) {
                if (i10 < 0) {
                    int i13 = -appBarLayout.getTotalScrollRange();
                    i11 = i13;
                    i12 = appBarLayout.getDownNestedPreScrollRange() + i13;
                } else {
                    i11 = -appBarLayout.getUpNestedPreScrollRange();
                    i12 = 0;
                }
                if (i11 != i12) {
                    iArr[1] = A(coordinatorLayout, appBarLayout, i10, i11, i12);
                }
            }
            if (appBarLayout.B) {
                appBarLayout.d(appBarLayout.e(view));
            }
        }

        public final void H(CoordinatorLayout coordinatorLayout, T t2) {
            int y = y();
            int childCount = t2.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    i10 = -1;
                    break;
                }
                View childAt = t2.getChildAt(i10);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (E(layoutParams.f7112a, 32)) {
                    top -= ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    bottom += ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                }
                int i11 = -y;
                if (top <= i11 && bottom >= i11) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                View childAt2 = t2.getChildAt(i10);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                int i12 = layoutParams2.f7112a;
                if ((i12 & 17) == 17) {
                    int i13 = -childAt2.getTop();
                    int i14 = -childAt2.getBottom();
                    if (i10 == t2.getChildCount() - 1) {
                        i14 += t2.getPaddingTop() + t2.getTopInset();
                    }
                    if (E(i12, 2)) {
                        WeakHashMap<View, a0> weakHashMap = x.f13156a;
                        i14 += x.d.d(childAt2);
                    } else if (E(i12, 5)) {
                        WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
                        int d = x.d.d(childAt2) + i14;
                        if (y < d) {
                            i13 = d;
                        } else {
                            i14 = d;
                        }
                    }
                    if (E(i12, 32)) {
                        i13 += ((LinearLayout.LayoutParams) layoutParams2).topMargin;
                        i14 -= ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    }
                    if (y < (i14 + i13) / 2) {
                        i13 = i14;
                    }
                    D(coordinatorLayout, t2, t3.a.g(i13, -t2.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        public final void I(CoordinatorLayout coordinatorLayout, T t2) {
            b.a aVar = b.a.f13485h;
            x.s(aVar.a(), coordinatorLayout);
            x.m(coordinatorLayout, 0);
            b.a aVar2 = b.a.f13486i;
            x.s(aVar2.a(), coordinatorLayout);
            x.m(coordinatorLayout, 0);
            View F = F(coordinatorLayout);
            if (F != null) {
                if (t2.getTotalScrollRange() == 0 || !(((CoordinatorLayout.e) F.getLayoutParams()).f1788a instanceof ScrollingViewBehavior)) {
                    return;
                }
                if (y() != (-t2.getTotalScrollRange()) && F.canScrollVertically(1)) {
                    x.t(coordinatorLayout, aVar, null, new com.google.android.material.appbar.d(this, t2, false));
                }
                if (y() != 0) {
                    if (F.canScrollVertically(-1)) {
                        int i10 = -t2.getDownNestedPreScrollRange();
                        if (i10 != 0) {
                            x.t(coordinatorLayout, aVar2, null, new com.google.android.material.appbar.c(this, coordinatorLayout, t2, F, i10));
                        }
                    } else {
                        x.t(coordinatorLayout, aVar2, null, new com.google.android.material.appbar.d(this, t2, true));
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
            if (r2 != false) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void J(androidx.coordinatorlayout.widget.CoordinatorLayout r10, T r11, int r12, int r13, boolean r14) {
            /*
                Method dump skipped, instructions count: 196
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.J(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int, int, boolean):void");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean h(CoordinatorLayout coordinatorLayout, View view, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            super.h(coordinatorLayout, appBarLayout, i10);
            int pendingAction = appBarLayout.getPendingAction();
            a aVar = this.f7108m;
            if (aVar == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z10 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i11 = -appBarLayout.getUpNestedPreScrollRange();
                        if (z10) {
                            D(coordinatorLayout, appBarLayout, i11, 0.0f);
                        } else {
                            B(coordinatorLayout, appBarLayout, i11);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z10) {
                            D(coordinatorLayout, appBarLayout, 0, 0.0f);
                        } else {
                            B(coordinatorLayout, appBarLayout, 0);
                        }
                    }
                }
            } else if (aVar.f7109j) {
                B(coordinatorLayout, appBarLayout, -appBarLayout.getTotalScrollRange());
            } else {
                View childAt = appBarLayout.getChildAt(aVar.f7110m);
                int i12 = -childAt.getBottom();
                B(coordinatorLayout, appBarLayout, this.f7108m.f7111t ? appBarLayout.getTopInset() + x.d.d(childAt) + i12 : Math.round(childAt.getHeight() * this.f7108m.n) + i12);
            }
            appBarLayout.f7101t = 0;
            this.f7108m = null;
            u(t3.a.g(s(), -appBarLayout.getTotalScrollRange(), 0));
            J(coordinatorLayout, appBarLayout, s(), 0, true);
            appBarLayout.b(s());
            I(coordinatorLayout, appBarLayout);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            boolean z10 = false;
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) appBarLayout.getLayoutParams())).height == -2) {
                coordinatorLayout.x(appBarLayout, i10, i11, View.MeasureSpec.makeMeasureSpec(0, 0), i13);
                z10 = true;
            }
            return z10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            G(coordinatorLayout, (AppBarLayout) view, view2, i11, iArr);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (i13 < 0) {
                iArr[1] = A(coordinatorLayout, appBarLayout, i13, -appBarLayout.getDownNestedScrollRange(), 0);
            }
            if (i13 == 0) {
                I(coordinatorLayout, appBarLayout);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void n(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (parcelable instanceof a) {
                this.f7108m = (a) parcelable;
            } else {
                this.f7108m = null;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public Parcelable o(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            AbsSavedState absSavedState = View.BaseSavedState.EMPTY_STATE;
            int s10 = s();
            int childCount = appBarLayout.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = appBarLayout.getChildAt(i10);
                int bottom = childAt.getBottom() + s10;
                if (childAt.getTop() + s10 <= 0 && bottom >= 0) {
                    a aVar = new a(absSavedState);
                    aVar.f7109j = (-s()) >= appBarLayout.getTotalScrollRange();
                    aVar.f7110m = i10;
                    WeakHashMap<View, a0> weakHashMap = x.f13156a;
                    aVar.f7111t = bottom == appBarLayout.getTopInset() + x.d.d(childAt);
                    aVar.n = bottom / childAt.getHeight();
                    return aVar;
                }
            }
            return absSavedState;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean p(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, android.view.View r7, android.view.View r8, int r9, int r10) {
            /*
                r4 = this;
                r1 = r4
                com.google.android.material.appbar.AppBarLayout r6 = (com.google.android.material.appbar.AppBarLayout) r6
                r8 = r9 & 2
                r3 = 2
                r9 = 1
                r3 = 5
                r0 = 0
                if (r8 == 0) goto L3a
                boolean r8 = r6.B
                if (r8 != 0) goto L3b
                r3 = 7
                int r8 = r6.getTotalScrollRange()
                if (r8 == 0) goto L19
                r3 = 1
                r8 = r3
                goto L1c
            L19:
                r3 = 7
                r8 = 0
                r3 = 3
            L1c:
                if (r8 == 0) goto L34
                r3 = 7
                int r3 = r5.getHeight()
                r5 = r3
                int r3 = r7.getHeight()
                r7 = r3
                int r5 = r5 - r7
                int r3 = r6.getHeight()
                r6 = r3
                if (r5 > r6) goto L34
                r5 = 1
                r3 = 4
                goto L36
            L34:
                r5 = 0
                r3 = 6
            L36:
                if (r5 == 0) goto L3a
                r3 = 3
                goto L3c
            L3a:
                r9 = 0
            L3b:
                r3 = 2
            L3c:
                if (r9 == 0) goto L47
                r3 = 3
                android.animation.ValueAnimator r5 = r1.f7107l
                if (r5 == 0) goto L47
                r3 = 7
                r5.cancel()
            L47:
                r3 = 2
                r5 = 0
                r1.n = r5
                r1.f7106k = r10
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.p(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, android.view.View, int, int):boolean");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            if (this.f7106k == 0 || i10 == 1) {
                H(coordinatorLayout, appBarLayout);
                if (appBarLayout.B) {
                    appBarLayout.d(appBarLayout.e(view2));
                }
            }
            this.n = new WeakReference<>(view2);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public boolean v(View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            WeakReference<View> weakReference = this.n;
            if (weakReference != null) {
                View view2 = weakReference.get();
                r0 = (view2 == null || !view2.isShown() || view2.canScrollVertically(-1)) ? false : true;
                return r0;
            }
            return r0;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int w(View view) {
            return -((AppBarLayout) view).getDownNestedScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int x(View view) {
            return ((AppBarLayout) view).getTotalScrollRange();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        public int y() {
            return s() + this.f7105j;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.appbar.HeaderBehavior
        public void z(CoordinatorLayout coordinatorLayout, View view) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            H(coordinatorLayout, appBarLayout);
            if (appBarLayout.B) {
                appBarLayout.d(appBarLayout.e(F(coordinatorLayout)));
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Behavior extends BaseBehavior<AppBarLayout> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends LinearLayout.LayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f7112a;

        /* renamed from: b  reason: collision with root package name */
        public c f7113b;

        /* renamed from: c  reason: collision with root package name */
        public Interpolator f7114c;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f7112a = 1;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7112a = 1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9.a.f13027w);
            this.f7112a = obtainStyledAttributes.getInt(1, 0);
            this.f7113b = obtainStyledAttributes.getInt(0, 0) != 1 ? null : new d();
            if (obtainStyledAttributes.hasValue(2)) {
                this.f7114c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
            }
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7112a = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7112a = 1;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7112a = 1;
        }
    }

    /* loaded from: classes.dex */
    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m9.a.f13016n0);
            this.f7141f = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.e) view2.getLayoutParams()).f1788a;
            if (behavior instanceof BaseBehavior) {
                x.o(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).f7105j) + this.f7140e) - w(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.B) {
                    appBarLayout.d(appBarLayout.e(view));
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                x.s(b.a.f13485h.a(), coordinatorLayout);
                x.m(coordinatorLayout, 0);
                x.s(b.a.f13486i.a(), coordinatorLayout);
                x.m(coordinatorLayout, 0);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean m(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            AppBarLayout v2 = v(coordinatorLayout.i(view));
            if (v2 != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f7139c;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    v2.c(false, !z10, true);
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public float x(View view) {
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.e) appBarLayout.getLayoutParams()).f1788a;
                int y = behavior instanceof BaseBehavior ? ((BaseBehavior) behavior).y() : 0;
                if (downNestedPreScrollRange != 0 && totalScrollRange + y <= downNestedPreScrollRange) {
                    return 0.0f;
                }
                int i10 = totalScrollRange - downNestedPreScrollRange;
                if (i10 != 0) {
                    return (y / i10) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public int y(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : view.getMeasuredHeight();
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* renamed from: z */
        public AppBarLayout v(List<View> list) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = list.get(i10);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class a implements n {
        public a() {
        }

        @Override // n0.n
        public d0 a(View view, d0 d0Var) {
            AppBarLayout appBarLayout = AppBarLayout.this;
            Objects.requireNonNull(appBarLayout);
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            d0 d0Var2 = x.d.b(appBarLayout) ? d0Var : null;
            if (!Objects.equals(appBarLayout.f7102u, d0Var2)) {
                appBarLayout.f7102u = d0Var2;
                appBarLayout.g();
                appBarLayout.requestLayout();
            }
            return d0Var;
        }
    }

    /* loaded from: classes.dex */
    public interface b<T extends AppBarLayout> {
        void a(T t2, int i10);
    }

    /* loaded from: classes.dex */
    public static abstract class c {
    }

    /* loaded from: classes.dex */
    public static class d extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f7116a = new Rect();

        /* renamed from: b  reason: collision with root package name */
        public final Rect f7117b = new Rect();
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(float f10, int i10);
    }

    /* loaded from: classes.dex */
    public interface f extends b<AppBarLayout> {
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }

    /* JADX WARN: Finally extract failed */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i10) {
        super(hb.a.a(context, attributeSet, i10, 2132018028), attributeSet, i10);
        this.f7098f = -1;
        this.f7099j = -1;
        this.f7100m = -1;
        this.f7101t = 0;
        this.F = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        int i11 = Build.VERSION.SDK_INT;
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }
        Context context3 = getContext();
        TypedArray d10 = j.d(context3, attributeSet, g.f7163a, i10, 2132018028, new int[0]);
        try {
            if (d10.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context3, d10.getResourceId(0, 0)));
            }
            d10.recycle();
            TypedArray d11 = j.d(context2, attributeSet, m9.a.f13024u, i10, 2132018028, new int[0]);
            Drawable drawable = d11.getDrawable(0);
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.d.q(this, drawable);
            if (getBackground() instanceof ColorDrawable) {
                cb.g gVar = new cb.g();
                gVar.r(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
                gVar.f3929c.f3939b = new ra.a(context2);
                gVar.C();
                x.d.q(this, gVar);
            }
            if (d11.hasValue(4)) {
                c(d11.getBoolean(4, false), false, false);
            }
            if (d11.hasValue(3)) {
                g.a(this, d11.getDimensionPixelSize(3, 0));
            }
            if (i11 >= 26) {
                if (d11.hasValue(2)) {
                    setKeyboardNavigationCluster(d11.getBoolean(2, false));
                }
                if (d11.hasValue(1)) {
                    setTouchscreenBlocksFocus(d11.getBoolean(1, false));
                }
            }
            this.B = d11.getBoolean(5, false);
            this.C = d11.getResourceId(6, -1);
            setStatusBarForeground(d11.getDrawable(7));
            d11.recycle();
            x.i.u(this, new a());
        } catch (Throwable th) {
            d10.recycle();
            throw th;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new LayoutParams((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public void b(int i10) {
        this.f7097c = i10;
        if (!willNotDraw()) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            x.d.k(this);
        }
        List<b> list = this.f7103w;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f7103w.get(i11);
                if (bVar != null) {
                    bVar.a(this, i10);
                }
            }
        }
    }

    public final void c(boolean z10, boolean z11, boolean z12) {
        int i10 = 0;
        int i11 = (z10 ? 1 : 2) | (z11 ? 4 : 0);
        if (z12) {
            i10 = 8;
        }
        this.f7101t = i11 | i10;
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public boolean d(boolean z10) {
        boolean z11 = true;
        if (!(!this.y) || this.A == z10) {
            z11 = false;
        } else {
            this.A = z10;
            refreshDrawableState();
            if (this.B && (getBackground() instanceof cb.g)) {
                cb.g gVar = (cb.g) getBackground();
                float dimension = getResources().getDimension(R.dimen.design_appbar_elevation);
                float f10 = z10 ? 0.0f : dimension;
                if (!z10) {
                    dimension = 0.0f;
                }
                ValueAnimator valueAnimator = this.E;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, dimension);
                this.E = ofFloat;
                ofFloat.setDuration(getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
                this.E.setInterpolator(ga.a.f9886a);
                this.E.addUpdateListener(new com.google.android.material.appbar.a(this, gVar));
                this.E.start();
                return z11;
            }
        }
        return z11;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.H != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.f7097c);
            this.H.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.H;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public boolean e(View view) {
        int i10;
        if (this.D == null && (i10 = this.C) != -1) {
            View findViewById = view != null ? view.findViewById(i10) : null;
            if (findViewById == null && (getParent() instanceof ViewGroup)) {
                findViewById = ((ViewGroup) getParent()).findViewById(this.C);
            }
            if (findViewById != null) {
                this.D = new WeakReference<>(findViewById);
            }
        }
        WeakReference<View> weakReference = this.D;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view = view2;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public final boolean f() {
        boolean z10 = false;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                if (!x.d.b(childAt)) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final void g() {
        setWillNotDraw(!(this.H != null && getTopInset() > 0));
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.Behavior<AppBarLayout> getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int i10;
        int i11 = this.f7099j;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = layoutParams.f7112a;
            if ((i13 & 5) == 5) {
                int i14 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                if ((i13 & 8) != 0) {
                    WeakHashMap<View, a0> weakHashMap = x.f13156a;
                    i10 = i14 + x.d.d(childAt);
                } else if ((i13 & 2) != 0) {
                    WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
                    i10 = i14 + (measuredHeight - x.d.d(childAt));
                } else {
                    i10 = i14 + measuredHeight;
                }
                if (childCount == 0) {
                    WeakHashMap<View, a0> weakHashMap3 = x.f13156a;
                    if (x.d.b(childAt)) {
                        i10 = Math.min(i10, measuredHeight - getTopInset());
                    }
                }
                i12 += i10;
            } else if (i12 > 0) {
                break;
            }
        }
        int max = Math.max(0, i12);
        this.f7099j = max;
        return max;
    }

    public int getDownNestedScrollRange() {
        int i10 = this.f7100m;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + childAt.getMeasuredHeight();
            int i13 = layoutParams.f7112a;
            if ((i13 & 1) == 0) {
                break;
            }
            i12 += measuredHeight;
            if ((i13 & 2) != 0) {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                i12 -= x.d.d(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f7100m = max;
        return max;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.C;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        int d10 = x.d.d(this);
        if (d10 == 0) {
            int childCount = getChildCount();
            d10 = childCount >= 1 ? x.d.d(getChildAt(childCount - 1)) : 0;
            if (d10 == 0) {
                return getHeight() / 3;
            }
        }
        return (d10 * 2) + topInset;
    }

    public int getPendingAction() {
        return this.f7101t;
    }

    public Drawable getStatusBarForeground() {
        return this.H;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    public final int getTopInset() {
        d0 d0Var = this.f7102u;
        if (d0Var != null) {
            return d0Var.e();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i10 = this.f7098f;
        if (i10 != -1) {
            return i10;
        }
        int childCount = getChildCount();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= childCount) {
                break;
            }
            View childAt = getChildAt(i11);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i13 = layoutParams.f7112a;
            if ((i13 & 1) == 0) {
                break;
            }
            int i14 = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i12;
            if (i11 == 0) {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                if (x.d.b(childAt)) {
                    i14 -= getTopInset();
                }
            }
            i12 = i14;
            if ((i13 & 2) != 0) {
                WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
                i12 -= x.d.d(childAt);
                break;
            }
            i11++;
        }
        int max = Math.max(0, i12);
        this.f7098f = max;
        return max;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof cb.g) {
            m9.a.D(this, (cb.g) background);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i10) {
        if (this.G == null) {
            this.G = new int[4];
        }
        int[] iArr = this.G;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + iArr.length);
        boolean z10 = this.f7104z;
        iArr[0] = z10 ? R.attr.state_liftable : -2130969627;
        iArr[1] = (z10 && this.A) ? R.attr.state_lifted : -2130969628;
        iArr[2] = z10 ? R.attr.state_collapsible : -2130969625;
        iArr[3] = (z10 && this.A) ? R.attr.state_collapsed : -2130969624;
        return LinearLayout.mergeDrawableStates(onCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        WeakReference<View> weakReference = this.D;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.D = null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        super.onLayout(z10, i10, i11, i12, i13);
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        boolean z12 = true;
        if (x.d.b(this) && f()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                x.o(getChildAt(childCount), topInset);
            }
        }
        this.f7098f = -1;
        this.f7099j = -1;
        this.f7100m = -1;
        this.n = false;
        int childCount2 = getChildCount();
        int i14 = 0;
        while (true) {
            if (i14 >= childCount2) {
                break;
            } else if (((LayoutParams) getChildAt(i14).getLayoutParams()).f7114c != null) {
                this.n = true;
                break;
            } else {
                i14++;
            }
        }
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.y) {
            return;
        }
        if (!this.B) {
            int childCount3 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount3) {
                    z11 = false;
                    break;
                }
                int i16 = ((LayoutParams) getChildAt(i15).getLayoutParams()).f7112a;
                if ((i16 & 1) == 1 && (i16 & 10) != 0) {
                    z11 = true;
                    break;
                }
                i15++;
            }
            if (!z11) {
                z12 = false;
            }
        }
        if (this.f7104z != z12) {
            this.f7104z = z12;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if (x.d.b(this) && f()) {
                int measuredHeight = getMeasuredHeight();
                if (mode == Integer.MIN_VALUE) {
                    measuredHeight = t3.a.g(getTopInset() + getMeasuredHeight(), 0, View.MeasureSpec.getSize(i11));
                } else if (mode == 0) {
                    measuredHeight += getTopInset();
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        this.f7098f = -1;
        this.f7099j = -1;
        this.f7100m = -1;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        m9.a.C(this, f10);
    }

    public void setExpanded(boolean z10) {
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        c(z10, x.g.c(this), true);
    }

    public void setLiftOnScroll(boolean z10) {
        this.B = z10;
    }

    public void setLiftOnScrollTargetViewId(int i10) {
        this.C = i10;
        WeakReference<View> weakReference = this.D;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.D = null;
    }

    public void setLiftableOverrideEnabled(boolean z10) {
        this.y = z10;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (i10 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i10);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.H;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.H = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.H.setState(getDrawableState());
                }
                Drawable drawable4 = this.H;
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                f0.a.c(drawable4, x.e.d(this));
                this.H.setVisible(getVisibility() == 0, false);
                this.H.setCallback(this);
            }
            g();
            WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
            x.d.k(this);
        }
    }

    public void setStatusBarForegroundColor(int i10) {
        setStatusBarForeground(new ColorDrawable(i10));
    }

    public void setStatusBarForegroundResource(int i10) {
        setStatusBarForeground(f.a.a(getContext(), i10));
    }

    @Deprecated
    public void setTargetElevation(float f10) {
        g.a(this, f10);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.H;
    }
}
