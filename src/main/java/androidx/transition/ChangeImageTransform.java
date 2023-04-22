package androidx.transition;

import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import java.util.Map;
import u1.h;
import u1.q;

/* loaded from: classes.dex */
public class ChangeImageTransform extends Transition {
    public static final String[] P = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
    public static final TypeEvaluator<Matrix> Q = new a();
    public static final Property<ImageView, Matrix> R = new b(Matrix.class, "animatedTransform");

    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ Matrix evaluate(float f10, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends Property<ImageView, Matrix> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        public /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public void set(ImageView imageView, Matrix matrix) {
            ImageView imageView2 = imageView;
            Matrix matrix2 = matrix;
            if (Build.VERSION.SDK_INT >= 29) {
                imageView2.animateTransform(matrix2);
            } else if (matrix2 == null) {
                Drawable drawable = imageView2.getDrawable();
                if (drawable != null) {
                    drawable.setBounds(0, 0, (imageView2.getWidth() - imageView2.getPaddingLeft()) - imageView2.getPaddingRight(), (imageView2.getHeight() - imageView2.getPaddingTop()) - imageView2.getPaddingBottom());
                    imageView2.invalidate();
                }
            } else if (h.f15485a) {
                try {
                    imageView2.animateTransform(matrix2);
                } catch (NoSuchMethodError unused) {
                    h.f15485a = false;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3193a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f3193a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3193a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ChangeImageTransform() {
    }

    public ChangeImageTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void M(q qVar) {
        Matrix matrix;
        View view = qVar.f15501b;
        if (view instanceof ImageView) {
            if (view.getVisibility() != 0) {
                return;
            }
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = qVar.f15500a;
            map.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Drawable drawable = imageView.getDrawable();
            if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
                int i10 = c.f3193a[imageView.getScaleType().ordinal()];
                if (i10 == 1) {
                    Drawable drawable2 = imageView.getDrawable();
                    Matrix matrix2 = new Matrix();
                    matrix2.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    matrix = matrix2;
                } else if (i10 == 2) {
                    Drawable drawable3 = imageView.getDrawable();
                    int intrinsicWidth = drawable3.getIntrinsicWidth();
                    float width = imageView.getWidth();
                    float f10 = intrinsicWidth;
                    int intrinsicHeight = drawable3.getIntrinsicHeight();
                    float height = imageView.getHeight();
                    float f11 = intrinsicHeight;
                    float max = Math.max(width / f10, height / f11);
                    int round = Math.round((width - (f10 * max)) / 2.0f);
                    int round2 = Math.round((height - (f11 * max)) / 2.0f);
                    matrix = new Matrix();
                    matrix.postScale(max, max);
                    matrix.postTranslate(round, round2);
                }
                map.put("android:changeImageTransform:matrix", matrix);
            }
            matrix = new Matrix(imageView.getImageMatrix());
            map.put("android:changeImageTransform:matrix", matrix);
        }
    }

    @Override // androidx.transition.Transition
    public void d(q qVar) {
        M(qVar);
    }

    @Override // androidx.transition.Transition
    public void i(q qVar) {
        M(qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator n(android.view.ViewGroup r11, u1.q r12, u1.q r13) {
        /*
            Method dump skipped, instructions count: 180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeImageTransform.n(android.view.ViewGroup, u1.q, u1.q):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    public String[] u() {
        return P;
    }
}
