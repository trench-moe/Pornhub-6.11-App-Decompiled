package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.util.HashMap;
import r.b;
import r.o;
import t9.j0;
import v.c;
import v.d;
import w.n;
import w.p;

/* loaded from: classes.dex */
public class MotionTelltales extends MockView {
    public Paint B;
    public MotionLayout C;
    public float[] D;
    public Matrix E;
    public int F;
    public int G;
    public float H;

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = new Paint();
        this.D = new float[2];
        this.E = new Matrix();
        this.F = 0;
        this.G = -65281;
        this.H = 0.25f;
        a(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.B = new Paint();
        this.D = new float[2];
        this.E = new Matrix();
        this.F = 0;
        this.G = -65281;
        this.H = 0.25f;
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.U);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.G = obtainStyledAttributes.getColor(index, this.G);
                } else if (index == 2) {
                    this.F = obtainStyledAttributes.getInt(index, this.F);
                } else if (index == 1) {
                    this.H = obtainStyledAttributes.getFloat(index, this.H);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.B.setColor(this.G);
        this.B.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        int i11;
        float f10;
        float[] fArr;
        int i12;
        int i13;
        float[] fArr2;
        int i14;
        d dVar;
        int i15;
        d dVar2;
        d dVar3;
        d dVar4;
        double[] dArr;
        int i16;
        float[] fArr3;
        float f11;
        o oVar;
        float f12;
        int i17;
        MotionTelltales motionTelltales = this;
        super.onDraw(canvas);
        getMatrix().invert(motionTelltales.E);
        if (motionTelltales.C == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                motionTelltales.C = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        int i18 = 5;
        float[] fArr4 = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        int i19 = 0;
        while (i19 < i18) {
            float f13 = fArr4[i19];
            int i20 = 0;
            while (i20 < i18) {
                float f14 = fArr4[i20];
                MotionLayout motionLayout = motionTelltales.C;
                float[] fArr5 = motionTelltales.D;
                int i21 = motionTelltales.F;
                float f15 = motionLayout.L;
                float f16 = motionLayout.W;
                if (motionLayout.J != null) {
                    float signum = Math.signum(motionLayout.f1376b0 - f16);
                    float interpolation = motionLayout.J.getInterpolation(motionLayout.W + 1.0E-5f);
                    float interpolation2 = motionLayout.J.getInterpolation(motionLayout.W);
                    f15 = (((interpolation - interpolation2) / 1.0E-5f) * signum) / motionLayout.U;
                    f16 = interpolation2;
                }
                Interpolator interpolator = motionLayout.J;
                if (interpolator instanceof w.o) {
                    f15 = ((w.o) interpolator).a();
                }
                float f17 = f15;
                n nVar = motionLayout.S.get(motionTelltales);
                if ((i21 & 1) == 0) {
                    int width2 = getWidth();
                    int height2 = getHeight();
                    float a10 = nVar.a(f16, nVar.f16345v);
                    HashMap<String, d> hashMap = nVar.y;
                    d dVar5 = hashMap == null ? null : hashMap.get("translationX");
                    HashMap<String, d> hashMap2 = nVar.y;
                    fArr = fArr4;
                    if (hashMap2 == null) {
                        i15 = i21;
                        dVar = null;
                    } else {
                        dVar = hashMap2.get("translationY");
                        i15 = i21;
                    }
                    HashMap<String, d> hashMap3 = nVar.y;
                    i12 = i19;
                    if (hashMap3 == null) {
                        i14 = i20;
                        dVar2 = null;
                    } else {
                        dVar2 = hashMap3.get("rotation");
                        i14 = i20;
                    }
                    HashMap<String, d> hashMap4 = nVar.y;
                    i11 = height;
                    if (hashMap4 == null) {
                        i10 = width;
                        dVar3 = null;
                    } else {
                        dVar3 = hashMap4.get("scaleX");
                        i10 = width;
                    }
                    HashMap<String, d> hashMap5 = nVar.y;
                    if (hashMap5 == null) {
                        f10 = f17;
                        dVar4 = null;
                    } else {
                        dVar4 = hashMap5.get("scaleY");
                        f10 = f17;
                    }
                    HashMap<String, c> hashMap6 = nVar.f16348z;
                    c cVar = hashMap6 == null ? null : hashMap6.get("translationX");
                    HashMap<String, c> hashMap7 = nVar.f16348z;
                    c cVar2 = hashMap7 == null ? null : hashMap7.get("translationY");
                    HashMap<String, c> hashMap8 = nVar.f16348z;
                    c cVar3 = hashMap8 == null ? null : hashMap8.get("rotation");
                    HashMap<String, c> hashMap9 = nVar.f16348z;
                    c cVar4 = hashMap9 == null ? null : hashMap9.get("scaleX");
                    HashMap<String, c> hashMap10 = nVar.f16348z;
                    c cVar5 = hashMap10 == null ? null : hashMap10.get("scaleY");
                    o oVar2 = new o();
                    oVar2.f14608e = 0.0f;
                    oVar2.d = 0.0f;
                    oVar2.f14607c = 0.0f;
                    oVar2.f14606b = 0.0f;
                    oVar2.f14605a = 0.0f;
                    oVar2.b(dVar2, a10);
                    oVar2.d(dVar5, dVar, a10);
                    oVar2.c(dVar3, dVar4, a10);
                    if (cVar3 != null) {
                        oVar2.f14608e = cVar3.b(a10);
                    }
                    if (cVar != null) {
                        oVar2.f14607c = cVar.b(a10);
                    }
                    if (cVar2 != null) {
                        oVar2.d = cVar2.b(a10);
                    }
                    if (cVar4 != null) {
                        oVar2.f14605a = cVar4.b(a10);
                    }
                    if (cVar5 != null) {
                        oVar2.f14606b = cVar5.b(a10);
                    }
                    b bVar = nVar.f16335k;
                    if (bVar != null) {
                        double[] dArr2 = nVar.f16339p;
                        if (dArr2.length > 0) {
                            double d = a10;
                            bVar.c(d, dArr2);
                            nVar.f16335k.f(d, nVar.f16340q);
                            oVar = oVar2;
                            i17 = i15;
                            fArr3 = fArr5;
                            f12 = f14;
                            nVar.f16330f.f(f14, f13, fArr5, nVar.f16338o, nVar.f16340q, nVar.f16339p);
                        } else {
                            oVar = oVar2;
                            f12 = f14;
                            fArr3 = fArr5;
                            i17 = i15;
                        }
                        oVar.a(f12, f13, width2, height2, fArr3);
                        i16 = i17;
                        f11 = f12;
                    } else if (nVar.f16334j != null) {
                        double a11 = nVar.a(a10, nVar.f16345v);
                        nVar.f16334j[0].f(a11, nVar.f16340q);
                        nVar.f16334j[0].c(a11, nVar.f16339p);
                        float f18 = nVar.f16345v[0];
                        int i22 = 0;
                        while (true) {
                            dArr = nVar.f16340q;
                            if (i22 >= dArr.length) {
                                break;
                            }
                            dArr[i22] = dArr[i22] * f18;
                            i22++;
                        }
                        i16 = i15;
                        fArr3 = fArr5;
                        f11 = f14;
                        nVar.f16330f.f(f14, f13, fArr5, nVar.f16338o, dArr, nVar.f16339p);
                        oVar2.a(f11, f13, width2, height2, fArr3);
                    } else {
                        p pVar = nVar.f16331g;
                        c cVar6 = cVar5;
                        float f19 = pVar.n;
                        p pVar2 = nVar.f16330f;
                        c cVar7 = cVar4;
                        float f20 = f19 - pVar2.n;
                        c cVar8 = cVar2;
                        float f21 = pVar.f16353t - pVar2.f16353t;
                        c cVar9 = cVar;
                        fArr5[0] = (((pVar.f16354u - pVar2.f16354u) + f20) * f14) + ((1.0f - f14) * f20);
                        fArr5[1] = (((pVar.f16355w - pVar2.f16355w) + f21) * f13) + ((1.0f - f13) * f21);
                        oVar2.f14608e = 0.0f;
                        oVar2.d = 0.0f;
                        oVar2.f14607c = 0.0f;
                        oVar2.f14606b = 0.0f;
                        oVar2.f14605a = 0.0f;
                        oVar2.b(dVar2, a10);
                        oVar2.d(dVar5, dVar, a10);
                        oVar2.c(dVar3, dVar4, a10);
                        if (cVar3 != null) {
                            oVar2.f14608e = cVar3.b(a10);
                        }
                        if (cVar9 != null) {
                            oVar2.f14607c = cVar9.b(a10);
                        }
                        if (cVar8 != null) {
                            oVar2.d = cVar8.b(a10);
                        }
                        if (cVar7 != null) {
                            oVar2.f14605a = cVar7.b(a10);
                        }
                        if (cVar6 != null) {
                            oVar2.f14606b = cVar6.b(a10);
                        }
                        i13 = i15;
                        fArr2 = fArr5;
                        oVar2.a(f14, f13, width2, height2, fArr5);
                    }
                    i13 = i16;
                    f14 = f11;
                    fArr2 = fArr3;
                } else {
                    i10 = width;
                    i11 = height;
                    f10 = f17;
                    fArr = fArr4;
                    i12 = i19;
                    i13 = i21;
                    fArr2 = fArr5;
                    i14 = i20;
                    nVar.c(f16, f14, f13, fArr2);
                }
                if (i13 < 2) {
                    fArr2[0] = fArr2[0] * f10;
                    fArr2[1] = fArr2[1] * f10;
                }
                motionTelltales = this;
                motionTelltales.E.mapVectors(motionTelltales.D);
                width = i10;
                float f22 = width * f14;
                height = i11;
                float f23 = height * f13;
                float[] fArr6 = motionTelltales.D;
                float f24 = fArr6[0];
                float f25 = motionTelltales.H;
                float f26 = f23 - (fArr6[1] * f25);
                motionTelltales.E.mapVectors(fArr6);
                canvas.drawLine(f22, f23, f22 - (f24 * f25), f26, motionTelltales.B);
                i20 = i14 + 1;
                fArr4 = fArr;
                i19 = i12;
                i18 = 5;
            }
            i19++;
            i18 = 5;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f1553t = charSequence.toString();
        requestLayout();
    }
}
