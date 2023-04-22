package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import t9.j0;

/* loaded from: classes.dex */
public class ReactiveGuide extends View implements b.a {

    /* renamed from: c  reason: collision with root package name */
    public int f1676c;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1677f;

    /* renamed from: j  reason: collision with root package name */
    public int f1678j;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1679m;

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1676c = -1;
        this.f1677f = false;
        this.f1678j = 0;
        this.f1679m = true;
        super.setVisibility(8);
        a(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1676c = -1;
        this.f1677f = false;
        this.f1678j = 0;
        this.f1679m = true;
        super.setVisibility(8);
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j0.B);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 3) {
                    this.f1676c = obtainStyledAttributes.getResourceId(index, this.f1676c);
                } else if (index == 0) {
                    this.f1677f = obtainStyledAttributes.getBoolean(index, this.f1677f);
                } else if (index == 2) {
                    this.f1678j = obtainStyledAttributes.getResourceId(index, this.f1678j);
                } else if (index == 1) {
                    this.f1679m = obtainStyledAttributes.getBoolean(index, this.f1679m);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f1676c != -1) {
            ConstraintLayout.getSharedValues().a(this.f1676c, this);
        }
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f1678j;
    }

    public int getAttributeId() {
        return this.f1676c;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z10) {
        this.f1677f = z10;
    }

    public void setApplyToConstraintSetId(int i10) {
        this.f1678j = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setAttributeId(int r10) {
        /*
            r9 = this;
            androidx.constraintlayout.widget.b r0 = androidx.constraintlayout.widget.ConstraintLayout.getSharedValues()
            int r1 = r9.f1676c
            r8 = 3
            r2 = -1
            if (r1 == r2) goto L44
            java.util.HashMap<java.lang.Integer, java.util.HashSet<java.lang.ref.WeakReference<androidx.constraintlayout.widget.b$a>>> r3 = r0.f1777a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r7 = r3.get(r1)
            r1 = r7
            java.util.HashSet r1 = (java.util.HashSet) r1
            if (r1 != 0) goto L1b
            r8 = 2
            goto L45
        L1b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r1.iterator()
        L24:
            boolean r7 = r4.hasNext()
            r5 = r7
            if (r5 == 0) goto L40
            java.lang.Object r5 = r4.next()
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            r8 = 5
            java.lang.Object r6 = r5.get()
            androidx.constraintlayout.widget.b$a r6 = (androidx.constraintlayout.widget.b.a) r6
            if (r6 == 0) goto L3c
            if (r6 != r9) goto L24
        L3c:
            r3.add(r5)
            goto L24
        L40:
            r8 = 6
            r1.removeAll(r3)
        L44:
            r8 = 6
        L45:
            r9.f1676c = r10
            if (r10 == r2) goto L4c
            r0.a(r10, r9)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ReactiveGuide.setAttributeId(int):void");
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f1616a = i10;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f1618b = i10;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f1620c = f10;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
