package v;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class d extends r.i {

    /* loaded from: classes2.dex */
    public static class a extends d {
        @Override // v.d
        public void d(View view, float f10) {
            view.setAlpha((float) this.f14572a.b(f10, 0));
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends d {

        /* renamed from: f  reason: collision with root package name */
        public SparseArray<ConstraintAttribute> f15905f;

        /* renamed from: g  reason: collision with root package name */
        public float[] f15906g;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            String str2 = str.split(",")[1];
            this.f15905f = sparseArray;
        }

        @Override // r.i
        public void b(int i10, float f10) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        @Override // r.i
        public void c(int i10) {
            float[] fArr;
            int size = this.f15905f.size();
            int d = this.f15905f.valueAt(0).d();
            double[] dArr = new double[size];
            this.f15906g = new float[d];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, d);
            for (int i11 = 0; i11 < size; i11++) {
                dArr[i11] = this.f15905f.keyAt(i11) * 0.01d;
                this.f15905f.valueAt(i11).b(this.f15906g);
                int i12 = 0;
                while (true) {
                    if (i12 < this.f15906g.length) {
                        dArr2[i11][i12] = fArr[i12];
                        i12++;
                    }
                }
            }
            this.f14572a = r.b.a(i10, dArr, dArr2);
        }

        @Override // v.d
        public void d(View view, float f10) {
            this.f14572a.d(f10, this.f15906g);
            v.a.b(this.f15905f.valueAt(0), view, this.f15906g);
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends d {
        @Override // v.d
        public void d(View view, float f10) {
            view.setElevation((float) this.f14572a.b(f10, 0));
        }
    }

    /* renamed from: v.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0276d extends d {
        @Override // v.d
        public void d(View view, float f10) {
        }
    }

    /* loaded from: classes2.dex */
    public static class e extends d {
        @Override // v.d
        public void d(View view, float f10) {
            view.setPivotX((float) this.f14572a.b(f10, 0));
        }
    }

    /* loaded from: classes2.dex */
    public static class f extends d {
        @Override // v.d
        public void d(View view, float f10) {
            view.setPivotY((float) this.f14572a.b(f10, 0));
        }
    }

    /* loaded from: classes2.dex */
    public static class g extends d {

        /* renamed from: f  reason: collision with root package name */
        public boolean f15907f = false;

        @Override // v.d
        public void d(View view, float f10) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress((float) this.f14572a.b(f10, 0));
            } else if (this.f15907f) {
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f15907f = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf((float) this.f14572a.b(f10, 0)));
                    } catch (IllegalAccessException e10) {
                        Log.e("ViewSpline", "unable to setProgress", e10);
                    } catch (InvocationTargetException e11) {
                        Log.e("ViewSpline", "unable to setProgress", e11);
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class h extends d {
        @Override // v.d
        public void d(View view, float f10) {
            view.setRotation((float) this.f14572a.b(f10, 0));
        }
    }

    /* loaded from: classes2.dex */
    public static class i extends d {
        @Override // v.d
        public void d(View view, float f10) {
            view.setRotationX((float) this.f14572a.b(f10, 0));
        }
    }

    /* loaded from: classes2.dex */
    public static class j extends d {
        @Override // v.d
        public void d(View view, float f10) {
            view.setRotationY((float) this.f14572a.b(f10, 0));
        }
    }

    /* loaded from: classes2.dex */
    public static class k extends d {
        @Override // v.d
        public void d(View view, float f10) {
            view.setScaleX((float) this.f14572a.b(f10, 0));
        }
    }

    /* loaded from: classes2.dex */
    public static class l extends d {
        @Override // v.d
        public void d(View view, float f10) {
            view.setScaleY((float) this.f14572a.b(f10, 0));
        }
    }

    /* loaded from: classes2.dex */
    public static class m extends d {
        @Override // v.d
        public void d(View view, float f10) {
            view.setTranslationX((float) this.f14572a.b(f10, 0));
        }
    }

    /* loaded from: classes2.dex */
    public static class n extends d {
        @Override // v.d
        public void d(View view, float f10) {
            view.setTranslationY((float) this.f14572a.b(f10, 0));
        }
    }

    /* loaded from: classes2.dex */
    public static class o extends d {
        @Override // v.d
        public void d(View view, float f10) {
            view.setTranslationZ((float) this.f14572a.b(f10, 0));
        }
    }

    public abstract void d(View view, float f10);
}
