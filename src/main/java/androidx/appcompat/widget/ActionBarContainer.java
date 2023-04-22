package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.app.pornhub.R;
import java.util.WeakHashMap;
import kotlin.jvm.internal.IntCompanionObject;
import n0.x;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public boolean f713c;

    /* renamed from: f  reason: collision with root package name */
    public View f714f;

    /* renamed from: j  reason: collision with root package name */
    public View f715j;

    /* renamed from: m  reason: collision with root package name */
    public View f716m;
    public Drawable n;

    /* renamed from: t  reason: collision with root package name */
    public Drawable f717t;

    /* renamed from: u  reason: collision with root package name */
    public Drawable f718u;

    /* renamed from: w  reason: collision with root package name */
    public boolean f719w;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public int f720z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b bVar = new b(this);
        WeakHashMap<View, n0.a0> weakHashMap = n0.x.f13156a;
        x.d.q(this, bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b7.k.f3604t);
        boolean z10 = false;
        this.n = obtainStyledAttributes.getDrawable(0);
        this.f717t = obtainStyledAttributes.getDrawable(2);
        this.f720z = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f719w = true;
            this.f718u = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f719w ? !(this.n != null || this.f717t != null) : this.f718u == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        if (view != null && view.getVisibility() != 8) {
            if (view.getMeasuredHeight() != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.n;
        if (drawable != null && drawable.isStateful()) {
            this.n.setState(getDrawableState());
        }
        Drawable drawable2 = this.f717t;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f717t.setState(getDrawableState());
        }
        Drawable drawable3 = this.f718u;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f718u.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f714f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f717t;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f718u;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f715j = findViewById(R.id.action_bar);
        this.f716m = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f713c && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f714f;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i14 = ((FrameLayout.LayoutParams) view.getLayoutParams()).bottomMargin;
            view.layout(i10, (measuredHeight - view.getMeasuredHeight()) - i14, i12, measuredHeight - i14);
        }
        if (this.f719w) {
            Drawable drawable2 = this.f718u;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = false;
            }
        } else {
            if (this.n != null) {
                if (this.f715j.getVisibility() == 0) {
                    this.n.setBounds(this.f715j.getLeft(), this.f715j.getTop(), this.f715j.getRight(), this.f715j.getBottom());
                } else {
                    View view2 = this.f716m;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.n.setBounds(0, 0, 0, 0);
                    } else {
                        this.n.setBounds(this.f716m.getLeft(), this.f716m.getTop(), this.f716m.getRight(), this.f716m.getBottom());
                    }
                }
                z12 = true;
            }
            this.y = z13;
            if (!z13 || (drawable = this.f717t) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        if (this.f715j == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f720z) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), IntCompanionObject.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f715j == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f714f;
        if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
            setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.f714f) + (!b(this.f715j) ? a(this.f715j) : !b(this.f716m) ? a(this.f716m) : 0), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : IntCompanionObject.MAX_VALUE));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r6.f717t == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPrimaryBackground(android.graphics.drawable.Drawable r7) {
        /*
            r6 = this;
            android.graphics.drawable.Drawable r0 = r6.n
            if (r0 == 0) goto L10
            r1 = 0
            r5 = 1
            r0.setCallback(r1)
            r5 = 5
            android.graphics.drawable.Drawable r0 = r6.n
            r6.unscheduleDrawable(r0)
            r5 = 6
        L10:
            r6.n = r7
            if (r7 == 0) goto L3c
            r5 = 3
            r7.setCallback(r6)
            r5 = 5
            android.view.View r7 = r6.f715j
            if (r7 == 0) goto L3c
            r5 = 4
            android.graphics.drawable.Drawable r0 = r6.n
            int r7 = r7.getLeft()
            android.view.View r1 = r6.f715j
            int r4 = r1.getTop()
            r1 = r4
            android.view.View r2 = r6.f715j
            r5 = 2
            int r4 = r2.getRight()
            r2 = r4
            android.view.View r3 = r6.f715j
            int r3 = r3.getBottom()
            r0.setBounds(r7, r1, r2, r3)
        L3c:
            r5 = 2
            boolean r7 = r6.f719w
            r0 = 1
            r4 = 0
            r1 = r4
            if (r7 == 0) goto L4c
            r5 = 2
            android.graphics.drawable.Drawable r7 = r6.f718u
            r5 = 7
            if (r7 != 0) goto L55
            r5 = 7
            goto L56
        L4c:
            android.graphics.drawable.Drawable r7 = r6.n
            if (r7 != 0) goto L55
            android.graphics.drawable.Drawable r7 = r6.f717t
            if (r7 != 0) goto L55
            goto L56
        L55:
            r0 = 0
        L56:
            r6.setWillNotDraw(r0)
            r5 = 3
            r6.invalidate()
            r5 = 3
            r6.invalidateOutline()
            r5 = 1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.setPrimaryBackground(android.graphics.drawable.Drawable):void");
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f718u;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f718u);
        }
        this.f718u = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f719w && (drawable2 = this.f718u) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (this.f719w) {
            if (this.f718u == null) {
                z10 = true;
            }
        } else if (this.n == null && this.f717t == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f717t;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f717t);
        }
        this.f717t = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.y && (drawable2 = this.f717t) != null) {
                drawable2.setBounds(this.f714f.getLeft(), this.f714f.getTop(), this.f714f.getRight(), this.f714f.getBottom());
            }
        }
        boolean z10 = true;
        if (this.f719w) {
            if (this.f718u == null) {
            }
            z10 = false;
        } else {
            if (this.n == null && this.f717t == null) {
            }
            z10 = false;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(i0 i0Var) {
        View view = this.f714f;
        if (view != null) {
            removeView(view);
        }
        this.f714f = i0Var;
        if (i0Var != null) {
            addView(i0Var);
            ViewGroup.LayoutParams layoutParams = i0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            i0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f713c = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f717t;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f718u;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.n) {
            if (this.f719w) {
            }
            return true;
        }
        if (drawable == this.f717t) {
            if (!this.y) {
            }
            return true;
        }
        if ((drawable != this.f718u || !this.f719w) && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
