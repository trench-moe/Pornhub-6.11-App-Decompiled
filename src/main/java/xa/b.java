package xa;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import wa.d;

/* loaded from: classes2.dex */
public class b extends d {
    public int U;
    public final FrameLayout.LayoutParams V;

    public b(Context context) {
        super(context);
        this.U = -1;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.V = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
        setItemActiveIndicatorResizeable(true);
    }

    @Override // wa.d
    public wa.a e(Context context) {
        return new a(context);
    }

    public final int g(int i10, int i11, int i12) {
        int max = i11 / Math.max(1, i12);
        int i13 = this.U;
        if (i13 == -1) {
            i13 = View.MeasureSpec.getSize(i10);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(i13, max), 0);
    }

    public int getItemMinimumHeight() {
        return this.U;
    }

    public int getMenuGravity() {
        return this.V.gravity;
    }

    public final int h(int i10, int i11, int i12, View view) {
        int i13;
        g(i10, i11, i12);
        int g10 = view == null ? g(i10, i11, i12) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int childCount = getChildCount();
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt != view) {
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i10, g10);
                    i13 = childAt.getMeasuredHeight();
                } else {
                    i13 = 0;
                }
                i14 += i13;
            }
        }
        return i14;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i15;
                childAt.layout(0, i15, i14, measuredHeight);
                i15 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int h10;
        int i12;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = getMenu().l().size();
        if (size2 <= 1 || !f(getLabelVisibilityMode(), size2)) {
            h10 = h(i10, size, size2, null);
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            if (childAt != null) {
                int g10 = g(i10, size, size2);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i10, g10);
                    i12 = childAt.getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                size -= i12;
                size2--;
            } else {
                i12 = 0;
            }
            h10 = h(i10, size, size2, childAt) + i12;
        }
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i10), i10, 0), View.resolveSizeAndState(h10, i11, 0));
    }

    public void setItemMinimumHeight(int i10) {
        if (this.U != i10) {
            this.U = i10;
            requestLayout();
        }
    }

    public void setMenuGravity(int i10) {
        FrameLayout.LayoutParams layoutParams = this.V;
        if (layoutParams.gravity != i10) {
            layoutParams.gravity = i10;
            setLayoutParams(layoutParams);
        }
    }
}
