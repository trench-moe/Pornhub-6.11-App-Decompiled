package m1;

import android.view.MenuItem;
import androidx.navigation.NavController;
import androidx.navigation.b;
import androidx.navigation.o;
import androidx.navigation.s;
import com.app.pornhub.R;

/* loaded from: classes2.dex */
public final class c {
    public static boolean a(MenuItem menuItem, NavController navController) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (navController.e().f2693f.o(menuItem.getItemId()) instanceof b.a) {
            i10 = R.anim.nav_default_enter_anim;
            i11 = R.anim.nav_default_exit_anim;
            i12 = R.anim.nav_default_pop_enter_anim;
            i13 = R.anim.nav_default_pop_exit_anim;
        } else {
            i10 = R.animator.nav_default_enter_anim;
            i11 = R.animator.nav_default_exit_anim;
            i12 = R.animator.nav_default_pop_enter_anim;
            i13 = R.animator.nav_default_pop_exit_anim;
        }
        if ((menuItem.getOrder() & 196608) == 0) {
            o oVar = navController.d;
            if (oVar == null) {
                throw new IllegalStateException("You must call setGraph() before calling getGraph()");
            }
            while (oVar instanceof o) {
                o oVar2 = oVar;
                oVar = oVar2.o(oVar2.f2703z);
            }
            i14 = oVar.f2694j;
        } else {
            i14 = -1;
        }
        try {
            navController.g(menuItem.getItemId(), null, new s(true, i14, false, i10, i11, i12, i13));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }
}
