package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    public Drawable A;
    public int B;
    public int C;
    public int D;
    public int E;

    /* renamed from: c  reason: collision with root package name */
    public boolean f832c;

    /* renamed from: f  reason: collision with root package name */
    public int f833f;

    /* renamed from: j  reason: collision with root package name */
    public int f834j;

    /* renamed from: m  reason: collision with root package name */
    public int f835m;
    public int n;

    /* renamed from: t  reason: collision with root package name */
    public int f836t;

    /* renamed from: u  reason: collision with root package name */
    public float f837u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f838w;
    public int[] y;

    /* renamed from: z  reason: collision with root package name */
    public int[] f839z;

    /* loaded from: classes.dex */
    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int resourceId;
        this.f832c = true;
        this.f833f = -1;
        this.f834j = 0;
        this.n = 8388659;
        int[] iArr = b7.k.J;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        n0.x.u(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = obtainStyledAttributes.getInt(1, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = obtainStyledAttributes.getInt(0, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = obtainStyledAttributes.getBoolean(2, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.f837u = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f833f = obtainStyledAttributes.getInt(3, -1);
        this.f838w = obtainStyledAttributes.getBoolean(7, false);
        setDividerDrawable((!obtainStyledAttributes.hasValue(5) || (resourceId = obtainStyledAttributes.getResourceId(5, 0)) == 0) ? obtainStyledAttributes.getDrawable(5) : f.a.a(context, resourceId));
        this.D = obtainStyledAttributes.getInt(8, 0);
        this.E = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void f(Canvas canvas, int i10) {
        this.A.setBounds(getPaddingLeft() + this.E, i10, (getWidth() - getPaddingRight()) - this.E, this.C + i10);
        this.A.draw(canvas);
    }

    public void g(Canvas canvas, int i10) {
        this.A.setBounds(i10, getPaddingTop() + this.E, this.B + i10, (getHeight() - getPaddingBottom()) - this.E);
        this.A.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f833f < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f833f;
        if (childCount > i11) {
            View childAt = getChildAt(i11);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f833f == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i12 = this.f834j;
            if (this.f835m == 1 && (i10 = this.n & 112) != 48) {
                if (i10 == 16) {
                    i12 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f836t) / 2;
                } else if (i10 == 80) {
                    i12 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f836t;
                }
            }
            return i12 + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f833f;
    }

    public Drawable getDividerDrawable() {
        return this.A;
    }

    public int getDividerPadding() {
        return this.E;
    }

    public int getDividerWidth() {
        return this.B;
    }

    public int getGravity() {
        return this.n;
    }

    public int getOrientation() {
        return this.f835m;
    }

    public int getShowDividers() {
        return this.D;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f837u;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h */
    public LayoutParams generateDefaultLayoutParams() {
        int i10 = this.f835m;
        if (i10 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i10 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public boolean k(int i10) {
        if (i10 == 0) {
            return (this.D & 1) != 0;
        } else if (i10 == getChildCount()) {
            return (this.D & 4) != 0;
        } else if ((this.D & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int right;
        int left;
        int i10;
        if (this.A == null) {
            return;
        }
        int i11 = 0;
        if (this.f835m == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && k(i11)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin) - this.C);
                }
                i11++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                f(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.C : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) childAt2.getLayoutParams())).bottomMargin);
            }
        } else {
            int virtualChildCount2 = getVirtualChildCount();
            boolean b10 = x0.b(this);
            while (i11 < virtualChildCount2) {
                View childAt3 = getChildAt(i11);
                if (childAt3 != null && childAt3.getVisibility() != 8 && k(i11)) {
                    LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                    g(canvas, b10 ? childAt3.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.B);
                }
                i11++;
            }
            if (k(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt4.getLayoutParams();
                    if (b10) {
                        left = childAt4.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                        i10 = this.B;
                        right = left - i10;
                        g(canvas, right);
                    } else {
                        right = childAt4.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                        g(canvas, right);
                    }
                } else if (b10) {
                    right = getPaddingLeft();
                    g(canvas, right);
                } else {
                    left = getWidth() - getPaddingRight();
                    i10 = this.B;
                    right = left - i10;
                    g(canvas, right);
                }
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01bb  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x05bc  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x08e7  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x090e  */
    /* JADX WARN: Removed duplicated region for block: B:448:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z10) {
        this.f832c = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f833f = i10;
            return;
        }
        StringBuilder m10 = a1.a.m("base aligned child index out of range (0, ");
        m10.append(getChildCount());
        m10.append(")");
        throw new IllegalArgumentException(m10.toString());
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.A) {
            return;
        }
        this.A = drawable;
        if (drawable != null) {
            this.B = drawable.getIntrinsicWidth();
            this.C = drawable.getIntrinsicHeight();
        } else {
            this.B = 0;
            this.C = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.E = i10;
    }

    public void setGravity(int i10) {
        if (this.n != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= 8388611;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.n = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & 8388615;
        int i12 = this.n;
        if ((8388615 & i12) != i11) {
            this.n = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f838w = z10;
    }

    public void setOrientation(int i10) {
        if (this.f835m != i10) {
            this.f835m = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.D) {
            requestLayout();
        }
        this.D = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.n;
        if ((i12 & 112) != i11) {
            this.n = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f837u = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
