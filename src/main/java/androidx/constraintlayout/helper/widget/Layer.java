package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import t9.j0;

/* loaded from: classes.dex */
public class Layer extends ConstraintHelper {
    public float A;
    public ConstraintLayout B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public boolean K;
    public View[] L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public float y;

    /* renamed from: z  reason: collision with root package name */
    public float f1373z;

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = Float.NaN;
        this.f1373z = Float.NaN;
        this.A = Float.NaN;
        this.C = 1.0f;
        this.D = 1.0f;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = true;
        this.L = null;
        this.M = 0.0f;
        this.N = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.y = Float.NaN;
        this.f1373z = Float.NaN;
        this.A = Float.NaN;
        this.C = 1.0f;
        this.D = 1.0f;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = true;
        this.L = null;
        this.M = 0.0f;
        this.N = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void j(ConstraintLayout constraintLayout) {
        i(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j0.A);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.O = true;
                } else if (index == 22) {
                    this.P = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B = (ConstraintLayout) getParent();
        if (!this.O) {
            if (this.P) {
            }
        }
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f1602f; i10++) {
            View i11 = this.B.i(this.f1601c[i10]);
            if (i11 != null) {
                if (this.O) {
                    i11.setVisibility(visibility);
                }
                if (this.P && elevation > 0.0f) {
                    i11.setTranslationZ(i11.getTranslationZ() + elevation);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void q(ConstraintLayout constraintLayout) {
        v();
        this.E = Float.NaN;
        this.F = Float.NaN;
        ConstraintWidget constraintWidget = ((ConstraintLayout.LayoutParams) getLayoutParams()).f1647q0;
        constraintWidget.Y(0);
        constraintWidget.T(0);
        u();
        layout(((int) this.I) - getPaddingLeft(), ((int) this.J) - getPaddingTop(), getPaddingRight() + ((int) this.G), getPaddingBottom() + ((int) this.H));
        w();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void r(ConstraintLayout constraintLayout) {
        this.B = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.A = rotation;
        } else if (!Float.isNaN(this.A)) {
            this.A = rotation;
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        h();
    }

    @Override // android.view.View
    public void setPivotX(float f10) {
        this.y = f10;
        w();
    }

    @Override // android.view.View
    public void setPivotY(float f10) {
        this.f1373z = f10;
        w();
    }

    @Override // android.view.View
    public void setRotation(float f10) {
        this.A = f10;
        w();
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        this.C = f10;
        w();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        this.D = f10;
        w();
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        this.M = f10;
        w();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        this.N = f10;
        w();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        h();
    }

    public void u() {
        if (this.B == null) {
            return;
        }
        if (this.K || Float.isNaN(this.E) || Float.isNaN(this.F)) {
            if (!Float.isNaN(this.y) && !Float.isNaN(this.f1373z)) {
                this.F = this.f1373z;
                this.E = this.y;
                return;
            }
            View[] m10 = m(this.B);
            int left = m10[0].getLeft();
            int top = m10[0].getTop();
            int right = m10[0].getRight();
            int bottom = m10[0].getBottom();
            for (int i10 = 0; i10 < this.f1602f; i10++) {
                View view = m10[i10];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.G = right;
            this.H = bottom;
            this.I = left;
            this.J = top;
            if (Float.isNaN(this.y)) {
                this.E = (left + right) / 2;
            } else {
                this.E = this.y;
            }
            if (Float.isNaN(this.f1373z)) {
                this.F = (top + bottom) / 2;
            } else {
                this.F = this.f1373z;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025 A[LOOP:0: B:15:0x0021->B:17:0x0025, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v() {
        /*
            r8 = this;
            r4 = r8
            androidx.constraintlayout.widget.ConstraintLayout r0 = r4.B
            r7 = 6
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r4.f1602f
            if (r0 != 0) goto Lc
            return
        Lc:
            r6 = 5
            android.view.View[] r1 = r4.L
            r6 = 4
            if (r1 == 0) goto L18
            r6 = 7
            int r1 = r1.length
            r6 = 6
            if (r1 == r0) goto L1e
            r6 = 4
        L18:
            android.view.View[] r0 = new android.view.View[r0]
            r6 = 6
            r4.L = r0
            r7 = 2
        L1e:
            r6 = 7
            r6 = 0
            r0 = r6
        L21:
            int r1 = r4.f1602f
            if (r0 >= r1) goto L39
            int[] r1 = r4.f1601c
            r1 = r1[r0]
            r6 = 2
            android.view.View[] r2 = r4.L
            androidx.constraintlayout.widget.ConstraintLayout r3 = r4.B
            r6 = 3
            android.view.View r1 = r3.i(r1)
            r2[r0] = r1
            int r0 = r0 + 1
            r6 = 5
            goto L21
        L39:
            r7 = 7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Layer.v():void");
    }

    public final void w() {
        if (this.B == null) {
            return;
        }
        if (this.L == null) {
            v();
        }
        u();
        double radians = Float.isNaN(this.A) ? 0.0d : Math.toRadians(this.A);
        float sin = (float) Math.sin(radians);
        float cos = (float) Math.cos(radians);
        float f10 = this.C;
        float f11 = f10 * cos;
        float f12 = this.D;
        float f13 = (-f12) * sin;
        float f14 = f10 * sin;
        float f15 = f12 * cos;
        for (int i10 = 0; i10 < this.f1602f; i10++) {
            View view = this.L[i10];
            int left = view.getLeft();
            int top = view.getTop();
            float right = ((view.getRight() + left) / 2) - this.E;
            float bottom = ((view.getBottom() + top) / 2) - this.F;
            view.setTranslationX((((f13 * bottom) + (f11 * right)) - right) + this.M);
            view.setTranslationY((((f15 * bottom) + (right * f14)) - bottom) + this.N);
            view.setScaleY(this.D);
            view.setScaleX(this.C);
            if (!Float.isNaN(this.A)) {
                view.setRotation(this.A);
            }
        }
    }
}
