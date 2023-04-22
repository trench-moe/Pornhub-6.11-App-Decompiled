package g4;

import androidx.appcompat.widget.SearchView;
import com.app.pornhub.domain.config.SearchSuggestionsConfig;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.appsflyer.oaid.BuildConfig;
import java.util.Objects;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class r implements SearchView.l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeActivity f9755a;

    public r(HomeActivity homeActivity) {
        this.f9755a = homeActivity;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
        if (r0.intValue() != com.app.pornhub.R.id.discoverFragment) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0090, code lost:
        r0 = com.app.pornhub.domain.config.SearchSuggestionsConfig.SearchSource.Videos.INSTANCE;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    @Override // androidx.appcompat.widget.SearchView.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean a(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.r.a(java.lang.String):boolean");
    }

    @Override // androidx.appcompat.widget.SearchView.l
    public boolean b(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        String query2 = StringsKt.trim((CharSequence) query).toString();
        if (query2.length() >= 3) {
            SearchView searchView = this.f9755a.T;
            if (searchView != null) {
                searchView.clearFocus();
            }
            HomeActivityViewModel homeActivityViewModel = this.f9755a.M;
            if (homeActivityViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                homeActivityViewModel = null;
            }
            SearchView searchView2 = this.f9755a.T;
            boolean areEqual = Intrinsics.areEqual(searchView2 == null ? null : searchView2.getTag(), "searchSuggestionClick");
            Objects.requireNonNull(homeActivityViewModel);
            Intrinsics.checkNotNullParameter(query2, "query");
            homeActivityViewModel.f5017p.onNext(TuplesKt.to(BuildConfig.FLAVOR, SearchSuggestionsConfig.SearchSource.Videos.INSTANCE));
            homeActivityViewModel.f5013k.l(new z3.a<>(new HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted(query2, areEqual)));
            SearchView searchView3 = this.f9755a.T;
            if (searchView3 != null) {
                searchView3.setTag(null);
            }
        }
        return true;
    }
}
