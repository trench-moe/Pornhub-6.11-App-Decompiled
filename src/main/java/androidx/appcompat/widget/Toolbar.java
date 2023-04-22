package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionMenuView;
import com.app.pornhub.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import n0.x;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public h0 J;
    public int K;
    public int L;
    public int M;
    public CharSequence N;
    public CharSequence O;
    public ColorStateList P;
    public ColorStateList Q;
    public boolean R;
    public boolean S;
    public final ArrayList<View> T;
    public final ArrayList<View> U;
    public final int[] V;
    public final n0.g W;

    /* renamed from: a0  reason: collision with root package name */
    public ArrayList<MenuItem> f921a0;

    /* renamed from: b0  reason: collision with root package name */
    public e f922b0;

    /* renamed from: c  reason: collision with root package name */
    public ActionMenuView f923c;

    /* renamed from: c0  reason: collision with root package name */
    public final ActionMenuView.d f924c0;

    /* renamed from: d0  reason: collision with root package name */
    public s0 f925d0;

    /* renamed from: e0  reason: collision with root package name */
    public androidx.appcompat.widget.c f926e0;

    /* renamed from: f  reason: collision with root package name */
    public TextView f927f;

    /* renamed from: f0  reason: collision with root package name */
    public d f928f0;

    /* renamed from: g0  reason: collision with root package name */
    public i.a f929g0;

    /* renamed from: h0  reason: collision with root package name */
    public e.a f930h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f931i0;

    /* renamed from: j  reason: collision with root package name */
    public TextView f932j;

    /* renamed from: j0  reason: collision with root package name */
    public final Runnable f933j0;

    /* renamed from: m  reason: collision with root package name */
    public ImageButton f934m;
    public ImageView n;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f935t;

    /* renamed from: u  reason: collision with root package name */
    public CharSequence f936u;

    /* renamed from: w  reason: collision with root package name */
    public ImageButton f937w;
    public View y;

    /* renamed from: z  reason: collision with root package name */
    public Context f938z;

    /* loaded from: classes.dex */
    public static class LayoutParams extends ActionBar.LayoutParams {

        /* renamed from: b  reason: collision with root package name */
        public int f939b;

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
            this.f939b = 0;
            this.f449a = 8388627;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f939b = 0;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f939b = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f939b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f939b = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ActionBar.LayoutParams) layoutParams);
            this.f939b = 0;
            this.f939b = layoutParams.f939b;
        }
    }

    /* loaded from: classes.dex */
    public class a implements ActionMenuView.d {
        public a() {
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.w();
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = Toolbar.this.f928f0;
            androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f944f;
            if (gVar != null) {
                gVar.collapseActionView();
            }
        }
    }

    /* loaded from: classes.dex */
    public class d implements androidx.appcompat.view.menu.i {

        /* renamed from: c  reason: collision with root package name */
        public androidx.appcompat.view.menu.e f943c;

        /* renamed from: f  reason: collision with root package name */
        public androidx.appcompat.view.menu.g f944f;

        public d() {
        }

        @Override // androidx.appcompat.view.menu.i
        public int a() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.i
        public void d(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.i
        public void e(boolean z10) {
            if (this.f944f != null) {
                androidx.appcompat.view.menu.e eVar = this.f943c;
                boolean z11 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f943c.getItem(i10) == this.f944f) {
                            z11 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (z11) {
                    return;
                }
                g(this.f943c, this.f944f);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean f() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean g(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            View view = Toolbar.this.y;
            if (view instanceof j.b) {
                ((j.b) view).e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.y);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f937w);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.y = null;
            int size = toolbar3.U.size();
            while (true) {
                size--;
                if (size < 0) {
                    toolbar3.U.clear();
                    this.f944f = null;
                    Toolbar.this.requestLayout();
                    gVar.C = false;
                    gVar.n.p(false);
                    return true;
                }
                toolbar3.addView(toolbar3.U.get(size));
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean h(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.f937w.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f937w);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f937w);
            }
            Toolbar.this.y = gVar.getActionView();
            this.f944f = gVar;
            ViewParent parent2 = Toolbar.this.y.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.y);
                }
                LayoutParams generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f449a = 8388611 | (toolbar4.D & 112);
                generateDefaultLayoutParams.f939b = 2;
                toolbar4.y.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.y);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            loop0: while (true) {
                while (true) {
                    childCount--;
                    if (childCount < 0) {
                        break loop0;
                    }
                    View childAt = toolbar6.getChildAt(childCount);
                    if (((LayoutParams) childAt.getLayoutParams()).f939b != 2 && childAt != toolbar6.f923c) {
                        toolbar6.removeViewAt(childCount);
                        toolbar6.U.add(childAt);
                    }
                }
            }
            Toolbar.this.requestLayout();
            gVar.C = true;
            gVar.n.p(false);
            View view = Toolbar.this.y;
            if (view instanceof j.b) {
                ((j.b) view).c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public void j(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f943c;
            if (eVar2 != null && (gVar = this.f944f) != null) {
                eVar2.d(gVar);
            }
            this.f943c = eVar;
        }

        @Override // androidx.appcompat.view.menu.i
        public void k(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean m(androidx.appcompat.view.menu.l lVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public Parcelable n() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class f extends s0.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        public int f946j;

        /* renamed from: m  reason: collision with root package name */
        public boolean f947m;

        /* loaded from: classes.dex */
        public class a implements Parcelable.ClassLoaderCreator<f> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new f[i10];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f946j = parcel.readInt();
            this.f947m = parcel.readInt() != 0;
        }

        public f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // s0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f14775c, i10);
            parcel.writeInt(this.f946j);
            parcel.writeInt(this.f947m ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.M = 8388627;
        this.T = new ArrayList<>();
        this.U = new ArrayList<>();
        this.V = new int[2];
        this.W = new n0.g(new q0(this, 0));
        this.f921a0 = new ArrayList<>();
        this.f924c0 = new a();
        this.f933j0 = new b();
        Context context2 = getContext();
        int[] iArr = b7.k.U;
        p0 r10 = p0.r(context2, attributeSet, iArr, i10, 0);
        n0.x.u(this, context, iArr, attributeSet, r10.f1055b, i10, 0);
        this.B = r10.m(28, 0);
        this.C = r10.m(19, 0);
        this.M = r10.k(0, this.M);
        this.D = r10.k(2, 48);
        int e10 = r10.e(22, 0);
        e10 = r10.p(27) ? r10.e(27, e10) : e10;
        this.I = e10;
        this.H = e10;
        this.G = e10;
        this.F = e10;
        int e11 = r10.e(25, -1);
        if (e11 >= 0) {
            this.F = e11;
        }
        int e12 = r10.e(24, -1);
        if (e12 >= 0) {
            this.G = e12;
        }
        int e13 = r10.e(26, -1);
        if (e13 >= 0) {
            this.H = e13;
        }
        int e14 = r10.e(23, -1);
        if (e14 >= 0) {
            this.I = e14;
        }
        this.E = r10.f(13, -1);
        int e15 = r10.e(9, IntCompanionObject.MIN_VALUE);
        int e16 = r10.e(5, IntCompanionObject.MIN_VALUE);
        int f10 = r10.f(7, 0);
        int f11 = r10.f(8, 0);
        d();
        h0 h0Var = this.J;
        h0Var.f1016h = false;
        if (f10 != Integer.MIN_VALUE) {
            h0Var.f1013e = f10;
            h0Var.f1010a = f10;
        }
        if (f11 != Integer.MIN_VALUE) {
            h0Var.f1014f = f11;
            h0Var.f1011b = f11;
        }
        if (e15 != Integer.MIN_VALUE || e16 != Integer.MIN_VALUE) {
            h0Var.a(e15, e16);
        }
        this.K = r10.e(10, IntCompanionObject.MIN_VALUE);
        this.L = r10.e(6, IntCompanionObject.MIN_VALUE);
        this.f935t = r10.g(4);
        this.f936u = r10.o(3);
        CharSequence o10 = r10.o(21);
        if (!TextUtils.isEmpty(o10)) {
            setTitle(o10);
        }
        CharSequence o11 = r10.o(18);
        if (!TextUtils.isEmpty(o11)) {
            setSubtitle(o11);
        }
        this.f938z = getContext();
        setPopupTheme(r10.m(17, 0));
        Drawable g10 = r10.g(16);
        if (g10 != null) {
            setNavigationIcon(g10);
        }
        CharSequence o12 = r10.o(15);
        if (!TextUtils.isEmpty(o12)) {
            setNavigationContentDescription(o12);
        }
        Drawable g11 = r10.g(11);
        if (g11 != null) {
            setLogo(g11);
        }
        CharSequence o13 = r10.o(12);
        if (!TextUtils.isEmpty(o13)) {
            setLogoDescription(o13);
        }
        if (r10.p(29)) {
            setTitleTextColor(r10.c(29));
        }
        if (r10.p(20)) {
            setSubtitleTextColor(r10.c(20));
        }
        if (r10.p(14)) {
            getMenuInflater().inflate(r10.m(14, 0), getMenu());
        }
        r10.f1055b.recycle();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new j.f(getContext());
    }

    public final void a(List<View> list, int i10) {
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        boolean z10 = x.e.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, x.e.d(this));
        list.clear();
        if (z10) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f939b == 0 && v(childAt) && j(layoutParams.f449a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
        } else {
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt2 = getChildAt(i12);
                LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                if (layoutParams2.f939b == 0 && v(childAt2) && j(layoutParams2.f449a) == absoluteGravity) {
                    list.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        generateDefaultLayoutParams.f939b = 1;
        if (!z10 || this.y == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.U.add(view);
    }

    public void c() {
        if (this.f937w == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f937w = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.f935t);
            this.f937w.setContentDescription(this.f936u);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f449a = 8388611 | (this.D & 112);
            generateDefaultLayoutParams.f939b = 2;
            this.f937w.setLayoutParams(generateDefaultLayoutParams);
            this.f937w.setOnClickListener(new c());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public final void d() {
        if (this.J == null) {
            this.J = new h0();
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f923c;
        if (actionMenuView.F == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) actionMenuView.getMenu();
            if (this.f928f0 == null) {
                this.f928f0 = new d();
            }
            this.f923c.setExpandedActionViewsExclusive(true);
            eVar.b(this.f928f0, this.f938z);
        }
    }

    public final void f() {
        if (this.f923c == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f923c = actionMenuView;
            actionMenuView.setPopupTheme(this.A);
            this.f923c.setOnMenuItemClickListener(this.f924c0);
            ActionMenuView actionMenuView2 = this.f923c;
            i.a aVar = this.f929g0;
            e.a aVar2 = this.f930h0;
            actionMenuView2.K = aVar;
            actionMenuView2.L = aVar2;
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f449a = 8388613 | (this.D & 112);
            this.f923c.setLayoutParams(generateDefaultLayoutParams);
            b(this.f923c, false);
        }
    }

    public final void g() {
        if (this.f934m == null) {
            this.f934m = new AppCompatImageButton(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f449a = 8388611 | (this.D & 112);
            this.f934m.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f937w;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f937w;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        h0 h0Var = this.J;
        if (h0Var != null) {
            return h0Var.f1015g ? h0Var.f1010a : h0Var.f1011b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.L;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        h0 h0Var = this.J;
        if (h0Var != null) {
            return h0Var.f1010a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        h0 h0Var = this.J;
        if (h0Var != null) {
            return h0Var.f1011b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        h0 h0Var = this.J;
        if (h0Var != null) {
            return h0Var.f1015g ? h0Var.f1011b : h0Var.f1010a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.K;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVar;
        ActionMenuView actionMenuView = this.f923c;
        return actionMenuView != null && (eVar = actionMenuView.F) != null && eVar.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.L, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        return x.e.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        return x.e.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.K, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.n;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.n;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f923c.getMenu();
    }

    public View getNavButtonView() {
        return this.f934m;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f934m;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f934m;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.f926e0;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f923c.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f938z;
    }

    public int getPopupTheme() {
        return this.A;
    }

    public CharSequence getSubtitle() {
        return this.O;
    }

    public final TextView getSubtitleTextView() {
        return this.f932j;
    }

    public CharSequence getTitle() {
        return this.N;
    }

    public int getTitleMarginBottom() {
        return this.I;
    }

    public int getTitleMarginEnd() {
        return this.G;
    }

    public int getTitleMarginStart() {
        return this.F;
    }

    public int getTitleMarginTop() {
        return this.H;
    }

    public final TextView getTitleTextView() {
        return this.f927f;
    }

    public u getWrapper() {
        if (this.f925d0 == null) {
            this.f925d0 = new s0(this, true);
        }
        return this.f925d0;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ActionBar.LayoutParams ? new LayoutParams((ActionBar.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public final int j(int i10) {
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        int d10 = x.e.d(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, d10) & 7;
        if (absoluteGravity != 1) {
            int i11 = 3;
            if (absoluteGravity != 3 && absoluteGravity != 5) {
                if (d10 == 1) {
                    i11 = 5;
                }
                return i11;
            }
        }
        return absoluteGravity;
    }

    public final int k(View view, int i10) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int i12 = layoutParams.f449a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.M & 112;
        }
        if (i12 != 48) {
            if (i12 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                if (i13 < i14) {
                    i13 = i14;
                } else {
                    int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
                    int i16 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    if (i15 < i16) {
                        i13 = Math.max(0, i13 - (i16 - i15));
                    }
                }
                return paddingTop + i13;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i11;
        }
        return getPaddingTop() - i11;
    }

    public final int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public final int m(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public void n(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void o() {
        Iterator<MenuItem> it = this.f921a0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        n0.g gVar = this.W;
        Menu menu = getMenu();
        MenuInflater menuInflater = getMenuInflater();
        Iterator<n0.h> it2 = gVar.f13144a.iterator();
        while (it2.hasNext()) {
            it2.next().b(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f921a0 = currentMenuItems2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f933j0);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.S = false;
        }
        if (!this.S) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.S = true;
            }
        }
        if (actionMasked != 10) {
            if (actionMasked == 3) {
            }
            return true;
        }
        this.S = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02ad A[LOOP:0: B:104:0x02ab->B:105:0x02ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02cf A[LOOP:1: B:107:0x02cd->B:108:0x02cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f7 A[LOOP:2: B:110:0x02f5->B:111:0x02f7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x034c A[LOOP:3: B:119:0x034a->B:120:0x034c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0232  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x029e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.f14775c);
        ActionMenuView actionMenuView = this.f923c;
        androidx.appcompat.view.menu.e eVar = actionMenuView != null ? actionMenuView.F : null;
        int i10 = fVar.f946j;
        if (i10 != 0 && this.f928f0 != null && eVar != null && (findItem = eVar.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (fVar.f947m) {
            removeCallbacks(this.f933j0);
            post(this.f933j0);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        d();
        h0 h0Var = this.J;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        if (z10 == h0Var.f1015g) {
            return;
        }
        h0Var.f1015g = z10;
        if (!h0Var.f1016h) {
            h0Var.f1010a = h0Var.f1013e;
            h0Var.f1011b = h0Var.f1014f;
        } else if (z10) {
            int i11 = h0Var.d;
            if (i11 == Integer.MIN_VALUE) {
                i11 = h0Var.f1013e;
            }
            h0Var.f1010a = i11;
            int i12 = h0Var.f1012c;
            if (i12 == Integer.MIN_VALUE) {
                i12 = h0Var.f1014f;
            }
            h0Var.f1011b = i12;
        } else {
            int i13 = h0Var.f1012c;
            if (i13 == Integer.MIN_VALUE) {
                i13 = h0Var.f1013e;
            }
            h0Var.f1010a = i13;
            int i14 = h0Var.d;
            if (i14 == Integer.MIN_VALUE) {
                i14 = h0Var.f1014f;
            }
            h0Var.f1011b = i14;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        f fVar = new f(super.onSaveInstanceState());
        d dVar = this.f928f0;
        if (dVar != null && (gVar = dVar.f944f) != null) {
            fVar.f946j = gVar.f667a;
        }
        fVar.f947m = q();
        return fVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.R = false;
        }
        if (!this.R) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.R = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.R = false;
        }
        return true;
    }

    public final boolean p(View view) {
        if (view.getParent() != this && !this.U.contains(view)) {
            return false;
        }
        return true;
    }

    public boolean q() {
        ActionMenuView actionMenuView = this.f923c;
        if (actionMenuView != null) {
            androidx.appcompat.widget.c cVar = actionMenuView.J;
            if (cVar != null && cVar.p()) {
                return true;
            }
        }
        return false;
    }

    public final int r(View view, int i10, int[] iArr, int i11) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int k10 = k(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, k10, max + measuredWidth, view.getMeasuredHeight() + k10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + max;
    }

    public final int s(View view, int i10, int[] iArr, int i11) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int k10 = k(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, k10, max, view.getMeasuredHeight() + k10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        ImageButton imageButton = this.f937w;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(f.a.a(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f937w.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f937w;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f935t);
        }
    }

    public void setCollapsible(boolean z10) {
        this.f931i0 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = IntCompanionObject.MIN_VALUE;
        }
        if (i10 != this.L) {
            this.L = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = IntCompanionObject.MIN_VALUE;
        }
        if (i10 != this.K) {
            this.K = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(f.a.a(getContext(), i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setLogo(android.graphics.drawable.Drawable r8) {
        /*
            r7 = this;
            if (r8 == 0) goto L29
            r5 = 5
            android.widget.ImageView r0 = r7.n
            if (r0 != 0) goto L16
            androidx.appcompat.widget.AppCompatImageView r0 = new androidx.appcompat.widget.AppCompatImageView
            r6 = 5
            android.content.Context r3 = r7.getContext()
            r1 = r3
            r2 = 0
            r0.<init>(r1, r2)
            r7.n = r0
            r5 = 5
        L16:
            r4 = 1
            android.widget.ImageView r0 = r7.n
            r5 = 4
            boolean r3 = r7.p(r0)
            r0 = r3
            if (r0 != 0) goto L41
            android.widget.ImageView r0 = r7.n
            r3 = 1
            r1 = r3
            r7.b(r0, r1)
            goto L42
        L29:
            android.widget.ImageView r0 = r7.n
            if (r0 == 0) goto L41
            boolean r0 = r7.p(r0)
            if (r0 == 0) goto L41
            r6 = 2
            android.widget.ImageView r0 = r7.n
            r7.removeView(r0)
            r4 = 6
            java.util.ArrayList<android.view.View> r0 = r7.U
            android.widget.ImageView r1 = r7.n
            r0.remove(r1)
        L41:
            r6 = 1
        L42:
            android.widget.ImageView r0 = r7.n
            if (r0 == 0) goto L49
            r0.setImageDrawable(r8)
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.setLogo(android.graphics.drawable.Drawable):void");
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.n == null) {
            this.n = new AppCompatImageView(getContext(), null);
        }
        ImageView imageView = this.n;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.f934m;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            t0.a(this.f934m, charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(f.a.a(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!p(this.f934m)) {
                b(this.f934m, true);
            }
        } else {
            ImageButton imageButton = this.f934m;
            if (imageButton != null && p(imageButton)) {
                removeView(this.f934m);
                this.U.remove(this.f934m);
            }
        }
        ImageButton imageButton2 = this.f934m;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f934m.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f922b0 = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f923c.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.A != i10) {
            this.A = i10;
            if (i10 == 0) {
                this.f938z = getContext();
                return;
            }
            this.f938z = new ContextThemeWrapper(getContext(), i10);
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f932j;
            if (textView != null && p(textView)) {
                removeView(this.f932j);
                this.U.remove(this.f932j);
            }
        } else {
            if (this.f932j == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f932j = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f932j.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.C;
                if (i10 != 0) {
                    this.f932j.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.Q;
                if (colorStateList != null) {
                    this.f932j.setTextColor(colorStateList);
                }
            }
            if (!p(this.f932j)) {
                b(this.f932j, true);
            }
        }
        TextView textView2 = this.f932j;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.O = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.Q = colorStateList;
        TextView textView = this.f932j;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setTitle(java.lang.CharSequence r7) {
        /*
            r6 = this;
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            r0 = r3
            if (r0 != 0) goto L54
            r5 = 3
            android.widget.TextView r0 = r6.f927f
            r5 = 1
            if (r0 != 0) goto L40
            r5 = 7
            android.content.Context r3 = r6.getContext()
            r0 = r3
            androidx.appcompat.widget.AppCompatTextView r1 = new androidx.appcompat.widget.AppCompatTextView
            r5 = 5
            r3 = 0
            r2 = r3
            r1.<init>(r0, r2)
            r6.f927f = r1
            r1.setSingleLine()
            android.widget.TextView r1 = r6.f927f
            r4 = 4
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r5 = 5
            r1.setEllipsize(r2)
            r5 = 5
            int r1 = r6.B
            if (r1 == 0) goto L36
            r5 = 6
            android.widget.TextView r2 = r6.f927f
            r5 = 7
            r2.setTextAppearance(r0, r1)
            r4 = 1
        L36:
            android.content.res.ColorStateList r0 = r6.P
            if (r0 == 0) goto L40
            r5 = 7
            android.widget.TextView r1 = r6.f927f
            r1.setTextColor(r0)
        L40:
            r5 = 3
            android.widget.TextView r0 = r6.f927f
            r4 = 4
            boolean r3 = r6.p(r0)
            r0 = r3
            if (r0 != 0) goto L6e
            r4 = 3
            android.widget.TextView r0 = r6.f927f
            r1 = 1
            r6.b(r0, r1)
            r4 = 7
            goto L6f
        L54:
            r5 = 3
            android.widget.TextView r0 = r6.f927f
            if (r0 == 0) goto L6e
            boolean r3 = r6.p(r0)
            r0 = r3
            if (r0 == 0) goto L6e
            android.widget.TextView r0 = r6.f927f
            r4 = 3
            r6.removeView(r0)
            java.util.ArrayList<android.view.View> r0 = r6.U
            android.widget.TextView r1 = r6.f927f
            r5 = 3
            r0.remove(r1)
        L6e:
            r5 = 4
        L6f:
            android.widget.TextView r0 = r6.f927f
            if (r0 == 0) goto L77
            r0.setText(r7)
            r5 = 6
        L77:
            r6.N = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.setTitle(java.lang.CharSequence):void");
    }

    public void setTitleMarginBottom(int i10) {
        this.I = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.G = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.F = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.H = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.P = colorStateList;
        TextView textView = this.f927f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public final int t(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void u(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean v(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f923c;
        if (actionMenuView != null) {
            androidx.appcompat.widget.c cVar = actionMenuView.J;
            if (cVar != null && cVar.q()) {
                return true;
            }
        }
        return false;
    }
}
