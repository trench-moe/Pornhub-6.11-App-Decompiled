package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.app.pornhub.R;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public ArrayList<View> f2040c;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<View> f2041f;

    /* renamed from: j  reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f2042j;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2043m;

    public FragmentContainerView(Context context) {
        super(context);
        this.f2043m = true;
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        String str;
        this.f2043m = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r3.c.f14633f);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, y yVar) {
        super(context, attributeSet);
        View view;
        this.f2043m = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r3.c.f14633f);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment H = yVar.H(id2);
        if (classAttribute != null && H == null) {
            if (id2 <= 0) {
                throw new IllegalStateException(android.support.v4.media.b.j("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? a1.a.l(" with tag ", string) : BuildConfig.FLAVOR));
            }
            Fragment a10 = yVar.L().a(context.getClassLoader(), classAttribute);
            a10.b0(context, attributeSet, null);
            a aVar = new a(yVar);
            aVar.f2164p = true;
            a10.V = this;
            aVar.g(getId(), a10, string, 1);
            aVar.e();
        }
        Iterator it = ((ArrayList) yVar.f2285c.i()).iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            Fragment fragment = f0Var.f2128c;
            if (fragment.N == getId() && (view = fragment.W) != null && view.getParent() == null) {
                fragment.V = this;
                f0Var.b();
            }
        }
    }

    public final void a(View view) {
        ArrayList<View> arrayList = this.f2041f;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f2040c == null) {
            this.f2040c = new ArrayList<>();
        }
        this.f2040c.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            return super.addViewInLayout(view, i10, layoutParams, z10);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        n0.d0 k10 = n0.d0.k(windowInsets, null);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2042j;
        n0.d0 j10 = onApplyWindowInsetsListener != null ? n0.d0.j(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : n0.x.p(this, k10);
        if (!j10.g()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                n0.x.e(getChildAt(i10), j10);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f2043m && this.f2040c != null) {
            for (int i10 = 0; i10 < this.f2040c.size(); i10++) {
                super.drawChild(canvas, this.f2040c.get(i10), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        ArrayList<View> arrayList;
        if (!this.f2043m || (arrayList = this.f2040c) == null || arrayList.size() <= 0 || !this.f2040c.contains(view)) {
            return super.drawChild(canvas, view, j10);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f2041f;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f2040c;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2043m = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        if (z10) {
            a(view);
        }
        super.removeDetachedView(view, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        a(getChildAt(i10));
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            a(getChildAt(i12));
        }
        super.removeViewsInLayout(i10, i11);
    }

    public void setDrawDisappearingViewsLast(boolean z10) {
        this.f2043m = z10;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f2042j = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2041f == null) {
                this.f2041f = new ArrayList<>();
            }
            this.f2041f.add(view);
        }
        super.startViewTransition(view);
    }
}
