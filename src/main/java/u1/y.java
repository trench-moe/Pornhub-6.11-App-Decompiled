package u1;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;

/* loaded from: classes2.dex */
public class y extends x {
    public static boolean K = true;

    @Override // mb.a
    @SuppressLint({"NewApi"})
    public void h(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.h(view, i10);
        } else if (K) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                K = false;
            }
        }
    }
}
