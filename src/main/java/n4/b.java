package n4;

import android.content.Context;
import androidx.lifecycle.q;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.domain.config.FiltersConfig;
import com.app.pornhub.domain.config.VideosConfig;
import com.app.pornhub.domain.model.video.VideoFilters;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.explore.ExploreFragment;
import com.app.pornhub.view.home.topnav.TopNavigation;
import com.app.pornhub.view.home.videolistings.VideoListingsFragment;
import com.app.pornhub.view.home.videolistings.VideoListingsViewModel;
import com.simform.refresh.SSPullToRefreshLayout;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import t3.o;
import u4.i;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13286a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13287b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f13288c;

    public /* synthetic */ b(Object obj, Object obj2, int i10) {
        this.f13286a = i10;
        this.f13287b = obj;
        this.f13288c = obj2;
    }

    @Override // androidx.lifecycle.q
    public final void a(Object obj) {
        switch (this.f13286a) {
            case 0:
                o4.c adapter = (o4.c) this.f13287b;
                ExploreFragment this$0 = (ExploreFragment) this.f13288c;
                KProperty<Object>[] kPropertyArr = ExploreFragment.f5155y0;
                Intrinsics.checkNotNullParameter(adapter, "$adapter");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                HomeActivityViewModel.FragmentStateEvent fragmentStateEvent = (HomeActivityViewModel.FragmentStateEvent) ((z3.a) obj).a();
                if (fragmentStateEvent instanceof HomeActivityViewModel.FragmentStateEvent.d) {
                    adapter.r();
                    return;
                } else if (!(fragmentStateEvent instanceof HomeActivityViewModel.FragmentStateEvent.a)) {
                    if (fragmentStateEvent instanceof HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted) {
                        Context u02 = this$0.u0();
                        Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
                        HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted searchQuerySubmitted = (HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted) fragmentStateEvent;
                        this$0.I0(HomeActivity.F(u02, searchQuerySubmitted.a(), R.id.videosFragment));
                        t3.g.m(this$0.q(), searchQuerySubmitted.a(), "Explore");
                        return;
                    }
                    return;
                } else {
                    SSPullToRefreshLayout sSPullToRefreshLayout = this$0.M0().f4578h;
                    HomeActivityViewModel homeActivityViewModel = this$0.f5159s0;
                    if (homeActivityViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                        homeActivityViewModel = null;
                    }
                    sSPullToRefreshLayout.setRefreshInitialOffset(homeActivityViewModel.f5019r / 2);
                    HomeActivityViewModel.FragmentStateEvent.a aVar = (HomeActivityViewModel.FragmentStateEvent.a) fragmentStateEvent;
                    int i10 = aVar.f5027a;
                    int i11 = aVar.f5028b;
                    RecyclerView recyclerView = this$0.M0().f4577g;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerViewExplore");
                    o.m(i10, i11, recyclerView);
                    return;
                }
            default:
                VideoListingsFragment this$02 = (VideoListingsFragment) this.f13287b;
                i adapter2 = (i) this.f13288c;
                NavigationViewModel.OrderingChangeEvent orderingChangeEvent = (NavigationViewModel.OrderingChangeEvent) obj;
                KProperty<Object>[] kPropertyArr2 = VideoListingsFragment.f5332v0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                Intrinsics.checkNotNullParameter(adapter2, "$adapter");
                if (orderingChangeEvent instanceof NavigationViewModel.OrderingChangeEvent.VideoOrderOrFilterChanged) {
                    NavigationViewModel.OrderingChangeEvent.VideoOrderOrFilterChanged videoOrderOrFilterChanged = (NavigationViewModel.OrderingChangeEvent.VideoOrderOrFilterChanged) orderingChangeEvent;
                    String c10 = videoOrderOrFilterChanged.c();
                    if (c10 == null || c10.length() == 0) {
                        VideoListingsViewModel videoListingsViewModel = this$02.f5337t0;
                        if (videoListingsViewModel == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            videoListingsViewModel = null;
                        }
                        VideosConfig.VideoOrder b10 = videoOrderOrFilterChanged.b();
                        FiltersConfig.Time a10 = videoOrderOrFilterChanged.a();
                        if (b10 == null) {
                            videoListingsViewModel.f5348l = a10;
                        } else if (a10 == null) {
                            videoListingsViewModel.f5347k = b10;
                            videoListingsViewModel.f5348l = VideosConfig.Companion.getDefaultFilter(b10);
                        } else {
                            videoListingsViewModel.f5347k = b10;
                            videoListingsViewModel.f5348l = a10;
                        }
                        if (videoListingsViewModel.g()) {
                            videoListingsViewModel.f();
                        } else {
                            videoListingsViewModel.f5351p.l(new z3.a<>(VideoListingsViewModel.State.a.f5358a));
                        }
                    } else {
                        VideoListingsViewModel videoListingsViewModel2 = this$02.f5337t0;
                        if (videoListingsViewModel2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            videoListingsViewModel2 = null;
                        }
                        Objects.requireNonNull(videoListingsViewModel2);
                        VideoFilters videoFilters = new VideoFilters(null, null, null, null, null, 31, null);
                        videoListingsViewModel2.f5346j = videoFilters;
                        videoListingsViewModel2.f5342f.a(videoFilters);
                        VideoListingsViewModel videoListingsViewModel3 = this$02.f5337t0;
                        if (videoListingsViewModel3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            videoListingsViewModel3 = null;
                        }
                        videoListingsViewModel3.h(videoOrderOrFilterChanged.c());
                        this$02.N0(adapter2);
                    }
                }
                NavigationViewModel navigationViewModel = this$02.f5336s0;
                if (navigationViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                    navigationViewModel = null;
                }
                Objects.requireNonNull(navigationViewModel);
                navigationViewModel.k(TopNavigation.ChildItem.VideoOrders.INSTANCE, TopNavigation.ChildItem.VideoFilters.INSTANCE, false);
                NavigationViewModel navigationViewModel2 = this$02.f5336s0;
                if (navigationViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                    navigationViewModel2 = null;
                }
                VideoListingsViewModel videoListingsViewModel4 = this$02.f5337t0;
                if (videoListingsViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    videoListingsViewModel4 = null;
                }
                VideosConfig.VideoOrder videoOrder = videoListingsViewModel4.f5347k;
                VideoListingsViewModel videoListingsViewModel5 = this$02.f5337t0;
                if (videoListingsViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    videoListingsViewModel5 = null;
                }
                navigationViewModel2.E(videoOrder, videoListingsViewModel5.f5348l);
                return;
        }
    }
}
