package u1;

import android.annotation.SuppressLint;
import android.view.View;

/* loaded from: classes2.dex */
public class v extends mb.a {
    public static boolean F = true;

    @Override // mb.a
    public void b(View view) {
    }

    @Override // mb.a
    @SuppressLint({"NewApi"})
    public float c(View view) {
        if (F) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                F = false;
            }
        }
        return view.getAlpha();
    }

    @Override // mb.a
    public void d(View view) {
    }

    @Override // mb.a
    @SuppressLint({"NewApi"})
    public void g(View view, float f10) {
        if (F) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                F = false;
            }
        }
        view.setAlpha(f10);
    }
}
