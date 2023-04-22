package u1;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes2.dex */
public class x extends w {
    public static boolean J = true;

    @Override // mb.a
    @SuppressLint({"NewApi"})
    public void f(View view, int i10, int i11, int i12, int i13) {
        if (J) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                J = false;
            }
        }
    }
}
