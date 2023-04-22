package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import c0.a;
import com.app.pornhub.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.d0;
import n0.k;
import n0.l;
import n0.m;
import n0.n;
import n0.x;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements k, l {
    public static final String J;
    public static final Class<?>[] K;
    public static final ThreadLocal<Map<String, Constructor<Behavior>>> L;
    public static final Comparator<View> M;
    public static final m0.c<Rect> N;
    public View A;
    public f B;
    public boolean C;
    public d0 D;
    public boolean E;
    public Drawable F;
    public ViewGroup.OnHierarchyChangeListener G;
    public n H;
    public final m I;

    /* renamed from: c  reason: collision with root package name */
    public final List<View> f1778c;

    /* renamed from: f  reason: collision with root package name */
    public final z.a f1779f;

    /* renamed from: j  reason: collision with root package name */
    public final List<View> f1780j;

    /* renamed from: m  reason: collision with root package name */
    public final List<View> f1781m;
    public final int[] n;

    /* renamed from: t  reason: collision with root package name */
    public final int[] f1782t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f1783u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f1784w;
    public int[] y;

    /* renamed from: z  reason: collision with root package name */
    public View f1785z;

    /* loaded from: classes.dex */
    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public boolean a(CoordinatorLayout coordinatorLayout, V v2, Rect rect) {
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, V v2, View view) {
            return false;
        }

        public void c(e eVar) {
        }

        public boolean d(CoordinatorLayout coordinatorLayout, V v2, View view) {
            return false;
        }

        public void e(CoordinatorLayout coordinatorLayout, V v2, View view) {
        }

        public void f() {
        }

        public boolean g(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
            return false;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, V v2, int i10) {
            return false;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, V v2, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean j(CoordinatorLayout coordinatorLayout, V v2, View view, float f10, float f11) {
            return false;
        }

        public void k(CoordinatorLayout coordinatorLayout, V v2, View view, int i10, int i11, int[] iArr, int i12) {
        }

        public void l(CoordinatorLayout coordinatorLayout, V v2, View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, V v2, Rect rect, boolean z10) {
            return false;
        }

        public void n(CoordinatorLayout coordinatorLayout, V v2, Parcelable parcelable) {
        }

        public Parcelable o(CoordinatorLayout coordinatorLayout, V v2) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, V v2, View view, View view2, int i10, int i11) {
            return false;
        }

        public void q(CoordinatorLayout coordinatorLayout, V v2, View view, int i10) {
        }

        public boolean r(CoordinatorLayout coordinatorLayout, V v2, MotionEvent motionEvent) {
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class a implements n {
        public a() {
        }

        @Override // n0.n
        public d0 a(View view, d0 d0Var) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!Objects.equals(coordinatorLayout.D, d0Var)) {
                coordinatorLayout.D = d0Var;
                boolean z10 = true;
                boolean z11 = d0Var.e() > 0;
                coordinatorLayout.E = z11;
                if (z11 || coordinatorLayout.getBackground() != null) {
                    z10 = false;
                }
                coordinatorLayout.setWillNotDraw(z10);
                if (!d0Var.g()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = coordinatorLayout.getChildAt(i10);
                        WeakHashMap<View, a0> weakHashMap = x.f13156a;
                        if (x.d.b(childAt) && ((e) childAt.getLayoutParams()).f1788a != null && d0Var.g()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return d0Var;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        Behavior getBehavior();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface c {
        Class<? extends Behavior> value();
    }

    /* loaded from: classes.dex */
    public class d implements ViewGroup.OnHierarchyChangeListener {
        public d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.G;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.v(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.G;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public Behavior f1788a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1789b;

        /* renamed from: c  reason: collision with root package name */
        public int f1790c;
        public int d;

        /* renamed from: e  reason: collision with root package name */
        public int f1791e;

        /* renamed from: f  reason: collision with root package name */
        public int f1792f;

        /* renamed from: g  reason: collision with root package name */
        public int f1793g;

        /* renamed from: h  reason: collision with root package name */
        public int f1794h;

        /* renamed from: i  reason: collision with root package name */
        public int f1795i;

        /* renamed from: j  reason: collision with root package name */
        public int f1796j;

        /* renamed from: k  reason: collision with root package name */
        public View f1797k;

        /* renamed from: l  reason: collision with root package name */
        public View f1798l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1799m;
        public boolean n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1800o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f1801p;

        /* renamed from: q  reason: collision with root package name */
        public final Rect f1802q;

        public e(int i10, int i11) {
            super(i10, i11);
            this.f1789b = false;
            this.f1790c = 0;
            this.d = 0;
            this.f1791e = -1;
            this.f1792f = -1;
            this.f1793g = 0;
            this.f1794h = 0;
            this.f1802q = new Rect();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Behavior newInstance;
            this.f1789b = false;
            this.f1790c = 0;
            this.d = 0;
            this.f1791e = -1;
            this.f1792f = -1;
            this.f1793g = 0;
            this.f1794h = 0;
            this.f1802q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o9.b.D);
            this.f1790c = obtainStyledAttributes.getInteger(0, 0);
            this.f1792f = obtainStyledAttributes.getResourceId(1, -1);
            this.d = obtainStyledAttributes.getInteger(2, 0);
            this.f1791e = obtainStyledAttributes.getInteger(6, -1);
            this.f1793g = obtainStyledAttributes.getInt(5, 0);
            this.f1794h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f1789b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.J;
                if (TextUtils.isEmpty(string)) {
                    newInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.J;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<Behavior>>> threadLocal = CoordinatorLayout.L;
                        Map<String, Constructor<Behavior>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<Behavior> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.K);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        newInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e10) {
                        throw new RuntimeException(a1.a.l("Could not inflate Behavior subclass ", string), e10);
                    }
                }
                this.f1788a = newInstance;
            }
            obtainStyledAttributes.recycle();
            Behavior behavior = this.f1788a;
            if (behavior != null) {
                behavior.c(this);
            }
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1789b = false;
            this.f1790c = 0;
            this.d = 0;
            this.f1791e = -1;
            this.f1792f = -1;
            this.f1793g = 0;
            this.f1794h = 0;
            this.f1802q = new Rect();
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1789b = false;
            this.f1790c = 0;
            this.d = 0;
            this.f1791e = -1;
            this.f1792f = -1;
            this.f1793g = 0;
            this.f1794h = 0;
            this.f1802q = new Rect();
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f1789b = false;
            this.f1790c = 0;
            this.d = 0;
            this.f1791e = -1;
            this.f1792f = -1;
            this.f1793g = 0;
            this.f1794h = 0;
            this.f1802q = new Rect();
        }

        public boolean a(int i10) {
            if (i10 != 0) {
                if (i10 != 1) {
                    return false;
                }
                return this.f1800o;
            }
            return this.n;
        }

        public void b(Behavior behavior) {
            Behavior behavior2 = this.f1788a;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.f();
                }
                this.f1788a = behavior;
                this.f1789b = true;
                if (behavior != null) {
                    behavior.c(this);
                }
            }
        }

        public void c(int i10, boolean z10) {
            if (i10 == 0) {
                this.n = z10;
            } else if (i10 != 1) {
            } else {
                this.f1800o = z10;
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.v(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends s0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: j  reason: collision with root package name */
        public SparseArray<Parcelable> f1804j;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f1804j = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f1804j.append(iArr[i10], readParcelableArray[i10]);
            }
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // s0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f14775c, i10);
            SparseArray<Parcelable> sparseArray = this.f1804j;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f1804j.keyAt(i11);
                parcelableArr[i11] = this.f1804j.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }
    }

    /* loaded from: classes.dex */
    public static class h implements Comparator<View> {
        @Override // java.util.Comparator
        public int compare(View view, View view2) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            float m10 = x.i.m(view);
            float m11 = x.i.m(view2);
            if (m10 > m11) {
                return -1;
            }
            return m10 < m11 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        J = r02 != null ? r02.getName() : null;
        M = new h();
        K = new Class[]{Context.class, AttributeSet.class};
        L = new ThreadLocal<>();
        N = new m0.e(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1778c = new ArrayList();
        this.f1779f = new z.a();
        this.f1780j = new ArrayList();
        this.f1781m = new ArrayList();
        this.n = new int[2];
        this.f1782t = new int[2];
        this.I = new m();
        TypedArray obtainStyledAttributes = i10 == 0 ? context.obtainStyledAttributes(attributeSet, o9.b.C, 0, 2132018301) : context.obtainStyledAttributes(attributeSet, o9.b.C, i10, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            if (i10 == 0) {
                saveAttributeDataForStyleable(context, o9.b.C, attributeSet, obtainStyledAttributes, 0, 2132018301);
            } else {
                saveAttributeDataForStyleable(context, o9.b.C, attributeSet, obtainStyledAttributes, i10, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.y = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = this.y.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = this.y;
                iArr[i11] = (int) (iArr[i11] * f10);
            }
        }
        this.F = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        D();
        super.setOnHierarchyChangeListener(new d());
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        if (x.d.c(this) == 0) {
            x.d.s(this, 1);
        }
    }

    public static Rect e() {
        Rect rect = (Rect) ((m0.e) N).b();
        return rect == null ? new Rect() : rect;
    }

    public final void A(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            Behavior behavior = ((e) childAt.getLayoutParams()).f1788a;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    behavior.g(this, childAt, obtain);
                } else {
                    behavior.r(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((e) getChildAt(i11).getLayoutParams()).f1799m = false;
        }
        this.f1785z = null;
        this.f1783u = false;
    }

    public final void B(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.f1795i;
        if (i11 != i10) {
            x.n(view, i10 - i11);
            eVar.f1795i = i10;
        }
    }

    public final void C(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int i11 = eVar.f1796j;
        if (i11 != i10) {
            x.o(view, i10 - i11);
            eVar.f1796j = i10;
        }
    }

    public final void D() {
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        if (!x.d.b(this)) {
            x.i.u(this, null);
            return;
        }
        if (this.H == null) {
            this.H = new a();
        }
        x.i.u(this, this.H);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        Behavior behavior = ((e) view.getLayoutParams()).f1788a;
        if (behavior != null) {
            Objects.requireNonNull(behavior);
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.F;
        boolean z10 = false;
        if (drawable != null && drawable.isStateful()) {
            z10 = false | drawable.setState(drawableState);
        }
        if (z10) {
            invalidate();
        }
    }

    public final void f(e eVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(max, max2, i10 + max, i11 + max2);
    }

    public void g(View view) {
        List list = (List) ((p.g) this.f1779f.f18662b).getOrDefault(view, null);
        if (list != null && !list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                View view2 = (View) list.get(i10);
                Behavior behavior = ((e) view2.getLayoutParams()).f1788a;
                if (behavior != null) {
                    behavior.d(this, view2, view);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final List<View> getDependencySortedChildren() {
        z();
        return Collections.unmodifiableList(this.f1778c);
    }

    public final d0 getLastWindowInsets() {
        return this.D;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.I.a();
    }

    public Drawable getStatusBarBackground() {
        return this.F;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public void h(View view, boolean z10, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z10) {
                q(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    public List<View> i(View view) {
        z.a aVar = this.f1779f;
        int i10 = ((p.g) aVar.f18662b).f13768j;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = (ArrayList) ((p.g) aVar.f18662b).l(i11);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((p.g) aVar.f18662b).h(i11));
            }
        }
        this.f1781m.clear();
        if (arrayList != null) {
            this.f1781m.addAll(arrayList);
        }
        return this.f1781m;
    }

    @Override // n0.l
    public void j(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z10 = false;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i14) && (behavior = eVar.f1788a) != null) {
                    int[] iArr2 = this.n;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.l(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.n;
                    i15 = i12 > 0 ? Math.max(i15, iArr3[0]) : Math.min(i15, iArr3[0]);
                    i16 = i13 > 0 ? Math.max(i16, this.n[1]) : Math.min(i16, this.n[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i15;
        iArr[1] = iArr[1] + i16;
        if (z10) {
            v(1);
        }
    }

    @Override // n0.k
    public void k(View view, int i10, int i11, int i12, int i13, int i14) {
        j(view, i10, i11, i12, i13, 0, this.f1782t);
    }

    @Override // n0.k
    public boolean l(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                Behavior behavior = eVar.f1788a;
                if (behavior != null) {
                    boolean p10 = behavior.p(this, childAt, view, view2, i10, i11);
                    z10 |= p10;
                    eVar.c(i11, p10);
                } else {
                    eVar.c(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // n0.k
    public void m(View view, View view2, int i10, int i11) {
        m mVar = this.I;
        if (i11 == 1) {
            mVar.f13150b = i10;
        } else {
            mVar.f13149a = i10;
        }
        this.A = view2;
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            ((e) getChildAt(i12).getLayoutParams()).a(i11);
        }
    }

    @Override // n0.k
    public void n(View view, int i10) {
        m mVar = this.I;
        if (i10 == 1) {
            mVar.f13150b = 0;
        } else {
            mVar.f13149a = 0;
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.a(i10)) {
                Behavior behavior = eVar.f1788a;
                if (behavior != null) {
                    behavior.q(this, childAt, view, i10);
                }
                eVar.c(i10, false);
                eVar.f1801p = false;
            }
        }
        this.A = null;
    }

    @Override // n0.k
    public void o(View view, int i10, int i11, int[] iArr, int i12) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z10 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(i12) && (behavior = eVar.f1788a) != null) {
                    int[] iArr2 = this.n;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.k(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.n;
                    i13 = i10 > 0 ? Math.max(i13, iArr3[0]) : Math.min(i13, iArr3[0]);
                    int[] iArr4 = this.n;
                    i14 = i11 > 0 ? Math.max(i14, iArr4[1]) : Math.min(i14, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = i13;
        iArr[1] = i14;
        if (z10) {
            v(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A(false);
        if (this.C) {
            if (this.B == null) {
                this.B = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.B);
        }
        if (this.D == null) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if (x.d.b(this)) {
                x.h.c(this);
            }
        }
        this.f1784w = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A(false);
        if (this.C && this.B != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.B);
        }
        View view = this.A;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f1784w = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.E && this.F != null) {
            d0 d0Var = this.D;
            int e10 = d0Var != null ? d0Var.e() : 0;
            if (e10 > 0) {
                this.F.setBounds(0, 0, getWidth(), e10);
                this.F.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            A(true);
        }
        boolean y = y(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            A(true);
        }
        return y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        int d10 = x.e.d(this);
        int size = this.f1778c.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f1778c.get(i14);
            if (view.getVisibility() != 8) {
                Behavior behavior = ((e) view.getLayoutParams()).f1788a;
                if (behavior != null) {
                    if (!behavior.h(this, view, d10)) {
                    }
                }
                w(view, d10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0194, code lost:
        if (r0.i(r30, r20, r8, r21, r23, 0) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0197  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    Behavior behavior = eVar.f1788a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.a(0)) {
                    Behavior behavior = eVar.f1788a;
                    if (behavior != null) {
                        z10 |= behavior.j(this, childAt, view, f10, f11);
                    }
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        o(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        j(view, i10, i11, i12, i13, 0, this.f1782t);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        m(view, view2, i10, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.f14775c);
        SparseArray<Parcelable> sparseArray = gVar.f1804j;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            Behavior behavior = t(childAt).f1788a;
            if (id2 != -1 && behavior != null && (parcelable2 = sparseArray.get(id2)) != null) {
                behavior.n(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable o10;
        g gVar = new g(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            Behavior behavior = ((e) childAt.getLayoutParams()).f1788a;
            if (id2 != -1 && behavior != null && (o10 = behavior.o(this, childAt)) != null) {
                sparseArray.append(id2, o10);
            }
        }
        gVar.f1804j = sparseArray;
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return l(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f1785z
            r4 = 1
            r4 = 1
            r5 = 6
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.y(r1, r4)
            if (r3 == 0) goto L2c
            goto L19
        L17:
            r3 = 7
            r3 = 0
        L19:
            android.view.View r6 = r0.f1785z
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r6 = r6.f1788a
            if (r6 == 0) goto L2c
            android.view.View r7 = r0.f1785z
            boolean r6 = r6.r(r0, r7, r1)
            goto L2e
        L2c:
            r6 = 4
            r6 = 0
        L2e:
            android.view.View r7 = r0.f1785z
            r8 = 5
            r8 = 0
            if (r7 != 0) goto L3a
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4f
        L3a:
            if (r3 == 0) goto L4f
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 3
            r14 = 0
            r15 = 7
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4f:
            if (r8 == 0) goto L54
            r8.recycle()
        L54:
            if (r2 == r4) goto L59
            r1 = 3
            if (r2 != r1) goto L5c
        L59:
            r0.A(r5)
        L5c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public List<View> p(View view) {
        List list = (List) ((p.g) this.f1779f.f18662b).getOrDefault(view, null);
        this.f1781m.clear();
        if (list != null) {
            this.f1781m.addAll(list);
        }
        return this.f1781m;
    }

    public void q(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = z.b.f18664a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = z.b.f18664a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        z.b.a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = z.b.f18665b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final void r(int i10, Rect rect, Rect rect2, e eVar, int i11, int i12) {
        int i13 = eVar.f1790c;
        if (i13 == 0) {
            i13 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i13, i10);
        int i14 = eVar.d;
        if ((i14 & 7) == 0) {
            i14 |= 8388611;
        }
        if ((i14 & 112) == 0) {
            i14 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int i17 = absoluteGravity2 & 7;
        int i18 = absoluteGravity2 & 112;
        int width = i17 != 1 ? i17 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i18 != 16 ? i18 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i15 == 1) {
            width -= i11 / 2;
        } else if (i15 != 5) {
            width -= i11;
        }
        if (i16 == 16) {
            height -= i12 / 2;
        } else if (i16 != 80) {
            height -= i12;
            rect2.set(width, height, i11 + width, i12 + height);
        }
        rect2.set(width, height, i11 + width, i12 + height);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        Behavior behavior = ((e) view.getLayoutParams()).f1788a;
        if (behavior == null || !behavior.m(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10 && !this.f1783u) {
            A(false);
            this.f1783u = true;
        }
    }

    public final int s(int i10) {
        int[] iArr = this.y;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        D();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.G = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.F;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.F = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.F.setState(getDrawableState());
                }
                Drawable drawable4 = this.F;
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                f0.a.c(drawable4, x.e.d(this));
                this.F.setVisible(getVisibility() == 0, false);
                this.F.setCallback(this);
            }
            WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
            x.d.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            Context context = getContext();
            Object obj = c0.a.f3717a;
            drawable = a.c.b(context, i10);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.F;
        if (drawable != null && drawable.isVisible() != z10) {
            this.F.setVisible(z10, false);
        }
    }

    public e t(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f1789b) {
            if (view instanceof b) {
                Behavior behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                eVar.b(behavior);
                eVar.f1789b = true;
            } else {
                c cVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    cVar = (c) cls.getAnnotation(c.class);
                    if (cVar != null) {
                        break;
                    }
                }
                if (cVar != null) {
                    try {
                        eVar.b(cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e10) {
                        StringBuilder m10 = a1.a.m("Default behavior class ");
                        m10.append(cVar.value().getName());
                        m10.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", m10.toString(), e10);
                    }
                }
                eVar.f1789b = true;
            }
        }
        return eVar;
    }

    public boolean u(View view, int i10, int i11) {
        Rect e10 = e();
        q(view, e10);
        try {
            boolean contains = e10.contains(i10, i11);
            e10.setEmpty();
            ((m0.e) N).a(e10);
            return contains;
        } catch (Throwable th) {
            e10.setEmpty();
            ((m0.e) N).a(e10);
            throw th;
        }
    }

    public final void v(int i10) {
        int i11;
        Rect rect;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        int width;
        int i13;
        int i14;
        int i15;
        int height;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Rect rect2;
        int i21;
        e eVar;
        Behavior behavior;
        WeakHashMap<View, a0> weakHashMap = x.f13156a;
        int d10 = x.e.d(this);
        int size = this.f1778c.size();
        Rect e10 = e();
        Rect e11 = e();
        Rect e12 = e();
        int i22 = 0;
        while (i22 < size) {
            View view = this.f1778c.get(i22);
            e eVar2 = (e) view.getLayoutParams();
            if (i10 == 0 && view.getVisibility() == 8) {
                i12 = size;
                rect = e12;
                i11 = i22;
            } else {
                int i23 = 0;
                while (i23 < i22) {
                    if (eVar2.f1798l == this.f1778c.get(i23)) {
                        e eVar3 = (e) view.getLayoutParams();
                        if (eVar3.f1797k != null) {
                            Rect e13 = e();
                            Rect e14 = e();
                            Rect e15 = e();
                            q(eVar3.f1797k, e13);
                            h(view, false, e14);
                            int measuredWidth = view.getMeasuredWidth();
                            i20 = size;
                            int measuredHeight = view.getMeasuredHeight();
                            i21 = i22;
                            i19 = i23;
                            rect2 = e12;
                            eVar = eVar2;
                            r(d10, e13, e15, eVar3, measuredWidth, measuredHeight);
                            boolean z13 = (e15.left == e14.left && e15.top == e14.top) ? false : true;
                            f(eVar3, e15, measuredWidth, measuredHeight);
                            int i24 = e15.left - e14.left;
                            int i25 = e15.top - e14.top;
                            if (i24 != 0) {
                                x.n(view, i24);
                            }
                            if (i25 != 0) {
                                x.o(view, i25);
                            }
                            if (z13 && (behavior = eVar3.f1788a) != null) {
                                behavior.d(this, view, eVar3.f1797k);
                            }
                            e13.setEmpty();
                            m0.e eVar4 = (m0.e) N;
                            eVar4.a(e13);
                            e14.setEmpty();
                            eVar4.a(e14);
                            e15.setEmpty();
                            eVar4.a(e15);
                            i23 = i19 + 1;
                            eVar2 = eVar;
                            size = i20;
                            i22 = i21;
                            e12 = rect2;
                        }
                    }
                    i19 = i23;
                    i20 = size;
                    rect2 = e12;
                    i21 = i22;
                    eVar = eVar2;
                    i23 = i19 + 1;
                    eVar2 = eVar;
                    size = i20;
                    i22 = i21;
                    e12 = rect2;
                }
                int i26 = size;
                Rect rect3 = e12;
                i11 = i22;
                e eVar5 = eVar2;
                h(view, true, e11);
                if (eVar5.f1793g != 0 && !e11.isEmpty()) {
                    int absoluteGravity = Gravity.getAbsoluteGravity(eVar5.f1793g, d10);
                    int i27 = absoluteGravity & 112;
                    if (i27 == 48) {
                        e10.top = Math.max(e10.top, e11.bottom);
                    } else if (i27 == 80) {
                        e10.bottom = Math.max(e10.bottom, getHeight() - e11.top);
                    }
                    int i28 = absoluteGravity & 7;
                    if (i28 == 3) {
                        e10.left = Math.max(e10.left, e11.right);
                    } else if (i28 == 5) {
                        e10.right = Math.max(e10.right, getWidth() - e11.left);
                    }
                }
                if (eVar5.f1794h != 0 && view.getVisibility() == 0) {
                    WeakHashMap<View, a0> weakHashMap2 = x.f13156a;
                    if (x.g.c(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                        e eVar6 = (e) view.getLayoutParams();
                        Behavior behavior2 = eVar6.f1788a;
                        Rect e16 = e();
                        Rect e17 = e();
                        e17.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (behavior2 == null || !behavior2.a(this, view, e16)) {
                            e16.set(e17);
                        } else if (!e17.contains(e16)) {
                            StringBuilder m10 = a1.a.m("Rect should be within the child's bounds. Rect:");
                            m10.append(e16.toShortString());
                            m10.append(" | Bounds:");
                            m10.append(e17.toShortString());
                            throw new IllegalArgumentException(m10.toString());
                        }
                        e17.setEmpty();
                        m0.e eVar7 = (m0.e) N;
                        eVar7.a(e17);
                        if (e16.isEmpty()) {
                            e16.setEmpty();
                            eVar7.a(e16);
                        } else {
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(eVar6.f1794h, d10);
                            if ((absoluteGravity2 & 48) != 48 || (i17 = (e16.top - ((ViewGroup.MarginLayoutParams) eVar6).topMargin) - eVar6.f1796j) >= (i18 = e10.top)) {
                                z11 = false;
                            } else {
                                C(view, i18 - i17);
                                z11 = true;
                            }
                            if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - e16.bottom) - ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin) + eVar6.f1796j) < (i16 = e10.bottom)) {
                                C(view, height - i16);
                                z11 = true;
                            }
                            if (!z11) {
                                C(view, 0);
                            }
                            if ((absoluteGravity2 & 3) != 3 || (i14 = (e16.left - ((ViewGroup.MarginLayoutParams) eVar6).leftMargin) - eVar6.f1795i) >= (i15 = e10.left)) {
                                z12 = false;
                            } else {
                                B(view, i15 - i14);
                                z12 = true;
                            }
                            if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - e16.right) - ((ViewGroup.MarginLayoutParams) eVar6).rightMargin) + eVar6.f1795i) < (i13 = e10.right)) {
                                B(view, width - i13);
                                z12 = true;
                            }
                            if (!z12) {
                                B(view, 0);
                            }
                            e16.setEmpty();
                            eVar7.a(e16);
                        }
                    }
                }
                if (i10 != 2) {
                    rect = rect3;
                    rect.set(((e) view.getLayoutParams()).f1802q);
                    if (rect.equals(e11)) {
                        i12 = i26;
                    } else {
                        ((e) view.getLayoutParams()).f1802q.set(e11);
                    }
                } else {
                    rect = rect3;
                }
                i12 = i26;
                for (int i29 = i11 + 1; i29 < i12; i29++) {
                    View view2 = this.f1778c.get(i29);
                    e eVar8 = (e) view2.getLayoutParams();
                    Behavior behavior3 = eVar8.f1788a;
                    if (behavior3 != null && behavior3.b(this, view2, view)) {
                        if (i10 == 0 && eVar8.f1801p) {
                            eVar8.f1801p = false;
                        } else {
                            if (i10 != 2) {
                                z10 = behavior3.d(this, view2, view);
                            } else {
                                behavior3.e(this, view2, view);
                                z10 = true;
                            }
                            if (i10 == 1) {
                                eVar8.f1801p = z10;
                            }
                        }
                    }
                }
            }
            i22 = i11 + 1;
            size = i12;
            e12 = rect;
        }
        Rect rect4 = e12;
        e10.setEmpty();
        m0.e eVar9 = (m0.e) N;
        eVar9.a(e10);
        e11.setEmpty();
        eVar9.a(e11);
        rect4.setEmpty();
        eVar9.a(rect4);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.F) {
            return false;
        }
        return true;
    }

    public void w(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        View view2 = eVar.f1797k;
        int i11 = 0;
        if (view2 == null && eVar.f1792f != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (view2 != null) {
            Rect e10 = e();
            Rect e11 = e();
            try {
                q(view2, e10);
                e eVar2 = (e) view.getLayoutParams();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                r(i10, e10, e11, eVar2, measuredWidth, measuredHeight);
                f(eVar2, e11, measuredWidth, measuredHeight);
                view.layout(e11.left, e11.top, e11.right, e11.bottom);
                e10.setEmpty();
                m0.e eVar3 = (m0.e) N;
                eVar3.a(e10);
                e11.setEmpty();
                eVar3.a(e11);
                return;
            } catch (Throwable th) {
                e10.setEmpty();
                m0.e eVar4 = (m0.e) N;
                eVar4.a(e10);
                e11.setEmpty();
                eVar4.a(e11);
                throw th;
            }
        }
        int i12 = eVar.f1791e;
        if (i12 < 0) {
            e eVar5 = (e) view.getLayoutParams();
            Rect e12 = e();
            e12.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar5).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar5).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar5).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar5).bottomMargin);
            if (this.D != null) {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                if (x.d.b(this) && !x.d.b(view)) {
                    e12.left = this.D.c() + e12.left;
                    e12.top = this.D.e() + e12.top;
                    e12.right -= this.D.d();
                    e12.bottom -= this.D.b();
                }
            }
            Rect e13 = e();
            int i13 = eVar5.f1790c;
            if ((i13 & 7) == 0) {
                i13 |= 8388611;
            }
            if ((i13 & 112) == 0) {
                i13 |= 48;
            }
            Gravity.apply(i13, view.getMeasuredWidth(), view.getMeasuredHeight(), e12, e13, i10);
            view.layout(e13.left, e13.top, e13.right, e13.bottom);
            e12.setEmpty();
            m0.e eVar6 = (m0.e) N;
            eVar6.a(e12);
            e13.setEmpty();
            eVar6.a(e13);
            return;
        }
        e eVar7 = (e) view.getLayoutParams();
        int i14 = eVar7.f1790c;
        if (i14 == 0) {
            i14 = 8388661;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i14, i10);
        int i15 = absoluteGravity & 7;
        int i16 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        if (i10 == 1) {
            i12 = width - i12;
        }
        int s10 = s(i12) - measuredWidth2;
        if (i15 == 1) {
            s10 += measuredWidth2 / 2;
        } else if (i15 == 5) {
            s10 += measuredWidth2;
        }
        if (i16 == 16) {
            i11 = 0 + (measuredHeight2 / 2);
        } else if (i16 == 80) {
            i11 = measuredHeight2 + 0;
        }
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar7).leftMargin, Math.min(s10, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) eVar7).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar7).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) eVar7).bottomMargin));
        view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
    }

    public void x(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    public final boolean y(MotionEvent motionEvent, int i10) {
        boolean z10;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f1780j;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i11 = childCount - 1; i11 >= 0; i11--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i11) : i11));
        }
        Comparator<View> comparator = M;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view = list.get(i12);
            e eVar = (e) view.getLayoutParams();
            Behavior behavior = eVar.f1788a;
            if (!(z11 || z12) || actionMasked == 0) {
                if (!z11 && behavior != null) {
                    if (i10 == 0) {
                        z11 = behavior.g(this, view, motionEvent);
                    } else if (i10 == 1) {
                        z11 = behavior.r(this, view, motionEvent);
                    }
                    if (z11) {
                        this.f1785z = view;
                    }
                }
                if (eVar.f1788a == null) {
                    eVar.f1799m = false;
                }
                boolean z13 = eVar.f1799m;
                if (z13) {
                    z10 = true;
                } else {
                    z10 = z13 | false;
                    eVar.f1799m = z10;
                }
                z12 = z10 && !z13;
                if (z10 && !z12) {
                    break;
                }
            } else if (behavior != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    behavior.g(this, view, motionEvent2);
                } else if (i10 == 1) {
                    behavior.r(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0099, code lost:
        if (r5 != false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0158  */
    /* JADX WARN: Type inference failed for: r13v14, types: [android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z() {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.z():void");
    }
}
