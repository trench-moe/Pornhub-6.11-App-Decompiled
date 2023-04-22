package b4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import b4.c;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.model.performer.PerformerMetaData;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.view.browser.PremiumRegistrationActivity;
import com.app.pornhub.view.gifdetails.GifDetailsActivity;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.categories.CategoriesFragment;
import com.app.pornhub.view.home.explore.ExploreFragment;
import com.app.pornhub.view.home.explore.ExploreFragmentViewModel;
import com.app.pornhub.view.home.explore.adapter.ExploreCategoryAdapter;
import com.app.pornhub.view.home.explore.adapter.ExplorePornstarAdapter;
import com.app.pornhub.view.home.pornstars.PerformersFilterFragment;
import com.app.pornhub.view.home.pornstars.PerformersViewModel;
import com.app.pornhub.view.launch.AccountExpiredActivity;
import com.app.pornhub.view.login.LoginFragment;
import com.app.pornhub.view.login.SignupActivity;
import com.app.pornhub.view.offline.OfflineVideoPlayerActivity;
import com.app.pornhub.view.user.PreferencesActivity;
import com.app.pornhub.view.videodetails.LockedPayVideoActivity;
import com.app.pornhub.view.videodetails.LockedVideoActivity;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import com.appsflyer.oaid.BuildConfig;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import f3.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import t3.l;
import u4.i;
import x4.j;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3551c;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f3552f;

    public /* synthetic */ b(Object obj, int i10) {
        this.f3551c = i10;
        this.f3552f = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f3551c;
        ExploreFragmentViewModel exploreFragmentViewModel = null;
        h hVar = null;
        String str = BuildConfig.FLAVOR;
        switch (i10) {
            case 0:
                c cVar = (c) this.f3552f;
                c.a aVar = cVar.f3560z;
                if (aVar != null) {
                    int i11 = !cVar.y ? 1 : 0;
                    PreferencesActivity preferencesActivity = (PreferencesActivity) ((g4.f) aVar).f9735f;
                    int i12 = PreferencesActivity.E;
                    PreferencesActivity.AliasNames aliasNames = PreferencesActivity.AliasNames.DISCREET;
                    PreferencesActivity.AliasNames aliasNames2 = PreferencesActivity.AliasNames.NORMAL;
                    PackageManager packageManager = preferencesActivity.getPackageManager();
                    PreferencesActivity.AliasNames aliasNames3 = i11 != 0 ? aliasNames : aliasNames2;
                    packageManager.setComponentEnabledSetting(new ComponentName("com.app.pornhub", "com.app.pornhub.alias.normal"), aliasNames3 == aliasNames2 ? 1 : 2, 1);
                    packageManager.setComponentEnabledSetting(new ComponentName("com.app.pornhub", "com.app.pornhub.alias.discreet"), aliasNames3 == aliasNames ? 1 : 2, 1);
                    preferencesActivity.n.edit().putInt("discreet_icon_previous", i11 ^ 1).apply();
                    t3.a.A(preferencesActivity, "discreeticon_change");
                    Bundle bundle = new Bundle();
                    bundle.putString("settings_icon", i11 != 0 ? "discreet" : "normal");
                    t3.g.i(preferencesActivity, "phapp_settings_icon_change", bundle);
                }
                cVar.dismiss();
                return;
            case 1:
                GifDetailsActivity gifDetailsActivity = (GifDetailsActivity) this.f3552f;
                gifDetailsActivity.startActivity(GifDetailsActivity.D(gifDetailsActivity, gifDetailsActivity.Q.getNewer()));
                return;
            case 2:
                CategoriesFragment categoriesFragment = (CategoriesFragment) this.f3552f;
                int i13 = CategoriesFragment.f5092y0;
                Objects.requireNonNull(categoriesFragment);
                t3.a.y("category_videos");
                HashSet<Category> hashSet = categoriesFragment.f5097t0.f5104e;
                if (hashSet.isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList(hashSet);
                categoriesFragment.M0(arrayList);
                if (arrayList.size() == 1) {
                    t3.a.z(categoriesFragment.q(), ((Category) arrayList.get(0)).getName());
                    return;
                }
                Context q10 = categoriesFragment.q();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((Category) it.next()).getName());
                }
                if (!arrayList2.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((String) arrayList2.get(0));
                    for (int i14 = 1; i14 < arrayList2.size(); i14++) {
                        sb2.append(" ");
                        sb2.append((String) arrayList2.get(i14));
                    }
                    str = sb2.toString();
                }
                t3.a.z(q10, str);
                return;
            case 3:
                ExploreFragment this$0 = (ExploreFragment) this.f3552f;
                KProperty<Object>[] kPropertyArr = ExploreFragment.f5155y0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                HomeActivityViewModel homeActivityViewModel = this$0.f5159s0;
                if (homeActivityViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                    homeActivityViewModel = null;
                }
                homeActivityViewModel.f5012j.l(new HomeActivityViewModel.ActivityStateEvent.e(true));
                this$0.M0().f4577g.l0(0);
                ExploreFragmentViewModel exploreFragmentViewModel2 = this$0.f5160t0;
                if (exploreFragmentViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    exploreFragmentViewModel = exploreFragmentViewModel2;
                }
                ExploreFragmentViewModel.d(exploreFragmentViewModel, false, 1);
                return;
            case 4:
                ExploreCategoryAdapter this$02 = (ExploreCategoryAdapter) this.f3552f;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                o4.d dVar = this$02.f5190h;
                if (dVar == null) {
                    return;
                }
                dVar.m();
                return;
            case 5:
                ExplorePornstarAdapter this$03 = (ExplorePornstarAdapter) this.f3552f;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                o4.d dVar2 = this$03.f5216j;
                if (dVar2 == null) {
                    return;
                }
                Object tag = view.getTag();
                Objects.requireNonNull(tag, "null cannot be cast to non-null type com.app.pornhub.domain.model.performer.PerformerMetaData");
                dVar2.i((PerformerMetaData) tag);
                return;
            case 6:
                PerformersFilterFragment this$04 = (PerformersFilterFragment) this.f3552f;
                KProperty<Object>[] kPropertyArr2 = PerformersFilterFragment.f5275u0;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                PerformersViewModel N0 = this$04.N0();
                Map<String, String> selectionMap = this$04.f5280t0;
                Objects.requireNonNull(N0);
                Intrinsics.checkNotNullParameter(selectionMap, "selectionMap");
                k3.g gVar = N0.f5301i;
                if (selectionMap != null) {
                    gVar.f11784a.g(selectionMap);
                } else {
                    gVar.f11784a.c();
                }
                t3.a.i(this$04).j();
                return;
            case 7:
                i this$05 = (i) this.f3552f;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                i.a aVar2 = this$05.f15540f;
                if (aVar2 == null) {
                    return;
                }
                Object tag2 = view.getTag();
                Objects.requireNonNull(tag2, "null cannot be cast to non-null type com.app.pornhub.domain.model.video.VideoMetaData");
                aVar2.a((VideoMetaData) tag2);
                return;
            case 8:
                AccountExpiredActivity accountExpiredActivity = (AccountExpiredActivity) this.f3552f;
                int i15 = AccountExpiredActivity.K;
                accountExpiredActivity.startActivity(PremiumRegistrationActivity.B(accountExpiredActivity, accountExpiredActivity.getString(R.string.get_pornhub_premium), accountExpiredActivity.H.a(accountExpiredActivity.I.g())));
                accountExpiredActivity.finish();
                return;
            case 9:
                int i16 = com.app.pornhub.view.launch.a.f5378x0;
                ((com.app.pornhub.view.launch.a) this.f3552f).N0();
                return;
            case 10:
                int i17 = LoginFragment.f5386u0;
                ((LoginFragment) this.f3552f).M0(str);
                return;
            case 11:
                SignupActivity signupActivity = (SignupActivity) this.f3552f;
                int i18 = SignupActivity.S;
                signupActivity.startActivity(PremiumRegistrationActivity.B(signupActivity.getApplicationContext(), signupActivity.getString(R.string.get_pornhub_premium), signupActivity.L.h()));
                t3.g.k(signupActivity, "signup_button");
                signupActivity.finish();
                return;
            case 12:
                x4.e eVar = (x4.e) this.f3552f;
                String str2 = x4.e.A0;
                Objects.requireNonNull(eVar);
                eVar.I0(new Intent("android.settings.WIRELESS_SETTINGS"));
                return;
            case 13:
                OfflineVideoPlayerActivity offlineVideoPlayerActivity = (OfflineVideoPlayerActivity) this.f3552f;
                int i19 = OfflineVideoPlayerActivity.T;
                if (offlineVideoPlayerActivity.getResources().getConfiguration().orientation == 2) {
                    offlineVideoPlayerActivity.setRequestedOrientation(7);
                    return;
                } else {
                    offlineVideoPlayerActivity.setRequestedOrientation(6);
                    return;
                }
            case 14:
                j jVar = (j) this.f3552f;
                String str3 = j.f17944p0;
                jVar.I0(PremiumRegistrationActivity.B(jVar.q(), jVar.I(R.string.get_pornhub_premium), jVar.f17945n0.a(jVar.f17946o0.g())));
                return;
            case 15:
                LockedPayVideoActivity this$06 = (LockedPayVideoActivity) this.f3552f;
                int i20 = LockedPayVideoActivity.R;
                Intrinsics.checkNotNullParameter(this$06, "this$0");
                Object tag3 = view.getTag();
                Objects.requireNonNull(tag3, "null cannot be cast to non-null type com.app.pornhub.domain.model.video.VideoMetaData");
                VideoMetaData videoMetaData = (VideoMetaData) tag3;
                UsersConfig.Companion companion = UsersConfig.Companion;
                h hVar2 = this$06.L;
                if (hVar2 != null) {
                    hVar = hVar2;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("getCurrentAuthLevelUseCase");
                }
                if (companion.isPremiumAllowed(hVar.a())) {
                    this$06.startActivity(VideoDetailsActivity.G(this$06, videoMetaData.getVkey()));
                } else {
                    this$06.startActivity(LockedVideoActivity.C(this$06, videoMetaData));
                }
                this$06.finish();
                return;
            case 16:
                com.app.pornhub.view.videodetails.c cVar2 = (com.app.pornhub.view.videodetails.c) this.f3552f;
                int i21 = com.app.pornhub.view.videodetails.c.C0;
                l.f(cVar2.q(), cVar2.f5601x0.getVideoMetaData());
                t3.a.y("share_video");
                return;
            default:
                StyledPlayerControlView.a((StyledPlayerControlView) this.f3552f, view);
                return;
        }
    }
}
