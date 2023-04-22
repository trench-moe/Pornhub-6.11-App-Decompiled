package g4;

import android.view.MenuItem;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.appsflyer.oaid.BuildConfig;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q implements MenuItem.OnActionExpandListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeActivity f9754a;

    public q(HomeActivity homeActivity) {
        this.f9754a = homeActivity;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        HomeActivity homeActivity = this.f9754a;
        int i10 = HomeActivity.f4998a0;
        if (!homeActivity.L()) {
            this.f9754a.O();
        }
        HomeActivityViewModel homeActivityViewModel = this.f9754a.M;
        if (homeActivityViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeActivityViewModel = null;
        }
        homeActivityViewModel.f5017p.onNext(TuplesKt.to(BuildConfig.FLAVOR, SearchSuggestionsConfig.SearchSource.Videos.INSTANCE));
        homeActivityViewModel.f5013k.l(new z3.a<>(HomeActivityViewModel.FragmentStateEvent.b.f5029a));
        HomeActivity homeActivity2 = this.f9754a;
        MenuItem menuItem2 = homeActivity2.R;
        if (menuItem2 != null) {
            menuItem2.setVisible(homeActivity2.Q);
        }
        MenuItem menuItem3 = this.f9754a.U;
        if (menuItem3 != null) {
            menuItem3.setVisible(true);
        }
        return true;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        HomeActivity homeActivity = this.f9754a;
        int i10 = HomeActivity.f4998a0;
        if (!homeActivity.L()) {
            this.f9754a.O();
        }
        MenuItem menuItem2 = this.f9754a.R;
        if (menuItem2 != null) {
            menuItem2.setVisible(false);
        }
        MenuItem menuItem3 = this.f9754a.U;
        if (menuItem3 != null) {
            menuItem3.setVisible(false);
        }
        return true;
    }
}
