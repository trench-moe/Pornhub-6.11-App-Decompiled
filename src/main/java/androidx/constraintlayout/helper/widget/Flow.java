package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.a;
import s.b;
import t9.j0;

/* loaded from: classes.dex */
public class Flow extends VirtualLayout {
    public e A;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        this.A = new e();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j0.A);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.A.f1346s1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    e eVar = this.A;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar.P0 = dimensionPixelSize;
                    eVar.Q0 = dimensionPixelSize;
                    eVar.R0 = dimensionPixelSize;
                    eVar.S0 = dimensionPixelSize;
                } else if (index == 18) {
                    e eVar2 = this.A;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar2.R0 = dimensionPixelSize2;
                    eVar2.T0 = dimensionPixelSize2;
                    eVar2.U0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.A.S0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.A.T0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.A.P0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.A.U0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.A.Q0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.A.f1345q1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.A.f1333a1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.A.b1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.A.f1334c1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.A.f1336e1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.A.f1335d1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.A.f1337f1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.A.f1338g1 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.A.i1 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.A.f1341k1 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.A.f1340j1 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.A.l1 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.A.f1339h1 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.A.f1344o1 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.A.p1 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.A.f1342m1 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.A.f1343n1 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.A.r1 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1604m = this.A;
        t();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void o(a.C0022a c0022a, b bVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        super.o(c0022a, bVar, layoutParams, sparseArray);
        if (bVar instanceof e) {
            e eVar = (e) bVar;
            int i10 = layoutParams.V;
            if (i10 != -1) {
                eVar.f1346s1 = i10;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    @SuppressLint({"WrongCall"})
    public void onMeasure(int i10, int i11) {
        u(this.A, i10, i11);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public void p(ConstraintWidget constraintWidget, boolean z10) {
        e eVar = this.A;
        int i10 = eVar.R0;
        if (i10 <= 0) {
            if (eVar.S0 > 0) {
            }
        }
        if (z10) {
            eVar.T0 = eVar.S0;
            eVar.U0 = i10;
            return;
        }
        eVar.T0 = i10;
        eVar.U0 = eVar.S0;
    }

    public void setFirstHorizontalBias(float f10) {
        this.A.i1 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.A.f1334c1 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.A.f1340j1 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.A.f1335d1 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.A.f1344o1 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.A.f1338g1 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.A.f1342m1 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.A.f1333a1 = i10;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.A.f1341k1 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.A.f1336e1 = i10;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.A.l1 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.A.f1337f1 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.A.r1 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.A.f1346s1 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        e eVar = this.A;
        eVar.P0 = i10;
        eVar.Q0 = i10;
        eVar.R0 = i10;
        eVar.S0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.A.Q0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.A.T0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.A.U0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.A.P0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.A.p1 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.A.f1339h1 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.A.f1343n1 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.A.b1 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.A.f1345q1 = i10;
        requestLayout();
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout
    public void u(i iVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (iVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        iVar.d0(mode, size, mode2, size2);
        setMeasuredDimension(iVar.W0, iVar.X0);
    }
}
