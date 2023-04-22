package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import t9.j0;
import w.n;

/* loaded from: classes.dex */
public class MotionHelper extends ConstraintHelper implements MotionLayout.i {
    public float A;
    public View[] B;
    public boolean y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f1374z;

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = false;
        this.f1374z = false;
        n(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.y = false;
        this.f1374z = false;
        n(attributeSet);
    }

    public void a(MotionLayout motionLayout, int i10, int i11, float f10) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public void b(MotionLayout motionLayout, int i10, int i11) {
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.i
    public void c(MotionLayout motionLayout, int i10, boolean z10, float f10) {
    }

    public void d(MotionLayout motionLayout, int i10) {
    }

    public float getProgress() {
        return this.A;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j0.Q);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.y = obtainStyledAttributes.getBoolean(index, this.y);
                } else if (index == 0) {
                    this.f1374z = obtainStyledAttributes.getBoolean(index, this.f1374z);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.A = f10;
        int i10 = 0;
        if (this.f1602f > 0) {
            this.B = m((ConstraintLayout) getParent());
            while (i10 < this.f1602f) {
                View view = this.B[i10];
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            boolean z10 = viewGroup.getChildAt(i10) instanceof MotionHelper;
            i10++;
        }
    }

    public void u(MotionLayout motionLayout, HashMap<View, n> hashMap) {
    }
}
