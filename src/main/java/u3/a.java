package u3;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.app.pornhub.NavHomeDirections;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.model.explore.ExploreOptions;
import com.app.pornhub.domain.model.performer.PerformerAdditionalFilter;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.browser.PremiumRegistrationActivity;
import com.app.pornhub.view.channeldetails.ChannelActivity;
import com.app.pornhub.view.gifdetails.GifDetailsActivity;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.account.AccountFragment;
import com.app.pornhub.view.home.categories.CategoriesFragment;
import com.app.pornhub.view.home.categories.CategoryAdapter;
import com.app.pornhub.view.home.discover.DiscoverFragment;
import com.app.pornhub.view.home.discover.DiscoverViewModel;
import com.app.pornhub.view.home.explore.adapter.ExploreCategoryAdapter;
import com.app.pornhub.view.home.explore.adapter.ExploreGifAdapter;
import com.app.pornhub.view.home.pornstars.PerformersFilterFragment;
import com.app.pornhub.view.launch.AccountExpiredActivity;
import com.app.pornhub.view.login.LoginActivity;
import com.app.pornhub.view.login.LoginFragment;
import com.app.pornhub.view.login.LoginViewModel;
import com.app.pornhub.view.login.SignupActivity;
import com.app.pornhub.view.offline.OfflineVideoPlayerActivity;
import com.app.pornhub.view.offline.PopupSource;
import com.app.pornhub.view.videodetails.LockedPayVideoActivity;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.slider.RangeSlider;
import f3.r;
import f4.i;
import f4.n;
import h4.j;
import i8.e;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import t3.g;
import x2.i1;
import x2.z;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f15514c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f15515f;

    public /* synthetic */ a(Object obj, int i10) {
        this.f15514c = i10;
        this.f15515f = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HomeActivityViewModel homeActivityViewModel = null;
        DiscoverViewModel discoverViewModel = null;
        switch (this.f15514c) {
            case 0:
                d dVar = (d) this.f15515f;
                int i10 = d.J0;
                dVar.I0(PremiumRegistrationActivity.B(dVar.q(), dVar.I(R.string.get_pornhub_premium), dVar.E0.o()));
                dVar.L0(false, false);
                g.k(dVar.q(), "ads_interstitial");
                if (dVar.H0 != null) {
                    Context q10 = dVar.q();
                    Long valueOf = Long.valueOf(dVar.H0.getAdId());
                    Integer valueOf2 = Integer.valueOf(dVar.H0.getMemberId());
                    Long valueOf3 = Long.valueOf(dVar.H0.getCampaignId());
                    String adUrl = dVar.H0.getLink();
                    Intrinsics.checkNotNullParameter(adUrl, "adUrl");
                    if (q10 == null) {
                        return;
                    }
                    g.g(q10, "phapp_ad_remove_ads", true, valueOf, valueOf2, valueOf3, adUrl);
                    return;
                }
                return;
            case 1:
                ChannelActivity channelActivity = (ChannelActivity) this.f15515f;
                if (channelActivity.M.f4361b.f4830g.getVisibility() == 0) {
                    ((AppBarLayout.LayoutParams) channelActivity.M.f4362c.getLayoutParams()).f7112a = 19;
                    channelActivity.M.f4361b.f4830g.setVisibility(8);
                    new Handler().postDelayed(new q0.d(channelActivity, 1), 700L);
                    channelActivity.M.f4361b.f4831h.setImageResource(R.drawable.ic_drawer_arrow_down);
                    return;
                }
                ((AppBarLayout.LayoutParams) channelActivity.M.f4362c.getLayoutParams()).f7112a = 0;
                channelActivity.M.f4361b.f4830g.setVisibility(0);
                channelActivity.M.f4364f.setVisibility(8);
                channelActivity.M.f4364f.setAlpha(0.0f);
                channelActivity.M.f4361b.f4831h.setImageResource(R.drawable.ic_drawer_arrow_up);
                return;
            case 2:
                int i11 = b4.c.A;
                ((b4.c) this.f15515f).dismiss();
                return;
            case 3:
                GifDetailsActivity gifDetailsActivity = (GifDetailsActivity) this.f15515f;
                int i12 = GifDetailsActivity.U;
                gifDetailsActivity.K(false);
                gifDetailsActivity.J(false);
                gifDetailsActivity.N.f4381e.start();
                return;
            case 4:
                n nVar = (n) this.f15515f;
                if (UsersConfig.isUserLoggedIn(nVar.f9413p0.a())) {
                    nVar.N0(!nVar.w0);
                    return;
                }
                b4.d dVar2 = new b4.d(nVar.n(), nVar.I(R.string.dialog_fav_gif_add));
                dVar2.f3563j = new i(nVar, 0);
                dVar2.show();
                return;
            case 5:
                HomeActivity this$0 = (HomeActivity) this.f15515f;
                int i13 = HomeActivity.f4998a0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                HomeActivityViewModel homeActivityViewModel2 = this$0.M;
                if (homeActivityViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    homeActivityViewModel = homeActivityViewModel2;
                }
                homeActivityViewModel.f5013k.l(new z3.a<>(HomeActivityViewModel.FragmentStateEvent.c.f5030a));
                return;
            case 6:
                AccountFragment this$02 = (AccountFragment) this.f15515f;
                KProperty<Object>[] kPropertyArr = AccountFragment.f5046t0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                this$02.P0("offline_videos");
                j O0 = this$02.O0();
                Objects.requireNonNull(O0);
                if (UsersConfig.Companion.isPremiumAllowed(O0.f10129g.a())) {
                    this$02.N0().f5042o.l(new NavigationViewModel.NavEvent.OpenDestination(new androidx.navigation.a(R.id.action_global_offlineModeActivity)));
                    return;
                } else {
                    this$02.N0().f5042o.l(new NavigationViewModel.NavEvent.OpenDestination(NavHomeDirections.f4266a.a(PopupSource.SETTINGS_SCREEN)));
                    return;
                }
            case 7:
                CategoriesFragment categoriesFragment = (CategoriesFragment) this.f15515f;
                categoriesFragment.f5099v0.setText("0");
                CategoryAdapter categoryAdapter = categoriesFragment.f5097t0;
                categoryAdapter.f5104e.clear();
                categoryAdapter.f5105f.clear();
                categoryAdapter.f2802a.b();
                return;
            case 8:
                DiscoverFragment this$03 = (DiscoverFragment) this.f15515f;
                KProperty<Object>[] kPropertyArr2 = DiscoverFragment.f5133x0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                DiscoverViewModel discoverViewModel2 = this$03.f5138t0;
                if (discoverViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    discoverViewModel = discoverViewModel2;
                }
                discoverViewModel.c();
                return;
            case 9:
                ExploreCategoryAdapter this$04 = (ExploreCategoryAdapter) this.f15515f;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                o4.d dVar3 = this$04.f5190h;
                if (dVar3 == null) {
                    return;
                }
                Object tag = view.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type com.app.pornhub.domain.model.category.Category");
                dVar3.c((Category) tag);
                return;
            case 10:
                ExploreGifAdapter this$05 = (ExploreGifAdapter) this.f15515f;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                o4.d dVar4 = this$05.f5207i;
                if (dVar4 == null) {
                    return;
                }
                ExploreOptions exploreOptions = this$05.f5204f;
                String order = exploreOptions == null ? null : exploreOptions.getOrder();
                ExploreOptions exploreOptions2 = this$05.f5204f;
                dVar4.g(order, exploreOptions2 != null ? exploreOptions2.getFilter() : null);
                return;
            case 11:
                PerformersFilterFragment this$06 = (PerformersFilterFragment) this.f15515f;
                KProperty<Object>[] kPropertyArr3 = PerformersFilterFragment.f5275u0;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                LinearLayout linearLayout = this$06.M0().f4637e;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.contentContainer");
                Intrinsics.checkNotNullParameter(linearLayout, "<this>");
                Intrinsics.checkNotNullParameter(linearLayout, "<this>");
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    if (!(i14 < linearLayout.getChildCount())) {
                        return;
                    }
                    int i16 = i14 + 1;
                    View childAt = linearLayout.getChildAt(i14);
                    if (childAt == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    int i17 = i15 + 1;
                    if (i15 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    List<PerformerAdditionalFilter> list = this$06.f5279s0;
                    if (list == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("filters");
                        list = null;
                    }
                    if (Intrinsics.areEqual(list.get(i15).getValue(), "age")) {
                        RangeSlider rangeSlider = (RangeSlider) t3.a.j((ViewGroup) childAt, 1);
                        rangeSlider.setValues(CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(rangeSlider.getValueFrom()), Float.valueOf(rangeSlider.getValueTo())}));
                    } else {
                        ((RadioButton) t3.a.j((RadioGroup) t3.a.j((ViewGroup) childAt, 1), 0)).setChecked(true);
                    }
                    i14 = i16;
                    i15 = i17;
                }
            case 12:
                int i18 = AccountExpiredActivity.K;
                ((AccountExpiredActivity) this.f15515f).finish();
                return;
            case 13:
                LoginFragment loginFragment = (LoginFragment) this.f15515f;
                LoginViewModel loginViewModel = loginFragment.f5388q0;
                String code = loginFragment.f5389r0.f4607c.getText().toString().trim();
                Objects.requireNonNull(loginViewModel);
                Intrinsics.checkNotNullParameter(code, "code");
                r rVar = loginViewModel.f5393e;
                Objects.requireNonNull(rVar);
                Intrinsics.checkNotNullParameter(code, "code");
                Observable startWith = rVar.f9387a.e(code).toObservable().map(i1.f17749w).onErrorReturn(z.f17906z).startWith((Observable) UseCaseResult.a.f4910a);
                Intrinsics.checkNotNullExpressionValue(startWith, "currentUserRepository.lo…th(UseCaseResult.Loading)");
                Disposable subscribe = startWith.subscribe(new x2.c(loginViewModel, 19));
                Intrinsics.checkNotNullExpressionValue(subscribe, "loginWithVerificationCod…          }\n            }");
                DisposableKt.addTo(subscribe, loginViewModel.f16001c);
                return;
            case 14:
                SignupActivity signupActivity = (SignupActivity) this.f15515f;
                int i19 = SignupActivity.S;
                signupActivity.startActivity(LoginActivity.C(signupActivity.getApplicationContext()));
                signupActivity.finish();
                return;
            case 15:
                OfflineVideoPlayerActivity offlineVideoPlayerActivity = (OfflineVideoPlayerActivity) this.f15515f;
                if (offlineVideoPlayerActivity.R.isPlaying()) {
                    offlineVideoPlayerActivity.R.pause();
                    return;
                } else {
                    offlineVideoPlayerActivity.R.h();
                    return;
                }
            case 16:
                x4.j jVar = (x4.j) this.f15515f;
                String str = x4.j.f17944p0;
                jVar.I0(LoginActivity.C(jVar.q()));
                return;
            case 17:
                LockedPayVideoActivity this$07 = (LockedPayVideoActivity) this.f15515f;
                int i20 = LockedPayVideoActivity.R;
                Intrinsics.checkNotNullParameter(this$07, "this$0");
                this$07.E();
                return;
            case 18:
                StyledPlayerControlView.a((StyledPlayerControlView) this.f15515f, view);
                return;
            default:
                StyledPlayerControlView.j jVar2 = (StyledPlayerControlView.j) this.f15515f;
                i8.e eVar = StyledPlayerControlView.this.G0;
                if (eVar != null) {
                    e.C0154e a10 = eVar.d().a();
                    for (int i21 = 0; i21 < jVar2.d.size(); i21++) {
                        int intValue = jVar2.d.get(i21).intValue();
                        a10.e(intValue);
                        a10.g(intValue, true);
                    }
                    i8.e eVar2 = StyledPlayerControlView.this.G0;
                    Objects.requireNonNull(eVar2);
                    eVar2.i(a10);
                    StyledPlayerControlView.this.D0.dismiss();
                    return;
                }
                return;
        }
    }
}
