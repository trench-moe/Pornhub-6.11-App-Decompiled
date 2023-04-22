package v;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import e.p;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import r.n;

/* loaded from: classes2.dex */
public abstract class e extends n {

    /* loaded from: classes2.dex */
    public static class a extends e {
        @Override // v.e
        public boolean e(View view, float f10, long j10, p pVar) {
            view.setAlpha(d(f10, j10, view, pVar));
            return this.f14602h;
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends e {

        /* renamed from: k  reason: collision with root package name */
        public String f15908k;

        /* renamed from: l  reason: collision with root package name */
        public SparseArray<ConstraintAttribute> f15909l;

        /* renamed from: m  reason: collision with root package name */
        public SparseArray<float[]> f15910m = new SparseArray<>();
        public float[] n;

        /* renamed from: o  reason: collision with root package name */
        public float[] f15911o;

        public b(String str, SparseArray<ConstraintAttribute> sparseArray) {
            this.f15908k = str.split(",")[1];
            this.f15909l = sparseArray;
        }

        @Override // r.n
        public void b(int i10, float f10, float f11, int i11, float f12) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }

        @Override // r.n
        public void c(int i10) {
            int size = this.f15909l.size();
            int d = this.f15909l.valueAt(0).d();
            double[] dArr = new double[size];
            int i11 = d + 2;
            this.n = new float[i11];
            this.f15911o = new float[d];
            double[][] dArr2 = (double[][]) Array.newInstance(double.class, size, i11);
            for (int i12 = 0; i12 < size; i12++) {
                int keyAt = this.f15909l.keyAt(i12);
                float[] valueAt = this.f15910m.valueAt(i12);
                dArr[i12] = keyAt * 0.01d;
                this.f15909l.valueAt(i12).b(this.n);
                int i13 = 0;
                while (true) {
                    float[] fArr = this.n;
                    if (i13 < fArr.length) {
                        dArr2[i12][i13] = fArr[i13];
                        i13++;
                    }
                }
                dArr2[i12][d] = valueAt[0];
                dArr2[i12][d + 1] = valueAt[1];
            }
            this.f14596a = r.b.a(i10, dArr, dArr2);
        }

        @Override // v.e
        public boolean e(View view, float f10, long j10, p pVar) {
            this.f14596a.d(f10, this.n);
            float[] fArr = this.n;
            float f11 = fArr[fArr.length - 2];
            float f12 = fArr[fArr.length - 1];
            long j11 = j10 - this.f14603i;
            if (Float.isNaN(this.f14604j)) {
                float b10 = pVar.b(view, this.f15908k, 0);
                this.f14604j = b10;
                if (Float.isNaN(b10)) {
                    this.f14604j = 0.0f;
                }
            }
            float f13 = (float) ((((j11 * 1.0E-9d) * f11) + this.f14604j) % 1.0d);
            this.f14604j = f13;
            this.f14603i = j10;
            float a10 = a(f13);
            this.f14602h = false;
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.f15911o;
                if (i10 >= fArr2.length) {
                    break;
                }
                boolean z10 = this.f14602h;
                float[] fArr3 = this.n;
                this.f14602h = z10 | (((double) fArr3[i10]) != 0.0d);
                fArr2[i10] = (fArr3[i10] * a10) + f12;
                i10++;
            }
            v.a.b(this.f15909l.valueAt(0), view, this.f15911o);
            if (f11 != 0.0f) {
                this.f14602h = true;
            }
            return this.f14602h;
        }
    }

    /* loaded from: classes2.dex */
    public static class c extends e {
        @Override // v.e
        public boolean e(View view, float f10, long j10, p pVar) {
            view.setElevation(d(f10, j10, view, pVar));
            return this.f14602h;
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends e {
        @Override // v.e
        public boolean e(View view, float f10, long j10, p pVar) {
            return this.f14602h;
        }
    }

    /* renamed from: v.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0277e extends e {

        /* renamed from: k  reason: collision with root package name */
        public boolean f15912k = false;

        @Override // v.e
        public boolean e(View view, float f10, long j10, p pVar) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(d(f10, j10, view, pVar));
            } else if (this.f15912k) {
                return false;
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f15912k = true;
                }
                Method method2 = method;
                if (method2 != null) {
                    try {
                        method2.invoke(view, Float.valueOf(d(f10, j10, view, pVar)));
                    } catch (IllegalAccessException e10) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e10);
                    } catch (InvocationTargetException e11) {
                        Log.e("ViewTimeCycle", "unable to setProgress", e11);
                    }
                }
            }
            return this.f14602h;
        }
    }

    /* loaded from: classes2.dex */
    public static class f extends e {
        @Override // v.e
        public boolean e(View view, float f10, long j10, p pVar) {
            view.setRotation(d(f10, j10, view, pVar));
            return this.f14602h;
        }
    }

    /* loaded from: classes2.dex */
    public static class g extends e {
        @Override // v.e
        public boolean e(View view, float f10, long j10, p pVar) {
            view.setRotationX(d(f10, j10, view, pVar));
            return this.f14602h;
        }
    }

    /* loaded from: classes2.dex */
    public static class h extends e {
        @Override // v.e
        public boolean e(View view, float f10, long j10, p pVar) {
            view.setRotationY(d(f10, j10, view, pVar));
            return this.f14602h;
        }
    }

    /* loaded from: classes2.dex */
    public static class i extends e {
        @Override // v.e
        public boolean e(View view, float f10, long j10, p pVar) {
            view.setScaleX(d(f10, j10, view, pVar));
            return this.f14602h;
        }
    }

    /* loaded from: classes2.dex */
    public static class j extends e {
        @Override // v.e
        public boolean e(View view, float f10, long j10, p pVar) {
            view.setScaleY(d(f10, j10, view, pVar));
            return this.f14602h;
        }
    }

    /* loaded from: classes2.dex */
    public static class k extends e {
        @Override // v.e
        public boolean e(View view, float f10, long j10, p pVar) {
            view.setTranslationX(d(f10, j10, view, pVar));
            return this.f14602h;
        }
    }

    /* loaded from: classes2.dex */
    public static class l extends e {
        @Override // v.e
        public boolean e(View view, float f10, long j10, p pVar) {
            view.setTranslationY(d(f10, j10, view, pVar));
            return this.f14602h;
        }
    }

    /* loaded from: classes2.dex */
    public static class m extends e {
        @Override // v.e
        public boolean e(View view, float f10, long j10, p pVar) {
            view.setTranslationZ(d(f10, j10, view, pVar));
            return this.f14602h;
        }
    }

    public float d(float f10, long j10, View view, p pVar) {
        this.f14596a.d(f10, this.f14601g);
        float[] fArr = this.f14601g;
        boolean z10 = true;
        float f11 = fArr[1];
        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i10 == 0) {
            this.f14602h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.f14604j)) {
            float b10 = pVar.b(view, this.f14600f, 0);
            this.f14604j = b10;
            if (Float.isNaN(b10)) {
                this.f14604j = 0.0f;
            }
        }
        float f12 = (float) (((((j10 - this.f14603i) * 1.0E-9d) * f11) + this.f14604j) % 1.0d);
        this.f14604j = f12;
        String str = this.f14600f;
        if (((HashMap) pVar.f8949c).containsKey(view)) {
            HashMap hashMap = (HashMap) ((HashMap) pVar.f8949c).get(view);
            if (hashMap == null) {
                hashMap = new HashMap();
            }
            if (hashMap.containsKey(str)) {
                float[] fArr2 = (float[]) hashMap.get(str);
                if (fArr2 == null) {
                    fArr2 = new float[0];
                }
                if (fArr2.length <= 0) {
                    fArr2 = Arrays.copyOf(fArr2, 1);
                }
                fArr2[0] = f12;
                hashMap.put(str, fArr2);
            } else {
                hashMap.put(str, new float[]{f12});
                ((HashMap) pVar.f8949c).put(view, hashMap);
            }
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(str, new float[]{f12});
            ((HashMap) pVar.f8949c).put(view, hashMap2);
        }
        this.f14603i = j10;
        float f13 = this.f14601g[0];
        float a10 = (a(this.f14604j) * f13) + this.f14601g[2];
        if (f13 == 0.0f && i10 == 0) {
            z10 = false;
        }
        this.f14602h = z10;
        return a10;
    }

    public abstract boolean e(View view, float f10, long j10, p pVar);
}
