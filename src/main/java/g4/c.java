package g4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ActivityPlaylistDetailsBinding;
import com.app.pornhub.domain.config.DvdsConfig;
import com.app.pornhub.domain.config.FiltersConfig;
import com.app.pornhub.domain.config.GifsConfig;
import com.app.pornhub.domain.config.PlaylistsType;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.category.Category;
import com.app.pornhub.domain.model.performer.Performer;
import com.app.pornhub.domain.model.performer.PerformerContainer;
import com.app.pornhub.domain.model.playlist.PlaylistsOverview;
import com.app.pornhub.domain.model.video.VideoMetaData;
import com.app.pornhub.domain.usecase.UseCaseResult;
import com.app.pornhub.view.home.HomeActivity;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.categories.CategoriesFragment;
import com.app.pornhub.view.home.categories.CategoryAdapter;
import com.app.pornhub.view.home.gifs.GifListingsFragment;
import com.app.pornhub.view.home.overlay.OverlayAdapter;
import com.app.pornhub.view.home.overlay.OverlaySelectionItem;
import com.app.pornhub.view.home.playlists.PlaylistsCommonFragment;
import com.app.pornhub.view.home.playlists.PlaylistsViewModel;
import com.app.pornhub.view.home.pornstars.PerformersFragment;
import com.app.pornhub.view.home.pornstars.PerformersViewModel;
import com.app.pornhub.view.home.topnav.TopNavAdapter;
import com.app.pornhub.view.home.topnav.TopNavigation;
import com.app.pornhub.view.home.videolistings.VideoListingsFragment;
import com.app.pornhub.view.home.videolistings.VideoListingsViewModel;
import com.app.pornhub.view.performerdetails.PerformerActivity;
import com.app.pornhub.view.performerdetails.a;
import com.app.pornhub.view.playlistdetails.PlaylistDetailsActivity;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import com.app.pornhub.view.videodetails.VideoDetailsViewModel;
import com.appsflyer.oaid.BuildConfig;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.rxkotlin.DisposableKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import x2.i1;
import x2.l0;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements androidx.lifecycle.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9729a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9730b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f9729a = i10;
        this.f9730b = obj;
    }

    @Override // androidx.lifecycle.q
    public final void a(Object obj) {
        n1.e<?, VideoMetaData> j10;
        NavigationViewModel navigationViewModel = null;
        ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding = null;
        ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding2 = null;
        VideoListingsViewModel videoListingsViewModel = null;
        VideoListingsViewModel videoListingsViewModel2 = null;
        NavigationViewModel navigationViewModel2 = null;
        NavigationViewModel navigationViewModel3 = null;
        switch (this.f9729a) {
            case 0:
                HomeActivity this$0 = (HomeActivity) this.f9730b;
                NavigationViewModel.NavEvent navEvent = (NavigationViewModel.NavEvent) obj;
                int i10 = HomeActivity.f4998a0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (navEvent instanceof NavigationViewModel.NavEvent.b) {
                    TopNavAdapter topNavAdapter = this$0.P;
                    NavigationViewModel navigationViewModel4 = this$0.N;
                    if (navigationViewModel4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                    } else {
                        navigationViewModel3 = navigationViewModel4;
                    }
                    topNavAdapter.m(CollectionsKt.toMutableList((Collection) navigationViewModel3.f5035g));
                    return;
                } else if (!(navEvent instanceof NavigationViewModel.NavEvent.a)) {
                    if (navEvent instanceof NavigationViewModel.NavEvent.OpenDestination) {
                        this$0.Q();
                        this$0.E().i(((NavigationViewModel.NavEvent.OpenDestination) navEvent).a());
                        return;
                    }
                    return;
                } else {
                    TopNavAdapter topNavAdapter2 = this$0.P;
                    NavigationViewModel navigationViewModel5 = this$0.N;
                    if (navigationViewModel5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                    } else {
                        navigationViewModel = navigationViewModel5;
                    }
                    topNavAdapter2.m(CollectionsKt.toMutableList((Collection) navigationViewModel.f5036h));
                    return;
                }
            case 1:
                Pair pair = (Pair) obj;
                CategoryAdapter categoryAdapter = ((CategoriesFragment) this.f9730b).f5097t0;
                List topCategories = (List) pair.getFirst();
                List<Category> allCategories = (List) pair.getSecond();
                Objects.requireNonNull(categoryAdapter);
                Intrinsics.checkNotNullParameter(topCategories, "topCategories");
                Intrinsics.checkNotNullParameter(allCategories, "allCategories");
                ArrayList arrayList = new ArrayList();
                arrayList.add(new CategoryAdapter.Item(CategoryAdapter.d.c.f5113a, null, false, false, 14));
                List<Category> take = CollectionsKt.take(topCategories, 9);
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(take, 10));
                for (Category category : take) {
                    arrayList2.add(new CategoryAdapter.Item(CategoryAdapter.d.a.f5111a, category, false, false, 12));
                }
                arrayList.addAll(arrayList2);
                arrayList.add(new CategoryAdapter.Item(CategoryAdapter.d.b.f5112a, null, false, false, 14));
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(allCategories, 10));
                for (Category category2 : allCategories) {
                    arrayList3.add(new CategoryAdapter.Item(CategoryAdapter.d.a.f5111a, category2, false, false, 12));
                }
                arrayList.addAll(arrayList3);
                categoryAdapter.d.clear();
                categoryAdapter.d.addAll(arrayList);
                categoryAdapter.f2802a.b();
                return;
            case 2:
                GifListingsFragment gifListingsFragment = (GifListingsFragment) this.f9730b;
                NavigationViewModel.OrderingChangeEvent orderingChangeEvent = (NavigationViewModel.OrderingChangeEvent) obj;
                int i11 = GifListingsFragment.P0;
                Objects.requireNonNull(gifListingsFragment);
                if (orderingChangeEvent instanceof NavigationViewModel.OrderingChangeEvent.GifOrderOrFilterChanged) {
                    NavigationViewModel.OrderingChangeEvent.GifOrderOrFilterChanged gifOrderOrFilterChanged = (NavigationViewModel.OrderingChangeEvent.GifOrderOrFilterChanged) orderingChangeEvent;
                    GifsConfig.GifOrder b10 = gifOrderOrFilterChanged.b();
                    FiltersConfig.Time a10 = gifOrderOrFilterChanged.a();
                    if (b10 == null) {
                        gifListingsFragment.L0 = a10;
                    } else if (a10 == null) {
                        gifListingsFragment.K0 = b10;
                        gifListingsFragment.L0 = GifsConfig.Companion.getDefaultFilter(b10);
                    } else {
                        gifListingsFragment.K0 = b10;
                        gifListingsFragment.L0 = a10;
                    }
                    gifListingsFragment.F0.m();
                    gifListingsFragment.K0();
                }
                NavigationViewModel navigationViewModel6 = gifListingsFragment.C0;
                boolean z10 = gifListingsFragment.G0 != null;
                Objects.requireNonNull(navigationViewModel6);
                navigationViewModel6.k(TopNavigation.ChildItem.GifOrders.INSTANCE, TopNavigation.ChildItem.GifFilters.INSTANCE, z10);
                gifListingsFragment.C0.z(gifListingsFragment.K0, gifListingsFragment.L0);
                return;
            case 3:
                PlaylistsCommonFragment this$02 = (PlaylistsCommonFragment) this.f9730b;
                NavigationViewModel.OrderingChangeEvent orderingChangeEvent2 = (NavigationViewModel.OrderingChangeEvent) obj;
                KProperty<Object>[] kPropertyArr = PlaylistsCommonFragment.f5245u0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                if (orderingChangeEvent2 instanceof NavigationViewModel.OrderingChangeEvent.PlaylistOrderChanged) {
                    PlaylistsType a11 = ((NavigationViewModel.OrderingChangeEvent.PlaylistOrderChanged) orderingChangeEvent2).a();
                    Objects.requireNonNull(this$02);
                    PlaylistsType.Overview overview = PlaylistsType.Overview.INSTANCE;
                    if (Intrinsics.areEqual(a11, overview)) {
                        PlaylistsViewModel playlistsViewModel = this$02.f5250t0;
                        if (playlistsViewModel == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                            playlistsViewModel = null;
                        }
                        Objects.requireNonNull(playlistsViewModel);
                        playlistsViewModel.f5272l = overview;
                        if (playlistsViewModel.f5269i.d() == null) {
                            playlistsViewModel.f5271k.l(new z3.a<>(PlaylistsViewModel.State.c.f5274a));
                            kf.a.f12078a.a("Loading user playlists", new Object[0]);
                            Observable startWith = playlistsViewModel.f5266f.f11374a.c(false).toObservable().map(l0.E).onErrorReturn(x2.y.E).startWith((Observable) UseCaseResult.a.f4910a);
                            Intrinsics.checkNotNullExpressionValue(startWith, "playlistsRepository.getP…th(UseCaseResult.Loading)");
                            Disposable subscribe = startWith.subscribe(new x2.c(playlistsViewModel, 15));
                            Intrinsics.checkNotNullExpressionValue(subscribe, "getPlaylistsOverviewUseC…          }\n            }");
                            DisposableKt.addTo(subscribe, playlistsViewModel.f16001c);
                        } else {
                            androidx.lifecycle.p<PlaylistsOverview> pVar = playlistsViewModel.f5269i;
                            pVar.l(pVar.d());
                        }
                    } else {
                        PlaylistsType.Public r52 = PlaylistsType.Public.INSTANCE;
                        if (Intrinsics.areEqual(a11, r52)) {
                            PlaylistsViewModel playlistsViewModel2 = this$02.f5250t0;
                            if (playlistsViewModel2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                playlistsViewModel2 = null;
                            }
                            Objects.requireNonNull(playlistsViewModel2);
                            playlistsViewModel2.f5272l = r52;
                            playlistsViewModel2.c(false);
                        } else {
                            PlaylistsType.Private r53 = PlaylistsType.Private.INSTANCE;
                            if (Intrinsics.areEqual(a11, r53)) {
                                PlaylistsViewModel playlistsViewModel3 = this$02.f5250t0;
                                if (playlistsViewModel3 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                    playlistsViewModel3 = null;
                                }
                                Objects.requireNonNull(playlistsViewModel3);
                                playlistsViewModel3.f5272l = r53;
                                playlistsViewModel3.c(false);
                            } else {
                                PlaylistsType.Favorite favorite = PlaylistsType.Favorite.INSTANCE;
                                if (Intrinsics.areEqual(a11, favorite)) {
                                    PlaylistsViewModel playlistsViewModel4 = this$02.f5250t0;
                                    if (playlistsViewModel4 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                        playlistsViewModel4 = null;
                                    }
                                    Objects.requireNonNull(playlistsViewModel4);
                                    playlistsViewModel4.f5272l = favorite;
                                    playlistsViewModel4.c(false);
                                }
                            }
                        }
                    }
                    HomeActivityViewModel homeActivityViewModel = this$02.f5248r0;
                    if (homeActivityViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("homeViewModel");
                        homeActivityViewModel = null;
                    }
                    homeActivityViewModel.f5012j.l(new HomeActivityViewModel.ActivityStateEvent.e(true));
                }
                NavigationViewModel navigationViewModel7 = this$02.f5249s0;
                if (navigationViewModel7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                    navigationViewModel7 = null;
                }
                Objects.requireNonNull(navigationViewModel7);
                List<KClass> sealedSubclasses = Reflection.getOrCreateKotlinClass(PlaylistsType.class).getSealedSubclasses();
                ArrayList arrayList4 = new ArrayList();
                for (KClass kClass : sealedSubclasses) {
                    PlaylistsType playlistsType = (PlaylistsType) kClass.getObjectInstance();
                    if (playlistsType != null) {
                        arrayList4.add(playlistsType);
                    }
                }
                navigationViewModel7.f5039k.clear();
                List<OverlaySelectionItem> list = navigationViewModel7.f5039k;
                ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                Iterator it = arrayList4.iterator();
                while (it.hasNext()) {
                    PlaylistsType playlistsType2 = (PlaylistsType) it.next();
                    arrayList5.add(new OverlaySelectionItem(navigationViewModel7.h(playlistsType2), OverlayAdapter.OverlayItemType.a.f5242a, playlistsType2, false, 8));
                }
                list.addAll(arrayList5);
                NavigationViewModel navigationViewModel8 = this$02.f5249s0;
                if (navigationViewModel8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                    navigationViewModel8 = null;
                }
                PlaylistsViewModel playlistsViewModel5 = this$02.f5250t0;
                if (playlistsViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    playlistsViewModel5 = null;
                }
                PlaylistsType selectedType = playlistsViewModel5.f5272l;
                if (selectedType == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("contentType");
                    selectedType = null;
                }
                Objects.requireNonNull(navigationViewModel8);
                Intrinsics.checkNotNullParameter(selectedType, "selectedType");
                for (OverlaySelectionItem overlaySelectionItem : navigationViewModel8.f5039k) {
                    overlaySelectionItem.e(Intrinsics.areEqual(overlaySelectionItem.a(), selectedType));
                }
                navigationViewModel8.n(TopNavigation.ParentItem.Playlists.INSTANCE, navigationViewModel8.h(selectedType), null);
                navigationViewModel8.f5042o.l(NavigationViewModel.NavEvent.a.f5043a);
                return;
            case 4:
                PerformersFragment this$03 = (PerformersFragment) this.f9730b;
                KProperty<Object>[] kPropertyArr2 = PerformersFragment.f5282v0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                HomeActivityViewModel.FragmentStateEvent fragmentStateEvent = (HomeActivityViewModel.FragmentStateEvent) ((z3.a) obj).a();
                if (fragmentStateEvent instanceof HomeActivityViewModel.FragmentStateEvent.c) {
                    Context u02 = this$03.u0();
                    int i12 = je.c.f11705a;
                    new View(u02).setTag(DvdsConfig.TYPE_CATEGORY);
                    je.b bVar = new je.b();
                    bVar.f11703c = 10;
                    bVar.d = 2;
                    bVar.f11704e = Color.argb(175, 0, 0, 0);
                    ConstraintLayout constraintLayout = this$03.N0().f4558g;
                    bVar.f11701a = constraintLayout.getMeasuredWidth();
                    bVar.f11702b = constraintLayout.getMeasuredHeight();
                    Bitmap bitmap = je.a.b(constraintLayout, bVar);
                    PerformersViewModel O0 = this$03.O0();
                    Intrinsics.checkNotNullExpressionValue(bitmap, "bg");
                    Objects.requireNonNull(O0);
                    Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                    O0.f5306o = bitmap;
                    NavigationViewModel navigationViewModel9 = this$03.f5285r0;
                    if (navigationViewModel9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                    } else {
                        navigationViewModel2 = navigationViewModel9;
                    }
                    navigationViewModel2.c();
                    navigationViewModel2.f5042o.l(new NavigationViewModel.NavEvent.OpenDestination(new androidx.navigation.a(R.id.action_global_pornstarsFilterFragment)));
                    return;
                } else if (fragmentStateEvent instanceof HomeActivityViewModel.FragmentStateEvent.a) {
                    HomeActivityViewModel.FragmentStateEvent.a aVar = (HomeActivityViewModel.FragmentStateEvent.a) fragmentStateEvent;
                    int i13 = aVar.f5027a;
                    int i14 = aVar.f5028b;
                    RecyclerView recyclerView = this$03.N0().f4557f;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerview");
                    t3.o.m(i13, i14, recyclerView);
                    return;
                } else if (!(fragmentStateEvent instanceof HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted)) {
                    if (fragmentStateEvent instanceof HomeActivityViewModel.FragmentStateEvent.b) {
                        PerformersViewModel O02 = this$03.O0();
                        O02.f5301i.a(O02.f5312u);
                        O02.f5313v = BuildConfig.FLAVOR;
                        O02.f5308q = O02.f5310s;
                        O02.f5309r = O02.f5311t;
                        O02.f5315x.l(new z3.a<>(PerformersViewModel.State.d.f5320a));
                        return;
                    }
                    return;
                } else {
                    HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted searchQuerySubmitted = (HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted) fragmentStateEvent;
                    t3.g.m(this$03.q(), searchQuerySubmitted.a(), "Pornstars");
                    if (searchQuerySubmitted.b()) {
                        Context u03 = this$03.u0();
                        Intrinsics.checkNotNullExpressionValue(u03, "requireContext()");
                        this$03.I0(HomeActivity.F(u03, searchQuerySubmitted.a(), R.id.videosFragment));
                        return;
                    }
                    PerformersViewModel O03 = this$03.O0();
                    String query = searchQuerySubmitted.a();
                    Objects.requireNonNull(O03);
                    Intrinsics.checkNotNullParameter(query, "query");
                    String str = O03.f5313v;
                    O03.f5313v = query;
                    if (str.length() == 0) {
                        O03.f5310s = O03.f5308q;
                        O03.f5311t = O03.f5309r;
                        O03.f5312u = O03.e();
                        O03.f5315x.l(new z3.a<>(PerformersViewModel.State.f.f5322a));
                    } else {
                        O03.f5315x.l(new z3.a<>(PerformersViewModel.State.e.f5321a));
                    }
                    O03.d(0);
                    return;
                }
            case 5:
                VideoListingsFragment this$04 = (VideoListingsFragment) this.f9730b;
                KProperty<Object>[] kPropertyArr3 = VideoListingsFragment.f5332v0;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                HomeActivityViewModel.FragmentStateEvent fragmentStateEvent2 = (HomeActivityViewModel.FragmentStateEvent) ((z3.a) obj).a();
                if (fragmentStateEvent2 instanceof HomeActivityViewModel.FragmentStateEvent.d) {
                    this$04.P0();
                    return;
                } else if (fragmentStateEvent2 instanceof HomeActivityViewModel.FragmentStateEvent.c) {
                    new u4.d().Q0(this$04.s0().u(), u4.d.U0);
                    return;
                } else if (fragmentStateEvent2 instanceof HomeActivityViewModel.FragmentStateEvent.a) {
                    HomeActivityViewModel.FragmentStateEvent.a aVar2 = (HomeActivityViewModel.FragmentStateEvent.a) fragmentStateEvent2;
                    int i15 = aVar2.f5027a;
                    int i16 = aVar2.f5028b;
                    RecyclerView recyclerView2 = this$04.M0().f4557f;
                    Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.recyclerview");
                    t3.o.m(i15, i16, recyclerView2);
                    return;
                } else if (fragmentStateEvent2 instanceof HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted) {
                    VideoListingsViewModel videoListingsViewModel3 = this$04.f5337t0;
                    if (videoListingsViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        videoListingsViewModel = videoListingsViewModel3;
                    }
                    HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted searchQuerySubmitted2 = (HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted) fragmentStateEvent2;
                    videoListingsViewModel.h(searchQuerySubmitted2.a());
                    t3.g.m(this$04.q(), searchQuerySubmitted2.a(), "Videos");
                    return;
                } else if (fragmentStateEvent2 instanceof HomeActivityViewModel.FragmentStateEvent.b) {
                    VideoListingsViewModel videoListingsViewModel4 = this$04.f5337t0;
                    if (videoListingsViewModel4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        videoListingsViewModel2 = videoListingsViewModel4;
                    }
                    videoListingsViewModel2.f5350o = BuildConfig.FLAVOR;
                    videoListingsViewModel2.f5347k = videoListingsViewModel2.f5349m;
                    videoListingsViewModel2.f5348l = videoListingsViewModel2.n;
                    videoListingsViewModel2.c().n(videoListingsViewModel2.e());
                    if (!(videoListingsViewModel2.d().f2335b.f12846m > 0)) {
                        videoListingsViewModel2.c().n(videoListingsViewModel2.d());
                        videoListingsViewModel2.c().m(videoListingsViewModel2.d(), new b(videoListingsViewModel2, 3));
                    }
                    n1.i<VideoMetaData> d = videoListingsViewModel2.e().d();
                    if (d != null && (j10 = d.j()) != null) {
                        j10.b();
                    }
                    videoListingsViewModel2.c().l(videoListingsViewModel2.d().d());
                    videoListingsViewModel2.f5351p.l(new z3.a<>(VideoListingsViewModel.State.d.f5361a));
                    return;
                } else {
                    return;
                }
            case 6:
                PerformerActivity performerActivity = (PerformerActivity) this.f9730b;
                int i17 = PerformerActivity.P;
                Objects.requireNonNull(performerActivity);
                a.AbstractC0058a abstractC0058a = (a.AbstractC0058a) ((z3.a) obj).a();
                if (abstractC0058a instanceof a.AbstractC0058a.c) {
                    performerActivity.O.d.setVisibility(0);
                } else {
                    performerActivity.O.d.setVisibility(8);
                }
                if (abstractC0058a instanceof a.AbstractC0058a.b) {
                    a.AbstractC0058a.b bVar2 = (a.AbstractC0058a.b) abstractC0058a;
                    boolean z11 = bVar2.f5419a;
                    String h10 = t3.o.h(performerActivity, bVar2.f5420b);
                    ((ImageView) performerActivity.O.f4444c.f4698a.findViewById(R.id.error_segment_image)).setImageResource(z11 ? R.drawable.men : R.drawable.girls);
                    performerActivity.O.f4444c.f4698a.setVisibility(0);
                    performerActivity.O.f4445e.setVisibility(4);
                    ((TextView) performerActivity.O.f4444c.f4698a.findViewById(R.id.error_txtError)).setText(h10);
                    return;
                }
                return;
            case 7:
                z4.b bVar3 = (z4.b) this.f9730b;
                int i18 = z4.b.f21776v0;
                Objects.requireNonNull(bVar3);
                Performer performer = ((PerformerContainer) obj).getPerformer();
                bVar3.f21781r0.f4631h.setText(TextUtils.isEmpty(performer.getWeeklyRank()) ? bVar3.I(R.string.f21945na) : performer.getWeeklyRank());
                bVar3.f21781r0.f4630g.setText(TextUtils.isEmpty(performer.getLastMonthRank()) ? bVar3.I(R.string.f21945na) : performer.getLastMonthRank());
                bVar3.f21781r0.f4629f.setText(TextUtils.isEmpty(performer.getLastMonthRank()) ? bVar3.I(R.string.f21945na) : performer.getLastMonthRank());
                bVar3.f21781r0.f4633j.setText(TextUtils.isEmpty(performer.getYearlyRank()) ? bVar3.I(R.string.f21945na) : performer.getYearlyRank());
                bVar3.K0(bVar3.f21781r0.f4626b, bVar3.I(R.string.bio), performer.getBio());
                bVar3.K0(bVar3.f21781r0.d, bVar3.I(R.string.born), performer.getBorn());
                bVar3.K0(bVar3.f21781r0.f4627c, bVar3.I(R.string.birthplace), performer.getBirthPlace());
                bVar3.K0(bVar3.f21781r0.f4628e, bVar3.I(R.string.height), performer.getHeight());
                bVar3.K0(bVar3.f21781r0.f4632i, bVar3.I(R.string.weight), performer.getWeight());
                Disposable subscribe2 = bVar3.f21782s0.isEmpty() ? null : bVar3.f21778o0.a(bVar3.f21782s0).subscribe(new x2.m(bVar3, 16));
                if (!bVar3.f21783t0.isEmpty()) {
                    sc.c cVar = bVar3.f21779p0;
                    Set<String> categoryNames = bVar3.f21783t0;
                    Objects.requireNonNull(cVar);
                    Intrinsics.checkNotNullParameter(categoryNames, "categoryNames");
                    Observable startWith2 = ((b3.b) cVar.f14954f).d(categoryNames).toObservable().map(i1.n).onErrorReturn(x2.z.f17902m).startWith((Observable) UseCaseResult.a.f4910a);
                    Intrinsics.checkNotNullExpressionValue(startWith2, "categoriesRepository.get…th(UseCaseResult.Loading)");
                    subscribe2 = startWith2.subscribe(new x2.a(bVar3, 16));
                }
                if (subscribe2 != null) {
                    bVar3.f21780q0.add(subscribe2);
                    return;
                }
                return;
            case 8:
                PlaylistDetailsActivity this$05 = (PlaylistDetailsActivity) this.f9730b;
                Boolean it2 = (Boolean) obj;
                int i19 = PlaylistDetailsActivity.M;
                Intrinsics.checkNotNullParameter(this$05, "this$0");
                Intrinsics.checkNotNullExpressionValue(it2, "it");
                if (it2.booleanValue()) {
                    ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding3 = this$05.L;
                    if (activityPlaylistDetailsBinding3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityPlaylistDetailsBinding = activityPlaylistDetailsBinding3;
                    }
                    activityPlaylistDetailsBinding.f4455p.setColorFilter(this$05.getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
                    return;
                }
                ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding4 = this$05.L;
                if (activityPlaylistDetailsBinding4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    activityPlaylistDetailsBinding2 = activityPlaylistDetailsBinding4;
                }
                activityPlaylistDetailsBinding2.f4455p.clearColorFilter();
                return;
            default:
                VideoDetailsActivity videoDetailsActivity = (VideoDetailsActivity) this.f9730b;
                int i20 = VideoDetailsActivity.f5539t0;
                Objects.requireNonNull(videoDetailsActivity);
                VideoDetailsViewModel.VideoState videoState = (VideoDetailsViewModel.VideoState) ((z3.a) obj).a();
                if (videoState instanceof VideoDetailsViewModel.VideoState.a) {
                    if (!((VideoDetailsViewModel.VideoState.a) videoState).f5590a) {
                        videoDetailsActivity.a0(false);
                        return;
                    }
                    if (videoDetailsActivity.f5544e0 != null) {
                        videoDetailsActivity.f5558s0.q0(true);
                        videoDetailsActivity.f5544e0.b();
                        videoDetailsActivity.f5544e0 = null;
                    }
                    videoDetailsActivity.a0(true);
                    return;
                } else if (videoState instanceof VideoDetailsViewModel.VideoState.ErrorLoading) {
                    Throwable a12 = ((VideoDetailsViewModel.VideoState.ErrorLoading) videoState).a();
                    if ((a12 instanceof PornhubException) && ((PornhubException) a12).a() == 72) {
                        videoDetailsActivity.b0(videoDetailsActivity.getString(R.string.geolocation_video_unavailable));
                        return;
                    } else {
                        videoDetailsActivity.b0(t3.o.h(videoDetailsActivity, a12));
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
