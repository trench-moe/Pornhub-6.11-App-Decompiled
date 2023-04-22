package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.c;
import java.util.Iterator;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements e.b, androidx.appcompat.view.menu.j {
    public androidx.appcompat.view.menu.e F;
    public Context G;
    public int H;
    public boolean I;
    public androidx.appcompat.widget.c J;
    public i.a K;
    public e.a L;
    public boolean M;
    public int N;
    public int O;
    public int P;
    public d Q;

    /* loaded from: classes.dex */
    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f734a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f735b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f736c;
        @ViewDebug.ExportedProperty
        public boolean d;
        @ViewDebug.ExportedProperty

        /* renamed from: e  reason: collision with root package name */
        public boolean f737e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f738f;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f734a = false;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f734a = layoutParams.f734a;
        }
    }

    /* loaded from: classes.dex */
    public interface a {
        boolean b();

        boolean c();
    }

    /* loaded from: classes.dex */
    public static class b implements i.a {
        @Override // androidx.appcompat.view.menu.i.a
        public void d(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean e(androidx.appcompat.view.menu.e eVar) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class c implements e.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            boolean z10;
            boolean onMenuItemClick;
            d dVar = ActionMenuView.this.Q;
            if (dVar != null) {
                Toolbar.a aVar = (Toolbar.a) dVar;
                Iterator<n0.h> it = Toolbar.this.W.f13144a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    } else if (it.next().a(menuItem)) {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    onMenuItemClick = true;
                } else {
                    Toolbar.e eVar2 = Toolbar.this.f922b0;
                    onMenuItemClick = eVar2 != null ? eVar2.onMenuItemClick(menuItem) : false;
                }
                if (onMenuItemClick) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.L;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.O = (int) (56.0f * f10);
        this.P = (int) (f10 * 4.0f);
        this.G = context;
        this.H = 0;
    }

    public static int o(View view, int i10, int i11, int i12, int i13) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12) - i13, View.MeasureSpec.getMode(i12));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z10 = false;
        boolean z11 = actionMenuItemView != null && actionMenuItemView.a();
        int i14 = 2;
        if (i11 <= 0 || (z11 && i11 < 2)) {
            i14 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 * i10, IntCompanionObject.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i15 = measuredWidth / i10;
            if (measuredWidth % i10 != 0) {
                i15++;
            }
            if (!z11 || i15 >= 2) {
                i14 = i15;
            }
        }
        if (!layoutParams.f734a && z11) {
            z10 = true;
        }
        layoutParams.d = z10;
        layoutParams.f735b = i14;
        view.measure(View.MeasureSpec.makeMeasureSpec(i10 * i14, 1073741824), makeMeasureSpec);
        return i14;
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(androidx.appcompat.view.menu.g gVar) {
        return this.F.r(gVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar) {
        this.F = eVar;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.F == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.F = eVar;
            eVar.f645e = new c();
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.J = cVar;
            cVar.C = true;
            cVar.D = true;
            i.a aVar = this.K;
            if (aVar == null) {
                aVar = new b();
            }
            cVar.n = aVar;
            this.F.b(cVar, this.G);
            androidx.appcompat.widget.c cVar2 = this.J;
            cVar2.f612w = this;
            this.F = cVar2.f608j;
        }
        return this.F;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.c cVar = this.J;
        c.d dVar = cVar.f963z;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (cVar.B) {
            return cVar.A;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.H;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public LinearLayoutCompat.LayoutParams i(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: l */
    public LayoutParams h() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* renamed from: m */
    public LayoutParams j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
            if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
                ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
            }
            return layoutParams2;
        }
        return h();
    }

    public boolean n(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return false;
        }
        View childAt = getChildAt(i10 - 1);
        View childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof a)) {
            z10 = false | ((a) childAt).b();
        }
        return (i10 <= 0 || !(childAt2 instanceof a)) ? z10 : z10 | ((a) childAt2).c();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.J;
        if (cVar != null) {
            cVar.e(false);
            if (this.J.p()) {
                this.J.l();
                this.J.q();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.c cVar = this.J;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int width;
        int i14;
        if (!this.M) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i15 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i16 = i12 - i10;
        int paddingRight = (i16 - getPaddingRight()) - getPaddingLeft();
        boolean b10 = x0.b(this);
        int i17 = 0;
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f734a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (n(i19)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b10) {
                        i14 = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = i14 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        i14 = width - measuredWidth;
                    }
                    int i20 = i15 - (measuredHeight / 2);
                    childAt.layout(i14, i20, width, measuredHeight + i20);
                    paddingRight -= measuredWidth;
                    i17 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    n(i19);
                    i18++;
                }
            }
        }
        if (childCount == 1 && i17 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i21 = (i16 / 2) - (measuredWidth2 / 2);
            int i22 = i15 - (measuredHeight2 / 2);
            childAt2.layout(i21, i22, measuredWidth2 + i21, measuredHeight2 + i22);
            return;
        }
        int i23 = i18 - (i17 ^ 1);
        int max = Math.max(0, i23 > 0 ? paddingRight / i23 : 0);
        if (b10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i24 = 0; i24 < childCount; i24++) {
                View childAt3 = getChildAt(i24);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f734a) {
                    int i25 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i26 = i15 - (measuredHeight3 / 2);
                    childAt3.layout(i25 - measuredWidth3, i26, i25, measuredHeight3 + i26);
                    width2 = i25 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i27 = 0; i27 < childCount; i27++) {
            View childAt4 = getChildAt(i27);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f734a) {
                int i28 = paddingLeft + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i29 = i15 - (measuredHeight4 / 2);
                childAt4.layout(i28, i29, i28 + measuredWidth4, measuredHeight4 + i29);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + max + i28;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v43 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        int i14;
        boolean z11;
        int i15;
        ?? r32;
        androidx.appcompat.view.menu.e eVar;
        boolean z12 = this.M;
        boolean z13 = View.MeasureSpec.getMode(i10) == 1073741824;
        this.M = z13;
        if (z12 != z13) {
            this.N = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.M && (eVar = this.F) != null && size != this.N) {
            this.N = size;
            eVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.M || childCount <= 0) {
            for (int i16 = 0; i16 < childCount; i16++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i16).getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
            }
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(i11);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int i17 = size2 - paddingRight;
        int i18 = this.O;
        int i19 = i17 / i18;
        int i20 = i17 % i18;
        if (i19 == 0) {
            setMeasuredDimension(i17, 0);
            return;
        }
        int i21 = (i20 / i19) + i18;
        int childCount2 = getChildCount();
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        boolean z14 = false;
        long j10 = 0;
        while (i26 < childCount2) {
            View childAt = getChildAt(i26);
            int i27 = size3;
            int i28 = i17;
            if (childAt.getVisibility() != 8) {
                boolean z15 = childAt instanceof ActionMenuItemView;
                int i29 = i22 + 1;
                if (z15) {
                    int i30 = this.P;
                    i15 = i29;
                    r32 = 0;
                    childAt.setPadding(i30, 0, i30, 0);
                } else {
                    i15 = i29;
                    r32 = 0;
                }
                LayoutParams layoutParams2 = (LayoutParams) childAt.getLayoutParams();
                layoutParams2.f738f = r32;
                layoutParams2.f736c = r32;
                layoutParams2.f735b = r32;
                layoutParams2.d = r32;
                ((LinearLayout.LayoutParams) layoutParams2).leftMargin = r32;
                ((LinearLayout.LayoutParams) layoutParams2).rightMargin = r32;
                layoutParams2.f737e = z15 && ((ActionMenuItemView) childAt).a();
                int o10 = o(childAt, i21, layoutParams2.f734a ? 1 : i19, childMeasureSpec, paddingBottom);
                i24 = Math.max(i24, o10);
                if (layoutParams2.d) {
                    i25++;
                }
                if (layoutParams2.f734a) {
                    z14 = true;
                }
                i19 -= o10;
                i23 = Math.max(i23, childAt.getMeasuredHeight());
                if (o10 == 1) {
                    j10 |= 1 << i26;
                }
                i22 = i15;
            }
            i26++;
            size3 = i27;
            i17 = i28;
        }
        int i31 = i17;
        int i32 = size3;
        boolean z16 = z14 && i22 == 2;
        boolean z17 = false;
        while (i25 > 0 && i19 > 0) {
            int i33 = IntCompanionObject.MAX_VALUE;
            int i34 = 0;
            int i35 = 0;
            long j11 = 0;
            while (i34 < childCount2) {
                int i36 = i23;
                LayoutParams layoutParams3 = (LayoutParams) getChildAt(i34).getLayoutParams();
                boolean z18 = z17;
                if (layoutParams3.d) {
                    int i37 = layoutParams3.f735b;
                    if (i37 < i33) {
                        j11 = 1 << i34;
                        i33 = i37;
                        i35 = 1;
                    } else if (i37 == i33) {
                        i35++;
                        j11 |= 1 << i34;
                    }
                }
                i34++;
                z17 = z18;
                i23 = i36;
            }
            i12 = i23;
            z10 = z17;
            j10 |= j11;
            if (i35 > i19) {
                break;
            }
            int i38 = i33 + 1;
            int i39 = 0;
            while (i39 < childCount2) {
                View childAt2 = getChildAt(i39);
                LayoutParams layoutParams4 = (LayoutParams) childAt2.getLayoutParams();
                int i40 = i25;
                long j12 = 1 << i39;
                if ((j11 & j12) == 0) {
                    if (layoutParams4.f735b == i38) {
                        j10 |= j12;
                    }
                    z11 = z16;
                } else {
                    if (z16 && layoutParams4.f737e && i19 == 1) {
                        int i41 = this.P;
                        z11 = z16;
                        childAt2.setPadding(i41 + i21, 0, i41, 0);
                    } else {
                        z11 = z16;
                    }
                    layoutParams4.f735b++;
                    layoutParams4.f738f = true;
                    i19--;
                }
                i39++;
                i25 = i40;
                z16 = z11;
            }
            i23 = i12;
            z17 = true;
        }
        i12 = i23;
        z10 = z17;
        boolean z19 = !z14 && i22 == 1;
        if (i19 > 0 && j10 != 0 && (i19 < i22 - 1 || z19 || i24 > 1)) {
            float bitCount = Long.bitCount(j10);
            if (!z19) {
                if ((j10 & 1) != 0 && !((LayoutParams) getChildAt(0).getLayoutParams()).f737e) {
                    bitCount -= 0.5f;
                }
                int i42 = childCount2 - 1;
                if ((j10 & (1 << i42)) != 0 && !((LayoutParams) getChildAt(i42).getLayoutParams()).f737e) {
                    bitCount -= 0.5f;
                }
            }
            int i43 = bitCount > 0.0f ? (int) ((i19 * i21) / bitCount) : 0;
            for (int i44 = 0; i44 < childCount2; i44++) {
                if ((j10 & (1 << i44)) != 0) {
                    View childAt3 = getChildAt(i44);
                    LayoutParams layoutParams5 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams5.f736c = i43;
                        layoutParams5.f738f = true;
                        if (i44 == 0 && !layoutParams5.f737e) {
                            ((LinearLayout.LayoutParams) layoutParams5).leftMargin = (-i43) / 2;
                        }
                    } else if (layoutParams5.f734a) {
                        layoutParams5.f736c = i43;
                        layoutParams5.f738f = true;
                        ((LinearLayout.LayoutParams) layoutParams5).rightMargin = (-i43) / 2;
                    } else {
                        if (i44 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams5).leftMargin = i43 / 2;
                        }
                        if (i44 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) layoutParams5).rightMargin = i43 / 2;
                        }
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            for (int i45 = 0; i45 < childCount2; i45++) {
                View childAt4 = getChildAt(i45);
                LayoutParams layoutParams6 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams6.f738f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams6.f735b * i21) + layoutParams6.f736c, 1073741824), childMeasureSpec);
                }
            }
        }
        if (mode != 1073741824) {
            i14 = i31;
            i13 = i12;
        } else {
            i13 = i32;
            i14 = i31;
        }
        setMeasuredDimension(i14, i13);
    }

    public void setExpandedActionViewsExclusive(boolean z10) {
        this.J.H = z10;
    }

    public void setOnMenuItemClickListener(d dVar) {
        this.Q = dVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.c cVar = this.J;
        c.d dVar = cVar.f963z;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        cVar.B = true;
        cVar.A = drawable;
    }

    public void setOverflowReserved(boolean z10) {
        this.I = z10;
    }

    public void setPopupTheme(int i10) {
        if (this.H != i10) {
            this.H = i10;
            if (i10 == 0) {
                this.G = getContext();
                return;
            }
            this.G = new ContextThemeWrapper(getContext(), i10);
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.J = cVar;
        cVar.f612w = this;
        this.F = cVar.f608j;
    }
}
