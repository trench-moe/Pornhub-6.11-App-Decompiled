package m1;

import android.view.MenuItem;
import androidx.navigation.NavController;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* loaded from: classes2.dex */
public class a implements BottomNavigationView.b {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ NavController f12861c;

    public a(NavController navController) {
        this.f12861c = navController;
    }

    @Override // wa.f.c
    public boolean a(MenuItem menuItem) {
        return c.a(menuItem, this.f12861c);
    }
}
