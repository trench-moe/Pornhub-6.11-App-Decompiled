package g4;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ActivityHomeBinding;
import com.app.pornhub.domain.config.ChannelsConfig;
import com.app.pornhub.domain.config.PerformersConfig;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.model.Optional;
import com.app.pornhub.domain.model.ads_promo.PromoBanner;
import com.app.pornhub.domain.model.performer.PerformerMetaData;
import com.app.pornhub.domain.model.user.UserMetaData;
import com.app.pornhub.domain.model.video.Video;
import com.app.pornhub.domain.model.video.VideoContentType;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.account.AccountFragment;
import com.app.pornhub.view.home.categories.CategoriesFragment;
import com.app.pornhub.view.home.channels.ChannelsFragment;
import com.app.pornhub.view.home.discover.DiscoverFragment;
import com.app.pornhub.view.home.playlists.PlaylistsCommonFragment;
import com.app.pornhub.view.home.playlists.PlaylistsViewModel;
import com.app.pornhub.view.home.topnav.TopNavigation;
import com.app.pornhub.view.launch.LaunchViewModel;
import com.app.pornhub.view.playlistdetails.PlaylistDetailsViewModel;
import com.app.pornhub.view.playlistdetails.PlaylistVideosFragment;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import com.app.pornhub.view.videodetails.VideoDetailsViewModel;
import e5.e0;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import x2.k0;
import x2.l0;

/* loaded from: classes.dex */
public final /* synthetic */ class p implements androidx.lifecycle.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9752a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9753b;

    public /* synthetic */ p(Object obj, int i10) {
        this.f9752a = i10;
        this.f9753b = obj;
    }

    @Override // androidx.lifecycle.q
    public final void a(Object obj) {
        ActivityHomeBinding activityHomeBinding;
        ActivityHomeBinding activityHomeBinding2;
        ActivityHomeBinding activityHomeBinding3;
        HomeActivityViewModel homeActivityViewModel;
        PlaylistsViewModel playlistsViewModel;
        boolean z10 = false;
        PlaylistsViewModel playlistsViewModel2 = null;
        switch (this.f9752a) {
            case 0:
                HomeActivity this$0 = (HomeActivity) this.f9753b;
                HomeActivityViewModel.ActivityStateEvent activityStateEvent = (HomeActivityViewModel.ActivityStateEvent) obj;
                int i10 = HomeActivity.f4998a0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (activityStateEvent instanceof HomeActivityViewModel.ActivityStateEvent.c) {
                    HomeActivityViewModel.ActivityStateEvent.c cVar = (HomeActivityViewModel.ActivityStateEvent.c) activityStateEvent;
                    this$0.T(cVar.f5022a, cVar.f5023b);
                    return;
                } else if (activityStateEvent instanceof HomeActivityViewModel.ActivityStateEvent.ShowPromoBanner) {
                    PromoBanner a10 = ((HomeActivityViewModel.ActivityStateEvent.ShowPromoBanner) activityStateEvent).a();
                    com.bumptech.glide.f<Drawable> B = com.bumptech.glide.b.f(this$0).o(a10.getImageUrl()).B(new w(this$0, a10));
                    ActivityHomeBinding activityHomeBinding4 = this$0.K;
                    if (activityHomeBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityHomeBinding4 = null;
                    }
                    B.A(activityHomeBinding4.f4400m);
                    ActivityHomeBinding activityHomeBinding5 = this$0.K;
                    if (activityHomeBinding5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityHomeBinding5 = null;
                    }
                    activityHomeBinding5.f4401o.setOnClickListener(new l(this$0, a10, 0));
                    ActivityHomeBinding activityHomeBinding6 = this$0.K;
                    if (activityHomeBinding6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityHomeBinding3 = playlistsViewModel2;
                    } else {
                        activityHomeBinding3 = activityHomeBinding6;
                    }
                    activityHomeBinding3.n.setOnClickListener(new x3.c(this$0, a10, 1));
                    return;
                } else if (activityStateEvent instanceof HomeActivityViewModel.ActivityStateEvent.b) {
                    this$0.S(((HomeActivityViewModel.ActivityStateEvent.b) activityStateEvent).f5021a);
                    return;
                } else if (!(activityStateEvent instanceof HomeActivityViewModel.ActivityStateEvent.a)) {
                    if (activityStateEvent instanceof HomeActivityViewModel.ActivityStateEvent.f) {
                        if (((HomeActivityViewModel.ActivityStateEvent.f) activityStateEvent).f5026a && t3.l.c(this$0)) {
                            z10 = true;
                        }
                        this$0.Q = z10;
                        this$0.invalidateOptionsMenu();
                        return;
                    }
                    if (activityStateEvent instanceof HomeActivityViewModel.ActivityStateEvent.e) {
                        if (!((HomeActivityViewModel.ActivityStateEvent.e) activityStateEvent).f5025a) {
                            this$0.N();
                            return;
                        } else if (!this$0.L()) {
                            this$0.O();
                            return;
                        }
                    } else if (activityStateEvent instanceof HomeActivityViewModel.ActivityStateEvent.d) {
                        this$0.U(((HomeActivityViewModel.ActivityStateEvent.d) activityStateEvent).f5024a);
                    }
                    return;
                } else {
                    HomeActivityViewModel.ActivityStateEvent.a aVar = (HomeActivityViewModel.ActivityStateEvent.a) activityStateEvent;
                    if (aVar.f5020a <= 0) {
                        ActivityHomeBinding activityHomeBinding7 = this$0.K;
                        if (activityHomeBinding7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityHomeBinding7 = null;
                        }
                        activityHomeBinding7.f4392e.setColorFilter((ColorFilter) null);
                        ActivityHomeBinding activityHomeBinding8 = this$0.K;
                        if (activityHomeBinding8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                            activityHomeBinding = playlistsViewModel2;
                        } else {
                            activityHomeBinding = activityHomeBinding8;
                        }
                        activityHomeBinding.f4391c.setVisibility(8);
                        return;
                    }
                    ActivityHomeBinding activityHomeBinding9 = this$0.K;
                    if (activityHomeBinding9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityHomeBinding9 = null;
                    }
                    activityHomeBinding9.f4392e.setColorFilter(c0.a.b(this$0, R.color.orange), PorterDuff.Mode.SRC_ATOP);
                    ActivityHomeBinding activityHomeBinding10 = this$0.K;
                    if (activityHomeBinding10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityHomeBinding10 = null;
                    }
                    activityHomeBinding10.f4391c.setVisibility(0);
                    ActivityHomeBinding activityHomeBinding11 = this$0.K;
                    if (activityHomeBinding11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityHomeBinding2 = playlistsViewModel2;
                    } else {
                        activityHomeBinding2 = activityHomeBinding11;
                    }
                    activityHomeBinding2.f4391c.setText(String.valueOf(aVar.f5020a));
                    return;
                }
            case 1:
                AccountFragment accountFragment = (AccountFragment) this.f9753b;
                Optional optional = (Optional) obj;
                KProperty<Object>[] kPropertyArr = AccountFragment.f5046t0;
                Objects.requireNonNull(accountFragment);
                if (optional.getValue() == null) {
                    accountFragment.M0().f4544m.setVisibility(0);
                    accountFragment.M0().f4543l.setVisibility(0);
                    return;
                }
                Object value = optional.getValue();
                Intrinsics.checkNotNull(value);
                UserMetaData userMetaData = (UserMetaData) value;
                accountFragment.M0().f4544m.setVisibility(8);
                accountFragment.M0().f4543l.setVisibility(0);
                com.bumptech.glide.f<Bitmap> B2 = com.bumptech.glide.b.c(accountFragment.q()).g(accountFragment).b().C(userMetaData.getUrlThumbnail()).B(new h4.i(accountFragment));
                Objects.requireNonNull(B2);
                z5.d dVar = new z5.d(IntCompanionObject.MIN_VALUE, IntCompanionObject.MIN_VALUE);
                B2.z(dVar, dVar, B2, d6.e.f8789b);
                accountFragment.M0().f4549s.setText(userMetaData.getUsername());
                accountFragment.M0().f4550t.setOnClickListener(new h4.c(accountFragment, 2));
                accountFragment.M0().f4542k.setOnClickListener(new h4.b(accountFragment, 2));
                h4.j O0 = accountFragment.O0();
                Objects.requireNonNull(O0);
                if (UsersConfig.Companion.isPremiumAllowed(O0.f10129g.a())) {
                    accountFragment.M0().f4540i.setVisibility(8);
                    return;
                }
                return;
            case 2:
                CategoriesFragment categoriesFragment = (CategoriesFragment) this.f9753b;
                int i11 = CategoriesFragment.f5092y0;
                Objects.requireNonNull(categoriesFragment);
                HomeActivityViewModel.FragmentStateEvent fragmentStateEvent = (HomeActivityViewModel.FragmentStateEvent) ((z3.a) obj).a();
                if (fragmentStateEvent == null) {
                    return;
                }
                if (fragmentStateEvent instanceof HomeActivityViewModel.FragmentStateEvent.a) {
                    HomeActivityViewModel.FragmentStateEvent.a aVar2 = (HomeActivityViewModel.FragmentStateEvent.a) fragmentStateEvent;
                    t3.o.m(aVar2.f5027a, aVar2.f5028b, categoriesFragment.f5096s0);
                    return;
                } else if (fragmentStateEvent instanceof HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted) {
                    String a11 = ((HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted) fragmentStateEvent).a();
                    categoriesFragment.I0(HomeActivity.F(categoriesFragment.u0(), a11, R.id.videosFragment));
                    t3.g.m(categoriesFragment.q(), a11, "Categories");
                    return;
                } else {
                    return;
                }
            case 3:
                ChannelsFragment channelsFragment = (ChannelsFragment) this.f9753b;
                NavigationViewModel.OrderingChangeEvent orderingChangeEvent = (NavigationViewModel.OrderingChangeEvent) obj;
                int i12 = ChannelsFragment.J0;
                Objects.requireNonNull(channelsFragment);
                if (orderingChangeEvent instanceof NavigationViewModel.OrderingChangeEvent.ChannelOrderOrFilterChanged) {
                    channelsFragment.I0 = ((NavigationViewModel.OrderingChangeEvent.ChannelOrderOrFilterChanged) orderingChangeEvent).a();
                    channelsFragment.F0.m();
                    channelsFragment.K0();
                }
                if (channelsFragment.I0 != null) {
                    NavigationViewModel navigationViewModel = channelsFragment.D0;
                    Objects.requireNonNull(navigationViewModel);
                    NavigationViewModel.l(navigationViewModel, TopNavigation.ChildItem.ChannelOrders.INSTANCE, null, false, 6);
                    NavigationViewModel navigationViewModel2 = channelsFragment.D0;
                    ChannelsConfig.ChannelOrder channelOrder = channelsFragment.I0;
                    Objects.requireNonNull(navigationViewModel2);
                    Intrinsics.checkNotNullParameter(channelOrder, "channelOrder");
                    navigationViewModel2.B(navigationViewModel2.d(channelOrder));
                    navigationViewModel2.n(TopNavigation.ParentItem.Channels.INSTANCE, navigationViewModel2.d(channelOrder), null);
                    navigationViewModel2.f5042o.l(NavigationViewModel.NavEvent.a.f5043a);
                    return;
                }
                return;
            case 4:
                DiscoverFragment this$02 = (DiscoverFragment) this.f9753b;
                KProperty<Object>[] kPropertyArr2 = DiscoverFragment.f5133x0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                PromoBanner promoBanner = (PromoBanner) ((z3.a) obj).a();
                if (promoBanner != null) {
                    HomeActivityViewModel homeActivityViewModel2 = this$02.f5137s0;
                    if (homeActivityViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                        homeActivityViewModel = playlistsViewModel2;
                    } else {
                        homeActivityViewModel = homeActivityViewModel2;
                    }
                    Objects.requireNonNull(homeActivityViewModel);
                    Intrinsics.checkNotNullParameter(promoBanner, "promoBanner");
                    homeActivityViewModel.f5012j.l(new HomeActivityViewModel.ActivityStateEvent.ShowPromoBanner(promoBanner));
                }
                return;
            case 5:
                PlaylistsCommonFragment this$03 = (PlaylistsCommonFragment) this.f9753b;
                KProperty<Object>[] kPropertyArr3 = PlaylistsCommonFragment.f5245u0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                PlaylistsViewModel.State state = (PlaylistsViewModel.State) ((z3.a) obj).a();
                if (state instanceof PlaylistsViewModel.State.c) {
                    this$03.N0().f4556e.f4698a.setVisibility(8);
                    this$03.N0().f4554b.setVisibility(0);
                    FrameLayout frameLayout = this$03.N0().d;
                    Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.emptyContentMsgContainer");
                    frameLayout.setVisibility(8);
                    return;
                } else if (state instanceof PlaylistsViewModel.State.b) {
                    this$03.N0().f4554b.setVisibility(8);
                    return;
                } else if (!(state instanceof PlaylistsViewModel.State.ErrorLoadingPlaylists)) {
                    if (state instanceof PlaylistsViewModel.State.a) {
                        Objects.requireNonNull((PlaylistsViewModel.State.a) state);
                        RecyclerView recyclerView = this$03.N0().f4557f;
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerview");
                        t3.o.m(0, 0, recyclerView);
                    }
                    return;
                } else {
                    String I = this$03.I(R.string.error_default);
                    Intrinsics.checkNotNullExpressionValue(I, "getString(R.string.error_default)");
                    PlaylistsViewModel playlistsViewModel3 = this$03.f5250t0;
                    if (playlistsViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        playlistsViewModel = playlistsViewModel2;
                    } else {
                        playlistsViewModel = playlistsViewModel3;
                    }
                    Objects.requireNonNull(playlistsViewModel);
                    this$03.N0().f4556e.f4699b.setImageResource(t3.o.g(UsersConfig.Companion.isGay(playlistsViewModel.d.a().getOrientation())));
                    this$03.N0().f4556e.f4698a.setVisibility(0);
                    this$03.N0().f4556e.f4700c.setText(I);
                    return;
                }
            case 6:
                com.app.pornhub.view.launch.a aVar3 = (com.app.pornhub.view.launch.a) this.f9753b;
                LaunchViewModel.UpdateState updateState = (LaunchViewModel.UpdateState) obj;
                int i13 = com.app.pornhub.view.launch.a.f5378x0;
                Objects.requireNonNull(aVar3);
                if (!(updateState instanceof LaunchViewModel.UpdateState.a)) {
                    if (updateState instanceof LaunchViewModel.UpdateState.ErrorCheckUpdate) {
                        aVar3.M0(((LaunchViewModel.UpdateState.ErrorCheckUpdate) updateState).a());
                        return;
                    }
                    return;
                }
                aVar3.O0(R.string.update_available);
                aVar3.f5381r0.f4647c.setVisibility(0);
                aVar3.f5381r0.f4648e.setVisibility(8);
                aVar3.f5381r0.f4655l.setVisibility(8);
                aVar3.f5381r0.f4646b.setVisibility(0);
                aVar3.f5381r0.f4646b.setText(R.string.update);
                aVar3.f5381r0.f4646b.setOnClickListener(new u3.c(aVar3, 9));
                aVar3.P0(true);
                t3.a.A(aVar3.q(), "update_needed");
                return;
            case 7:
                com.app.pornhub.view.performerdetails.b bVar = (com.app.pornhub.view.performerdetails.b) this.f9753b;
                List<VideoMetaData> list = (List) obj;
                int i14 = com.app.pornhub.view.performerdetails.b.D0;
                Objects.requireNonNull(bVar);
                bVar.f8761q0 = PerformersConfig.Companion.hasMorePerformerVideos(list.size());
                bVar.C0.q(list);
                bVar.R0();
                return;
            case 8:
                PlaylistVideosFragment this$04 = (PlaylistVideosFragment) this.f9753b;
                PlaylistDetailsViewModel.a aVar4 = (PlaylistDetailsViewModel.a) obj;
                int i15 = PlaylistVideosFragment.C0;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                if (Intrinsics.areEqual(aVar4, PlaylistDetailsViewModel.a.f.f5448a)) {
                    this$04.S0();
                    return;
                } else if (Intrinsics.areEqual(aVar4, PlaylistDetailsViewModel.a.b.f5443a)) {
                    this$04.T0();
                    this$04.R0();
                    return;
                } else {
                    return;
                }
            case 9:
                VideoDetailsActivity videoDetailsActivity = (VideoDetailsActivity) this.f9753b;
                String str = (String) obj;
                int i16 = VideoDetailsActivity.f5539t0;
                Objects.requireNonNull(videoDetailsActivity);
                if (str != null && videoDetailsActivity.f5558s0.isPlaying()) {
                    videoDetailsActivity.f5558s0.C(false);
                }
                if (!TextUtils.isEmpty(str)) {
                    videoDetailsActivity.L.f(str);
                }
                return;
            default:
                com.app.pornhub.view.videodetails.c cVar2 = (com.app.pornhub.view.videodetails.c) this.f9753b;
                Video video = (Video) obj;
                cVar2.f5601x0 = video;
                VideoContentType type = video.getVideoMetaData().getVideoContentType();
                ImageView target = cVar2.f5602y0.f4687s;
                t3.o oVar = t3.o.f15126a;
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(target, "target");
                t3.o oVar2 = t3.o.f15126a;
                t3.o.a(type, target, R.drawable.ic_premium, R.drawable.ic_premium_free);
                cVar2.f5602y0.f4672b.setVisibility(8);
                if (UsersConfig.isUserLoggedIn(cVar2.f5594p0.a())) {
                    VideoDetailsViewModel videoDetailsViewModel = cVar2.f5598t0;
                    String vkey = cVar2.f5601x0.getVideoMetaData().getVkey();
                    Objects.requireNonNull(videoDetailsViewModel);
                    Intrinsics.checkNotNullParameter(vkey, "vkey");
                    o3.e eVar = videoDetailsViewModel.f5572j;
                    Objects.requireNonNull(eVar);
                    Intrinsics.checkNotNullParameter(vkey, "vkey");
                    Observable startWith = eVar.f13544a.b(vkey).toObservable().map(k0.H).onErrorReturn(l0.H).startWith((Observable) UseCaseResult.a.f4910a);
                    Intrinsics.checkNotNullExpressionValue(startWith, "videosRepository.isVideo…th(UseCaseResult.Loading)");
                    Disposable subscribe = startWith.subscribe(new e0(videoDetailsViewModel, 1));
                    Intrinsics.checkNotNullExpressionValue(subscribe, "getVideoFavoriteStatusUs…          }\n            }");
                    DisposableKt.addTo(subscribe, videoDetailsViewModel.f16001c);
                } else {
                    cVar2.f5602y0.f4676g.setVisibility(8);
                    cVar2.f5602y0.f4675f.setVisibility(0);
                }
                if (((HashSet) androidx.appcompat.widget.p.b().f1052a).contains(cVar2.f5601x0.getVideoMetaData().getVkey())) {
                    cVar2.P0();
                } else {
                    if (((HashSet) androidx.appcompat.widget.p.b().f1053b).contains(cVar2.f5601x0.getVideoMetaData().getVkey())) {
                        cVar2.O0();
                    } else {
                        Drawable drawable = cVar2.E().getDrawable(R.drawable.like);
                        if (drawable != null) {
                            drawable.setColorFilter(null);
                        }
                        cVar2.f5602y0.f4684p.setImageDrawable(drawable);
                        Drawable drawable2 = cVar2.E().getDrawable(R.drawable.dislike);
                        if (drawable2 != null) {
                            drawable2.setColorFilter(null);
                        }
                        cVar2.f5602y0.f4674e.setImageDrawable(drawable2);
                    }
                }
                cVar2.f5602y0.y.setText(cVar2.f5601x0.getVideoMetaData().getTitle());
                cVar2.f5602y0.f4693z.setText(a0.b.u(cVar2.f5601x0.getVideoMetaData().getViewCount()));
                cVar2.f5602y0.f4689u.setText(a0.b.z(cVar2.f5601x0.getVideoMetaData().getRating()));
                cVar2.f5602y0.f4690v.setProgress(cVar2.f5601x0.getVideoMetaData().getRating());
                cVar2.f5601x0.getUserMetaData();
                if (TextUtils.isEmpty(cVar2.f5601x0.getUserMetaData().getId())) {
                    cVar2.f5602y0.f4680k.setVisibility(8);
                    cVar2.f5602y0.n.setVisibility(8);
                } else {
                    cVar2.f5602y0.f4678i.setText(cVar2.f5601x0.getUserMetaData().getUsername());
                    t3.o.o(cVar2.f5601x0.getVideoMetaData(), cVar2.f5602y0.n);
                }
                VideoMetaData videoMetaData = cVar2.f5601x0.getVideoMetaData();
                if (!TextUtils.isEmpty(videoMetaData.getChannelTitle()) && !TextUtils.isEmpty(videoMetaData.getChannelLink())) {
                    cVar2.f5602y0.f4683o.setVisibility(0);
                    cVar2.f5602y0.f4683o.setText(String.format(cVar2.I(R.string.join_x_now), videoMetaData.getChannelTitle()));
                    cVar2.f5602y0.f4683o.setOnClickListener(new i4.d(cVar2, videoMetaData, 4));
                }
                cVar2.f5602y0.f4688t.setText(cVar2.f5601x0.getProduction());
                cVar2.f5602y0.f4673c.setText(a0.b.x(cVar2.f5601x0.getAddedOn()));
                cVar2.f5602y0.f4677h.setText(a0.b.x(cVar2.f5601x0.getVideoMetaData().getApprovedOn()));
                List categoryIds = Arrays.asList(cVar2.f5601x0.getCategories().split(","));
                if (categoryIds.size() > 0) {
                    cVar2.f5602y0.d.removeAllViews();
                    cVar2.f5602y0.f4679j.setVisibility(0);
                    VideoDetailsViewModel videoDetailsViewModel2 = cVar2.f5598t0;
                    Objects.requireNonNull(videoDetailsViewModel2);
                    Intrinsics.checkNotNullParameter(categoryIds, "categoryIds");
                    Disposable subscribe2 = videoDetailsViewModel2.f5575m.a(categoryIds).subscribe(new x2.g(videoDetailsViewModel2, 20));
                    Intrinsics.checkNotNullExpressionValue(subscribe2, "getCategoriesByIdUseCase…          }\n            }");
                    DisposableKt.addTo(subscribe2, videoDetailsViewModel2.f16001c);
                } else {
                    cVar2.f5602y0.f4679j.setVisibility(8);
                }
                if (cVar2.f5601x0.getTags().isEmpty()) {
                    cVar2.f5602y0.f4682m.setVisibility(8);
                } else {
                    cVar2.f5602y0.f4692x.removeAllViews();
                    cVar2.f5602y0.f4682m.setVisibility(0);
                    for (String str2 : cVar2.f5601x0.getTags()) {
                        TextView textView = (TextView) cVar2.x().inflate(R.layout.textview_tags, (ViewGroup) null);
                        textView.setText(str2);
                        textView.setTag(str2);
                        textView.setOnClickListener(cVar2.A0);
                        cVar2.f5602y0.f4692x.addView(textView);
                    }
                }
                if (cVar2.f5601x0.getPornstars().isEmpty()) {
                    cVar2.f5602y0.f4681l.setVisibility(8);
                    return;
                }
                cVar2.f5602y0.f4686r.removeAllViews();
                cVar2.f5602y0.f4681l.setVisibility(0);
                for (PerformerMetaData performerMetaData : cVar2.f5601x0.getPornstars()) {
                    TextView textView2 = (TextView) cVar2.x().inflate(R.layout.textview_tags, (ViewGroup) null);
                    textView2.setText(performerMetaData.getName());
                    textView2.setTag(performerMetaData.getSlug());
                    textView2.setOnClickListener(cVar2.B0);
                    cVar2.f5602y0.f4686r.addView(textView2);
                }
                return;
        }
    }
}
