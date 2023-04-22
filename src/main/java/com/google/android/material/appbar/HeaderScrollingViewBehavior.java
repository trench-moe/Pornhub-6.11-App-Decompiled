package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import n0.a0;
import n0.d0;
import n0.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: c  reason: collision with root package name */
    public final Rect f7139c;
    public final Rect d;

    /* renamed from: e  reason: collision with root package name */
    public int f7140e;

    /* renamed from: f  reason: collision with root package name */
    public int f7141f;

    public HeaderScrollingViewBehavior() {
        this.f7139c = new Rect();
        this.d = new Rect();
        this.f7140e = 0;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7139c = new Rect();
        this.d = new Rect();
        this.f7140e = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        d0 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if (i14 != -1 && i14 != -2) {
            return false;
        }
        View v2 = v(coordinatorLayout.i(view));
        if (v2 != null) {
            int size = View.MeasureSpec.getSize(i12);
            if (size > 0) {
                WeakHashMap<View, a0> weakHashMap = x.f13156a;
                if (x.d.b(v2) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.b() + lastWindowInsets.e();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            coordinatorLayout.x(view, i10, i11, View.MeasureSpec.makeMeasureSpec((size + y(v2)) - v2.getMeasuredHeight(), i14 == -1 ? 1073741824 : IntCompanionObject.MIN_VALUE), i13);
            return true;
        }
        return false;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void t(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View v2 = v(coordinatorLayout.i(view));
        if (v2 == null) {
            coordinatorLayout.w(view, i10);
            this.f7140e = 0;
            return;
        }
        CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
        Rect rect = this.f7139c;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, v2.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((v2.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        d0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null) {
            WeakHashMap<View, a0> weakHashMap = x.f13156a;
            if (x.d.b(coordinatorLayout) && !x.d.b(view)) {
                rect.left = lastWindowInsets.c() + rect.left;
                rect.right -= lastWindowInsets.d();
            }
        }
        Rect rect2 = this.d;
        int i11 = eVar.f1790c;
        Gravity.apply(i11 == 0 ? 8388659 : i11, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        int w10 = w(v2);
        view.layout(rect2.left, rect2.top - w10, rect2.right, rect2.bottom - w10);
        this.f7140e = rect2.top - v2.getBottom();
    }

    public abstract View v(List<View> list);

    public final int w(View view) {
        if (this.f7141f == 0) {
            return 0;
        }
        float x10 = x(view);
        int i10 = this.f7141f;
        return t3.a.g((int) (x10 * i10), 0, i10);
    }

    public float x(View view) {
        return 1.0f;
    }

    public int y(View view) {
        return view.getMeasuredHeight();
    }
}
