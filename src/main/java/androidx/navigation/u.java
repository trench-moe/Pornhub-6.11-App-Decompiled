package androidx.navigation;

import android.view.View;
import android.view.ViewParent;
import com.app.pornhub.R;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class u {
    public static NavController a(View view) {
        NavController navController;
        View view2 = view;
        while (true) {
            navController = null;
            if (view2 == null) {
                break;
            }
            Object tag = view2.getTag(R.id.nav_controller_view_tag);
            NavController navController2 = tag instanceof WeakReference ? (NavController) ((WeakReference) tag).get() : tag instanceof NavController ? (NavController) tag : null;
            if (navController2 != null) {
                navController = navController2;
                break;
            }
            ViewParent parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        if (navController != null) {
            return navController;
        }
        throw new IllegalStateException("View " + view + " does not have a NavController set");
    }
}
