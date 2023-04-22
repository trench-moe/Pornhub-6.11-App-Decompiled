package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import t9.j0;

/* loaded from: classes.dex */
public class MotionEffect extends MotionHelper {
    public float C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public int J;

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = 0.1f;
        this.D = 49;
        this.E = 50;
        this.F = 0;
        this.G = 0;
        this.H = true;
        this.I = -1;
        this.J = -1;
        v(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.C = 0.1f;
        this.D = 49;
        this.E = 50;
        this.F = 0;
        this.G = 0;
        this.H = true;
        this.I = -1;
        this.J = -1;
        v(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a7, code lost:
        if (r14 == 0.0f) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01bf, code lost:
        if (r1 == 0.0f) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d8  */
    @Override // androidx.constraintlayout.motion.widget.MotionHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(androidx.constraintlayout.motion.widget.MotionLayout r23, java.util.HashMap<android.view.View, w.n> r24) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.u(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    public final void v(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.P);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 3) {
                    int i11 = obtainStyledAttributes.getInt(index, this.D);
                    this.D = i11;
                    this.D = Math.max(Math.min(i11, 99), 0);
                } else if (index == 1) {
                    int i12 = obtainStyledAttributes.getInt(index, this.E);
                    this.E = i12;
                    this.E = Math.max(Math.min(i12, 99), 0);
                } else if (index == 5) {
                    this.F = obtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                } else if (index == 6) {
                    this.G = obtainStyledAttributes.getDimensionPixelOffset(index, this.G);
                } else if (index == 0) {
                    this.C = obtainStyledAttributes.getFloat(index, this.C);
                } else if (index == 2) {
                    this.J = obtainStyledAttributes.getInt(index, this.J);
                } else if (index == 4) {
                    this.H = obtainStyledAttributes.getBoolean(index, this.H);
                } else if (index == 7) {
                    this.I = obtainStyledAttributes.getResourceId(index, this.I);
                }
            }
            int i13 = this.D;
            int i14 = this.E;
            if (i13 == i14) {
                if (i13 > 0) {
                    this.D = i13 - 1;
                } else {
                    this.E = i14 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
