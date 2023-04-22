package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public class t0 {
    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
            return;
        }
        u0 u0Var = u0.f1105z;
        if (u0Var != null && u0Var.f1106c == view) {
            u0.c(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new u0(view, charSequence);
            return;
        }
        u0 u0Var2 = u0.A;
        if (u0Var2 != null && u0Var2.f1106c == view) {
            u0Var2.b();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
