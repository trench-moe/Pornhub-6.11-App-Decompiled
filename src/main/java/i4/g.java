package i4;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.q;
import androidx.recyclerview.widget.RecyclerView;
import com.app.pornhub.R;
import com.app.pornhub.databinding.ActivityPerformerBinding;
import com.app.pornhub.databinding.ActivityPlaylistDetailsBinding;
import com.app.pornhub.domain.config.GifsConfig;
import com.app.pornhub.domain.config.PerformersConfig;
import com.app.pornhub.domain.config.UsersConfig;
import com.app.pornhub.domain.error.PornhubException;
import com.app.pornhub.domain.model.performer.Performer;
import com.app.pornhub.domain.model.performer.PerformerContainer;
import com.app.pornhub.domain.model.performer.PerformerOrder;
import com.app.pornhub.domain.model.performer.PerformerSortingConfig;
import com.app.pornhub.domain.model.user.UserOrientation;
import com.app.pornhub.view.home.HomeActivityViewModel;
import com.app.pornhub.view.home.NavigationViewModel;
import com.app.pornhub.view.home.albums.AlbumsFragment;
import com.app.pornhub.view.home.albums.AlbumsViewModel;
import com.app.pornhub.view.home.discover.DiscoverFragment;
import com.app.pornhub.view.home.discover.DiscoverViewModel;
import com.app.pornhub.view.home.gifs.GifListingsFragment;
import com.app.pornhub.view.home.overlay.OverlayAdapter;
import com.app.pornhub.view.home.overlay.OverlaySelectionItem;
import com.app.pornhub.view.home.pornstars.PerformersFragment;
import com.app.pornhub.view.home.pornstars.PerformersViewModel;
import com.app.pornhub.view.performerdetails.PerformerActivity;
import com.app.pornhub.view.playlistdetails.PlaylistDetailsActivity;
import com.app.pornhub.view.playlistdetails.PlaylistDetailsViewModel;
import com.app.pornhub.view.videodetails.VideoDetailsActivity;
import com.app.pornhub.view.videodetails.VideoDetailsViewModel;
import com.appsflyer.oaid.BuildConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import t3.o;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10513a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10514b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f10513a = i10;
        this.f10514b = obj;
    }

    @Override // androidx.lifecycle.q
    public final void a(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding = null;
        ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding2 = null;
        ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding3 = null;
        ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding4 = null;
        PerformerSortingConfig performerSortingConfig = null;
        AlbumsViewModel albumsViewModel = null;
        AlbumsViewModel albumsViewModel2 = null;
        AlbumsViewModel albumsViewModel3 = null;
        switch (this.f10513a) {
            case 0:
                AlbumsFragment this$0 = (AlbumsFragment) this.f10514b;
                KProperty<Object>[] kPropertyArr = AlbumsFragment.f5052v0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                HomeActivityViewModel.FragmentStateEvent fragmentStateEvent = (HomeActivityViewModel.FragmentStateEvent) ((z3.a) obj).a();
                if (fragmentStateEvent instanceof HomeActivityViewModel.FragmentStateEvent.c) {
                    AlbumsViewModel albumsViewModel4 = this$0.f5057t0;
                    if (albumsViewModel4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        albumsViewModel = albumsViewModel4;
                    }
                    boolean d = albumsViewModel.d();
                    String str = e.K0;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("search_mode", d);
                    e eVar = new e();
                    eVar.A0(bundle);
                    eVar.Q0(this$0.s0().u(), e.K0);
                    return;
                } else if (fragmentStateEvent instanceof HomeActivityViewModel.FragmentStateEvent.a) {
                    HomeActivityViewModel.FragmentStateEvent.a aVar = (HomeActivityViewModel.FragmentStateEvent.a) fragmentStateEvent;
                    int i10 = aVar.f5027a;
                    int i11 = aVar.f5028b;
                    RecyclerView recyclerView = this$0.N0().f4557f;
                    Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.recyclerview");
                    o.m(i10, i11, recyclerView);
                    return;
                } else if (fragmentStateEvent instanceof HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted) {
                    AlbumsViewModel albumsViewModel5 = this$0.f5057t0;
                    if (albumsViewModel5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        albumsViewModel2 = albumsViewModel5;
                    }
                    HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted searchQuerySubmitted = (HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted) fragmentStateEvent;
                    albumsViewModel2.f(searchQuerySubmitted.a());
                    t3.g.m(this$0.q(), searchQuerySubmitted.a(), "CommunityAlbums");
                    return;
                } else if (fragmentStateEvent instanceof HomeActivityViewModel.FragmentStateEvent.b) {
                    AlbumsViewModel albumsViewModel6 = this$0.f5057t0;
                    if (albumsViewModel6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        albumsViewModel3 = albumsViewModel6;
                    }
                    albumsViewModel3.f5078q = BuildConfig.FLAVOR;
                    albumsViewModel3.f5075m = albumsViewModel3.f5076o;
                    albumsViewModel3.n = albumsViewModel3.f5077p;
                    albumsViewModel3.f5080s.l(new z3.a<>(AlbumsViewModel.State.e.f5085a));
                    if (albumsViewModel3.f5079r.isEmpty()) {
                        albumsViewModel3.c(0);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 1:
                DiscoverFragment this$02 = (DiscoverFragment) this.f10514b;
                KProperty<Object>[] kPropertyArr2 = DiscoverFragment.f5133x0;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                DiscoverViewModel.State state = (DiscoverViewModel.State) ((z3.a) obj).a();
                if (state instanceof DiscoverViewModel.State.b) {
                    if (!((DiscoverViewModel.State.b) state).f5153a) {
                        this$02.M0().d.setVisibility(8);
                        return;
                    }
                    this$02.M0().d.setVisibility(0);
                    this$02.f5139u0 = null;
                    this$02.M0().f4576f.f4698a.setVisibility(8);
                    return;
                }
                DiscoverViewModel discoverViewModel = null;
                UserOrientation userOrientation = null;
                DiscoverViewModel discoverViewModel2 = null;
                if (!(state instanceof DiscoverViewModel.State.ErrorLoading)) {
                    if (Intrinsics.areEqual(state, DiscoverViewModel.State.c.f5154a)) {
                        DiscoverViewModel discoverViewModel3 = this$02.f5138t0;
                        if (discoverViewModel3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        } else {
                            discoverViewModel2 = discoverViewModel3;
                        }
                        discoverViewModel2.c();
                        return;
                    } else if (Intrinsics.areEqual(state, DiscoverViewModel.State.a.f5152a)) {
                        DiscoverViewModel discoverViewModel4 = this$02.f5138t0;
                        if (discoverViewModel4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        } else {
                            discoverViewModel = discoverViewModel4;
                        }
                        discoverViewModel.c();
                        return;
                    } else {
                        return;
                    }
                }
                DiscoverViewModel.State.ErrorLoading errorLoading = (DiscoverViewModel.State.ErrorLoading) state;
                kf.a.f12078a.d(errorLoading.a(), "Error loading explore data", new Object[0]);
                Context u02 = this$02.u0();
                Intrinsics.checkNotNullExpressionValue(u02, "requireContext()");
                String h10 = o.h(u02, errorLoading.a());
                this$02.M0().d.setVisibility(8);
                this$02.f5139u0 = h10;
                DiscoverViewModel discoverViewModel5 = this$02.f5138t0;
                if (discoverViewModel5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    discoverViewModel5 = null;
                }
                Objects.requireNonNull(discoverViewModel5);
                UsersConfig.Companion companion = UsersConfig.Companion;
                UserOrientation userOrientation2 = discoverViewModel5.f5150l;
                if (userOrientation2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("userOrientation");
                } else {
                    userOrientation = userOrientation2;
                }
                this$02.M0().f4576f.f4699b.setImageResource(o.g(companion.isGay(userOrientation)));
                this$02.M0().f4576f.f4698a.setVisibility(0);
                this$02.M0().f4576f.f4700c.setText(this$02.f5139u0);
                return;
            case 2:
                GifListingsFragment gifListingsFragment = (GifListingsFragment) this.f10514b;
                int i12 = GifListingsFragment.P0;
                Objects.requireNonNull(gifListingsFragment);
                HomeActivityViewModel.FragmentStateEvent fragmentStateEvent2 = (HomeActivityViewModel.FragmentStateEvent) ((z3.a) obj).a();
                if (fragmentStateEvent2 instanceof HomeActivityViewModel.FragmentStateEvent.a) {
                    HomeActivityViewModel.FragmentStateEvent.a aVar2 = (HomeActivityViewModel.FragmentStateEvent.a) fragmentStateEvent2;
                    o.m(aVar2.f5027a, aVar2.f5028b, gifListingsFragment.f8767x0);
                    return;
                } else if (fragmentStateEvent2 instanceof HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted) {
                    if (gifListingsFragment.G0 == null) {
                        c4.i iVar = new c4.i(gifListingsFragment);
                        iVar.q(gifListingsFragment.F0.d);
                        gifListingsFragment.M0 = gifListingsFragment.K0;
                        gifListingsFragment.N0 = gifListingsFragment.L0;
                        GifsConfig.Companion companion2 = GifsConfig.Companion;
                        GifsConfig.GifOrder defaultOrder = companion2.getDefaultOrder(true);
                        gifListingsFragment.K0 = defaultOrder;
                        gifListingsFragment.L0 = companion2.getDefaultFilter(defaultOrder);
                        gifListingsFragment.G0 = iVar;
                        gifListingsFragment.H0 = gifListingsFragment.N0().Y0();
                        gifListingsFragment.Y0();
                    }
                    gifListingsFragment.O0 = ((HomeActivityViewModel.FragmentStateEvent.SearchQuerySubmitted) fragmentStateEvent2).a();
                    gifListingsFragment.F0.m();
                    gifListingsFragment.K0();
                    t3.g.m(gifListingsFragment.q(), gifListingsFragment.O0, "Gifs");
                    return;
                } else if (!(fragmentStateEvent2 instanceof HomeActivityViewModel.FragmentStateEvent.b) || gifListingsFragment.G0 == null) {
                    return;
                } else {
                    gifListingsFragment.F0.m();
                    gifListingsFragment.K0 = gifListingsFragment.M0;
                    gifListingsFragment.L0 = gifListingsFragment.N0;
                    c4.h hVar = gifListingsFragment.G0;
                    if (hVar == null || hVar.a() <= 0) {
                        gifListingsFragment.f8761q0 = true;
                        gifListingsFragment.K0();
                    } else {
                        gifListingsFragment.f8766v0.setVisibility(8);
                        gifListingsFragment.X0(gifListingsFragment.F0, gifListingsFragment.G0.d);
                        gifListingsFragment.N0().y0(gifListingsFragment.H0);
                        gifListingsFragment.f8761q0 = GifsConfig.Companion.hasMoreGifs(gifListingsFragment.F0.d.size());
                    }
                    gifListingsFragment.G0 = null;
                    gifListingsFragment.H0 = 0;
                    gifListingsFragment.O0 = BuildConfig.FLAVOR;
                    gifListingsFragment.Y0();
                    return;
                }
            case 3:
                PerformersFragment this$03 = (PerformersFragment) this.f10514b;
                NavigationViewModel.OrderingChangeEvent orderingChangeEvent = (NavigationViewModel.OrderingChangeEvent) obj;
                KProperty<Object>[] kPropertyArr3 = PerformersFragment.f5282v0;
                Intrinsics.checkNotNullParameter(this$03, "this$0");
                if (!(orderingChangeEvent instanceof NavigationViewModel.OrderingChangeEvent.PerformerOrderOrFilterChanged)) {
                    if (orderingChangeEvent instanceof NavigationViewModel.OrderingChangeEvent.PerformerTypeSelectionChanged) {
                        PerformersViewModel O0 = this$03.O0();
                        PerformersConfig.PerformerType performerType = ((NavigationViewModel.OrderingChangeEvent.PerformerTypeSelectionChanged) orderingChangeEvent).a();
                        Objects.requireNonNull(O0);
                        Intrinsics.checkNotNullParameter(performerType, "performerType");
                        PerformersConfig.PerformerType performerType2 = O0.f5307p;
                        PerformersConfig.PerformerType.All all = PerformersConfig.PerformerType.All.INSTANCE;
                        if (Intrinsics.areEqual(performerType2, all)) {
                            PerformersConfig.PerformerType performerType3 = PerformersConfig.PerformerType.Pornstar.INSTANCE;
                            if (Intrinsics.areEqual(performerType, performerType3)) {
                                performerType3 = PerformersConfig.PerformerType.Model.INSTANCE;
                            }
                            O0.c(performerType3);
                        } else {
                            PerformersConfig.PerformerType.Pornstar pornstar = PerformersConfig.PerformerType.Pornstar.INSTANCE;
                            if (Intrinsics.areEqual(performerType2, pornstar)) {
                                if (Intrinsics.areEqual(performerType, PerformersConfig.PerformerType.Model.INSTANCE)) {
                                    O0.c(all);
                                }
                            } else if (Intrinsics.areEqual(performerType2, PerformersConfig.PerformerType.Model.INSTANCE) && Intrinsics.areEqual(performerType, pornstar)) {
                                O0.c(all);
                            }
                        }
                        NavigationViewModel navigationViewModel = this$03.f5285r0;
                        if (navigationViewModel == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                            navigationViewModel = null;
                        }
                        navigationViewModel.D(this$03.O0().f(), this$03.O0().n, this$03.O0().f5307p);
                        return;
                    }
                    return;
                }
                PerformersViewModel O02 = this$03.O0();
                NavigationViewModel.OrderingChangeEvent.PerformerOrderOrFilterChanged performerOrderOrFilterChanged = (NavigationViewModel.OrderingChangeEvent.PerformerOrderOrFilterChanged) orderingChangeEvent;
                String orderTitle = performerOrderOrFilterChanged.b();
                String filterTitle = performerOrderOrFilterChanged.a();
                Objects.requireNonNull(O02);
                Intrinsics.checkNotNullParameter(orderTitle, "orderTitle");
                Intrinsics.checkNotNullParameter(filterTitle, "filterTitle");
                if (orderTitle.length() == 0) {
                    PerformerOrder performerOrder = O02.f5305m;
                    if (performerOrder == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("selectedOrder");
                        performerOrder = null;
                    }
                    Iterator<T> it = performerOrder.getFilter().entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj5 = it.next();
                            if (Intrinsics.areEqual(((Map.Entry) obj5).getValue(), filterTitle)) {
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj5;
                    O02.n = entry == null ? null : (String) entry.getValue();
                    O02.f5309r = entry == null ? null : (String) entry.getKey();
                } else if (filterTitle.length() == 0) {
                    PerformerSortingConfig performerSortingConfig2 = O02.f5304l;
                    if (performerSortingConfig2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("performerSortingConfig");
                        performerSortingConfig2 = null;
                    }
                    Iterator<T> it2 = performerSortingConfig2.getOrders().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj4 = it2.next();
                            if (Intrinsics.areEqual(((PerformerOrder) obj4).getTitle(), orderTitle)) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    PerformerOrder performerOrder2 = (PerformerOrder) obj4;
                    if (performerOrder2 == null) {
                        PerformerSortingConfig performerSortingConfig3 = O02.f5304l;
                        if (performerSortingConfig3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("performerSortingConfig");
                            performerSortingConfig3 = null;
                        }
                        performerOrder2 = (PerformerOrder) CollectionsKt.first((List<? extends Object>) performerSortingConfig3.getOrders());
                    }
                    O02.f5305m = performerOrder2;
                    if (performerOrder2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("selectedOrder");
                        performerOrder2 = null;
                    }
                    O02.f5308q = performerOrder2.getValue();
                    PerformerOrder performerOrder3 = O02.f5305m;
                    if (performerOrder3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("selectedOrder");
                        performerOrder3 = null;
                    }
                    if (performerOrder3.getFilter().isEmpty()) {
                        O02.n = null;
                        O02.f5309r = null;
                    } else {
                        t3.f fVar = t3.f.f15110a;
                        Map<String, String> map = t3.f.f15111b;
                        PerformerOrder performerOrder4 = O02.f5305m;
                        if (performerOrder4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("selectedOrder");
                            performerOrder4 = null;
                        }
                        String str2 = map.get(performerOrder4.getValue());
                        if (str2 == null) {
                            PerformerOrder performerOrder5 = O02.f5305m;
                            if (performerOrder5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("selectedOrder");
                                performerOrder5 = null;
                            }
                            str2 = (String) CollectionsKt.first(performerOrder5.getFilter().keySet());
                        }
                        PerformerOrder performerOrder6 = O02.f5305m;
                        if (performerOrder6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("selectedOrder");
                            performerOrder6 = null;
                        }
                        O02.n = performerOrder6.getFilter().get(str2);
                        O02.f5309r = str2;
                    }
                } else {
                    PerformerSortingConfig performerSortingConfig4 = O02.f5304l;
                    if (performerSortingConfig4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("performerSortingConfig");
                        performerSortingConfig4 = null;
                    }
                    Iterator<T> it3 = performerSortingConfig4.getOrders().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (Intrinsics.areEqual(((PerformerOrder) obj2).getTitle(), orderTitle)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    PerformerOrder performerOrder7 = (PerformerOrder) obj2;
                    if (performerOrder7 == null) {
                        PerformerSortingConfig performerSortingConfig5 = O02.f5304l;
                        if (performerSortingConfig5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("performerSortingConfig");
                            performerSortingConfig5 = null;
                        }
                        performerOrder7 = (PerformerOrder) CollectionsKt.first((List<? extends Object>) performerSortingConfig5.getOrders());
                    }
                    O02.f5305m = performerOrder7;
                    O02.n = filterTitle;
                    if (performerOrder7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("selectedOrder");
                        performerOrder7 = null;
                    }
                    O02.f5308q = performerOrder7.getValue();
                    PerformerOrder performerOrder8 = O02.f5305m;
                    if (performerOrder8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("selectedOrder");
                        performerOrder8 = null;
                    }
                    Iterator<T> it4 = performerOrder8.getFilter().entrySet().iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj3 = it4.next();
                            if (Intrinsics.areEqual(((Map.Entry) obj3).getValue(), filterTitle)) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    Map.Entry entry2 = (Map.Entry) obj3;
                    O02.f5309r = entry2 == null ? null : (String) entry2.getKey();
                }
                if (O02.f5313v.length() > 0) {
                    O02.f5315x.l(new z3.a<>(PerformersViewModel.State.e.f5321a));
                    O02.d(0);
                } else {
                    O02.f5315x.l(new z3.a<>(PerformersViewModel.State.a.f5316a));
                }
                NavigationViewModel navigationViewModel2 = this$03.f5285r0;
                if (navigationViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                    navigationViewModel2 = null;
                }
                PerformerSortingConfig performerSortingConfig6 = this$03.O0().f5304l;
                if (performerSortingConfig6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("performerSortingConfig");
                } else {
                    performerSortingConfig = performerSortingConfig6;
                }
                List<PerformerOrder> orders = performerSortingConfig.getOrders();
                PerformerOrder selectedOrder = this$03.O0().f();
                Objects.requireNonNull(navigationViewModel2);
                Intrinsics.checkNotNullParameter(orders, "orders");
                Intrinsics.checkNotNullParameter(selectedOrder, "selectedOrder");
                navigationViewModel2.f5039k.clear();
                List<OverlaySelectionItem> list = navigationViewModel2.f5039k;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(orders, 10));
                for (PerformerOrder performerOrder9 : orders) {
                    arrayList.add(new OverlaySelectionItem(performerOrder9.getTitle(), new OverlayAdapter.OverlayItemType.PerformerOrder(performerOrder9.getValue()), performerOrder9.getTitle(), false, 8));
                }
                list.addAll(arrayList);
                navigationViewModel2.f5040l.clear();
                if (!selectedOrder.getFilter().isEmpty()) {
                    List<OverlaySelectionItem> list2 = navigationViewModel2.f5040l;
                    Map<String, String> filter = selectedOrder.getFilter();
                    ArrayList arrayList2 = new ArrayList(filter.size());
                    for (Map.Entry<String, String> entry3 : filter.entrySet()) {
                        arrayList2.add(new OverlaySelectionItem(entry3.getValue(), new OverlayAdapter.OverlayItemType.PerformerFilter(entry3.getKey()), entry3.getValue(), false, 8));
                    }
                    list2.addAll(arrayList2);
                }
                NavigationViewModel navigationViewModel3 = this$03.f5285r0;
                if (navigationViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("navigationViewModel");
                    navigationViewModel3 = null;
                }
                navigationViewModel3.D(this$03.O0().f(), this$03.O0().n, this$03.O0().f5307p);
                return;
            case 4:
                PerformerActivity performerActivity = (PerformerActivity) this.f10514b;
                int i13 = PerformerActivity.P;
                Objects.requireNonNull(performerActivity);
                Performer performer = ((PerformerContainer) obj).getPerformer();
                if (TextUtils.isEmpty(performer.getCover())) {
                    performerActivity.O.f4443b.f4845f.setImageResource(R.drawable.pornstar_banner_placeholder);
                } else {
                    com.bumptech.glide.b.f(performerActivity).o(performer.getCover()).j(R.drawable.pornstar_banner_placeholder).A(performerActivity.O.f4443b.f4845f);
                }
                performerActivity.O.f4443b.f4844e.setText(performer.getPerformerMetaData().getName());
                performerActivity.O.f4443b.f4846g.setText(performer.getPerformerMetaData().getRank());
                performerActivity.O.f4443b.f4847h.setText(performer.getSubscribers());
                performerActivity.O.f4443b.f4848i.setText(performer.getPerformerMetaData().getViews());
                performerActivity.O.f4443b.f4843c.setVisibility(TextUtils.isEmpty(performer.getPreviousPerformerSlug()) ? 8 : 0);
                performerActivity.O.f4443b.f4842b.setVisibility(TextUtils.isEmpty(performer.getNextPerformerSlug()) ? 8 : 0);
                if (performer.getPerformerMetaData().isVerified()) {
                    performerActivity.O.f4443b.d.setVisibility(0);
                }
                if (performerActivity.O.f4446f.getAdapter() == null) {
                    performerActivity.O.f4446f.setAdapter(new PerformerActivity.a(performerActivity.u()));
                    ActivityPerformerBinding activityPerformerBinding = performerActivity.O;
                    activityPerformerBinding.f4449i.setupWithViewPager(activityPerformerBinding.f4446f);
                    return;
                }
                return;
            case 5:
                PlaylistDetailsActivity this$04 = (PlaylistDetailsActivity) this.f10514b;
                PlaylistDetailsViewModel.a aVar3 = (PlaylistDetailsViewModel.a) obj;
                int i14 = PlaylistDetailsActivity.M;
                Intrinsics.checkNotNullParameter(this$04, "this$0");
                if (aVar3 instanceof PlaylistDetailsViewModel.a.e) {
                    ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding5 = this$04.L;
                    if (activityPlaylistDetailsBinding5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityPlaylistDetailsBinding5 = null;
                    }
                    activityPlaylistDetailsBinding5.f4460u.setVisibility(0);
                    ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding6 = this$04.L;
                    if (activityPlaylistDetailsBinding6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityPlaylistDetailsBinding = activityPlaylistDetailsBinding6;
                    }
                    activityPlaylistDetailsBinding.f4452l.f4698a.setVisibility(8);
                    return;
                } else if (aVar3 instanceof PlaylistDetailsViewModel.a.C0060a) {
                    ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding7 = this$04.L;
                    if (activityPlaylistDetailsBinding7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityPlaylistDetailsBinding2 = activityPlaylistDetailsBinding7;
                    }
                    activityPlaylistDetailsBinding2.f4460u.setVisibility(8);
                    return;
                } else if (aVar3 instanceof PlaylistDetailsViewModel.a.c) {
                    PlaylistDetailsViewModel.a.c cVar = (PlaylistDetailsViewModel.a.c) aVar3;
                    boolean z10 = cVar.f5444a;
                    Throwable th = cVar.f5445b;
                    ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding8 = this$04.L;
                    if (activityPlaylistDetailsBinding8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityPlaylistDetailsBinding8 = null;
                    }
                    activityPlaylistDetailsBinding8.f4452l.f4698a.setVisibility(0);
                    ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding9 = this$04.L;
                    if (activityPlaylistDetailsBinding9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        activityPlaylistDetailsBinding9 = null;
                    }
                    activityPlaylistDetailsBinding9.f4452l.f4699b.setImageResource(o.g(z10));
                    if (!(th instanceof PornhubException)) {
                        ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding10 = this$04.L;
                        if (activityPlaylistDetailsBinding10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("binding");
                        } else {
                            activityPlaylistDetailsBinding4 = activityPlaylistDetailsBinding10;
                        }
                        activityPlaylistDetailsBinding4.f4452l.f4700c.setText(o.h(this$04, th));
                        return;
                    }
                    int a10 = ((PornhubException) th).a();
                    int i15 = a10 != 27 ? a10 != 44 ? a10 != 87 ? R.string.error_default : R.string.err_not_allowed_to_manage_playlist : R.string.err_must_verify_email : R.string.playlist_not_found;
                    ActivityPlaylistDetailsBinding activityPlaylistDetailsBinding11 = this$04.L;
                    if (activityPlaylistDetailsBinding11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        activityPlaylistDetailsBinding3 = activityPlaylistDetailsBinding11;
                    }
                    activityPlaylistDetailsBinding3.f4452l.f4700c.setText(this$04.getString(i15));
                    return;
                } else {
                    return;
                }
            case 6:
                VideoDetailsActivity videoDetailsActivity = (VideoDetailsActivity) this.f10514b;
                int i16 = VideoDetailsActivity.f5539t0;
                Objects.requireNonNull(videoDetailsActivity);
                if (((Boolean) obj).booleanValue()) {
                    videoDetailsActivity.R.f4489j.setColorFilter(videoDetailsActivity.getResources().getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
                    return;
                } else {
                    videoDetailsActivity.R.f4489j.clearColorFilter();
                    return;
                }
            default:
                com.app.pornhub.view.videodetails.c cVar2 = (com.app.pornhub.view.videodetails.c) this.f10514b;
                VideoDetailsViewModel.a aVar4 = (VideoDetailsViewModel.a) obj;
                int i17 = com.app.pornhub.view.videodetails.c.C0;
                Objects.requireNonNull(cVar2);
                if (aVar4 instanceof VideoDetailsViewModel.a.C0064a) {
                    cVar2.Q0(true);
                } else {
                    cVar2.Q0(false);
                }
                if (aVar4 instanceof VideoDetailsViewModel.a.b) {
                    boolean z11 = ((VideoDetailsViewModel.a.b) aVar4).f5592a;
                    cVar2.f5600v0 = z11;
                    cVar2.f5602y0.f4675f.setColorFilter(z11 ? new PorterDuffColorFilter(cVar2.E().getColor(R.color.red), PorterDuff.Mode.SRC_ATOP) : null);
                    return;
                }
                return;
        }
    }
}
