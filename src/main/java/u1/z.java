package u1;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes2.dex */
public class z extends y {
    @Override // u1.v, mb.a
    public float c(View view) {
        return view.getTransitionAlpha();
    }

    @Override // u1.w, mb.a
    public void e(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    @Override // u1.x, mb.a
    public void f(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // u1.v, mb.a
    public void g(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // u1.y, mb.a
    public void h(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // u1.w, mb.a
    public void i(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // u1.w, mb.a
    public void k(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
