package androidx.constraintlayout.helper.widget;

import a1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;
import t9.j0;

/* loaded from: classes.dex */
public class CircularFlow extends VirtualLayout {
    public static int K;
    public static float L;
    public ConstraintLayout A;
    public int B;
    public float[] C;
    public int[] D;
    public int E;
    public int F;
    public String G;
    public String H;
    public Float I;
    public Integer J;

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    private void setAngles(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.F = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                v(str.substring(i10).trim());
                return;
            } else {
                v(str.substring(i10, indexOf).trim());
                i10 = indexOf + 1;
            }
        }
    }

    private void setRadius(String str) {
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.E = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                w(str.substring(i10).trim());
                return;
            } else {
                w(str.substring(i10, indexOf).trim());
                i10 = indexOf + 1;
            }
        }
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.C, this.F);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.D, this.E);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j0.A);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 33) {
                    this.B = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == 29) {
                    String string = obtainStyledAttributes.getString(index);
                    this.G = string;
                    setAngles(string);
                } else if (index == 32) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.H = string2;
                    setRadius(string2);
                } else if (index == 30) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, L));
                    this.I = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == 31) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, K));
                    this.J = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.G;
        if (str != null) {
            this.C = new float[1];
            setAngles(str);
        }
        String str2 = this.H;
        if (str2 != null) {
            this.D = new int[1];
            setRadius(str2);
        }
        Float f10 = this.I;
        if (f10 != null) {
            setDefaultAngle(f10.floatValue());
        }
        Integer num = this.J;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        this.A = (ConstraintLayout) getParent();
        for (int i10 = 0; i10 < this.f1602f; i10++) {
            View i11 = this.A.i(this.f1601c[i10]);
            if (i11 != null) {
                int i12 = K;
                float f11 = L;
                int[] iArr = this.D;
                if (iArr == null || i10 >= iArr.length) {
                    Integer num2 = this.J;
                    if (num2 == null || num2.intValue() == -1) {
                        StringBuilder m10 = a.m("Added radius to view with id: ");
                        m10.append(this.f1607w.get(Integer.valueOf(i11.getId())));
                        Log.e("CircularFlow", m10.toString());
                    } else {
                        this.E++;
                        if (this.D == null) {
                            this.D = new int[1];
                        }
                        int[] radius = getRadius();
                        this.D = radius;
                        radius[this.E - 1] = i12;
                    }
                } else {
                    i12 = iArr[i10];
                }
                float[] fArr = this.C;
                if (fArr == null || i10 >= fArr.length) {
                    Float f12 = this.I;
                    if (f12 == null || f12.floatValue() == -1.0f) {
                        StringBuilder m11 = a.m("Added angle to view with id: ");
                        m11.append(this.f1607w.get(Integer.valueOf(i11.getId())));
                        Log.e("CircularFlow", m11.toString());
                    } else {
                        this.F++;
                        if (this.C == null) {
                            this.C = new float[1];
                        }
                        float[] angles = getAngles();
                        this.C = angles;
                        angles[this.F - 1] = f11;
                    }
                } else {
                    f11 = fArr[i10];
                }
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) i11.getLayoutParams();
                layoutParams.f1648r = f11;
                layoutParams.f1644p = this.B;
                layoutParams.f1646q = i12;
                i11.setLayoutParams(layoutParams);
            }
        }
        h();
    }

    public void setDefaultAngle(float f10) {
        L = f10;
    }

    public void setDefaultRadius(int i10) {
        K = i10;
    }

    public final void v(String str) {
        float[] fArr;
        if (str == null || str.length() == 0 || this.f1603j == null || (fArr = this.C) == null) {
            return;
        }
        if (this.F + 1 > fArr.length) {
            this.C = Arrays.copyOf(fArr, fArr.length + 1);
        }
        this.C[this.F] = Integer.parseInt(str);
        this.F++;
    }

    public final void w(String str) {
        int[] iArr;
        if (str != null) {
            if (str.length() != 0 && this.f1603j != null && (iArr = this.D) != null) {
                if (this.E + 1 > iArr.length) {
                    this.D = Arrays.copyOf(iArr, iArr.length + 1);
                }
                this.D[this.E] = (int) (Integer.parseInt(str) * this.f1603j.getResources().getDisplayMetrics().density);
                this.E++;
            }
        }
    }
}
