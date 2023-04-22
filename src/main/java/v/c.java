package v;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public abstract class c extends r.d {

    /* loaded from: classes2.dex */
    public static class a extends c {
        @Override // v.c
        public void e(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    /* loaded from: classes2.dex */
    public static class b extends c {

        /* renamed from: g  reason: collision with root package name */
        public float[] f15902g = new float[1];

        /* renamed from: h  reason: collision with root package name */
        public ConstraintAttribute f15903h;

        @Override // r.d
        public void c(Object obj) {
            this.f15903h = (ConstraintAttribute) obj;
        }

        @Override // v.c
        public void e(View view, float f10) {
            this.f15902g[0] = a(f10);
            v.a.b(this.f15903h, view, this.f15902g);
        }
    }

    /* renamed from: v.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0275c extends c {
        @Override // v.c
        public void e(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    /* loaded from: classes2.dex */
    public static class d extends c {
        @Override // v.c
        public void e(View view, float f10) {
        }
    }

    /* loaded from: classes2.dex */
    public static class e extends c {

        /* renamed from: g  reason: collision with root package name */
        public boolean f15904g = false;

        @Override // v.c
        public void e(View view, float f10) {
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
            } else if (this.f15904g) {
            } else {
                Method method = null;
                try {
                    method = view.getClass().getMethod("setProgress", Float.TYPE);
                } catch (NoSuchMethodException unused) {
                    this.f15904g = true;
                }
                if (method != null) {
                    try {
                        method.invoke(view, Float.valueOf(a(f10)));
                    } catch (IllegalAccessException e10) {
                        Log.e("ViewOscillator", "unable to setProgress", e10);
                    } catch (InvocationTargetException e11) {
                        Log.e("ViewOscillator", "unable to setProgress", e11);
                    }
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class f extends c {
        @Override // v.c
        public void e(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    /* loaded from: classes2.dex */
    public static class g extends c {
        @Override // v.c
        public void e(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    /* loaded from: classes2.dex */
    public static class h extends c {
        @Override // v.c
        public void e(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    /* loaded from: classes2.dex */
    public static class i extends c {
        @Override // v.c
        public void e(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    /* loaded from: classes2.dex */
    public static class j extends c {
        @Override // v.c
        public void e(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    /* loaded from: classes2.dex */
    public static class k extends c {
        @Override // v.c
        public void e(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    /* loaded from: classes2.dex */
    public static class l extends c {
        @Override // v.c
        public void e(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    /* loaded from: classes2.dex */
    public static class m extends c {
        @Override // v.c
        public void e(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public abstract void e(View view, float f10);
}
