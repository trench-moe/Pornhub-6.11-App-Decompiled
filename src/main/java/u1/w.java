package u1;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes2.dex */
public class w extends v {
    public static boolean G = true;
    public static boolean H = true;
    public static boolean I = true;

    @Override // mb.a
    @SuppressLint({"NewApi"})
    public void e(View view, Matrix matrix) {
        if (G) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (NoSuchMethodError unused) {
                G = false;
            }
        }
    }

    @Override // mb.a
    @SuppressLint({"NewApi"})
    public void i(View view, Matrix matrix) {
        if (H) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                H = false;
            }
        }
    }

    @Override // mb.a
    @SuppressLint({"NewApi"})
    public void k(View view, Matrix matrix) {
        if (I) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                I = false;
            }
        }
    }
}
