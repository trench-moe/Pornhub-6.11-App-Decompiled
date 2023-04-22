package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.os.Build;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f3262a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f3263b;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f3264c;

    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<Matrix> {

        /* renamed from: a  reason: collision with root package name */
        public final float[] f3265a = new float[9];

        /* renamed from: b  reason: collision with root package name */
        public final float[] f3266b = new float[9];

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f3267c = new Matrix();

        @Override // android.animation.TypeEvaluator
        public Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.f3265a);
            matrix2.getValues(this.f3266b);
            for (int i10 = 0; i10 < 9; i10++) {
                float[] fArr = this.f3266b;
                float f11 = fArr[i10];
                float[] fArr2 = this.f3265a;
                fArr[i10] = ((f11 - fArr2[i10]) * f10) + fArr2[i10];
            }
            this.f3267c.setValues(this.f3266b);
            return this.f3267c;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f3262a = true;
        f3263b = true;
        f3264c = i10 >= 28;
    }

    public static Animator a(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
