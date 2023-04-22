package m1;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.navigation.NavController;
import androidx.navigation.m;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public class b implements NavController.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ WeakReference f12862a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ NavController f12863b;

    public b(WeakReference weakReference, NavController navController) {
        this.f12862a = weakReference;
        this.f12863b = navController;
    }

    @Override // androidx.navigation.NavController.b
    public void a(NavController navController, m mVar, Bundle bundle) {
        int i10;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) this.f12862a.get();
        if (bottomNavigationView == null) {
            this.f12863b.f2634l.remove(this);
            return;
        }
        Menu menu = bottomNavigationView.getMenu();
        int size = menu.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item = menu.getItem(i11);
            int itemId = item.getItemId();
            m mVar2 = mVar;
            do {
                i10 = mVar2.f2694j;
                if (i10 == itemId) {
                    break;
                }
                mVar2 = mVar2.f2693f;
            } while (mVar2 != null);
            if (i10 == itemId) {
                item.setChecked(true);
            }
        }
    }
}
