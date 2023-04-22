package wa;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.view.ViewTreeObserver;
import com.google.android.material.navigation.NavigationView;

/* loaded from: classes2.dex */
public class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ NavigationView f17431c;

    public g(NavigationView navigationView) {
        this.f17431c = navigationView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        Activity activity;
        NavigationView navigationView = this.f17431c;
        navigationView.getLocationOnScreen(navigationView.f7578z);
        NavigationView navigationView2 = this.f17431c;
        boolean z10 = true;
        boolean z11 = navigationView2.f7578z[1] == 0;
        ua.c cVar = navigationView2.f7576u;
        if (cVar.K != z11) {
            cVar.K = z11;
            cVar.l();
        }
        NavigationView navigationView3 = this.f17431c;
        navigationView3.setDrawTopInsetForeground(z11 && navigationView3.C);
        Context context = this.f17431c.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            boolean z12 = activity.findViewById(16908290).getHeight() == this.f17431c.getHeight();
            boolean z13 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
            NavigationView navigationView4 = this.f17431c;
            if (!z12 || !z13 || !navigationView4.D) {
                z10 = false;
            }
            navigationView4.setDrawBottomInsetForeground(z10);
        }
    }
}
